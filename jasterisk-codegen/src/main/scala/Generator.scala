import java.nio.file.{Files, Paths}
import java.util.stream.Collectors

import com.google.gson._

object Generator extends App {

  val primitives11to12 = Map(
    "byte" -> Primitive12("string", "byte"),
    "boolean" -> Primitive12("boolean"),
    "int" -> Primitive12("integer", "int32"),
    "long" -> Primitive12("integer", "int64"),
    "float" -> Primitive12("number", "float"),
    "double" -> Primitive12("number", "double"),
    "string" -> Primitive12("string"),
    "void" -> Primitive12("void"),
    "Date" -> Primitive12("string", "date-time") // should be ("string", "date-time") but asterisk dates aren't proper iso 8601
  )

  val authorization: JsonObject = {
    val auth = new JsonObject
    val apiKey = new JsonObject
    apiKey.addProperty("type", "apiKey")
    apiKey.addProperty("passAs", "query")
    apiKey.addProperty("keyname", "api_key")
    auth.add("apiKey", apiKey)
    auth
  }

  import scala.collection.JavaConverters._

  val gson = new GsonBuilder().setPrettyPrinting().create

  val apis = Files.lines(Paths.get(args(0))).map[Api]{ line =>
    val bytes = Files.readAllBytes(Paths.get(line))
    val content = new String(bytes)
    getApi(content)
  }.collect(Collectors.toList[Api])

  val jsonObj = createDoc(apis.asScala)
  val json = gson.toJson(jsonObj)
  val path = Paths.get(args(1))
  println(s"writing output to ${path.toFile.getAbsolutePath}")
  Files.write(path, replacements(json))

  def replacements(in: String): Array[Byte] = in
    .replaceAll("httpMethod", "method")
    .replaceAll("responseClass", "type")
    .getBytes

  def createDoc(apis: Seq[Api]): JsonObject = {
    val obj = new JsonObject
    obj.addProperty("apiVersion", "3.0.0")
    obj.addProperty("swaggerVersion", "1.2")
    obj.addProperty("basePath", "http://localhost:8088/ari")
//    obj.addProperty("resourcePath", "/")
    obj.add("authorizations", authorization)
    val apisArray = new JsonArray()
    val modelsObject = new JsonObject
    apis.foreach{ api =>
      apisArray.addAll(api.apis)
      api.models.foreach{ entry =>
        modelsObject.add(entry._1, entry._2)
      }
    }
    obj.add("apis", apisArray)
    obj.add("models", modelsObject)
    obj
  }

  def getApi(content: String): Api = {
    val jsonObject = new JsonParser().parse(content).getAsJsonObject
    val apisArray = jsonObject.getAsJsonArray("apis")
    val modelsObjects = jsonObject.getAsJsonObject("models").entrySet()
    Api(operation11to12(apisArray), model11to12(modelsObjects))
  }

  def model12Array(in: String): List[(String, JsonElement)] = {
    val itemsObj = new JsonObject
    itemsObj.addProperty("$ref", in)
    "type" -> new JsonPrimitive("array") :: "items" -> itemsObj :: Nil
  }

  def changeType(in: String): List[(String, JsonElement)] =
    if(in.startsWith("[")) {
      val t = in.drop(1).dropRight(1)
      if(primitives11to12.contains(t)) primitives11to12(t).asArrayType
      else model12Array(t)
    } else {
      if(primitives11to12.contains(in)) primitives11to12(in).asType
      else List("$ref" -> new JsonPrimitive(in))
    }


  def operation11to12(array: JsonArray): JsonArray = {

    array.forEach{ elem =>
      val ops = elem.getAsJsonObject.getAsJsonArray("operations")
      ops.forEach{op =>
        val responseClass = op.getAsJsonObject.getAsJsonPrimitive("responseClass").getAsString
        if(responseClass != null) {
          changeType(responseClass).foreach{ case (key, value) =>
            op.getAsJsonObject.add(key, value)
          }
          op.getAsJsonObject.remove("responseClass")
        }

        val params = op.getAsJsonObject.getAsJsonArray("parameters")
        if(params != null) {
          params.forEach{param =>
            val paramObj = param.getAsJsonObject
            if(paramObj.has("dataType")) {
              changeType(paramObj.getAsJsonPrimitive("dataType").getAsString).foreach{ case (key, value) =>
                paramObj.add(key, value)
              }
              paramObj.remove("dataType")
            }
          }
        }
      }
    }
    array
  }

  def model11to12(models:  java.util.Set[java.util.Map.Entry[String, JsonElement]]): Set[(String, JsonObject)] = {

    def propToProp(in: JsonObject): (JsonObject, Boolean) = {
      val out = new JsonObject
      if(in.has("description")) out.addProperty("description", in.getAsJsonPrimitive("description").getAsString)
      if(in.has("type")) {
        changeType(in.getAsJsonPrimitive("type").getAsString).foreach{ case (key, value) =>
          out.add(key, value)
        }
      }

      out -> (if(in.has("required")) in.getAsJsonPrimitive("required").getAsBoolean else false)
    }

    def copyProperties(from: JsonObject, to: JsonObject, props: Set[String]): Unit =
      props.foreach( prop => if(from.has(prop)) to.add(prop, from.get(prop)))


    models.asScala.map{ modelEntry => // one model
      val allRequired = new JsonArray()
      val outModel = new JsonObject // "Sound: {}"
      val outProps = new JsonObject // "properties: {}"
      val model = modelEntry.getValue.getAsJsonObject
      copyProperties(model, outModel, Set("id", "description", "subTypes"))
      model.getAsJsonObject("properties").entrySet().asScala.foreach{ propertyEntry =>
        val (obj, required) = propToProp(propertyEntry.getValue.getAsJsonObject)
        if(required) allRequired.add(propertyEntry.getKey)
        outProps.add(propertyEntry.getKey, obj)
      }
      outModel.add("properties", outProps)
      if(allRequired.size() != 0) outModel.add("required", allRequired)
      modelEntry.getKey -> outModel
    }
  }.toSet

}

case class Api(apis: JsonArray, models:  Set[(String, JsonObject)])

case class Primitive12(tipe: String, format: String = "") {
  def asType: List[(String, JsonElement)] =
    "type" -> new JsonPrimitive(tipe) :: (if(format.isEmpty) Nil else "format" -> new JsonPrimitive(format) :: Nil)

  def asArrayType: List[(String, JsonElement)] = {
    val itemsObj = new JsonObject
    itemsObj.addProperty("type", tipe)
    if(format.nonEmpty) itemsObj.addProperty("format", format)
    "type" -> new JsonPrimitive("array") :: "items" -> itemsObj :: Nil
  }

}
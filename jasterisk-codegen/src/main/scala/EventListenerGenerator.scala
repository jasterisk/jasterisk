import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import com.google.gson.JsonParser

/**
  * This class generates the AsteriskWebSocketListener and AsteriskEventListener based on the events that are found
  * in the events.json file. Note that swagger-codegen does not seem to be able to generate class inheritance properly
  * (at least for version 1.2 of the swagger spec) so Asterisk events do not inherit from the Event class.
  */
object EventListenerGenerator extends App {

  if(args.length != 2) {
    println("needs two arguments, the path to events.json and target directory")
  } else {
    val bytes = Files.readAllBytes(Paths.get(args(0)))
    val content = new String(bytes)
    val parser = new JsonParser()
    val obj = parser.parse(content).getAsJsonObject
    val it = obj.getAsJsonObject("models").getAsJsonObject("Event").getAsJsonArray("subTypes").iterator()
    var seq = Seq.empty[String]
    while(it.hasNext) seq :+= it.next().getAsString

    val eventListener = getEventListener(seq)
    val wsListener = getWebSocketListener(seq)

    Files.write(Paths.get(args(1), "AsteriskEventListener.java"), eventListener.getBytes(StandardCharsets.UTF_8))
    Files.write(Paths.get(args(1), "AsteriskWebSocketListener.java"), wsListener.getBytes(StandardCharsets.UTF_8))
    println("done generating java classes successfully")
  }

  lazy val webSocketListener =
    """
      |package com.github.jasterisk.client;
      |
      |import com.github.jasterisk.model.*;
      |import okhttp3.Response;
      |import okhttp3.WebSocket;
      |import okhttp3.WebSocketListener;
      |
      |import java.util.Map;
      |import java.util.concurrent.ConcurrentHashMap;
      |import java.util.function.Consumer;
      |
      |/**
      | * OkHttp {@link WebSocketListener} implementation that parses Asterisk events.
      | */
      |class AsteriskWebSocketListener extends WebSocketListener {
      |
      |    private final Map<Class<?>, Consumer<?>> handlers = new ConcurrentHashMap<>();
      |    private final AsteriskEventListener listener;
      |
      |    @SuppressWarnings("unchecked")
      |    private <T> void setHandler(Class<T> klass, Consumer<ParseResult<T>> consumer) {
      |        handlers.put(klass, consumer);
      |    }
      |
      |    AsteriskWebSocketListener(AsteriskEventListener listener) {
      |        this.listener = listener;
      |HERE
      |    }
      |
      |    @Override
      |    @SuppressWarnings("unchecked")
      |    public void onMessage(WebSocket webSocket, String json) {
      |        listener.onWebSocketMessage(json);
      |        ParseResult result = Jasterisk.jsonToObject(json);
      |        Consumer<Object> consumer = (Consumer<Object>)handlers.get(result.object.getClass());
      |        if(consumer != null) consumer.accept(result);
      |    }
      |
      |    @Override
      |    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
      |        listener.onWebSocketFailure(t);
      |    }
      |
      |    @Override
      |    public void onOpen(WebSocket webSocket, Response response) {
      |        listener.onWebSocketOpen(response);
      |    }
      |
      |    @Override
      |    public void onClosing(WebSocket webSocket, int code, String reason) {
      |        listener.onWebSocketClosing(code, reason);
      |    }
      |
      |    @Override
      |    public void onClosed(WebSocket webSocket, int code, String reason) {
      |        listener.onWebSocketClosed(code, reason);
      |    }
      |}
    """.stripMargin.trim

  lazy val webSocketListenerAddHandler = "        setHandler({{EVENT}}.class,SPACE obj -> listener.on{{EVENT}}(obj.application, obj.timestamp, obj.object));"

  lazy val eventListener =
    """
      |package com.github.jasterisk.client;
      |
      |import com.github.jasterisk.model.*;
      |import java.time.OffsetDateTime;
      |import okhttp3.Response;
      |
      |/**
      | * Callback interface for handling Asterisk events.
      | */
      |public interface AsteriskEventListener {
      |
      |HERE
      |
      |    /**
      |     * Invoked when a web socket has been closed due to an error reading from or writing to the network. Both outgoing
      |     * and incoming messages may have been lost. No further calls to this listener will be made.
      |     * @param t failure reason
      |     */
      |    default void onWebSocketFailure(Throwable t){}
      |
      |    /**
      |     * Invoked when the remote peer has indicated that no more incoming messages will be transmitted.
      |     * @param code status code for closing
      |     * @param reason reason for closing
      |     */
      |    default void onWebSocketClosing(int code, String reason) {}
      |
      |    /**
      |     * Invoked when both peers have indicated that no more messages will be transmitted and the connection has been
      |     * successfully released. No further calls to this listener will be made.
      |     * @param code status code for closing
      |     * @param reason reason for closing
      |     */
      |    default void onWebSocketClosed(int code, String reason) {}
      |
      |    /**
      |     * Invoked when a web socket has been accepted by the remote peer and may begin transmitting messages.
      |     * @param response server response
      |     */
      |    default void onWebSocketOpen(Response response) {}
      |
      |    /**
      |     * Invoked with the unaltered json String when Asterisk sends a message.
      |     * @param json original json from Asterisk
      |     */
      |    default void onWebSocketMessage(String json) {}
      |}
    """.stripMargin.trim

  lazy val eventListenerMethod = "    default void on{{EVENT}}(String app, OffsetDateTime time, {{EVENT}} event) {}"


  def getWebSocketListener(events: Seq[String]): String = {
    val max = events.map(_.length).max
    val handlers = events.map { event =>
      webSocketListenerAddHandler
        .replace("{{EVENT}}", event)
        .replace("SPACE", " " * (max - event.length))
    }.mkString("\n")
    webSocketListener.replace("HERE", handlers)
  }

  def getEventListener(events: Seq[String]): String = {
    val methods = events
      .map(event => eventListenerMethod.replace("{{EVENT}}", event)).mkString("\n\n")
    eventListener.replace("HERE", methods)
  }


}

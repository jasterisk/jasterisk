package com.github.jasterisk.client;

import com.github.jasterisk.api.DefaultApi;
import com.github.jasterisk.invoker.ApiClient;
import com.github.jasterisk.invoker.Spy;
import com.github.jasterisk.model.AsteriskInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import javax.annotation.Nullable;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;

public class Jasterisk {

    private static JsonParser parser = new JsonParser();

    public static Gson gson = new GsonBuilder()
            .registerTypeAdapter(OffsetDateTime.class, new AsteriskOffsetDateTimeTypeAdapter())
            .create();

    public static WebSocket createEventWebSocket(String asteriskUri, String apiKeyValue, @Nullable String app, OkHttpClient okHttpClient, WebSocketListener listener) {
        String appKeyValue = (app != null) ? "app=" + app : "app=app&subscribeAll=true";
        Request request = new Request.Builder().get()
                .url(asteriskUri + "/events?" + appKeyValue + "&api_key=" + apiKeyValue).build();
        return okHttpClient.newWebSocket(request, listener);
    }

    public static DefaultApi createClient(String asteriskUri, String apiKeyValue, OkHttpClient okHttpClient) {
        Retrofit.Builder adapterBuilder =  new Retrofit.Builder()
                .baseUrl(asteriskUri.endsWith("/") ? asteriskUri : asteriskUri + "/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(Spy.gsonCustomConverterFactory(gson));

        ApiClient client = new ApiClient("apiKey", apiKeyValue);
        client.setAdapterBuilder(adapterBuilder);
        client.configureFromOkclient(okHttpClient);
        return client.createService(DefaultApi.class);
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            return gson.fromJson(body, returnType);
        } catch (JsonParseException e) {
            if(returnType.equals(String.class)) return (T) body;
            else throw e;
        }
    }

    public static Object jsonToObject(String json) {
        try {
            String type = parser.parse(json).getAsJsonObject().get("type").getAsString();
            String fullName = AsteriskInfo.class.getPackage().getName() + "." + type;
            return deserialize(json, Class.forName(fullName));
        } catch (ClassNotFoundException cnfe) {
            throw new Error(cnfe);
        }
    }

}

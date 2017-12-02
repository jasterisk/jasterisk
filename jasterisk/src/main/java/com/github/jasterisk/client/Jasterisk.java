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

/**
 * Helper class for creating an instance of {@link DefaultApi} and {@link WebSocket}.
 */
public class Jasterisk {

    private static JsonParser parser = new JsonParser();

    /**
     * A {@link Gson} instance that handles Asterisk's not so correctly formatted dates.
     */
    public static Gson gson = new GsonBuilder()
            .registerTypeAdapter(OffsetDateTime.class, new AsteriskOffsetDateTimeTypeAdapter())
            .create();

    /**
     * Creates a {@link WebSocket} for handling Asterisk events.
     *
     * @param asteriskUri the uri to Asterisk, like 'http://192.168.1.207:8088/ari', MUST NOT end in /
     * @param apiKeyValue the api key and value like 'asterisk:asterisk'
     * @param app the app to receive event's from or null if requesting events from all apps
     * @param okHttpClient an initialized instance of {@link OkHttpClient}
     * @param listener a {@link WebSocketListener} to handle events
     * @return the {@link WebSocket} instance
     */
    public static WebSocket createEventWebSocket(String asteriskUri, String apiKeyValue, @Nullable String app, OkHttpClient okHttpClient, WebSocketListener listener) {
        String appKeyValue = (app != null) ? "app=" + app : "app=app&subscribeAll=true";
        Request request = new Request.Builder().get()
                .url(asteriskUri + "/events?" + appKeyValue + "&api_key=" + apiKeyValue).build();
        return okHttpClient.newWebSocket(request, listener);
    }

    /**
     * Creates an instance of {@link DefaultApi} used to communicate with Asterisk
     *
     * @param asteriskUri the uri to Asterisk, like 'http://192.168.1.207:8088/ari', MUST NOT end in /
     * @param apiKeyValue the api key and value like 'asterisk:asterisk'
     * @param okHttpClient an initialized instance of {@link OkHttpClient}
     * @return the {@link DefaultApi} instance
     */
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
    private static <T> T deserialize(String body, Type returnType) throws JsonParseException {
        try {
            return gson.fromJson(body, returnType);
        } catch (JsonParseException e) {
            if(returnType.equals(String.class)) return (T) body;
            else throw e;
        }
    }

    /**
     * Transforms a json String into an instance of one of the classes in the model package.
     *
     * @param json json to transform
     * @throws JsonParseException if the json cannot be parsed
     * @return an Object
     */
    public static Object jsonToObject(String json) throws JsonParseException {
        try {
            String type = parser.parse(json).getAsJsonObject().get("type").getAsString();
            String fullName = AsteriskInfo.class.getPackage().getName() + "." + type;
            return deserialize(json, Class.forName(fullName));
        } catch (ClassNotFoundException cnfe) {
            throw new Error(cnfe);
        }
    }

}

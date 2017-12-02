package com.github.jasterisk.example;

import com.github.jasterisk.api.DefaultApi;
import com.github.jasterisk.client.Jasterisk;
import com.github.jasterisk.model.Bridge;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import retrofit2.Response;

import java.io.IOException;
import java.util.concurrent.Executors;

public class Example {

    private static final String uri = "http://192.168.1.207:8088/ari";
    private static final String apiKeyValue = "asterisk:asterisk";

    public static void main(String[] args) throws IOException, InterruptedException {
        OkHttpClient okClient = new OkHttpClient.Builder()
            .dispatcher(new Dispatcher(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())))
            .build();

        DefaultApi client = Jasterisk.createClient(uri, apiKeyValue, okClient);
        WebSocket eventWebSocket = Jasterisk
                .createEventWebSocket(uri, apiKeyValue, null, okClient, new MyWebSocketListener());
        Thread.sleep(1000); // give time for the websocket to get setup

        Response<Bridge> response = client
                .createBridge("holding", null, null) // null for optional values
                .execute();// sync, use .enqueue for async
        if(response.isSuccessful()) {
            System.out.println("new Bridge id is " + response.body().getId());
        }
        eventWebSocket.close(1000, "closing");
    }

    public static class MyWebSocketListener extends WebSocketListener {

        @Override
        public void onMessage(WebSocket webSocket, String json) {
            Object obj = Jasterisk.jsonToObject(json);
            System.out.println(obj.getClass().getName());
        }
    }
}

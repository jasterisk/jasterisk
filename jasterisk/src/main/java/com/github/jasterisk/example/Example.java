package com.github.jasterisk.example;

import com.github.jasterisk.api.DefaultApi;
import com.github.jasterisk.client.AsteriskEventListener;
import com.github.jasterisk.client.AsteriskWebSocket;
import com.github.jasterisk.client.Jasterisk;
import com.github.jasterisk.model.Bridge;
import com.github.jasterisk.model.BridgeCreated;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import retrofit2.Response;

import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.concurrent.Executors;

class Example {

    private static final String uri = "http://192.168.1.207:8088/ari";
    private static final String apiKeyValue = "asterisk:asterisk";

    public static void main(String[] args) throws IOException, InterruptedException {
        OkHttpClient okClient = new OkHttpClient.Builder()
            .dispatcher(new Dispatcher(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())))
            .build();

        DefaultApi client = Jasterisk.createClient(uri, apiKeyValue, okClient);
        // extend AsteriskWebSocketListener for better error handling on the websocket
        AsteriskEventListener listener = new MyAsteriskEventListener();
        AsteriskWebSocket eventWebSocket = Jasterisk
                .createEventWebSocket(uri, apiKeyValue, null, okClient, listener, Duration.ofSeconds(5));
        Thread.sleep(1000); // give time for the websocket to get setup

        Response<Bridge> response = client
                .createBridge("holding", null, null) // null for optional values
                .execute();// sync, use .enqueue for async
        if(response.isSuccessful()) {
            System.out.println("new Bridge id is " + response.body().getId());
        }
        eventWebSocket.close(1000, "closing");
        okClient.dispatcher().executorService().shutdown();
    }

    public static class MyAsteriskEventListener implements AsteriskEventListener {

        @Override
        public void onBridgeCreated(String application, OffsetDateTime time, BridgeCreated event) {
            System.out.println("received event for new bridge " + event.getBridge().getId());
        }
    }
}

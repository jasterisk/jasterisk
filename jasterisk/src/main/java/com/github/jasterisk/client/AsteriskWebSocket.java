package com.github.jasterisk.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;

import javax.annotation.Nullable;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * WebSocket connection to Asterisk.
 */
public class AsteriskWebSocket {

    private static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(0);
    private final AtomicReference<WebSocket> ws = new AtomicReference<>();
    private final OkHttpClient client;
    private final Request request;
    private final AsteriskWebSocketListener listener;
    private final Duration reconnectTimeout;

    private AsteriskWebSocket(OkHttpClient client, Request request, AsteriskEventListener listener, Duration reconnectTimeout) {
        this.client = client;
        this.request = request;
        this.listener = reconnectTimeout.isZero() ? new AsteriskWebSocketListener(listener) : new ReconnectingWebSocketListener(listener);
        this.reconnectTimeout = reconnectTimeout;
    }

    static AsteriskWebSocket create(OkHttpClient client, Request request, AsteriskEventListener listener, Duration reconnectTimeout) {
        AsteriskWebSocket socket = new AsteriskWebSocket(client, request, listener, reconnectTimeout);
        socket.connect();
        return socket;
    }

    /**
     * Returns the original request that initiated this web socket.
     *
     * @return the original {@link Request}
     * @see WebSocket#request()
     */
    public Request request() {
        return request;
    }

    /**
     * Returns the size in bytes of all messages enqueued to be transmitted to the server. This doesn't include framing
     * overhead. It also doesn't include any bytes buffered by the operating system or network intermediaries.
     * This method returns 0 if no messages are waiting in the queue. If may return a nonzero value after the web socket
     * has been canceled; this indicates that enqueued messages were not transmitted.
     *
     * @return queue size in bytes
     * @see WebSocket#queueSize()
     */
    public long queueSize() {
        return ws.get() != null ? ws.get().queueSize() : 0;
    }

    /**
     * Attempts to initiate a graceful shutdown of this web socket.
     *
     * @param code Status code as defined by <a
     * href="http://tools.ietf.org/html/rfc6455#section-7.4">Section 7.4 of RFC 6455</a> or {@code 0}.
     * @param reason Reason for shutting down or {@code null}.
     * @return true if a graceful shutdown was initiated by this call, false if a graceful shutdown was already underway
     * or if the web socket is already closed or canceled.
     * @see WebSocket#close(int, String)
     */
    public boolean close(int code, @Nullable String reason) {
        return ws.get() != null && ws.get().close(code, reason);
    }

    /**
     * Immediately and violently release resources held by this web socket, discarding any enqueued messages. This does
     * nothing if the web socket has already been closed or canceled.
     *
     * @see WebSocket#cancel()
     */
    public void cancel() {
        if(ws.get() != null) ws.get().cancel();
    }

    private void connect() {
        ws.set(client.newWebSocket(request, listener));
    }

    class ReconnectingWebSocketListener extends AsteriskWebSocketListener {

        ReconnectingWebSocketListener(AsteriskEventListener listener) {
            super(listener);
        }

        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            scheduler.schedule(AsteriskWebSocket.this::connect, reconnectTimeout.toMillis(), TimeUnit.MILLISECONDS);
            super.onFailure(webSocket, t, response);
        }
    }
}

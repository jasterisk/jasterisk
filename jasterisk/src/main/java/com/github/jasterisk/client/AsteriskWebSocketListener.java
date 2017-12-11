package com.github.jasterisk.client;

import com.github.jasterisk.model.*;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * OkHttp {@link WebSocketListener} implementation that parses Asterisk events.
 */
class AsteriskWebSocketListener extends WebSocketListener {

    private final Map<Class<?>, Consumer<?>> handlers = new ConcurrentHashMap<>();
    private final AsteriskEventListener listener;

    @SuppressWarnings("unchecked")
    private <T> void setHandler(Class<T> klass, Consumer<ParseResult<T>> consumer) {
        handlers.put(klass, consumer);
    }

    AsteriskWebSocketListener(AsteriskEventListener listener) {
        this.listener = listener;
        setHandler(DeviceStateChanged.class,       obj -> listener.onDeviceStateChanged(obj.application, obj.timestamp, obj.object));
        setHandler(PlaybackStarted.class,          obj -> listener.onPlaybackStarted(obj.application, obj.timestamp, obj.object));
        setHandler(PlaybackContinuing.class,       obj -> listener.onPlaybackContinuing(obj.application, obj.timestamp, obj.object));
        setHandler(PlaybackFinished.class,         obj -> listener.onPlaybackFinished(obj.application, obj.timestamp, obj.object));
        setHandler(RecordingStarted.class,         obj -> listener.onRecordingStarted(obj.application, obj.timestamp, obj.object));
        setHandler(RecordingFinished.class,        obj -> listener.onRecordingFinished(obj.application, obj.timestamp, obj.object));
        setHandler(RecordingFailed.class,          obj -> listener.onRecordingFailed(obj.application, obj.timestamp, obj.object));
        setHandler(ApplicationReplaced.class,      obj -> listener.onApplicationReplaced(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeCreated.class,            obj -> listener.onBridgeCreated(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeDestroyed.class,          obj -> listener.onBridgeDestroyed(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeMerged.class,             obj -> listener.onBridgeMerged(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeBlindTransfer.class,      obj -> listener.onBridgeBlindTransfer(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeAttendedTransfer.class,   obj -> listener.onBridgeAttendedTransfer(obj.application, obj.timestamp, obj.object));
        setHandler(BridgeVideoSourceChanged.class, obj -> listener.onBridgeVideoSourceChanged(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelCreated.class,           obj -> listener.onChannelCreated(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelDestroyed.class,         obj -> listener.onChannelDestroyed(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelEnteredBridge.class,     obj -> listener.onChannelEnteredBridge(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelLeftBridge.class,        obj -> listener.onChannelLeftBridge(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelStateChange.class,       obj -> listener.onChannelStateChange(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelDtmfReceived.class,      obj -> listener.onChannelDtmfReceived(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelDialplan.class,          obj -> listener.onChannelDialplan(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelCallerId.class,          obj -> listener.onChannelCallerId(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelUserevent.class,         obj -> listener.onChannelUserevent(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelHangupRequest.class,     obj -> listener.onChannelHangupRequest(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelVarset.class,            obj -> listener.onChannelVarset(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelTalkingStarted.class,    obj -> listener.onChannelTalkingStarted(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelTalkingFinished.class,   obj -> listener.onChannelTalkingFinished(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelHold.class,              obj -> listener.onChannelHold(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelUnhold.class,            obj -> listener.onChannelUnhold(obj.application, obj.timestamp, obj.object));
        setHandler(ContactStatusChange.class,      obj -> listener.onContactStatusChange(obj.application, obj.timestamp, obj.object));
        setHandler(EndpointStateChange.class,      obj -> listener.onEndpointStateChange(obj.application, obj.timestamp, obj.object));
        setHandler(Dial.class,                     obj -> listener.onDial(obj.application, obj.timestamp, obj.object));
        setHandler(StasisEnd.class,                obj -> listener.onStasisEnd(obj.application, obj.timestamp, obj.object));
        setHandler(StasisStart.class,              obj -> listener.onStasisStart(obj.application, obj.timestamp, obj.object));
        setHandler(TextMessageReceived.class,      obj -> listener.onTextMessageReceived(obj.application, obj.timestamp, obj.object));
        setHandler(ChannelConnectedLine.class,     obj -> listener.onChannelConnectedLine(obj.application, obj.timestamp, obj.object));
        setHandler(PeerStatusChange.class,         obj -> listener.onPeerStatusChange(obj.application, obj.timestamp, obj.object));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onMessage(WebSocket webSocket, String json) {
        listener.onWebSocketMessage(json);
        ParseResult result = Jasterisk.jsonToObject(json);
        Consumer<Object> consumer = (Consumer<Object>)handlers.get(result.object.getClass());
        if(consumer != null) consumer.accept(result);
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        listener.onWebSocketFailure(t);
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        listener.onWebSocketOpen(response);
    }

    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
        listener.onWebSocketClosing(code, reason);
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        listener.onWebSocketClosed(code, reason);
    }
}
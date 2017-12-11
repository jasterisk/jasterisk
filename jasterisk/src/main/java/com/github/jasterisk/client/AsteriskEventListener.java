package com.github.jasterisk.client;

import com.github.jasterisk.model.*;
import java.time.OffsetDateTime;
import okhttp3.Response;

/**
 * Callback interface for handling Asterisk events.
 */
public interface AsteriskEventListener {

    default void onDeviceStateChanged(String app, OffsetDateTime time, DeviceStateChanged event) {}

    default void onPlaybackStarted(String app, OffsetDateTime time, PlaybackStarted event) {}

    default void onPlaybackContinuing(String app, OffsetDateTime time, PlaybackContinuing event) {}

    default void onPlaybackFinished(String app, OffsetDateTime time, PlaybackFinished event) {}

    default void onRecordingStarted(String app, OffsetDateTime time, RecordingStarted event) {}

    default void onRecordingFinished(String app, OffsetDateTime time, RecordingFinished event) {}

    default void onRecordingFailed(String app, OffsetDateTime time, RecordingFailed event) {}

    default void onApplicationReplaced(String app, OffsetDateTime time, ApplicationReplaced event) {}

    default void onBridgeCreated(String app, OffsetDateTime time, BridgeCreated event) {}

    default void onBridgeDestroyed(String app, OffsetDateTime time, BridgeDestroyed event) {}

    default void onBridgeMerged(String app, OffsetDateTime time, BridgeMerged event) {}

    default void onBridgeBlindTransfer(String app, OffsetDateTime time, BridgeBlindTransfer event) {}

    default void onBridgeAttendedTransfer(String app, OffsetDateTime time, BridgeAttendedTransfer event) {}

    default void onBridgeVideoSourceChanged(String app, OffsetDateTime time, BridgeVideoSourceChanged event) {}

    default void onChannelCreated(String app, OffsetDateTime time, ChannelCreated event) {}

    default void onChannelDestroyed(String app, OffsetDateTime time, ChannelDestroyed event) {}

    default void onChannelEnteredBridge(String app, OffsetDateTime time, ChannelEnteredBridge event) {}

    default void onChannelLeftBridge(String app, OffsetDateTime time, ChannelLeftBridge event) {}

    default void onChannelStateChange(String app, OffsetDateTime time, ChannelStateChange event) {}

    default void onChannelDtmfReceived(String app, OffsetDateTime time, ChannelDtmfReceived event) {}

    default void onChannelDialplan(String app, OffsetDateTime time, ChannelDialplan event) {}

    default void onChannelCallerId(String app, OffsetDateTime time, ChannelCallerId event) {}

    default void onChannelUserevent(String app, OffsetDateTime time, ChannelUserevent event) {}

    default void onChannelHangupRequest(String app, OffsetDateTime time, ChannelHangupRequest event) {}

    default void onChannelVarset(String app, OffsetDateTime time, ChannelVarset event) {}

    default void onChannelTalkingStarted(String app, OffsetDateTime time, ChannelTalkingStarted event) {}

    default void onChannelTalkingFinished(String app, OffsetDateTime time, ChannelTalkingFinished event) {}

    default void onChannelHold(String app, OffsetDateTime time, ChannelHold event) {}

    default void onChannelUnhold(String app, OffsetDateTime time, ChannelUnhold event) {}

    default void onContactStatusChange(String app, OffsetDateTime time, ContactStatusChange event) {}

    default void onEndpointStateChange(String app, OffsetDateTime time, EndpointStateChange event) {}

    default void onDial(String app, OffsetDateTime time, Dial event) {}

    default void onStasisEnd(String app, OffsetDateTime time, StasisEnd event) {}

    default void onStasisStart(String app, OffsetDateTime time, StasisStart event) {}

    default void onTextMessageReceived(String app, OffsetDateTime time, TextMessageReceived event) {}

    default void onChannelConnectedLine(String app, OffsetDateTime time, ChannelConnectedLine event) {}

    default void onPeerStatusChange(String app, OffsetDateTime time, PeerStatusChange event) {}

    /**
     * Invoked when a web socket has been closed due to an error reading from or writing to the network. Both outgoing
     * and incoming messages may have been lost. No further calls to this listener will be made.
     * @param t failure reason
     */
    default void onWebSocketFailure(Throwable t){}

    /**
     * Invoked when the remote peer has indicated that no more incoming messages will be transmitted.
     * @param code status code for closing
     * @param reason reason for closing
     */
    default void onWebSocketClosing(int code, String reason) {}

    /**
     * Invoked when both peers have indicated that no more messages will be transmitted and the connection has been
     * successfully released. No further calls to this listener will be made.
     * @param code status code for closing
     * @param reason reason for closing
     */
    default void onWebSocketClosed(int code, String reason) {}

    /**
     * Invoked when a web socket has been accepted by the remote peer and may begin transmitting messages.
     * @param response server response
     */
    default void onWebSocketOpen(Response response) {}

    /**
     * Invoked with the unaltered json String when Asterisk sends a message.
     * @param json original json from Asterisk
     */
    default void onWebSocketMessage(String json) {}
}
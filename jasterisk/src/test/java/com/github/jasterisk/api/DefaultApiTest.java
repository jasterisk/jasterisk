package com.github.jasterisk.api;

import com.github.jasterisk.invoker.ApiClient;
import com.github.jasterisk.model.Application;
import com.github.jasterisk.model.AsteriskInfo;
import com.github.jasterisk.model.Bridge;
import com.github.jasterisk.model.Channel;
import com.github.jasterisk.model.ConfigObject;
import com.github.jasterisk.model.ConfigTuple;
import com.github.jasterisk.model.CustomVariable;
import com.github.jasterisk.model.DeviceState;
import com.github.jasterisk.model.Endpoint;
import com.github.jasterisk.model.LiveRecording;
import com.github.jasterisk.model.LogChannel;
import com.github.jasterisk.model.Mailbox;
import com.github.jasterisk.model.Message;
import com.github.jasterisk.model.Module;
import com.github.jasterisk.model.Playback;
import com.github.jasterisk.model.Sound;
import com.github.jasterisk.model.StoredRecording;
import com.github.jasterisk.model.Variable;
import com.github.jasterisk.model.VariableTuple;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    /**
     * Adds a log channel.
     *
     * 
     */
    @Test
    public void addAsteriskLogChannelTest() {
        String logChannelName = null;
        String _configuration = null;
        // Void response = api.addAsteriskLogChannel(logChannelName, _configuration);

        // TODO: test validations
    }
    /**
     * Add a channel to a bridge.
     *
     * 
     */
    @Test
    public void addChannelToBridgeTest() {
        String bridgeId = null;
        List<String> channel = null;
        String role = null;
        // Void response = api.addChannelToBridge(bridgeId, channel, role);

        // TODO: test validations
    }
    /**
     * Generate a user event.
     *
     * 
     */
    @Test
    public void addUserEventTest() {
        String eventName = null;
        String application = null;
        List<String> source = null;
        List<CustomVariable> variables = null;
        // Void response = api.addUserEvent(eventName, application, source, variables);

        // TODO: test validations
    }
    /**
     * Answer a channel.
     *
     * 
     */
    @Test
    public void answerChannelTest() {
        String channelId = null;
        // Void response = api.answerChannel(channelId);

        // TODO: test validations
    }
    /**
     * Stop a live recording and discard it.
     *
     * 
     */
    @Test
    public void cancelLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.cancelLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.
     *
     * 
     */
    @Test
    public void clearBridgeChannelVideoSourceTest() {
        String bridgeId = null;
        // Void response = api.clearBridgeChannelVideoSource(bridgeId);

        // TODO: test validations
    }
    /**
     * Exit application; continue execution in the dialplan.
     *
     * 
     */
    @Test
    public void continueChannelInDialplanTest() {
        String channelId = null;
        String context = null;
        String extension = null;
        Integer priority = null;
        String label = null;
        // Void response = api.continueChannelInDialplan(channelId, context, extension, priority, label);

        // TODO: test validations
    }
    /**
     * Control a playback.
     *
     * 
     */
    @Test
    public void controlPlaybackTest() {
        String playbackId = null;
        String operation = null;
        // Void response = api.controlPlayback(playbackId, operation);

        // TODO: test validations
    }
    /**
     * Copy a stored recording.
     *
     * 
     */
    @Test
    public void copyStoredRecordingTest() {
        String recordingName = null;
        String destinationRecordingName = null;
        // StoredRecording response = api.copyStoredRecording(recordingName, destinationRecordingName);

        // TODO: test validations
    }
    /**
     * Create a new bridge.
     *
     * This bridge persists until it has been shut down, or Asterisk has been shut down.
     */
    @Test
    public void createBridgeTest() {
        String type = null;
        String bridgeId = null;
        String name = null;
        // Bridge response = api.createBridge(type, bridgeId, name);

        // TODO: test validations
    }
    /**
     * Create channel.
     *
     * 
     */
    @Test
    public void createChannelTest() {
        String endpoint = null;
        String app = null;
        String appArgs = null;
        String channelId = null;
        String otherChannelId = null;
        String originator = null;
        String formats = null;
        // Channel response = api.createChannel(endpoint, app, appArgs, channelId, otherChannelId, originator, formats);

        // TODO: test validations
    }
    /**
     * Create a new bridge or updates an existing one.
     *
     * This bridge persists until it has been shut down, or Asterisk has been shut down.
     */
    @Test
    public void createOrUpdateBridgeTest() {
        String bridgeId = null;
        String type = null;
        String name = null;
        // Bridge response = api.createOrUpdateBridge(bridgeId, type, name);

        // TODO: test validations
    }
    /**
     * Delete a dynamic configuration object.
     *
     * 
     */
    @Test
    public void deleteAsteriskConfigObjectTest() {
        String configClass = null;
        String objectType = null;
        String id = null;
        // Void response = api.deleteAsteriskConfigObject(configClass, objectType, id);

        // TODO: test validations
    }
    /**
     * Deletes a log channel.
     *
     * 
     */
    @Test
    public void deleteAsteriskLogChannelTest() {
        String logChannelName = null;
        // Void response = api.deleteAsteriskLogChannel(logChannelName);

        // TODO: test validations
    }
    /**
     * Shut down a bridge.
     *
     * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
     */
    @Test
    public void deleteBridgeTest() {
        String bridgeId = null;
        // Void response = api.deleteBridge(bridgeId);

        // TODO: test validations
    }
    /**
     * Destroy a device-state controlled by ARI.
     *
     * 
     */
    @Test
    public void deleteDeviceStateTest() {
        String deviceName = null;
        // Void response = api.deleteDeviceState(deviceName);

        // TODO: test validations
    }
    /**
     * Destroy a mailbox.
     *
     * 
     */
    @Test
    public void deleteMailboxTest() {
        String mailboxName = null;
        // Void response = api.deleteMailbox(mailboxName);

        // TODO: test validations
    }
    /**
     * Delete a stored recording.
     *
     * 
     */
    @Test
    public void deleteStoredRecordingTest() {
        String recordingName = null;
        // Void response = api.deleteStoredRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Dial a created channel.
     *
     * 
     */
    @Test
    public void dialChannelTest() {
        String channelId = null;
        String caller = null;
        Integer timeout = null;
        // Void response = api.dialChannel(channelId, caller, timeout);

        // TODO: test validations
    }
    /**
     * WebSocket connection for events.
     *
     * 
     */
    @Test
    public void eventWebsocketTest() {
        List<String> app = null;
        Boolean subscribeAll = null;
        // Message response = api.eventWebsocket(app, subscribeAll);

        // TODO: test validations
    }
    /**
     * Get details of an application.
     *
     * 
     */
    @Test
    public void getApplicationTest() {
        String applicationName = null;
        // Application response = api.getApplication(applicationName);

        // TODO: test validations
    }
    /**
     * List all applications.
     *
     * 
     */
    @Test
    public void getApplicationsTest() {
        // List<Application> response = api.getApplications();

        // TODO: test validations
    }
    /**
     * Retrieve a dynamic configuration object.
     *
     * 
     */
    @Test
    public void getAsteriskConfigObjectTest() {
        String configClass = null;
        String objectType = null;
        String id = null;
        // List<ConfigTuple> response = api.getAsteriskConfigObject(configClass, objectType, id);

        // TODO: test validations
    }
    /**
     * Get the value of a global variable.
     *
     * 
     */
    @Test
    public void getAsteriskGlobalVarTest() {
        String variable = null;
        // Variable response = api.getAsteriskGlobalVar(variable);

        // TODO: test validations
    }
    /**
     * Gets Asterisk system information.
     *
     * 
     */
    @Test
    public void getAsteriskInfoTest() {
        List<String> only = null;
        // AsteriskInfo response = api.getAsteriskInfo(only);

        // TODO: test validations
    }
    /**
     * Gets Asterisk log channel information.
     *
     * 
     */
    @Test
    public void getAsteriskLogChannelsTest() {
        // List<LogChannel> response = api.getAsteriskLogChannels();

        // TODO: test validations
    }
    /**
     * Get Asterisk module information.
     *
     * 
     */
    @Test
    public void getAsteriskModuleTest() {
        String moduleName = null;
        // Module response = api.getAsteriskModule(moduleName);

        // TODO: test validations
    }
    /**
     * List Asterisk modules.
     *
     * 
     */
    @Test
    public void getAsteriskModulesTest() {
        // List<Module> response = api.getAsteriskModules();

        // TODO: test validations
    }
    /**
     * Get bridge details.
     *
     * 
     */
    @Test
    public void getBridgeTest() {
        String bridgeId = null;
        // Bridge response = api.getBridge(bridgeId);

        // TODO: test validations
    }
    /**
     * List all active bridges in Asterisk.
     *
     * 
     */
    @Test
    public void getBridgesTest() {
        // List<Bridge> response = api.getBridges();

        // TODO: test validations
    }
    /**
     * Channel details.
     *
     * 
     */
    @Test
    public void getChannelTest() {
        String channelId = null;
        // Channel response = api.getChannel(channelId);

        // TODO: test validations
    }
    /**
     * Get the value of a channel variable or function.
     *
     * 
     */
    @Test
    public void getChannelVarTest() {
        String channelId = null;
        String variable = null;
        // Variable response = api.getChannelVar(channelId, variable);

        // TODO: test validations
    }
    /**
     * List all active channels in Asterisk.
     *
     * 
     */
    @Test
    public void getChannelsTest() {
        // List<Channel> response = api.getChannels();

        // TODO: test validations
    }
    /**
     * Retrieve the current state of a device.
     *
     * 
     */
    @Test
    public void getDeviceStateTest() {
        String deviceName = null;
        // DeviceState response = api.getDeviceState(deviceName);

        // TODO: test validations
    }
    /**
     * List all ARI controlled device states.
     *
     * 
     */
    @Test
    public void getDeviceStatesTest() {
        // List<DeviceState> response = api.getDeviceStates();

        // TODO: test validations
    }
    /**
     * Details for an endpoint.
     *
     * 
     */
    @Test
    public void getEndpointTest() {
        String tech = null;
        String resource = null;
        // Endpoint response = api.getEndpoint(tech, resource);

        // TODO: test validations
    }
    /**
     * List all endpoints.
     *
     * 
     */
    @Test
    public void getEndpointsTest() {
        // List<Endpoint> response = api.getEndpoints();

        // TODO: test validations
    }
    /**
     * List available endoints for a given endpoint technology.
     *
     * 
     */
    @Test
    public void getEndpointsByTechTest() {
        String tech = null;
        // List<Endpoint> response = api.getEndpointsByTech(tech);

        // TODO: test validations
    }
    /**
     * List live recordings.
     *
     * 
     */
    @Test
    public void getLiveRecordingTest() {
        String recordingName = null;
        // LiveRecording response = api.getLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Retrieve the current state of a mailbox.
     *
     * 
     */
    @Test
    public void getMailboxTest() {
        String mailboxName = null;
        // Mailbox response = api.getMailbox(mailboxName);

        // TODO: test validations
    }
    /**
     * List all mailboxes.
     *
     * 
     */
    @Test
    public void getMailboxesTest() {
        // List<Mailbox> response = api.getMailboxes();

        // TODO: test validations
    }
    /**
     * Get a playback&#39;s details.
     *
     * 
     */
    @Test
    public void getPlaybackTest() {
        String playbackId = null;
        // Playback response = api.getPlayback(playbackId);

        // TODO: test validations
    }
    /**
     * Get a sound&#39;s details.
     *
     * 
     */
    @Test
    public void getSoundTest() {
        String soundId = null;
        // Sound response = api.getSound(soundId);

        // TODO: test validations
    }
    /**
     * List all sounds.
     *
     * 
     */
    @Test
    public void getSoundsTest() {
        String lang = null;
        String format = null;
        // List<Sound> response = api.getSounds(lang, format);

        // TODO: test validations
    }
    /**
     * Get a stored recording&#39;s details.
     *
     * 
     */
    @Test
    public void getStoredRecordingTest() {
        String recordingName = null;
        // StoredRecording response = api.getStoredRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Get the file associated with the stored recording.
     *
     * 
     */
    @Test
    public void getStoredRecordingFileTest() {
        String recordingName = null;
        // byte[] response = api.getStoredRecordingFile(recordingName);

        // TODO: test validations
    }
    /**
     * List recordings that are complete.
     *
     * 
     */
    @Test
    public void getStoredRecordingsTest() {
        // List<StoredRecording> response = api.getStoredRecordings();

        // TODO: test validations
    }
    /**
     * Delete (i.e. hangup) a channel.
     *
     * 
     */
    @Test
    public void hangupChannelTest() {
        String channelId = null;
        String reason = null;
        // Void response = api.hangupChannel(channelId, reason);

        // TODO: test validations
    }
    /**
     * Hold a channel.
     *
     * 
     */
    @Test
    public void holdChannelTest() {
        String channelId = null;
        // Void response = api.holdChannel(channelId);

        // TODO: test validations
    }
    /**
     * Load an Asterisk module.
     *
     * 
     */
    @Test
    public void loadAsteriskModuleTest() {
        String moduleName = null;
        // Void response = api.loadAsteriskModule(moduleName);

        // TODO: test validations
    }
    /**
     * Mute a channel.
     *
     * 
     */
    @Test
    public void muteChannelTest() {
        String channelId = null;
        String direction = null;
        // Void response = api.muteChannel(channelId, direction);

        // TODO: test validations
    }
    /**
     * Mute a live recording.
     *
     * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
     */
    @Test
    public void muteLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.muteLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Create a new channel (originate).
     *
     * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
     */
    @Test
    public void originateChannelTest() {
        String endpoint = null;
        String extension = null;
        String context = null;
        Long priority = null;
        String label = null;
        String app = null;
        String appArgs = null;
        String callerId = null;
        Integer timeout = null;
        List<VariableTuple> variables = null;
        String channelId = null;
        String otherChannelId = null;
        String originator = null;
        String formats = null;
        // Channel response = api.originateChannel(endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, channelId, otherChannelId, originator, formats);

        // TODO: test validations
    }
    /**
     * Create a new channel (originate with id).
     *
     * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
     */
    @Test
    public void originateChannelWithIdTest() {
        String channelId = null;
        String endpoint = null;
        String extension = null;
        String context = null;
        Long priority = null;
        String label = null;
        String app = null;
        String appArgs = null;
        String callerId = null;
        Integer timeout = null;
        List<VariableTuple> variables = null;
        String otherChannelId = null;
        String originator = null;
        String formats = null;
        // Channel response = api.originateChannelWithId(channelId, endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, otherChannelId, originator, formats);

        // TODO: test validations
    }
    /**
     * Pause a live recording.
     *
     * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
     */
    @Test
    public void pauseLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.pauseLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Start playback of media on a bridge.
     *
     * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
     */
    @Test
    public void playBridgeMediaTest() {
        String bridgeId = null;
        List<String> media = null;
        String lang = null;
        Integer offsetms = null;
        Integer skipms = null;
        String playbackId = null;
        // Playback response = api.playBridgeMedia(bridgeId, media, lang, offsetms, skipms, playbackId);

        // TODO: test validations
    }
    /**
     * Start playback of media on a bridge.
     *
     * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
     */
    @Test
    public void playBridgeMediaWithIdTest() {
        String bridgeId = null;
        String playbackId = null;
        List<String> media = null;
        String lang = null;
        Integer offsetms = null;
        Integer skipms = null;
        // Playback response = api.playBridgeMediaWithId(bridgeId, playbackId, media, lang, offsetms, skipms);

        // TODO: test validations
    }
    /**
     * Start playback of media.
     *
     * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
     */
    @Test
    public void playChannelTest() {
        String channelId = null;
        List<String> media = null;
        String lang = null;
        Integer offsetms = null;
        Integer skipms = null;
        String playbackId = null;
        // Playback response = api.playChannel(channelId, media, lang, offsetms, skipms, playbackId);

        // TODO: test validations
    }
    /**
     * Start playback of media and specify the playbackId.
     *
     * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
     */
    @Test
    public void playChannelWithIdTest() {
        String channelId = null;
        String playbackId = null;
        List<String> media = null;
        String lang = null;
        Integer offsetms = null;
        Integer skipms = null;
        // Playback response = api.playChannelWithId(channelId, playbackId, media, lang, offsetms, skipms);

        // TODO: test validations
    }
    /**
     * Start a recording.
     *
     * This records the mixed audio from all channels participating in this bridge.
     */
    @Test
    public void recordBridgeTest() {
        String bridgeId = null;
        String name = null;
        String format = null;
        Integer maxDurationSeconds = null;
        Integer maxSilenceSeconds = null;
        String ifExists = null;
        Boolean beep = null;
        String terminateOn = null;
        // LiveRecording response = api.recordBridge(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);

        // TODO: test validations
    }
    /**
     * Start a recording.
     *
     * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that&#39;s what you want.
     */
    @Test
    public void recordChannelTest() {
        String channelId = null;
        String name = null;
        String format = null;
        Integer maxDurationSeconds = null;
        Integer maxSilenceSeconds = null;
        String ifExists = null;
        Boolean beep = null;
        String terminateOn = null;
        // LiveRecording response = api.recordChannel(channelId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);

        // TODO: test validations
    }
    /**
     * Redirect the channel to a different location.
     *
     * 
     */
    @Test
    public void redirectChannelTest() {
        String channelId = null;
        String endpoint = null;
        // Void response = api.redirectChannel(channelId, endpoint);

        // TODO: test validations
    }
    /**
     * Reload an Asterisk module.
     *
     * 
     */
    @Test
    public void reloadAsteriskModuleTest() {
        String moduleName = null;
        // Void response = api.reloadAsteriskModule(moduleName);

        // TODO: test validations
    }
    /**
     * Remove a channel from a bridge.
     *
     * 
     */
    @Test
    public void removeChannelFromBridgeTest() {
        String bridgeId = null;
        List<String> channel = null;
        // Void response = api.removeChannelFromBridge(bridgeId, channel);

        // TODO: test validations
    }
    /**
     * Indicate ringing to a channel.
     *
     * 
     */
    @Test
    public void ringChannelTest() {
        String channelId = null;
        // Void response = api.ringChannel(channelId);

        // TODO: test validations
    }
    /**
     * Stop ringing indication on a channel if locally generated.
     *
     * 
     */
    @Test
    public void ringChannelStopTest() {
        String channelId = null;
        // Void response = api.ringChannelStop(channelId);

        // TODO: test validations
    }
    /**
     * Rotates a log channel.
     *
     * 
     */
    @Test
    public void rotateAsteriskLogChannelTest() {
        String logChannelName = null;
        // Void response = api.rotateAsteriskLogChannel(logChannelName);

        // TODO: test validations
    }
    /**
     * Send provided DTMF to a given channel.
     *
     * 
     */
    @Test
    public void sendChannelDTMFTest() {
        String channelId = null;
        String dtmf = null;
        Integer before = null;
        Integer between = null;
        Integer duration = null;
        Integer after = null;
        // Void response = api.sendChannelDTMF(channelId, dtmf, before, between, duration, after);

        // TODO: test validations
    }
    /**
     * Send a message to some technology URI or endpoint.
     *
     * 
     */
    @Test
    public void sendEndpointMessageTest() {
        String to = null;
        String from = null;
        String body = null;
        List<String> variables = null;
        // Void response = api.sendEndpointMessage(to, from, body, variables);

        // TODO: test validations
    }
    /**
     * Send a message to some endpoint in a technology.
     *
     * 
     */
    @Test
    public void sendEndpointMessageByTechnologyTest() {
        String tech = null;
        String resource = null;
        String from = null;
        String body = null;
        List<String> variables = null;
        // Void response = api.sendEndpointMessageByTechnology(tech, resource, from, body, variables);

        // TODO: test validations
    }
    /**
     * Set the value of a global variable.
     *
     * 
     */
    @Test
    public void setAsteriskGlobalVarTest() {
        String variable = null;
        String value = null;
        // Void response = api.setAsteriskGlobalVar(variable, value);

        // TODO: test validations
    }
    /**
     * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
     *
     * 
     */
    @Test
    public void setBridgeChannelVideoSourceTest() {
        String bridgeId = null;
        String channelId = null;
        // Void response = api.setBridgeChannelVideoSource(bridgeId, channelId);

        // TODO: test validations
    }
    /**
     * Set the value of a channel variable or function.
     *
     * 
     */
    @Test
    public void setChannelVarTest() {
        String channelId = null;
        String variable = null;
        String value = null;
        // Void response = api.setChannelVar(channelId, variable, value);

        // TODO: test validations
    }
    /**
     * Start snooping.
     *
     * Snoop (spy/whisper) on a specific channel.
     */
    @Test
    public void snoopChannelTest() {
        String channelId = null;
        String app = null;
        String spy = null;
        String whisper = null;
        String appArgs = null;
        String snoopId = null;
        // Channel response = api.snoopChannel(channelId, app, spy, whisper, appArgs, snoopId);

        // TODO: test validations
    }
    /**
     * Start snooping.
     *
     * Snoop (spy/whisper) on a specific channel.
     */
    @Test
    public void snoopChannelWithIdTest() {
        String channelId = null;
        String snoopId = null;
        String app = null;
        String spy = null;
        String whisper = null;
        String appArgs = null;
        // Channel response = api.snoopChannelWithId(channelId, snoopId, app, spy, whisper, appArgs);

        // TODO: test validations
    }
    /**
     * Play music on hold to a bridge or change the MOH class that is playing.
     *
     * 
     */
    @Test
    public void startBridgeMohTest() {
        String bridgeId = null;
        String mohClass = null;
        // Void response = api.startBridgeMoh(bridgeId, mohClass);

        // TODO: test validations
    }
    /**
     * Play music on hold to a channel.
     *
     * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
     */
    @Test
    public void startChannelMohTest() {
        String channelId = null;
        String mohClass = null;
        // Void response = api.startChannelMoh(channelId, mohClass);

        // TODO: test validations
    }
    /**
     * Play silence to a channel.
     *
     * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
     */
    @Test
    public void startChannelSilenceTest() {
        String channelId = null;
        // Void response = api.startChannelSilence(channelId);

        // TODO: test validations
    }
    /**
     * Stop playing music on hold to a bridge.
     *
     * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
     */
    @Test
    public void stopBridgeMohTest() {
        String bridgeId = null;
        // Void response = api.stopBridgeMoh(bridgeId);

        // TODO: test validations
    }
    /**
     * Stop a live recording and store it.
     *
     * 
     */
    @Test
    public void stopLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.stopLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Stop playing music on hold to a channel.
     *
     * 
     */
    @Test
    public void stopMohTest() {
        String channelId = null;
        // Void response = api.stopMoh(channelId);

        // TODO: test validations
    }
    /**
     * Stop a playback.
     *
     * 
     */
    @Test
    public void stopPlaybackTest() {
        String playbackId = null;
        // Void response = api.stopPlayback(playbackId);

        // TODO: test validations
    }
    /**
     * Stop playing silence to a channel.
     *
     * 
     */
    @Test
    public void stopSilenceTest() {
        String channelId = null;
        // Void response = api.stopSilence(channelId);

        // TODO: test validations
    }
    /**
     * Subscribe an application to a event source.
     *
     * Returns the state of the application after the subscriptions have changed
     */
    @Test
    public void subscribeToApplicationTest() {
        String applicationName = null;
        List<String> eventSource = null;
        // Application response = api.subscribeToApplication(applicationName, eventSource);

        // TODO: test validations
    }
    /**
     * Remove a channel from hold.
     *
     * 
     */
    @Test
    public void unholdTest() {
        String channelId = null;
        // Void response = api.unhold(channelId);

        // TODO: test validations
    }
    /**
     * Unload an Asterisk module.
     *
     * 
     */
    @Test
    public void unloadAsteriskModuleTest() {
        String moduleName = null;
        // Void response = api.unloadAsteriskModule(moduleName);

        // TODO: test validations
    }
    /**
     * Unmute a channel.
     *
     * 
     */
    @Test
    public void unmuteTest() {
        String channelId = null;
        String direction = null;
        // Void response = api.unmute(channelId, direction);

        // TODO: test validations
    }
    /**
     * Unmute a live recording.
     *
     * 
     */
    @Test
    public void unmuteLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.unmuteLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Unpause a live recording.
     *
     * 
     */
    @Test
    public void unpauseLiveRecordingTest() {
        String recordingName = null;
        // Void response = api.unpauseLiveRecording(recordingName);

        // TODO: test validations
    }
    /**
     * Unsubscribe an application from an event source.
     *
     * Returns the state of the application after the subscriptions have changed
     */
    @Test
    public void unsubscribeFromApplicationTest() {
        String applicationName = null;
        List<String> eventSource = null;
        // Application response = api.unsubscribeFromApplication(applicationName, eventSource);

        // TODO: test validations
    }
    /**
     * Create or update a dynamic configuration object.
     *
     * 
     */
    @Test
    public void updateAsteriskConfigObjectTest() {
        String configClass = null;
        String objectType = null;
        String id = null;
        ConfigObject fields = null;
        // List<ConfigTuple> response = api.updateAsteriskConfigObject(configClass, objectType, id, fields);

        // TODO: test validations
    }
    /**
     * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
     *
     * 
     */
    @Test
    public void updateDeviceStateTest() {
        String deviceName = null;
        String deviceState = null;
        // Void response = api.updateDeviceState(deviceName, deviceState);

        // TODO: test validations
    }
    /**
     * Change the state of a mailbox. (Note - implicitly creates the mailbox).
     *
     * 
     */
    @Test
    public void updateMailboxTest() {
        String mailboxName = null;
        Integer oldMessages = null;
        Integer newMessages = null;
        // Void response = api.updateMailbox(mailboxName, oldMessages, newMessages);

        // TODO: test validations
    }
}

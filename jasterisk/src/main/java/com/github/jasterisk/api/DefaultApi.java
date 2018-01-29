package com.github.jasterisk.api;

import com.github.jasterisk.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * Adds a log channel.
   * 
   * @param logChannelName The log channel to add (required)
   * @param _configuration levels of the log channel (required)
   * @return Call&lt;Void&gt;
   */
  @POST("asterisk/logging/{logChannelName}")
  Call<Void> addAsteriskLogChannel(
    @retrofit2.http.Path("logChannelName") String logChannelName, @retrofit2.http.Query("configuration") String _configuration
  );

  /**
   * Add a channel to a bridge.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @param channel Ids of channels to add to bridge (required)
   * @param role Channel&#39;s role in the bridge (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("bridges/{bridgeId}/addChannel")
  Call<Void> addChannelToBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("channel") CSVParams channel, @retrofit2.http.Query("role") String role
  );

  /**
   * Generate a user event.
   * 
   * @param eventName Event name (required)
   * @param application The name of the application that will receive this event (required)
   * @param source URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}/{resource}, deviceState:{deviceName} (optional)
   * @param variables The \&quot;variables\&quot; key in the body object holds custom key/value pairs to add to the user event. Ex. { \&quot;variables\&quot;: { \&quot;key\&quot;: \&quot;value\&quot; } } (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("events/user/{eventName}")
  Call<Void> addUserEvent(
    @retrofit2.http.Path("eventName") String eventName, @retrofit2.http.Query("application") String application, @retrofit2.http.Query("source") CSVParams source, @retrofit2.http.Body List<CustomVariable> variables
  );

  /**
   * Answer a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/answer")
  Call<Void> answerChannel(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Stop a live recording and discard it.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("recordings/live/{recordingName}")
  Call<Void> cancelLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bridges/{bridgeId}/videoSource")
  Call<Void> clearBridgeChannelVideoSource(
    @retrofit2.http.Path("bridgeId") String bridgeId
  );

  /**
   * Exit application; continue execution in the dialplan.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param context The context to continue to. (optional)
   * @param extension The extension to continue to. (optional)
   * @param priority The priority to continue to. (optional)
   * @param label The label to continue to - will supersede &#39;priority&#39; if both are provided. (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/continue")
  Call<Void> continueChannelInDialplan(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("context") String context, @retrofit2.http.Query("extension") String extension, @retrofit2.http.Query("priority") Integer priority, @retrofit2.http.Query("label") String label
  );

  /**
   * Control a playback.
   * 
   * @param playbackId Playback&#39;s id (required)
   * @param operation Operation to perform on the playback. (required)
   * @return Call&lt;Void&gt;
   */
  @POST("playbacks/{playbackId}/control")
  Call<Void> controlPlayback(
    @retrofit2.http.Path("playbackId") String playbackId, @retrofit2.http.Query("operation") String operation
  );

  /**
   * Copy a stored recording.
   * 
   * @param recordingName The name of the recording to copy (required)
   * @param destinationRecordingName The destination name of the recording (required)
   * @return Call&lt;StoredRecording&gt;
   */
  @POST("recordings/stored/{recordingName}/copy")
  Call<StoredRecording> copyStoredRecording(
    @retrofit2.http.Path("recordingName") String recordingName, @retrofit2.http.Query("destinationRecordingName") String destinationRecordingName
  );

  /**
   * Create a new bridge.
   * This bridge persists until it has been shut down, or Asterisk has been shut down.
   * @param type Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu). (optional)
   * @param bridgeId Unique ID to give to the bridge being created. (optional)
   * @param name Name to give to the bridge being created. (optional)
   * @return Call&lt;Bridge&gt;
   */
  @POST("bridges")
  Call<Bridge> createBridge(
    @retrofit2.http.Query("type") String type, @retrofit2.http.Query("bridgeId") String bridgeId, @retrofit2.http.Query("name") String name
  );

  /**
   * Create channel.
   * 
   * @param endpoint Endpoint for channel communication (required)
   * @param app Stasis Application to place channel into (required)
   * @param appArgs The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. (optional)
   * @param channelId The unique id to assign the channel on creation. (optional)
   * @param otherChannelId The unique id to assign the second channel when using local channels. (optional)
   * @param originator Unique ID of the calling channel (optional)
   * @param formats The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. (optional)
   * @return Call&lt;Channel&gt;
   */
  @POST("channels/create")
  Call<Channel> createChannel(
    @retrofit2.http.Query("endpoint") String endpoint, @retrofit2.http.Query("app") String app, @retrofit2.http.Query("appArgs") String appArgs, @retrofit2.http.Query("channelId") String channelId, @retrofit2.http.Query("otherChannelId") String otherChannelId, @retrofit2.http.Query("originator") String originator, @retrofit2.http.Query("formats") String formats
  );

  /**
   * Create a new bridge or updates an existing one.
   * This bridge persists until it has been shut down, or Asterisk has been shut down.
   * @param bridgeId Unique ID to give to the bridge being created. (required)
   * @param type Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set. (optional)
   * @param name Set the name of the bridge. (optional)
   * @return Call&lt;Bridge&gt;
   */
  @POST("bridges/{bridgeId}")
  Call<Bridge> createOrUpdateBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("type") String type, @retrofit2.http.Query("name") String name
  );

  /**
   * Delete a dynamic configuration object.
   * 
   * @param configClass The configuration class containing dynamic configuration objects. (required)
   * @param objectType The type of configuration object to delete. (required)
   * @param id The unique identifier of the object to delete. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("asterisk/config/dynamic/{configClass}/{objectType}/{id}")
  Call<Void> deleteAsteriskConfigObject(
    @retrofit2.http.Path("configClass") String configClass, @retrofit2.http.Path("objectType") String objectType, @retrofit2.http.Path("id") String id
  );

  /**
   * Deletes a log channel.
   * 
   * @param logChannelName Log channels name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("asterisk/logging/{logChannelName}")
  Call<Void> deleteAsteriskLogChannel(
    @retrofit2.http.Path("logChannelName") String logChannelName
  );

  /**
   * Shut down a bridge.
   * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
   * @param bridgeId Bridge&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bridges/{bridgeId}")
  Call<Void> deleteBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId
  );

  /**
   * Destroy a device-state controlled by ARI.
   * 
   * @param deviceName Name of the device (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("deviceStates/{deviceName}")
  Call<Void> deleteDeviceState(
    @retrofit2.http.Path("deviceName") String deviceName
  );

  /**
   * Destroy a mailbox.
   * 
   * @param mailboxName Name of the mailbox (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("mailboxes/{mailboxName}")
  Call<Void> deleteMailbox(
    @retrofit2.http.Path("mailboxName") String mailboxName
  );

  /**
   * Delete a stored recording.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("recordings/stored/{recordingName}")
  Call<Void> deleteStoredRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Dial a created channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param caller Channel ID of caller (optional)
   * @param timeout Dial timeout (optional, default to 0)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/dial")
  Call<Void> dialChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("caller") String caller, @retrofit2.http.Query("timeout") Integer timeout
  );

  /**
   * WebSocket connection for events.
   * 
   * @param app Applications to subscribe to. (required)
   * @param subscribeAll Subscribe to all Asterisk events. If provided, the applications listed will be subscribed to all events, effectively disabling the application specific subscriptions. Default is &#39;false&#39;. (optional)
   * @return Call&lt;Message&gt;
   */
  @GET("events")
  Call<Message> eventWebsocket(
    @retrofit2.http.Query("app") CSVParams app, @retrofit2.http.Query("subscribeAll") Boolean subscribeAll
  );

  /**
   * Get details of an application.
   * 
   * @param applicationName Application&#39;s name (required)
   * @return Call&lt;Application&gt;
   */
  @GET("applications/{applicationName}")
  Call<Application> getApplication(
    @retrofit2.http.Path("applicationName") String applicationName
  );

  /**
   * List all applications.
   * 
   * @return Call&lt;List&lt;Application&gt;&gt;
   */
  @GET("applications")
  Call<List<Application>> getApplications();
    

  /**
   * Retrieve a dynamic configuration object.
   * 
   * @param configClass The configuration class containing dynamic configuration objects. (required)
   * @param objectType The type of configuration object to retrieve. (required)
   * @param id The unique identifier of the object to retrieve. (required)
   * @return Call&lt;List&lt;ConfigTuple&gt;&gt;
   */
  @GET("asterisk/config/dynamic/{configClass}/{objectType}/{id}")
  Call<List<ConfigTuple>> getAsteriskConfigObject(
    @retrofit2.http.Path("configClass") String configClass, @retrofit2.http.Path("objectType") String objectType, @retrofit2.http.Path("id") String id
  );

  /**
   * Get the value of a global variable.
   * 
   * @param variable The variable to get (required)
   * @return Call&lt;Variable&gt;
   */
  @GET("asterisk/variable")
  Call<Variable> getAsteriskGlobalVar(
    @retrofit2.http.Query("variable") String variable
  );

  /**
   * Gets Asterisk system information.
   * 
   * @param only Filter information returned (optional)
   * @return Call&lt;AsteriskInfo&gt;
   */
  @GET("asterisk/info")
  Call<AsteriskInfo> getAsteriskInfo(
    @retrofit2.http.Query("only") CSVParams only
  );

  /**
   * Gets Asterisk log channel information.
   * 
   * @return Call&lt;List&lt;LogChannel&gt;&gt;
   */
  @GET("asterisk/logging")
  Call<List<LogChannel>> getAsteriskLogChannels();
    

  /**
   * Get Asterisk module information.
   * 
   * @param moduleName Module&#39;s name (required)
   * @return Call&lt;Module&gt;
   */
  @GET("asterisk/modules/{moduleName}")
  Call<Module> getAsteriskModule(
    @retrofit2.http.Path("moduleName") String moduleName
  );

  /**
   * List Asterisk modules.
   * 
   * @return Call&lt;List&lt;Module&gt;&gt;
   */
  @GET("asterisk/modules")
  Call<List<Module>> getAsteriskModules();
    

  /**
   * Get bridge details.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @return Call&lt;Bridge&gt;
   */
  @GET("bridges/{bridgeId}")
  Call<Bridge> getBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId
  );

  /**
   * List all active bridges in Asterisk.
   * 
   * @return Call&lt;List&lt;Bridge&gt;&gt;
   */
  @GET("bridges")
  Call<List<Bridge>> getBridges();
    

  /**
   * Channel details.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Channel&gt;
   */
  @GET("channels/{channelId}")
  Call<Channel> getChannel(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Get the value of a channel variable or function.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param variable The channel variable or function to get (required)
   * @return Call&lt;Variable&gt;
   */
  @GET("channels/{channelId}/variable")
  Call<Variable> getChannelVar(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("variable") String variable
  );

  /**
   * List all active channels in Asterisk.
   * 
   * @return Call&lt;List&lt;Channel&gt;&gt;
   */
  @GET("channels")
  Call<List<Channel>> getChannels();
    

  /**
   * Retrieve the current state of a device.
   * 
   * @param deviceName Name of the device (required)
   * @return Call&lt;DeviceState&gt;
   */
  @GET("deviceStates/{deviceName}")
  Call<DeviceState> getDeviceState(
    @retrofit2.http.Path("deviceName") String deviceName
  );

  /**
   * List all ARI controlled device states.
   * 
   * @return Call&lt;List&lt;DeviceState&gt;&gt;
   */
  @GET("deviceStates")
  Call<List<DeviceState>> getDeviceStates();
    

  /**
   * Details for an endpoint.
   * 
   * @param tech Technology of the endpoint (required)
   * @param resource ID of the endpoint (required)
   * @return Call&lt;Endpoint&gt;
   */
  @GET("endpoints/{tech}/{resource}")
  Call<Endpoint> getEndpoint(
    @retrofit2.http.Path("tech") String tech, @retrofit2.http.Path("resource") String resource
  );

  /**
   * List all endpoints.
   * 
   * @return Call&lt;List&lt;Endpoint&gt;&gt;
   */
  @GET("endpoints")
  Call<List<Endpoint>> getEndpoints();
    

  /**
   * List available endoints for a given endpoint technology.
   * 
   * @param tech Technology of the endpoints (sip,iax2,...) (required)
   * @return Call&lt;List&lt;Endpoint&gt;&gt;
   */
  @GET("endpoints/{tech}")
  Call<List<Endpoint>> getEndpointsByTech(
    @retrofit2.http.Path("tech") String tech
  );

  /**
   * List live recordings.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;LiveRecording&gt;
   */
  @GET("recordings/live/{recordingName}")
  Call<LiveRecording> getLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Retrieve the current state of a mailbox.
   * 
   * @param mailboxName Name of the mailbox (required)
   * @return Call&lt;Mailbox&gt;
   */
  @GET("mailboxes/{mailboxName}")
  Call<Mailbox> getMailbox(
    @retrofit2.http.Path("mailboxName") String mailboxName
  );

  /**
   * List all mailboxes.
   * 
   * @return Call&lt;List&lt;Mailbox&gt;&gt;
   */
  @GET("mailboxes")
  Call<List<Mailbox>> getMailboxes();
    

  /**
   * Get a playback&#39;s details.
   * 
   * @param playbackId Playback&#39;s id (required)
   * @return Call&lt;Playback&gt;
   */
  @GET("playbacks/{playbackId}")
  Call<Playback> getPlayback(
    @retrofit2.http.Path("playbackId") String playbackId
  );

  /**
   * Get a sound&#39;s details.
   * 
   * @param soundId Sound&#39;s id (required)
   * @return Call&lt;Sound&gt;
   */
  @GET("sounds/{soundId}")
  Call<Sound> getSound(
    @retrofit2.http.Path("soundId") String soundId
  );

  /**
   * List all sounds.
   * 
   * @param lang Lookup sound for a specific language. (optional)
   * @param format Lookup sound in a specific format. (optional)
   * @return Call&lt;List&lt;Sound&gt;&gt;
   */
  @GET("sounds")
  Call<List<Sound>> getSounds(
    @retrofit2.http.Query("lang") String lang, @retrofit2.http.Query("format") String format
  );

  /**
   * Get a stored recording&#39;s details.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;StoredRecording&gt;
   */
  @GET("recordings/stored/{recordingName}")
  Call<StoredRecording> getStoredRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Get the file associated with the stored recording.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;byte[]&gt;
   */
  @GET("recordings/stored/{recordingName}/file")
  Call<byte[]> getStoredRecordingFile(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * List recordings that are complete.
   * 
   * @return Call&lt;List&lt;StoredRecording&gt;&gt;
   */
  @GET("recordings/stored")
  Call<List<StoredRecording>> getStoredRecordings();
    

  /**
   * Delete (i.e. hangup) a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param reason Reason for hanging up the channel (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}")
  Call<Void> hangupChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("reason") String reason
  );

  /**
   * Hold a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/hold")
  Call<Void> holdChannel(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Load an Asterisk module.
   * 
   * @param moduleName Module&#39;s name (required)
   * @return Call&lt;Void&gt;
   */
  @POST("asterisk/modules/{moduleName}")
  Call<Void> loadAsteriskModule(
    @retrofit2.http.Path("moduleName") String moduleName
  );

  /**
   * Mute a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param direction Direction in which to mute audio (optional, default to both)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/mute")
  Call<Void> muteChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("direction") String direction
  );

  /**
   * Mute a live recording.
   * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @POST("recordings/live/{recordingName}/mute")
  Call<Void> muteLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Create a new channel (originate).
   * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
   * @param endpoint Endpoint to call. (required)
   * @param extension The extension to dial after the endpoint answers. Mutually exclusive with &#39;app&#39;. (optional)
   * @param context The context to dial after the endpoint answers. If omitted, uses &#39;default&#39;. Mutually exclusive with &#39;app&#39;. (optional)
   * @param priority The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with &#39;app&#39;. (optional)
   * @param label The label to dial after the endpoint answers. Will supersede &#39;priority&#39; if provided. Mutually exclusive with &#39;app&#39;. (optional)
   * @param app The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. (optional)
   * @param appArgs The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. (optional)
   * @param callerId CallerID to use when dialing the endpoint or extension. (optional)
   * @param timeout Timeout (in seconds) before giving up dialing, or -1 for no timeout. (optional, default to 30)
   * @param variables The \&quot;variables\&quot; key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \&quot;endpoint\&quot;: \&quot;SIP/Alice\&quot;, \&quot;variables\&quot;: { \&quot;CALLERID(name)\&quot;: \&quot;Alice\&quot; } } (optional)
   * @param channelId The unique id to assign the channel on creation. (optional)
   * @param otherChannelId The unique id to assign the second channel when using local channels. (optional)
   * @param originator The unique id of the channel which is originating this one. (optional)
   * @param formats The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. (optional)
   * @return Call&lt;Channel&gt;
   */
  @POST("channels")
  Call<Channel> originateChannel(
    @retrofit2.http.Query("endpoint") String endpoint, @retrofit2.http.Query("extension") String extension, @retrofit2.http.Query("context") String context, @retrofit2.http.Query("priority") Long priority, @retrofit2.http.Query("label") String label, @retrofit2.http.Query("app") String app, @retrofit2.http.Query("appArgs") String appArgs, @retrofit2.http.Query("callerId") String callerId, @retrofit2.http.Query("timeout") Integer timeout, @retrofit2.http.Body List<VariableTuple> variables, @retrofit2.http.Query("channelId") String channelId, @retrofit2.http.Query("otherChannelId") String otherChannelId, @retrofit2.http.Query("originator") String originator, @retrofit2.http.Query("formats") String formats
  );

  /**
   * Create a new channel (originate with id).
   * The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.
   * @param channelId The unique id to assign the channel on creation. (required)
   * @param endpoint Endpoint to call. (required)
   * @param extension The extension to dial after the endpoint answers. Mutually exclusive with &#39;app&#39;. (optional)
   * @param context The context to dial after the endpoint answers. If omitted, uses &#39;default&#39;. Mutually exclusive with &#39;app&#39;. (optional)
   * @param priority The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with &#39;app&#39;. (optional)
   * @param label The label to dial after the endpoint answers. Will supersede &#39;priority&#39; if provided. Mutually exclusive with &#39;app&#39;. (optional)
   * @param app The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. (optional)
   * @param appArgs The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. (optional)
   * @param callerId CallerID to use when dialing the endpoint or extension. (optional)
   * @param timeout Timeout (in seconds) before giving up dialing, or -1 for no timeout. (optional, default to 30)
   * @param variables The \&quot;variables\&quot; key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \&quot;endpoint\&quot;: \&quot;SIP/Alice\&quot;, \&quot;variables\&quot;: { \&quot;CALLERID(name)\&quot;: \&quot;Alice\&quot; } } (optional)
   * @param otherChannelId The unique id to assign the second channel when using local channels. (optional)
   * @param originator The unique id of the channel which is originating this one. (optional)
   * @param formats The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. (optional)
   * @return Call&lt;Channel&gt;
   */
  @POST("channels/{channelId}")
  Call<Channel> originateChannelWithId(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("endpoint") String endpoint, @retrofit2.http.Query("extension") String extension, @retrofit2.http.Query("context") String context, @retrofit2.http.Query("priority") Long priority, @retrofit2.http.Query("label") String label, @retrofit2.http.Query("app") String app, @retrofit2.http.Query("appArgs") String appArgs, @retrofit2.http.Query("callerId") String callerId, @retrofit2.http.Query("timeout") Integer timeout, @retrofit2.http.Body List<VariableTuple> variables, @retrofit2.http.Query("otherChannelId") String otherChannelId, @retrofit2.http.Query("originator") String originator, @retrofit2.http.Query("formats") String formats
  );

  /**
   * Pause a live recording.
   * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @POST("recordings/live/{recordingName}/pause")
  Call<Void> pauseLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Start playback of media on a bridge.
   * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
   * @param bridgeId Bridge&#39;s id (required)
   * @param media Media URIs to play. (required)
   * @param lang For sounds, selects language for sound. (optional)
   * @param offsetms Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. (optional, default to 0)
   * @param skipms Number of milliseconds to skip for forward/reverse operations. (optional, default to 3000)
   * @param playbackId Playback Id. (optional)
   * @return Call&lt;Playback&gt;
   */
  @POST("bridges/{bridgeId}/play")
  Call<Playback> playBridgeMedia(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("media") CSVParams media, @retrofit2.http.Query("lang") String lang, @retrofit2.http.Query("offsetms") Integer offsetms, @retrofit2.http.Query("skipms") Integer skipms, @retrofit2.http.Query("playbackId") String playbackId
  );

  /**
   * Start playback of media on a bridge.
   * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
   * @param bridgeId Bridge&#39;s id (required)
   * @param playbackId Playback ID. (required)
   * @param media Media URIs to play. (required)
   * @param lang For sounds, selects language for sound. (optional)
   * @param offsetms Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. (optional, default to 0)
   * @param skipms Number of milliseconds to skip for forward/reverse operations. (optional, default to 3000)
   * @return Call&lt;Playback&gt;
   */
  @POST("bridges/{bridgeId}/play/{playbackId}")
  Call<Playback> playBridgeMediaWithId(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Path("playbackId") String playbackId, @retrofit2.http.Query("media") CSVParams media, @retrofit2.http.Query("lang") String lang, @retrofit2.http.Query("offsetms") Integer offsetms, @retrofit2.http.Query("skipms") Integer skipms
  );

  /**
   * Start playback of media.
   * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
   * @param channelId Channel&#39;s id (required)
   * @param media Media URIs to play. (required)
   * @param lang For sounds, selects language for sound. (optional)
   * @param offsetms Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. (optional)
   * @param skipms Number of milliseconds to skip for forward/reverse operations. (optional, default to 3000)
   * @param playbackId Playback ID. (optional)
   * @return Call&lt;Playback&gt;
   */
  @POST("channels/{channelId}/play")
  Call<Playback> playChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("media") CSVParams media, @retrofit2.http.Query("lang") String lang, @retrofit2.http.Query("offsetms") Integer offsetms, @retrofit2.http.Query("skipms") Integer skipms, @retrofit2.http.Query("playbackId") String playbackId
  );

  /**
   * Start playback of media and specify the playbackId.
   * The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
   * @param channelId Channel&#39;s id (required)
   * @param playbackId Playback ID. (required)
   * @param media Media URIs to play. (required)
   * @param lang For sounds, selects language for sound. (optional)
   * @param offsetms Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. (optional)
   * @param skipms Number of milliseconds to skip for forward/reverse operations. (optional, default to 3000)
   * @return Call&lt;Playback&gt;
   */
  @POST("channels/{channelId}/play/{playbackId}")
  Call<Playback> playChannelWithId(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Path("playbackId") String playbackId, @retrofit2.http.Query("media") CSVParams media, @retrofit2.http.Query("lang") String lang, @retrofit2.http.Query("offsetms") Integer offsetms, @retrofit2.http.Query("skipms") Integer skipms
  );

  /**
   * Start a recording.
   * This records the mixed audio from all channels participating in this bridge.
   * @param bridgeId Bridge&#39;s id (required)
   * @param name Recording&#39;s filename (required)
   * @param format Format to encode audio in (required)
   * @param maxDurationSeconds Maximum duration of the recording, in seconds. 0 for no limit. (optional, default to 0)
   * @param maxSilenceSeconds Maximum duration of silence, in seconds. 0 for no limit. (optional, default to 0)
   * @param ifExists Action to take if a recording with the same name already exists. (optional, default to fail)
   * @param beep Play beep when recording begins (optional, default to false)
   * @param terminateOn DTMF input to terminate recording. (optional, default to none)
   * @return Call&lt;LiveRecording&gt;
   */
  @POST("bridges/{bridgeId}/record")
  Call<LiveRecording> recordBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("maxDurationSeconds") Integer maxDurationSeconds, @retrofit2.http.Query("maxSilenceSeconds") Integer maxSilenceSeconds, @retrofit2.http.Query("ifExists") String ifExists, @retrofit2.http.Query("beep") Boolean beep, @retrofit2.http.Query("terminateOn") String terminateOn
  );

  /**
   * Start a recording.
   * Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that&#39;s what you want.
   * @param channelId Channel&#39;s id (required)
   * @param name Recording&#39;s filename (required)
   * @param format Format to encode audio in (required)
   * @param maxDurationSeconds Maximum duration of the recording, in seconds. 0 for no limit (optional, default to 0)
   * @param maxSilenceSeconds Maximum duration of silence, in seconds. 0 for no limit (optional, default to 0)
   * @param ifExists Action to take if a recording with the same name already exists. (optional, default to fail)
   * @param beep Play beep when recording begins (optional, default to false)
   * @param terminateOn DTMF input to terminate recording (optional, default to none)
   * @return Call&lt;LiveRecording&gt;
   */
  @POST("channels/{channelId}/record")
  Call<LiveRecording> recordChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("maxDurationSeconds") Integer maxDurationSeconds, @retrofit2.http.Query("maxSilenceSeconds") Integer maxSilenceSeconds, @retrofit2.http.Query("ifExists") String ifExists, @retrofit2.http.Query("beep") Boolean beep, @retrofit2.http.Query("terminateOn") String terminateOn
  );

  /**
   * Redirect the channel to a different location.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param endpoint The endpoint to redirect the channel to (required)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/redirect")
  Call<Void> redirectChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("endpoint") String endpoint
  );

  /**
   * Reload an Asterisk module.
   * 
   * @param moduleName Module&#39;s name (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("asterisk/modules/{moduleName}")
  Call<Void> reloadAsteriskModule(
    @retrofit2.http.Path("moduleName") String moduleName
  );

  /**
   * Remove a channel from a bridge.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @param channel Ids of channels to remove from bridge (required)
   * @return Call&lt;Void&gt;
   */
  @POST("bridges/{bridgeId}/removeChannel")
  Call<Void> removeChannelFromBridge(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("channel") CSVParams channel
  );

  /**
   * Rotates a log channel.
   * 
   * @param logChannelName Log channel&#39;s name (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("asterisk/logging/{logChannelName}/rotate")
  Call<Void> rotateAsteriskLogChannel(
    @retrofit2.http.Path("logChannelName") String logChannelName
  );

  /**
   * Send provided DTMF to a given channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param dtmf DTMF To send. (optional)
   * @param before Amount of time to wait before DTMF digits (specified in milliseconds) start. (optional, default to 0)
   * @param between Amount of time in between DTMF digits (specified in milliseconds). (optional, default to 100)
   * @param duration Length of each DTMF digit (specified in milliseconds). (optional, default to 100)
   * @param after Amount of time to wait after DTMF digits (specified in milliseconds) end. (optional, default to 0)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/dtmf")
  Call<Void> sendChannelDTMF(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("dtmf") String dtmf, @retrofit2.http.Query("before") Integer before, @retrofit2.http.Query("between") Integer between, @retrofit2.http.Query("duration") Integer duration, @retrofit2.http.Query("after") Integer after
  );

  /**
   * Send a message to some technology URI or endpoint.
   * 
   * @param to The endpoint resource or technology specific URI to send the message to. Valid resources are sip, pjsip, and xmpp. (required)
   * @param from The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp. (required)
   * @param body The body of the message (optional)
   * @param variables The \&quot;variables\&quot; key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects. (optional)
   * @return Call&lt;Void&gt;
   */
  @PUT("endpoints/sendMessage")
  Call<Void> sendEndpointMessage(
    @retrofit2.http.Query("to") String to, @retrofit2.http.Query("from") String from, @retrofit2.http.Query("body") String body, @retrofit2.http.Body List<String> variables
  );

  /**
   * Send a message to some endpoint in a technology.
   * 
   * @param tech Technology of the endpoint (required)
   * @param resource ID of the endpoint (required)
   * @param from The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp. (required)
   * @param body The body of the message (optional)
   * @param variables The \&quot;variables\&quot; key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects. (optional)
   * @return Call&lt;Void&gt;
   */
  @PUT("endpoints/{tech}/{resource}/sendMessage")
  Call<Void> sendEndpointMessageByTechnology(
    @retrofit2.http.Path("tech") String tech, @retrofit2.http.Path("resource") String resource, @retrofit2.http.Query("from") String from, @retrofit2.http.Query("body") String body, @retrofit2.http.Body List<String> variables
  );

  /**
   * Set the value of a global variable.
   * 
   * @param variable The variable to set (required)
   * @param value The value to set the variable to (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("asterisk/variable")
  Call<Void> setAsteriskGlobalVar(
    @retrofit2.http.Query("variable") String variable, @retrofit2.http.Query("value") String value
  );

  /**
   * Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @POST("bridges/{bridgeId}/videoSource/{channelId}")
  Call<Void> setBridgeChannelVideoSource(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Set the value of a channel variable or function.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param variable The channel variable or function to set (required)
   * @param value The value to set the variable to (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/variable")
  Call<Void> setChannelVar(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("variable") String variable, @retrofit2.http.Query("value") String value
  );

  /**
   * Start snooping.
   * Snoop (spy/whisper) on a specific channel.
   * @param channelId Channel&#39;s id (required)
   * @param app Application the snooping channel is placed into (required)
   * @param spy Direction of audio to spy on (optional, default to none)
   * @param whisper Direction of audio to whisper into (optional, default to none)
   * @param appArgs The application arguments to pass to the Stasis application (optional)
   * @param snoopId Unique ID to assign to snooping channel (optional)
   * @return Call&lt;Channel&gt;
   */
  @POST("channels/{channelId}/snoop")
  Call<Channel> snoopChannel(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("app") String app, @retrofit2.http.Query("spy") String spy, @retrofit2.http.Query("whisper") String whisper, @retrofit2.http.Query("appArgs") String appArgs, @retrofit2.http.Query("snoopId") String snoopId
  );

  /**
   * Start snooping.
   * Snoop (spy/whisper) on a specific channel.
   * @param channelId Channel&#39;s id (required)
   * @param snoopId Unique ID to assign to snooping channel (required)
   * @param app Application the snooping channel is placed into (required)
   * @param spy Direction of audio to spy on (optional, default to none)
   * @param whisper Direction of audio to whisper into (optional, default to none)
   * @param appArgs The application arguments to pass to the Stasis application (optional)
   * @return Call&lt;Channel&gt;
   */
  @POST("channels/{channelId}/snoop/{snoopId}")
  Call<Channel> snoopChannelWithId(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Path("snoopId") String snoopId, @retrofit2.http.Query("app") String app, @retrofit2.http.Query("spy") String spy, @retrofit2.http.Query("whisper") String whisper, @retrofit2.http.Query("appArgs") String appArgs
  );

  /**
   * Play music on hold to a bridge or change the MOH class that is playing.
   * 
   * @param bridgeId Bridge&#39;s id (required)
   * @param mohClass Channel&#39;s id (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("bridges/{bridgeId}/moh")
  Call<Void> startBridgeMoh(
    @retrofit2.http.Path("bridgeId") String bridgeId, @retrofit2.http.Query("mohClass") String mohClass
  );

  /**
   * Play music on hold to a channel.
   * Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.
   * @param channelId Channel&#39;s id (required)
   * @param mohClass Music on hold class to use (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/moh")
  Call<Void> startChannelMoh(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("mohClass") String mohClass
  );

  /**
   * Indicate ringing to a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/ring")
  Call<Void> startChannelRing(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Play silence to a channel.
   * Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @POST("channels/{channelId}/silence")
  Call<Void> startChannelSilence(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Stop playing music on hold to a bridge.
   * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
   * @param bridgeId Bridge&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("bridges/{bridgeId}/moh")
  Call<Void> stopBridgeMoh(
    @retrofit2.http.Path("bridgeId") String bridgeId
  );

  /**
   * Stop playing music on hold to a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}/moh")
  Call<Void> stopChannelMoh(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Stop ringing indication on a channel if locally generated.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}/ring")
  Call<Void> stopChannelRing(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Stop playing silence to a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}/silence")
  Call<Void> stopChannelSilence(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Stop a live recording and store it.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @POST("recordings/live/{recordingName}/stop")
  Call<Void> stopLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Stop a playback.
   * 
   * @param playbackId Playback&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("playbacks/{playbackId}")
  Call<Void> stopPlayback(
    @retrofit2.http.Path("playbackId") String playbackId
  );

  /**
   * Subscribe an application to a event source.
   * Returns the state of the application after the subscriptions have changed
   * @param applicationName Application&#39;s name (required)
   * @param eventSource URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName} (required)
   * @return Call&lt;Application&gt;
   */
  @POST("applications/{applicationName}/subscription")
  Call<Application> subscribeToApplication(
    @retrofit2.http.Path("applicationName") String applicationName, @retrofit2.http.Query("eventSource") CSVParams eventSource
  );

  /**
   * Remove a channel from hold.
   * 
   * @param channelId Channel&#39;s id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}/hold")
  Call<Void> unhold(
    @retrofit2.http.Path("channelId") String channelId
  );

  /**
   * Unload an Asterisk module.
   * 
   * @param moduleName Module&#39;s name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("asterisk/modules/{moduleName}")
  Call<Void> unloadAsteriskModule(
    @retrofit2.http.Path("moduleName") String moduleName
  );

  /**
   * Unmute a channel.
   * 
   * @param channelId Channel&#39;s id (required)
   * @param direction Direction in which to unmute audio (optional, default to both)
   * @return Call&lt;Void&gt;
   */
  @DELETE("channels/{channelId}/mute")
  Call<Void> unmute(
    @retrofit2.http.Path("channelId") String channelId, @retrofit2.http.Query("direction") String direction
  );

  /**
   * Unmute a live recording.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("recordings/live/{recordingName}/mute")
  Call<Void> unmuteLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Unpause a live recording.
   * 
   * @param recordingName The name of the recording (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("recordings/live/{recordingName}/pause")
  Call<Void> unpauseLiveRecording(
    @retrofit2.http.Path("recordingName") String recordingName
  );

  /**
   * Unsubscribe an application from an event source.
   * Returns the state of the application after the subscriptions have changed
   * @param applicationName Application&#39;s name (required)
   * @param eventSource URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName} (required)
   * @return Call&lt;Application&gt;
   */
  @DELETE("applications/{applicationName}/subscription")
  Call<Application> unsubscribeFromApplication(
    @retrofit2.http.Path("applicationName") String applicationName, @retrofit2.http.Query("eventSource") CSVParams eventSource
  );

  /**
   * Create or update a dynamic configuration object.
   * 
   * @param configClass The configuration class containing dynamic configuration objects. (required)
   * @param objectType The type of configuration object to create or update. (required)
   * @param id The unique identifier of the object to create or update. (required)
   * @param fields The body object should have a value that is a list of ConfigTuples, which provide the fields to update. Ex. [ { \&quot;attribute\&quot;: \&quot;directmedia\&quot;, \&quot;value\&quot;: \&quot;false\&quot; } ] (optional)
   * @return Call&lt;List&lt;ConfigTuple&gt;&gt;
   */
  @PUT("asterisk/config/dynamic/{configClass}/{objectType}/{id}")
  Call<List<ConfigTuple>> updateAsteriskConfigObject(
    @retrofit2.http.Path("configClass") String configClass, @retrofit2.http.Path("objectType") String objectType, @retrofit2.http.Path("id") String id, @retrofit2.http.Body ConfigObject fields
  );

  /**
   * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
   * 
   * @param deviceName Name of the device (required)
   * @param deviceState Device state value (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("deviceStates/{deviceName}")
  Call<Void> updateDeviceState(
    @retrofit2.http.Path("deviceName") String deviceName, @retrofit2.http.Query("deviceState") String deviceState
  );

  /**
   * Change the state of a mailbox. (Note - implicitly creates the mailbox).
   * 
   * @param mailboxName Name of the mailbox (required)
   * @param oldMessages Count of old messages in the mailbox (required)
   * @param newMessages Count of new messages in the mailbox (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("mailboxes/{mailboxName}")
  Call<Void> updateMailbox(
    @retrofit2.http.Path("mailboxName") String mailboxName, @retrofit2.http.Query("oldMessages") Integer oldMessages, @retrofit2.http.Query("newMessages") Integer newMessages
  );

}

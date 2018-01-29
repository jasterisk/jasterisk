# DefaultApi

All URIs are relative to *http://localhost:8088/ari*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAsteriskLogChannel**](DefaultApi.md#addAsteriskLogChannel) | **POST** asterisk/logging/{logChannelName} | Adds a log channel.
[**addChannelToBridge**](DefaultApi.md#addChannelToBridge) | **POST** bridges/{bridgeId}/addChannel | Add a channel to a bridge.
[**addUserEvent**](DefaultApi.md#addUserEvent) | **POST** events/user/{eventName} | Generate a user event.
[**answerChannel**](DefaultApi.md#answerChannel) | **POST** channels/{channelId}/answer | Answer a channel.
[**cancelLiveRecording**](DefaultApi.md#cancelLiveRecording) | **DELETE** recordings/live/{recordingName} | Stop a live recording and discard it.
[**clearBridgeChannelVideoSource**](DefaultApi.md#clearBridgeChannelVideoSource) | **DELETE** bridges/{bridgeId}/videoSource | Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.
[**continueChannelInDialplan**](DefaultApi.md#continueChannelInDialplan) | **POST** channels/{channelId}/continue | Exit application; continue execution in the dialplan.
[**controlPlayback**](DefaultApi.md#controlPlayback) | **POST** playbacks/{playbackId}/control | Control a playback.
[**copyStoredRecording**](DefaultApi.md#copyStoredRecording) | **POST** recordings/stored/{recordingName}/copy | Copy a stored recording.
[**createBridge**](DefaultApi.md#createBridge) | **POST** bridges | Create a new bridge.
[**createChannel**](DefaultApi.md#createChannel) | **POST** channels/create | Create channel.
[**createOrUpdateBridge**](DefaultApi.md#createOrUpdateBridge) | **POST** bridges/{bridgeId} | Create a new bridge or updates an existing one.
[**deleteAsteriskConfigObject**](DefaultApi.md#deleteAsteriskConfigObject) | **DELETE** asterisk/config/dynamic/{configClass}/{objectType}/{id} | Delete a dynamic configuration object.
[**deleteAsteriskLogChannel**](DefaultApi.md#deleteAsteriskLogChannel) | **DELETE** asterisk/logging/{logChannelName} | Deletes a log channel.
[**deleteBridge**](DefaultApi.md#deleteBridge) | **DELETE** bridges/{bridgeId} | Shut down a bridge.
[**deleteDeviceState**](DefaultApi.md#deleteDeviceState) | **DELETE** deviceStates/{deviceName} | Destroy a device-state controlled by ARI.
[**deleteMailbox**](DefaultApi.md#deleteMailbox) | **DELETE** mailboxes/{mailboxName} | Destroy a mailbox.
[**deleteStoredRecording**](DefaultApi.md#deleteStoredRecording) | **DELETE** recordings/stored/{recordingName} | Delete a stored recording.
[**dialChannel**](DefaultApi.md#dialChannel) | **POST** channels/{channelId}/dial | Dial a created channel.
[**eventWebsocket**](DefaultApi.md#eventWebsocket) | **GET** events | WebSocket connection for events.
[**getApplication**](DefaultApi.md#getApplication) | **GET** applications/{applicationName} | Get details of an application.
[**getApplications**](DefaultApi.md#getApplications) | **GET** applications | List all applications.
[**getAsteriskConfigObject**](DefaultApi.md#getAsteriskConfigObject) | **GET** asterisk/config/dynamic/{configClass}/{objectType}/{id} | Retrieve a dynamic configuration object.
[**getAsteriskGlobalVar**](DefaultApi.md#getAsteriskGlobalVar) | **GET** asterisk/variable | Get the value of a global variable.
[**getAsteriskInfo**](DefaultApi.md#getAsteriskInfo) | **GET** asterisk/info | Gets Asterisk system information.
[**getAsteriskLogChannels**](DefaultApi.md#getAsteriskLogChannels) | **GET** asterisk/logging | Gets Asterisk log channel information.
[**getAsteriskModule**](DefaultApi.md#getAsteriskModule) | **GET** asterisk/modules/{moduleName} | Get Asterisk module information.
[**getAsteriskModules**](DefaultApi.md#getAsteriskModules) | **GET** asterisk/modules | List Asterisk modules.
[**getBridge**](DefaultApi.md#getBridge) | **GET** bridges/{bridgeId} | Get bridge details.
[**getBridges**](DefaultApi.md#getBridges) | **GET** bridges | List all active bridges in Asterisk.
[**getChannel**](DefaultApi.md#getChannel) | **GET** channels/{channelId} | Channel details.
[**getChannelVar**](DefaultApi.md#getChannelVar) | **GET** channels/{channelId}/variable | Get the value of a channel variable or function.
[**getChannels**](DefaultApi.md#getChannels) | **GET** channels | List all active channels in Asterisk.
[**getDeviceState**](DefaultApi.md#getDeviceState) | **GET** deviceStates/{deviceName} | Retrieve the current state of a device.
[**getDeviceStates**](DefaultApi.md#getDeviceStates) | **GET** deviceStates | List all ARI controlled device states.
[**getEndpoint**](DefaultApi.md#getEndpoint) | **GET** endpoints/{tech}/{resource} | Details for an endpoint.
[**getEndpoints**](DefaultApi.md#getEndpoints) | **GET** endpoints | List all endpoints.
[**getEndpointsByTech**](DefaultApi.md#getEndpointsByTech) | **GET** endpoints/{tech} | List available endoints for a given endpoint technology.
[**getLiveRecording**](DefaultApi.md#getLiveRecording) | **GET** recordings/live/{recordingName} | List live recordings.
[**getMailbox**](DefaultApi.md#getMailbox) | **GET** mailboxes/{mailboxName} | Retrieve the current state of a mailbox.
[**getMailboxes**](DefaultApi.md#getMailboxes) | **GET** mailboxes | List all mailboxes.
[**getPlayback**](DefaultApi.md#getPlayback) | **GET** playbacks/{playbackId} | Get a playback&#39;s details.
[**getSound**](DefaultApi.md#getSound) | **GET** sounds/{soundId} | Get a sound&#39;s details.
[**getSounds**](DefaultApi.md#getSounds) | **GET** sounds | List all sounds.
[**getStoredRecording**](DefaultApi.md#getStoredRecording) | **GET** recordings/stored/{recordingName} | Get a stored recording&#39;s details.
[**getStoredRecordingFile**](DefaultApi.md#getStoredRecordingFile) | **GET** recordings/stored/{recordingName}/file | Get the file associated with the stored recording.
[**getStoredRecordings**](DefaultApi.md#getStoredRecordings) | **GET** recordings/stored | List recordings that are complete.
[**hangupChannel**](DefaultApi.md#hangupChannel) | **DELETE** channels/{channelId} | Delete (i.e. hangup) a channel.
[**holdChannel**](DefaultApi.md#holdChannel) | **POST** channels/{channelId}/hold | Hold a channel.
[**loadAsteriskModule**](DefaultApi.md#loadAsteriskModule) | **POST** asterisk/modules/{moduleName} | Load an Asterisk module.
[**muteChannel**](DefaultApi.md#muteChannel) | **POST** channels/{channelId}/mute | Mute a channel.
[**muteLiveRecording**](DefaultApi.md#muteLiveRecording) | **POST** recordings/live/{recordingName}/mute | Mute a live recording.
[**originateChannel**](DefaultApi.md#originateChannel) | **POST** channels | Create a new channel (originate).
[**originateChannelWithId**](DefaultApi.md#originateChannelWithId) | **POST** channels/{channelId} | Create a new channel (originate with id).
[**pauseLiveRecording**](DefaultApi.md#pauseLiveRecording) | **POST** recordings/live/{recordingName}/pause | Pause a live recording.
[**playBridgeMedia**](DefaultApi.md#playBridgeMedia) | **POST** bridges/{bridgeId}/play | Start playback of media on a bridge.
[**playBridgeMediaWithId**](DefaultApi.md#playBridgeMediaWithId) | **POST** bridges/{bridgeId}/play/{playbackId} | Start playback of media on a bridge.
[**playChannel**](DefaultApi.md#playChannel) | **POST** channels/{channelId}/play | Start playback of media.
[**playChannelWithId**](DefaultApi.md#playChannelWithId) | **POST** channels/{channelId}/play/{playbackId} | Start playback of media and specify the playbackId.
[**recordBridge**](DefaultApi.md#recordBridge) | **POST** bridges/{bridgeId}/record | Start a recording.
[**recordChannel**](DefaultApi.md#recordChannel) | **POST** channels/{channelId}/record | Start a recording.
[**redirectChannel**](DefaultApi.md#redirectChannel) | **POST** channels/{channelId}/redirect | Redirect the channel to a different location.
[**reloadAsteriskModule**](DefaultApi.md#reloadAsteriskModule) | **PUT** asterisk/modules/{moduleName} | Reload an Asterisk module.
[**removeChannelFromBridge**](DefaultApi.md#removeChannelFromBridge) | **POST** bridges/{bridgeId}/removeChannel | Remove a channel from a bridge.
[**rotateAsteriskLogChannel**](DefaultApi.md#rotateAsteriskLogChannel) | **PUT** asterisk/logging/{logChannelName}/rotate | Rotates a log channel.
[**sendChannelDTMF**](DefaultApi.md#sendChannelDTMF) | **POST** channels/{channelId}/dtmf | Send provided DTMF to a given channel.
[**sendEndpointMessage**](DefaultApi.md#sendEndpointMessage) | **PUT** endpoints/sendMessage | Send a message to some technology URI or endpoint.
[**sendEndpointMessageByTechnology**](DefaultApi.md#sendEndpointMessageByTechnology) | **PUT** endpoints/{tech}/{resource}/sendMessage | Send a message to some endpoint in a technology.
[**setAsteriskGlobalVar**](DefaultApi.md#setAsteriskGlobalVar) | **POST** asterisk/variable | Set the value of a global variable.
[**setBridgeChannelVideoSource**](DefaultApi.md#setBridgeChannelVideoSource) | **POST** bridges/{bridgeId}/videoSource/{channelId} | Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.
[**setChannelVar**](DefaultApi.md#setChannelVar) | **POST** channels/{channelId}/variable | Set the value of a channel variable or function.
[**snoopChannel**](DefaultApi.md#snoopChannel) | **POST** channels/{channelId}/snoop | Start snooping.
[**snoopChannelWithId**](DefaultApi.md#snoopChannelWithId) | **POST** channels/{channelId}/snoop/{snoopId} | Start snooping.
[**startBridgeMoh**](DefaultApi.md#startBridgeMoh) | **POST** bridges/{bridgeId}/moh | Play music on hold to a bridge or change the MOH class that is playing.
[**startChannelMoh**](DefaultApi.md#startChannelMoh) | **POST** channels/{channelId}/moh | Play music on hold to a channel.
[**startChannelRing**](DefaultApi.md#startChannelRing) | **POST** channels/{channelId}/ring | Indicate ringing to a channel.
[**startChannelSilence**](DefaultApi.md#startChannelSilence) | **POST** channels/{channelId}/silence | Play silence to a channel.
[**stopBridgeMoh**](DefaultApi.md#stopBridgeMoh) | **DELETE** bridges/{bridgeId}/moh | Stop playing music on hold to a bridge.
[**stopChannelMoh**](DefaultApi.md#stopChannelMoh) | **DELETE** channels/{channelId}/moh | Stop playing music on hold to a channel.
[**stopChannelRing**](DefaultApi.md#stopChannelRing) | **DELETE** channels/{channelId}/ring | Stop ringing indication on a channel if locally generated.
[**stopChannelSilence**](DefaultApi.md#stopChannelSilence) | **DELETE** channels/{channelId}/silence | Stop playing silence to a channel.
[**stopLiveRecording**](DefaultApi.md#stopLiveRecording) | **POST** recordings/live/{recordingName}/stop | Stop a live recording and store it.
[**stopPlayback**](DefaultApi.md#stopPlayback) | **DELETE** playbacks/{playbackId} | Stop a playback.
[**subscribeToApplication**](DefaultApi.md#subscribeToApplication) | **POST** applications/{applicationName}/subscription | Subscribe an application to a event source.
[**unhold**](DefaultApi.md#unhold) | **DELETE** channels/{channelId}/hold | Remove a channel from hold.
[**unloadAsteriskModule**](DefaultApi.md#unloadAsteriskModule) | **DELETE** asterisk/modules/{moduleName} | Unload an Asterisk module.
[**unmute**](DefaultApi.md#unmute) | **DELETE** channels/{channelId}/mute | Unmute a channel.
[**unmuteLiveRecording**](DefaultApi.md#unmuteLiveRecording) | **DELETE** recordings/live/{recordingName}/mute | Unmute a live recording.
[**unpauseLiveRecording**](DefaultApi.md#unpauseLiveRecording) | **DELETE** recordings/live/{recordingName}/pause | Unpause a live recording.
[**unsubscribeFromApplication**](DefaultApi.md#unsubscribeFromApplication) | **DELETE** applications/{applicationName}/subscription | Unsubscribe an application from an event source.
[**updateAsteriskConfigObject**](DefaultApi.md#updateAsteriskConfigObject) | **PUT** asterisk/config/dynamic/{configClass}/{objectType}/{id} | Create or update a dynamic configuration object.
[**updateDeviceState**](DefaultApi.md#updateDeviceState) | **PUT** deviceStates/{deviceName} | Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
[**updateMailbox**](DefaultApi.md#updateMailbox) | **PUT** mailboxes/{mailboxName} | Change the state of a mailbox. (Note - implicitly creates the mailbox).


<a name="addAsteriskLogChannel"></a>
# **addAsteriskLogChannel**
> Void addAsteriskLogChannel(logChannelName, _configuration)

Adds a log channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String logChannelName = "logChannelName_example"; // String | The log channel to add
String _configuration = "_configuration_example"; // String | levels of the log channel
try {
    Void result = apiInstance.addAsteriskLogChannel(logChannelName, _configuration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addAsteriskLogChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logChannelName** | **String**| The log channel to add |
 **_configuration** | **String**| levels of the log channel |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addChannelToBridge"></a>
# **addChannelToBridge**
> Void addChannelToBridge(bridgeId, channel, role)

Add a channel to a bridge.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
List<String> channel = Arrays.asList("channel_example"); // List<String> | Ids of channels to add to bridge
String role = "role_example"; // String | Channel's role in the bridge
try {
    Void result = apiInstance.addChannelToBridge(bridgeId, channel, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addChannelToBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **channel** | [**List&lt;String&gt;**](String.md)| Ids of channels to add to bridge |
 **role** | **String**| Channel&#39;s role in the bridge | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="addUserEvent"></a>
# **addUserEvent**
> Void addUserEvent(eventName, application, source, variables)

Generate a user event.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String eventName = "eventName_example"; // String | Event name
String application = "application_example"; // String | The name of the application that will receive this event
List<String> source = Arrays.asList("source_example"); // List<String> | URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}/{resource}, deviceState:{deviceName}
List<CustomVariable> variables = Arrays.asList(new CustomVariable()); // List<CustomVariable> | The \"variables\" key in the body object holds custom key/value pairs to add to the user event. Ex. { \"variables\": { \"key\": \"value\" } }
try {
    Void result = apiInstance.addUserEvent(eventName, application, source, variables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addUserEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| Event name |
 **application** | **String**| The name of the application that will receive this event |
 **source** | [**List&lt;String&gt;**](String.md)| URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}/{resource}, deviceState:{deviceName} | [optional]
 **variables** | [**List&lt;CustomVariable&gt;**](CustomVariable.md)| The \&quot;variables\&quot; key in the body object holds custom key/value pairs to add to the user event. Ex. { \&quot;variables\&quot;: { \&quot;key\&quot;: \&quot;value\&quot; } } | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="answerChannel"></a>
# **answerChannel**
> Void answerChannel(channelId)

Answer a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.answerChannel(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#answerChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelLiveRecording"></a>
# **cancelLiveRecording**
> Void cancelLiveRecording(recordingName)

Stop a live recording and discard it.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.cancelLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="clearBridgeChannelVideoSource"></a>
# **clearBridgeChannelVideoSource**
> Void clearBridgeChannelVideoSource(bridgeId)

Removes any explicit video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants. When no explicit video source is set, talk detection will be used to determine the active video stream.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
try {
    Void result = apiInstance.clearBridgeChannelVideoSource(bridgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#clearBridgeChannelVideoSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="continueChannelInDialplan"></a>
# **continueChannelInDialplan**
> Void continueChannelInDialplan(channelId, context, extension, priority, label)

Exit application; continue execution in the dialplan.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String context = "context_example"; // String | The context to continue to.
String extension = "extension_example"; // String | The extension to continue to.
Integer priority = 56; // Integer | The priority to continue to.
String label = "label_example"; // String | The label to continue to - will supersede 'priority' if both are provided.
try {
    Void result = apiInstance.continueChannelInDialplan(channelId, context, extension, priority, label);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#continueChannelInDialplan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **context** | **String**| The context to continue to. | [optional]
 **extension** | **String**| The extension to continue to. | [optional]
 **priority** | **Integer**| The priority to continue to. | [optional]
 **label** | **String**| The label to continue to - will supersede &#39;priority&#39; if both are provided. | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="controlPlayback"></a>
# **controlPlayback**
> Void controlPlayback(playbackId, operation)

Control a playback.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String playbackId = "playbackId_example"; // String | Playback's id
String operation = "operation_example"; // String | Operation to perform on the playback.
try {
    Void result = apiInstance.controlPlayback(playbackId, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#controlPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playbackId** | **String**| Playback&#39;s id |
 **operation** | **String**| Operation to perform on the playback. | [enum: restart, pause, unpause, reverse, forward]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="copyStoredRecording"></a>
# **copyStoredRecording**
> StoredRecording copyStoredRecording(recordingName, destinationRecordingName)

Copy a stored recording.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording to copy
String destinationRecordingName = "destinationRecordingName_example"; // String | The destination name of the recording
try {
    StoredRecording result = apiInstance.copyStoredRecording(recordingName, destinationRecordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#copyStoredRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording to copy |
 **destinationRecordingName** | **String**| The destination name of the recording |

### Return type

[**StoredRecording**](StoredRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createBridge"></a>
# **createBridge**
> Bridge createBridge(type, bridgeId, name)

Create a new bridge.

This bridge persists until it has been shut down, or Asterisk has been shut down.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String type = "type_example"; // String | Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu).
String bridgeId = "bridgeId_example"; // String | Unique ID to give to the bridge being created.
String name = "name_example"; // String | Name to give to the bridge being created.
try {
    Bridge result = apiInstance.createBridge(type, bridgeId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu). | [optional]
 **bridgeId** | **String**| Unique ID to give to the bridge being created. | [optional]
 **name** | **String**| Name to give to the bridge being created. | [optional]

### Return type

[**Bridge**](Bridge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createChannel"></a>
# **createChannel**
> Channel createChannel(endpoint, app, appArgs, channelId, otherChannelId, originator, formats)

Create channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String endpoint = "endpoint_example"; // String | Endpoint for channel communication
String app = "app_example"; // String | Stasis Application to place channel into
String appArgs = "appArgs_example"; // String | The application arguments to pass to the Stasis application provided by 'app'. Mutually exclusive with 'context', 'extension', 'priority', and 'label'.
String channelId = "channelId_example"; // String | The unique id to assign the channel on creation.
String otherChannelId = "otherChannelId_example"; // String | The unique id to assign the second channel when using local channels.
String originator = "originator_example"; // String | Unique ID of the calling channel
String formats = "formats_example"; // String | The format name capability list to use if originator is not specified. Ex. \"ulaw,slin16\".  Format names can be found with \"core show codecs\".
try {
    Channel result = apiInstance.createChannel(endpoint, app, appArgs, channelId, otherChannelId, originator, formats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpoint** | **String**| Endpoint for channel communication |
 **app** | **String**| Stasis Application to place channel into |
 **appArgs** | **String**| The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. | [optional]
 **channelId** | **String**| The unique id to assign the channel on creation. | [optional]
 **otherChannelId** | **String**| The unique id to assign the second channel when using local channels. | [optional]
 **originator** | **String**| Unique ID of the calling channel | [optional]
 **formats** | **String**| The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. | [optional]

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createOrUpdateBridge"></a>
# **createOrUpdateBridge**
> Bridge createOrUpdateBridge(bridgeId, type, name)

Create a new bridge or updates an existing one.

This bridge persists until it has been shut down, or Asterisk has been shut down.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Unique ID to give to the bridge being created.
String type = "type_example"; // String | Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set.
String name = "name_example"; // String | Set the name of the bridge.
try {
    Bridge result = apiInstance.createOrUpdateBridge(bridgeId, type, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdateBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Unique ID to give to the bridge being created. |
 **type** | **String**| Comma separated list of bridge type attributes (mixing, holding, dtmf_events, proxy_media, video_sfu) to set. | [optional]
 **name** | **String**| Set the name of the bridge. | [optional]

### Return type

[**Bridge**](Bridge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAsteriskConfigObject"></a>
# **deleteAsteriskConfigObject**
> Void deleteAsteriskConfigObject(configClass, objectType, id)

Delete a dynamic configuration object.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String configClass = "configClass_example"; // String | The configuration class containing dynamic configuration objects.
String objectType = "objectType_example"; // String | The type of configuration object to delete.
String id = "id_example"; // String | The unique identifier of the object to delete.
try {
    Void result = apiInstance.deleteAsteriskConfigObject(configClass, objectType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAsteriskConfigObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configClass** | **String**| The configuration class containing dynamic configuration objects. |
 **objectType** | **String**| The type of configuration object to delete. |
 **id** | **String**| The unique identifier of the object to delete. |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAsteriskLogChannel"></a>
# **deleteAsteriskLogChannel**
> Void deleteAsteriskLogChannel(logChannelName)

Deletes a log channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String logChannelName = "logChannelName_example"; // String | Log channels name
try {
    Void result = apiInstance.deleteAsteriskLogChannel(logChannelName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAsteriskLogChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logChannelName** | **String**| Log channels name |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBridge"></a>
# **deleteBridge**
> Void deleteBridge(bridgeId)

Shut down a bridge.

If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
try {
    Void result = apiInstance.deleteBridge(bridgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteDeviceState"></a>
# **deleteDeviceState**
> Void deleteDeviceState(deviceName)

Destroy a device-state controlled by ARI.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String deviceName = "deviceName_example"; // String | Name of the device
try {
    Void result = apiInstance.deleteDeviceState(deviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteDeviceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceName** | **String**| Name of the device |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMailbox"></a>
# **deleteMailbox**
> Void deleteMailbox(mailboxName)

Destroy a mailbox.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String mailboxName = "mailboxName_example"; // String | Name of the mailbox
try {
    Void result = apiInstance.deleteMailbox(mailboxName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxName** | **String**| Name of the mailbox |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteStoredRecording"></a>
# **deleteStoredRecording**
> Void deleteStoredRecording(recordingName)

Delete a stored recording.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.deleteStoredRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteStoredRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="dialChannel"></a>
# **dialChannel**
> Void dialChannel(channelId, caller, timeout)

Dial a created channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String caller = "caller_example"; // String | Channel ID of caller
Integer timeout = 0; // Integer | Dial timeout
try {
    Void result = apiInstance.dialChannel(channelId, caller, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dialChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **caller** | **String**| Channel ID of caller | [optional]
 **timeout** | **Integer**| Dial timeout | [optional] [default to 0]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="eventWebsocket"></a>
# **eventWebsocket**
> Message eventWebsocket(app, subscribeAll)

WebSocket connection for events.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
List<String> app = Arrays.asList("app_example"); // List<String> | Applications to subscribe to.
Boolean subscribeAll = true; // Boolean | Subscribe to all Asterisk events. If provided, the applications listed will be subscribed to all events, effectively disabling the application specific subscriptions. Default is 'false'.
try {
    Message result = apiInstance.eventWebsocket(app, subscribeAll);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#eventWebsocket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app** | [**List&lt;String&gt;**](String.md)| Applications to subscribe to. |
 **subscribeAll** | **Boolean**| Subscribe to all Asterisk events. If provided, the applications listed will be subscribed to all events, effectively disabling the application specific subscriptions. Default is &#39;false&#39;. | [optional]

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getApplication"></a>
# **getApplication**
> Application getApplication(applicationName)

Get details of an application.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String applicationName = "applicationName_example"; // String | Application's name
try {
    Application result = apiInstance.getApplication(applicationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**| Application&#39;s name |

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getApplications"></a>
# **getApplications**
> List&lt;Application&gt; getApplications()

List all applications.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Application> result = apiInstance.getApplications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getApplications");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Application&gt;**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskConfigObject"></a>
# **getAsteriskConfigObject**
> List&lt;ConfigTuple&gt; getAsteriskConfigObject(configClass, objectType, id)

Retrieve a dynamic configuration object.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String configClass = "configClass_example"; // String | The configuration class containing dynamic configuration objects.
String objectType = "objectType_example"; // String | The type of configuration object to retrieve.
String id = "id_example"; // String | The unique identifier of the object to retrieve.
try {
    List<ConfigTuple> result = apiInstance.getAsteriskConfigObject(configClass, objectType, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskConfigObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configClass** | **String**| The configuration class containing dynamic configuration objects. |
 **objectType** | **String**| The type of configuration object to retrieve. |
 **id** | **String**| The unique identifier of the object to retrieve. |

### Return type

[**List&lt;ConfigTuple&gt;**](ConfigTuple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskGlobalVar"></a>
# **getAsteriskGlobalVar**
> Variable getAsteriskGlobalVar(variable)

Get the value of a global variable.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String variable = "variable_example"; // String | The variable to get
try {
    Variable result = apiInstance.getAsteriskGlobalVar(variable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskGlobalVar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable** | **String**| The variable to get |

### Return type

[**Variable**](Variable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskInfo"></a>
# **getAsteriskInfo**
> AsteriskInfo getAsteriskInfo(only)

Gets Asterisk system information.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
List<String> only = Arrays.asList("only_example"); // List<String> | Filter information returned
try {
    AsteriskInfo result = apiInstance.getAsteriskInfo(only);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **only** | [**List&lt;String&gt;**](String.md)| Filter information returned | [optional]

### Return type

[**AsteriskInfo**](AsteriskInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskLogChannels"></a>
# **getAsteriskLogChannels**
> List&lt;LogChannel&gt; getAsteriskLogChannels()

Gets Asterisk log channel information.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<LogChannel> result = apiInstance.getAsteriskLogChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskLogChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LogChannel&gt;**](LogChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskModule"></a>
# **getAsteriskModule**
> Module getAsteriskModule(moduleName)

Get Asterisk module information.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String moduleName = "moduleName_example"; // String | Module's name
try {
    Module result = apiInstance.getAsteriskModule(moduleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moduleName** | **String**| Module&#39;s name |

### Return type

[**Module**](Module.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAsteriskModules"></a>
# **getAsteriskModules**
> List&lt;Module&gt; getAsteriskModules()

List Asterisk modules.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Module> result = apiInstance.getAsteriskModules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAsteriskModules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Module&gt;**](Module.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBridge"></a>
# **getBridge**
> Bridge getBridge(bridgeId)

Get bridge details.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
try {
    Bridge result = apiInstance.getBridge(bridgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |

### Return type

[**Bridge**](Bridge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBridges"></a>
# **getBridges**
> List&lt;Bridge&gt; getBridges()

List all active bridges in Asterisk.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Bridge> result = apiInstance.getBridges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBridges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Bridge&gt;**](Bridge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChannel"></a>
# **getChannel**
> Channel getChannel(channelId)

Channel details.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Channel result = apiInstance.getChannel(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChannelVar"></a>
# **getChannelVar**
> Variable getChannelVar(channelId, variable)

Get the value of a channel variable or function.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String variable = "variable_example"; // String | The channel variable or function to get
try {
    Variable result = apiInstance.getChannelVar(channelId, variable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getChannelVar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **variable** | **String**| The channel variable or function to get |

### Return type

[**Variable**](Variable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChannels"></a>
# **getChannels**
> List&lt;Channel&gt; getChannels()

List all active channels in Asterisk.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Channel> result = apiInstance.getChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDeviceState"></a>
# **getDeviceState**
> DeviceState getDeviceState(deviceName)

Retrieve the current state of a device.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String deviceName = "deviceName_example"; // String | Name of the device
try {
    DeviceState result = apiInstance.getDeviceState(deviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDeviceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceName** | **String**| Name of the device |

### Return type

[**DeviceState**](DeviceState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDeviceStates"></a>
# **getDeviceStates**
> List&lt;DeviceState&gt; getDeviceStates()

List all ARI controlled device states.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<DeviceState> result = apiInstance.getDeviceStates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDeviceStates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DeviceState&gt;**](DeviceState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEndpoint"></a>
# **getEndpoint**
> Endpoint getEndpoint(tech, resource)

Details for an endpoint.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String tech = "tech_example"; // String | Technology of the endpoint
String resource = "resource_example"; // String | ID of the endpoint
try {
    Endpoint result = apiInstance.getEndpoint(tech, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tech** | **String**| Technology of the endpoint |
 **resource** | **String**| ID of the endpoint |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEndpoints"></a>
# **getEndpoints**
> List&lt;Endpoint&gt; getEndpoints()

List all endpoints.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Endpoint> result = apiInstance.getEndpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpoints");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Endpoint&gt;**](Endpoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEndpointsByTech"></a>
# **getEndpointsByTech**
> List&lt;Endpoint&gt; getEndpointsByTech(tech)

List available endoints for a given endpoint technology.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String tech = "tech_example"; // String | Technology of the endpoints (sip,iax2,...)
try {
    List<Endpoint> result = apiInstance.getEndpointsByTech(tech);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpointsByTech");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tech** | **String**| Technology of the endpoints (sip,iax2,...) |

### Return type

[**List&lt;Endpoint&gt;**](Endpoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getLiveRecording"></a>
# **getLiveRecording**
> LiveRecording getLiveRecording(recordingName)

List live recordings.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    LiveRecording result = apiInstance.getLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**LiveRecording**](LiveRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMailbox"></a>
# **getMailbox**
> Mailbox getMailbox(mailboxName)

Retrieve the current state of a mailbox.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String mailboxName = "mailboxName_example"; // String | Name of the mailbox
try {
    Mailbox result = apiInstance.getMailbox(mailboxName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxName** | **String**| Name of the mailbox |

### Return type

[**Mailbox**](Mailbox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMailboxes"></a>
# **getMailboxes**
> List&lt;Mailbox&gt; getMailboxes()

List all mailboxes.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Mailbox> result = apiInstance.getMailboxes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMailboxes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Mailbox&gt;**](Mailbox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPlayback"></a>
# **getPlayback**
> Playback getPlayback(playbackId)

Get a playback&#39;s details.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String playbackId = "playbackId_example"; // String | Playback's id
try {
    Playback result = apiInstance.getPlayback(playbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playbackId** | **String**| Playback&#39;s id |

### Return type

[**Playback**](Playback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSound"></a>
# **getSound**
> Sound getSound(soundId)

Get a sound&#39;s details.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String soundId = "soundId_example"; // String | Sound's id
try {
    Sound result = apiInstance.getSound(soundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSound");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **soundId** | **String**| Sound&#39;s id |

### Return type

[**Sound**](Sound.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSounds"></a>
# **getSounds**
> List&lt;Sound&gt; getSounds(lang, format)

List all sounds.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String lang = "lang_example"; // String | Lookup sound for a specific language.
String format = "format_example"; // String | Lookup sound in a specific format.
try {
    List<Sound> result = apiInstance.getSounds(lang, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSounds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lang** | **String**| Lookup sound for a specific language. | [optional]
 **format** | **String**| Lookup sound in a specific format. | [optional]

### Return type

[**List&lt;Sound&gt;**](Sound.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoredRecording"></a>
# **getStoredRecording**
> StoredRecording getStoredRecording(recordingName)

Get a stored recording&#39;s details.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    StoredRecording result = apiInstance.getStoredRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStoredRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**StoredRecording**](StoredRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoredRecordingFile"></a>
# **getStoredRecordingFile**
> byte[] getStoredRecordingFile(recordingName)

Get the file associated with the stored recording.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    byte[] result = apiInstance.getStoredRecordingFile(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStoredRecordingFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoredRecordings"></a>
# **getStoredRecordings**
> List&lt;StoredRecording&gt; getStoredRecordings()

List recordings that are complete.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<StoredRecording> result = apiInstance.getStoredRecordings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStoredRecordings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StoredRecording&gt;**](StoredRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="hangupChannel"></a>
# **hangupChannel**
> Void hangupChannel(channelId, reason)

Delete (i.e. hangup) a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String reason = "reason_example"; // String | Reason for hanging up the channel
try {
    Void result = apiInstance.hangupChannel(channelId, reason);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#hangupChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **reason** | **String**| Reason for hanging up the channel | [optional] [enum: normal, busy, congestion, no_answer, answered_elsewhere]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="holdChannel"></a>
# **holdChannel**
> Void holdChannel(channelId)

Hold a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.holdChannel(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#holdChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loadAsteriskModule"></a>
# **loadAsteriskModule**
> Void loadAsteriskModule(moduleName)

Load an Asterisk module.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String moduleName = "moduleName_example"; // String | Module's name
try {
    Void result = apiInstance.loadAsteriskModule(moduleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#loadAsteriskModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moduleName** | **String**| Module&#39;s name |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="muteChannel"></a>
# **muteChannel**
> Void muteChannel(channelId, direction)

Mute a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String direction = "both"; // String | Direction in which to mute audio
try {
    Void result = apiInstance.muteChannel(channelId, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#muteChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **direction** | **String**| Direction in which to mute audio | [optional] [default to both] [enum: both, in, out]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="muteLiveRecording"></a>
# **muteLiveRecording**
> Void muteLiveRecording(recordingName)

Mute a live recording.

Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.muteLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#muteLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="originateChannel"></a>
# **originateChannel**
> Channel originateChannel(endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, channelId, otherChannelId, originator, formats)

Create a new channel (originate).

The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String endpoint = "endpoint_example"; // String | Endpoint to call.
String extension = "extension_example"; // String | The extension to dial after the endpoint answers. Mutually exclusive with 'app'.
String context = "context_example"; // String | The context to dial after the endpoint answers. If omitted, uses 'default'. Mutually exclusive with 'app'.
Long priority = 789L; // Long | The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with 'app'.
String label = "label_example"; // String | The label to dial after the endpoint answers. Will supersede 'priority' if provided. Mutually exclusive with 'app'.
String app = "app_example"; // String | The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with 'context', 'extension', 'priority', and 'label'.
String appArgs = "appArgs_example"; // String | The application arguments to pass to the Stasis application provided by 'app'. Mutually exclusive with 'context', 'extension', 'priority', and 'label'.
String callerId = "callerId_example"; // String | CallerID to use when dialing the endpoint or extension.
Integer timeout = 30; // Integer | Timeout (in seconds) before giving up dialing, or -1 for no timeout.
List<VariableTuple> variables = Arrays.asList(new VariableTuple()); // List<VariableTuple> | The \"variables\" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \"endpoint\": \"SIP/Alice\", \"variables\": { \"CALLERID(name)\": \"Alice\" } }
String channelId = "channelId_example"; // String | The unique id to assign the channel on creation.
String otherChannelId = "otherChannelId_example"; // String | The unique id to assign the second channel when using local channels.
String originator = "originator_example"; // String | The unique id of the channel which is originating this one.
String formats = "formats_example"; // String | The format name capability list to use if originator is not specified. Ex. \"ulaw,slin16\".  Format names can be found with \"core show codecs\".
try {
    Channel result = apiInstance.originateChannel(endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, channelId, otherChannelId, originator, formats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#originateChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpoint** | **String**| Endpoint to call. |
 **extension** | **String**| The extension to dial after the endpoint answers. Mutually exclusive with &#39;app&#39;. | [optional]
 **context** | **String**| The context to dial after the endpoint answers. If omitted, uses &#39;default&#39;. Mutually exclusive with &#39;app&#39;. | [optional]
 **priority** | **Long**| The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with &#39;app&#39;. | [optional]
 **label** | **String**| The label to dial after the endpoint answers. Will supersede &#39;priority&#39; if provided. Mutually exclusive with &#39;app&#39;. | [optional]
 **app** | **String**| The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. | [optional]
 **appArgs** | **String**| The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. | [optional]
 **callerId** | **String**| CallerID to use when dialing the endpoint or extension. | [optional]
 **timeout** | **Integer**| Timeout (in seconds) before giving up dialing, or -1 for no timeout. | [optional] [default to 30]
 **variables** | [**List&lt;VariableTuple&gt;**](VariableTuple.md)| The \&quot;variables\&quot; key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \&quot;endpoint\&quot;: \&quot;SIP/Alice\&quot;, \&quot;variables\&quot;: { \&quot;CALLERID(name)\&quot;: \&quot;Alice\&quot; } } | [optional]
 **channelId** | **String**| The unique id to assign the channel on creation. | [optional]
 **otherChannelId** | **String**| The unique id to assign the second channel when using local channels. | [optional]
 **originator** | **String**| The unique id of the channel which is originating this one. | [optional]
 **formats** | **String**| The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. | [optional]

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="originateChannelWithId"></a>
# **originateChannelWithId**
> Channel originateChannelWithId(channelId, endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, otherChannelId, originator, formats)

Create a new channel (originate with id).

The new channel is created immediately and a snapshot of it returned. If a Stasis application is provided it will be automatically subscribed to the originated channel for further events and updates.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | The unique id to assign the channel on creation.
String endpoint = "endpoint_example"; // String | Endpoint to call.
String extension = "extension_example"; // String | The extension to dial after the endpoint answers. Mutually exclusive with 'app'.
String context = "context_example"; // String | The context to dial after the endpoint answers. If omitted, uses 'default'. Mutually exclusive with 'app'.
Long priority = 789L; // Long | The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with 'app'.
String label = "label_example"; // String | The label to dial after the endpoint answers. Will supersede 'priority' if provided. Mutually exclusive with 'app'.
String app = "app_example"; // String | The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with 'context', 'extension', 'priority', and 'label'.
String appArgs = "appArgs_example"; // String | The application arguments to pass to the Stasis application provided by 'app'. Mutually exclusive with 'context', 'extension', 'priority', and 'label'.
String callerId = "callerId_example"; // String | CallerID to use when dialing the endpoint or extension.
Integer timeout = 30; // Integer | Timeout (in seconds) before giving up dialing, or -1 for no timeout.
List<VariableTuple> variables = Arrays.asList(new VariableTuple()); // List<VariableTuple> | The \"variables\" key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \"endpoint\": \"SIP/Alice\", \"variables\": { \"CALLERID(name)\": \"Alice\" } }
String otherChannelId = "otherChannelId_example"; // String | The unique id to assign the second channel when using local channels.
String originator = "originator_example"; // String | The unique id of the channel which is originating this one.
String formats = "formats_example"; // String | The format name capability list to use if originator is not specified. Ex. \"ulaw,slin16\".  Format names can be found with \"core show codecs\".
try {
    Channel result = apiInstance.originateChannelWithId(channelId, endpoint, extension, context, priority, label, app, appArgs, callerId, timeout, variables, otherChannelId, originator, formats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#originateChannelWithId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| The unique id to assign the channel on creation. |
 **endpoint** | **String**| Endpoint to call. |
 **extension** | **String**| The extension to dial after the endpoint answers. Mutually exclusive with &#39;app&#39;. | [optional]
 **context** | **String**| The context to dial after the endpoint answers. If omitted, uses &#39;default&#39;. Mutually exclusive with &#39;app&#39;. | [optional]
 **priority** | **Long**| The priority to dial after the endpoint answers. If omitted, uses 1. Mutually exclusive with &#39;app&#39;. | [optional]
 **label** | **String**| The label to dial after the endpoint answers. Will supersede &#39;priority&#39; if provided. Mutually exclusive with &#39;app&#39;. | [optional]
 **app** | **String**| The application that is subscribed to the originated channel. When the channel is answered, it will be passed to this Stasis application. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. | [optional]
 **appArgs** | **String**| The application arguments to pass to the Stasis application provided by &#39;app&#39;. Mutually exclusive with &#39;context&#39;, &#39;extension&#39;, &#39;priority&#39;, and &#39;label&#39;. | [optional]
 **callerId** | **String**| CallerID to use when dialing the endpoint or extension. | [optional]
 **timeout** | **Integer**| Timeout (in seconds) before giving up dialing, or -1 for no timeout. | [optional] [default to 30]
 **variables** | [**List&lt;VariableTuple&gt;**](VariableTuple.md)| The \&quot;variables\&quot; key in the body object holds variable key/value pairs to set on the channel on creation. Other keys in the body object are interpreted as query parameters. Ex. { \&quot;endpoint\&quot;: \&quot;SIP/Alice\&quot;, \&quot;variables\&quot;: { \&quot;CALLERID(name)\&quot;: \&quot;Alice\&quot; } } | [optional]
 **otherChannelId** | **String**| The unique id to assign the second channel when using local channels. | [optional]
 **originator** | **String**| The unique id of the channel which is originating this one. | [optional]
 **formats** | **String**| The format name capability list to use if originator is not specified. Ex. \&quot;ulaw,slin16\&quot;.  Format names can be found with \&quot;core show codecs\&quot;. | [optional]

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pauseLiveRecording"></a>
# **pauseLiveRecording**
> Void pauseLiveRecording(recordingName)

Pause a live recording.

Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.pauseLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pauseLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="playBridgeMedia"></a>
# **playBridgeMedia**
> Playback playBridgeMedia(bridgeId, media, lang, offsetms, skipms, playbackId)

Start playback of media on a bridge.

The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
List<String> media = Arrays.asList("media_example"); // List<String> | Media URIs to play.
String lang = "lang_example"; // String | For sounds, selects language for sound.
Integer offsetms = 0; // Integer | Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
Integer skipms = 3000; // Integer | Number of milliseconds to skip for forward/reverse operations.
String playbackId = "playbackId_example"; // String | Playback Id.
try {
    Playback result = apiInstance.playBridgeMedia(bridgeId, media, lang, offsetms, skipms, playbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playBridgeMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **media** | [**List&lt;String&gt;**](String.md)| Media URIs to play. |
 **lang** | **String**| For sounds, selects language for sound. | [optional]
 **offsetms** | **Integer**| Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. | [optional] [default to 0]
 **skipms** | **Integer**| Number of milliseconds to skip for forward/reverse operations. | [optional] [default to 3000]
 **playbackId** | **String**| Playback Id. | [optional]

### Return type

[**Playback**](Playback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="playBridgeMediaWithId"></a>
# **playBridgeMediaWithId**
> Playback playBridgeMediaWithId(bridgeId, playbackId, media, lang, offsetms, skipms)

Start playback of media on a bridge.

The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
String playbackId = "playbackId_example"; // String | Playback ID.
List<String> media = Arrays.asList("media_example"); // List<String> | Media URIs to play.
String lang = "lang_example"; // String | For sounds, selects language for sound.
Integer offsetms = 0; // Integer | Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
Integer skipms = 3000; // Integer | Number of milliseconds to skip for forward/reverse operations.
try {
    Playback result = apiInstance.playBridgeMediaWithId(bridgeId, playbackId, media, lang, offsetms, skipms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playBridgeMediaWithId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **playbackId** | **String**| Playback ID. |
 **media** | [**List&lt;String&gt;**](String.md)| Media URIs to play. |
 **lang** | **String**| For sounds, selects language for sound. | [optional]
 **offsetms** | **Integer**| Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. | [optional] [default to 0]
 **skipms** | **Integer**| Number of milliseconds to skip for forward/reverse operations. | [optional] [default to 3000]

### Return type

[**Playback**](Playback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="playChannel"></a>
# **playChannel**
> Playback playChannel(channelId, media, lang, offsetms, skipms, playbackId)

Start playback of media.

The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
List<String> media = Arrays.asList("media_example"); // List<String> | Media URIs to play.
String lang = "lang_example"; // String | For sounds, selects language for sound.
Integer offsetms = 56; // Integer | Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
Integer skipms = 3000; // Integer | Number of milliseconds to skip for forward/reverse operations.
String playbackId = "playbackId_example"; // String | Playback ID.
try {
    Playback result = apiInstance.playChannel(channelId, media, lang, offsetms, skipms, playbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **media** | [**List&lt;String&gt;**](String.md)| Media URIs to play. |
 **lang** | **String**| For sounds, selects language for sound. | [optional]
 **offsetms** | **Integer**| Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. | [optional]
 **skipms** | **Integer**| Number of milliseconds to skip for forward/reverse operations. | [optional] [default to 3000]
 **playbackId** | **String**| Playback ID. | [optional]

### Return type

[**Playback**](Playback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="playChannelWithId"></a>
# **playChannelWithId**
> Playback playChannelWithId(channelId, playbackId, media, lang, offsetms, skipms)

Start playback of media and specify the playbackId.

The media URI may be any of a number of URI&#39;s. Currently sound:, recording:, number:, digits:, characters:, and tone: URI&#39;s are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String playbackId = "playbackId_example"; // String | Playback ID.
List<String> media = Arrays.asList("media_example"); // List<String> | Media URIs to play.
String lang = "lang_example"; // String | For sounds, selects language for sound.
Integer offsetms = 56; // Integer | Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified.
Integer skipms = 3000; // Integer | Number of milliseconds to skip for forward/reverse operations.
try {
    Playback result = apiInstance.playChannelWithId(channelId, playbackId, media, lang, offsetms, skipms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playChannelWithId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **playbackId** | **String**| Playback ID. |
 **media** | [**List&lt;String&gt;**](String.md)| Media URIs to play. |
 **lang** | **String**| For sounds, selects language for sound. | [optional]
 **offsetms** | **Integer**| Number of milliseconds to skip before playing. Only applies to the first URI if multiple media URIs are specified. | [optional]
 **skipms** | **Integer**| Number of milliseconds to skip for forward/reverse operations. | [optional] [default to 3000]

### Return type

[**Playback**](Playback.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="recordBridge"></a>
# **recordBridge**
> LiveRecording recordBridge(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn)

Start a recording.

This records the mixed audio from all channels participating in this bridge.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
String name = "name_example"; // String | Recording's filename
String format = "format_example"; // String | Format to encode audio in
Integer maxDurationSeconds = 0; // Integer | Maximum duration of the recording, in seconds. 0 for no limit.
Integer maxSilenceSeconds = 0; // Integer | Maximum duration of silence, in seconds. 0 for no limit.
String ifExists = "fail"; // String | Action to take if a recording with the same name already exists.
Boolean beep = false; // Boolean | Play beep when recording begins
String terminateOn = "none"; // String | DTMF input to terminate recording.
try {
    LiveRecording result = apiInstance.recordBridge(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recordBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **name** | **String**| Recording&#39;s filename |
 **format** | **String**| Format to encode audio in |
 **maxDurationSeconds** | **Integer**| Maximum duration of the recording, in seconds. 0 for no limit. | [optional] [default to 0]
 **maxSilenceSeconds** | **Integer**| Maximum duration of silence, in seconds. 0 for no limit. | [optional] [default to 0]
 **ifExists** | **String**| Action to take if a recording with the same name already exists. | [optional] [default to fail] [enum: fail, overwrite, append]
 **beep** | **Boolean**| Play beep when recording begins | [optional] [default to false]
 **terminateOn** | **String**| DTMF input to terminate recording. | [optional] [default to none] [enum: none, any, *, #]

### Return type

[**LiveRecording**](LiveRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="recordChannel"></a>
# **recordChannel**
> LiveRecording recordChannel(channelId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn)

Start a recording.

Record audio from a channel. Note that this will not capture audio sent to the channel. The bridge itself has a record feature if that&#39;s what you want.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String name = "name_example"; // String | Recording's filename
String format = "format_example"; // String | Format to encode audio in
Integer maxDurationSeconds = 0; // Integer | Maximum duration of the recording, in seconds. 0 for no limit
Integer maxSilenceSeconds = 0; // Integer | Maximum duration of silence, in seconds. 0 for no limit
String ifExists = "fail"; // String | Action to take if a recording with the same name already exists.
Boolean beep = false; // Boolean | Play beep when recording begins
String terminateOn = "none"; // String | DTMF input to terminate recording
try {
    LiveRecording result = apiInstance.recordChannel(channelId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#recordChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **name** | **String**| Recording&#39;s filename |
 **format** | **String**| Format to encode audio in |
 **maxDurationSeconds** | **Integer**| Maximum duration of the recording, in seconds. 0 for no limit | [optional] [default to 0]
 **maxSilenceSeconds** | **Integer**| Maximum duration of silence, in seconds. 0 for no limit | [optional] [default to 0]
 **ifExists** | **String**| Action to take if a recording with the same name already exists. | [optional] [default to fail] [enum: fail, overwrite, append]
 **beep** | **Boolean**| Play beep when recording begins | [optional] [default to false]
 **terminateOn** | **String**| DTMF input to terminate recording | [optional] [default to none] [enum: none, any, *, #]

### Return type

[**LiveRecording**](LiveRecording.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="redirectChannel"></a>
# **redirectChannel**
> Void redirectChannel(channelId, endpoint)

Redirect the channel to a different location.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String endpoint = "endpoint_example"; // String | The endpoint to redirect the channel to
try {
    Void result = apiInstance.redirectChannel(channelId, endpoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#redirectChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **endpoint** | **String**| The endpoint to redirect the channel to |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reloadAsteriskModule"></a>
# **reloadAsteriskModule**
> Void reloadAsteriskModule(moduleName)

Reload an Asterisk module.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String moduleName = "moduleName_example"; // String | Module's name
try {
    Void result = apiInstance.reloadAsteriskModule(moduleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#reloadAsteriskModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moduleName** | **String**| Module&#39;s name |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeChannelFromBridge"></a>
# **removeChannelFromBridge**
> Void removeChannelFromBridge(bridgeId, channel)

Remove a channel from a bridge.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
List<String> channel = Arrays.asList("channel_example"); // List<String> | Ids of channels to remove from bridge
try {
    Void result = apiInstance.removeChannelFromBridge(bridgeId, channel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#removeChannelFromBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **channel** | [**List&lt;String&gt;**](String.md)| Ids of channels to remove from bridge |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rotateAsteriskLogChannel"></a>
# **rotateAsteriskLogChannel**
> Void rotateAsteriskLogChannel(logChannelName)

Rotates a log channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String logChannelName = "logChannelName_example"; // String | Log channel's name
try {
    Void result = apiInstance.rotateAsteriskLogChannel(logChannelName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rotateAsteriskLogChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logChannelName** | **String**| Log channel&#39;s name |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendChannelDTMF"></a>
# **sendChannelDTMF**
> Void sendChannelDTMF(channelId, dtmf, before, between, duration, after)

Send provided DTMF to a given channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String dtmf = "dtmf_example"; // String | DTMF To send.
Integer before = 0; // Integer | Amount of time to wait before DTMF digits (specified in milliseconds) start.
Integer between = 100; // Integer | Amount of time in between DTMF digits (specified in milliseconds).
Integer duration = 100; // Integer | Length of each DTMF digit (specified in milliseconds).
Integer after = 0; // Integer | Amount of time to wait after DTMF digits (specified in milliseconds) end.
try {
    Void result = apiInstance.sendChannelDTMF(channelId, dtmf, before, between, duration, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sendChannelDTMF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **dtmf** | **String**| DTMF To send. | [optional]
 **before** | **Integer**| Amount of time to wait before DTMF digits (specified in milliseconds) start. | [optional] [default to 0]
 **between** | **Integer**| Amount of time in between DTMF digits (specified in milliseconds). | [optional] [default to 100]
 **duration** | **Integer**| Length of each DTMF digit (specified in milliseconds). | [optional] [default to 100]
 **after** | **Integer**| Amount of time to wait after DTMF digits (specified in milliseconds) end. | [optional] [default to 0]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendEndpointMessage"></a>
# **sendEndpointMessage**
> Void sendEndpointMessage(to, from, body, variables)

Send a message to some technology URI or endpoint.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String to = "to_example"; // String | The endpoint resource or technology specific URI to send the message to. Valid resources are sip, pjsip, and xmpp.
String from = "from_example"; // String | The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
String body = "body_example"; // String | The body of the message
List<String> variables = Arrays.asList(new List<String>()); // List<String> | The \"variables\" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects.
try {
    Void result = apiInstance.sendEndpointMessage(to, from, body, variables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sendEndpointMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| The endpoint resource or technology specific URI to send the message to. Valid resources are sip, pjsip, and xmpp. |
 **from** | **String**| The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp. |
 **body** | **String**| The body of the message | [optional]
 **variables** | **List&lt;String&gt;**| The \&quot;variables\&quot; key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects. | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendEndpointMessageByTechnology"></a>
# **sendEndpointMessageByTechnology**
> Void sendEndpointMessageByTechnology(tech, resource, from, body, variables)

Send a message to some endpoint in a technology.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String tech = "tech_example"; // String | Technology of the endpoint
String resource = "resource_example"; // String | ID of the endpoint
String from = "from_example"; // String | The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp.
String body = "body_example"; // String | The body of the message
List<String> variables = Arrays.asList(new List<String>()); // List<String> | The \"variables\" key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects.
try {
    Void result = apiInstance.sendEndpointMessageByTechnology(tech, resource, from, body, variables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sendEndpointMessageByTechnology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tech** | **String**| Technology of the endpoint |
 **resource** | **String**| ID of the endpoint |
 **from** | **String**| The endpoint resource or technology specific identity to send this message from. Valid resources are sip, pjsip, and xmpp. |
 **body** | **String**| The body of the message | [optional]
 **variables** | **List&lt;String&gt;**| The \&quot;variables\&quot; key in the body object holds technology specific key/value pairs to append to the message. These can be interpreted and used by the various resource types; for example, pjsip and sip resource types will add the key/value pairs as SIP headers. This is a List of JSON objects. | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setAsteriskGlobalVar"></a>
# **setAsteriskGlobalVar**
> Void setAsteriskGlobalVar(variable, value)

Set the value of a global variable.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String variable = "variable_example"; // String | The variable to set
String value = "value_example"; // String | The value to set the variable to
try {
    Void result = apiInstance.setAsteriskGlobalVar(variable, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setAsteriskGlobalVar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable** | **String**| The variable to set |
 **value** | **String**| The value to set the variable to | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setBridgeChannelVideoSource"></a>
# **setBridgeChannelVideoSource**
> Void setBridgeChannelVideoSource(bridgeId, channelId)

Set a channel as the video source in a multi-party mixing bridge. This operation has no effect on bridges with two or fewer participants.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.setBridgeChannelVideoSource(bridgeId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setBridgeChannelVideoSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setChannelVar"></a>
# **setChannelVar**
> Void setChannelVar(channelId, variable, value)

Set the value of a channel variable or function.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String variable = "variable_example"; // String | The channel variable or function to set
String value = "value_example"; // String | The value to set the variable to
try {
    Void result = apiInstance.setChannelVar(channelId, variable, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setChannelVar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **variable** | **String**| The channel variable or function to set |
 **value** | **String**| The value to set the variable to | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="snoopChannel"></a>
# **snoopChannel**
> Channel snoopChannel(channelId, app, spy, whisper, appArgs, snoopId)

Start snooping.

Snoop (spy/whisper) on a specific channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String app = "app_example"; // String | Application the snooping channel is placed into
String spy = "none"; // String | Direction of audio to spy on
String whisper = "none"; // String | Direction of audio to whisper into
String appArgs = "appArgs_example"; // String | The application arguments to pass to the Stasis application
String snoopId = "snoopId_example"; // String | Unique ID to assign to snooping channel
try {
    Channel result = apiInstance.snoopChannel(channelId, app, spy, whisper, appArgs, snoopId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#snoopChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **app** | **String**| Application the snooping channel is placed into |
 **spy** | **String**| Direction of audio to spy on | [optional] [default to none] [enum: none, both, out, in]
 **whisper** | **String**| Direction of audio to whisper into | [optional] [default to none] [enum: none, both, out, in]
 **appArgs** | **String**| The application arguments to pass to the Stasis application | [optional]
 **snoopId** | **String**| Unique ID to assign to snooping channel | [optional]

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="snoopChannelWithId"></a>
# **snoopChannelWithId**
> Channel snoopChannelWithId(channelId, snoopId, app, spy, whisper, appArgs)

Start snooping.

Snoop (spy/whisper) on a specific channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String snoopId = "snoopId_example"; // String | Unique ID to assign to snooping channel
String app = "app_example"; // String | Application the snooping channel is placed into
String spy = "none"; // String | Direction of audio to spy on
String whisper = "none"; // String | Direction of audio to whisper into
String appArgs = "appArgs_example"; // String | The application arguments to pass to the Stasis application
try {
    Channel result = apiInstance.snoopChannelWithId(channelId, snoopId, app, spy, whisper, appArgs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#snoopChannelWithId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **snoopId** | **String**| Unique ID to assign to snooping channel |
 **app** | **String**| Application the snooping channel is placed into |
 **spy** | **String**| Direction of audio to spy on | [optional] [default to none] [enum: none, both, out, in]
 **whisper** | **String**| Direction of audio to whisper into | [optional] [default to none] [enum: none, both, out, in]
 **appArgs** | **String**| The application arguments to pass to the Stasis application | [optional]

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startBridgeMoh"></a>
# **startBridgeMoh**
> Void startBridgeMoh(bridgeId, mohClass)

Play music on hold to a bridge or change the MOH class that is playing.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
String mohClass = "mohClass_example"; // String | Channel's id
try {
    Void result = apiInstance.startBridgeMoh(bridgeId, mohClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#startBridgeMoh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |
 **mohClass** | **String**| Channel&#39;s id | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startChannelMoh"></a>
# **startChannelMoh**
> Void startChannelMoh(channelId, mohClass)

Play music on hold to a channel.

Using media operations such as /play on a channel playing MOH in this manner will suspend MOH without resuming automatically. If continuing music on hold is desired, the stasis application must reinitiate music on hold.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String mohClass = "mohClass_example"; // String | Music on hold class to use
try {
    Void result = apiInstance.startChannelMoh(channelId, mohClass);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#startChannelMoh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **mohClass** | **String**| Music on hold class to use | [optional]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startChannelRing"></a>
# **startChannelRing**
> Void startChannelRing(channelId)

Indicate ringing to a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.startChannelRing(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#startChannelRing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startChannelSilence"></a>
# **startChannelSilence**
> Void startChannelSilence(channelId)

Play silence to a channel.

Using media operations such as /play on a channel playing silence in this manner will suspend silence without resuming automatically.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.startChannelSilence(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#startChannelSilence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopBridgeMoh"></a>
# **stopBridgeMoh**
> Void stopBridgeMoh(bridgeId)

Stop playing music on hold to a bridge.

This will only stop music on hold being played via POST bridges/{bridgeId}/moh.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String bridgeId = "bridgeId_example"; // String | Bridge's id
try {
    Void result = apiInstance.stopBridgeMoh(bridgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopBridgeMoh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bridgeId** | **String**| Bridge&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopChannelMoh"></a>
# **stopChannelMoh**
> Void stopChannelMoh(channelId)

Stop playing music on hold to a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.stopChannelMoh(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopChannelMoh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopChannelRing"></a>
# **stopChannelRing**
> Void stopChannelRing(channelId)

Stop ringing indication on a channel if locally generated.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.stopChannelRing(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopChannelRing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopChannelSilence"></a>
# **stopChannelSilence**
> Void stopChannelSilence(channelId)

Stop playing silence to a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.stopChannelSilence(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopChannelSilence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopLiveRecording"></a>
# **stopLiveRecording**
> Void stopLiveRecording(recordingName)

Stop a live recording and store it.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.stopLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopPlayback"></a>
# **stopPlayback**
> Void stopPlayback(playbackId)

Stop a playback.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String playbackId = "playbackId_example"; // String | Playback's id
try {
    Void result = apiInstance.stopPlayback(playbackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#stopPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playbackId** | **String**| Playback&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="subscribeToApplication"></a>
# **subscribeToApplication**
> Application subscribeToApplication(applicationName, eventSource)

Subscribe an application to a event source.

Returns the state of the application after the subscriptions have changed

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String applicationName = "applicationName_example"; // String | Application's name
List<String> eventSource = Arrays.asList("eventSource_example"); // List<String> | URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}
try {
    Application result = apiInstance.subscribeToApplication(applicationName, eventSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscribeToApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**| Application&#39;s name |
 **eventSource** | [**List&lt;String&gt;**](String.md)| URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName} |

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unhold"></a>
# **unhold**
> Void unhold(channelId)

Remove a channel from hold.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
try {
    Void result = apiInstance.unhold(channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unhold");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unloadAsteriskModule"></a>
# **unloadAsteriskModule**
> Void unloadAsteriskModule(moduleName)

Unload an Asterisk module.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String moduleName = "moduleName_example"; // String | Module's name
try {
    Void result = apiInstance.unloadAsteriskModule(moduleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unloadAsteriskModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moduleName** | **String**| Module&#39;s name |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unmute"></a>
# **unmute**
> Void unmute(channelId, direction)

Unmute a channel.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String channelId = "channelId_example"; // String | Channel's id
String direction = "both"; // String | Direction in which to unmute audio
try {
    Void result = apiInstance.unmute(channelId, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unmute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| Channel&#39;s id |
 **direction** | **String**| Direction in which to unmute audio | [optional] [default to both] [enum: both, in, out]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unmuteLiveRecording"></a>
# **unmuteLiveRecording**
> Void unmuteLiveRecording(recordingName)

Unmute a live recording.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.unmuteLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unmuteLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unpauseLiveRecording"></a>
# **unpauseLiveRecording**
> Void unpauseLiveRecording(recordingName)

Unpause a live recording.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String recordingName = "recordingName_example"; // String | The name of the recording
try {
    Void result = apiInstance.unpauseLiveRecording(recordingName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unpauseLiveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingName** | **String**| The name of the recording |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="unsubscribeFromApplication"></a>
# **unsubscribeFromApplication**
> Application unsubscribeFromApplication(applicationName, eventSource)

Unsubscribe an application from an event source.

Returns the state of the application after the subscriptions have changed

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String applicationName = "applicationName_example"; // String | Application's name
List<String> eventSource = Arrays.asList("eventSource_example"); // List<String> | URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName}
try {
    Application result = apiInstance.unsubscribeFromApplication(applicationName, eventSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#unsubscribeFromApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**| Application&#39;s name |
 **eventSource** | [**List&lt;String&gt;**](String.md)| URI for event source (channel:{channelId}, bridge:{bridgeId}, endpoint:{tech}[/{resource}], deviceState:{deviceName} |

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAsteriskConfigObject"></a>
# **updateAsteriskConfigObject**
> List&lt;ConfigTuple&gt; updateAsteriskConfigObject(configClass, objectType, id, fields)

Create or update a dynamic configuration object.

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String configClass = "configClass_example"; // String | The configuration class containing dynamic configuration objects.
String objectType = "objectType_example"; // String | The type of configuration object to create or update.
String id = "id_example"; // String | The unique identifier of the object to create or update.
ConfigObject fields = new ConfigObject(); // ConfigObject | The body object should have a value that is a list of ConfigTuples, which provide the fields to update. Ex. [ { \"attribute\": \"directmedia\", \"value\": \"false\" } ]
try {
    List<ConfigTuple> result = apiInstance.updateAsteriskConfigObject(configClass, objectType, id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateAsteriskConfigObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configClass** | **String**| The configuration class containing dynamic configuration objects. |
 **objectType** | **String**| The type of configuration object to create or update. |
 **id** | **String**| The unique identifier of the object to create or update. |
 **fields** | [**ConfigObject**](ConfigObject.md)| The body object should have a value that is a list of ConfigTuples, which provide the fields to update. Ex. [ { \&quot;attribute\&quot;: \&quot;directmedia\&quot;, \&quot;value\&quot;: \&quot;false\&quot; } ] | [optional]

### Return type

[**List&lt;ConfigTuple&gt;**](ConfigTuple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateDeviceState"></a>
# **updateDeviceState**
> Void updateDeviceState(deviceName, deviceState)

Change the state of a device controlled by ARI. (Note - implicitly creates the device state).

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String deviceName = "deviceName_example"; // String | Name of the device
String deviceState = "deviceState_example"; // String | Device state value
try {
    Void result = apiInstance.updateDeviceState(deviceName, deviceState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateDeviceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceName** | **String**| Name of the device |
 **deviceState** | **String**| Device state value | [enum: NOT_INUSE, INUSE, BUSY, INVALID, UNAVAILABLE, RINGING, RINGINUSE, ONHOLD]

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateMailbox"></a>
# **updateMailbox**
> Void updateMailbox(mailboxName, oldMessages, newMessages)

Change the state of a mailbox. (Note - implicitly creates the mailbox).

### Example
```java
// Import classes:
//import com.github.jasterisk.invoker.ApiException;
//import com.github.jasterisk.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String mailboxName = "mailboxName_example"; // String | Name of the mailbox
Integer oldMessages = 56; // Integer | Count of old messages in the mailbox
Integer newMessages = 56; // Integer | Count of new messages in the mailbox
try {
    Void result = apiInstance.updateMailbox(mailboxName, oldMessages, newMessages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailboxName** | **String**| Name of the mailbox |
 **oldMessages** | **Integer**| Count of old messages in the mailbox |
 **newMessages** | **Integer**| Count of new messages in the mailbox |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


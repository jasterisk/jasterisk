
# LiveRecording

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Base name for the recording | 
**format** | **String** | Recording format (wav, gsm, etc.) | 
**targetUri** | **String** | URI for the channel or bridge being recorded | 
**state** | **String** |  | 
**duration** | **Integer** | Duration in seconds of the recording |  [optional]
**talkingDuration** | **Integer** | Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds. |  [optional]
**silenceDuration** | **Integer** | Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds. |  [optional]
**cause** | **String** | Cause for recording failure if failed |  [optional]




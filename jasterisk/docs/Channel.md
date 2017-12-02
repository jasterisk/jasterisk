
# Channel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the channel.  This is the same as the Uniqueid field in AMI. | 
**name** | **String** | Name of the channel (i.e. SIP/foo-0000a7e3) | 
**state** | **String** |  | 
**caller** | [**CallerID**](CallerID.md) |  | 
**connected** | [**CallerID**](CallerID.md) |  | 
**accountcode** | **String** |  | 
**dialplan** | [**DialplanCEP**](DialplanCEP.md) | Current location in the dialplan | 
**creationtime** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when channel was created | 
**language** | **String** | The default spoken language | 
**channelvars** | **String** | Channel variables |  [optional]




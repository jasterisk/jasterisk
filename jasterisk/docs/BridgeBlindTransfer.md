
# BridgeBlindTransfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**Channel**](Channel.md) | The channel performing the blind transfer | 
**replaceChannel** | [**Channel**](Channel.md) | The channel that is replacing transferer when the transferee(s) can not be transferred directly |  [optional]
**transferee** | [**Channel**](Channel.md) | The channel that is being transferred |  [optional]
**exten** | **String** | The extension transferred to | 
**context** | **String** | The context transferred to | 
**result** | **String** | The result of the transfer attempt | 
**isExternal** | **Boolean** | Whether the transfer was externally initiated or not | 
**bridge** | [**Bridge**](Bridge.md) | The bridge being transferred |  [optional]





# BridgeAttendedTransfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transfererFirstLeg** | [**Channel**](Channel.md) | First leg of the transferer | 
**transfererSecondLeg** | [**Channel**](Channel.md) | Second leg of the transferer | 
**replaceChannel** | [**Channel**](Channel.md) | The channel that is replacing transferer_first_leg in the swap |  [optional]
**transferee** | [**Channel**](Channel.md) | The channel that is being transferred |  [optional]
**transferTarget** | [**Channel**](Channel.md) | The channel that is being transferred to |  [optional]
**result** | **String** | The result of the transfer attempt | 
**isExternal** | **Boolean** | Whether the transfer was externally initiated or not | 
**transfererFirstLegBridge** | [**Bridge**](Bridge.md) | Bridge the transferer first leg is in |  [optional]
**transfererSecondLegBridge** | [**Bridge**](Bridge.md) | Bridge the transferer second leg is in |  [optional]
**destinationType** | **String** | How the transfer was accomplished | 
**destinationBridge** | **String** | Bridge that survived the merge result |  [optional]
**destinationApplication** | **String** | Application that has been transferred into |  [optional]
**destinationLinkFirstLeg** | [**Channel**](Channel.md) | First leg of a link transfer result |  [optional]
**destinationLinkSecondLeg** | [**Channel**](Channel.md) | Second leg of a link transfer result |  [optional]
**destinationThreewayChannel** | [**Channel**](Channel.md) | Transferer channel that survived the threeway result |  [optional]
**destinationThreewayBridge** | [**Bridge**](Bridge.md) | Bridge that survived the threeway result |  [optional]




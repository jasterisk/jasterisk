
# TextMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message. | 
**to** | **String** | A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint. | 
**body** | **String** | The text of the message. | 
**variables** | [**List&lt;TextMessageVariable&gt;**](TextMessageVariable.md) | Technology specific key/value pairs associated with the message. |  [optional]




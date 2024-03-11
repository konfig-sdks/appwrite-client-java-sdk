

# AccountCreatePushTargetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetId** | **String** | Target ID. Choose a custom ID or generate a random ID with &#x60;ID.unique()&#x60;. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can&#39;t start with a special char. Max length is 36 chars. |  |
|**identifier** | **String** | The target identifier (token, email, phone etc.) |  |
|**providerId** | **String** | Provider ID. Message will be sent to this target from the specified provider ID. If no provider ID is set the first setup provider will be used. |  [optional] |






# Token

Token

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$id** | **String** | Token ID. |  |
|**$createdAt** | **String** | Token creation date in ISO 8601 format. |  |
|**userId** | **String** | User ID. |  |
|**secret** | **String** | Token secret key. This will return an empty string unless the response is returned using an API key or as part of a webhook payload. |  |
|**expire** | **String** | Token expiration date in ISO 8601 format. |  |
|**phrase** | **String** | Security phrase of a token. Empty if security phrase was not requested when creating a token. It includes randomly generated phrase which is also sent in the external resource such as email. |  |




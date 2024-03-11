

# Session

Session

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$id** | **String** | Session ID. |  |
|**$createdAt** | **String** | Session creation date in ISO 8601 format. |  |
|**userId** | **String** | User ID. |  |
|**expire** | **String** | Session expiration date in ISO 8601 format. |  |
|**provider** | **String** | Session Provider. |  |
|**providerUid** | **String** | Session Provider User ID. |  |
|**providerAccessToken** | **String** | Session Provider Access Token. |  |
|**providerAccessTokenExpiry** | **String** | The date of when the access token expires in ISO 8601 format. |  |
|**providerRefreshToken** | **String** | Session Provider Refresh Token. |  |
|**ip** | **String** | IP in use when the session was created. |  |
|**osCode** | **String** | Operating system code name. View list of [available options](https://github.com/appwrite/appwrite/blob/master/docs/lists/os.json). |  |
|**osName** | **String** | Operating system name. |  |
|**osVersion** | **String** | Operating system version. |  |
|**clientType** | **String** | Client type. |  |
|**clientCode** | **String** | Client code name. View list of [available options](https://github.com/appwrite/appwrite/blob/master/docs/lists/clients.json). |  |
|**clientName** | **String** | Client name. |  |
|**clientVersion** | **String** | Client version. |  |
|**clientEngine** | **String** | Client engine name. |  |
|**clientEngineVersion** | **String** | Client engine name. |  |
|**deviceName** | **String** | Device name. |  |
|**deviceBrand** | **String** | Device brand name. |  |
|**deviceModel** | **String** | Device model name. |  |
|**countryCode** | **String** | Country two-character ISO 3166-1 alpha code. |  |
|**countryName** | **String** | Country name. |  |
|**current** | **Boolean** | Returns true if this the current user session. |  |
|**factors** | **List&lt;String&gt;** | Returns a list of active session factors. |  |
|**secret** | **String** | Secret used to authenticate the user. Only included if the request was made with an API key |  |
|**mfaUpdatedAt** | **String** | Most recent date in ISO 8601 format when the session successfully passed MFA challenge. |  |




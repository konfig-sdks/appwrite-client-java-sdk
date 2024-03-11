

# AccountCreateMagicUrlTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | Unique Id. Choose a custom ID or generate a random ID with &#x60;ID.unique()&#x60;. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can&#39;t start with a special char. Max length is 36 chars. |  |
|**email** | **String** | User email. |  |
|**url** | **String** | URL to redirect the user back to your app from the magic URL login. Only URLs from hostnames in your project platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API. |  [optional] |
|**phrase** | **Boolean** | Toggle for security phrase. If enabled, email will be send with a randomly generated phrase and the phrase will also be included in the response. Confirming phrases match increases the security of your authentication flow. |  [optional] |




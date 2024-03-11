

# Execution

Execution

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$id** | **String** | Execution ID. |  |
|**$createdAt** | **String** | Execution creation date in ISO 8601 format. |  |
|**$updatedAt** | **String** | Execution upate date in ISO 8601 format. |  |
|**$permissions** | **List&lt;String&gt;** | Execution roles. |  |
|**functionId** | **String** | Function ID. |  |
|**trigger** | **String** | The trigger that caused the function to execute. Possible values can be: &#x60;http&#x60;, &#x60;schedule&#x60;, or &#x60;event&#x60;. |  |
|**status** | **String** | The status of the function execution. Possible values can be: &#x60;waiting&#x60;, &#x60;processing&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;. |  |
|**requestMethod** | **String** | HTTP request method type. |  |
|**requestPath** | **String** | HTTP request path and query. |  |
|**requestHeaders** | [**List&lt;Headers&gt;**](Headers.md) | HTTP response headers as a key-value object. This will return only whitelisted headers. All headers are returned if execution is created as synchronous. |  |
|**responseStatusCode** | **Integer** | HTTP response status code. |  |
|**responseBody** | **String** | HTTP response body. This will return empty unless execution is created as synchronous. |  |
|**responseHeaders** | [**List&lt;Headers&gt;**](Headers.md) | HTTP response headers as a key-value object. This will return only whitelisted headers. All headers are returned if execution is created as synchronous. |  |
|**logs** | **String** | Function logs. Includes the last 4,000 characters. This will return an empty string unless the response is returned using an API key or as part of a webhook payload. |  |
|**errors** | **String** | Function errors. Includes the last 4,000 characters. This will return an empty string unless the response is returned using an API key or as part of a webhook payload. |  |
|**duration** | **Double** | Function execution duration in seconds. |  |




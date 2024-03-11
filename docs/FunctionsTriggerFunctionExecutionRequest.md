

# FunctionsTriggerFunctionExecutionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | HTTP body of execution. Default value is empty string. |  [optional] |
|**async** | **Boolean** | Execute code in the background. Default value is false. |  [optional] |
|**path** | **String** | HTTP path of execution. Path can include query params. Default value is / |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | HTTP method of execution. Default value is GET. |  [optional] |
|**headers** | **Object** | HTTP headers of execution. Defaults to empty. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| PATCH | &quot;PATCH&quot; |
| DELETE | &quot;DELETE&quot; |
| OPTIONS | &quot;OPTIONS&quot; |




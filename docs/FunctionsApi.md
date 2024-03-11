# FunctionsApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExecutionLog**](FunctionsApi.md#getExecutionLog) | **GET** /functions/{functionId}/executions/{executionId} | Get execution |
| [**listExecutions**](FunctionsApi.md#listExecutions) | **GET** /functions/{functionId}/executions | List executions |
| [**triggerFunctionExecution**](FunctionsApi.md#triggerFunctionExecution) | **POST** /functions/{functionId}/executions | Create execution |


<a name="getExecutionLog"></a>
# **getExecutionLog**
> Execution getExecutionLog(functionId, executionId).execute();

Get execution

Get a function execution log by its unique ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.jWT  = "YOUR API KEY";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String functionId = "functionId_example"; // Function ID.
    String executionId = "executionId_example"; // Execution ID.
    try {
      Execution result = client
              .functions
              .getExecutionLog(functionId, executionId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.get$Permissions());
      System.out.println(result.getFunctionId());
      System.out.println(result.getTrigger());
      System.out.println(result.getStatus());
      System.out.println(result.getRequestMethod());
      System.out.println(result.getRequestPath());
      System.out.println(result.getRequestHeaders());
      System.out.println(result.getResponseStatusCode());
      System.out.println(result.getResponseBody());
      System.out.println(result.getResponseHeaders());
      System.out.println(result.getLogs());
      System.out.println(result.getErrors());
      System.out.println(result.getDuration());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#getExecutionLog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Execution> response = client
              .functions
              .getExecutionLog(functionId, executionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#getExecutionLog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **String**| Function ID. | |
| **executionId** | **String**| Execution ID. | |

### Return type

[**Execution**](Execution.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Execution |  -  |

<a name="listExecutions"></a>
# **listExecutions**
> ExecutionList listExecutions(functionId).queries(queries).search(search).execute();

List executions

Get a list of all the current user function execution logs. You can use the query params to filter your results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.jWT  = "YOUR API KEY";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String functionId = "functionId_example"; // Function ID.
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: trigger, status, responseStatusCode, duration
    String search = ""; // Search term to filter your list results. Max length: 256 chars.
    try {
      ExecutionList result = client
              .functions
              .listExecutions(functionId)
              .queries(queries)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getExecutions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#listExecutions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExecutionList> response = client
              .functions
              .listExecutions(functionId)
              .queries(queries)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#listExecutions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **String**| Function ID. | |
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: trigger, status, responseStatusCode, duration | [optional] |
| **search** | **String**| Search term to filter your list results. Max length: 256 chars. | [optional] [default to ] |

### Return type

[**ExecutionList**](ExecutionList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Executions List |  -  |

<a name="triggerFunctionExecution"></a>
# **triggerFunctionExecution**
> Execution triggerFunctionExecution(functionId).functionsTriggerFunctionExecutionRequest(functionsTriggerFunctionExecutionRequest).execute();

Create execution

Trigger a function execution. The returned object will return you the current execution status. You can ping the &#x60;Get Execution&#x60; endpoint to get updates on the current execution status. Once this endpoint is called, your function execution process will start asynchronously.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.jWT  = "YOUR API KEY";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String functionId = "functionId_example"; // Function ID.
    String body = "body_example"; // HTTP body of execution. Default value is empty string.
    Boolean async = true; // Execute code in the background. Default value is false.
    String path = "path_example"; // HTTP path of execution. Path can include query params. Default value is /
    String method = "GET"; // HTTP method of execution. Default value is GET.
    Object headers = null; // HTTP headers of execution. Defaults to empty.
    try {
      Execution result = client
              .functions
              .triggerFunctionExecution(functionId)
              .body(body)
              .async(async)
              .path(path)
              .method(method)
              .headers(headers)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.get$Permissions());
      System.out.println(result.getFunctionId());
      System.out.println(result.getTrigger());
      System.out.println(result.getStatus());
      System.out.println(result.getRequestMethod());
      System.out.println(result.getRequestPath());
      System.out.println(result.getRequestHeaders());
      System.out.println(result.getResponseStatusCode());
      System.out.println(result.getResponseBody());
      System.out.println(result.getResponseHeaders());
      System.out.println(result.getLogs());
      System.out.println(result.getErrors());
      System.out.println(result.getDuration());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#triggerFunctionExecution");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Execution> response = client
              .functions
              .triggerFunctionExecution(functionId)
              .body(body)
              .async(async)
              .path(path)
              .method(method)
              .headers(headers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsApi#triggerFunctionExecution");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **String**| Function ID. | |
| **functionsTriggerFunctionExecutionRequest** | [**FunctionsTriggerFunctionExecutionRequest**](FunctionsTriggerFunctionExecutionRequest.md)|  | [optional] |

### Return type

[**Execution**](Execution.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Execution |  -  |


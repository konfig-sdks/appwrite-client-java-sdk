# MessagingApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewSubscriber**](MessagingApi.md#addNewSubscriber) | **POST** /messaging/topics/{topicId}/subscribers | Create subscriber |
| [**deleteSubscriberById**](MessagingApi.md#deleteSubscriberById) | **DELETE** /messaging/topics/{topicId}/subscribers/{subscriberId} | Delete subscriber |


<a name="addNewSubscriber"></a>
# **addNewSubscriber**
> Subscriber addNewSubscriber(topicId).messagingAddNewSubscriberRequest(messagingAddNewSubscriberRequest).execute();

Create subscriber

Create a new subscriber.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagingApi;
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
    String subscriberId = "subscriberId_example"; // Subscriber ID. Choose a custom Subscriber ID or a new Subscriber ID.
    String targetId = "targetId_example"; // Target ID. The target ID to link to the specified Topic ID.
    String topicId = "topicId_example"; // Topic ID. The topic ID to subscribe to.
    try {
      Subscriber result = client
              .messaging
              .addNewSubscriber(subscriberId, targetId, topicId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getTargetId());
      System.out.println(result.getTarget());
      System.out.println(result.getUserId());
      System.out.println(result.getUserName());
      System.out.println(result.getTopicId());
      System.out.println(result.getProviderType());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#addNewSubscriber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscriber> response = client
              .messaging
              .addNewSubscriber(subscriberId, targetId, topicId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#addNewSubscriber");
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
| **topicId** | **String**| Topic ID. The topic ID to subscribe to. | |
| **messagingAddNewSubscriberRequest** | [**MessagingAddNewSubscriberRequest**](MessagingAddNewSubscriberRequest.md)|  | [optional] |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Subscriber |  -  |

<a name="deleteSubscriberById"></a>
# **deleteSubscriberById**
> deleteSubscriberById(topicId, subscriberId).execute();

Delete subscriber

Delete a subscriber by its unique ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagingApi;
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
    String topicId = "topicId_example"; // Topic ID. The topic ID subscribed to.
    String subscriberId = "subscriberId_example"; // Subscriber ID.
    try {
      client
              .messaging
              .deleteSubscriberById(topicId, subscriberId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#deleteSubscriberById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messaging
              .deleteSubscriberById(topicId, subscriberId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagingApi#deleteSubscriberById");
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
| **topicId** | **String**| Topic ID. The topic ID subscribed to. | |
| **subscriberId** | **String**| Subscriber ID. | |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |


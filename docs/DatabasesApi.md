# DatabasesApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocument**](DatabasesApi.md#createDocument) | **POST** /databases/{databaseId}/collections/{collectionId}/documents | Create document |
| [**deleteDocumentById**](DatabasesApi.md#deleteDocumentById) | **DELETE** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Delete document |
| [**getDocumentById**](DatabasesApi.md#getDocumentById) | **GET** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Get document |
| [**listUserDocuments**](DatabasesApi.md#listUserDocuments) | **GET** /databases/{databaseId}/collections/{collectionId}/documents | List documents |
| [**updateDocumentById**](DatabasesApi.md#updateDocumentById) | **PATCH** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Update document |


<a name="createDocument"></a>
# **createDocument**
> Document createDocument(databaseId, collectionId).databasesCreateDocumentRequest(databasesCreateDocumentRequest).execute();

Create document

Create a new Document. Before using this route, you should create a new collection resource using either a [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection) API or directly from your database console.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabasesApi;
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
    String documentId = "documentId_example"; // Document ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    Object data = null; // Document data as JSON object.
    String databaseId = "databaseId_example"; // Database ID.
    String collectionId = "collectionId_example"; // Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection). Make sure to define attributes before creating documents.
    List<String> permissions = Arrays.asList(); // An array of permissions strings. By default, only the current user is granted all permissions. [Learn more about permissions](https://appwrite.io/docs/permissions).
    try {
      Document result = client
              .databases
              .createDocument(documentId, data, databaseId, collectionId)
              .permissions(permissions)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CollectionId());
      System.out.println(result.get$DatabaseId());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.get$Permissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#createDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Document> response = client
              .databases
              .createDocument(documentId, data, databaseId, collectionId)
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#createDocument");
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
| **databaseId** | **String**| Database ID. | |
| **collectionId** | **String**| Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection). Make sure to define attributes before creating documents. | |
| **databasesCreateDocumentRequest** | [**DatabasesCreateDocumentRequest**](DatabasesCreateDocumentRequest.md)|  | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Document |  -  |

<a name="deleteDocumentById"></a>
# **deleteDocumentById**
> deleteDocumentById(databaseId, collectionId, documentId).execute();

Delete document

Delete a document by its unique ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabasesApi;
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
    String databaseId = "databaseId_example"; // Database ID.
    String collectionId = "collectionId_example"; // Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection).
    String documentId = "documentId_example"; // Document ID.
    try {
      client
              .databases
              .deleteDocumentById(databaseId, collectionId, documentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#deleteDocumentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .databases
              .deleteDocumentById(databaseId, collectionId, documentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#deleteDocumentById");
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
| **databaseId** | **String**| Database ID. | |
| **collectionId** | **String**| Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection). | |
| **documentId** | **String**| Document ID. | |

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

<a name="getDocumentById"></a>
# **getDocumentById**
> Document getDocumentById(databaseId, collectionId, documentId).queries(queries).execute();

Get document

Get a document by its unique ID. This endpoint response returns a JSON object with the document data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabasesApi;
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
    String databaseId = "databaseId_example"; // Database ID.
    String collectionId = "collectionId_example"; // Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection).
    String documentId = "documentId_example"; // Document ID.
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long.
    try {
      Document result = client
              .databases
              .getDocumentById(databaseId, collectionId, documentId)
              .queries(queries)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CollectionId());
      System.out.println(result.get$DatabaseId());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.get$Permissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#getDocumentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Document> response = client
              .databases
              .getDocumentById(databaseId, collectionId, documentId)
              .queries(queries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#getDocumentById");
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
| **databaseId** | **String**| Database ID. | |
| **collectionId** | **String**| Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection). | |
| **documentId** | **String**| Document ID. | |
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document |  -  |

<a name="listUserDocuments"></a>
# **listUserDocuments**
> DocumentList listUserDocuments(databaseId, collectionId).queries(queries).execute();

List documents

Get a list of all the user&#39;s documents in a given collection. You can use the query params to filter your results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabasesApi;
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
    String databaseId = "databaseId_example"; // Database ID.
    String collectionId = "collectionId_example"; // Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection).
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long.
    try {
      DocumentList result = client
              .databases
              .listUserDocuments(databaseId, collectionId)
              .queries(queries)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getDocuments());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#listUserDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentList> response = client
              .databases
              .listUserDocuments(databaseId, collectionId)
              .queries(queries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#listUserDocuments");
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
| **databaseId** | **String**| Database ID. | |
| **collectionId** | **String**| Collection ID. You can create a new collection using the Database service [server integration](https://appwrite.io/docs/server/databases#databasesCreateCollection). | |
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. | [optional] |

### Return type

[**DocumentList**](DocumentList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Documents List |  -  |

<a name="updateDocumentById"></a>
# **updateDocumentById**
> Document updateDocumentById(databaseId, collectionId, documentId).databasesUpdateDocumentByIdRequest(databasesUpdateDocumentByIdRequest).execute();

Update document

Update a document by its unique ID. Using the patch method you can pass only specific fields that will get updated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabasesApi;
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
    String databaseId = "databaseId_example"; // Database ID.
    String collectionId = "collectionId_example"; // Collection ID.
    String documentId = "documentId_example"; // Document ID.
    Object data = null; // Document data as JSON object. Include only attribute and value pairs to be updated.
    List<String> permissions = Arrays.asList(); // An array of permissions strings. By default, the current permissions are inherited. [Learn more about permissions](https://appwrite.io/docs/permissions).
    try {
      Document result = client
              .databases
              .updateDocumentById(databaseId, collectionId, documentId)
              .data(data)
              .permissions(permissions)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CollectionId());
      System.out.println(result.get$DatabaseId());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.get$Permissions());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#updateDocumentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Document> response = client
              .databases
              .updateDocumentById(databaseId, collectionId, documentId)
              .data(data)
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabasesApi#updateDocumentById");
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
| **databaseId** | **String**| Database ID. | |
| **collectionId** | **String**| Collection ID. | |
| **documentId** | **String**| Document ID. | |
| **databasesUpdateDocumentByIdRequest** | [**DatabasesUpdateDocumentByIdRequest**](DatabasesUpdateDocumentByIdRequest.md)|  | [optional] |

### Return type

[**Document**](Document.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document |  -  |


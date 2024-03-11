# StorageApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFile**](StorageApi.md#createFile) | **POST** /storage/buckets/{bucketId}/files | Create file |
| [**deleteFileById**](StorageApi.md#deleteFileById) | **DELETE** /storage/buckets/{bucketId}/files/{fileId} | Delete File |
| [**getFileById**](StorageApi.md#getFileById) | **GET** /storage/buckets/{bucketId}/files/{fileId} | Get file |
| [**getFileDownload**](StorageApi.md#getFileDownload) | **GET** /storage/buckets/{bucketId}/files/{fileId}/download | Get file for download |
| [**getFileForView**](StorageApi.md#getFileForView) | **GET** /storage/buckets/{bucketId}/files/{fileId}/view | Get file for view |
| [**getFilePreviewImage**](StorageApi.md#getFilePreviewImage) | **GET** /storage/buckets/{bucketId}/files/{fileId}/preview | Get file preview |
| [**listFiles**](StorageApi.md#listFiles) | **GET** /storage/buckets/{bucketId}/files | List files |
| [**updateFileById**](StorageApi.md#updateFileById) | **PUT** /storage/buckets/{bucketId}/files/{fileId} | Update file |


<a name="createFile"></a>
# **createFile**
> File createFile(bucketId, fileId, _file).permissions(permissions).storageCreateFileRequest(storageCreateFileRequest).execute();

Create file

Create a new file. Before using this route, you should create a new bucket resource using either a [server integration](https://appwrite.io/docs/server/storage#storageCreateBucket) API or directly from your Appwrite console.  Larger files should be uploaded using multiple requests with the [content-range](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Range) header to send a partial request with a maximum supported chunk of &#x60;5MB&#x60;. The &#x60;content-range&#x60; header values should always be in bytes.  When the first request is sent, the server will return the **File** object, and the subsequent part request must include the file&#39;s **id** in &#x60;x-appwrite-id&#x60; header to allow the server to know that the partial upload is for the existing file and not for a new one.  If you&#39;re creating a new file using one of the Appwrite SDKs, all the chunking logic will be managed by the SDK internally. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String _file = "_file_example"; // Binary file. Appwrite SDKs provide helpers to handle file input. [Learn about file input](https://appwrite.io/docs/storage#file-input).
    List<String> permissions = Arrays.asList(); // An array of permission strings. By default, only the current user is granted all permissions. [Learn more about permissions](https://appwrite.io/docs/permissions).
    try {
      File result = client
              .storage
              .createFile(bucketId, fileId, _file)
              .permissions(permissions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#createFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .storage
              .createFile(bucketId, fileId, _file)
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#createFile");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID. Choose a custom ID or generate a random ID with &#x60;ID.unique()&#x60;. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can&#39;t start with a special char. Max length is 36 chars. | |
| **_file** | **String**| Binary file. Appwrite SDKs provide helpers to handle file input. [Learn about file input](https://appwrite.io/docs/storage#file-input). | |
| **permissions** | [**List&lt;String&gt;**](String.md)| An array of permission strings. By default, only the current user is granted all permissions. [Learn more about permissions](https://appwrite.io/docs/permissions). | [optional] |
| **storageCreateFileRequest** | [**StorageCreateFileRequest**](StorageCreateFileRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | File |  -  |

<a name="deleteFileById"></a>
# **deleteFileById**
> deleteFileById(bucketId, fileId).execute();

Delete File

Delete a file by its unique ID. Only users with write permissions have access to delete this resource.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID.
    try {
      client
              .storage
              .deleteFileById(bucketId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#deleteFileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .storage
              .deleteFileById(bucketId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#deleteFileById");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID. | |

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

<a name="getFileById"></a>
# **getFileById**
> File getFileById(bucketId, fileId).execute();

Get file

Get a file by its unique ID. This endpoint response returns a JSON object with the file metadata.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID.
    try {
      File result = client
              .storage
              .getFileById(bucketId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .storage
              .getFileById(bucketId, fileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileById");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID. | |

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File |  -  |

<a name="getFileDownload"></a>
# **getFileDownload**
> getFileDownload(bucketId, fileId).execute();

Get file for download

Get a file content by its unique ID. The endpoint response return with a &#39;Content-Disposition: attachment&#39; header that tells the browser to start downloading the file to user downloads directory.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID.
    try {
      client
              .storage
              .getFileDownload(bucketId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileDownload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .storage
              .getFileDownload(bucketId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileDownload");
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
| **bucketId** | **String**| Storage bucket ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID. | |

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
| **200** | File |  -  |

<a name="getFileForView"></a>
# **getFileForView**
> getFileForView(bucketId, fileId).execute();

Get file for view

Get a file content by its unique ID. This endpoint is similar to the download method but returns with no  &#39;Content-Disposition: attachment&#39; header.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID.
    try {
      client
              .storage
              .getFileForView(bucketId, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileForView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .storage
              .getFileForView(bucketId, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFileForView");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID. | |

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
| **200** | File |  -  |

<a name="getFilePreviewImage"></a>
# **getFilePreviewImage**
> getFilePreviewImage(bucketId, fileId).width(width).height(height).gravity(gravity).quality(quality).borderWidth(borderWidth).borderColor(borderColor).borderRadius(borderRadius).opacity(opacity).rotation(rotation).background(background).output(output).execute();

Get file preview

Get a file preview image. Currently, this method supports preview for image files (jpg, png, and gif), other supported formats, like pdf, docs, slides, and spreadsheets, will return the file icon image. You can also pass query string arguments for cutting and resizing your preview image. Preview is supported only for image files smaller than 10MB.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File ID
    Integer width = 0; // Resize preview image width, Pass an integer between 0 to 4000.
    Integer height = 0; // Resize preview image height, Pass an integer between 0 to 4000.
    String gravity = "center"; // Image crop gravity. Can be one of center,top-left,top,top-right,left,right,bottom-left,bottom,bottom-right
    Integer quality = 100; // Preview image quality. Pass an integer between 0 to 100. Defaults to 100.
    Integer borderWidth = 0; // Preview image border in pixels. Pass an integer between 0 to 100. Defaults to 0.
    String borderColor = ""; // Preview image border color. Use a valid HEX color, no # is needed for prefix.
    Integer borderRadius = 0; // Preview image border radius in pixels. Pass an integer between 0 to 4000.
    Float opacity = 1F; // Preview image opacity. Only works with images having an alpha channel (like png). Pass a number between 0 to 1.
    Integer rotation = 0; // Preview image rotation in degrees. Pass an integer between -360 and 360.
    String background = ""; // Preview image background color. Only works with transparent images (png). Use a valid HEX color, no # is needed for prefix.
    String output = "jpg"; // Output format type (jpeg, jpg, png, gif and webp).
    try {
      client
              .storage
              .getFilePreviewImage(bucketId, fileId)
              .width(width)
              .height(height)
              .gravity(gravity)
              .quality(quality)
              .borderWidth(borderWidth)
              .borderColor(borderColor)
              .borderRadius(borderRadius)
              .opacity(opacity)
              .rotation(rotation)
              .background(background)
              .output(output)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFilePreviewImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .storage
              .getFilePreviewImage(bucketId, fileId)
              .width(width)
              .height(height)
              .gravity(gravity)
              .quality(quality)
              .borderWidth(borderWidth)
              .borderColor(borderColor)
              .borderRadius(borderRadius)
              .opacity(opacity)
              .rotation(rotation)
              .background(background)
              .output(output)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getFilePreviewImage");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File ID | |
| **width** | **Integer**| Resize preview image width, Pass an integer between 0 to 4000. | [optional] [default to 0] |
| **height** | **Integer**| Resize preview image height, Pass an integer between 0 to 4000. | [optional] [default to 0] |
| **gravity** | **String**| Image crop gravity. Can be one of center,top-left,top,top-right,left,right,bottom-left,bottom,bottom-right | [optional] [default to center] [enum: center, top-left, top, top-right, left, right, bottom-left, bottom, bottom-right] |
| **quality** | **Integer**| Preview image quality. Pass an integer between 0 to 100. Defaults to 100. | [optional] [default to 100] |
| **borderWidth** | **Integer**| Preview image border in pixels. Pass an integer between 0 to 100. Defaults to 0. | [optional] [default to 0] |
| **borderColor** | **String**| Preview image border color. Use a valid HEX color, no # is needed for prefix. | [optional] [default to ] |
| **borderRadius** | **Integer**| Preview image border radius in pixels. Pass an integer between 0 to 4000. | [optional] [default to 0] |
| **opacity** | **Float**| Preview image opacity. Only works with images having an alpha channel (like png). Pass a number between 0 to 1. | [optional] [default to 1] |
| **rotation** | **Integer**| Preview image rotation in degrees. Pass an integer between -360 and 360. | [optional] [default to 0] |
| **background** | **String**| Preview image background color. Only works with transparent images (png). Use a valid HEX color, no # is needed for prefix. | [optional] [default to ] |
| **output** | **String**| Output format type (jpeg, jpg, png, gif and webp). | [optional] [default to ] [enum: jpg, jpeg, gif, png, webp] |

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
| **200** | Image |  -  |

<a name="listFiles"></a>
# **listFiles**
> FileList listFiles(bucketId).queries(queries).search(search).execute();

List files

Get a list of all the user files. You can use the query params to filter your results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: name, signature, mimeType, sizeOriginal, chunksTotal, chunksUploaded
    String search = ""; // Search term to filter your list results. Max length: 256 chars.
    try {
      FileList result = client
              .storage
              .listFiles(bucketId)
              .queries(queries)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#listFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileList> response = client
              .storage
              .listFiles(bucketId)
              .queries(queries)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#listFiles");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: name, signature, mimeType, sizeOriginal, chunksTotal, chunksUploaded | [optional] |
| **search** | **String**| Search term to filter your list results. Max length: 256 chars. | [optional] [default to ] |

### Return type

[**FileList**](FileList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files List |  -  |

<a name="updateFileById"></a>
# **updateFileById**
> File updateFileById(bucketId, fileId).storageUpdateFileByIdRequest(storageUpdateFileByIdRequest).execute();

Update file

Update a file by its unique ID. Only users with write permissions have access to update this resource.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StorageApi;
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
    String bucketId = "bucketId_example"; // Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket).
    String fileId = "fileId_example"; // File unique ID.
    String name = "name_example"; // Name of the file
    List<String> permissions = Arrays.asList(); // An array of permission string. By default, the current permissions are inherited. [Learn more about permissions](https://appwrite.io/docs/permissions).
    try {
      File result = client
              .storage
              .updateFileById(bucketId, fileId)
              .name(name)
              .permissions(permissions)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#updateFileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .storage
              .updateFileById(bucketId, fileId)
              .name(name)
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#updateFileById");
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
| **bucketId** | **String**| Storage bucket unique ID. You can create a new storage bucket using the Storage service [server integration](https://appwrite.io/docs/server/storage#createBucket). | |
| **fileId** | **String**| File unique ID. | |
| **storageUpdateFileByIdRequest** | [**StorageUpdateFileByIdRequest**](StorageUpdateFileByIdRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File |  -  |


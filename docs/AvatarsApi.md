# AvatarsApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateQrCodeImage**](AvatarsApi.md#generateQrCodeImage) | **GET** /avatars/qr | Get QR code |
| [**getBrowserIconByCode**](AvatarsApi.md#getBrowserIconByCode) | **GET** /avatars/browsers/{code} | Get browser icon |
| [**getCountryFlagByCode**](AvatarsApi.md#getCountryFlagByCode) | **GET** /avatars/flags/{code} | Get country flag |
| [**getCreditCardIcon**](AvatarsApi.md#getCreditCardIcon) | **GET** /avatars/credit-cards/{code} | Get credit card icon |
| [**getFavicon**](AvatarsApi.md#getFavicon) | **GET** /avatars/favicon | Get favicon |
| [**getRemoteImage**](AvatarsApi.md#getRemoteImage) | **GET** /avatars/image | Get image from URL |
| [**getUserInitials**](AvatarsApi.md#getUserInitials) | **GET** /avatars/initials | Get user initials |


<a name="generateQrCodeImage"></a>
# **generateQrCodeImage**
> generateQrCodeImage(text).size(size).margin(margin).download(download).execute();

Get QR code

Converts a given plain text to a QR code image. You can use the query parameters to change the size and style of the resulting image. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String text = "text_example"; // Plain text to be converted to QR code image.
    Integer size = 400; // QR code size. Pass an integer between 1 to 1000. Defaults to 400.
    Integer margin = 1; // Margin from edge. Pass an integer between 0 to 10. Defaults to 1.
    Boolean download = false; // Return resulting image with 'Content-Disposition: attachment ' headers for the browser to start downloading it. Pass 0 for no header, or 1 for otherwise. Default value is set to 0.
    try {
      client
              .avatars
              .generateQrCodeImage(text)
              .size(size)
              .margin(margin)
              .download(download)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#generateQrCodeImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .generateQrCodeImage(text)
              .size(size)
              .margin(margin)
              .download(download)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#generateQrCodeImage");
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
| **text** | **String**| Plain text to be converted to QR code image. | |
| **size** | **Integer**| QR code size. Pass an integer between 1 to 1000. Defaults to 400. | [optional] [default to 400] |
| **margin** | **Integer**| Margin from edge. Pass an integer between 0 to 10. Defaults to 1. | [optional] [default to 1] |
| **download** | **Boolean**| Return resulting image with &#39;Content-Disposition: attachment &#39; headers for the browser to start downloading it. Pass 0 for no header, or 1 for otherwise. Default value is set to 0. | [optional] [default to false] |

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

<a name="getBrowserIconByCode"></a>
# **getBrowserIconByCode**
> getBrowserIconByCode(code).width(width).height(height).quality(quality).execute();

Get browser icon

You can use this endpoint to show different browser icons to your users. The code argument receives the browser code as it appears in your user [GET /account/sessions](https://appwrite.io/docs/references/cloud/client-web/account#getSessions) endpoint. Use width, height and quality arguments to change the output settings.  When one dimension is specified and the other is 0, the image is scaled with preserved aspect ratio. If both dimensions are 0, the API provides an image at source quality. If dimensions are not specified, the default size of image returned is 100x100px.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String code = "aa"; // Browser Code.
    Integer width = 100; // Image width. Pass an integer between 0 to 2000. Defaults to 100.
    Integer height = 100; // Image height. Pass an integer between 0 to 2000. Defaults to 100.
    Integer quality = 100; // Image quality. Pass an integer between 0 to 100. Defaults to 100.
    try {
      client
              .avatars
              .getBrowserIconByCode(code)
              .width(width)
              .height(height)
              .quality(quality)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getBrowserIconByCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getBrowserIconByCode(code)
              .width(width)
              .height(height)
              .quality(quality)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getBrowserIconByCode");
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
| **code** | **String**| Browser Code. | [enum: aa, an, ch, ci, cm, cr, ff, sf, mf, ps, oi, om, op, true] |
| **width** | **Integer**| Image width. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **height** | **Integer**| Image height. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **quality** | **Integer**| Image quality. Pass an integer between 0 to 100. Defaults to 100. | [optional] [default to 100] |

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

<a name="getCountryFlagByCode"></a>
# **getCountryFlagByCode**
> getCountryFlagByCode(code).width(width).height(height).quality(quality).execute();

Get country flag

You can use this endpoint to show different country flags icons to your users. The code argument receives the 2 letter country code. Use width, height and quality arguments to change the output settings. Country codes follow the [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) standard.  When one dimension is specified and the other is 0, the image is scaled with preserved aspect ratio. If both dimensions are 0, the API provides an image at source quality. If dimensions are not specified, the default size of image returned is 100x100px. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String code = "af"; // Country Code. ISO Alpha-2 country code format.
    Integer width = 100; // Image width. Pass an integer between 0 to 2000. Defaults to 100.
    Integer height = 100; // Image height. Pass an integer between 0 to 2000. Defaults to 100.
    Integer quality = 100; // Image quality. Pass an integer between 0 to 100. Defaults to 100.
    try {
      client
              .avatars
              .getCountryFlagByCode(code)
              .width(width)
              .height(height)
              .quality(quality)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getCountryFlagByCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getCountryFlagByCode(code)
              .width(width)
              .height(height)
              .quality(quality)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getCountryFlagByCode");
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
| **code** | **String**| Country Code. ISO Alpha-2 country code format. | [enum: af, ao, al, ad, ae, ar, am, ag, au, at, az, bi, be, bj, bf, bd, bg, bh, bs, ba, by, bz, bo, br, bb, bn, bt, bw, cf, ca, ch, cl, cn, ci, cm, cd, cg, co, km, cv, cr, cu, cy, cz, de, dj, dm, dk, do, dz, ec, eg, er, es, ee, et, fi, fj, fr, fm, ga, gb, ge, gh, gn, gm, gw, gq, gr, gd, gt, gy, hn, hr, ht, hu, id, in, ie, ir, iq, is, il, it, jm, jo, jp, kz, ke, kg, kh, ki, kn, kr, kw, la, lb, lr, ly, lc, li, lk, ls, lt, lu, lv, ma, mc, md, mg, mv, mx, mh, mk, ml, mt, mm, me, mn, mz, mr, mu, mw, my, na, ne, ng, ni, nl, false, np, nr, nz, om, pk, pa, pe, ph, pw, pg, pl, kp, pt, py, qa, ro, ru, rw, sa, sd, sn, sg, sb, sl, sv, sm, so, rs, ss, st, sr, sk, si, se, sz, sc, sy, td, tg, th, tj, tm, tl, to, tt, tn, tr, tv, tz, ug, ua, uy, us, uz, va, vc, ve, vn, vu, ws, ye, za, zm, zw] |
| **width** | **Integer**| Image width. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **height** | **Integer**| Image height. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **quality** | **Integer**| Image quality. Pass an integer between 0 to 100. Defaults to 100. | [optional] [default to 100] |

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

<a name="getCreditCardIcon"></a>
# **getCreditCardIcon**
> getCreditCardIcon(code).width(width).height(height).quality(quality).execute();

Get credit card icon

The credit card endpoint will return you the icon of the credit card provider you need. Use width, height and quality arguments to change the output settings.  When one dimension is specified and the other is 0, the image is scaled with preserved aspect ratio. If both dimensions are 0, the API provides an image at source quality. If dimensions are not specified, the default size of image returned is 100x100px. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String code = "amex"; // Credit Card Code. Possible values: amex, argencard, cabal, censosud, diners, discover, elo, hipercard, jcb, mastercard, naranja, targeta-shopping, union-china-pay, visa, mir, maestro.
    Integer width = 100; // Image width. Pass an integer between 0 to 2000. Defaults to 100.
    Integer height = 100; // Image height. Pass an integer between 0 to 2000. Defaults to 100.
    Integer quality = 100; // Image quality. Pass an integer between 0 to 100. Defaults to 100.
    try {
      client
              .avatars
              .getCreditCardIcon(code)
              .width(width)
              .height(height)
              .quality(quality)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getCreditCardIcon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getCreditCardIcon(code)
              .width(width)
              .height(height)
              .quality(quality)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getCreditCardIcon");
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
| **code** | **String**| Credit Card Code. Possible values: amex, argencard, cabal, censosud, diners, discover, elo, hipercard, jcb, mastercard, naranja, targeta-shopping, union-china-pay, visa, mir, maestro. | [enum: amex, argencard, cabal, censosud, diners, discover, elo, hipercard, jcb, mastercard, naranja, targeta-shopping, union-china-pay, visa, mir, maestro] |
| **width** | **Integer**| Image width. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **height** | **Integer**| Image height. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 100] |
| **quality** | **Integer**| Image quality. Pass an integer between 0 to 100. Defaults to 100. | [optional] [default to 100] |

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

<a name="getFavicon"></a>
# **getFavicon**
> getFavicon(url).execute();

Get favicon

Use this endpoint to fetch the favorite icon (AKA favicon) of any remote website URL. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String url = "url_example"; // Website URL which you want to fetch the favicon from.
    try {
      client
              .avatars
              .getFavicon(url)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getFavicon");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getFavicon(url)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getFavicon");
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
| **url** | **String**| Website URL which you want to fetch the favicon from. | |

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

<a name="getRemoteImage"></a>
# **getRemoteImage**
> getRemoteImage(url).width(width).height(height).execute();

Get image from URL

Use this endpoint to fetch a remote image URL and crop it to any image size you want. This endpoint is very useful if you need to crop and display remote images in your app or in case you want to make sure a 3rd party image is properly served using a TLS protocol.  When one dimension is specified and the other is 0, the image is scaled with preserved aspect ratio. If both dimensions are 0, the API provides an image at source quality. If dimensions are not specified, the default size of image returned is 400x400px. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String url = "url_example"; // Image URL which you want to crop.
    Integer width = 400; // Resize preview image width, Pass an integer between 0 to 2000. Defaults to 400.
    Integer height = 400; // Resize preview image height, Pass an integer between 0 to 2000. Defaults to 400.
    try {
      client
              .avatars
              .getRemoteImage(url)
              .width(width)
              .height(height)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getRemoteImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getRemoteImage(url)
              .width(width)
              .height(height)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getRemoteImage");
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
| **url** | **String**| Image URL which you want to crop. | |
| **width** | **Integer**| Resize preview image width, Pass an integer between 0 to 2000. Defaults to 400. | [optional] [default to 400] |
| **height** | **Integer**| Resize preview image height, Pass an integer between 0 to 2000. Defaults to 400. | [optional] [default to 400] |

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

<a name="getUserInitials"></a>
# **getUserInitials**
> getUserInitials().name(name).width(width).height(height).background(background).execute();

Get user initials

Use this endpoint to show your user initials avatar icon on your website or app. By default, this route will try to print your logged-in user name or email initials. You can also overwrite the user name if you pass the &#39;name&#39; parameter. If no name is given and no user is logged, an empty avatar will be returned.  You can use the color and background params to change the avatar colors. By default, a random theme will be selected. The random theme will persist for the user&#39;s initials when reloading the same theme will always return for the same initials.  When one dimension is specified and the other is 0, the image is scaled with preserved aspect ratio. If both dimensions are 0, the API provides an image at source quality. If dimensions are not specified, the default size of image returned is 100x100px. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarsApi;
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
    String name = ""; // Full Name. When empty, current user name or email will be used. Max length: 128 chars.
    Integer width = 500; // Image width. Pass an integer between 0 to 2000. Defaults to 100.
    Integer height = 500; // Image height. Pass an integer between 0 to 2000. Defaults to 100.
    String background = ""; // Changes background color. By default a random color will be picked and stay will persistent to the given name.
    try {
      client
              .avatars
              .getUserInitials()
              .name(name)
              .width(width)
              .height(height)
              .background(background)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getUserInitials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .avatars
              .getUserInitials()
              .name(name)
              .width(width)
              .height(height)
              .background(background)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarsApi#getUserInitials");
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
| **name** | **String**| Full Name. When empty, current user name or email will be used. Max length: 128 chars. | [optional] [default to ] |
| **width** | **Integer**| Image width. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 500] |
| **height** | **Integer**| Image height. Pass an integer between 0 to 2000. Defaults to 100. | [optional] [default to 500] |
| **background** | **String**| Changes background color. By default a random color will be picked and stay will persistent to the given name. | [optional] [default to ] |

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


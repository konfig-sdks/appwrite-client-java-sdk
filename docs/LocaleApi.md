# LocaleApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrencies**](LocaleApi.md#getCurrencies) | **GET** /locale/currencies | List currencies |
| [**getEUCountries**](LocaleApi.md#getEUCountries) | **GET** /locale/countries/eu | List EU countries |
| [**getUserLocale**](LocaleApi.md#getUserLocale) | **GET** /locale | Get user locale |
| [**listCodes**](LocaleApi.md#listCodes) | **GET** /locale/codes | List Locale Codes |
| [**listContinents**](LocaleApi.md#listContinents) | **GET** /locale/continents | List continents |
| [**listCountries**](LocaleApi.md#listCountries) | **GET** /locale/countries | List countries |
| [**listCountriesPhones**](LocaleApi.md#listCountriesPhones) | **GET** /locale/countries/phones | List countries phone codes |
| [**listLanguages**](LocaleApi.md#listLanguages) | **GET** /locale/languages | List languages |


<a name="getCurrencies"></a>
# **getCurrencies**
> CurrencyList getCurrencies().execute();

List currencies

List of all currencies, including currency symbol, name, plural, and decimal digits for all major and minor currencies. You can use the locale header to get the data in a supported language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      CurrencyList result = client
              .locale
              .getCurrencies()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getCurrencies());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getCurrencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CurrencyList> response = client
              .locale
              .getCurrencies()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getCurrencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyList**](CurrencyList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Currencies List |  -  |

<a name="getEUCountries"></a>
# **getEUCountries**
> CountryList getEUCountries().execute();

List EU countries

List of all countries that are currently members of the EU. You can use the locale header to get the data in a supported language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      CountryList result = client
              .locale
              .getEUCountries()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getCountries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getEUCountries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountryList> response = client
              .locale
              .getEUCountries()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getEUCountries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountryList**](CountryList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Countries List |  -  |

<a name="getUserLocale"></a>
# **getUserLocale**
> Locale getUserLocale().execute();

Get user locale

Get the current user location based on IP. Returns an object with user country code, country name, continent name, continent code, ip address and suggested currency. You can use the locale header to get the data in a supported language.  ([IP Geolocation by DB-IP](https://db-ip.com))

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      Locale result = client
              .locale
              .getUserLocale()
              .execute();
      System.out.println(result);
      System.out.println(result.getIp());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountry());
      System.out.println(result.getContinentCode());
      System.out.println(result.getContinent());
      System.out.println(result.getEu());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getUserLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Locale> response = client
              .locale
              .getUserLocale()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#getUserLocale");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Locale**](Locale.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Locale |  -  |

<a name="listCodes"></a>
# **listCodes**
> LocaleCodeList listCodes().execute();

List Locale Codes

List of all locale codes in [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      LocaleCodeList result = client
              .locale
              .listCodes()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getLocaleCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocaleCodeList> response = client
              .locale
              .listCodes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LocaleCodeList**](LocaleCodeList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Locale codes list |  -  |

<a name="listContinents"></a>
# **listContinents**
> ContinentList listContinents().execute();

List continents

List of all continents. You can use the locale header to get the data in a supported language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      ContinentList result = client
              .locale
              .listContinents()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getContinents());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listContinents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContinentList> response = client
              .locale
              .listContinents()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listContinents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContinentList**](ContinentList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Continents List |  -  |

<a name="listCountries"></a>
# **listCountries**
> CountryList listCountries().execute();

List countries

List of all countries. You can use the locale header to get the data in a supported language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      CountryList result = client
              .locale
              .listCountries()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getCountries());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCountries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountryList> response = client
              .locale
              .listCountries()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCountries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountryList**](CountryList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Countries List |  -  |

<a name="listCountriesPhones"></a>
# **listCountriesPhones**
> PhoneList listCountriesPhones().execute();

List countries phone codes

List of all countries phone codes. You can use the locale header to get the data in a supported language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      PhoneList result = client
              .locale
              .listCountriesPhones()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getPhones());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCountriesPhones");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneList> response = client
              .locale
              .listCountriesPhones()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listCountriesPhones");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PhoneList**](PhoneList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phones List |  -  |

<a name="listLanguages"></a>
# **listLanguages**
> LanguageList listLanguages().execute();

List languages

List of all languages classified by ISO 639-1 including 2-letter code, name in English, and name in the respective language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocaleApi;
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
    try {
      LanguageList result = client
              .locale
              .listLanguages()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getLanguages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listLanguages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LanguageList> response = client
              .locale
              .listLanguages()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocaleApi#listLanguages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LanguageList**](LanguageList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Languages List |  -  |


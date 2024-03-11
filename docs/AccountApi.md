# AccountApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAuthenticator**](AccountApi.md#addAuthenticator) | **POST** /account/mfa/authenticators/{type} | Add Authenticator |
| [**blockUserStatus**](AccountApi.md#blockUserStatus) | **PATCH** /account/status | Update status |
| [**completeMfaChallenge**](AccountApi.md#completeMfaChallenge) | **PUT** /account/mfa/challenge | Create MFA Challenge (confirmation) |
| [**completePasswordRecovery**](AccountApi.md#completePasswordRecovery) | **PUT** /account/recovery | Create password recovery (confirmation) |
| [**confirmPhoneVerification**](AccountApi.md#confirmPhoneVerification) | **PUT** /account/verification/phone | Create phone verification (confirmation) |
| [**createAnonymousSession**](AccountApi.md#createAnonymousSession) | **POST** /account/sessions/anonymous | Create anonymous session |
| [**createEmailPasswordSession**](AccountApi.md#createEmailPasswordSession) | **POST** /account/sessions/email | Create email password session |
| [**createEmailToken**](AccountApi.md#createEmailToken) | **POST** /account/tokens/email | Create email token (OTP) |
| [**createEmailVerification**](AccountApi.md#createEmailVerification) | **PUT** /account/verification | Create email verification (confirmation) |
| [**createEmailVerification_0**](AccountApi.md#createEmailVerification_0) | **POST** /account/verification | Create email verification |
| [**createJwt**](AccountApi.md#createJwt) | **POST** /account/jwt | Create JWT |
| [**createMagicUrlToken**](AccountApi.md#createMagicUrlToken) | **POST** /account/tokens/magic-url | Create magic URL token |
| [**createMfaChallenge**](AccountApi.md#createMfaChallenge) | **POST** /account/mfa/challenge | Create 2FA Challenge |
| [**createMfaRecoveryCodes**](AccountApi.md#createMfaRecoveryCodes) | **POST** /account/mfa/recovery-codes | Create MFA Recovery Codes |
| [**createOAuth2Session**](AccountApi.md#createOAuth2Session) | **GET** /account/sessions/oauth2/{provider} | Create OAuth2 session |
| [**createOAuth2Token**](AccountApi.md#createOAuth2Token) | **GET** /account/tokens/oauth2/{provider} | Create OAuth2 token |
| [**createPasswordRecovery**](AccountApi.md#createPasswordRecovery) | **POST** /account/recovery | Create password recovery |
| [**createPhoneToken**](AccountApi.md#createPhoneToken) | **POST** /account/tokens/phone | Create phone token |
| [**createPhoneVerification**](AccountApi.md#createPhoneVerification) | **POST** /account/verification/phone | Create phone verification |
| [**createPushTarget**](AccountApi.md#createPushTarget) | **POST** /account/targets/push | Create push target |
| [**createSessionFromToken**](AccountApi.md#createSessionFromToken) | **POST** /account/sessions/token | Create session |
| [**deleteAuthenticator**](AccountApi.md#deleteAuthenticator) | **DELETE** /account/mfa/authenticators/{type} | Delete Authenticator |
| [**deleteIdentityById**](AccountApi.md#deleteIdentityById) | **DELETE** /account/identities/{identityId} | Delete identity |
| [**deletePushTarget**](AccountApi.md#deletePushTarget) | **DELETE** /account/targets/{targetId}/push | Delete push target |
| [**extendSessionLength**](AccountApi.md#extendSessionLength) | **PATCH** /account/sessions/{sessionId} | Update session |
| [**getCurrentUser**](AccountApi.md#getCurrentUser) | **GET** /account | Get account |
| [**getMfaRecoveryCodes**](AccountApi.md#getMfaRecoveryCodes) | **GET** /account/mfa/recovery-codes | Get MFA Recovery Codes |
| [**getPrefs**](AccountApi.md#getPrefs) | **GET** /account/prefs | Get account preferences |
| [**getSession**](AccountApi.md#getSession) | **GET** /account/sessions/{sessionId} | Get session |
| [**listIdentities**](AccountApi.md#listIdentities) | **GET** /account/identities | List Identities |
| [**listLogs**](AccountApi.md#listLogs) | **GET** /account/logs | List logs |
| [**listMfaFactors**](AccountApi.md#listMfaFactors) | **GET** /account/mfa/factors | List Factors |
| [**listSessions**](AccountApi.md#listSessions) | **GET** /account/sessions | List sessions |
| [**logoutSessionById**](AccountApi.md#logoutSessionById) | **DELETE** /account/sessions/{sessionId} | Delete session |
| [**regenerateMfaRecoveryCodes**](AccountApi.md#regenerateMfaRecoveryCodes) | **PATCH** /account/mfa/recovery-codes | Regenerate MFA Recovery Codes |
| [**registerUser**](AccountApi.md#registerUser) | **POST** /account | Create account |
| [**removeSessions**](AccountApi.md#removeSessions) | **DELETE** /account/sessions | Delete sessions |
| [**updateMagicUrlSession**](AccountApi.md#updateMagicUrlSession) | **PUT** /account/sessions/magic-url | Update magic URL session |
| [**updateMfaStatus**](AccountApi.md#updateMfaStatus) | **PATCH** /account/mfa | Update MFA |
| [**updateNameOperation**](AccountApi.md#updateNameOperation) | **PATCH** /account/name | Update name |
| [**updatePassword**](AccountApi.md#updatePassword) | **PATCH** /account/password | Update password |
| [**updatePhone**](AccountApi.md#updatePhone) | **PATCH** /account/phone | Update phone |
| [**updatePhoneSession**](AccountApi.md#updatePhoneSession) | **PUT** /account/sessions/phone | Update phone session |
| [**updatePreferences**](AccountApi.md#updatePreferences) | **PATCH** /account/prefs | Update preferences |
| [**updatePushTarget**](AccountApi.md#updatePushTarget) | **PUT** /account/targets/{targetId}/push | Update push target |
| [**updateUserEmail**](AccountApi.md#updateUserEmail) | **PATCH** /account/email | Update email |
| [**verifyAuthenticator**](AccountApi.md#verifyAuthenticator) | **PUT** /account/mfa/authenticators/{type} | Verify Authenticator |


<a name="addAuthenticator"></a>
# **addAuthenticator**
> MfaType addAuthenticator(type).execute();

Add Authenticator

Add an authenticator app to be used as an MFA factor. Verify the authenticator using the [verify authenticator](/docs/references/cloud/client-web/account#verifyAuthenticator) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String type = "totp"; // Type of authenticator. Must be `totp`
    try {
      MfaType result = client
              .account
              .addAuthenticator(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getSecret());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#addAuthenticator");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaType> response = client
              .account
              .addAuthenticator(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#addAuthenticator");
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
| **type** | **String**| Type of authenticator. Must be &#x60;totp&#x60; | [enum: totp] |

### Return type

[**MfaType**](MfaType.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MFAType |  -  |

<a name="blockUserStatus"></a>
# **blockUserStatus**
> User blockUserStatus().execute();

Update status

Block the currently logged in user account. Behind the scene, the user record is not deleted but permanently blocked from any access. To completely delete a user, use the Users API instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      User result = client
              .account
              .blockUserStatus()
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#blockUserStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .blockUserStatus()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#blockUserStatus");
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

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="completeMfaChallenge"></a>
# **completeMfaChallenge**
> Session completeMfaChallenge().accountCompleteMfaChallengeRequest(accountCompleteMfaChallengeRequest).execute();

Create MFA Challenge (confirmation)

Complete the MFA challenge by providing the one-time password. Finish the process of MFA verification by providing the one-time password. To begin the flow, use [createMfaChallenge](/docs/references/cloud/client-web/account#createMfaChallenge) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String challengeId = "challengeId_example"; // ID of the challenge.
    String otp = "otp_example"; // Valid verification token.
    try {
      Session result = client
              .account
              .completeMfaChallenge(challengeId, otp)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#completeMfaChallenge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .completeMfaChallenge(challengeId, otp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#completeMfaChallenge");
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
| **accountCompleteMfaChallengeRequest** | [**AccountCompleteMfaChallengeRequest**](AccountCompleteMfaChallengeRequest.md)|  | [optional] |

### Return type

[**Session**](Session.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: 

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="completePasswordRecovery"></a>
# **completePasswordRecovery**
> Token completePasswordRecovery().accountCompletePasswordRecoveryRequest(accountCompletePasswordRecoveryRequest).execute();

Create password recovery (confirmation)

Use this endpoint to complete the user account password reset. Both the **userId** and **secret** arguments will be passed as query parameters to the redirect URL you have provided when sending your request to the [POST /account/recovery](https://appwrite.io/docs/references/cloud/client-web/account#createRecovery) endpoint.  Please note that in order to avoid a [Redirect Attack](https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.md) the only valid redirect URLs are the ones from domains you have set when adding your platforms in the console interface.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String userId = "userId_example"; // User ID.
    String secret = "secret_example"; // Valid reset token.
    String password = "password_example"; // New user password. Must be between 8 and 256 chars.
    try {
      Token result = client
              .account
              .completePasswordRecovery(userId, secret, password)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#completePasswordRecovery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .completePasswordRecovery(userId, secret, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#completePasswordRecovery");
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
| **accountCompletePasswordRecoveryRequest** | [**AccountCompletePasswordRecoveryRequest**](AccountCompletePasswordRecoveryRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token |  -  |

<a name="confirmPhoneVerification"></a>
# **confirmPhoneVerification**
> Token confirmPhoneVerification().accountConfirmPhoneVerificationRequest(accountConfirmPhoneVerificationRequest).execute();

Create phone verification (confirmation)

Use this endpoint to complete the user phone verification process. Use the **userId** and **secret** that were sent to your user&#39;s phone number to verify the user email ownership. If confirmed this route will return a 200 status code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String userId = "userId_example"; // User ID.
    String secret = "secret_example"; // Valid verification token.
    try {
      Token result = client
              .account
              .confirmPhoneVerification(userId, secret)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#confirmPhoneVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .confirmPhoneVerification(userId, secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#confirmPhoneVerification");
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
| **accountConfirmPhoneVerificationRequest** | [**AccountConfirmPhoneVerificationRequest**](AccountConfirmPhoneVerificationRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token |  -  |

<a name="createAnonymousSession"></a>
# **createAnonymousSession**
> Session createAnonymousSession().execute();

Create anonymous session

Use this endpoint to allow a new user to register an anonymous account in your project. This route will also create a new session for the user. To allow the new user to convert an anonymous account to a normal account, you need to update its [email and password](https://appwrite.io/docs/references/cloud/client-web/account#updateEmail) or create an [OAuth2 session](https://appwrite.io/docs/references/cloud/client-web/account#CreateOAuth2Session).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    try {
      Session result = client
              .account
              .createAnonymousSession()
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createAnonymousSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .createAnonymousSession()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createAnonymousSession");
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

[**Session**](Session.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session |  -  |

<a name="createEmailPasswordSession"></a>
# **createEmailPasswordSession**
> Session createEmailPasswordSession().accountCreateEmailPasswordSessionRequest(accountCreateEmailPasswordSessionRequest).execute();

Create email password session

Allow the user to login into their account by providing a valid email and password combination. This route will create a new session for the user.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String email = "email_example"; // User email.
    String password = "password_example"; // User password. Must be at least 8 chars.
    try {
      Session result = client
              .account
              .createEmailPasswordSession(email, password)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailPasswordSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .createEmailPasswordSession(email, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailPasswordSession");
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
| **accountCreateEmailPasswordSessionRequest** | [**AccountCreateEmailPasswordSessionRequest**](AccountCreateEmailPasswordSessionRequest.md)|  | [optional] |

### Return type

[**Session**](Session.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session |  -  |

<a name="createEmailToken"></a>
# **createEmailToken**
> Token createEmailToken().accountCreateEmailTokenRequest(accountCreateEmailTokenRequest).execute();

Create email token (OTP)

Sends the user an email with a secret key for creating a session. If the provided user ID has not be registered, a new user will be created. Use the returned user ID and secret and submit a request to the [POST /v1/account/sessions/token](https://appwrite.io/docs/references/cloud/client-web/account#createSession) endpoint to complete the login process. The secret sent to the user&#39;s email is valid for 15 minutes.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // User ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String email = "email_example"; // User email.
    Boolean phrase = true; // Toggle for security phrase. If enabled, email will be send with a randomly generated phrase and the phrase will also be included in the response. Confirming phrases match increases the security of your authentication flow.
    try {
      Token result = client
              .account
              .createEmailToken(userId, email)
              .phrase(phrase)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createEmailToken(userId, email)
              .phrase(phrase)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailToken");
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
| **accountCreateEmailTokenRequest** | [**AccountCreateEmailTokenRequest**](AccountCreateEmailTokenRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createEmailVerification"></a>
# **createEmailVerification**
> Token createEmailVerification().accountCreateEmailVerificationRequest1(accountCreateEmailVerificationRequest1).execute();

Create email verification (confirmation)

Use this endpoint to complete the user email verification process. Use both the **userId** and **secret** parameters that were attached to your app URL to verify the user email ownership. If confirmed this route will return a 200 status code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String userId = "userId_example"; // User ID.
    String secret = "secret_example"; // Valid verification token.
    try {
      Token result = client
              .account
              .createEmailVerification(userId, secret)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createEmailVerification(userId, secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailVerification");
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
| **accountCreateEmailVerificationRequest1** | [**AccountCreateEmailVerificationRequest1**](AccountCreateEmailVerificationRequest1.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token |  -  |

<a name="createEmailVerification_0"></a>
# **createEmailVerification_0**
> Token createEmailVerification_0().accountCreateEmailVerificationRequest(accountCreateEmailVerificationRequest).execute();

Create email verification

Use this endpoint to send a verification message to your user email address to confirm they are the valid owners of that address. Both the **userId** and **secret** arguments will be passed as query parameters to the URL you have provided to be attached to the verification email. The provided URL should redirect the user back to your app and allow you to complete the verification process by verifying both the **userId** and **secret** parameters. Learn more about how to [complete the verification process](https://appwrite.io/docs/references/cloud/client-web/account#updateVerification). The verification link sent to the user&#39;s email address is valid for 7 days.  Please note that in order to avoid a [Redirect Attack](https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.md), the only valid redirect URLs are the ones from domains you have set when adding your platforms in the console interface. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String url = "url_example"; // URL to redirect the user back to your app from the verification email. Only URLs from hostnames in your project platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    try {
      Token result = client
              .account
              .createEmailVerification_0(url)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailVerification_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createEmailVerification_0(url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createEmailVerification_0");
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
| **accountCreateEmailVerificationRequest** | [**AccountCreateEmailVerificationRequest**](AccountCreateEmailVerificationRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createJwt"></a>
# **createJwt**
> Jwt createJwt().execute();

Create JWT

Use this endpoint to create a JSON Web Token. You can use the resulting JWT to authenticate on behalf of the current user when working with the Appwrite server-side API and SDKs. The JWT secret is valid for 15 minutes from its creation and will be invalid if the user will logout in that time frame.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    try {
      Jwt result = client
              .account
              .createJwt()
              .execute();
      System.out.println(result);
      System.out.println(result.getJwt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createJwt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Jwt> response = client
              .account
              .createJwt()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createJwt");
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

[**Jwt**](Jwt.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | JWT |  -  |

<a name="createMagicUrlToken"></a>
# **createMagicUrlToken**
> Token createMagicUrlToken().accountCreateMagicUrlTokenRequest(accountCreateMagicUrlTokenRequest).execute();

Create magic URL token

Sends the user an email with a secret key for creating a session. If the provided user ID has not been registered, a new user will be created. When the user clicks the link in the email, the user is redirected back to the URL you provided with the secret key and userId values attached to the URL query string. Use the query string parameters to submit a request to the [POST /v1/account/sessions/token](https://appwrite.io/docs/references/cloud/client-web/account#createSession) endpoint to complete the login process. The link sent to the user&#39;s email address is valid for 1 hour. If you are on a mobile device you can leave the URL parameter empty, so that the login completion will be handled by your Appwrite instance by default.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // Unique Id. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String email = "email_example"; // User email.
    String url = "url_example"; // URL to redirect the user back to your app from the magic URL login. Only URLs from hostnames in your project platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    Boolean phrase = true; // Toggle for security phrase. If enabled, email will be send with a randomly generated phrase and the phrase will also be included in the response. Confirming phrases match increases the security of your authentication flow.
    try {
      Token result = client
              .account
              .createMagicUrlToken(userId, email)
              .url(url)
              .phrase(phrase)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMagicUrlToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createMagicUrlToken(userId, email)
              .url(url)
              .phrase(phrase)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMagicUrlToken");
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
| **accountCreateMagicUrlTokenRequest** | [**AccountCreateMagicUrlTokenRequest**](AccountCreateMagicUrlTokenRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createMfaChallenge"></a>
# **createMfaChallenge**
> MfaChallenge createMfaChallenge().accountCreateMfaChallengeRequest(accountCreateMfaChallengeRequest).execute();

Create 2FA Challenge

Begin the process of MFA verification after sign-in. Finish the flow with [updateMfaChallenge](/docs/references/cloud/client-web/account#updateMfaChallenge) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String factor = "email"; // Factor used for verification. Must be one of following: `email`, `phone`, `totp`, `recoveryCode`.
    try {
      MfaChallenge result = client
              .account
              .createMfaChallenge(factor)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMfaChallenge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaChallenge> response = client
              .account
              .createMfaChallenge(factor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMfaChallenge");
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
| **accountCreateMfaChallengeRequest** | [**AccountCreateMfaChallengeRequest**](AccountCreateMfaChallengeRequest.md)|  | [optional] |

### Return type

[**MfaChallenge**](MfaChallenge.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MFA Challenge |  -  |

<a name="createMfaRecoveryCodes"></a>
# **createMfaRecoveryCodes**
> MfaRecoveryCodes createMfaRecoveryCodes().execute();

Create MFA Recovery Codes

Generate recovery codes as backup for MFA flow. It&#39;s recommended to generate and show then immediately after user successfully adds their authehticator. Recovery codes can be used as a MFA verification type in [createMfaChallenge](/docs/references/cloud/client-web/account#createMfaChallenge) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      MfaRecoveryCodes result = client
              .account
              .createMfaRecoveryCodes()
              .execute();
      System.out.println(result);
      System.out.println(result.getRecoveryCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMfaRecoveryCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaRecoveryCodes> response = client
              .account
              .createMfaRecoveryCodes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createMfaRecoveryCodes");
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

[**MfaRecoveryCodes**](MfaRecoveryCodes.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | MFA Recovery Codes |  -  |

<a name="createOAuth2Session"></a>
# **createOAuth2Session**
> createOAuth2Session(provider).success(success).failure(failure).scopes(scopes).execute();

Create OAuth2 session

Allow the user to login to their account using the OAuth2 provider of their choice. Each OAuth2 provider should be enabled from the Appwrite console first. Use the success and failure arguments to provide a redirect URL&#39;s back to your app when login is completed.  If there is already an active session, the new session will be attached to the logged-in account. If there are no active sessions, the server will attempt to look for a user with the same email address as the email received from the OAuth2 provider and attach the new session to the existing user. If no matching user is found - the server will create a new user.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String provider = "amazon"; // OAuth2 Provider. Currently, supported providers are: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom.
    String success = ""; // URL to redirect back to your app after a successful login attempt.  Only URLs from hostnames in your project's platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    String failure = ""; // URL to redirect back to your app after a failed login attempt.  Only URLs from hostnames in your project's platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    List<String> scopes = Arrays.asList(); // A list of custom OAuth2 scopes. Check each provider internal docs for a list of supported scopes. Maximum of 100 scopes are allowed, each 4096 characters long.
    try {
      client
              .account
              .createOAuth2Session(provider)
              .success(success)
              .failure(failure)
              .scopes(scopes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createOAuth2Session");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .createOAuth2Session(provider)
              .success(success)
              .failure(failure)
              .scopes(scopes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createOAuth2Session");
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
| **provider** | **String**| OAuth2 Provider. Currently, supported providers are: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom. | [enum: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom, mock] |
| **success** | **String**| URL to redirect back to your app after a successful login attempt.  Only URLs from hostnames in your project&#39;s platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API. | [optional] [default to ] |
| **failure** | **String**| URL to redirect back to your app after a failed login attempt.  Only URLs from hostnames in your project&#39;s platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API. | [optional] [default to ] |
| **scopes** | [**List&lt;String&gt;**](String.md)| A list of custom OAuth2 scopes. Check each provider internal docs for a list of supported scopes. Maximum of 100 scopes are allowed, each 4096 characters long. | [optional] |

### Return type

null (empty response body)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | File |  -  |

<a name="createOAuth2Token"></a>
# **createOAuth2Token**
> createOAuth2Token(provider).success(success).failure(failure).scopes(scopes).execute();

Create OAuth2 token

Allow the user to login to their account using the OAuth2 provider of their choice. Each OAuth2 provider should be enabled from the Appwrite console first. Use the success and failure arguments to provide a redirect URL&#39;s back to your app when login is completed.   If authentication succeeds, &#x60;userId&#x60; and &#x60;secret&#x60; of a token will be appended to the success URL as query parameters. These can be used to create a new session using the [Create session](https://appwrite.io/docs/references/cloud/client-web/account#createSession) endpoint.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String provider = "amazon"; // OAuth2 Provider. Currently, supported providers are: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom.
    String success = ""; // URL to redirect back to your app after a successful login attempt.  Only URLs from hostnames in your project's platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    String failure = ""; // URL to redirect back to your app after a failed login attempt.  Only URLs from hostnames in your project's platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    List<String> scopes = Arrays.asList(); // A list of custom OAuth2 scopes. Check each provider internal docs for a list of supported scopes. Maximum of 100 scopes are allowed, each 4096 characters long.
    try {
      client
              .account
              .createOAuth2Token(provider)
              .success(success)
              .failure(failure)
              .scopes(scopes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createOAuth2Token");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .createOAuth2Token(provider)
              .success(success)
              .failure(failure)
              .scopes(scopes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createOAuth2Token");
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
| **provider** | **String**| OAuth2 Provider. Currently, supported providers are: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom. | [enum: amazon, apple, auth0, authentik, autodesk, bitbucket, bitly, box, dailymotion, discord, disqus, dropbox, etsy, facebook, github, gitlab, google, linkedin, microsoft, notion, oidc, okta, paypal, paypalSandbox, podio, salesforce, slack, spotify, stripe, tradeshift, tradeshiftBox, twitch, wordpress, yahoo, yammer, yandex, zoho, zoom, mock] |
| **success** | **String**| URL to redirect back to your app after a successful login attempt.  Only URLs from hostnames in your project&#39;s platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API. | [optional] [default to ] |
| **failure** | **String**| URL to redirect back to your app after a failed login attempt.  Only URLs from hostnames in your project&#39;s platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API. | [optional] [default to ] |
| **scopes** | [**List&lt;String&gt;**](String.md)| A list of custom OAuth2 scopes. Check each provider internal docs for a list of supported scopes. Maximum of 100 scopes are allowed, each 4096 characters long. | [optional] |

### Return type

null (empty response body)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | File |  -  |

<a name="createPasswordRecovery"></a>
# **createPasswordRecovery**
> Token createPasswordRecovery().accountCreatePasswordRecoveryRequest(accountCreatePasswordRecoveryRequest).execute();

Create password recovery

Sends the user an email with a temporary secret key for password reset. When the user clicks the confirmation link he is redirected back to your app password reset URL with the secret key and email address values attached to the URL query string. Use the query string params to submit a request to the [PUT /account/recovery](https://appwrite.io/docs/references/cloud/client-web/account#updateRecovery) endpoint to complete the process. The verification link sent to the user&#39;s email address is valid for 1 hour.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String email = "email_example"; // User email.
    String url = "url_example"; // URL to redirect the user back to your app from the recovery email. Only URLs from hostnames in your project platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    try {
      Token result = client
              .account
              .createPasswordRecovery(email, url)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPasswordRecovery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createPasswordRecovery(email, url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPasswordRecovery");
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
| **accountCreatePasswordRecoveryRequest** | [**AccountCreatePasswordRecoveryRequest**](AccountCreatePasswordRecoveryRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createPhoneToken"></a>
# **createPhoneToken**
> Token createPhoneToken().accountCreatePhoneTokenRequest(accountCreatePhoneTokenRequest).execute();

Create phone token

Sends the user an SMS with a secret key for creating a session. If the provided user ID has not be registered, a new user will be created. Use the returned user ID and secret and submit a request to the [POST /v1/account/sessions/token](https://appwrite.io/docs/references/cloud/client-web/account#createSession) endpoint to complete the login process. The secret sent to the user&#39;s phone is valid for 15 minutes.  A user is limited to 10 active sessions at a time by default. [Learn more about session limits](https://appwrite.io/docs/authentication-security#limits).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // Unique Id. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String phone = "phone_example"; // Phone number. Format this number with a leading '+' and a country code, e.g., +16175551212.
    try {
      Token result = client
              .account
              .createPhoneToken(userId, phone)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPhoneToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createPhoneToken(userId, phone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPhoneToken");
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
| **accountCreatePhoneTokenRequest** | [**AccountCreatePhoneTokenRequest**](AccountCreatePhoneTokenRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createPhoneVerification"></a>
# **createPhoneVerification**
> Token createPhoneVerification().execute();

Create phone verification

Use this endpoint to send a verification SMS to the currently logged in user. This endpoint is meant for use after updating a user&#39;s phone number using the [accountUpdatePhone](https://appwrite.io/docs/references/cloud/client-web/account#updatePhone) endpoint. Learn more about how to [complete the verification process](https://appwrite.io/docs/references/cloud/client-web/account#updatePhoneVerification). The verification code sent to the user&#39;s phone number is valid for 15 minutes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      Token result = client
              .account
              .createPhoneVerification()
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getSecret());
      System.out.println(result.getExpire());
      System.out.println(result.getPhrase());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPhoneVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Token> response = client
              .account
              .createPhoneVerification()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPhoneVerification");
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

[**Token**](Token.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Token |  -  |

<a name="createPushTarget"></a>
# **createPushTarget**
> Target createPushTarget().accountCreatePushTargetRequest(accountCreatePushTargetRequest).execute();

Create push target



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String targetId = "targetId_example"; // Target ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String identifier = "identifier_example"; // The target identifier (token, email, phone etc.)
    String providerId = "providerId_example"; // Provider ID. Message will be sent to this target from the specified provider ID. If no provider ID is set the first setup provider will be used.
    try {
      Target result = client
              .account
              .createPushTarget(targetId, identifier)
              .providerId(providerId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getUserId());
      System.out.println(result.getProviderId());
      System.out.println(result.getProviderType());
      System.out.println(result.getIdentifier());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPushTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Target> response = client
              .account
              .createPushTarget(targetId, identifier)
              .providerId(providerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createPushTarget");
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
| **accountCreatePushTargetRequest** | [**AccountCreatePushTargetRequest**](AccountCreatePushTargetRequest.md)|  | [optional] |

### Return type

[**Target**](Target.md)

### Authorization

[Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Target |  -  |

<a name="createSessionFromToken"></a>
# **createSessionFromToken**
> Session createSessionFromToken().accountCreateSessionFromTokenRequest(accountCreateSessionFromTokenRequest).execute();

Create session

Use this endpoint to create a session from token. Provide the **userId** and **secret** parameters from the successful response of authentication flows initiated by token creation. For example, magic URL and phone login.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // User ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String secret = "secret_example"; // Secret of a token generated by login methods. For example, the `createMagicURLToken` or `createPhoneToken` methods.
    try {
      Session result = client
              .account
              .createSessionFromToken(userId, secret)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createSessionFromToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .createSessionFromToken(userId, secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#createSessionFromToken");
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
| **accountCreateSessionFromTokenRequest** | [**AccountCreateSessionFromTokenRequest**](AccountCreateSessionFromTokenRequest.md)|  | [optional] |

### Return type

[**Session**](Session.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session |  -  |

<a name="deleteAuthenticator"></a>
# **deleteAuthenticator**
> User deleteAuthenticator(type).accountDeleteAuthenticatorRequest(accountDeleteAuthenticatorRequest).execute();

Delete Authenticator

Delete an authenticator for a user by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String otp = "otp_example"; // Valid verification token.
    String type = "totp"; // Type of authenticator.
    try {
      User result = client
              .account
              .deleteAuthenticator(otp, type)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteAuthenticator");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .deleteAuthenticator(otp, type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteAuthenticator");
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
| **type** | **String**| Type of authenticator. | [enum: totp] |
| **accountDeleteAuthenticatorRequest** | [**AccountDeleteAuthenticatorRequest**](AccountDeleteAuthenticatorRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="deleteIdentityById"></a>
# **deleteIdentityById**
> deleteIdentityById(identityId).execute();

Delete identity

Delete an identity by its unique ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String identityId = "identityId_example"; // Identity ID.
    try {
      client
              .account
              .deleteIdentityById(identityId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteIdentityById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .deleteIdentityById(identityId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteIdentityById");
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
| **identityId** | **String**| Identity ID. | |

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

<a name="deletePushTarget"></a>
# **deletePushTarget**
> Target deletePushTarget(targetId).execute();

Delete push target



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String targetId = "targetId_example"; // Target ID.
    try {
      Target result = client
              .account
              .deletePushTarget(targetId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getUserId());
      System.out.println(result.getProviderId());
      System.out.println(result.getProviderType());
      System.out.println(result.getIdentifier());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deletePushTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Target> response = client
              .account
              .deletePushTarget(targetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deletePushTarget");
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
| **targetId** | **String**| Target ID. | |

### Return type

[**Target**](Target.md)

### Authorization

[Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="extendSessionLength"></a>
# **extendSessionLength**
> Session extendSessionLength(sessionId).execute();

Update session

Use this endpoint to extend a session&#39;s length. Extending a session is useful when session expiry is short. If the session was created using an OAuth provider, this endpoint refreshes the access token from the provider.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String sessionId = "sessionId_example"; // Session ID. Use the string 'current' to update the current device session.
    try {
      Session result = client
              .account
              .extendSessionLength(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#extendSessionLength");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .extendSessionLength(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#extendSessionLength");
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
| **sessionId** | **String**| Session ID. Use the string &#39;current&#39; to update the current device session. | |

### Return type

[**Session**](Session.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Session |  -  |

<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser().execute();

Get account

Get the currently logged in user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      User result = client
              .account
              .getCurrentUser()
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .getCurrentUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getCurrentUser");
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

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="getMfaRecoveryCodes"></a>
# **getMfaRecoveryCodes**
> MfaRecoveryCodes getMfaRecoveryCodes().execute();

Get MFA Recovery Codes

Get recovery codes that can be used as backup for MFA flow. Before getting codes, they must be generated using [createMfaRecoveryCodes](/docs/references/cloud/client-web/account#createMfaRecoveryCodes) method. An OTP challenge is required to read recovery codes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      MfaRecoveryCodes result = client
              .account
              .getMfaRecoveryCodes()
              .execute();
      System.out.println(result);
      System.out.println(result.getRecoveryCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getMfaRecoveryCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaRecoveryCodes> response = client
              .account
              .getMfaRecoveryCodes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getMfaRecoveryCodes");
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

[**MfaRecoveryCodes**](MfaRecoveryCodes.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MFA Recovery Codes |  -  |

<a name="getPrefs"></a>
# **getPrefs**
> Map&lt;String, Object&gt; getPrefs().execute();

Get account preferences

Get the preferences as a key-value object for the currently logged in user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      Map<String, Object> result = client
              .account
              .getPrefs()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .account
              .getPrefs()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getPrefs");
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

**Map&lt;String, Object&gt;**

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preferences |  -  |

<a name="getSession"></a>
# **getSession**
> Session getSession(sessionId).execute();

Get session

Use this endpoint to get a logged in user&#39;s session using a Session ID. Inputting &#39;current&#39; will return the current session being used.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String sessionId = "sessionId_example"; // Session ID. Use the string 'current' to get the current device session.
    try {
      Session result = client
              .account
              .getSession(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .getSession(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getSession");
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
| **sessionId** | **String**| Session ID. Use the string &#39;current&#39; to get the current device session. | |

### Return type

[**Session**](Session.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Session |  -  |

<a name="listIdentities"></a>
# **listIdentities**
> IdentityList listIdentities().queries(queries).execute();

List Identities

Get the list of identities for the currently logged in user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: userId, provider, providerUid, providerEmail, providerAccessTokenExpiry
    try {
      IdentityList result = client
              .account
              .listIdentities()
              .queries(queries)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getIdentities());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listIdentities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IdentityList> response = client
              .account
              .listIdentities()
              .queries(queries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listIdentities");
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
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: userId, provider, providerUid, providerEmail, providerAccessTokenExpiry | [optional] |

### Return type

[**IdentityList**](IdentityList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Identities List |  -  |

<a name="listLogs"></a>
# **listLogs**
> LogList listLogs().queries(queries).execute();

List logs

Get the list of latest security activity logs for the currently logged in user. Each log returns user IP address, location and date and time of log.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Only supported methods are limit and offset
    try {
      LogList result = client
              .account
              .listLogs()
              .queries(queries)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getLogs());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LogList> response = client
              .account
              .listLogs()
              .queries(queries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listLogs");
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
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Only supported methods are limit and offset | [optional] |

### Return type

[**LogList**](LogList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Logs List |  -  |

<a name="listMfaFactors"></a>
# **listMfaFactors**
> MfaFactors listMfaFactors().execute();

List Factors

List the factors available on the account to be used as a MFA challange.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      MfaFactors result = client
              .account
              .listMfaFactors()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotp());
      System.out.println(result.getPhone());
      System.out.println(result.getEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listMfaFactors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaFactors> response = client
              .account
              .listMfaFactors()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listMfaFactors");
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

[**MfaFactors**](MfaFactors.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MFAFactors |  -  |

<a name="listSessions"></a>
# **listSessions**
> SessionList listSessions().execute();

List sessions

Get the list of active sessions across different devices for the currently logged in user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      SessionList result = client
              .account
              .listSessions()
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getSessions());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionList> response = client
              .account
              .listSessions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#listSessions");
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

[**SessionList**](SessionList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sessions List |  -  |

<a name="logoutSessionById"></a>
# **logoutSessionById**
> logoutSessionById(sessionId).execute();

Delete session

Logout the user. Use &#39;current&#39; as the session ID to logout on this device, use a session ID to logout on another device. If you&#39;re looking to logout the user on all devices, use [Delete Sessions](https://appwrite.io/docs/references/cloud/client-web/account#deleteSessions) instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String sessionId = "sessionId_example"; // Session ID. Use the string 'current' to delete the current device session.
    try {
      client
              .account
              .logoutSessionById(sessionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#logoutSessionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .logoutSessionById(sessionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#logoutSessionById");
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
| **sessionId** | **String**| Session ID. Use the string &#39;current&#39; to delete the current device session. | |

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

<a name="regenerateMfaRecoveryCodes"></a>
# **regenerateMfaRecoveryCodes**
> MfaRecoveryCodes regenerateMfaRecoveryCodes().execute();

Regenerate MFA Recovery Codes

Regenerate recovery codes that can be used as backup for MFA flow. Before regenerating codes, they must be first generated using [createMfaRecoveryCodes](/docs/references/cloud/client-web/account#createMfaRecoveryCodes) method. An OTP challenge is required to regenreate recovery codes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      MfaRecoveryCodes result = client
              .account
              .regenerateMfaRecoveryCodes()
              .execute();
      System.out.println(result);
      System.out.println(result.getRecoveryCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#regenerateMfaRecoveryCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MfaRecoveryCodes> response = client
              .account
              .regenerateMfaRecoveryCodes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#regenerateMfaRecoveryCodes");
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

[**MfaRecoveryCodes**](MfaRecoveryCodes.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | MFA Recovery Codes |  -  |

<a name="registerUser"></a>
# **registerUser**
> User registerUser().accountRegisterUserRequest(accountRegisterUserRequest).execute();

Create account

Use this endpoint to allow a new user to register a new account in your project. After the user registration completes successfully, you can use the [/account/verfication](https://appwrite.io/docs/references/cloud/client-web/account#createVerification) route to start verifying the user email address. To allow the new user to login to their new account, you need to create a new [account session](https://appwrite.io/docs/references/cloud/client-web/account#createEmailSession).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // User ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String email = "email_example"; // User email.
    String password = "password_example"; // New user password. Must be between 8 and 256 chars.
    String name = "name_example"; // User name. Max length: 128 chars.
    try {
      User result = client
              .account
              .registerUser(userId, email, password)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#registerUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .registerUser(userId, email, password)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#registerUser");
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
| **accountRegisterUserRequest** | [**AccountRegisterUserRequest**](AccountRegisterUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User |  -  |

<a name="removeSessions"></a>
# **removeSessions**
> removeSessions().execute();

Delete sessions

Delete all sessions from the user account and remove any sessions cookies from the end client.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
      client
              .account
              .removeSessions()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#removeSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .account
              .removeSessions()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#removeSessions");
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

<a name="updateMagicUrlSession"></a>
# **updateMagicUrlSession**
> Session updateMagicUrlSession().accountUpdateMagicUrlSessionRequest(accountUpdateMagicUrlSessionRequest).execute();

Update magic URL session

Use this endpoint to create a session from token. Provide the **userId** and **secret** parameters from the successful response of authentication flows initiated by token creation. For example, magic URL and phone login.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // User ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String secret = "secret_example"; // Valid verification token.
    try {
      Session result = client
              .account
              .updateMagicUrlSession(userId, secret)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateMagicUrlSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .updateMagicUrlSession(userId, secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateMagicUrlSession");
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
| **accountUpdateMagicUrlSessionRequest** | [**AccountUpdateMagicUrlSessionRequest**](AccountUpdateMagicUrlSessionRequest.md)|  | [optional] |

### Return type

[**Session**](Session.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session |  -  |

<a name="updateMfaStatus"></a>
# **updateMfaStatus**
> User updateMfaStatus().accountUpdateMfaStatusRequest(accountUpdateMfaStatusRequest).execute();

Update MFA

Enable or disable MFA on an account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    Boolean mfa = true; // Enable or disable MFA.
    try {
      User result = client
              .account
              .updateMfaStatus(mfa)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateMfaStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updateMfaStatus(mfa)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateMfaStatus");
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
| **accountUpdateMfaStatusRequest** | [**AccountUpdateMfaStatusRequest**](AccountUpdateMfaStatusRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="updateNameOperation"></a>
# **updateNameOperation**
> User updateNameOperation().accountUpdateNameOperationRequest(accountUpdateNameOperationRequest).execute();

Update name

Update currently logged in user account name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String name = "name_example"; // User name. Max length: 128 chars.
    try {
      User result = client
              .account
              .updateNameOperation(name)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateNameOperation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updateNameOperation(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateNameOperation");
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
| **accountUpdateNameOperationRequest** | [**AccountUpdateNameOperationRequest**](AccountUpdateNameOperationRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="updatePassword"></a>
# **updatePassword**
> User updatePassword().accountUpdatePasswordRequest(accountUpdatePasswordRequest).execute();

Update password

Update currently logged in user password. For validation, user is required to pass in the new password, and the old password. For users created with OAuth, Team Invites and Magic URL, oldPassword is optional.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String password = "password_example"; // New user password. Must be at least 8 chars.
    String oldPassword = "oldPassword_example"; // Current user password. Must be at least 8 chars.
    try {
      User result = client
              .account
              .updatePassword(password)
              .oldPassword(oldPassword)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePassword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updatePassword(password)
              .oldPassword(oldPassword)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePassword");
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
| **accountUpdatePasswordRequest** | [**AccountUpdatePasswordRequest**](AccountUpdatePasswordRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="updatePhone"></a>
# **updatePhone**
> User updatePhone().accountUpdatePhoneRequest(accountUpdatePhoneRequest).execute();

Update phone

Update the currently logged in user&#39;s phone number. After updating the phone number, the phone verification status will be reset. A confirmation SMS is not sent automatically, however you can use the [POST /account/verification/phone](https://appwrite.io/docs/references/cloud/client-web/account#createPhoneVerification) endpoint to send a confirmation SMS.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String phone = "phone_example"; // Phone number. Format this number with a leading '+' and a country code, e.g., +16175551212.
    String password = "password_example"; // User password. Must be at least 8 chars.
    try {
      User result = client
              .account
              .updatePhone(phone, password)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePhone");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updatePhone(phone, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePhone");
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
| **accountUpdatePhoneRequest** | [**AccountUpdatePhoneRequest**](AccountUpdatePhoneRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="updatePhoneSession"></a>
# **updatePhoneSession**
> Session updatePhoneSession().accountUpdatePhoneSessionRequest(accountUpdatePhoneSessionRequest).execute();

Update phone session

Use this endpoint to create a session from token. Provide the **userId** and **secret** parameters from the successful response of authentication flows initiated by token creation. For example, magic URL and phone login.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String userId = "userId_example"; // User ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String secret = "secret_example"; // Valid verification token.
    try {
      Session result = client
              .account
              .updatePhoneSession(userId, secret)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getExpire());
      System.out.println(result.getProvider());
      System.out.println(result.getProviderUid());
      System.out.println(result.getProviderAccessToken());
      System.out.println(result.getProviderAccessTokenExpiry());
      System.out.println(result.getProviderRefreshToken());
      System.out.println(result.getIp());
      System.out.println(result.getOsCode());
      System.out.println(result.getOsName());
      System.out.println(result.getOsVersion());
      System.out.println(result.getClientType());
      System.out.println(result.getClientCode());
      System.out.println(result.getClientName());
      System.out.println(result.getClientVersion());
      System.out.println(result.getClientEngine());
      System.out.println(result.getClientEngineVersion());
      System.out.println(result.getDeviceName());
      System.out.println(result.getDeviceBrand());
      System.out.println(result.getDeviceModel());
      System.out.println(result.getCountryCode());
      System.out.println(result.getCountryName());
      System.out.println(result.getCurrent());
      System.out.println(result.getFactors());
      System.out.println(result.getSecret());
      System.out.println(result.getMfaUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePhoneSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Session> response = client
              .account
              .updatePhoneSession(userId, secret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePhoneSession");
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
| **accountUpdatePhoneSessionRequest** | [**AccountUpdatePhoneSessionRequest**](AccountUpdatePhoneSessionRequest.md)|  | [optional] |

### Return type

[**Session**](Session.md)

### Authorization

[Project](../README.md#Project)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Session |  -  |

<a name="updatePreferences"></a>
# **updatePreferences**
> User updatePreferences().accountUpdatePreferencesRequest(accountUpdatePreferencesRequest).execute();

Update preferences

Update currently logged in user account preferences. The object you pass is stored as is, and replaces any previous value. The maximum allowed prefs size is 64kB and throws error if exceeded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    Object prefs = null; // Prefs key-value JSON object.
    try {
      User result = client
              .account
              .updatePreferences(prefs)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updatePreferences(prefs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePreferences");
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
| **accountUpdatePreferencesRequest** | [**AccountUpdatePreferencesRequest**](AccountUpdatePreferencesRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="updatePushTarget"></a>
# **updatePushTarget**
> Target updatePushTarget(targetId).accountUpdatePushTargetRequest(accountUpdatePushTargetRequest).execute();

Update push target



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://cloud.appwrite.io/v1";
    
    configuration.project  = "YOUR API KEY";
    
    configuration.session  = "YOUR API KEY";
    AppwriteClient client = new AppwriteClient(configuration);
    String identifier = "identifier_example"; // The target identifier (token, email, phone etc.)
    String targetId = "targetId_example"; // Target ID.
    try {
      Target result = client
              .account
              .updatePushTarget(identifier, targetId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getUserId());
      System.out.println(result.getProviderId());
      System.out.println(result.getProviderType());
      System.out.println(result.getIdentifier());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePushTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Target> response = client
              .account
              .updatePushTarget(identifier, targetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updatePushTarget");
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
| **targetId** | **String**| Target ID. | |
| **accountUpdatePushTargetRequest** | [**AccountUpdatePushTargetRequest**](AccountUpdatePushTargetRequest.md)|  | [optional] |

### Return type

[**Target**](Target.md)

### Authorization

[Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Target |  -  |

<a name="updateUserEmail"></a>
# **updateUserEmail**
> User updateUserEmail().accountUpdateUserEmailRequest(accountUpdateUserEmailRequest).execute();

Update email

Update currently logged in user account email address. After changing user address, the user confirmation status will get reset. A new confirmation email is not sent automatically however you can use the send confirmation email endpoint again to send the confirmation email. For security measures, user password is required to complete this request. This endpoint can also be used to convert an anonymous account to a normal one, by passing an email address and a new password. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String email = "email_example"; // User email.
    String password = "password_example"; // User password. Must be at least 8 chars.
    try {
      User result = client
              .account
              .updateUserEmail(email, password)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateUserEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .updateUserEmail(email, password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#updateUserEmail");
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
| **accountUpdateUserEmailRequest** | [**AccountUpdateUserEmailRequest**](AccountUpdateUserEmailRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |

<a name="verifyAuthenticator"></a>
# **verifyAuthenticator**
> User verifyAuthenticator(type).accountVerifyAuthenticatorRequest(accountVerifyAuthenticatorRequest).execute();

Verify Authenticator

Verify an authenticator app after adding it using the [add authenticator](/docs/references/cloud/client-web/account#addAuthenticator) method.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountApi;
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
    String otp = "otp_example"; // Valid verification token.
    String type = "totp"; // Type of authenticator.
    try {
      User result = client
              .account
              .verifyAuthenticator(otp, type)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getPassword());
      System.out.println(result.getHash());
      System.out.println(result.getHashOptions());
      System.out.println(result.getRegistration());
      System.out.println(result.getStatus());
      System.out.println(result.getLabels());
      System.out.println(result.getPasswordUpdate());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getEmailVerification());
      System.out.println(result.getPhoneVerification());
      System.out.println(result.getMfa());
      System.out.println(result.getPrefs());
      System.out.println(result.getTargets());
      System.out.println(result.getAccessedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#verifyAuthenticator");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .account
              .verifyAuthenticator(otp, type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#verifyAuthenticator");
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
| **type** | **String**| Type of authenticator. | [enum: totp] |
| **accountVerifyAuthenticatorRequest** | [**AccountVerifyAuthenticatorRequest**](AccountVerifyAuthenticatorRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User |  -  |


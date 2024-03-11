<div align="center">

[![Visit Appwrite](./header.png)](https://appwrite.io)

# [Appwrite](https://appwrite.io)

Appwrite backend as a service cuts up to 70% of the time and costs required for building a modern application. We abstract and simplify common development tasks behind a REST APIs, to help you develop your app in a fast and secure way. For full API documentation and tutorials go to [https://appwrite.io/docs](https://appwrite.io/docs)

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Appwrite&serviceName=Client&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>appwrite-client-java-sdk</artifactId>
  <version>1.5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:appwrite-client-java-sdk:1.5.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/appwrite-client-java-sdk-1.5.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://cloud.appwrite.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**addAuthenticator**](docs/AccountApi.md#addAuthenticator) | **POST** /account/mfa/authenticators/{type} | Add Authenticator
*AccountApi* | [**blockUserStatus**](docs/AccountApi.md#blockUserStatus) | **PATCH** /account/status | Update status
*AccountApi* | [**completeMfaChallenge**](docs/AccountApi.md#completeMfaChallenge) | **PUT** /account/mfa/challenge | Create MFA Challenge (confirmation)
*AccountApi* | [**completePasswordRecovery**](docs/AccountApi.md#completePasswordRecovery) | **PUT** /account/recovery | Create password recovery (confirmation)
*AccountApi* | [**confirmPhoneVerification**](docs/AccountApi.md#confirmPhoneVerification) | **PUT** /account/verification/phone | Create phone verification (confirmation)
*AccountApi* | [**createAnonymousSession**](docs/AccountApi.md#createAnonymousSession) | **POST** /account/sessions/anonymous | Create anonymous session
*AccountApi* | [**createEmailPasswordSession**](docs/AccountApi.md#createEmailPasswordSession) | **POST** /account/sessions/email | Create email password session
*AccountApi* | [**createEmailToken**](docs/AccountApi.md#createEmailToken) | **POST** /account/tokens/email | Create email token (OTP)
*AccountApi* | [**createEmailVerification**](docs/AccountApi.md#createEmailVerification) | **PUT** /account/verification | Create email verification (confirmation)
*AccountApi* | [**createEmailVerification_0**](docs/AccountApi.md#createEmailVerification_0) | **POST** /account/verification | Create email verification
*AccountApi* | [**createJwt**](docs/AccountApi.md#createJwt) | **POST** /account/jwt | Create JWT
*AccountApi* | [**createMagicUrlToken**](docs/AccountApi.md#createMagicUrlToken) | **POST** /account/tokens/magic-url | Create magic URL token
*AccountApi* | [**createMfaChallenge**](docs/AccountApi.md#createMfaChallenge) | **POST** /account/mfa/challenge | Create 2FA Challenge
*AccountApi* | [**createMfaRecoveryCodes**](docs/AccountApi.md#createMfaRecoveryCodes) | **POST** /account/mfa/recovery-codes | Create MFA Recovery Codes
*AccountApi* | [**createOAuth2Session**](docs/AccountApi.md#createOAuth2Session) | **GET** /account/sessions/oauth2/{provider} | Create OAuth2 session
*AccountApi* | [**createOAuth2Token**](docs/AccountApi.md#createOAuth2Token) | **GET** /account/tokens/oauth2/{provider} | Create OAuth2 token
*AccountApi* | [**createPasswordRecovery**](docs/AccountApi.md#createPasswordRecovery) | **POST** /account/recovery | Create password recovery
*AccountApi* | [**createPhoneToken**](docs/AccountApi.md#createPhoneToken) | **POST** /account/tokens/phone | Create phone token
*AccountApi* | [**createPhoneVerification**](docs/AccountApi.md#createPhoneVerification) | **POST** /account/verification/phone | Create phone verification
*AccountApi* | [**createPushTarget**](docs/AccountApi.md#createPushTarget) | **POST** /account/targets/push | Create push target
*AccountApi* | [**createSessionFromToken**](docs/AccountApi.md#createSessionFromToken) | **POST** /account/sessions/token | Create session
*AccountApi* | [**deleteAuthenticator**](docs/AccountApi.md#deleteAuthenticator) | **DELETE** /account/mfa/authenticators/{type} | Delete Authenticator
*AccountApi* | [**deleteIdentityById**](docs/AccountApi.md#deleteIdentityById) | **DELETE** /account/identities/{identityId} | Delete identity
*AccountApi* | [**deletePushTarget**](docs/AccountApi.md#deletePushTarget) | **DELETE** /account/targets/{targetId}/push | Delete push target
*AccountApi* | [**extendSessionLength**](docs/AccountApi.md#extendSessionLength) | **PATCH** /account/sessions/{sessionId} | Update session
*AccountApi* | [**getCurrentUser**](docs/AccountApi.md#getCurrentUser) | **GET** /account | Get account
*AccountApi* | [**getMfaRecoveryCodes**](docs/AccountApi.md#getMfaRecoveryCodes) | **GET** /account/mfa/recovery-codes | Get MFA Recovery Codes
*AccountApi* | [**getPrefs**](docs/AccountApi.md#getPrefs) | **GET** /account/prefs | Get account preferences
*AccountApi* | [**getSession**](docs/AccountApi.md#getSession) | **GET** /account/sessions/{sessionId} | Get session
*AccountApi* | [**listIdentities**](docs/AccountApi.md#listIdentities) | **GET** /account/identities | List Identities
*AccountApi* | [**listLogs**](docs/AccountApi.md#listLogs) | **GET** /account/logs | List logs
*AccountApi* | [**listMfaFactors**](docs/AccountApi.md#listMfaFactors) | **GET** /account/mfa/factors | List Factors
*AccountApi* | [**listSessions**](docs/AccountApi.md#listSessions) | **GET** /account/sessions | List sessions
*AccountApi* | [**logoutSessionById**](docs/AccountApi.md#logoutSessionById) | **DELETE** /account/sessions/{sessionId} | Delete session
*AccountApi* | [**regenerateMfaRecoveryCodes**](docs/AccountApi.md#regenerateMfaRecoveryCodes) | **PATCH** /account/mfa/recovery-codes | Regenerate MFA Recovery Codes
*AccountApi* | [**registerUser**](docs/AccountApi.md#registerUser) | **POST** /account | Create account
*AccountApi* | [**removeSessions**](docs/AccountApi.md#removeSessions) | **DELETE** /account/sessions | Delete sessions
*AccountApi* | [**updateMagicUrlSession**](docs/AccountApi.md#updateMagicUrlSession) | **PUT** /account/sessions/magic-url | Update magic URL session
*AccountApi* | [**updateMfaStatus**](docs/AccountApi.md#updateMfaStatus) | **PATCH** /account/mfa | Update MFA
*AccountApi* | [**updateNameOperation**](docs/AccountApi.md#updateNameOperation) | **PATCH** /account/name | Update name
*AccountApi* | [**updatePassword**](docs/AccountApi.md#updatePassword) | **PATCH** /account/password | Update password
*AccountApi* | [**updatePhone**](docs/AccountApi.md#updatePhone) | **PATCH** /account/phone | Update phone
*AccountApi* | [**updatePhoneSession**](docs/AccountApi.md#updatePhoneSession) | **PUT** /account/sessions/phone | Update phone session
*AccountApi* | [**updatePreferences**](docs/AccountApi.md#updatePreferences) | **PATCH** /account/prefs | Update preferences
*AccountApi* | [**updatePushTarget**](docs/AccountApi.md#updatePushTarget) | **PUT** /account/targets/{targetId}/push | Update push target
*AccountApi* | [**updateUserEmail**](docs/AccountApi.md#updateUserEmail) | **PATCH** /account/email | Update email
*AccountApi* | [**verifyAuthenticator**](docs/AccountApi.md#verifyAuthenticator) | **PUT** /account/mfa/authenticators/{type} | Verify Authenticator
*AvatarsApi* | [**generateQrCodeImage**](docs/AvatarsApi.md#generateQrCodeImage) | **GET** /avatars/qr | Get QR code
*AvatarsApi* | [**getBrowserIconByCode**](docs/AvatarsApi.md#getBrowserIconByCode) | **GET** /avatars/browsers/{code} | Get browser icon
*AvatarsApi* | [**getCountryFlagByCode**](docs/AvatarsApi.md#getCountryFlagByCode) | **GET** /avatars/flags/{code} | Get country flag
*AvatarsApi* | [**getCreditCardIcon**](docs/AvatarsApi.md#getCreditCardIcon) | **GET** /avatars/credit-cards/{code} | Get credit card icon
*AvatarsApi* | [**getFavicon**](docs/AvatarsApi.md#getFavicon) | **GET** /avatars/favicon | Get favicon
*AvatarsApi* | [**getRemoteImage**](docs/AvatarsApi.md#getRemoteImage) | **GET** /avatars/image | Get image from URL
*AvatarsApi* | [**getUserInitials**](docs/AvatarsApi.md#getUserInitials) | **GET** /avatars/initials | Get user initials
*DatabasesApi* | [**createDocument**](docs/DatabasesApi.md#createDocument) | **POST** /databases/{databaseId}/collections/{collectionId}/documents | Create document
*DatabasesApi* | [**deleteDocumentById**](docs/DatabasesApi.md#deleteDocumentById) | **DELETE** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Delete document
*DatabasesApi* | [**getDocumentById**](docs/DatabasesApi.md#getDocumentById) | **GET** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Get document
*DatabasesApi* | [**listUserDocuments**](docs/DatabasesApi.md#listUserDocuments) | **GET** /databases/{databaseId}/collections/{collectionId}/documents | List documents
*DatabasesApi* | [**updateDocumentById**](docs/DatabasesApi.md#updateDocumentById) | **PATCH** /databases/{databaseId}/collections/{collectionId}/documents/{documentId} | Update document
*FunctionsApi* | [**getExecutionLog**](docs/FunctionsApi.md#getExecutionLog) | **GET** /functions/{functionId}/executions/{executionId} | Get execution
*FunctionsApi* | [**listExecutions**](docs/FunctionsApi.md#listExecutions) | **GET** /functions/{functionId}/executions | List executions
*FunctionsApi* | [**triggerFunctionExecution**](docs/FunctionsApi.md#triggerFunctionExecution) | **POST** /functions/{functionId}/executions | Create execution
*GraphqlApi* | [**executeMutation**](docs/GraphqlApi.md#executeMutation) | **POST** /graphql | GraphQL endpoint
*GraphqlApi* | [**executeMutationOperation**](docs/GraphqlApi.md#executeMutationOperation) | **POST** /graphql/mutation | GraphQL endpoint
*LocaleApi* | [**getCurrencies**](docs/LocaleApi.md#getCurrencies) | **GET** /locale/currencies | List currencies
*LocaleApi* | [**getEUCountries**](docs/LocaleApi.md#getEUCountries) | **GET** /locale/countries/eu | List EU countries
*LocaleApi* | [**getUserLocale**](docs/LocaleApi.md#getUserLocale) | **GET** /locale | Get user locale
*LocaleApi* | [**listCodes**](docs/LocaleApi.md#listCodes) | **GET** /locale/codes | List Locale Codes
*LocaleApi* | [**listContinents**](docs/LocaleApi.md#listContinents) | **GET** /locale/continents | List continents
*LocaleApi* | [**listCountries**](docs/LocaleApi.md#listCountries) | **GET** /locale/countries | List countries
*LocaleApi* | [**listCountriesPhones**](docs/LocaleApi.md#listCountriesPhones) | **GET** /locale/countries/phones | List countries phone codes
*LocaleApi* | [**listLanguages**](docs/LocaleApi.md#listLanguages) | **GET** /locale/languages | List languages
*MessagingApi* | [**addNewSubscriber**](docs/MessagingApi.md#addNewSubscriber) | **POST** /messaging/topics/{topicId}/subscribers | Create subscriber
*MessagingApi* | [**deleteSubscriberById**](docs/MessagingApi.md#deleteSubscriberById) | **DELETE** /messaging/topics/{topicId}/subscribers/{subscriberId} | Delete subscriber
*StorageApi* | [**createFile**](docs/StorageApi.md#createFile) | **POST** /storage/buckets/{bucketId}/files | Create file
*StorageApi* | [**deleteFileById**](docs/StorageApi.md#deleteFileById) | **DELETE** /storage/buckets/{bucketId}/files/{fileId} | Delete File
*StorageApi* | [**getFileById**](docs/StorageApi.md#getFileById) | **GET** /storage/buckets/{bucketId}/files/{fileId} | Get file
*StorageApi* | [**getFileDownload**](docs/StorageApi.md#getFileDownload) | **GET** /storage/buckets/{bucketId}/files/{fileId}/download | Get file for download
*StorageApi* | [**getFileForView**](docs/StorageApi.md#getFileForView) | **GET** /storage/buckets/{bucketId}/files/{fileId}/view | Get file for view
*StorageApi* | [**getFilePreviewImage**](docs/StorageApi.md#getFilePreviewImage) | **GET** /storage/buckets/{bucketId}/files/{fileId}/preview | Get file preview
*StorageApi* | [**listFiles**](docs/StorageApi.md#listFiles) | **GET** /storage/buckets/{bucketId}/files | List files
*StorageApi* | [**updateFileById**](docs/StorageApi.md#updateFileById) | **PUT** /storage/buckets/{bucketId}/files/{fileId} | Update file
*TeamsApi* | [**createMembership**](docs/TeamsApi.md#createMembership) | **POST** /teams/{teamId}/memberships | Create team membership
*TeamsApi* | [**createNewTeam**](docs/TeamsApi.md#createNewTeam) | **POST** /teams | Create team
*TeamsApi* | [**deleteMembership**](docs/TeamsApi.md#deleteMembership) | **DELETE** /teams/{teamId}/memberships/{membershipId} | Delete team membership
*TeamsApi* | [**getById**](docs/TeamsApi.md#getById) | **GET** /teams/{teamId} | Get team
*TeamsApi* | [**getMembership**](docs/TeamsApi.md#getMembership) | **GET** /teams/{teamId}/memberships/{membershipId} | Get team membership
*TeamsApi* | [**getPrefs**](docs/TeamsApi.md#getPrefs) | **GET** /teams/{teamId}/prefs | Get team preferences
*TeamsApi* | [**getUserMemberships**](docs/TeamsApi.md#getUserMemberships) | **GET** /teams | List teams
*TeamsApi* | [**listMemberships**](docs/TeamsApi.md#listMemberships) | **GET** /teams/{teamId}/memberships | List team memberships
*TeamsApi* | [**removeTeam**](docs/TeamsApi.md#removeTeam) | **DELETE** /teams/{teamId} | Delete team
*TeamsApi* | [**updateMembershipRoles**](docs/TeamsApi.md#updateMembershipRoles) | **PATCH** /teams/{teamId}/memberships/{membershipId} | Update membership
*TeamsApi* | [**updateMembershipStatus**](docs/TeamsApi.md#updateMembershipStatus) | **PATCH** /teams/{teamId}/memberships/{membershipId}/status | Update team membership status
*TeamsApi* | [**updateNameById**](docs/TeamsApi.md#updateNameById) | **PUT** /teams/{teamId} | Update name
*TeamsApi* | [**updatePrefsById**](docs/TeamsApi.md#updatePrefsById) | **PUT** /teams/{teamId}/prefs | Update preferences


## Documentation for Models

 - [AccountCompleteMfaChallengeRequest](docs/AccountCompleteMfaChallengeRequest.md)
 - [AccountCompletePasswordRecoveryRequest](docs/AccountCompletePasswordRecoveryRequest.md)
 - [AccountConfirmPhoneVerificationRequest](docs/AccountConfirmPhoneVerificationRequest.md)
 - [AccountCreateEmailPasswordSessionRequest](docs/AccountCreateEmailPasswordSessionRequest.md)
 - [AccountCreateEmailTokenRequest](docs/AccountCreateEmailTokenRequest.md)
 - [AccountCreateEmailVerificationRequest](docs/AccountCreateEmailVerificationRequest.md)
 - [AccountCreateEmailVerificationRequest1](docs/AccountCreateEmailVerificationRequest1.md)
 - [AccountCreateMagicUrlTokenRequest](docs/AccountCreateMagicUrlTokenRequest.md)
 - [AccountCreateMfaChallengeRequest](docs/AccountCreateMfaChallengeRequest.md)
 - [AccountCreatePasswordRecoveryRequest](docs/AccountCreatePasswordRecoveryRequest.md)
 - [AccountCreatePhoneTokenRequest](docs/AccountCreatePhoneTokenRequest.md)
 - [AccountCreatePushTargetRequest](docs/AccountCreatePushTargetRequest.md)
 - [AccountCreateSessionFromTokenRequest](docs/AccountCreateSessionFromTokenRequest.md)
 - [AccountDeleteAuthenticatorRequest](docs/AccountDeleteAuthenticatorRequest.md)
 - [AccountRegisterUserRequest](docs/AccountRegisterUserRequest.md)
 - [AccountUpdateMagicUrlSessionRequest](docs/AccountUpdateMagicUrlSessionRequest.md)
 - [AccountUpdateMfaStatusRequest](docs/AccountUpdateMfaStatusRequest.md)
 - [AccountUpdateNameOperationRequest](docs/AccountUpdateNameOperationRequest.md)
 - [AccountUpdatePasswordRequest](docs/AccountUpdatePasswordRequest.md)
 - [AccountUpdatePhoneRequest](docs/AccountUpdatePhoneRequest.md)
 - [AccountUpdatePhoneSessionRequest](docs/AccountUpdatePhoneSessionRequest.md)
 - [AccountUpdatePreferencesRequest](docs/AccountUpdatePreferencesRequest.md)
 - [AccountUpdatePushTargetRequest](docs/AccountUpdatePushTargetRequest.md)
 - [AccountUpdateUserEmailRequest](docs/AccountUpdateUserEmailRequest.md)
 - [AccountVerifyAuthenticatorRequest](docs/AccountVerifyAuthenticatorRequest.md)
 - [AlgoArgon2](docs/AlgoArgon2.md)
 - [AlgoBcrypt](docs/AlgoBcrypt.md)
 - [AlgoMd5](docs/AlgoMd5.md)
 - [AlgoPhpass](docs/AlgoPhpass.md)
 - [AlgoScrypt](docs/AlgoScrypt.md)
 - [AlgoScryptModified](docs/AlgoScryptModified.md)
 - [AlgoSha](docs/AlgoSha.md)
 - [Continent](docs/Continent.md)
 - [ContinentList](docs/ContinentList.md)
 - [Country](docs/Country.md)
 - [CountryList](docs/CountryList.md)
 - [Currency](docs/Currency.md)
 - [CurrencyList](docs/CurrencyList.md)
 - [DatabasesCreateDocumentRequest](docs/DatabasesCreateDocumentRequest.md)
 - [DatabasesUpdateDocumentByIdRequest](docs/DatabasesUpdateDocumentByIdRequest.md)
 - [Document](docs/Document.md)
 - [DocumentList](docs/DocumentList.md)
 - [Error](docs/Error.md)
 - [Execution](docs/Execution.md)
 - [ExecutionList](docs/ExecutionList.md)
 - [FileList](docs/FileList.md)
 - [FunctionsTriggerFunctionExecutionRequest](docs/FunctionsTriggerFunctionExecutionRequest.md)
 - [Headers](docs/Headers.md)
 - [Identity](docs/Identity.md)
 - [IdentityList](docs/IdentityList.md)
 - [Jwt](docs/Jwt.md)
 - [Language](docs/Language.md)
 - [LanguageList](docs/LanguageList.md)
 - [Locale](docs/Locale.md)
 - [LocaleCode](docs/LocaleCode.md)
 - [LocaleCodeList](docs/LocaleCodeList.md)
 - [Log](docs/Log.md)
 - [LogList](docs/LogList.md)
 - [Membership](docs/Membership.md)
 - [MembershipList](docs/MembershipList.md)
 - [MessagingAddNewSubscriberRequest](docs/MessagingAddNewSubscriberRequest.md)
 - [MfaChallenge](docs/MfaChallenge.md)
 - [MfaFactors](docs/MfaFactors.md)
 - [MfaRecoveryCodes](docs/MfaRecoveryCodes.md)
 - [MfaType](docs/MfaType.md)
 - [ModelFile](docs/ModelFile.md)
 - [Phone](docs/Phone.md)
 - [PhoneList](docs/PhoneList.md)
 - [Session](docs/Session.md)
 - [SessionList](docs/SessionList.md)
 - [StorageCreateFileRequest](docs/StorageCreateFileRequest.md)
 - [StorageUpdateFileByIdRequest](docs/StorageUpdateFileByIdRequest.md)
 - [Subscriber](docs/Subscriber.md)
 - [Target](docs/Target.md)
 - [Team](docs/Team.md)
 - [TeamList](docs/TeamList.md)
 - [TeamsCreateMembershipRequest](docs/TeamsCreateMembershipRequest.md)
 - [TeamsCreateNewTeamRequest](docs/TeamsCreateNewTeamRequest.md)
 - [TeamsUpdateMembershipRolesRequest](docs/TeamsUpdateMembershipRolesRequest.md)
 - [TeamsUpdateMembershipStatusRequest](docs/TeamsUpdateMembershipStatusRequest.md)
 - [TeamsUpdateNameByIdRequest](docs/TeamsUpdateNameByIdRequest.md)
 - [TeamsUpdatePrefsByIdRequest](docs/TeamsUpdatePrefsByIdRequest.md)
 - [Token](docs/Token.md)
 - [User](docs/User.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

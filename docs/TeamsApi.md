# TeamsApi

All URIs are relative to *https://cloud.appwrite.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMembership**](TeamsApi.md#createMembership) | **POST** /teams/{teamId}/memberships | Create team membership |
| [**createNewTeam**](TeamsApi.md#createNewTeam) | **POST** /teams | Create team |
| [**deleteMembership**](TeamsApi.md#deleteMembership) | **DELETE** /teams/{teamId}/memberships/{membershipId} | Delete team membership |
| [**getById**](TeamsApi.md#getById) | **GET** /teams/{teamId} | Get team |
| [**getMembership**](TeamsApi.md#getMembership) | **GET** /teams/{teamId}/memberships/{membershipId} | Get team membership |
| [**getPrefs**](TeamsApi.md#getPrefs) | **GET** /teams/{teamId}/prefs | Get team preferences |
| [**getUserMemberships**](TeamsApi.md#getUserMemberships) | **GET** /teams | List teams |
| [**listMemberships**](TeamsApi.md#listMemberships) | **GET** /teams/{teamId}/memberships | List team memberships |
| [**removeTeam**](TeamsApi.md#removeTeam) | **DELETE** /teams/{teamId} | Delete team |
| [**updateMembershipRoles**](TeamsApi.md#updateMembershipRoles) | **PATCH** /teams/{teamId}/memberships/{membershipId} | Update membership |
| [**updateMembershipStatus**](TeamsApi.md#updateMembershipStatus) | **PATCH** /teams/{teamId}/memberships/{membershipId}/status | Update team membership status |
| [**updateNameById**](TeamsApi.md#updateNameById) | **PUT** /teams/{teamId} | Update name |
| [**updatePrefsById**](TeamsApi.md#updatePrefsById) | **PUT** /teams/{teamId}/prefs | Update preferences |


<a name="createMembership"></a>
# **createMembership**
> Membership createMembership(teamId).teamsCreateMembershipRequest(teamsCreateMembershipRequest).execute();

Create team membership

Invite a new member to join your team. Provide an ID for existing users, or invite unregistered users using an email or phone number. If initiated from a Client SDK, Appwrite will send an email or sms with a link to join the team to the invited user, and an account will be created for them if one doesn&#39;t exist. If initiated from a Server SDK, the new member will be added automatically to the team.  You only need to provide one of a user ID, email, or phone number. Appwrite will prioritize accepting the user ID &gt; email &gt; phone number if you provide more than one of these parameters.  Use the &#x60;url&#x60; parameter to redirect the user from the invitation email to your app. After the user is redirected, use the [Update Team Membership Status](https://appwrite.io/docs/references/cloud/client-web/teams#updateMembershipStatus) endpoint to allow the user to accept the invitation to the team.   Please note that to avoid a [Redirect Attack](https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.md) Appwrite will accept the only redirect URLs under the domains you have added as a platform on the Appwrite Console. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    List<String> roles = Arrays.asList(); // Array of strings. Use this param to set the user roles in the team. A role can be any string. Learn more about [roles and permissions](https://appwrite.io/docs/permissions). Maximum of 100 roles are allowed, each 32 characters long.
    String teamId = "teamId_example"; // Team ID.
    String email = "email_example"; // Email of the new team member.
    String userId = "userId_example"; // ID of the user to be added to a team.
    String phone = "phone_example"; // Phone number. Format this number with a leading '+' and a country code, e.g., +16175551212.
    String url = "url_example"; // URL to redirect the user back to your app from the invitation email.  Only URLs from hostnames in your project platform list are allowed. This requirement helps to prevent an [open redirect](https://cheatsheetseries.owasp.org/cheatsheets/Unvalidated_Redirects_and_Forwards_Cheat_Sheet.html) attack against your project API.
    String name = "name_example"; // Name of the new team member. Max length: 128 chars.
    try {
      Membership result = client
              .teams
              .createMembership(roles, teamId)
              .email(email)
              .userId(userId)
              .phone(phone)
              .url(url)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getTeamId());
      System.out.println(result.getTeamName());
      System.out.println(result.getInvited());
      System.out.println(result.getJoined());
      System.out.println(result.getConfirm());
      System.out.println(result.getMfa());
      System.out.println(result.getRoles());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Membership> response = client
              .teams
              .createMembership(roles, teamId)
              .email(email)
              .userId(userId)
              .phone(phone)
              .url(url)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createMembership");
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
| **teamId** | **String**| Team ID. | |
| **teamsCreateMembershipRequest** | [**TeamsCreateMembershipRequest**](TeamsCreateMembershipRequest.md)|  | [optional] |

### Return type

[**Membership**](Membership.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Membership |  -  |

<a name="createNewTeam"></a>
# **createNewTeam**
> Team createNewTeam().teamsCreateNewTeamRequest(teamsCreateNewTeamRequest).execute();

Create team

Create a new team. The user who creates the team will automatically be assigned as the owner of the team. Only the users with the owner role can invite new members, add new owners and delete or update the team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID. Choose a custom ID or generate a random ID with `ID.unique()`. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can't start with a special char. Max length is 36 chars.
    String name = "name_example"; // Team name. Max length: 128 chars.
    List<String> roles = Arrays.asList(); // Array of strings. Use this param to set the roles in the team for the user who created it. The default role is **owner**. A role can be any string. Learn more about [roles and permissions](https://appwrite.io/docs/permissions). Maximum of 100 roles are allowed, each 32 characters long.
    try {
      Team result = client
              .teams
              .createNewTeam(teamId, name)
              .roles(roles)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getTotal());
      System.out.println(result.getPrefs());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createNewTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .createNewTeam(teamId, name)
              .roles(roles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createNewTeam");
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
| **teamsCreateNewTeamRequest** | [**TeamsCreateNewTeamRequest**](TeamsCreateNewTeamRequest.md)|  | [optional] |

### Return type

[**Team**](Team.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Team |  -  |

<a name="deleteMembership"></a>
# **deleteMembership**
> deleteMembership(teamId, membershipId).execute();

Delete team membership

This endpoint allows a user to leave a team or for a team owner to delete the membership of any other team member. You can also use this endpoint to delete a user membership even if it is not accepted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    String membershipId = "membershipId_example"; // Membership ID.
    try {
      client
              .teams
              .deleteMembership(teamId, membershipId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .teams
              .deleteMembership(teamId, membershipId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteMembership");
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
| **teamId** | **String**| Team ID. | |
| **membershipId** | **String**| Membership ID. | |

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

<a name="getById"></a>
# **getById**
> Team getById(teamId).execute();

Get team

Get a team by its ID. All team members have read access for this resource.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    try {
      Team result = client
              .teams
              .getById(teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getTotal());
      System.out.println(result.getPrefs());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .getById(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getById");
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
| **teamId** | **String**| Team ID. | |

### Return type

[**Team**](Team.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team |  -  |

<a name="getMembership"></a>
# **getMembership**
> Membership getMembership(teamId, membershipId).execute();

Get team membership

Get a team member by the membership unique id. All team members have read access for this resource.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    String membershipId = "membershipId_example"; // Membership ID.
    try {
      Membership result = client
              .teams
              .getMembership(teamId, membershipId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getTeamId());
      System.out.println(result.getTeamName());
      System.out.println(result.getInvited());
      System.out.println(result.getJoined());
      System.out.println(result.getConfirm());
      System.out.println(result.getMfa());
      System.out.println(result.getRoles());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Membership> response = client
              .teams
              .getMembership(teamId, membershipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getMembership");
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
| **teamId** | **String**| Team ID. | |
| **membershipId** | **String**| Membership ID. | |

### Return type

[**Membership**](Membership.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Membership |  -  |

<a name="getPrefs"></a>
# **getPrefs**
> Map&lt;String, Object&gt; getPrefs(teamId).execute();

Get team preferences

Get the team&#39;s shared preferences by its unique ID. If a preference doesn&#39;t need to be shared by all team members, prefer storing them in [user preferences](https://appwrite.io/docs/references/cloud/client-web/account#getPrefs).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    try {
      Map<String, Object> result = client
              .teams
              .getPrefs(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getPrefs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .teams
              .getPrefs(teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getPrefs");
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
| **teamId** | **String**| Team ID. | |

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

<a name="getUserMemberships"></a>
# **getUserMemberships**
> TeamList getUserMemberships().queries(queries).search(search).execute();

List teams

Get a list of all the teams in which the current user is a member. You can use the parameters to filter your results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: name, total, billingPlan
    String search = ""; // Search term to filter your list results. Max length: 256 chars.
    try {
      TeamList result = client
              .teams
              .getUserMemberships()
              .queries(queries)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getTeams());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getUserMemberships");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TeamList> response = client
              .teams
              .getUserMemberships()
              .queries(queries)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getUserMemberships");
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
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: name, total, billingPlan | [optional] |
| **search** | **String**| Search term to filter your list results. Max length: 256 chars. | [optional] [default to ] |

### Return type

[**TeamList**](TeamList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Teams List |  -  |

<a name="listMemberships"></a>
# **listMemberships**
> MembershipList listMemberships(teamId).queries(queries).search(search).execute();

List team memberships

Use this endpoint to list a team&#39;s members using the team&#39;s ID. All team members have read access to this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    List<String> queries = Arrays.asList(); // Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: userId, teamId, invited, joined, confirm
    String search = ""; // Search term to filter your list results. Max length: 256 chars.
    try {
      MembershipList result = client
              .teams
              .listMemberships(teamId)
              .queries(queries)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotal());
      System.out.println(result.getMemberships());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listMemberships");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MembershipList> response = client
              .teams
              .listMemberships(teamId)
              .queries(queries)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listMemberships");
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
| **teamId** | **String**| Team ID. | |
| **queries** | [**List&lt;String&gt;**](String.md)| Array of query strings generated using the Query class provided by the SDK. [Learn more about queries](https://appwrite.io/docs/queries). Maximum of 100 queries are allowed, each 4096 characters long. You may filter on the following attributes: userId, teamId, invited, joined, confirm | [optional] |
| **search** | **String**| Search term to filter your list results. Max length: 256 chars. | [optional] [default to ] |

### Return type

[**MembershipList**](MembershipList.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Memberships List |  -  |

<a name="removeTeam"></a>
# **removeTeam**
> removeTeam(teamId).execute();

Delete team

Delete a team using its ID. Only team members with the owner role can delete the team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    try {
      client
              .teams
              .removeTeam(teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .teams
              .removeTeam(teamId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeTeam");
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
| **teamId** | **String**| Team ID. | |

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

<a name="updateMembershipRoles"></a>
# **updateMembershipRoles**
> Membership updateMembershipRoles(teamId, membershipId).teamsUpdateMembershipRolesRequest(teamsUpdateMembershipRolesRequest).execute();

Update membership

Modify the roles of a team member. Only team members with the owner role have access to this endpoint. Learn more about [roles and permissions](https://appwrite.io/docs/permissions). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    List<String> roles = Arrays.asList(); // An array of strings. Use this param to set the user's roles in the team. A role can be any string. Learn more about [roles and permissions](https://appwrite.io/docs/permissions). Maximum of 100 roles are allowed, each 32 characters long.
    String teamId = "teamId_example"; // Team ID.
    String membershipId = "membershipId_example"; // Membership ID.
    try {
      Membership result = client
              .teams
              .updateMembershipRoles(roles, teamId, membershipId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getTeamId());
      System.out.println(result.getTeamName());
      System.out.println(result.getInvited());
      System.out.println(result.getJoined());
      System.out.println(result.getConfirm());
      System.out.println(result.getMfa());
      System.out.println(result.getRoles());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateMembershipRoles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Membership> response = client
              .teams
              .updateMembershipRoles(roles, teamId, membershipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateMembershipRoles");
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
| **teamId** | **String**| Team ID. | |
| **membershipId** | **String**| Membership ID. | |
| **teamsUpdateMembershipRolesRequest** | [**TeamsUpdateMembershipRolesRequest**](TeamsUpdateMembershipRolesRequest.md)|  | [optional] |

### Return type

[**Membership**](Membership.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Membership |  -  |

<a name="updateMembershipStatus"></a>
# **updateMembershipStatus**
> Membership updateMembershipStatus(teamId, membershipId).teamsUpdateMembershipStatusRequest(teamsUpdateMembershipStatusRequest).execute();

Update team membership status

Use this endpoint to allow a user to accept an invitation to join a team after being redirected back to your app from the invitation email received by the user.  If the request is successful, a session for the user is automatically created. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String secret = "secret_example"; // Secret key.
    String teamId = "teamId_example"; // Team ID.
    String membershipId = "membershipId_example"; // Membership ID.
    try {
      Membership result = client
              .teams
              .updateMembershipStatus(userId, secret, teamId, membershipId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getUserId());
      System.out.println(result.getUserName());
      System.out.println(result.getUserEmail());
      System.out.println(result.getTeamId());
      System.out.println(result.getTeamName());
      System.out.println(result.getInvited());
      System.out.println(result.getJoined());
      System.out.println(result.getConfirm());
      System.out.println(result.getMfa());
      System.out.println(result.getRoles());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateMembershipStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Membership> response = client
              .teams
              .updateMembershipStatus(userId, secret, teamId, membershipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateMembershipStatus");
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
| **teamId** | **String**| Team ID. | |
| **membershipId** | **String**| Membership ID. | |
| **teamsUpdateMembershipStatusRequest** | [**TeamsUpdateMembershipStatusRequest**](TeamsUpdateMembershipStatusRequest.md)|  | [optional] |

### Return type

[**Membership**](Membership.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Membership |  -  |

<a name="updateNameById"></a>
# **updateNameById**
> Team updateNameById(teamId).teamsUpdateNameByIdRequest(teamsUpdateNameByIdRequest).execute();

Update name

Update the team&#39;s name by its unique ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String name = "name_example"; // New team name. Max length: 128 chars.
    String teamId = "teamId_example"; // Team ID.
    try {
      Team result = client
              .teams
              .updateNameById(name, teamId)
              .execute();
      System.out.println(result);
      System.out.println(result.get$Id());
      System.out.println(result.get$CreatedAt());
      System.out.println(result.get$UpdatedAt());
      System.out.println(result.getName());
      System.out.println(result.getTotal());
      System.out.println(result.getPrefs());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .updateNameById(name, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateNameById");
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
| **teamId** | **String**| Team ID. | |
| **teamsUpdateNameByIdRequest** | [**TeamsUpdateNameByIdRequest**](TeamsUpdateNameByIdRequest.md)|  | [optional] |

### Return type

[**Team**](Team.md)

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team |  -  |

<a name="updatePrefsById"></a>
# **updatePrefsById**
> Map&lt;String, Object&gt; updatePrefsById(teamId).teamsUpdatePrefsByIdRequest(teamsUpdatePrefsByIdRequest).execute();

Update preferences

Update the team&#39;s preferences by its unique ID. The object you pass is stored as is and replaces any previous value. The maximum allowed prefs size is 64kB and throws an error if exceeded.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.AppwriteClient;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamId = "teamId_example"; // Team ID.
    try {
      Map<String, Object> result = client
              .teams
              .updatePrefsById(prefs, teamId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updatePrefsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .teams
              .updatePrefsById(prefs, teamId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updatePrefsById");
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
| **teamId** | **String**| Team ID. | |
| **teamsUpdatePrefsByIdRequest** | [**TeamsUpdatePrefsByIdRequest**](TeamsUpdatePrefsByIdRequest.md)|  | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[JWT](../README.md#JWT), [Project](../README.md#Project), [Session](../README.md#Session)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preferences |  -  |


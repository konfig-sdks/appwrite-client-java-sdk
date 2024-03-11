

# User

User

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$id** | **String** | User ID. |  |
|**$createdAt** | **String** | User creation date in ISO 8601 format. |  |
|**$updatedAt** | **String** | User update date in ISO 8601 format. |  |
|**name** | **String** | User name. |  |
|**password** | **String** | Hashed user password. |  [optional] |
|**hash** | **String** | Password hashing algorithm. |  [optional] |
|**hashOptions** | **List&lt;Object&gt;** | Password hashing algorithm configuration. |  [optional] |
|**registration** | **String** | User registration date in ISO 8601 format. |  |
|**status** | **Boolean** | User status. Pass &#x60;true&#x60; for enabled and &#x60;false&#x60; for disabled. |  |
|**labels** | **List&lt;String&gt;** | Labels for the user. |  |
|**passwordUpdate** | **String** | Password update time in ISO 8601 format. |  |
|**email** | **String** | User email address. |  |
|**phone** | **String** | User phone number in E.164 format. |  |
|**emailVerification** | **Boolean** | Email verification status. |  |
|**phoneVerification** | **Boolean** | Phone verification status. |  |
|**mfa** | **Boolean** | Multi factor authentication status. |  |
|**prefs** | **List&lt;Map&lt;String, Object&gt;&gt;** | User preferences as a key-value object |  |
|**targets** | [**List&lt;Target&gt;**](Target.md) | A user-owned message receiver. A single user may have multiple e.g. emails, phones, and a browser. Each target is registered with a single provider. |  |
|**accessedAt** | **String** | Most recent access date in ISO 8601 format. This attribute is only updated again after 24 hours. |  |




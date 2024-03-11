

# TeamsCreateNewTeamRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**teamId** | **String** | Team ID. Choose a custom ID or generate a random ID with &#x60;ID.unique()&#x60;. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can&#39;t start with a special char. Max length is 36 chars. |  |
|**name** | **String** | Team name. Max length: 128 chars. |  |
|**roles** | **List&lt;String&gt;** | Array of strings. Use this param to set the roles in the team for the user who created it. The default role is **owner**. A role can be any string. Learn more about [roles and permissions](https://appwrite.io/docs/permissions). Maximum of 100 roles are allowed, each 32 characters long. |  [optional] |




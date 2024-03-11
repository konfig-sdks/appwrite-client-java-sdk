

# StorageCreateFileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | File ID. Choose a custom ID or generate a random ID with &#x60;ID.unique()&#x60;. Valid chars are a-z, A-Z, 0-9, period, hyphen, and underscore. Can&#39;t start with a special char. Max length is 36 chars. |  |
|**_file** | **String** | Binary file. Appwrite SDKs provide helpers to handle file input. [Learn about file input](https://appwrite.io/docs/storage#file-input). |  |
|**permissions** | **List&lt;String&gt;** | An array of permission strings. By default, only the current user is granted all permissions. [Learn more about permissions](https://appwrite.io/docs/permissions). |  [optional] |




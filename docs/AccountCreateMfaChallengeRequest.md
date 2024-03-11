

# AccountCreateMfaChallengeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**factor** | [**FactorEnum**](#FactorEnum) | Factor used for verification. Must be one of following: &#x60;email&#x60;, &#x60;phone&#x60;, &#x60;totp&#x60;, &#x60;recoveryCode&#x60;. |  |



## Enum: FactorEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| PHONE | &quot;phone&quot; |
| TOTP | &quot;totp&quot; |
| RECOVERYCODE | &quot;recoverycode&quot; |




# PasswordRequirementsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passwordRequirementsGetAll**](PasswordRequirementsapi.md#passwordRequirementsGetAll) | **GET** v1.2/Password/Requirements/Settings | Возвращает список требований к паролям.
[**passwordRequirementsGetAllActiveRules**](PasswordRequirementsapi.md#passwordRequirementsGetAllActiveRules) | **GET** v1.2/Password/Requirements | Получить список активных правил проверок пароля.



Возвращает список требований к паролям.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PasswordRequirementsapi::class.java)

val result : ResultModelOfListOfPasswordRuleViewModel = webService.passwordRequirementsGetAll()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPasswordRuleViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список активных правил проверок пароля.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PasswordRequirementsapi::class.java)

val result : ResultModelOfListOfPasswordRequirementViewModel = webService.passwordRequirementsGetAllActiveRules()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPasswordRequirementViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


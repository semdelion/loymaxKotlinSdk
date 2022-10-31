# UserApplicationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApplicationGetApplications**](UserApplicationapi.md#userApplicationGetApplications) | **GET** v1.2/Applications | Возвращает список OAuth-приложений клиента.
[**userApplicationRemove**](UserApplicationapi.md#userApplicationRemove) | **DELETE** v1.2/Applications/{userApplicationId} | Удаляет OAuth-приложение клиента.



Возвращает список OAuth-приложений клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApplicationapi::class.java)

val result : ResultModelOfListOfUserApplicationViewModel = webService.userApplicationGetApplications()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfUserApplicationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет OAuth-приложение клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserApplicationapi::class.java)
val userApplicationId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор OAuth-приложения.

val result : ResultModel = webService.userApplicationRemove(userApplicationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userApplicationId** | **kotlin.Int**| Внутренний идентификатор OAuth-приложения. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# ApplicationPermissionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationPermissionGet**](ApplicationPermissionapi.md#applicationPermissionGet) | **GET** v1.2/OAuth/Applications/{applicationId}/Permissions | Получить список разрешений приложения.
[**applicationPermissionGetAll**](ApplicationPermissionapi.md#applicationPermissionGetAll) | **GET** v1.2/OAuth/Applications/Permissions | Получить все разрешения для приложений.



Получить список разрешений приложения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ApplicationPermissionapi::class.java)
val applicationId : kotlin.Int = 56 // kotlin.Int | Идентификатор приложения.

val result : ResultModelOfListOfString = webService.applicationPermissionGet(applicationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **kotlin.Int**| Идентификатор приложения. |

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить все разрешения для приложений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ApplicationPermissionapi::class.java)

val result : ResultModelOfListOfPermissionViewModel = webService.applicationPermissionGetAll()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPermissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


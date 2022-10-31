# Permissionsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionsGetAll**](Permissionsapi.md#permissionsGetAll) | **GET** v1.2/permissions | Получить все разрешения.
[**permissionsGetPermissionsForCurrentPerson**](Permissionsapi.md#permissionsGetPermissionsForCurrentPerson) | **GET** v1.2/user/permissions | Получить разрешения текущего пользователя.
[**permissionsHasPermission**](Permissionsapi.md#permissionsHasPermission) | **GET** v1.2/user/permission | Определяет, имеет ли текущий пользователь указанное разрешение для заданного партнера.



Получить все разрешения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Permissionsapi::class.java)

val result : ResultModelOfListOfPermissionViewModel = webService.permissionsGetAll()
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


Получить разрешения текущего пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Permissionsapi::class.java)

val result : ResultModelOfListOfString = webService.permissionsGetPermissionsForCurrentPerson()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Определяет, имеет ли текущий пользователь указанное разрешение для заданного партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Permissionsapi::class.java)
val permission : kotlin.String = permission_example // kotlin.String | Разрешение.
val partnerId : kotlin.Int = 56 // kotlin.Int | ID партнера.

val result : ResultModelOfBoolean = webService.permissionsHasPermission(permission, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **kotlin.String**| Разрешение. |
 **partnerId** | **kotlin.Int**| ID партнера. |

### Return type

**ResultModelOfBoolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


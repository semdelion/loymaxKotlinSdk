# UserStatusapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userStatusGetStatusInfo**](UserStatusapi.md#userStatusGetStatusInfo) | **GET** v1.2/users/{personId}/status | Возвращает информацию о статусной системе и статусе клиента.
[**userStatusGetStatusesInfo**](UserStatusapi.md#userStatusGetStatusesInfo) | **GET** v1.2/user/status | Возвращает клиенту подробную информацию о его статусах в статусных системах.
[**userStatusGetUsersStatusByLogicalName**](UserStatusapi.md#userStatusGetUsersStatusByLogicalName) | **GET** v1.2/users/status/{logicalName} | Возвращает клиенту информацию о статусе по логическому имени статусной системы.



Возвращает информацию о статусной системе и статусе клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserStatusapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfListOfSystemApiPersonStatusViewModel = webService.userStatusGetStatusInfo(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfListOfSystemApiPersonStatusViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает клиенту подробную информацию о его статусах в статусных системах.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserStatusapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки (где 0–последняя созданная статусная система). Если не заполнять, возвращает все статусные системы.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки. Если не заполнять, возвращает все статусные системы.

val result : ResultModelOfListOfPersonStatusViewModel = webService.userStatusGetStatusesInfo(from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки (где 0–последняя созданная статусная система). Если не заполнять, возвращает все статусные системы. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. Если не заполнять, возвращает все статусные системы. | [optional]

### Return type

**ResultModelOfListOfPersonStatusViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает клиенту информацию о статусе по логическому имени статусной системы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserStatusapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя статусной системы.

val result : ResultModelOfPersonStatusViewModel = webService.userStatusGetUsersStatusByLogicalName(logicalName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя статусной системы. |

### Return type

**ResultModelOfPersonStatusViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


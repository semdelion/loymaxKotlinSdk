# AnnouncementSpaceapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementSpaceGetAll**](AnnouncementSpaceapi.md#announcementSpaceGetAll) | **GET** v1.2/AnnouncementSpace | Возвращает описание всех рекламных мест.
[**announcementSpaceGetBySpace**](AnnouncementSpaceapi.md#announcementSpaceGetBySpace) | **GET** v1.2/AnnouncementSpace/{id}/attributes | Возвращает все атрибуты рекламного места.
[**announcementSpaceGetSpace**](AnnouncementSpaceapi.md#announcementSpaceGetSpace) | **GET** v1.2/AnnouncementSpace/{id} | Возвращает информацию о рекламном месте.



Возвращает описание всех рекламных мест.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AnnouncementSpaceapi::class.java)

val result : ResultModelOfListOfSpaceModel = webService.announcementSpaceGetAll()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfSpaceModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает все атрибуты рекламного места.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AnnouncementSpaceapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламного места.

val result : ResultModelOfListOfAttributeModel = webService.announcementSpaceGetBySpace(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламного места. |

### Return type

**ResultModelOfListOfAttributeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о рекламном месте.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AnnouncementSpaceapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламного места.

val result : ResultModelOfSpaceModel = webService.announcementSpaceGetSpace(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламного места. |

### Return type

**ResultModelOfSpaceModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


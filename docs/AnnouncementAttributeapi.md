# AnnouncementAttributeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementAttributeGetAll**](AnnouncementAttributeapi.md#announcementAttributeGetAll) | **GET** v1.2/AnnouncementAttribute | Возвращает все атрибуты.
[**announcementAttributeGetAttribute**](AnnouncementAttributeapi.md#announcementAttributeGetAttribute) | **GET** v1.2/AnnouncementAttribute/{id} | Возвращает информацию об атрибуте.



Возвращает все атрибуты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AnnouncementAttributeapi::class.java)

val result : ResultModelOfListOfAttributeModel = webService.announcementAttributeGetAll()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfAttributeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об атрибуте.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(AnnouncementAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор атрибута.

val result : ResultModelOfAttributeModel = webService.announcementAttributeGetAttribute(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор атрибута. |

### Return type

**ResultModelOfAttributeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


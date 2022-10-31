# BrandsImagesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandsImagesGetImage**](BrandsImagesapi.md#brandsImagesGetImage) | **GET** v1.2/brands/{brandId}/Images/{imageId} | Возвращает информацию об изображении бренда.
[**brandsImagesGetImages**](BrandsImagesapi.md#brandsImagesGetImages) | **GET** v1.2/brands/{brandId}/Images | Возвращает список изображений для бренда.



Возвращает информацию об изображении бренда.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BrandsImagesapi::class.java)
val brandId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор бренда.
val imageId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор изображения.

val result : ResultModelOfImageFileViewModel = webService.brandsImagesGetImage(brandId, imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.Int**| Внутренний идентификатор бренда. |
 **imageId** | **kotlin.Int**| Внутренний идентификатор изображения. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список изображений для бренда.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BrandsImagesapi::class.java)
val brandId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор бренда.

val result : ResultModelOfListOfImageFileViewModel = webService.brandsImagesGetImages(brandId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.Int**| Внутренний идентификатор бренда. |

### Return type

**ResultModelOfListOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


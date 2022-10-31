# CouponEmissionImagesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**couponEmissionImagesGetImage**](CouponEmissionImagesapi.md#couponEmissionImagesGetImage) | **GET** v1.2/emissions/coupons/{emissionId}/Image | Возвращает изображение выпуска купонов.



Возвращает изображение выпуска купонов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionImagesapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска купонов.

val result : ResultModelOfImageFileViewModel = webService.couponEmissionImagesGetImage(emissionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Внутренний идентификатор выпуска купонов. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


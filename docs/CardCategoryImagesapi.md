# CardCategoryImagesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardCategoryImagesGetImage**](CardCategoryImagesapi.md#cardCategoryImagesGetImage) | **GET** v1.2/cardCategories/{categoryId}/Images/{imageId} | Получить изображение.
[**cardCategoryImagesGetImages**](CardCategoryImagesapi.md#cardCategoryImagesGetImages) | **GET** v1.2/cardCategories/{categoryId}/Images | Получить список изображений для категории.



Получить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardCategoryImagesapi::class.java)
val categoryId : kotlin.Int = 56 // kotlin.Int | Идентификатор категории карт.
val imageId : kotlin.Int = 56 // kotlin.Int | Идентификатор файла.

val result : ResultModelOfImageFileViewModel = webService.cardCategoryImagesGetImage(categoryId, imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.Int**| Идентификатор категории карт. |
 **imageId** | **kotlin.Int**| Идентификатор файла. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список изображений для категории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardCategoryImagesapi::class.java)
val categoryId : kotlin.Int = 56 // kotlin.Int | Идентификатор категории карт.

val result : ResultModelOfListOfImageFileViewModel = webService.cardCategoryImagesGetImages(categoryId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **kotlin.Int**| Идентификатор категории карт. |

### Return type

**ResultModelOfListOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# LoyaltyProgramsImagesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loyaltyProgramsImagesGetImage**](LoyaltyProgramsImagesapi.md#loyaltyProgramsImagesGetImage) | **GET** v1.2/loyaltyPrograms/{loyaltyProgramId}/Images/{imageId} | Получить изображение.
[**loyaltyProgramsImagesGetImages**](LoyaltyProgramsImagesapi.md#loyaltyProgramsImagesGetImages) | **GET** v1.2/loyaltyPrograms/{loyaltyProgramId}/Images | Получить список изображений для программы лояльности.



Получить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramsImagesapi::class.java)
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.
val imageId : kotlin.Int = 56 // kotlin.Int | Идентификатор файла.

val result : ResultModelOfImageFileViewModel = webService.loyaltyProgramsImagesGetImage(loyaltyProgramId, imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **kotlin.Int**| Идентификатор программы лояльности. |
 **imageId** | **kotlin.Int**| Идентификатор файла. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список изображений для программы лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramsImagesapi::class.java)
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.

val result : ResultModelOfListOfImageFileViewModel = webService.loyaltyProgramsImagesGetImages(loyaltyProgramId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loyaltyProgramId** | **kotlin.Int**| Идентификатор программы лояльности. |

### Return type

**ResultModelOfListOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


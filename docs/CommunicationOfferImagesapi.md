# CommunicationOfferImagesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationOfferImagesGetImage**](CommunicationOfferImagesapi.md#communicationOfferImagesGetImage) | **GET** v1.2/communicationOffers/{offerId}/Images/{imageId} | Получить изображение.
[**communicationOfferImagesGetImages**](CommunicationOfferImagesapi.md#communicationOfferImagesGetImages) | **GET** v1.2/communicationOffers/{offerId}/Images | Получить список изображений для акции.



Получить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferImagesapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val imageId : kotlin.Int = 56 // kotlin.Int | Идентификатор файла.

val result : ResultModelOfImageFileViewModel = webService.communicationOfferImagesGetImage(offerId, imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **imageId** | **kotlin.Int**| Идентификатор файла. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список изображений для акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferImagesapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.

val result : ResultModelOfListOfImageFileViewModel = webService.communicationOfferImagesGetImages(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |

### Return type

**ResultModelOfListOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


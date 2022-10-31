# CommunicationOfferDetailapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationOfferDetailGetOfferDetail**](CommunicationOfferDetailapi.md#communicationOfferDetailGetOfferDetail) | **GET** v1.2/communicationOffers/{offerId}/details/{id} | Получение описания детали для акции.
[**communicationOfferDetailGetOfferDetails**](CommunicationOfferDetailapi.md#communicationOfferDetailGetOfferDetails) | **GET** v1.2/communicationOffers/{offerId}/details | Возвращает список деталей для акций.



Получение описания детали для акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferDetailapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val id : kotlin.String = id_example // kotlin.String | Идентификатор деталей.

val result : ResultModelOfOfferDetailModel = webService.communicationOfferDetailGetOfferDetail(offerId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **id** | **kotlin.String**| Идентификатор деталей. |

### Return type

**ResultModelOfOfferDetailModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список деталей для акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferDetailapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.

val result : ResultModelOfListOfOfferDetailModel = webService.communicationOfferDetailGetOfferDetails(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |

### Return type

**ResultModelOfListOfOfferDetailModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


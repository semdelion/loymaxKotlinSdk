# CommunicationOfferInstructionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationOfferInstructionGetOfferInstructions**](CommunicationOfferInstructionapi.md#communicationOfferInstructionGetOfferInstructions) | **GET** v1.2/communicationOffers/{offerId}/instructions | Возвращает все инструкций для акций в виде многострочного текста.



Возвращает все инструкций для акций в виде многострочного текста.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferInstructionapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.

val result : ResultModelOfOfferInstructionsModel = webService.communicationOfferInstructionGetOfferInstructions(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |

### Return type

**ResultModelOfOfferInstructionsModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


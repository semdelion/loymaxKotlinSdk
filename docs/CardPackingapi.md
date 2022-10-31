# CardPackingapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardPackingPackCard**](CardPackingapi.md#cardPackingPackCard) | **POST** v1.2/Cards/{cardId}/Pack | Расфасовать карту.



Расфасовать карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardPackingapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Идентификатор карты для фасовки.
val packingModel : CardPackingModel =  // CardPackingModel | Дополнительная информация для фасовки.

val result : ResultModel = webService.cardPackingPackCard(cardId, packingModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Идентификатор карты для фасовки. |
 **packingModel** | **CardPackingModel**| Дополнительная информация для фасовки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# OfferMerchantapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerMerchantGetOfferMerchantFilter**](OfferMerchantapi.md#offerMerchantGetOfferMerchantFilter) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/merchants | Получает список магазинов, для которых работает акция.



Получает список магазинов, для которых работает акция.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferMerchantapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Включая удаленные.

val result : ResultModelOfMerchantsSubFilterViewModel = webService.offerMerchantGetOfferMerchantFilter(offerId, offerVersion, includeDeleted)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |
 **includeDeleted** | **kotlin.Boolean**| Включая удаленные. | [optional]

### Return type

**ResultModelOfMerchantsSubFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


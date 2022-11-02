# OfferActionsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerActionsGetList**](OfferActionsapi.md#offerActionsGetList) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/actions | Получает список не удаленных действий в цепочке.
[**offerActionsGetOfferAction**](OfferActionsapi.md#offerActionsGetOfferAction) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/actions/{actionId} | Получает модель действия.



Получает список не удаленных действий в цепочке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerChainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfListOfOfferActionViewModelBase = webService.offerActionsGetList(offerId, offerChainId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerChainId** | **kotlin.Int**| Идентификатор цепочки. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfListOfOfferActionViewModelBase**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает модель действия.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerChainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки.
val actionId : kotlin.Int = 56 // kotlin.Int | Идентификатор действия.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfOfferActionViewModelBase = webService.offerActionsGetOfferAction(offerId, offerChainId, actionId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerChainId** | **kotlin.Int**| Идентификатор цепочки. |
 **actionId** | **kotlin.Int**| Идентификатор действия. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfOfferActionViewModelBase**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


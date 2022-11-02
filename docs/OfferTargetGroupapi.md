# OfferTargetGroupapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerTargetGroupGetOfferTargetGroups**](OfferTargetGroupapi.md#offerTargetGroupGetOfferTargetGroups) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/targetGroups | Получает список целевых аудиторий для акции.



Получает список целевых аудиторий для акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferTargetGroupapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfListOfTargetGroupBriefViewModel = webService.offerTargetGroupGetOfferTargetGroups(offerId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfListOfTargetGroupBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# PartnerUserAttributeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerUserAttributeGetUserAttributes**](PartnerUserAttributeapi.md#partnerUserAttributeGetUserAttributes) | **GET** v1.2/partners/{partnerId}/userAttributes | Возвращает набор партнерских атрибутов.



Возвращает набор партнерских атрибутов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerUserAttributeapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.

val result : ResultModelOfListOfUserAttributeViewModel = webService.partnerUserAttributeGetUserAttributes(partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |

### Return type

**ResultModelOfListOfUserAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


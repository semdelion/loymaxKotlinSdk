# Purchasesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchasesSumByPartner**](Purchasesapi.md#purchasesSumByPartner) | **GET** v1.2/User/Purchases/SumByPartner | Сумма покупок по партнеру.



Сумма покупок по партнеру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchasesapi::class.java)
val partnerId : kotlin.String = partnerId_example // kotlin.String | Идентификатор партнера.

val result : ResultModelOfMoneyViewModel = webService.purchasesSumByPartner(partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.String**| Идентификатор партнера. |

### Return type

**ResultModelOfMoneyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# OperationPayapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operationPayGetByPurchase**](OperationPayapi.md#operationPayGetByPurchase) | **GET** v1.2/operationPay | Информация какими способами оплачена покупка.



Информация какими способами оплачена покупка.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OperationPayapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Id покупки.

val result : ResultModelOfListOfOperationPayViewModel = webService.operationPayGetByPurchase(purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Id покупки. |

### Return type

**ResultModelOfListOfOperationPayViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


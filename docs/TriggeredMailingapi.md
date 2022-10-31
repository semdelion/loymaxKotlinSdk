# TriggeredMailingapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**triggeredMailingGetMailings**](TriggeredMailingapi.md#triggeredMailingGetMailings) | **GET** v1.2/triggeredMailings | Получить список рассылок.



Получить список рассылок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TriggeredMailingapi::class.java)

val result : ResultModelOfListOfTriggeredMailingViewModel = webService.triggeredMailingGetMailings()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfTriggeredMailingViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


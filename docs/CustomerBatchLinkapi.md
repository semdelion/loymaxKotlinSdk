# CustomerBatchLinkapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerBatchLinkGetBatches**](CustomerBatchLinkapi.md#customerBatchLinkGetBatches) | **GET** v1.2/customers/batchMerge | Получить список объединений счетов клиентов.
[**customerBatchLinkGetOperations**](CustomerBatchLinkapi.md#customerBatchLinkGetOperations) | **GET** v1.2/customers/batchMerge/{id}/FailedOperations | Получить список операций объединений счетов клиентов, завершившихся ошибкой.



Получить список объединений счетов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerBatchLinkapi::class.java)
val state : BatchState =  // BatchState | Состояние.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfBatchUploadModel = webService.customerBatchLinkGetBatches(state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **BatchState**| Состояние. | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список операций объединений счетов клиентов, завершившихся ошибкой.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerBatchLinkapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id пакета.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfBatchUploadDataModel = webService.customerBatchLinkGetOperations(id, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id пакета. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


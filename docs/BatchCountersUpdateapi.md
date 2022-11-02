# BatchCountersUpdateapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCountersUpdateGet**](BatchCountersUpdateapi.md#batchCountersUpdateGet) | **GET** v1.2/countersUpdate | Возвращает список операций пакетной загрузки значений счетчиков.
[**batchCountersUpdateGetBatch**](BatchCountersUpdateapi.md#batchCountersUpdateGetBatch) | **GET** v1.2/countersUpdate/{id} | Возвращает информацию о пакете загрузки.
[**batchCountersUpdateGetOperations**](BatchCountersUpdateapi.md#batchCountersUpdateGetOperations) | **GET** v1.2/countersUpdate/{id}/operations | Операции.



Возвращает список операций пакетной загрузки значений счетчиков.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCountersUpdateapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val batchUploadFilterModelState : BatchState =  // BatchState | 
val batchUploadFilterModelIncludeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val batchUploadFilterModelFromDate : kotlin.String = batchUploadFilterModelFromDate_example // kotlin.String | 
val batchUploadFilterModelToDate : kotlin.String = batchUploadFilterModelToDate_example // kotlin.String | 
val batchUploadFilterModelAuthorId : kotlin.Int = 56 // kotlin.Int | 

val result : ResultModelOfPagedViewModelOfBatchUploadModel = webService.batchCountersUpdateGet(from, count, batchUploadFilterModelState, batchUploadFilterModelIncludeDeleted, batchUploadFilterModelFromDate, batchUploadFilterModelToDate, batchUploadFilterModelAuthorId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **batchUploadFilterModelState** | **BatchState**|  | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **batchUploadFilterModelIncludeDeleted** | **kotlin.Boolean**|  | [optional]
 **batchUploadFilterModelFromDate** | **kotlin.String**|  | [optional]
 **batchUploadFilterModelToDate** | **kotlin.String**|  | [optional]
 **batchUploadFilterModelAuthorId** | **kotlin.Int**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о пакете загрузки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCountersUpdateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Ид. пакета загрузки.

val result : BatchUploadModel = webService.batchCountersUpdateGetBatch(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Ид. пакета загрузки. |

### Return type

**BatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Операции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCountersUpdateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Пакет.
val state : DeferredOperationState =  // DeferredOperationState | The {Loymax.Domain.Contract.DeferredOperationState}.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfBatchUploadDataModel = webService.batchCountersUpdateGetOperations(id, state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Пакет. |
 **state** | **DeferredOperationState**| The {Loymax.Domain.Contract.DeferredOperationState}. | [optional] [enum: Created, Completed, Error]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


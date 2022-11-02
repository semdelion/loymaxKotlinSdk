# BatchCustomersMergeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCustomersMergeGetBatch**](BatchCustomersMergeapi.md#batchCustomersMergeGetBatch) | **GET** v1.2/customersMerge/{batchId} | Возвращает информацию о пакетном объединении по внутреннему идентификатору.
[**batchCustomersMergeGetCustomersMergeBatches**](BatchCustomersMergeapi.md#batchCustomersMergeGetCustomersMergeBatches) | **GET** v1.2/customersMerge | Возвращает информацию о пакетном объединении.
[**batchCustomersMergeGetOperations**](BatchCustomersMergeapi.md#batchCustomersMergeGetOperations) | **GET** v1.2/customersMerge/{id}/operations | Возвращает список операций по внутреннему идентификатору пакетного объединения.



Возвращает информацию о пакетном объединении по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCustomersMergeapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного объединения.

val result : ResultModelOfBatchUploadModel = webService.batchCustomersMergeGetBatch(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного объединения. |

### Return type

**ResultModelOfBatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о пакетном объединении.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCustomersMergeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val batchUploadFilterModelState : BatchState =  // BatchState | 
val batchUploadFilterModelIncludeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val batchUploadFilterModelFromDate : kotlin.String = batchUploadFilterModelFromDate_example // kotlin.String | 
val batchUploadFilterModelToDate : kotlin.String = batchUploadFilterModelToDate_example // kotlin.String | 
val batchUploadFilterModelAuthorId : kotlin.Int = 56 // kotlin.Int | 

val result : ResultModelOfPagedViewModelOfBatchUploadModel = webService.batchCustomersMergeGetCustomersMergeBatches(from, count, batchUploadFilterModelState, batchUploadFilterModelIncludeDeleted, batchUploadFilterModelFromDate, batchUploadFilterModelToDate, batchUploadFilterModelAuthorId)
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


Возвращает список операций по внутреннему идентификатору пакетного объединения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchCustomersMergeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного объединения.
val state : DeferredOperationState =  // DeferredOperationState | Состояние операции (Created — создана, Completed — выполнена, Error — ошибка при выполнении) {Loymax.Domain.Contract.DeferredOperationState}.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfBatchUploadDataModel = webService.batchCustomersMergeGetOperations(id, state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор пакетного объединения. |
 **state** | **DeferredOperationState**| Состояние операции (Created — создана, Completed — выполнена, Error — ошибка при выполнении) {Loymax.Domain.Contract.DeferredOperationState}. | [optional] [enum: Created, Completed, Error]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


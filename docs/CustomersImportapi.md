# CustomersImportapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customersImportExportOperationsCsv**](CustomersImportapi.md#customersImportExportOperationsCsv) | **GET** v1.2/customersImport/{batchId}/export | Получить список операций по состоянию для группы операций в виде csv-файла.
[**customersImportGetAvailableCreators**](CustomersImportapi.md#customersImportGetAvailableCreators) | **GET** v1.2/customersImport/creators | Получить авторов для фильтра.
[**customersImportGetBatch**](CustomersImportapi.md#customersImportGetBatch) | **GET** v1.2/customersImport/{batchId} | Получить пакет по его id.
[**customersImportGetBatchOperationsQueueProgress**](CustomersImportapi.md#customersImportGetBatchOperationsQueueProgress) | **GET** v1.2/customersImport/{batchId}/progress | Получить информацию о фоновой обработке операций для группы операций.
[**customersImportGetHistory**](CustomersImportapi.md#customersImportGetHistory) | **GET** v1.2/customersImport | Получить историю.
[**customersImportGetOperations**](CustomersImportapi.md#customersImportGetOperations) | **GET** v1.2/customersImport/{batchId}/operations | Получить список операций по состоянию для группы операций.



Получить список операций по состоянию для группы операций в виде csv-файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Id группы операций.
val deferredOperationState : DeferredOperationState =  // DeferredOperationState | Состояние по которому будут отфильтрованы операции.

val result : kotlin.String = webService.customersImportExportOperationsCsv(batchId, deferredOperationState)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Id группы операций. |
 **deferredOperationState** | **DeferredOperationState**| Состояние по которому будут отфильтрованы операции. | [optional] [enum: Created, Completed, Error]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить авторов для фильтра.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Имя.

val result : ResultModelOfPagedViewModelOfCreatorModel = webService.customersImportGetAvailableCreators(from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Имя. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCreatorModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить пакет по его id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | ID пакетной операции.

val result : ResultModelOfBatchCustomersImportModel = webService.customersImportGetBatch(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| ID пакетной операции. |

### Return type

**ResultModelOfBatchCustomersImportModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о фоновой обработке операций для группы операций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Id группы операций.

val result : ResultModelOfCustomersImportProgressInfoModel = webService.customersImportGetBatchOperationsQueueProgress(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Id группы операций. |

### Return type

**ResultModelOfCustomersImportProgressInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить историю.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начало периода.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конец периода.
val filterState : BatchState =  // BatchState | Состояние операции.
val filterImportIdentifierType : IdentifierType =  // IdentifierType | Тип идентификатора по которому импортируются клиенты.
val filterCreatorGetAll : kotlin.Boolean = true // kotlin.Boolean | Получить записи по всем авторам.
val filterCreatorCreatorId : kotlin.Int = 56 // kotlin.Int | Идентификатор автора.

val result : ResultModelOfPagedViewModelOfBatchCustomersImportModel = webService.customersImportGetHistory(from, count, filterFromDate, filterToDate, filterState, filterImportIdentifierType, filterCreatorGetAll, filterCreatorCreatorId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterFromDate** | **kotlin.String**| Начало периода. | [optional]
 **filterToDate** | **kotlin.String**| Конец периода. | [optional]
 **filterState** | **BatchState**| Состояние операции. | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **filterImportIdentifierType** | **IdentifierType**| Тип идентификатора по которому импортируются клиенты. | [optional] [enum: CardNumber, Login, CardBarCode, CardTrack1, CardTrack2, CardTrack3, UID, Data, Anonymous, Phone, Email, OAuth, OAuthApplication, Coupon, PartnerCoupon, PhoneHash, AppleWalletCard, GpayWalletCard, QrCode, PersonUID, GiftCertificateNumber, GiftCertificateBarcode, GiftCertificateTrack1, GiftCertificateTrack2, GiftCertificateTrack3, GiftCertificateQrCode]
 **filterCreatorGetAll** | **kotlin.Boolean**| Получить записи по всем авторам. | [optional]
 **filterCreatorCreatorId** | **kotlin.Int**| Идентификатор автора. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchCustomersImportModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список операций по состоянию для группы операций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomersImportapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Id группы операций.
val deferredOperationState : DeferredOperationState =  // DeferredOperationState | Состояние по которому будут отфильтрованы операции.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfOperationCustomersImportModel = webService.customersImportGetOperations(batchId, deferredOperationState, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Id группы операций. |
 **deferredOperationState** | **DeferredOperationState**| Состояние по которому будут отфильтрованы операции. | [enum: Created, Completed, Error]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOperationCustomersImportModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


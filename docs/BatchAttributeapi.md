# BatchAttributeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchAttributeGetAvailableCreators**](BatchAttributeapi.md#batchAttributeGetAvailableCreators) | **GET** v1.2/batchAttribute/creators | Возвращает список пользователей АРМ, которые проводили пакетные обновления атрибутов клиентов.
[**batchAttributeGetBatch**](BatchAttributeapi.md#batchAttributeGetBatch) | **GET** v1.2/batchAttribute/{batchId} | Возвращает информацию о пакетном обновлении атрубитов клиентов (по внутреннему идентификатору пакетного обновления).
[**batchAttributeGetBatchOperationsQueueProgress**](BatchAttributeapi.md#batchAttributeGetBatchOperationsQueueProgress) | **GET** v1.2/batchAttribute/{batchId}/progress | Возвращает информацию о состоянии операций пакетного обновления атрибутов клиентов.
[**batchAttributeGetErrorOperationsCsv**](BatchAttributeapi.md#batchAttributeGetErrorOperationsCsv) | **GET** v1.2/batchAttribute/{batchId}/export | Возвращает в виде в CSV-файла подробную информацию о пакетном обновлении атрубитов клиентов.
[**batchAttributeGetHistory**](BatchAttributeapi.md#batchAttributeGetHistory) | **GET** v1.2/batchAttribute | Возвращает историю пакетных обновлений атрибутов клиентов.
[**batchAttributeGetOperations**](BatchAttributeapi.md#batchAttributeGetOperations) | **GET** v1.2/batchAttribute/{batchId}/operations | Возвращает подробную информацию о пакетном обновлении атрубитов клиентов.
[**batchAttributeUpdateAttributesFromCsv**](BatchAttributeapi.md#batchAttributeUpdateAttributesFromCsv) | **PUT** v1.2/batchAttribute/updateCsv | Запускает пакетное обновление значений атрибутов клиента, полученных из CSV-файла.



Возвращает список пользователей АРМ, которые проводили пакетные обновления атрибутов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val name : kotlin.String = name_example // kotlin.String | Имя и фамилия пользователя АРМ.

val result : ResultModelOfPagedViewModelOfCreatorModel = webService.batchAttributeGetAvailableCreators(from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **name** | **kotlin.String**| Имя и фамилия пользователя АРМ. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCreatorModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о пакетном обновлении атрубитов клиентов (по внутреннему идентификатору пакетного обновления).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного обновления атрибутов клиентов.

val result : ResultModelOfBatchAttributeUpdateModel = webService.batchAttributeGetBatch(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного обновления атрибутов клиентов. |

### Return type

**ResultModelOfBatchAttributeUpdateModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о состоянии операций пакетного обновления атрибутов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного обновления атрибутов клиентов.

val result : ResultModelOfBatchOperationsQueueInfo = webService.batchAttributeGetBatchOperationsQueueProgress(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного обновления атрибутов клиентов. |

### Return type

**ResultModelOfBatchOperationsQueueInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает в виде в CSV-файла подробную информацию о пакетном обновлении атрубитов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного обновления атрибутов клиентов.
val deferredOperationState : DeferredOperationState =  // DeferredOperationState | Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения).

val result : kotlin.String = webService.batchAttributeGetErrorOperationsCsv(batchId, deferredOperationState)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного обновления атрибутов клиентов. |
 **deferredOperationState** | **DeferredOperationState**| Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения). | [enum: Created, Completed, Error]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает историю пакетных обновлений атрибутов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата, с которой необходимо вывести историю.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата, до которой необходимо вывести историю.
val filterCreatorGetAll : kotlin.Boolean = true // kotlin.Boolean | Получить записи по всем авторам.
val filterCreatorCreatorId : kotlin.Int = 56 // kotlin.Int | Идентификатор автора.
val filterState : BatchState =  // BatchState | Состояние обработки операций.

val result : ResultModelOfPagedViewModelOfBatchAttributeUpdateModel = webService.batchAttributeGetHistory(from, count, filterFromDate, filterToDate, filterCreatorGetAll, filterCreatorCreatorId, filterState)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterFromDate** | **kotlin.String**| Дата, с которой необходимо вывести историю. | [optional]
 **filterToDate** | **kotlin.String**| Дата, до которой необходимо вывести историю. | [optional]
 **filterCreatorGetAll** | **kotlin.Boolean**| Получить записи по всем авторам. | [optional]
 **filterCreatorCreatorId** | **kotlin.Int**| Идентификатор автора. | [optional]
 **filterState** | **BatchState**| Состояние обработки операций. | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]

### Return type

**ResultModelOfPagedViewModelOfBatchAttributeUpdateModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает подробную информацию о пакетном обновлении атрубитов клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного обновления атрибутов клиентов.
val deferredOperationState : DeferredOperationState =  // DeferredOperationState | Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения).
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfOperationBatchAttributeUpdateModel = webService.batchAttributeGetOperations(batchId, deferredOperationState, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного обновления атрибутов клиентов. |
 **deferredOperationState** | **DeferredOperationState**| Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения). | [enum: Created, Completed, Error]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOperationBatchAttributeUpdateModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает пакетное обновление значений атрибутов клиента, полученных из CSV-файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchAttributeapi::class.java)
val description : kotlin.String = description_example // kotlin.String | Описание файла.
val supportEmptyString : kotlin.Boolean = true // kotlin.Boolean | Необходимость установки вместо пустых значений атрибута значение \"null\" (true — да, false — нет).
val file : java.io.File =  // java.io.File | file to upload
val preLoadValidationEnable : kotlin.Boolean = true // kotlin.Boolean | Необходимость валидации данных перед обновлением атрибутов (true — да, false — нет).

val result : ResultModelOfInt32 = webService.batchAttributeUpdateAttributesFromCsv(description, supportEmptyString, file, preLoadValidationEnable)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **kotlin.String**| Описание файла. |
 **supportEmptyString** | **kotlin.Boolean**| Необходимость установки вместо пустых значений атрибута значение \&quot;null\&quot; (true — да, false — нет). |
 **file** | **java.io.File**| file to upload |
 **preLoadValidationEnable** | **kotlin.Boolean**| Необходимость валидации данных перед обновлением атрибутов (true — да, false — нет). | [optional]

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# DeviceTypeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceTypeGet**](DeviceTypeapi.md#deviceTypeGet) | **GET** v1.2/DeviceTypes/{id} | Возвращает информацию о типе кассы.
[**deviceTypeGetAll**](DeviceTypeapi.md#deviceTypeGetAll) | **GET** v1.2/DeviceTypes | Возвращает список всех типов касс.
[**deviceTypeRestoreDeviceType**](DeviceTypeapi.md#deviceTypeRestoreDeviceType) | **POST** v1.2/DeviceTypes/{id}/restore | Восстанавливает из архива тип кассы.



Возвращает информацию о типе кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор типа кассы.

val result : ResultModelOfDeviceTypeViewModel = webService.deviceTypeGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор типа кассы. |

### Return type

**ResultModelOfDeviceTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех типов касс.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceTypeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Текст поиска.
val filterVersion : XmlVersion =  // XmlVersion | Версия поиска.
val filterCondition : ArchivedState =  // ArchivedState | Состояние.
val filterEncodingType : DeviceTypeValidEncodingType =  // DeviceTypeValidEncodingType | Тип кодировки.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы типов касс, выводимых в начале списка.

val result : ResultModelOfPagedViewModelOfDeviceTypeViewModel = webService.deviceTypeGetAll(from, count, filterSearchedText, filterVersion, filterCondition, filterEncodingType, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterSearchedText** | **kotlin.String**| Текст поиска. | [optional]
 **filterVersion** | **XmlVersion**| Версия поиска. | [optional] [enum: Version20, Version22, Version30, Version32]
 **filterCondition** | **ArchivedState**| Состояние. | [optional] [enum: Archived, NonArchived]
 **filterEncodingType** | **DeviceTypeValidEncodingType**| Тип кодировки. | [optional] [enum: ASCII, Cp866, Koi8r, Windows1251, Unicode, UTF7, UTF8, UTF32]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы типов касс, выводимых в начале списка. | [optional]

### Return type

**ResultModelOfPagedViewModelOfDeviceTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает из архива тип кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор типа кассы.

val result : ResultModel = webService.deviceTypeRestoreDeviceType(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор типа кассы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


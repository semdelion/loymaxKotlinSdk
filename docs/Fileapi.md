# Fileapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileGet**](Fileapi.md#fileGet) | **GET** v1.2/files/{id} | Возвращает информацию о параметрах файла по его внутреннему идентификатору.
[**fileGetFileByGuid**](Fileapi.md#fileGetFileByGuid) | **GET** v1.2/files/guid/{guid} | Возвращает информацию о параметрах файла по его внешнему идентификатору.
[**fileGets**](Fileapi.md#fileGets) | **GET** v1.2/files | Возвращает список файлов с информацией об их параметрах.
[**fileMaxSize**](Fileapi.md#fileMaxSize) | **GET** v1.2/files/maxSizeFile | Возвращает максимальный размер загружаемого файла.



Возвращает информацию о параметрах файла по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Fileapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор файла.

val result : ResultModelOfFileEdit = webService.fileGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор файла. |

### Return type

**ResultModelOfFileEdit**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о параметрах файла по его внешнему идентификатору.

Используется только в витрине.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Fileapi::class.java)
val guid : kotlin.String = guid_example // kotlin.String | Внешний идентификатор файла.

val result : ResultModelOfFileEdit = webService.fileGetFileByGuid(guid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **kotlin.String**| Внешний идентификатор файла. |

### Return type

**ResultModelOfFileEdit**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список файлов с информацией об их параметрах.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Fileapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterFileName : kotlin.String = filterFileName_example // kotlin.String | Название файла.
val filterFileGuid : kotlin.String = filterFileGuid_example // kotlin.String | Внешний идентификатор файла.

val result : ResultModelOfPagedViewModelOfFileEdit = webService.fileGets(filterFrom, filterCount, filterFileName, filterFileGuid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterFileName** | **kotlin.String**| Название файла. | [optional]
 **filterFileGuid** | **kotlin.String**| Внешний идентификатор файла. | [optional]

### Return type

**ResultModelOfPagedViewModelOfFileEdit**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает максимальный размер загружаемого файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Fileapi::class.java)

val result : ResultModelOfInt32 = webService.fileMaxSize()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


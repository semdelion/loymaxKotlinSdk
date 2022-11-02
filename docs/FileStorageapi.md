# FileStorageapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fileStorageGet**](FileStorageapi.md#fileStorageGet) | **GET** v1.2/Files/{uid} | Возвращает файл из хранилища файлов.



Возвращает файл из хранилища файлов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FileStorageapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор файла.
val taskId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рассылки, в котором используется файл.
val isDownload : kotlin.Boolean = true // kotlin.Boolean | Необходимость создания ссылки для скачивания файла (true — да, false — нет).

val result : kotlin.Any = webService.fileStorageGet(uid, taskId, isDownload)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор файла. |
 **taskId** | **kotlin.Int**| Внутренний идентификатор рассылки, в котором используется файл. | [optional]
 **isDownload** | **kotlin.Boolean**| Необходимость создания ссылки для скачивания файла (true — да, false — нет). | [optional]

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Extensionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extensionGet**](Extensionapi.md#extensionGet) | **GET** v1.2/extensions | Возвращает список всех плагинов.
[**extensionGetExtension**](Extensionapi.md#extensionGetExtension) | **GET** v1.2/extensions/{id} | Получить плагин по ID.



Возвращает список всех плагинов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Extensionapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterNameSearchedText : kotlin.String = filterNameSearchedText_example // kotlin.String | Текст поиска в имени.
val filterClassNameSearchedText : kotlin.String = filterClassNameSearchedText_example // kotlin.String | Текст поиска в имени класса.
val filterIsDisabled : kotlin.Boolean = true // kotlin.Boolean | Состояние.

val result : ResultModelOfPagedViewModelOfExtensionViewModel = webService.extensionGet(from, count, filterNameSearchedText, filterClassNameSearchedText, filterIsDisabled)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterNameSearchedText** | **kotlin.String**| Текст поиска в имени. | [optional]
 **filterClassNameSearchedText** | **kotlin.String**| Текст поиска в имени класса. | [optional]
 **filterIsDisabled** | **kotlin.Boolean**| Состояние. | [optional]

### Return type

**ResultModelOfPagedViewModelOfExtensionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить плагин по ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Extensionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор плагина.

val result : ResultModelOfExtensionViewModel = webService.extensionGetExtension(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор плагина. |

### Return type

**ResultModelOfExtensionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


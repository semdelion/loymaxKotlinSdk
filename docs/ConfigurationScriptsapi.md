# ConfigurationScriptsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configurationScriptsGetDbNames**](ConfigurationScriptsapi.md#configurationScriptsGetDbNames) | **GET** v1.2/configurationScripts/availableDatabases | Возвращает доступные БД.
[**configurationScriptsGetScripts**](ConfigurationScriptsapi.md#configurationScriptsGetScripts) | **GET** v1.2/configurationScripts | Возвращает список всех скриптов.



Возвращает доступные БД.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationScriptsapi::class.java)

val result : kotlin.collections.MutableList<kotlin.String> = webService.configurationScriptsGetDbNames()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.MutableList&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех скриптов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationScriptsapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата С.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата По.
val filterIdSubstring : kotlin.String = filterIdSubstring_example // kotlin.String | Подстрока для поиска по идентификатору.
val filterConfigDeployId : kotlin.String = filterConfigDeployId_example // kotlin.String | Идентификатор деплоя.
val filterName : kotlin.String = filterName_example // kotlin.String | Наименование БД.

val result : ResultModelOfPagedViewModelOfConfigurationScriptViewModel = webService.configurationScriptsGetScripts(from, count, filterFromDate, filterToDate, filterIdSubstring, filterConfigDeployId, filterName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterFromDate** | **kotlin.String**| Дата С. | [optional]
 **filterToDate** | **kotlin.String**| Дата По. | [optional]
 **filterIdSubstring** | **kotlin.String**| Подстрока для поиска по идентификатору. | [optional]
 **filterConfigDeployId** | **kotlin.String**| Идентификатор деплоя. | [optional]
 **filterName** | **kotlin.String**| Наименование БД. | [optional]

### Return type

**ResultModelOfPagedViewModelOfConfigurationScriptViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# ConfigurationPluginsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configurationPluginsGetPlugins**](ConfigurationPluginsapi.md#configurationPluginsGetPlugins) | **GET** v1.2/configurationPlugins | Возвращает список всех плагинов.



Возвращает список всех плагинов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationPluginsapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterPluginSubstring : kotlin.String = filterPluginSubstring_example // kotlin.String | Подстрока для поиска по названию плагина.
val filterDeployIdSubstring : kotlin.String = filterDeployIdSubstring_example // kotlin.String | Подстрока для поиска по ID деплоя.

val result : ResultModelOfPagedViewModelOfConfigurationPluginViewModel = webService.configurationPluginsGetPlugins(from, count, filterPluginSubstring, filterDeployIdSubstring)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterPluginSubstring** | **kotlin.String**| Подстрока для поиска по названию плагина. | [optional]
 **filterDeployIdSubstring** | **kotlin.String**| Подстрока для поиска по ID деплоя. | [optional]

### Return type

**ResultModelOfPagedViewModelOfConfigurationPluginViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


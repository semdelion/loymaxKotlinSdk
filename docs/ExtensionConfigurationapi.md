# ExtensionConfigurationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extensionConfigurationGetByExtensionId**](ExtensionConfigurationapi.md#extensionConfigurationGetByExtensionId) | **GET** v1.2/extensions/{extensionId}/configurations | Получить конфигурацию плагина по его ID.
[**extensionConfigurationGetByExtensionIdAndKey**](ExtensionConfigurationapi.md#extensionConfigurationGetByExtensionIdAndKey) | **GET** v1.2/extensions/{extensionId}/configurations/{id} | Получить конфигурацию плагина по ID.



Получить конфигурацию плагина по его ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ExtensionConfigurationapi::class.java)
val extensionId : kotlin.Int = 56 // kotlin.Int | Id плагина.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedKey : kotlin.String = filterSearchedKey_example // kotlin.String | Ключ.
val filterSearchedValue : kotlin.String = filterSearchedValue_example // kotlin.String | Значение.

val result : ResultModelOfPagedViewModelOfExtensionConfigurationViewModel = webService.extensionConfigurationGetByExtensionId(extensionId, from, count, filterSearchedKey, filterSearchedValue)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **kotlin.Int**| Id плагина. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterSearchedKey** | **kotlin.String**| Ключ. | [optional]
 **filterSearchedValue** | **kotlin.String**| Значение. | [optional]

### Return type

**ResultModelOfPagedViewModelOfExtensionConfigurationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить конфигурацию плагина по ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ExtensionConfigurationapi::class.java)
val extensionId : kotlin.Int = 56 // kotlin.Int | Id плагина.
val id : kotlin.Int = 56 // kotlin.Int | Id.

val result : ResultModelOfExtensionConfigurationViewModel = webService.extensionConfigurationGetByExtensionIdAndKey(extensionId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extensionId** | **kotlin.Int**| Id плагина. |
 **id** | **kotlin.Int**| Id. |

### Return type

**ResultModelOfExtensionConfigurationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


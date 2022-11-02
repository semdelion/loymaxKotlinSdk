# ConfigurationDeploysapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configurationDeploysGetDeployInfo**](ConfigurationDeploysapi.md#configurationDeploysGetDeployInfo) | **GET** v1.2/configurationDeploys/{externalId} | Получение описания деплоя.
[**configurationDeploysGetDeploys**](ConfigurationDeploysapi.md#configurationDeploysGetDeploys) | **GET** v1.2/configurationDeploys | Возвращает список всех деплоев.



Получение описания деплоя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationDeploysapi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | Внешний дентификатор деплоя.

val result : ResultModelOfConfigurationDeployViewModel = webService.configurationDeploysGetDeployInfo(externalId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **kotlin.String**| Внешний дентификатор деплоя. |

### Return type

**ResultModelOfConfigurationDeployViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех деплоев.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ConfigurationDeploysapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата С.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата По.
val filterPackageVersionSubstring : kotlin.String = filterPackageVersionSubstring_example // kotlin.String | Подстрока для поиска по версионности.
val filterIsSuccess : kotlin.Boolean = true // kotlin.Boolean | Успешность выполнения.
val filterAuthorSubstring : kotlin.String = filterAuthorSubstring_example // kotlin.String | Подстрока для поиска по автору.
val filterExternalId : kotlin.String = filterExternalId_example // kotlin.String | Внешний идентификатор.

val result : ResultModelOfPagedViewModelOfConfigurationDeployViewModel = webService.configurationDeploysGetDeploys(from, count, filterFromDate, filterToDate, filterPackageVersionSubstring, filterIsSuccess, filterAuthorSubstring, filterExternalId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterFromDate** | **kotlin.String**| Дата С. | [optional]
 **filterToDate** | **kotlin.String**| Дата По. | [optional]
 **filterPackageVersionSubstring** | **kotlin.String**| Подстрока для поиска по версионности. | [optional]
 **filterIsSuccess** | **kotlin.Boolean**| Успешность выполнения. | [optional]
 **filterAuthorSubstring** | **kotlin.String**| Подстрока для поиска по автору. | [optional]
 **filterExternalId** | **kotlin.String**| Внешний идентификатор. | [optional]

### Return type

**ResultModelOfPagedViewModelOfConfigurationDeployViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


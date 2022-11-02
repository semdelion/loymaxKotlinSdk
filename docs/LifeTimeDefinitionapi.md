# LifeTimeDefinitionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lifeTimeDefinitionGetLifeTimeDefinition**](LifeTimeDefinitionapi.md#lifeTimeDefinitionGetLifeTimeDefinition) | **GET** v1.2/lifeTimeDefinitions/{id} | Возвращает информацию о времени жизни бонусов по его внутреннему идентификатору.
[**lifeTimeDefinitionGetLifeTimeDefinitionByUid**](LifeTimeDefinitionapi.md#lifeTimeDefinitionGetLifeTimeDefinitionByUid) | **GET** v1.2/lifeTimeDefinitions/{uid} | Возвращает информацию о времени жизни бонусов по его внешнему идентификатору.
[**lifeTimeDefinitionGetLifeTimeDefinitions**](LifeTimeDefinitionapi.md#lifeTimeDefinitionGetLifeTimeDefinitions) | **GET** v1.2/lifeTimeDefinitions | 
[**lifeTimeDefinitionRestoreLifeTimeDefinition**](LifeTimeDefinitionapi.md#lifeTimeDefinitionRestoreLifeTimeDefinition) | **POST** v1.2/lifeTimeDefinitions/{id}/restore | Востанавливает из архива время жизни бонуса.



Возвращает информацию о времени жизни бонусов по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LifeTimeDefinitionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор времени жизни бонусов.

val result : ResultModelOfLifeTimeDefinitionViewModel = webService.lifeTimeDefinitionGetLifeTimeDefinition(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор времени жизни бонусов. |

### Return type

**ResultModelOfLifeTimeDefinitionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о времени жизни бонусов по его внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LifeTimeDefinitionapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор времени жизни бонусов.

val result : ResultModelOfLifeTimeDefinitionViewModel = webService.lifeTimeDefinitionGetLifeTimeDefinitionByUid(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор времени жизни бонусов. |

### Return type

**ResultModelOfLifeTimeDefinitionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LifeTimeDefinitionapi::class.java)
val name : kotlin.String = name_example // kotlin.String | 
val status : ArchivedState =  // ArchivedState | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val logicalName : kotlin.String = logicalName_example // kotlin.String | 
val partnerId : kotlin.Int = 56 // kotlin.Int | 
val lifeTimeDefinitionIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel = webService.lifeTimeDefinitionGetLifeTimeDefinitions(name, status, from, count, logicalName, partnerId, lifeTimeDefinitionIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [optional]
 **status** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **logicalName** | **kotlin.String**|  | [optional]
 **partnerId** | **kotlin.Int**|  | [optional]
 **lifeTimeDefinitionIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Востанавливает из архива время жизни бонуса.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LifeTimeDefinitionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор времени жизни бонусов.

val result : ResultModel = webService.lifeTimeDefinitionRestoreLifeTimeDefinition(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор времени жизни бонусов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Limitapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**limitGetLimitPeriods**](Limitapi.md#limitGetLimitPeriods) | **GET** v1.2/LimitRules/Periods | Получить доступные периоды для конкретного правила.
[**limitGetLimitTypes**](Limitapi.md#limitGetLimitTypes) | **GET** v1.2/LimitRules/Types | Получить информацию о типах лимитов.
[**limitGetRule**](Limitapi.md#limitGetRule) | **GET** v1.2/LimitRules/{id} | Получить информацию о правиле лимита.
[**limitGetRules**](Limitapi.md#limitGetRules) | **GET** v1.2/LimitRules | Получить текущие правила на страницах.
[**limitRestoreRule**](Limitapi.md#limitRestoreRule) | **POST** v1.2/LimitRules/{id}/Restore | Восстановление правила.



Получить доступные периоды для конкретного правила.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Limitapi::class.java)
val typeName : kotlin.String = typeName_example // kotlin.String | The type.

val result : ResultModelOfListOfLimitPeriod = webService.limitGetLimitPeriods(typeName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeName** | **kotlin.String**| The type. |

### Return type

**ResultModelOfListOfLimitPeriod**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о типах лимитов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Limitapi::class.java)

val result : ResultModelOfListOfLimitTypeModel = webService.limitGetLimitTypes()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfLimitTypeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о правиле лимита.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Limitapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.

val result : ResultModelOfLimitRuleModel = webService.limitGetRule(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор правила. |

### Return type

**ResultModelOfLimitRuleModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить текущие правила на страницах.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Limitapi::class.java)
val status : ArchivedState =  // ArchivedState | Фильтр для отображения списка.
val from : kotlin.Int = 56 // kotlin.Int | С какого.
val count : kotlin.Int = 56 // kotlin.Int | Сколько.

val result : ResultModelOfPagedViewModelOfLimitRuleModel = webService.limitGetRules(status, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **ArchivedState**| Фильтр для отображения списка. | [optional] [enum: Archived, NonArchived]
 **from** | **kotlin.Int**| С какого. | [optional]
 **count** | **kotlin.Int**| Сколько. | [optional]

### Return type

**ResultModelOfPagedViewModelOfLimitRuleModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление правила.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Limitapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.

val result : ResultModel = webService.limitRestoreRule(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор правила. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


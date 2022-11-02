# LimitActionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**limitActionGetAction**](LimitActionapi.md#limitActionGetAction) | **GET** v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId} | Получить действие для конкретной границы правила.
[**limitActionGetActions**](LimitActionapi.md#limitActionGetActions) | **GET** v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions | Получить список действий.
[**limitActionRestoreAction**](LimitActionapi.md#limitActionRestoreAction) | **POST** v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}/Restore | Восстановление действия.



Получить действие для конкретной границы правила.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitActionapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.
val borderId : kotlin.Int = 56 // kotlin.Int | Идентификатор границы.
val actionId : kotlin.Int = 56 // kotlin.Int | Идентификатор действия.

val result : ResultModelOfLimitActionViewModel = webService.limitActionGetAction(ruleId, borderId, actionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |
 **borderId** | **kotlin.Int**| Идентификатор границы. |
 **actionId** | **kotlin.Int**| Идентификатор действия. |

### Return type

**ResultModelOfLimitActionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список действий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitActionapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.
val borderId : kotlin.Int = 56 // kotlin.Int | Идентификатор границы.

val result : ResultModelOfListOfLimitActionViewModel = webService.limitActionGetActions(ruleId, borderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |
 **borderId** | **kotlin.Int**| Идентификатор границы. |

### Return type

**ResultModelOfListOfLimitActionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление действия.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitActionapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.
val borderId : kotlin.Int = 56 // kotlin.Int | Идентификатор границы.
val actionId : kotlin.Int = 56 // kotlin.Int | Идентификатор действия.

val result : ResultModel = webService.limitActionRestoreAction(ruleId, borderId, actionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |
 **borderId** | **kotlin.Int**| Идентификатор границы. |
 **actionId** | **kotlin.Int**| Идентификатор действия. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# LimitBorderapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**limitBorderGetBorder**](LimitBorderapi.md#limitBorderGetBorder) | **GET** v1.2/LimitRules/{ruleId}/Borders/{borderId} | Получить границу для указанного правила.
[**limitBorderGetBorders**](LimitBorderapi.md#limitBorderGetBorders) | **GET** v1.2/LimitRules/{ruleId}/Borders | Получить список границ для указанного правила.
[**limitBorderRestoreBorder**](LimitBorderapi.md#limitBorderRestoreBorder) | **POST** v1.2/LimitRules/{ruleId}/Borders/{borderId}/Restore | Восстановление границы.



Получить границу для указанного правила.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitBorderapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.
val borderId : kotlin.Int = 56 // kotlin.Int | Идентификатор границы.

val result : ResultModelOfLimitBorderModel = webService.limitBorderGetBorder(ruleId, borderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |
 **borderId** | **kotlin.Int**| Идентификатор границы. |

### Return type

**ResultModelOfLimitBorderModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список границ для указанного правила.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitBorderapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.

val result : ResultModelOfListOfLimitBorderModel = webService.limitBorderGetBorders(ruleId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |

### Return type

**ResultModelOfListOfLimitBorderModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление границы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LimitBorderapi::class.java)
val ruleId : kotlin.Int = 56 // kotlin.Int | Идентификатор правила.
val borderId : kotlin.Int = 56 // kotlin.Int | Идентификатор границы.

val result : ResultModel = webService.limitBorderRestoreBorder(ruleId, borderId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **kotlin.Int**| Идентификатор правила. |
 **borderId** | **kotlin.Int**| Идентификатор границы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


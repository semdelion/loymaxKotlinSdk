# FixedAnswerapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fixedAnswerChangePosition**](FixedAnswerapi.md#fixedAnswerChangePosition) | **POST** v1.2/Questions/FixedAnswers/{id}/ChangePosition | Изменяет порядок отображения варианта ответа на вопрос.
[**fixedAnswerGet**](FixedAnswerapi.md#fixedAnswerGet) | **GET** v1.2/Questions/FixedAnswers/{id} | Возвращает информацию о варианте ответа на вопрос.
[**fixedAnswerGetAllByQuestion**](FixedAnswerapi.md#fixedAnswerGetAllByQuestion) | **GET** v1.2/Questions/FixedAnswers | Возвращает информацию о всех вариантах ответа на вопрос.



Изменяет порядок отображения варианта ответа на вопрос.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FixedAnswerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор варианта ответа.
val order : kotlin.Int = 56 // kotlin.Int | Новый порядковый номер.

val result : ResultModel = webService.fixedAnswerChangePosition(id, order)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор варианта ответа. |
 **order** | **kotlin.Int**| Новый порядковый номер. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о варианте ответа на вопрос.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FixedAnswerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор варианта ответа.

val result : ResultModelOfFixedAnswerViewModel = webService.fixedAnswerGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор варианта ответа. |

### Return type

**ResultModelOfFixedAnswerViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о всех вариантах ответа на вопрос.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FixedAnswerapi::class.java)
val questionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор вопроса.

val result : ResultModelOfListOfFixedAnswerViewModel = webService.fixedAnswerGetAllByQuestion(questionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionId** | **kotlin.Int**| Внутренний идентификатор вопроса. |

### Return type

**ResultModelOfListOfFixedAnswerViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


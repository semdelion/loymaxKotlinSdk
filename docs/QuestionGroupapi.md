# QuestionGroupapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**questionGroupChangePosition**](QuestionGroupapi.md#questionGroupChangePosition) | **POST** v1.2/QuestionGroups/{id}/ChangePosition | Изменяет порядок отображения группы вопросов в списке групп вопросов.
[**questionGroupCreate**](QuestionGroupapi.md#questionGroupCreate) | **PUT** v1.2/QuestionGroups | Создает группу вопросов.
[**questionGroupGet**](QuestionGroupapi.md#questionGroupGet) | **GET** v1.2/QuestionGroups/{id} | Возвращает группу вопросов.
[**questionGroupRestore**](QuestionGroupapi.md#questionGroupRestore) | **POST** v1.2/QuestionGroups/{id}/Restore | Восстановливает из архива группу вопросов.



Изменяет порядок отображения группы вопросов в списке групп вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы вопросов.
val order : kotlin.Int = 56 // kotlin.Int | Новый порядковый номер.

val result : ResultModel = webService.questionGroupChangePosition(id, order)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор группы вопросов. |
 **order** | **kotlin.Int**| Новый порядковый номер. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Создает группу вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionGroupapi::class.java)
val model : QuestionGroupViewModel =  // QuestionGroupViewModel | Модель группы вопросов.

val result : ResultModelOfInt32 = webService.questionGroupCreate(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **QuestionGroupViewModel**| Модель группы вопросов. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает группу вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы вопросов.

val result : ResultModelOfQuestionGroupViewModel = webService.questionGroupGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор группы вопросов. |

### Return type

**ResultModelOfQuestionGroupViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановливает из архива группу вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(QuestionGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы вопросов.

val result : ResultModel = webService.questionGroupRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор группы вопросов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


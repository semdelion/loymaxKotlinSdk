# Questionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**questionChangePosition**](Questionapi.md#questionChangePosition) | **POST** v1.2/Questions/{id}/ChangePosition | Изменяет порядок отображения вопроса в списке вопросов/в группе вопросов.
[**questionGet**](Questionapi.md#questionGet) | **GET** v1.2/Questions/{id} | Возвращает информацию о вопросе.
[**questionGetAll**](Questionapi.md#questionGetAll) | **GET** v1.2/Questions | Возвращает информацию о всех вопросах и всех группах вопросов.
[**questionRestore**](Questionapi.md#questionRestore) | **POST** v1.2/Questions/{id}/Restore | Восстанавливает вопрос из архива.



Изменяет порядок отображения вопроса в списке вопросов/в группе вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Questionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор вопроса.
val order : kotlin.Int = 56 // kotlin.Int | Новый порядковый номер.
val questionGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы вопросов.

val result : ResultModel = webService.questionChangePosition(id, order, questionGroupId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор вопроса. |
 **order** | **kotlin.Int**| Новый порядковый номер. |
 **questionGroupId** | **kotlin.Int**| Внутренний идентификатор группы вопросов. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о вопросе.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Questionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор вопроса.

val result : ResultModelOfQuestionViewModel = webService.questionGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор вопроса. |

### Return type

**ResultModelOfQuestionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о всех вопросах и всех группах вопросов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Questionapi::class.java)
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterLogicalName : kotlin.String = filterLogicalName_example // kotlin.String | 
val filterStateType : ArchivedState =  // ArchivedState | 
val filterVisibleType : VisibilityType =  // VisibilityType | 
val filterRequiredType : QuestionRequiredType =  // QuestionRequiredType | 

val result : ResultModelOfListOfQuestionnaireItemViewModel = webService.questionGetAll(filterName, filterLogicalName, filterStateType, filterVisibleType, filterRequiredType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **kotlin.String**|  | [optional]
 **filterLogicalName** | **kotlin.String**|  | [optional]
 **filterStateType** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **filterVisibleType** | **VisibilityType**|  | [optional] [enum: Visible, Invisible]
 **filterRequiredType** | **QuestionRequiredType**|  | [optional] [enum: Required, NoRequired]

### Return type

**ResultModelOfListOfQuestionnaireItemViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает вопрос из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Questionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор вопроса.

val result : ResultModel = webService.questionRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор вопроса. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


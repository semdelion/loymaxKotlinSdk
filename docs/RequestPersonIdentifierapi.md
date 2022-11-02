# RequestPersonIdentifierapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestPersonIdentifierGet**](RequestPersonIdentifierapi.md#requestPersonIdentifierGet) | **GET** v1.2/RequestPersonIdentifiers/{id} | Возвращает идентификацию пользователя в запросах от кассы по id.
[**requestPersonIdentifierGetList**](RequestPersonIdentifierapi.md#requestPersonIdentifierGetList) | **GET** v1.2/RequestPersonIdentifiers | Получает список всех идентификаций пользователей в запросах от кассы.
[**requestPersonIdentifierRestore**](RequestPersonIdentifierapi.md#requestPersonIdentifierRestore) | **POST** v1.2/RequestPersonIdentifiers/{id}/restore | Восстановление идентификации пользователя в запросах от кассы.



Возвращает идентификацию пользователя в запросах от кассы по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RequestPersonIdentifierapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id запроса.

val result : ResultModelOfRequestPersonIdentifierViewModel = webService.requestPersonIdentifierGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id запроса. |

### Return type

**ResultModelOfRequestPersonIdentifierViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список всех идентификаций пользователей в запросах от кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RequestPersonIdentifierapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.
val modeView : ArchivedState =  // ArchivedState | Перечисление режимов отображения.

val result : ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel = webService.requestPersonIdentifierGetList(from, count, loyaltyProgramId, modeView)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **loyaltyProgramId** | **kotlin.Int**| Идентификатор программы лояльности. | [optional]
 **modeView** | **ArchivedState**| Перечисление режимов отображения. | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление идентификации пользователя в запросах от кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(RequestPersonIdentifierapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id запроса.

val result : ResultModel = webService.requestPersonIdentifierRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id запроса. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


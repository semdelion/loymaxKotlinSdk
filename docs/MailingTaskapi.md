# MailingTaskapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mailingTaskCancel**](MailingTaskapi.md#mailingTaskCancel) | **POST** v1.2/mailings/{mailingId}/tasks/{mailingTaskId}/cancel | Отменяет задачу рассылки.
[**mailingTaskGetMailingsTasks**](MailingTaskapi.md#mailingTaskGetMailingsTasks) | **GET** v1.2/mailings/{mailingId}/tasks | Возвращает список задач для рассылки.



Отменяет задачу рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MailingTaskapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.
val mailingTaskId : kotlin.Int = 56 // kotlin.Int | Идентификатор задачи.

val result : ResultModelOfMailingTaskViewModel = webService.mailingTaskCancel(mailingId, mailingTaskId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |
 **mailingTaskId** | **kotlin.Int**| Идентификатор задачи. |

### Return type

**ResultModelOfMailingTaskViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список задач для рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MailingTaskapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfMailingTaskViewModel = webService.mailingTaskGetMailingsTasks(mailingId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |
 **from** | **kotlin.Int**| From. |
 **count** | **kotlin.Int**| Count. |

### Return type

**ResultModelOfPagedViewModelOfMailingTaskViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


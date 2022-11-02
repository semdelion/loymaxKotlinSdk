# Notificationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationDelete**](Notificationapi.md#notificationDelete) | **DELETE** v1.2/Notification/{notificationId} | Удалить оповещение.
[**notificationGetCount**](Notificationapi.md#notificationGetCount) | **GET** v1.2/Notification/Count | Получить количество оповещений.
[**notificationGetNotifications**](Notificationapi.md#notificationGetNotifications) | **GET** v1.2/Notification | Получение списка оповещений.
[**notificationRead**](Notificationapi.md#notificationRead) | **POST** v1.2/Notification/{notificationId}/Read | Отметить оповещение как прочитанное.
[**notificationReadAll**](Notificationapi.md#notificationReadAll) | **POST** v1.2/Notification/Read | Пометить все оповещения прочитанными.



Удалить оповещение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Notificationapi::class.java)
val notificationId : kotlin.Long = 789 // kotlin.Long | Внутренний идентификатор оповещения (Id).

val result : ResultModel = webService.notificationDelete(notificationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.Long**| Внутренний идентификатор оповещения (Id). |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить количество оповещений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Notificationapi::class.java)

val result : ResultModelOfNotificationsCountViewModel = webService.notificationGetCount()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfNotificationsCountViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получение списка оповещений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Notificationapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер элемента, с которого должна начинаться выборка.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfNotificationViewModel = webService.notificationGetNotifications(from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер элемента, с которого должна начинаться выборка. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfNotificationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отметить оповещение как прочитанное.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Notificationapi::class.java)
val notificationId : kotlin.Long = 789 // kotlin.Long | Внутренний идентификатор оповещения (Id).

val result : ResultModelOfNotificationViewModel = webService.notificationRead(notificationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.Long**| Внутренний идентификатор оповещения (Id). |

### Return type

**ResultModelOfNotificationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Пометить все оповещения прочитанными.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Notificationapi::class.java)

val result : ResultModelOfInt32 = webService.notificationReadAll()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# PushNotificationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pushNotificationGetDetails**](PushNotificationapi.md#pushNotificationGetDetails) | **GET** v1.2/Pushes/{messageId} | Возвращает данные оповещения по идентификатору сообщения.
[**pushNotificationGetDeviceInfo**](PushNotificationapi.md#pushNotificationGetDeviceInfo) | **GET** v1.2/Pushes | Получить  информацию о текущем устройстве.
[**pushNotificationSetState**](PushNotificationapi.md#pushNotificationSetState) | **POST** v1.2/Pushes/{messageId}/state | Установить статус Push сообщения.



Возвращает данные оповещения по идентификатору сообщения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PushNotificationapi::class.java)
val messageId : kotlin.Long = 789 // kotlin.Long | Идентификатор Push сообщения.

val result : ResultModelOfNotificationDetailsViewModel = webService.pushNotificationGetDetails(messageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Long**| Идентификатор Push сообщения. |

### Return type

**ResultModelOfNotificationDetailsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить  информацию о текущем устройстве.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PushNotificationapi::class.java)

val result : ResultModelOfDeviceInfoModel = webService.pushNotificationGetDeviceInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Установить статус Push сообщения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PushNotificationapi::class.java)
val messageId : kotlin.Long = 789 // kotlin.Long | Идентификатор Push-уведомления.
val model : PushNotificationStateModel =  // PushNotificationStateModel | Данные для изменения статуса.

val result : ResultModel = webService.pushNotificationSetState(messageId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Long**| Идентификатор Push-уведомления. |
 **model** | **PushNotificationStateModel**| Данные для изменения статуса. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


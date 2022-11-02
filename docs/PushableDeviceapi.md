# PushableDeviceapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pushableDeviceGetPushDevices**](PushableDeviceapi.md#pushableDeviceGetPushDevices) | **GET** v1.2/users/{personId}/PushableDevices | Список всех push-устройств клиента.



Список всех push-устройств клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PushableDeviceapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val searchOption : PushableDeviceSearchOption =  // PushableDeviceSearchOption | Параметр поиска пуш-устройств.

val result : ResultModelOfPagedViewModelOfPushableDeviceViewModel = webService.pushableDeviceGetPushDevices(personId, from, count, searchOption)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **searchOption** | **PushableDeviceSearchOption**| Параметр поиска пуш-устройств. | [optional] [enum: FromHistory, Active, Inactive]

### Return type

**ResultModelOfPagedViewModelOfPushableDeviceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


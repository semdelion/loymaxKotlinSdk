# DeviceCapabilityapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceCapabilityGetAll**](DeviceCapabilityapi.md#deviceCapabilityGetAll) | **GET** v1.2/DeviceCapabilities/{deviceTypeId} | Возвращает информацию о всех настройках кассы.



Возвращает информацию о всех настройках кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceCapabilityapi::class.java)
val deviceTypeId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор типа кассы.

val result : ResultModelOfListOfDeviceCapabilityViewModel = webService.deviceCapabilityGetAll(deviceTypeId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceTypeId** | **kotlin.Int**| Внутренний идентификатор типа кассы. |

### Return type

**ResultModelOfListOfDeviceCapabilityViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


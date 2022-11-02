# VersionApiapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionApiGetMobileVersion**](VersionApiapi.md#versionApiGetMobileVersion) | **GET** v1.2/Version/Mobile | Возвращает текущие версии мобильного приложения (Android, Ios).
[**versionApiGetVersion**](VersionApiapi.md#versionApiGetVersion) | **GET** v1.2/Version | Возвращает текущую версию API.



Возвращает текущие версии мобильного приложения (Android, Ios).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(VersionApiapi::class.java)

val result : ResultModelOfListOfMobileVersionViewModel = webService.versionApiGetMobileVersion()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfMobileVersionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает текущую версию API.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(VersionApiapi::class.java)

val result : ResultModelOfVersionModel = webService.versionApiGetVersion()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfVersionModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


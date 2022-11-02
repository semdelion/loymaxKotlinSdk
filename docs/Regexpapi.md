# Regexpapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**regexpGet**](Regexpapi.md#regexpGet) | **GET** v1.2/regexp | Получить коллекцию всех конфигураций регулярных выражений.



Получить коллекцию всех конфигураций регулярных выражений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Regexpapi::class.java)

val result : ResultModelOfListOfRegexpConfigurationViewModel = webService.regexpGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfRegexpConfigurationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


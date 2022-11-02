# Configurationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configurationGet**](Configurationapi.md#configurationGet) | **GET** v1.2/configurations | Получить коллекцию всех конфигураций.



Получить коллекцию всех конфигураций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Configurationapi::class.java)

val result : ResultModelOfListOfConfigurationViewModel = webService.configurationGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfConfigurationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


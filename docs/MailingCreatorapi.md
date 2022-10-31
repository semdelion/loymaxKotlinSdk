# MailingCreatorapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mailingCreatorGetCreators**](MailingCreatorapi.md#mailingCreatorGetCreators) | **GET** v1.2/mailingCreators | Получает список создателей рассылок.



Получает список создателей рассылок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MailingCreatorapi::class.java)

val result : ResultModelOfListOfCreatorModel = webService.mailingCreatorGetCreators()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCreatorModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


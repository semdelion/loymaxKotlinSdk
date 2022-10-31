# MailingSubscriptionTypeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mailingSubscriptionTypeGetTypes**](MailingSubscriptionTypeapi.md#mailingSubscriptionTypeGetTypes) | **GET** v1.2/mailingSubscriptionTypes | Позвращает типы рассылки.



Позвращает типы рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MailingSubscriptionTypeapi::class.java)

val result : ResultModelOfListOfMailingSubscriptionTypeViewModel = webService.mailingSubscriptionTypeGetTypes()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfMailingSubscriptionTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


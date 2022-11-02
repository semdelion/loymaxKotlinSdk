# Anketaapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anketaGetQuestions**](Anketaapi.md#anketaGetQuestions) | **GET** v1.2/Anketa/Questions | Возвращает список вопросов анкеты.



Возвращает список вопросов анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Anketaapi::class.java)

val result : ResultModelOfListOfAnketaQuestionViewModel = webService.anketaGetQuestions()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfAnketaQuestionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


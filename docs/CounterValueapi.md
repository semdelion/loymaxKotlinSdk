# CounterValueapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**counterValueGetCounterValues**](CounterValueapi.md#counterValueGetCounterValues) | **GET** v1.2/counters/{counterId}/values | Возвращает список доступных значений счетчика.



Возвращает список доступных значений счетчика.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CounterValueapi::class.java)
val counterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор счетчика.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterPersonId : kotlin.Int = 56 // kotlin.Int | Идентификатор пользователя.
val filterAccountGroupId : kotlin.Int = 56 // kotlin.Int | Идентификатор группы счетов.

val result : ResultModelOfPagedViewModelOfCounterValueBaseViewModel = webService.counterValueGetCounterValues(counterId, filterFrom, filterCount, filterPersonId, filterAccountGroupId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterId** | **kotlin.Int**| Внутренний идентификатор счетчика. |
 **filterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество. | [optional]
 **filterPersonId** | **kotlin.Int**| Идентификатор пользователя. | [optional]
 **filterAccountGroupId** | **kotlin.Int**| Идентификатор группы счетов. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCounterValueBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


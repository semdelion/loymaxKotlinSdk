# Calculatorapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculatorGetAll**](Calculatorapi.md#calculatorGetAll) | **GET** v1.2/Calculators | Получить все калькуляторы.



Получить все калькуляторы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Calculatorapi::class.java)
val types : kotlin.collections.MutableList<RepositoryCalculatorType> =  // kotlin.collections.MutableList<RepositoryCalculatorType> | Тип.

val result : ResultModelOfListOfCalculatorViewModel = webService.calculatorGetAll(types)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | **kotlin.collections.MutableList&lt;RepositoryCalculatorType&gt;**| Тип. | [optional]

### Return type

**ResultModelOfListOfCalculatorViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


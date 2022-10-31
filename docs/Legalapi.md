# Legalapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**legalGetLegals**](Legalapi.md#legalGetLegals) | **GET** v1.2/legals | Возвращает список доступных юридических лиц.



Возвращает список доступных юридических лиц.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Legalapi::class.java)
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по названию юридического лица.
val partnersIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Внутренние идентификаторы Партнеров.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Программы лояльности.

val result : ResultModelOfListOfLegalViewModel = webService.legalGetLegals(name, partnersIds, from, count, loyaltyProgramId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| Подстрока для поиска по названию юридического лица. | [optional]
 **partnersIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Внутренние идентификаторы Партнеров. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор Программы лояльности. | [optional]

### Return type

**ResultModelOfListOfLegalViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


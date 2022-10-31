# CardCategoryapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardCategoryGetCardCategories**](CardCategoryapi.md#cardCategoryGetCardCategories) | **GET** v1.2/cardCategories | Возвращает список всех категорий карт.
[**cardCategoryGetCardCategory**](CardCategoryapi.md#cardCategoryGetCardCategory) | **GET** v1.2/cardCategories/{id} | Возвращает категорию по id.



Возвращает список всех категорий карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardCategoryapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val substring : kotlin.String = substring_example // kotlin.String | Подстрока для поиска.
val forImport : kotlin.Boolean = true // kotlin.Boolean | Фильтр. True категории для импорта. False все.

val result : ResultModelOfPagedViewModelOfCardCategoryModel = webService.cardCategoryGetCardCategories(from, count, substring, forImport)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **substring** | **kotlin.String**| Подстрока для поиска. | [optional]
 **forImport** | **kotlin.Boolean**| Фильтр. True категории для импорта. False все. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCardCategoryModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает категорию по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardCategoryapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id категории.

val result : ResultModelOfCardCategoryModel = webService.cardCategoryGetCardCategory(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id категории. |

### Return type

**ResultModelOfCardCategoryModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


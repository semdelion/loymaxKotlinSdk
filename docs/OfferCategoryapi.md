# OfferCategoryapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerCategoryGetOfferCategories**](OfferCategoryapi.md#offerCategoryGetOfferCategories) | **GET** v1.2/offerCategories | Возвращает список категорий акций.
[**offerCategoryGetOfferCategory**](OfferCategoryapi.md#offerCategoryGetOfferCategory) | **GET** v1.2/offerCategories/{id} | Возвращает категорию акций по ID.



Возвращает список категорий акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferCategoryapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.

val result : ResultModelOfPagedViewModelOfOfferCategoryViewModel = webService.offerCategoryGetOfferCategories(from, count, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **partnerId** | **kotlin.Int**| Id партнера. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferCategoryViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает категорию акций по ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferCategoryapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id категории акций.

val result : ResultModelOfOfferCategoryViewModel = webService.offerCategoryGetOfferCategory(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id категории акций. |

### Return type

**ResultModelOfOfferCategoryViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


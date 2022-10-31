# GoodsCatalogapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsCatalogGetCatalogItemInfo**](GoodsCatalogapi.md#goodsCatalogGetCatalogItemInfo) | **GET** v1.2/goodsCatalog/info/{catalogItemId} | Получить информацию об элементе в каталоге.
[**goodsCatalogGetGoodsCatalog**](GoodsCatalogapi.md#goodsCatalogGetGoodsCatalog) | **GET** v1.2/goodsCatalog | Получить каталог товаров.



Получить информацию об элементе в каталоге.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsCatalogapi::class.java)
val catalogItemId : kotlin.Int = 56 // kotlin.Int | Id элемента.
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.

val result : ResultModelOfGoodsCatalogLeafViewModel = webService.goodsCatalogGetCatalogItemInfo(catalogItemId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogItemId** | **kotlin.Int**| Id элемента. |
 **partnerId** | **kotlin.Int**| Id партнера. | [optional]

### Return type

**ResultModelOfGoodsCatalogLeafViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsCatalogapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.
val catalogId : kotlin.Int = 56 // kotlin.Int | Id каtалога.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsCatalogGetGoodsCatalog(partnerId, catalogId, parentNodeId, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Id партнера. |
 **catalogId** | **kotlin.Int**| Id каtалога. | [optional]
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterSearchedText** | **kotlin.String**| Значение параметра товара. | [optional]
 **filterSearchParameter** | **GoodsCatalogSearchParameter**| Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). | [optional] [enum: Name, ItemId, BarCode]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


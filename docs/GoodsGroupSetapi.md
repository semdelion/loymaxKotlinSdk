# GoodsGroupSetapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsGroupSetGetGoodsGroupGoodsSets**](GoodsGroupSetapi.md#goodsGroupSetGetGoodsGroupGoodsSets) | **GET** v1.2/goodsGroups/{goodsGroupId}/goodsSets | Получить наборы группы товаров.
[**goodsGroupSetUpdateGoodsGroupGoodsSet**](GoodsGroupSetapi.md#goodsGroupSetUpdateGoodsGroupGoodsSet) | **POST** v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId} | Редактировать набор группы товаров.



Получить наборы группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val type : GoodsSetType =  // GoodsSetType | Тип набора.

val result : ResultModelOfPagedViewModelOfGoodsSetViewModel = webService.goodsGroupSetGetGoodsGroupGoodsSets(goodsGroupId, from, count, type)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **type** | **GoodsSetType**| Тип набора. | [optional] [enum: Exclusive, Inclusive]

### Return type

**ResultModelOfPagedViewModelOfGoodsSetViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Редактировать набор группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val model : GoodsSetModel =  // GoodsSetModel | Модель набора товаров.

val result : ResultModel = webService.goodsGroupSetUpdateGoodsGroupGoodsSet(goodsGroupId, goodsSetId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **model** | **GoodsSetModel**| Модель набора товаров. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


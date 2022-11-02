# GoodsGroupSetAttributeFilterapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsGroupSetAttributeFilterGetAvailableAttributes**](GoodsGroupSetAttributeFilterapi.md#goodsGroupSetAttributeFilterGetAvailableAttributes) | **GET** v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/availableAttributes | Доступные для выбора атрибуты.
[**goodsGroupSetAttributeFilterGetGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId**](GoodsGroupSetAttributeFilterapi.md#goodsGroupSetAttributeFilterGetGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId) | **GET** v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId} | Получает фильтр по атрибутам по его ID.
[**goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems**](GoodsGroupSetAttributeFilterapi.md#goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems | Получить фильтры по атрибутам набора группы товаров.
[**goodsGroupSetAttributeFilterGetItemAvailableAttributes**](GoodsGroupSetAttributeFilterapi.md#goodsGroupSetAttributeFilterGetItemAvailableAttributes) | **GET** v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}/availableAttributes | Получает атрибуты, доступные для выбора в атрибутном фильтре.



Доступные для выбора атрибуты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetAttributeFilterapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора группы товаров.
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.

val result : ResultModelOfListOfCatalogAttributeViewModel = webService.goodsGroupSetAttributeFilterGetAvailableAttributes(goodsGroupId, goodsSetId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора группы товаров. |
 **partnerId** | **kotlin.Int**| Id партнера. |

### Return type

**ResultModelOfListOfCatalogAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает фильтр по атрибутам по его ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetAttributeFilterapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора группы товаров.
val attributeItemId : kotlin.Int = 56 // kotlin.Int | Id фильтра.

val result : ResultModelOfGoodsSetAttributeFilterItemViewModel = webService.goodsGroupSetAttributeFilterGetGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId(goodsGroupId, goodsSetId, attributeItemId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора группы товаров. |
 **attributeItemId** | **kotlin.Int**| Id фильтра. |

### Return type

**ResultModelOfGoodsSetAttributeFilterItemViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить фильтры по атрибутам набора группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetAttributeFilterapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора группы товаров.

val result : ResultModelOfListOfGoodsSetAttributeFilterItemViewModel = webService.goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems(goodsGroupId, goodsSetId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора группы товаров. |

### Return type

**ResultModelOfListOfGoodsSetAttributeFilterItemViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает атрибуты, доступные для выбора в атрибутном фильтре.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupSetAttributeFilterapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора группы товаров.
val attributeItemId : kotlin.Int = 56 // kotlin.Int | Id фильтра по атрибутам.
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.

val result : ResultModelOfListOfCatalogAttributeViewModel = webService.goodsGroupSetAttributeFilterGetItemAvailableAttributes(goodsGroupId, goodsSetId, attributeItemId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора группы товаров. |
 **attributeItemId** | **kotlin.Int**| Id фильтра по атрибутам. |
 **partnerId** | **kotlin.Int**| Id партнера. |

### Return type

**ResultModelOfListOfCatalogAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


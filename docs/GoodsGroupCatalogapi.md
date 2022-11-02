# GoodsGroupCatalogapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog/search | Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибуту и строке поиска.
[**goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog/search | Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибутам и фильтру.
[**goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/search | Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных.
[**goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/fixedCatalog/search | Получить иерархию каталога товаров от корневого элемента до отфильтрованных, зафиксированных.
[**goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems) | **GET** v1.2/goodsGroups/{goodsGroupId}/catalog/search | Получить иерархию каталога товаров от корневого элемента до отфильтрованных, состоящих в группе товаров.
[**goodsGroupCatalogGetCatalogItemIndex**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetCatalogItemIndex) | **GET** v1.2/goodsGroups/{goodsGroupId}/catalog/items/{catalogItemId}/index | Получить порядковый номер элемента в каталоге.
[**goodsGroupCatalogGetGoodsGroupCatalog**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetGoodsGroupCatalog) | **GET** v1.2/goodsGroups/{goodsGroupId}/catalog | Получить каталог товаров, состоящих в наборах группы товаров.
[**goodsGroupCatalogGetGoodsGroupFixedCatalog**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetGoodsGroupFixedCatalog) | **GET** v1.2/goodsGroups/{goodsGroupId}/fixedCatalog | Получить каталог зафиксированных товаров группы товаров.
[**goodsGroupCatalogGetGoodsSetAttributeFilterCatalog**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetGoodsSetAttributeFilterCatalog) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog | Получить каталог товаров, подходящих под фильтр по атрибуту.
[**goodsGroupCatalogGetGoodsSetCatalog**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetGoodsSetCatalog) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog | Получить каталог товаров набора.
[**goodsGroupCatalogGetGoodsSetFilteredCatalog**](GoodsGroupCatalogapi.md#goodsGroupCatalogGetGoodsSetFilteredCatalog) | **GET** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog | Получить каталог товаров, подходящих под фильтры по атрибутам.
[**goodsGroupCatalogUpdateGoodsSetCatalogItem**](GoodsGroupCatalogapi.md#goodsGroupCatalogUpdateGoodsSetCatalogItem) | **POST** v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/items | Обновить состояние элемента каталога в наборе товаров.



Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибуту и строке поиска.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val attributeFilterId : kotlin.Int = 56 // kotlin.Int | Id фильтра по атрибуту.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems(goodsGroupId, goodsSetId, attributeFilterId, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **attributeFilterId** | **kotlin.Int**| Id фильтра по атрибуту. |
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


Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибутам и фильтру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора товаров.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems(goodsGroupId, goodsSetId, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора товаров. |
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


Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val sortParameter : GoodsCatalogSortParameter =  // GoodsCatalogSortParameter | Параметр сортировки.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems(goodsGroupId, goodsSetId, from, count, sortParameter, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **sortParameter** | **GoodsCatalogSortParameter**| Параметр сортировки. | [optional] [enum: Name, ItemId]
 **filterSearchedText** | **kotlin.String**| Значение параметра товара. | [optional]
 **filterSearchParameter** | **GoodsCatalogSearchParameter**| Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). | [optional] [enum: Name, ItemId, BarCode]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить иерархию каталога товаров от корневого элемента до отфильтрованных, зафиксированных.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems(goodsGroupId, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
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


Получить иерархию каталога товаров от корневого элемента до отфильтрованных, состоящих в группе товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems(goodsGroupId, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
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


Получить порядковый номер элемента в каталоге.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val catalogItemId : kotlin.Int = 56 // kotlin.Int | Id элемента каталога.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского элемента каталога.

val result : ResultModelOfInt32 = webService.goodsGroupCatalogGetCatalogItemIndex(goodsGroupId, catalogItemId, parentNodeId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **catalogItemId** | **kotlin.Int**| Id элемента каталога. |
 **parentNodeId** | **kotlin.Int**| Id родительского элемента каталога. | [optional]

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог товаров, состоящих в наборах группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetGoodsGroupCatalog(goodsGroupId, parentNodeId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог зафиксированных товаров группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetGoodsGroupFixedCatalog(goodsGroupId, parentNodeId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог товаров, подходящих под фильтр по атрибуту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val attributeFilterId : kotlin.Int = 56 // kotlin.Int | Id фильтра по атрибуту.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetGoodsSetAttributeFilterCatalog(goodsGroupId, goodsSetId, attributeFilterId, parentNodeId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **attributeFilterId** | **kotlin.Int**| Id фильтра по атрибуту. |
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог товаров набора.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val sortParameter : GoodsCatalogSortParameter =  // GoodsCatalogSortParameter | Параметр сортировки.
val checkedOnly : kotlin.Boolean = true // kotlin.Boolean | Отображать только выбранные элементы.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetGoodsSetCatalog(goodsGroupId, goodsSetId, parentNodeId, from, count, sortParameter, checkedOnly, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **sortParameter** | **GoodsCatalogSortParameter**| Параметр сортировки. | [optional] [enum: Name, ItemId]
 **checkedOnly** | **kotlin.Boolean**| Отображать только выбранные элементы. | [optional]
 **filterSearchedText** | **kotlin.String**| Значение параметра товара. | [optional]
 **filterSearchParameter** | **GoodsCatalogSearchParameter**| Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). | [optional] [enum: Name, ItemId, BarCode]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить каталог товаров, подходящих под фильтры по атрибутам.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val parentNodeId : kotlin.Int = 56 // kotlin.Int | Id родительского узла.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel = webService.goodsGroupCatalogGetGoodsSetFilteredCatalog(goodsGroupId, goodsSetId, parentNodeId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **parentNodeId** | **kotlin.Int**| Id родительского узла. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновить состояние элемента каталога в наборе товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupCatalogapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.
val goodsSetId : kotlin.Int = 56 // kotlin.Int | Id набора.
val items : kotlin.collections.MutableList<GoodsSetCatalogItem> =  // kotlin.collections.MutableList<GoodsSetCatalogItem> | Подкаталоги.

val result : ResultModel = webService.goodsGroupCatalogUpdateGoodsSetCatalogItem(goodsGroupId, goodsSetId, items)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |
 **goodsSetId** | **kotlin.Int**| Id набора. |
 **items** | **kotlin.collections.MutableList&lt;GoodsSetCatalogItem&gt;**| Подкаталоги. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# FavoriteGoodsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**favoriteGoodsClearFavoriteGoodsPosition**](FavoriteGoodsapi.md#favoriteGoodsClearFavoriteGoodsPosition) | **DELETE** v1.2/users/favoriteGoods/{id}/{position} | Очищает значение товара в ячейке.
[**favoriteGoodsGetFavoriteGoods**](FavoriteGoodsapi.md#favoriteGoodsGetFavoriteGoods) | **GET** v1.2/users/favoriteGoods/{id} | Возвращает набор любимых товаров.
[**favoriteGoodsGetFavoriteGoodsList**](FavoriteGoodsapi.md#favoriteGoodsGetFavoriteGoodsList) | **GET** v1.2/users/favoriteGoods | Возвращает список наборов любимых товаров.
[**favoriteGoodsGetGoods**](FavoriteGoodsapi.md#favoriteGoodsGetGoods) | **GET** v1.2/users/favoriteGoods/{id}/list | Возвращает список товаров из персональных товаров.
[**favoriteGoodsGetUsersByPersonIdFavoriteGoods**](FavoriteGoodsapi.md#favoriteGoodsGetUsersByPersonIdFavoriteGoods) | **GET** v1.2/users/{personId}/favoriteGoods | Возвращает список наборов любимых товаров.
[**favoriteGoodsGetUsersByPersonIdFavoriteGoodsById**](FavoriteGoodsapi.md#favoriteGoodsGetUsersByPersonIdFavoriteGoodsById) | **GET** v1.2/users/{personId}/favoriteGoods/{id} | Возвращает набор любимых товаров.
[**favoriteGoodsGetUsersByPersonIdFavoriteGoodsByIdList**](FavoriteGoodsapi.md#favoriteGoodsGetUsersByPersonIdFavoriteGoodsByIdList) | **GET** v1.2/users/{personId}/favoriteGoods/{id}/list | Возвращает список любимых товаров из истории покупок.



Очищает значение товара в ячейке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id набора любимых товаров.
val position : kotlin.Int = 56 // kotlin.Int | Позиция в наборе.
val personId : kotlin.Int = 56 // kotlin.Int | Ид. пользователя.

val result : ResultModel = webService.favoriteGoodsClearFavoriteGoodsPosition(id, position, personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id набора любимых товаров. |
 **position** | **kotlin.Int**| Позиция в наборе. |
 **personId** | **kotlin.Int**| Ид. пользователя. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает набор любимых товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id набора любимых товаров.

val result : ResultModelOfFavoriteGoodsCommonViewModel = webService.favoriteGoodsGetFavoriteGoods(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id набора любимых товаров. |

### Return type

**ResultModelOfFavoriteGoodsCommonViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список наборов любимых товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val fromDate : kotlin.String = fromDate_example // kotlin.String | Дата начала интервала.
val toDate : kotlin.String = toDate_example // kotlin.String | Дата окончания интервала.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel = webService.favoriteGoodsGetFavoriteGoodsList(fromDate, toDate, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **kotlin.String**| Дата начала интервала. |
 **toDate** | **kotlin.String**| Дата окончания интервала. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список товаров из персональных товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор любимого товара.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val name : kotlin.String = name_example // kotlin.String | Фильтр по названию товара.

val result : ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel = webService.favoriteGoodsGetGoods(id, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор любимого товара. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **name** | **kotlin.String**| Фильтр по названию товара. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список наборов любимых товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id персоны.
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата периода выборки в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата периода выборки в формате 0000-00-00T00:00:00Z.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val groupName : kotlin.String = groupName_example // kotlin.String | Наименование группы товаров.
val personalOfferName : kotlin.String = personalOfferName_example // kotlin.String | Наименование персонального предложения.

val result : ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel = webService.favoriteGoodsGetUsersByPersonIdFavoriteGoods(personId, fromDate, toDate, from, count, groupName, personalOfferName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id персоны. |
 **fromDate** | **kotlin.String**| Начальная дата периода выборки в формате 0000-00-00T00:00:00Z. |
 **toDate** | **kotlin.String**| Конечная дата периода выборки в формате 0000-00-00T00:00:00Z. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **groupName** | **kotlin.String**| Наименование группы товаров. | [optional]
 **personalOfferName** | **kotlin.String**| Наименование персонального предложения. | [optional]

### Return type

**ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает набор любимых товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id персоны.
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора любимых товаров.

val result : ResultModelOfFavoriteGoodsCommonViewModel = webService.favoriteGoodsGetUsersByPersonIdFavoriteGoodsById(personId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id персоны. |
 **id** | **kotlin.Int**| Внутренний идентификатор набора любимых товаров. |

### Return type

**ResultModelOfFavoriteGoodsCommonViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список любимых товаров из истории покупок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FavoriteGoodsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Ид. пользователя.
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор любимого товара.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Значение параметра товара.
val filterSearchParameter : GoodsCatalogSearchParameter =  // GoodsCatalogSearchParameter | Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод).

val result : ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel = webService.favoriteGoodsGetUsersByPersonIdFavoriteGoodsByIdList(personId, id, from, count, filterSearchedText, filterSearchParameter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Ид. пользователя. |
 **id** | **kotlin.Int**| Внутренний идентификатор любимого товара. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterSearchedText** | **kotlin.String**| Значение параметра товара. | [optional]
 **filterSearchParameter** | **GoodsCatalogSearchParameter**| Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). | [optional] [enum: Name, ItemId, BarCode]

### Return type

**ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


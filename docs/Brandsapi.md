# Brandsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandsGetBrandInfo**](Brandsapi.md#brandsGetBrandInfo) | **GET** v1.2/brands/{uid} | Возвращает информацию о бренде по его внешнему идентификатору.
[**brandsGetBrandInfoById**](Brandsapi.md#brandsGetBrandInfoById) | **GET** v1.2/brands/{id} | Возвращает информацию о бренде по его внутреннему идентификатору.
[**brandsGetBrands**](Brandsapi.md#brandsGetBrands) | **GET** v1.2/brands | Возвращает список всех брендов.



Возвращает информацию о бренде по его внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Brandsapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор бренда.

val result : ResultModelOfCommonBrandModel = webService.brandsGetBrandInfo(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор бренда. |

### Return type

**ResultModelOfCommonBrandModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о бренде по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Brandsapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор бренда.

val result : ResultModelOfBrandViewModel = webService.brandsGetBrandInfoById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор бренда. |

### Return type

**ResultModelOfBrandViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех брендов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Brandsapi::class.java)
val filterState : BrandInfoState =  // BrandInfoState | Состояние бренда (Hidden — скрытый, Normal — обычный).
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterSubstring : kotlin.String = filterSubstring_example // kotlin.String | Подстрока для поиска по названию бренда.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Внутренние идентификаторы брендов, которые будут отображены первыми в списке.

val result : ResultModelOfPagedViewModelOfBrandModel = webService.brandsGetBrands(filterState, filterFrom, filterCount, filterSubstring, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterState** | **BrandInfoState**| Состояние бренда (Hidden — скрытый, Normal — обычный). | [optional] [enum: Normal, Hidden]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterSubstring** | **kotlin.String**| Подстрока для поиска по названию бренда. | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Внутренние идентификаторы брендов, которые будут отображены первыми в списке. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBrandModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


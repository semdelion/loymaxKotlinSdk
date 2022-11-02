# Merchantsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchantsGetInfo**](Merchantsapi.md#merchantsGetInfo) | **GET** v1.2/Merchants/{id} | Возвращает информацию о торговой точке по внутреннему идентификатору.
[**merchantsGetInfoByUid**](Merchantsapi.md#merchantsGetInfoByUid) | **GET** v1.2/Merchants/{uid} | Возвращает информацию о торговой точке по внешнему идентификатору.
[**merchantsGetMerchants**](Merchantsapi.md#merchantsGetMerchants) | **GET** v1.2/Merchants | Возвращает информацию о торговых точках (фильтр по внутренним идентификаторам торговых точек).
[**merchantsGetMerchantsByUids**](Merchantsapi.md#merchantsGetMerchantsByUids) | **GET** v1.2/Merchants/ByUids | Возвращает информацию о торговых точках (фильтр по внешним идентификаторам торговых точек).



Возвращает информацию о торговой точке по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Merchantsapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор торговой точки.

val result : ResultModelOfMerchantInfoModel = webService.merchantsGetInfo(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор торговой точки. |

### Return type

**ResultModelOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о торговой точке по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Merchantsapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор торговой точки.

val result : ResultModelOfMerchantInfoModel = webService.merchantsGetInfoByUid(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор торговой точки. |

### Return type

**ResultModelOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о торговых точках (фильтр по внутренним идентификаторам торговых точек).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Merchantsapi::class.java)
val brandId : kotlin.String = brandId_example // kotlin.String | Фильтр по внешнему идентификатору бренда.
val merchantsIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Фильтр по внутренним идентификаторам торговых точек.
val cityId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор населенного пункта.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfMerchantInfoModel = webService.merchantsGetMerchants(brandId, merchantsIds, cityId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.String**| Фильтр по внешнему идентификатору бренда. | [optional]
 **merchantsIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Фильтр по внутренним идентификаторам торговых точек. | [optional]
 **cityId** | **kotlin.Int**| Внутренний идентификатор населенного пункта. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о торговых точках (фильтр по внешним идентификаторам торговых точек).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Merchantsapi::class.java)
val brandId : kotlin.String = brandId_example // kotlin.String | Фильтр по внешнему идентификатору бренда.
val merchantsUids : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Фильтр по внешним идентификаторам торговых точек.
val cityId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор населенного пункта.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfMerchantInfoModel = webService.merchantsGetMerchantsByUids(brandId, merchantsUids, cityId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.String**| Фильтр по внешнему идентификатору бренда. | [optional]
 **merchantsUids** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Фильтр по внешним идентификаторам торговых точек. | [optional]
 **cityId** | **kotlin.Int**| Внутренний идентификатор населенного пункта. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


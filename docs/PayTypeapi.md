# PayTypeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payTypeGetList**](PayTypeapi.md#payTypeGetList) | **GET** v1.2/payType | Получить список всех способов оплаты.
[**payTypeGetPayType**](PayTypeapi.md#payTypeGetPayType) | **GET** v1.2/payType/{id} | Получение информации по типу оплаты.
[**payTypeRecoverPayType**](PayTypeapi.md#payTypeRecoverPayType) | **POST** v1.2/payType/{id}/recover | Восстановление способа оплаты.



Получить список всех способов оплаты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PayTypeapi::class.java)
val payTypeFilterName : kotlin.String = payTypeFilterName_example // kotlin.String | Название типа оплаты.
val payTypeFilterCount : kotlin.Int = 56 // kotlin.Int | Количество элементов в выборке.
val payTypeFilterFrom : kotlin.Int = 56 // kotlin.Int | С какого элемента начать выборку.

val result : ResultModelOfPagedViewModelOfPayTypeViewModel = webService.payTypeGetList(payTypeFilterName, payTypeFilterCount, payTypeFilterFrom)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payTypeFilterName** | **kotlin.String**| Название типа оплаты. | [optional]
 **payTypeFilterCount** | **kotlin.Int**| Количество элементов в выборке. | [optional]
 **payTypeFilterFrom** | **kotlin.Int**| С какого элемента начать выборку. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPayTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получение информации по типу оплаты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PayTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор типа оплаты.

val result : ResultModelOfPayTypeViewModel = webService.payTypeGetPayType(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор типа оплаты. |

### Return type

**ResultModelOfPayTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление способа оплаты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PayTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id способа оплаты.

val result : ResultModel = webService.payTypeRecoverPayType(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id способа оплаты. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


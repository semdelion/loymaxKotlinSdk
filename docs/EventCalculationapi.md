# EventCalculationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventCalculationGetById**](EventCalculationapi.md#eventCalculationGetById) | **GET** v1.2/EventCalculations/{id} | Возвращает информацию о расчёте по идентификатору.
[**eventCalculationGetPagedList**](EventCalculationapi.md#eventCalculationGetPagedList) | **GET** v1.2/EventCalculations | Возвращает список расчётов.



Возвращает информацию о расчёте по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EventCalculationapi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | Идентификатор расчёта.

val result : ResultModelOfEventCalculationModel = webService.eventCalculationGetById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| Идентификатор расчёта. |

### Return type

**ResultModelOfEventCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список расчётов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EventCalculationapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | С какого элемента брать.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько элементов брать.
val filterCalculationKey : kotlin.Long = 789 // kotlin.Long | Ключ расчёта.

val result : ResultModelOfPagedViewModelOfEventCalculationModel = webService.eventCalculationGetPagedList(filterFrom, filterCount, filterCalculationKey)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| С какого элемента брать. | [optional]
 **filterCount** | **kotlin.Int**| Сколько элементов брать. | [optional]
 **filterCalculationKey** | **kotlin.Long**| Ключ расчёта. | [optional]

### Return type

**ResultModelOfPagedViewModelOfEventCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Deviceapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceGetAvailableDevices**](Deviceapi.md#deviceGetAvailableDevices) | **GET** v1.2/Devices | 
[**deviceGetDeviceBalances**](Deviceapi.md#deviceGetDeviceBalances) | **GET** v1.2/Devices/{id}/balances | Возвращает информацию о счетах кассы.





### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Deviceapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val code : kotlin.String = code_example // kotlin.String | 
val mode : ArchivedState =  // ArchivedState | 
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | 
val sortingId : kotlin.Int = 56 // kotlin.Int | 
val merchantIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfDeviceBriefViewModel = webService.deviceGetAvailableDevices(from, count, code, mode, loyaltyProgramId, sortingId, merchantIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **code** | **kotlin.String**|  | [optional]
 **mode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **loyaltyProgramId** | **kotlin.Int**|  | [optional]
 **sortingId** | **kotlin.Int**|  | [optional]
 **merchantIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfDeviceBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о счетах кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Deviceapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор кассы.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Программы лояльности.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterName : kotlin.String = filterName_example // kotlin.String | Подстрока для поиска по названию валюты.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список внутренних идентификаторов касс, которые будут отображаться первыми в списке.

val result : ResultModelOfPagedViewModelOfMoneyViewModel = webService.deviceGetDeviceBalances(id, loyaltyProgramId, filterFrom, filterCount, filterName, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор кассы. |
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор Программы лояльности. |
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterName** | **kotlin.String**| Подстрока для поиска по названию валюты. | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список внутренних идентификаторов касс, которые будут отображаться первыми в списке. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMoneyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


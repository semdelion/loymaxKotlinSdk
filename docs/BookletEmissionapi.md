# BookletEmissionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bookletEmissionGetBookletEmission**](BookletEmissionapi.md#bookletEmissionGetBookletEmission) | **GET** v1.2/emissions/booklets/{id} | Получить выпуск буклетов по id.
[**bookletEmissionGetBookletEmissionCsv**](BookletEmissionapi.md#bookletEmissionGetBookletEmissionCsv) | **GET** v1.2/emissions/booklets/{id}/export | Получить выпуск в виде CSV файла.
[**bookletEmissionGetCardEmissions**](BookletEmissionapi.md#bookletEmissionGetCardEmissions) | **GET** v1.2/emissions/booklets | Получить список выпусков буклетов.



Получить выпуск буклетов по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookletEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска.

val result : ResultModelOfBookletEmissionViewModel = webService.bookletEmissionGetBookletEmission(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска. |

### Return type

**ResultModelOfBookletEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить выпуск в виде CSV файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookletEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска буклетов.

val result : kotlin.String = webService.bookletEmissionGetBookletEmissionCsv(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска буклетов. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список выпусков буклетов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BookletEmissionapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfBookletEmissionViewModel = webService.bookletEmissionGetCardEmissions(from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBookletEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


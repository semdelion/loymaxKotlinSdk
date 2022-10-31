# HistoryAuditapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**historyAuditGetAuditById**](HistoryAuditapi.md#historyAuditGetAuditById) | **GET** v1.2/audits/{id} | Получить аудит по идентификатору.
[**historyAuditGetAudits**](HistoryAuditapi.md#historyAuditGetAudits) | **GET** v1.2/audits | Получить аудиты.



Получить аудит по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HistoryAuditapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModelOfHistoryAuditViewModel = webService.historyAuditGetAuditById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModelOfHistoryAuditViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить аудиты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(HistoryAuditapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterCardNumber : kotlin.String = filterCardNumber_example // kotlin.String | 
val filterAuditTypes : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val filterPersonId : kotlin.Int = 56 // kotlin.Int | 
val filterIsUser : kotlin.Boolean = true // kotlin.Boolean | 
val filterClientAuditsRequired : kotlin.Boolean = true // kotlin.Boolean | 

val result : ResultModelOfPagedViewModelOfHistoryAuditViewModel = webService.historyAuditGetAudits(from, count, filterDateFrom, filterDateTo, filterCardNumber, filterAuditTypes, filterPersonId, filterIsUser, filterClientAuditsRequired)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterCardNumber** | **kotlin.String**|  | [optional]
 **filterAuditTypes** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **filterPersonId** | **kotlin.Int**|  | [optional]
 **filterIsUser** | **kotlin.Boolean**|  | [optional]
 **filterClientAuditsRequired** | **kotlin.Boolean**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfHistoryAuditViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


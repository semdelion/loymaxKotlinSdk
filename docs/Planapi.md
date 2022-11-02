# Planapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**planGetPlan**](Planapi.md#planGetPlan) | **GET** v1.2/partners/{partnerId}/plans/{year}/{month} | Получить план.
[**planGetPlans**](Planapi.md#planGetPlans) | **GET** v1.2/partners/{partnerId}/plans/{year} | Получить список планов партнера за конкретный год.



Получить план.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Planapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.
val month : kotlin.Int = 56 // kotlin.Int | Номер месяца.
val year : kotlin.Int = 56 // kotlin.Int | Год.

val result : ResultModelOfPlanViewModel = webService.planGetPlan(partnerId, month, year)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Id партнера. |
 **month** | **kotlin.Int**| Номер месяца. |
 **year** | **kotlin.Int**| Год. |

### Return type

**ResultModelOfPlanViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список планов партнера за конкретный год.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Planapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.
val year : kotlin.Int = 56 // kotlin.Int | Год.

val result : ResultModelOfListOfPlanViewModel = webService.planGetPlans(partnerId, year)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Id партнера. |
 **year** | **kotlin.Int**| Год. |

### Return type

**ResultModelOfListOfPlanViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


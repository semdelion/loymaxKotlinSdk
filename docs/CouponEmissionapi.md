# CouponEmissionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**couponEmissionGetCouponEmission**](CouponEmissionapi.md#couponEmissionGetCouponEmission) | **GET** v1.2/emissions/coupons/{emissionUid} | Возвращает информацию о выпуске купонов по внешнему идентификатору.
[**couponEmissionGetCouponEmissionById**](CouponEmissionapi.md#couponEmissionGetCouponEmissionById) | **GET** v1.2/emissions/coupons/{emissionId} | Возвращает информацию о выпуске купонов по внутреннему идентификатору.
[**couponEmissionGetCouponEmissions**](CouponEmissionapi.md#couponEmissionGetCouponEmissions) | **GET** v1.2/CouponsEmissions/{id} | Возвращает информацию о выпуске купонов по внутреннему идентификатору (OAuth).
[**couponEmissionGetCouponsByEmissionByEmissionId**](CouponEmissionapi.md#couponEmissionGetCouponsByEmissionByEmissionId) | **GET** v1.2/coupons/byEmission/{emissionId} | Возвращает список купонов из выпуска.
[**couponEmissionGetCouponsEmissions**](CouponEmissionapi.md#couponEmissionGetCouponsEmissions) | **GET** v1.2/CouponsEmissions | Возвращает список существующих выпусков купонов (OAuth).
[**couponEmissionGetEmissionCsv**](CouponEmissionapi.md#couponEmissionGetEmissionCsv) | **GET** v1.2/emissions/coupons/{emissionId}/csv | Возвращает выпуск купонов в виде CSV-файла.
[**couponEmissionGetEmissionsCoupons**](CouponEmissionapi.md#couponEmissionGetEmissionsCoupons) | **GET** v1.2/emissions/coupons | Возвращает список существующих выпусков купонов.
[**couponEmissionIssueCoupons**](CouponEmissionapi.md#couponEmissionIssueCoupons) | **POST** v1.2/emissions/coupons/{emissionId}/issue | Выдает все купоны из выпуска.



Возвращает информацию о выпуске купонов по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val emissionUid : kotlin.String = emissionUid_example // kotlin.String | Внешний идентификатор выпуска.

val result : ResultModelOfBaseCouponEmissionViewModel = webService.couponEmissionGetCouponEmission(emissionUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionUid** | **kotlin.String**| Внешний идентификатор выпуска. |

### Return type

**ResultModelOfBaseCouponEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о выпуске купонов по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска.

val result : ResultModelOfBaseCouponEmissionViewModel = webService.couponEmissionGetCouponEmissionById(emissionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Внутренний идентификатор выпуска. |

### Return type

**ResultModelOfBaseCouponEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о выпуске купонов по внутреннему идентификатору (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска купонов.

val result : ResultModelOfCouponEmissionViewModel = webService.couponEmissionGetCouponEmissions(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор выпуска купонов. |

### Return type

**ResultModelOfCouponEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список купонов из выпуска.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска купонов.
val state : CouponState =  // CouponState | Состояние.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfCouponViewModel = webService.couponEmissionGetCouponsByEmissionByEmissionId(emissionId, state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Внутренний идентификатор выпуска купонов. |
 **state** | **CouponState**| Состояние. | [optional] [enum: Created, Issued, Used, Rejected, QueuedToUse, QueuedToIssue, Expired]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список существующих выпусков купонов (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val offset : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val limit : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfCouponEmissionViewModel = webService.couponEmissionGetCouponsEmissions(offset, limit)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **limit** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCouponEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает выпуск купонов в виде CSV-файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска купонов.

val result : kotlin.String = webService.couponEmissionGetEmissionCsv(emissionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Внутренний идентификатор выпуска купонов. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список существующих выпусков купонов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val properties : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Свойства модели ответа. Принимает следующие значения  CreatedByPerson, LastEditByPerson, Counts. Если не указывать, то будут возвращены все.
val filterChangeDateFrom : kotlin.String = filterChangeDateFrom_example // kotlin.String | 
val filterChangeDateTo : kotlin.String = filterChangeDateTo_example // kotlin.String | 
val filterTypes : kotlin.collections.MutableList<CouponEmissionType> =  // kotlin.collections.MutableList<CouponEmissionType> | 
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterLoyaltyProgramIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterTitle : kotlin.String = filterTitle_example // kotlin.String | 
val filterPersonId : kotlin.Int = 56 // kotlin.Int | 

val result : ResultModelOfPagedViewModelOfBaseCouponEmissionViewModel = webService.couponEmissionGetEmissionsCoupons(from, count, properties, filterChangeDateFrom, filterChangeDateTo, filterTypes, filterPartnerIds, filterLoyaltyProgramIds, filterTitle, filterPersonId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **properties** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Свойства модели ответа. Принимает следующие значения  CreatedByPerson, LastEditByPerson, Counts. Если не указывать, то будут возвращены все. | [optional]
 **filterChangeDateFrom** | **kotlin.String**|  | [optional]
 **filterChangeDateTo** | **kotlin.String**|  | [optional]
 **filterTypes** | **kotlin.collections.MutableList&lt;CouponEmissionType&gt;**|  | [optional]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterLoyaltyProgramIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterTitle** | **kotlin.String**|  | [optional]
 **filterPersonId** | **kotlin.Int**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfBaseCouponEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Выдает все купоны из выпуска.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponEmissionapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор выпуска купонов.

val result : ResultModel = webService.couponEmissionIssueCoupons(emissionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Внутренний идентификатор выпуска купонов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


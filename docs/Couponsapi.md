# Couponsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**couponsBuy**](Couponsapi.md#couponsBuy) | **POST** v1.2/Coupons/buy | Оформляет покупку купона.
[**couponsCancel**](Couponsapi.md#couponsCancel) | **POST** v1.2/Coupons/{couponId}/cancel | Аннулирует купон.
[**couponsGenerate**](Couponsapi.md#couponsGenerate) | **POST** v1.2/Coupons/generate | Генерирует и возвращает купоны.
[**couponsGetCoupons**](Couponsapi.md#couponsGetCoupons) | **GET** v1.2/Coupons | Возвращает список купонов.
[**couponsGetInfo**](Couponsapi.md#couponsGetInfo) | **GET** v1.2/Coupons/{couponId} | Возвращает информацию о купоне.
[**couponsGetInfoByCouponNumber**](Couponsapi.md#couponsGetInfoByCouponNumber) | **GET** v1.2/Coupons/{couponNumber} | Получить информацию о купоне по номеру.
[**couponsIssueCoupon**](Couponsapi.md#couponsIssueCoupon) | **POST** v1.2/Coupons/couponById | Метод для выдачи купона из указанного выпуска.
[**couponsRefund**](Couponsapi.md#couponsRefund) | **POST** v1.2/Coupons/refund | Оформляет возврат средств.



Оформляет покупку купона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val model : CouponBuyModel =  // CouponBuyModel | Модель запроса на покупку.

val result : ResultModelOfCouponPurchaseViewModel = webService.couponsBuy(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **CouponBuyModel**| Модель запроса на покупку. |

### Return type

**ResultModelOfCouponPurchaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Аннулирует купон.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val couponId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор купона.

val result : ResultModel = webService.couponsCancel(couponId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **kotlin.Int**| Внутренний идентификатор купона. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Генерирует и возвращает купоны.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val model : CouponsGenerateModel =  // CouponsGenerateModel | Модель генерации купонов.

val result : ResultModelOfListOfCouponViewModel = webService.couponsGenerate(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **CouponsGenerateModel**| Модель генерации купонов. |

### Return type

**ResultModelOfListOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список купонов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val couponListFilterEmissionIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val couponListFilterCouponStates : kotlin.collections.MutableList<CouponState> =  // kotlin.collections.MutableList<CouponState> | 
val couponListFilterChangedStateDateFrom : kotlin.String = couponListFilterChangedStateDateFrom_example // kotlin.String | 
val couponListFilterChangedStateDateTo : kotlin.String = couponListFilterChangedStateDateTo_example // kotlin.String | 
val couponListFilterCouponNumber : kotlin.String = couponListFilterCouponNumber_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfCouponViewModel = webService.couponsGetCoupons(from, count, couponListFilterEmissionIds, couponListFilterCouponStates, couponListFilterChangedStateDateFrom, couponListFilterChangedStateDateTo, couponListFilterCouponNumber)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **couponListFilterEmissionIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **couponListFilterCouponStates** | **kotlin.collections.MutableList&lt;CouponState&gt;**|  | [optional]
 **couponListFilterChangedStateDateFrom** | **kotlin.String**|  | [optional]
 **couponListFilterChangedStateDateTo** | **kotlin.String**|  | [optional]
 **couponListFilterCouponNumber** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о купоне.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val couponId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор купона.

val result : ResultModelOfCouponViewModel = webService.couponsGetInfo(couponId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **kotlin.Int**| Внутренний идентификатор купона. |

### Return type

**ResultModelOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о купоне по номеру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val couponNumber : kotlin.String = couponNumber_example // kotlin.String | Номер купона.

val result : ResultModelOfCouponViewModel = webService.couponsGetInfoByCouponNumber(couponNumber)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponNumber** | **kotlin.String**| Номер купона. |

### Return type

**ResultModelOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Метод для выдачи купона из указанного выпуска.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val emissionId : kotlin.Int = 56 // kotlin.Int | Id выпуска купонов.
val personUid : kotlin.String = personUid_example // kotlin.String | Uid клиента кому выдать купон.
val personId : kotlin.Int = 56 // kotlin.Int | Id клиента кому выдать купон.

val result : ResultModelOfIssuedCouponModel = webService.couponsIssueCoupon(emissionId, personUid, personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emissionId** | **kotlin.Int**| Id выпуска купонов. |
 **personUid** | **kotlin.String**| Uid клиента кому выдать купон. | [optional]
 **personId** | **kotlin.Int**| Id клиента кому выдать купон. | [optional]

### Return type

**ResultModelOfIssuedCouponModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет возврат средств.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Couponsapi::class.java)
val model : CouponRefundModel =  // CouponRefundModel | Модель запроса на возврат.

val result : ResultModelOfCouponPurchaseViewModel = webService.couponsRefund(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **CouponRefundModel**| Модель запроса на возврат. |

### Return type

**ResultModelOfCouponPurchaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


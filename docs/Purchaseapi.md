# Purchaseapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseCancelPurchase**](Purchaseapi.md#purchaseCancelPurchase) | **POST** v1.2/purchases/{purchaseId}/cancel | Редактирование состояния покупки.
[**purchaseCancelPurchaseByExternalId**](Purchaseapi.md#purchaseCancelPurchaseByExternalId) | **POST** v1.2/purchases/cancel/{deviceCode}/{purchaseId} | Редактирование состояния покупки.
[**purchaseConfirmPurchase**](Purchaseapi.md#purchaseConfirmPurchase) | **POST** v1.2/purchases/{purchaseId}/confirm | Редактирование состояния покупки.
[**purchaseConfirmPurchaseByExternalId**](Purchaseapi.md#purchaseConfirmPurchaseByExternalId) | **POST** v1.2/purchases/confirm/{deviceCode}/{purchaseId} | Редактирование состояния покупки.
[**purchaseGet**](Purchaseapi.md#purchaseGet) | **POST** v1.2/purchases | Получить указанное количество покупок с указанной позиции.
[**purchaseGetChequePositions**](Purchaseapi.md#purchaseGetChequePositions) | **GET** v1.2/purchases/{purchaseId}/chequePositions | Получить чековые позиции по покупке.
[**purchaseGetOperations**](Purchaseapi.md#purchaseGetOperations) | **GET** v1.2/purchases/{purchaseId}/operations | Получить список операций по покупке.
[**purchaseGetPurchase**](Purchaseapi.md#purchaseGetPurchase) | **GET** v1.2/purchases/{purchaseId} | Получить покупку по идентификатору.



Редактирование состояния покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор покупки.

val result : ResultModel = webService.purchaseCancelPurchase(purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Идентификатор покупки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Редактирование состояния покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val deviceCode : kotlin.String = deviceCode_example // kotlin.String | Код кассы.
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.

val result : ResultModel = webService.purchaseCancelPurchaseByExternalId(deviceCode, purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceCode** | **kotlin.String**| Код кассы. |
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Редактирование состояния покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор покупки.

val result : ResultModel = webService.purchaseConfirmPurchase(purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Идентификатор покупки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Редактирование состояния покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val deviceCode : kotlin.String = deviceCode_example // kotlin.String | Код кассы.
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.

val result : ResultModel = webService.purchaseConfirmPurchaseByExternalId(deviceCode, purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceCode** | **kotlin.String**| Код кассы. |
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить указанное количество покупок с указанной позиции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val filter : PurchasesFilterViewModel =  // PurchasesFilterViewModel | Фильтр.

val result : ResultModelOfPagedViewModelOfPurchaseViewModel = webService.purchaseGet(filter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PurchasesFilterViewModel**| Фильтр. |

### Return type

**ResultModelOfPagedViewModelOfPurchaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить чековые позиции по покупке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор.
val showCanceledOperations : kotlin.Boolean = true // kotlin.Boolean | Отображать отменененные операции.

val result : ResultModelOfListOfChequePositionViewModel = webService.purchaseGetChequePositions(purchaseId, showCanceledOperations)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Идентификатор. |
 **showCanceledOperations** | **kotlin.Boolean**| Отображать отменененные операции. | [optional]

### Return type

**ResultModelOfListOfChequePositionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список операций по покупке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор покупки.

val result : ResultModelOfListOfOperationsViewModel = webService.purchaseGetOperations(purchaseId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Идентификатор покупки. |

### Return type

**ResultModelOfListOfOperationsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить покупку по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Purchaseapi::class.java)
val purchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор покупки.
val withCoupons : kotlin.Boolean = true // kotlin.Boolean | Возвращать ли использованные купоны.

val result : ResultModelOfPurchaseViewModel = webService.purchaseGetPurchase(purchaseId, withCoupons)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.Int**| Идентификатор покупки. |
 **withCoupons** | **kotlin.Boolean**| Возвращать ли использованные купоны. | [optional]

### Return type

**ResultModelOfPurchaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


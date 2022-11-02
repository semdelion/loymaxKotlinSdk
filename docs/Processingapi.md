# Processingapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processingBalance**](Processingapi.md#processingBalance) | **POST** v1.2/Processing/Balance | Возвращает информацию о количестве средств на счете держателя карты.
[**processingCancelOperation**](Processingapi.md#processingCancelOperation) | **POST** v1.2/Processing/Purchases/{purchaseId}/Operations/{operationId}/Cancel | Отменяет списание бонусов для неподтвержденной покупки.
[**processingCancelPurchase**](Processingapi.md#processingCancelPurchase) | **POST** v1.2/Processing/Purchases/{purchaseId}/Cancel | Отменяет неподтвержденную покупку.
[**processingConfirmPurchase**](Processingapi.md#processingConfirmPurchase) | **POST** v1.2/Processing/Purchases/{purchaseId}/Confirm | Подтверждает покупку.
[**processingExecuteAvailableAmount**](Processingapi.md#processingExecuteAvailableAmount) | **POST** v1.2/Processing/Purchases/{purchaseId}/Bonus/Available | Рассчитывает максимальную сумму списания бонусов.
[**processingExecuteCalculate**](Processingapi.md#processingExecuteCalculate) | **POST** v1.2/Processing/Purchases/{purchaseId}/Calculate | Рассчитывает прямую скидку и доступную сумму списания бонусов.
[**processingExecuteDiscount**](Processingapi.md#processingExecuteDiscount) | **POST** v1.2/Processing/Purchases/{purchaseId}/Bonus | Рассчитывает бонусы.
[**processingExecuteGoods**](Processingapi.md#processingExecuteGoods) | **POST** v1.2/Processing/Goods | Рассчитывает возможные преференции (предполагаемые цены) на товары из товарного каталога.
[**processingExecutePayment**](Processingapi.md#processingExecutePayment) | **POST** v1.2/Processing/Purchases/{purchaseId}/Bonus/Payment | Проводит списание бонусов.
[**processingRefund**](Processingapi.md#processingRefund) | **POST** v1.2/Processing/Purchases/{purchaseId}/Refund | Проводит возврат покупки.



Возвращает информацию о количестве средств на счете держателя карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val model : BalanceRequestModel =  // BalanceRequestModel | Модель запроса на получение информации о количестве средств на счете держателя карты.

val result : ResultModelOfBalanceResponseModel = webService.processingBalance(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **BalanceRequestModel**| Модель запроса на получение информации о количестве средств на счете держателя карты. |

### Return type

**ResultModelOfBalanceResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отменяет списание бонусов для неподтвержденной покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val operationId : kotlin.String = operationId_example // kotlin.String | Идентификатор операции на списание бонусов.
val model : CancelOperationRequestModel =  // CancelOperationRequestModel | Модель запроса на отмену списания бонусов.

val result : ResultModelOfCancelOperationResponseModel = webService.processingCancelOperation(purchaseId, operationId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **operationId** | **kotlin.String**| Идентификатор операции на списание бонусов. |
 **model** | **CancelOperationRequestModel**| Модель запроса на отмену списания бонусов. |

### Return type

**ResultModelOfCancelOperationResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отменяет неподтвержденную покупку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : CancelPurchaseRequestModel =  // CancelPurchaseRequestModel | Модель запроса на отмену неподтвержденной покупки.

val result : ResultModelOfCancelPurchaseResponseModel = webService.processingCancelPurchase(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **CancelPurchaseRequestModel**| Модель запроса на отмену неподтвержденной покупки. |

### Return type

**ResultModelOfCancelPurchaseResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Подтверждает покупку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : ConfirmPurchaseRequestModel =  // ConfirmPurchaseRequestModel | Модель запроса на подтверждение покупки.

val result : ResultModelOfConfirmPurchaseResponseModel = webService.processingConfirmPurchase(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **ConfirmPurchaseRequestModel**| Модель запроса на подтверждение покупки. |

### Return type

**ResultModelOfConfirmPurchaseResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Рассчитывает максимальную сумму списания бонусов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : AvailableAmountRequestModel =  // AvailableAmountRequestModel | Модель запроса на получение максимальной суммы списания бонусов.

val result : ResultModelOfAvailableAmountResponseModel = webService.processingExecuteAvailableAmount(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **AvailableAmountRequestModel**| Модель запроса на получение максимальной суммы списания бонусов. |

### Return type

**ResultModelOfAvailableAmountResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Рассчитывает прямую скидку и доступную сумму списания бонусов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : CalculateRequestModel =  // CalculateRequestModel | Модель запроса на расчет прямой скидки и доступной суммы списания бонусов.

val result : ResultModelOfCalculateResponseModel = webService.processingExecuteCalculate(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **CalculateRequestModel**| Модель запроса на расчет прямой скидки и доступной суммы списания бонусов. |

### Return type

**ResultModelOfCalculateResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Рассчитывает бонусы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : DiscountRequestModel =  // DiscountRequestModel | Модель запроса на расчет бонусов.

val result : ResultModelOfDiscountResponseModel = webService.processingExecuteDiscount(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **DiscountRequestModel**| Модель запроса на расчет бонусов. |

### Return type

**ResultModelOfDiscountResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Рассчитывает возможные преференции (предполагаемые цены) на товары из товарного каталога.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val model : GoodsRequestModel =  // GoodsRequestModel | Модель запроса на расчет возможных преференций.

val result : ResultModelOfGoodsResponseModel = webService.processingExecuteGoods(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **GoodsRequestModel**| Модель запроса на расчет возможных преференций. |

### Return type

**ResultModelOfGoodsResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проводит списание бонусов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : PaymentRequestModel =  // PaymentRequestModel | Модель запроса на проведение списания бонусов.

val result : ResultModelOfPaymentResponseModel = webService.processingExecutePayment(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **PaymentRequestModel**| Модель запроса на проведение списания бонусов. |

### Return type

**ResultModelOfPaymentResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проводит возврат покупки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Processingapi::class.java)
val purchaseId : kotlin.String = purchaseId_example // kotlin.String | Идентификатор покупки.
val model : RefundRequestModel =  // RefundRequestModel | Модель запроса на возврат покупки.

val result : ResultModelOfRefundResponseModel = webService.processingRefund(purchaseId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseId** | **kotlin.String**| Идентификатор покупки. |
 **model** | **RefundRequestModel**| Модель запроса на возврат покупки. |

### Return type

**ResultModelOfRefundResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


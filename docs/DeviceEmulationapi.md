# DeviceEmulationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceEmulationAddUserIdentifier**](DeviceEmulationapi.md#deviceEmulationAddUserIdentifier) | **PUT** v1.2/deviceEmulation/purchases/current/userIdentifier | Добавление идентификатора пользователя.
[**deviceEmulationCalculate**](DeviceEmulationapi.md#deviceEmulationCalculate) | **POST** v1.2/deviceEmulation/purchases/current/calculate | Рассчитать прямую скидку.
[**deviceEmulationCancelPurchase**](DeviceEmulationapi.md#deviceEmulationCancelPurchase) | **POST** v1.2/deviceEmulation/purchases/current/cancel | Отменить покупку.
[**deviceEmulationCompletePurchaseWithCancel**](DeviceEmulationapi.md#deviceEmulationCompletePurchaseWithCancel) | **POST** v1.2/deviceEmulation/purchases/current/completeWithCancel | Завершить покупку без подтверждения.
[**deviceEmulationCompletePurchaseWithConfirm**](DeviceEmulationapi.md#deviceEmulationCompletePurchaseWithConfirm) | **POST** v1.2/deviceEmulation/purchases/current/completeWithConfirm | Завершить покупку c подтверждением.
[**deviceEmulationCreateChequePositions**](DeviceEmulationapi.md#deviceEmulationCreateChequePositions) | **PUT** v1.2/deviceEmulation/purchases/current/positions | Добавляет чековые позиции.
[**deviceEmulationCreateCoupons**](DeviceEmulationapi.md#deviceEmulationCreateCoupons) | **PUT** v1.2/deviceEmulation/purchases/current/coupons | Добавляет список купонов.
[**deviceEmulationDeleteCouponByNumber**](DeviceEmulationapi.md#deviceEmulationDeleteCouponByNumber) | **DELETE** v1.2/deviceEmulation/purchases/current/coupons/{number} | Удаляет купон по номеру.
[**deviceEmulationFinishCheque**](DeviceEmulationapi.md#deviceEmulationFinishCheque) | **POST** v1.2/deviceEmulation/purchases/current/finish | Завершить покупку.
[**deviceEmulationGetAvailableAmount**](DeviceEmulationapi.md#deviceEmulationGetAvailableAmount) | **GET** v1.2/deviceEmulation/purchases/current/availableAmount | Возвращает доступные средства по карте.
[**deviceEmulationGetBalance**](DeviceEmulationapi.md#deviceEmulationGetBalance) | **GET** v1.2/deviceEmulation/balance | Возвращает баланс.
[**deviceEmulationGetBrands**](DeviceEmulationapi.md#deviceEmulationGetBrands) | **GET** v1.2/deviceEmulation/brands | Возвращает список всех доступных брендов.
[**deviceEmulationGetCashierInfo**](DeviceEmulationapi.md#deviceEmulationGetCashierInfo) | **GET** v1.2/deviceEmulation/purchases/current/cashier | Получить информацию о кассире.
[**deviceEmulationGetChequeAdditionalParams**](DeviceEmulationapi.md#deviceEmulationGetChequeAdditionalParams) | **GET** v1.2/deviceEmulation/purchases/current/params | Возвращает список параметров чека.
[**deviceEmulationGetChequePositionParams**](DeviceEmulationapi.md#deviceEmulationGetChequePositionParams) | **GET** v1.2/deviceEmulation/purchases/current/positions/{id}/params | Возвращает список параметров чековой позиции.
[**deviceEmulationGetDeviceByID**](DeviceEmulationapi.md#deviceEmulationGetDeviceByID) | **GET** v1.2/deviceEmulation/devices/{deviceID} | Возвращает кассу по идентификатору.
[**deviceEmulationGetLegals**](DeviceEmulationapi.md#deviceEmulationGetLegals) | **GET** v1.2/deviceEmulation/legals | Возвращает список всех доступных юридических лиц.
[**deviceEmulationGetMerchants**](DeviceEmulationapi.md#deviceEmulationGetMerchants) | **GET** v1.2/deviceEmulation/brands/{brandId}/merchants | Возвращает список всех доступных магазинов.
[**deviceEmulationGetOrCreateAvailableDevice**](DeviceEmulationapi.md#deviceEmulationGetOrCreateAvailableDevice) | **GET** v1.2/deviceEmulation/brands/{brandId}/merchants/{merchantId}/device | Возвращает кассу.
[**deviceEmulationGetPurchase**](DeviceEmulationapi.md#deviceEmulationGetPurchase) | **GET** v1.2/deviceEmulation/purchases/current | Возвращает текущую покупку.
[**deviceEmulationGetPurchases**](DeviceEmulationapi.md#deviceEmulationGetPurchases) | **GET** v1.2/deviceEmulation/purchases | Получить указанное количество покупок с указанной позиции.
[**deviceEmulationSetCashPayment**](DeviceEmulationapi.md#deviceEmulationSetCashPayment) | **PUT** v1.2/deviceEmulation/purchases/current/payments/cash | Добавить оплату реальными деньгами.
[**deviceEmulationSetOtherPayment**](DeviceEmulationapi.md#deviceEmulationSetOtherPayment) | **PUT** v1.2/deviceEmulation/purchases/current/payments/other | Добавить оплату бонусами сторонних компаний.
[**deviceEmulationSetPayments**](DeviceEmulationapi.md#deviceEmulationSetPayments) | **PUT** v1.2/deviceEmulation/purchases/current/payments | Задать оплаты.
[**deviceEmulationSetThirdPartyBonusPayment**](DeviceEmulationapi.md#deviceEmulationSetThirdPartyBonusPayment) | **PUT** v1.2/deviceEmulation/purchases/current/payments/thirdPartyBonus | Добавить оплату бонусами сторонних компаний.
[**deviceEmulationSwapChequePositions**](DeviceEmulationapi.md#deviceEmulationSwapChequePositions) | **POST** v1.2/deviceEmulation/purchases/current/positions/{positionId}/swap | Меняет местами позиции в чеке.
[**deviceEmulationUpdateChequePosition**](DeviceEmulationapi.md#deviceEmulationUpdateChequePosition) | **POST** v1.2/deviceEmulation/purchases/current/positions/{positionId} | Обновляет чековую позицию.



Добавление идентификатора пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val identifierValue : kotlin.String = identifierValue_example // kotlin.String | Значение.
val identifierLoyaltyProgram : kotlin.String = identifierLoyaltyProgram_example // kotlin.String | Программа лояльности.

val result : ResultModel = webService.deviceEmulationAddUserIdentifier(identifierValue, identifierLoyaltyProgram)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierValue** | **kotlin.String**| Значение. | [optional]
 **identifierLoyaltyProgram** | **kotlin.String**| Программа лояльности. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Рассчитать прямую скидку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationCalculateResultStateViewModel = webService.deviceEmulationCalculate()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationCalculateResultStateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отменить покупку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationResultStateViewModel = webService.deviceEmulationCancelPurchase()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationResultStateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершить покупку без подтверждения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationChequeViewModel = webService.deviceEmulationCompletePurchaseWithCancel()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationChequeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершить покупку c подтверждением.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationChequeViewModel = webService.deviceEmulationCompletePurchaseWithConfirm()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationChequeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавляет чековые позиции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val createChequePositionViewModels : kotlin.collections.MutableList<DeviceEmulationCreateChequePositionModel> =  // kotlin.collections.MutableList<DeviceEmulationCreateChequePositionModel> | Список чековых позиций.

val result : ResultModel = webService.deviceEmulationCreateChequePositions(createChequePositionViewModels)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChequePositionViewModels** | **kotlin.collections.MutableList&lt;DeviceEmulationCreateChequePositionModel&gt;**| Список чековых позиций. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавляет список купонов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val model : DeviceEmulationCreateCouponsFromListModel =  // DeviceEmulationCreateCouponsFromListModel | Входная модель.

val result : ResultModel = webService.deviceEmulationCreateCoupons(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **DeviceEmulationCreateCouponsFromListModel**| Входная модель. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет купон по номеру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val number : kotlin.String = number_example // kotlin.String | Номер купона.

val result : ResultModel = webService.deviceEmulationDeleteCouponByNumber(number)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **kotlin.String**| Номер купона. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершить покупку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModel = webService.deviceEmulationFinishCheque()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает доступные средства по карте.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val identifierValue : kotlin.String = identifierValue_example // kotlin.String | Значение.
val identifierLoyaltyProgram : kotlin.String = identifierLoyaltyProgram_example // kotlin.String | Программа лояльности.

val result : ResultModelOfDeviceEmulationBalanceViewModel = webService.deviceEmulationGetAvailableAmount(identifierValue, identifierLoyaltyProgram)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierValue** | **kotlin.String**| Значение. | [optional]
 **identifierLoyaltyProgram** | **kotlin.String**| Программа лояльности. | [optional]

### Return type

**ResultModelOfDeviceEmulationBalanceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает баланс.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val deviceId : kotlin.Int = 56 // kotlin.Int | Идентификатор кассы.
val date : kotlin.String = date_example // kotlin.String | Время запроса.
val identifierValue : kotlin.String = identifierValue_example // kotlin.String | Значение.
val identifierLoyaltyProgram : kotlin.String = identifierLoyaltyProgram_example // kotlin.String | Программа лояльности.

val result : ResultModelOfDeviceEmulationBalanceViewModel = webService.deviceEmulationGetBalance(deviceId, date, identifierValue, identifierLoyaltyProgram)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **kotlin.Int**| Идентификатор кассы. |
 **date** | **kotlin.String**| Время запроса. |
 **identifierValue** | **kotlin.String**| Значение. | [optional]
 **identifierLoyaltyProgram** | **kotlin.String**| Программа лояльности. | [optional]

### Return type

**ResultModelOfDeviceEmulationBalanceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех доступных брендов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Название.

val result : ResultModelOfPagedViewModelOfBrandLineViewModel = webService.deviceEmulationGetBrands(from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Название. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBrandLineViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о кассире.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationCashierViewModel = webService.deviceEmulationGetCashierInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationCashierViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список параметров чека.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfListOfDeviceEmulationPurchaseParamViewModel = webService.deviceEmulationGetChequeAdditionalParams()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfDeviceEmulationPurchaseParamViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список параметров чековой позиции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор позиции.

val result : ResultModelOfListOfDeviceEmulationPurchaseParamViewModel = webService.deviceEmulationGetChequePositionParams(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор позиции. |

### Return type

**ResultModelOfListOfDeviceEmulationPurchaseParamViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает кассу по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val deviceID : kotlin.Int = 56 // kotlin.Int | Идентификатор кассы.

val result : ResultModelOfTestDeviceViewModel = webService.deviceEmulationGetDeviceByID(deviceID)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceID** | **kotlin.Int**| Идентификатор кассы. |

### Return type

**ResultModelOfTestDeviceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех доступных юридических лиц.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val merchantId : kotlin.Int = 56 // kotlin.Int | Магазин.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Название.

val result : ResultModelOfPagedViewModelOfLegalViewModel = webService.deviceEmulationGetLegals(merchantId, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.Int**| Магазин. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Название. | [optional]

### Return type

**ResultModelOfPagedViewModelOfLegalViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех доступных магазинов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val brandId : kotlin.Int = 56 // kotlin.Int | Идентификатор бренда.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Название.

val result : ResultModelOfPagedViewModelOfMerchantLineViewModel = webService.deviceEmulationGetMerchants(brandId, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.Int**| Идентификатор бренда. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Название. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMerchantLineViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает кассу.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val brandId : kotlin.Int = 56 // kotlin.Int | Идентификатор бренда.
val merchantId : kotlin.Int = 56 // kotlin.Int | Идентификатор мерчанта.
val legalId : kotlin.Int = 56 // kotlin.Int | Идентификатор юридического лица.

val result : ResultModelOfTestDeviceViewModel = webService.deviceEmulationGetOrCreateAvailableDevice(brandId, merchantId, legalId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **kotlin.Int**| Идентификатор бренда. |
 **merchantId** | **kotlin.Int**| Идентификатор мерчанта. |
 **legalId** | **kotlin.Int**| Идентификатор юридического лица. |

### Return type

**ResultModelOfTestDeviceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает текущую покупку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)

val result : ResultModelOfDeviceEmulationPurchaseCurrentViewModel = webService.deviceEmulationGetPurchase()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfDeviceEmulationPurchaseCurrentViewModel**

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
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val startChequeTime : kotlin.String = startChequeTime_example // kotlin.String | Нижняя граница времени покупки.
val lastChequeTime : kotlin.String = lastChequeTime_example // kotlin.String | Верхняя граница времени покупки.
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Идентификатор магазина.
val loyaltyPrograms : kotlin.String = loyaltyPrograms_example // kotlin.String | Идентификатор программ лояльности.
val chequeNumber : kotlin.String = chequeNumber_example // kotlin.String | Номер чека.
val count : kotlin.Int = 56 // kotlin.Int | Количество.
val from : kotlin.Int = 56 // kotlin.Int | Начальная позиция в списке.
val cardNumber : kotlin.String = cardNumber_example // kotlin.String | Номер карты клиента.
val personId : kotlin.Int = 56 // kotlin.Int | Идентификатор пользователя.
val personIdentifier : kotlin.String = personIdentifier_example // kotlin.String | Номер телефона клиента.
val deviceIds : kotlin.String = deviceIds_example // kotlin.String | Ids касс.

val result : ResultModelOfPagedViewModelOfPurchaseViewModel = webService.deviceEmulationGetPurchases(startChequeTime, lastChequeTime, merchantIds, loyaltyPrograms, chequeNumber, count, from, cardNumber, personId, personIdentifier, deviceIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startChequeTime** | **kotlin.String**| Нижняя граница времени покупки. | [optional]
 **lastChequeTime** | **kotlin.String**| Верхняя граница времени покупки. | [optional]
 **merchantIds** | **kotlin.String**| Идентификатор магазина. | [optional]
 **loyaltyPrograms** | **kotlin.String**| Идентификатор программ лояльности. | [optional]
 **chequeNumber** | **kotlin.String**| Номер чека. | [optional]
 **count** | **kotlin.Int**| Количество. | [optional]
 **from** | **kotlin.Int**| Начальная позиция в списке. | [optional]
 **cardNumber** | **kotlin.String**| Номер карты клиента. | [optional]
 **personId** | **kotlin.Int**| Идентификатор пользователя. | [optional]
 **personIdentifier** | **kotlin.String**| Номер телефона клиента. | [optional]
 **deviceIds** | **kotlin.String**| Ids касс. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPurchaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавить оплату реальными деньгами.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val cashPaymentModel : DeviceEmulationCashPaymentModel =  // DeviceEmulationCashPaymentModel | Модель добавления оплаты.

val result : ResultModel = webService.deviceEmulationSetCashPayment(cashPaymentModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashPaymentModel** | **DeviceEmulationCashPaymentModel**| Модель добавления оплаты. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавить оплату бонусами сторонних компаний.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val otherPaymentModel : DeviceEmulationAddOtherPaymentModel =  // DeviceEmulationAddOtherPaymentModel | Модель добавления оплаты.

val result : ResultModel = webService.deviceEmulationSetOtherPayment(otherPaymentModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otherPaymentModel** | **DeviceEmulationAddOtherPaymentModel**| Модель добавления оплаты. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Задать оплаты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val addPaymentModels : kotlin.collections.MutableList<DeviceEmulationAddBonusPaymentModel> =  // kotlin.collections.MutableList<DeviceEmulationAddBonusPaymentModel> | Модели оплат.

val result : ResultModelOfDeviceEmulationResultStateViewModel = webService.deviceEmulationSetPayments(addPaymentModels)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addPaymentModels** | **kotlin.collections.MutableList&lt;DeviceEmulationAddBonusPaymentModel&gt;**| Модели оплат. |

### Return type

**ResultModelOfDeviceEmulationResultStateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавить оплату бонусами сторонних компаний.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val thirdPartyBonusPaymentModel : DeviceEmulationThirdPartyBonusPaymentModel =  // DeviceEmulationThirdPartyBonusPaymentModel | Модель добавления оплаты.

val result : ResultModel = webService.deviceEmulationSetThirdPartyBonusPayment(thirdPartyBonusPaymentModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thirdPartyBonusPaymentModel** | **DeviceEmulationThirdPartyBonusPaymentModel**| Модель добавления оплаты. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Меняет местами позиции в чеке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val positionId : kotlin.Int = 56 // kotlin.Int | Номер позиции в покупке.
val secondPositionId : kotlin.Int = 56 // kotlin.Int | Номер второй позиции в покупке.

val result : ResultModel = webService.deviceEmulationSwapChequePositions(positionId, secondPositionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **positionId** | **kotlin.Int**| Номер позиции в покупке. |
 **secondPositionId** | **kotlin.Int**| Номер второй позиции в покупке. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет чековую позицию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(DeviceEmulationapi::class.java)
val positionId : kotlin.Int = 56 // kotlin.Int | Номер позиции в покупке.
val newPosition : DeviceEmulationUpdateChequePositionModel =  // DeviceEmulationUpdateChequePositionModel | Новая чековая позиция.

val result : ResultModel = webService.deviceEmulationUpdateChequePosition(positionId, newPosition)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **positionId** | **kotlin.Int**| Номер позиции в покупке. |
 **newPosition** | **DeviceEmulationUpdateChequePositionModel**| Новая чековая позиция. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


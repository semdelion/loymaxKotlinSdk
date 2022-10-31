# Counterapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**counterGet**](Counterapi.md#counterGet) | **GET** v1.2/Counters/{id} | Возвращает счетчик по его внутреннему идентификатору.
[**counterGetAvailableCounters**](Counterapi.md#counterGetAvailableCounters) | **GET** v1.2/Counters | Возвращает список доступных счетчиков.
[**counterGetTargets**](Counterapi.md#counterGetTargets) | **GET** v1.2/Counters/Targets | Возвращает список доступных параметров счетчика.



Возвращает счетчик по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Counterapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор счетчика.

val result : ResultModelOfCounterViewModel = webService.counterGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор счетчика. |

### Return type

**ResultModelOfCounterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список доступных счетчиков.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Counterapi::class.java)
val filterEventType : OfferEventType =  // OfferEventType | Тип события.
val filterNameText : kotlin.String = filterNameText_example // kotlin.String | Текст, содержащийся в названии счетчика.
val filterCounterType : CounterType =  // CounterType | Тип счетчика.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | С какой даты искать.
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | По какую дату искать.
val filterPartners : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список партнеров, по которым будут отфильтрованы счетчики.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterLoyaltyProgramIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список id программ лояльности, для фильтрации счетчиков.
val filterRequiredTargets : kotlin.collections.MutableList<CounterTarget> =  // kotlin.collections.MutableList<CounterTarget> | Обязательные параметры счетчика.
val filterSupportedTargets : kotlin.collections.MutableList<CounterTarget> =  // kotlin.collections.MutableList<CounterTarget> | Поддерживаемые параметры счетчика.

val result : ResultModelOfPagedViewModelOfCounterBaseViewModel = webService.counterGetAvailableCounters(filterEventType, filterNameText, filterCounterType, filterDateFrom, filterDateTo, filterPartners, filterFrom, filterCount, filterLoyaltyProgramIds, filterRequiredTargets, filterSupportedTargets)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterEventType** | **OfferEventType**| Тип события. | [optional] [enum: OnPurchaseCalculate, OnAttachPhone, OnPurchaseConfirm, OnPurchasePayment, OnBalanceRequest, OnCardIssue, OnCardActivation, OnSocialActivity, OnSocialGroupJoin, OnFriendInvite, OnSocialGroupLeave, OnQuestionnaireUpdate, OnMobileAppInstall, OnEndPersonRegistration, OnSocialNetworkLink, OnBonusLifetimeExpired, OnBirthday, OnPurchaseRefund, OnReferralPurchase, OnPurchaseCancel, OnRemoveSocialActivity, OnPurchaseDiscount, OnSendPasswordToCheque, OnGoodsSetProcess, OnAttachEmail, OnBonusLifetimeActivation, OnPurchasePaymentCalculate, OnPurchasePaymentCancel, OnCouponPurchased, OnCouponRefunded, OnPurchaseDeposit, OnCardAttach, OnCardReplace, OnExternalCardReplace, OnPurchaseRefundCalculate, OnManualCharge, OnManualWithdraw, OnIteratorProcess, OnPersonStatusChange, OnGiftCertificateSale, OnGiftCertificatePayment, OnGiftCertificateRefund, OnGiftCertificatePaymentCancel, OnStatusSystemCalculation, OnBeginRegistration, OnCustomerAttributeUpdate, OnCustomerSubscriptionChange, OnCardSet, OnBlockCard, OnUnblockCard, OnDeleteCard, OnRecoverCard, MergeCustomersProfiles, OnCardCategoryChange, OnCustomerStateChange, LinkAccount]
 **filterNameText** | **kotlin.String**| Текст, содержащийся в названии счетчика. | [optional]
 **filterCounterType** | **CounterType**| Тип счетчика. | [optional] [enum: Original, PurchaseCounter, MultiplicityCounter]
 **filterDateFrom** | **kotlin.String**| С какой даты искать. | [optional]
 **filterDateTo** | **kotlin.String**| По какую дату искать. | [optional]
 **filterPartners** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список партнеров, по которым будут отфильтрованы счетчики. | [optional]
 **filterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество. | [optional]
 **filterLoyaltyProgramIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список id программ лояльности, для фильтрации счетчиков. | [optional]
 **filterRequiredTargets** | **kotlin.collections.MutableList&lt;CounterTarget&gt;**| Обязательные параметры счетчика. | [optional]
 **filterSupportedTargets** | **kotlin.collections.MutableList&lt;CounterTarget&gt;**| Поддерживаемые параметры счетчика. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCounterBaseViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список доступных параметров счетчика.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Counterapi::class.java)
val eventTypes : kotlin.collections.MutableList<OfferEventType> =  // kotlin.collections.MutableList<OfferEventType> | Список типов событий.

val result : ResultModelOfListOfCounterTargetViewModel = webService.counterGetTargets(eventTypes)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypes** | **kotlin.collections.MutableList&lt;OfferEventType&gt;**| Список типов событий. |

### Return type

**ResultModelOfListOfCounterTargetViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


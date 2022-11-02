# BusinessEventsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessEventsGetAvailableVariables**](BusinessEventsapi.md#businessEventsGetAvailableVariables) | **GET** v1.2/Events/{eventType}/Variables | Возвращает список доступных переменных контекста.
[**businessEventsGetBusinessEvents**](BusinessEventsapi.md#businessEventsGetBusinessEvents) | **GET** v1.2/Events | Возвращает список активностей.



Возвращает список доступных переменных контекста.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BusinessEventsapi::class.java)
val eventType : OfferEventType =  // OfferEventType | Тип события.

val result : ResultModelOfListOfString = webService.businessEventsGetAvailableVariables(eventType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventType** | **OfferEventType**| Тип события. | [enum: OnPurchaseCalculate, OnAttachPhone, OnPurchaseConfirm, OnPurchasePayment, OnBalanceRequest, OnCardIssue, OnCardActivation, OnSocialActivity, OnSocialGroupJoin, OnFriendInvite, OnSocialGroupLeave, OnQuestionnaireUpdate, OnMobileAppInstall, OnEndPersonRegistration, OnSocialNetworkLink, OnBonusLifetimeExpired, OnBirthday, OnPurchaseRefund, OnReferralPurchase, OnPurchaseCancel, OnRemoveSocialActivity, OnPurchaseDiscount, OnSendPasswordToCheque, OnGoodsSetProcess, OnAttachEmail, OnBonusLifetimeActivation, OnPurchasePaymentCalculate, OnPurchasePaymentCancel, OnCouponPurchased, OnCouponRefunded, OnPurchaseDeposit, OnCardAttach, OnCardReplace, OnExternalCardReplace, OnPurchaseRefundCalculate, OnManualCharge, OnManualWithdraw, OnIteratorProcess, OnPersonStatusChange, OnGiftCertificateSale, OnGiftCertificatePayment, OnGiftCertificateRefund, OnGiftCertificatePaymentCancel, OnStatusSystemCalculation, OnBeginRegistration, OnCustomerAttributeUpdate, OnCustomerSubscriptionChange, OnCardSet, OnBlockCard, OnUnblockCard, OnDeleteCard, OnRecoverCard, MergeCustomersProfiles, OnCardCategoryChange, OnCustomerStateChange, LinkAccount]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список активностей.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BusinessEventsapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | С какого элемента брать.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько элементов брать.
val filterActivityDateFrom : kotlin.String = filterActivityDateFrom_example // kotlin.String | Дата создания с.
val filterActivityDateTo : kotlin.String = filterActivityDateTo_example // kotlin.String | Дата создания по.
val filterPersonId : kotlin.Int = 56 // kotlin.Int | Идентификатор пользователя.
val filterPurchaseId : kotlin.Int = 56 // kotlin.Int | Идентификатор покупки.
val filterContextType : BusinessActivityContextType =  // BusinessActivityContextType | Тип контекста.

val result : ResultModelOfPagedViewModelOfBusinessActivityViewModel = webService.businessEventsGetBusinessEvents(filterFrom, filterCount, filterActivityDateFrom, filterActivityDateTo, filterPersonId, filterPurchaseId, filterContextType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| С какого элемента брать. | [optional]
 **filterCount** | **kotlin.Int**| Сколько элементов брать. | [optional]
 **filterActivityDateFrom** | **kotlin.String**| Дата создания с. | [optional]
 **filterActivityDateTo** | **kotlin.String**| Дата создания по. | [optional]
 **filterPersonId** | **kotlin.Int**| Идентификатор пользователя. | [optional]
 **filterPurchaseId** | **kotlin.Int**| Идентификатор покупки. | [optional]
 **filterContextType** | **BusinessActivityContextType**| Тип контекста. | [optional] [enum: Unknown, DeviceRequest, ShowcasePurchase, UserDateTimeEvent, BonusLifeTimeEvent, ChangeNotifier, RegistrationEnd, LinkCard, ChangeCardState, SmsRegistration, QuestionnaireUpdate, ExternalCardReplace, PushDeviceRegistration, SendPasswordToCheque, PurchaseOperation, SocialNetworkAction, ManualPayOperation, ReferralActivity, UserDeregistration, PersonStatusChange, GiftCertificateOperation, StatusSystemCalculation, CustomerBeginRegistration, BatchClientImport, CustomerRegistration, LinkAccount]

### Return type

**ResultModelOfPagedViewModelOfBusinessActivityViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


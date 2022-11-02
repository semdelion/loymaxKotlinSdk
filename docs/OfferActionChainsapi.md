# OfferActionChainsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerActionChainsGetAvailableActionTypes**](OfferActionChainsapi.md#offerActionChainsGetAvailableActionTypes) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/AvailableActionTypes | Получает список доступных действий.
[**offerActionChainsGetAvailableEventTypes**](OfferActionChainsapi.md#offerActionChainsGetAvailableEventTypes) | **GET** v1.2/Offers/AvailableEventTypes | Получает список доступных событий.
[**offerActionChainsGetEventTypes**](OfferActionChainsapi.md#offerActionChainsGetEventTypes) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/eventTypes | Получает список имеющихся действий.
[**offerActionChainsGetOfferActionChain**](OfferActionChainsapi.md#offerActionChainsGetOfferActionChain) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId} | Получает цепочку событий.
[**offerActionChainsGetOfferActionChains**](OfferActionChainsapi.md#offerActionChainsGetOfferActionChains) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains | Получает все цепочки событий акции.
[**offerActionChainsGetParentActionIndex**](OfferActionChainsapi.md#offerActionChainsGetParentActionIndex) | **GET** v1.2/Offers/{offerId}/offerChains/parentActions/{actionId} | Получить информацию о родительском действии по идентификатору.



Получает список доступных действий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.
val eventType : OfferEventType =  // OfferEventType | Тип события.
val exclusionType : OfferEventType =  // OfferEventType | Тип события, по которому требуется отфильтровать типы действий.
val chainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки действий.

val result : ResultModelOfListOfActionTypeModel = webService.offerActionChainsGetAvailableActionTypes(offerId, offerVersion, eventType, exclusionType, chainId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |
 **eventType** | **OfferEventType**| Тип события. | [enum: OnPurchaseCalculate, OnAttachPhone, OnPurchaseConfirm, OnPurchasePayment, OnBalanceRequest, OnCardIssue, OnCardActivation, OnSocialActivity, OnSocialGroupJoin, OnFriendInvite, OnSocialGroupLeave, OnQuestionnaireUpdate, OnMobileAppInstall, OnEndPersonRegistration, OnSocialNetworkLink, OnBonusLifetimeExpired, OnBirthday, OnPurchaseRefund, OnReferralPurchase, OnPurchaseCancel, OnRemoveSocialActivity, OnPurchaseDiscount, OnSendPasswordToCheque, OnGoodsSetProcess, OnAttachEmail, OnBonusLifetimeActivation, OnPurchasePaymentCalculate, OnPurchasePaymentCancel, OnCouponPurchased, OnCouponRefunded, OnPurchaseDeposit, OnCardAttach, OnCardReplace, OnExternalCardReplace, OnPurchaseRefundCalculate, OnManualCharge, OnManualWithdraw, OnIteratorProcess, OnPersonStatusChange, OnGiftCertificateSale, OnGiftCertificatePayment, OnGiftCertificateRefund, OnGiftCertificatePaymentCancel, OnStatusSystemCalculation, OnBeginRegistration, OnCustomerAttributeUpdate, OnCustomerSubscriptionChange, OnCardSet, OnBlockCard, OnUnblockCard, OnDeleteCard, OnRecoverCard, MergeCustomersProfiles, OnCardCategoryChange, OnCustomerStateChange, LinkAccount]
 **exclusionType** | **OfferEventType**| Тип события, по которому требуется отфильтровать типы действий. | [optional] [enum: OnPurchaseCalculate, OnAttachPhone, OnPurchaseConfirm, OnPurchasePayment, OnBalanceRequest, OnCardIssue, OnCardActivation, OnSocialActivity, OnSocialGroupJoin, OnFriendInvite, OnSocialGroupLeave, OnQuestionnaireUpdate, OnMobileAppInstall, OnEndPersonRegistration, OnSocialNetworkLink, OnBonusLifetimeExpired, OnBirthday, OnPurchaseRefund, OnReferralPurchase, OnPurchaseCancel, OnRemoveSocialActivity, OnPurchaseDiscount, OnSendPasswordToCheque, OnGoodsSetProcess, OnAttachEmail, OnBonusLifetimeActivation, OnPurchasePaymentCalculate, OnPurchasePaymentCancel, OnCouponPurchased, OnCouponRefunded, OnPurchaseDeposit, OnCardAttach, OnCardReplace, OnExternalCardReplace, OnPurchaseRefundCalculate, OnManualCharge, OnManualWithdraw, OnIteratorProcess, OnPersonStatusChange, OnGiftCertificateSale, OnGiftCertificatePayment, OnGiftCertificateRefund, OnGiftCertificatePaymentCancel, OnStatusSystemCalculation, OnBeginRegistration, OnCustomerAttributeUpdate, OnCustomerSubscriptionChange, OnCardSet, OnBlockCard, OnUnblockCard, OnDeleteCard, OnRecoverCard, MergeCustomersProfiles, OnCardCategoryChange, OnCustomerStateChange, LinkAccount]
 **chainId** | **kotlin.Int**| Идентификатор цепочки действий. | [optional]

### Return type

**ResultModelOfListOfActionTypeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список доступных событий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val includeSubEvents : kotlin.Boolean = true // kotlin.Boolean | Если true вернутся все события без исключения.

val result : ResultModelOfListOfOfferEventModel = webService.offerActionChainsGetAvailableEventTypes(includeSubEvents)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubEvents** | **kotlin.Boolean**| Если true вернутся все события без исключения. | [optional]

### Return type

**ResultModelOfListOfOfferEventModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список имеющихся действий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfListOfOfferEventInfoModel = webService.offerActionChainsGetEventTypes(offerId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfListOfOfferEventInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает цепочку событий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerChainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки действий.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfOfferActionChainViewModel = webService.offerActionChainsGetOfferActionChain(offerId, offerChainId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerChainId** | **kotlin.Int**| Идентификатор цепочки действий. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfOfferActionChainViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает все цепочки событий акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.
val eventType : OfferEventType =  // OfferEventType | Тип события.
val parentId : kotlin.Int = 56 // kotlin.Int | Идентификатор родительского действия.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfOfferActionChainViewModel = webService.offerActionChainsGetOfferActionChains(offerId, offerVersion, eventType, parentId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |
 **eventType** | **OfferEventType**| Тип события. | [optional] [enum: OnPurchaseCalculate, OnAttachPhone, OnPurchaseConfirm, OnPurchasePayment, OnBalanceRequest, OnCardIssue, OnCardActivation, OnSocialActivity, OnSocialGroupJoin, OnFriendInvite, OnSocialGroupLeave, OnQuestionnaireUpdate, OnMobileAppInstall, OnEndPersonRegistration, OnSocialNetworkLink, OnBonusLifetimeExpired, OnBirthday, OnPurchaseRefund, OnReferralPurchase, OnPurchaseCancel, OnRemoveSocialActivity, OnPurchaseDiscount, OnSendPasswordToCheque, OnGoodsSetProcess, OnAttachEmail, OnBonusLifetimeActivation, OnPurchasePaymentCalculate, OnPurchasePaymentCancel, OnCouponPurchased, OnCouponRefunded, OnPurchaseDeposit, OnCardAttach, OnCardReplace, OnExternalCardReplace, OnPurchaseRefundCalculate, OnManualCharge, OnManualWithdraw, OnIteratorProcess, OnPersonStatusChange, OnGiftCertificateSale, OnGiftCertificatePayment, OnGiftCertificateRefund, OnGiftCertificatePaymentCancel, OnStatusSystemCalculation, OnBeginRegistration, OnCustomerAttributeUpdate, OnCustomerSubscriptionChange, OnCardSet, OnBlockCard, OnUnblockCard, OnDeleteCard, OnRecoverCard, MergeCustomersProfiles, OnCardCategoryChange, OnCustomerStateChange, LinkAccount]
 **parentId** | **kotlin.Int**| Идентификатор родительского действия. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferActionChainViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию о родительском действии по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainsapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val actionId : kotlin.Int = 56 // kotlin.Int | Идентификатор действия.

val result : ResultModelOfActionPlacementInfo = webService.offerActionChainsGetParentActionIndex(offerId, actionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **actionId** | **kotlin.Int**| Идентификатор действия. |

### Return type

**ResultModelOfActionPlacementInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


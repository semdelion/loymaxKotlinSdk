# SubscriptionTypeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionTypeGet**](SubscriptionTypeapi.md#subscriptionTypeGet) | **GET** v1.2/SubscriptionTypes/{id} | Возвращает тип подписки.
[**subscriptionTypeGetAll**](SubscriptionTypeapi.md#subscriptionTypeGetAll) | **GET** v1.2/SubscriptionTypes | Возвращает список всех типов подписок.
[**subscriptionTypeGetAvailableSubscriptionTypes**](SubscriptionTypeapi.md#subscriptionTypeGetAvailableSubscriptionTypes) | **GET** v1.2/SubscriptionTypes/availableSubscriptionTypes | Возвращает список доступных типов подписки.



Возвращает тип подписки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SubscriptionTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Индификатор типа подписки.

val result : ResultModelOfSystemApiSubscriptionTypeViewModel = webService.subscriptionTypeGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Индификатор типа подписки. |

### Return type

**ResultModelOfSystemApiSubscriptionTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех типов подписок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SubscriptionTypeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSearchedText : kotlin.String = filterSearchedText_example // kotlin.String | Текст поиска.
val filterSubscriptionType : MailingSubscriptionType =  // MailingSubscriptionType | Тип подписки.
val filterNotificationGatewayType : NotificationGatewayType =  // NotificationGatewayType | Тип канала.

val result : ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel = webService.subscriptionTypeGetAll(from, count, filterSearchedText, filterSubscriptionType, filterNotificationGatewayType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterSearchedText** | **kotlin.String**| Текст поиска. | [optional]
 **filterSubscriptionType** | **MailingSubscriptionType**| Тип подписки. | [optional] [enum: Cashback, Payment, Refill, Offer, System, Mailing, Refund, DeviceEmulation]
 **filterNotificationGatewayType** | **NotificationGatewayType**| Тип канала. | [optional] [enum: Sms, Email, Push, Viber, SocialsNetworks, ChatBot]

### Return type

**ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список доступных типов подписки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SubscriptionTypeapi::class.java)

val result : ResultModelOfListOfMailingSubscriptionType = webService.subscriptionTypeGetAvailableSubscriptionTypes()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfMailingSubscriptionType**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


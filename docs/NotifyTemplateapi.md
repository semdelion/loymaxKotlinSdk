# NotifyTemplateapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notifyTemplateGetAvailableSubscriptionTypes**](NotifyTemplateapi.md#notifyTemplateGetAvailableSubscriptionTypes) | **GET** v1.2/notifyTemplates/availableSubscriptionTypes | Возвращает список доступных типов подписки.
[**notifyTemplateGetNotifyTemplate**](NotifyTemplateapi.md#notifyTemplateGetNotifyTemplate) | **GET** v1.2/notifyTemplates/{id} | Возвращает шаблон уведомлений по его ID.
[**notifyTemplateGetNotifyTemplates**](NotifyTemplateapi.md#notifyTemplateGetNotifyTemplates) | **GET** v1.2/notifyTemplates | Возвращает список шаблонов уведомлений.
[**notifyTemplateRestoreNotifyTemplate**](NotifyTemplateapi.md#notifyTemplateRestoreNotifyTemplate) | **POST** v1.2/notifyTemplates/{id}/restore | Восстановление удаленного шаблона уведомлений.



Возвращает список доступных типов подписки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotifyTemplateapi::class.java)

val result : ResultModelOfListOfMailingSubscriptionType = webService.notifyTemplateGetAvailableSubscriptionTypes()
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


Возвращает шаблон уведомлений по его ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotifyTemplateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | ID шаблона уведомлений.

val result : ResultModelOfNotifyTemplateViewModel = webService.notifyTemplateGetNotifyTemplate(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| ID шаблона уведомлений. |

### Return type

**ResultModelOfNotifyTemplateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список шаблонов уведомлений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotifyTemplateapi::class.java)
val requestModelFrom : kotlin.Int = 56 // kotlin.Int | С какого.
val requestModelCount : kotlin.Int = 56 // kotlin.Int | Сколько.
val requestModelTemplateType : TemplateType =  // TemplateType | Тип шаблона уведомлений.
val requestModelLogicalNameSubStr : kotlin.String = requestModelLogicalNameSubStr_example // kotlin.String | Подстрока логического имени шаблона.
val requestModelTextSubStr : kotlin.String = requestModelTextSubStr_example // kotlin.String | Подстрока текстового описания шаблона.
val requestModelSubscriptionType : MailingSubscriptionType =  // MailingSubscriptionType | Тип подписки.
val requestModelShowMode : ArchivedState =  // ArchivedState | Режим отображения архивных шаблонов.

val result : ResultModelOfPagedViewModelOfNotifyTemplateViewModel = webService.notifyTemplateGetNotifyTemplates(requestModelFrom, requestModelCount, requestModelTemplateType, requestModelLogicalNameSubStr, requestModelTextSubStr, requestModelSubscriptionType, requestModelShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestModelFrom** | **kotlin.Int**| С какого. | [optional]
 **requestModelCount** | **kotlin.Int**| Сколько. | [optional]
 **requestModelTemplateType** | **TemplateType**| Тип шаблона уведомлений. | [optional] [enum: HeaderAndText, Push, Simple, Messenger, SocialNetworks, ChatBot]
 **requestModelLogicalNameSubStr** | **kotlin.String**| Подстрока логического имени шаблона. | [optional]
 **requestModelTextSubStr** | **kotlin.String**| Подстрока текстового описания шаблона. | [optional]
 **requestModelSubscriptionType** | **MailingSubscriptionType**| Тип подписки. | [optional] [enum: Cashback, Payment, Refill, Offer, System, Mailing, Refund, DeviceEmulation]
 **requestModelShowMode** | **ArchivedState**| Режим отображения архивных шаблонов. | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfNotifyTemplateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление удаленного шаблона уведомлений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(NotifyTemplateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | ID шаблона уведомлений.

val result : ResultModel = webService.notifyTemplateRestoreNotifyTemplate(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| ID шаблона уведомлений. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Messageapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messageGetChatBotMessage**](Messageapi.md#messageGetChatBotMessage) | **GET** v1.2/messages/chatBot/{chatBotId} | Получает chatBot сообщение.
[**messageGetChatBotMessages**](Messageapi.md#messageGetChatBotMessages) | **GET** v1.2/messages/chatBot | Получает список chatbot сообщений.
[**messageGetMailMessage**](Messageapi.md#messageGetMailMessage) | **GET** v1.2/messages/mail/{mailId} | Получает информацию о mail сообщении.
[**messageGetMailMessages**](Messageapi.md#messageGetMailMessages) | **GET** v1.2/messages/mail | Получает список отправленных mail сообщений.
[**messageGetMessagesNotifiers**](Messageapi.md#messageGetMessagesNotifiers) | **GET** v1.2/messages/notifiers | Получает нотификаторы из сообщений.
[**messageGetPushMessage**](Messageapi.md#messageGetPushMessage) | **GET** v1.2/messages/push/{pushId} | Получает push сообщение.
[**messageGetPushMessages**](Messageapi.md#messageGetPushMessages) | **GET** v1.2/messages/push | Получает список push сообщений.
[**messageGetSmsMessage**](Messageapi.md#messageGetSmsMessage) | **GET** v1.2/messages/sms/{smsId} | Получает информацию о sms сообщении.
[**messageGetSmsMessages**](Messageapi.md#messageGetSmsMessages) | **GET** v1.2/messages/sms | Получает список отправленных смс сообщений.
[**messageGetSocialNetworksMessage**](Messageapi.md#messageGetSocialNetworksMessage) | **GET** v1.2/messages/socialNetworks/{socialNetworksId} | Получает socialNetwork сообщение.
[**messageGetSocialNetworksMessages**](Messageapi.md#messageGetSocialNetworksMessages) | **GET** v1.2/messages/socialNetworks | Получает список socialNetworks сообщений.
[**messageGetViberMessage**](Messageapi.md#messageGetViberMessage) | **GET** v1.2/messages/viber/{viberId} | Получает viber сообщение.
[**messageGetViberMessages**](Messageapi.md#messageGetViberMessages) | **GET** v1.2/messages/viber | Получает список viber сообщений.



Получает chatBot сообщение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val chatBotId : kotlin.Long = 789 // kotlin.Long | Идентификатор.

val result : ResultModelOfChatBotMessageViewModel = webService.messageGetChatBotMessage(chatBotId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatBotId** | **kotlin.Long**| Идентификатор. |

### Return type

**ResultModelOfChatBotMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список chatbot сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPhone : kotlin.String = filterPhone_example // kotlin.String | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfChatBotMessageViewModel = webService.messageGetChatBotMessages(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPhone** | **kotlin.String**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfChatBotMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает информацию о mail сообщении.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val mailId : kotlin.Long = 789 // kotlin.Long | Идентификатор mail сообщения.

val result : ResultModelOfMailMessageViewModel = webService.messageGetMailMessage(mailId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailId** | **kotlin.Long**| Идентификатор mail сообщения. |

### Return type

**ResultModelOfMailMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список отправленных mail сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterToEmail : kotlin.String = filterToEmail_example // kotlin.String | 
val filterHeader : kotlin.String = filterHeader_example // kotlin.String | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfMailMessageViewModel = webService.messageGetMailMessages(from, count, filterDateFrom, filterDateTo, filterToEmail, filterHeader, filterState, filterPersonUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterToEmail** | **kotlin.String**|  | [optional]
 **filterHeader** | **kotlin.String**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfMailMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает нотификаторы из сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val messagesNotifiersFilterPersonUid : kotlin.String = messagesNotifiersFilterPersonUid_example // kotlin.String | Гуид пользователя.
val messagesNotifiersFilterNotifyType : NotifyType =  // NotifyType | Тип нотификатора.
val messagesNotifiersFilterSubstring : kotlin.String = messagesNotifiersFilterSubstring_example // kotlin.String | Подстрока для поиска.

val result : ResultModelOfListOfString = webService.messageGetMessagesNotifiers(messagesNotifiersFilterPersonUid, messagesNotifiersFilterNotifyType, messagesNotifiersFilterSubstring)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messagesNotifiersFilterPersonUid** | **kotlin.String**| Гуид пользователя. | [optional]
 **messagesNotifiersFilterNotifyType** | **NotifyType**| Тип нотификатора. | [optional] [enum: Direct, Sms, Email, Push, Viber, SocialNetworks, ChatBot]
 **messagesNotifiersFilterSubstring** | **kotlin.String**| Подстрока для поиска. | [optional]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает push сообщение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val pushId : kotlin.Long = 789 // kotlin.Long | Идентификатор.

val result : ResultModelOfPushMessageViewModel = webService.messageGetPushMessage(pushId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pushId** | **kotlin.Long**| Идентификатор. |

### Return type

**ResultModelOfPushMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список push сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPlatformType : kotlin.collections.MutableList<PlatformType> =  // kotlin.collections.MutableList<PlatformType> | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 
val filterHeader : kotlin.String = filterHeader_example // kotlin.String | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfPushMessageViewModel = webService.messageGetPushMessages(from, count, filterDateFrom, filterDateTo, filterPlatformType, filterState, filterHeader, filterPersonUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPlatformType** | **kotlin.collections.MutableList&lt;PlatformType&gt;**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]
 **filterHeader** | **kotlin.String**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfPushMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает информацию о sms сообщении.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val smsId : kotlin.Long = 789 // kotlin.Long | Идентификатор sms сообщения.

val result : ResultModelOfSmsMessageViewModel = webService.messageGetSmsMessage(smsId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsId** | **kotlin.Long**| Идентификатор sms сообщения. |

### Return type

**ResultModelOfSmsMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список отправленных смс сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPhone : kotlin.String = filterPhone_example // kotlin.String | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 

val result : ResultModelOfPagedViewModelOfSmsMessageViewModel = webService.messageGetSmsMessages(from, count, filterDateFrom, filterDateTo, filterPhone, filterPersonUid, filterState)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPhone** | **kotlin.String**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfSmsMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает socialNetwork сообщение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val socialNetworksId : kotlin.Long = 789 // kotlin.Long | Идентификатор.

val result : ResultModelOfSocialNetworksMessageViewModel = webService.messageGetSocialNetworksMessage(socialNetworksId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **socialNetworksId** | **kotlin.Long**| Идентификатор. |

### Return type

**ResultModelOfSocialNetworksMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список socialNetworks сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPhone : kotlin.String = filterPhone_example // kotlin.String | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel = webService.messageGetSocialNetworksMessages(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPhone** | **kotlin.String**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает viber сообщение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val viberId : kotlin.Long = 789 // kotlin.Long | Идентификатор.

val result : ResultModelOfViberMessageViewModel = webService.messageGetViberMessage(viberId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viberId** | **kotlin.Long**| Идентификатор. |

### Return type

**ResultModelOfViberMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список viber сообщений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Messageapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPhone : kotlin.String = filterPhone_example // kotlin.String | 
val filterState : kotlin.collections.MutableList<NotificationMessageState> =  // kotlin.collections.MutableList<NotificationMessageState> | 
val filterPersonUid : kotlin.String = filterPersonUid_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfViberMessageViewModel = webService.messageGetViberMessages(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPhone** | **kotlin.String**|  | [optional]
 **filterState** | **kotlin.collections.MutableList&lt;NotificationMessageState&gt;**|  | [optional]
 **filterPersonUid** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfViberMessageViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


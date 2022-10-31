# Mailingapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mailingGateways**](Mailingapi.md#mailingGateways) | **GET** v1.2/mailings/{mailingId}/gateways | Возвращает доступные шлюза рассылки.
[**mailingGet**](Mailingapi.md#mailingGet) | **GET** v1.2/mailings/{mailingId} | Возвращает модель рассылки.
[**mailingGetMailings**](Mailingapi.md#mailingGetMailings) | **GET** v1.2/mailings | Получить список рассылок.
[**mailingPhones**](Mailingapi.md#mailingPhones) | **GET** v1.2/mailings/{mailingId}/phones | Возвращает модель загруженных номеров телефонов в рассылку.
[**mailingRun**](Mailingapi.md#mailingRun) | **POST** v1.2/mailings/{mailingId}/run | Запускает рассылку.
[**mailingSendTest**](Mailingapi.md#mailingSendTest) | **POST** v1.2/mailings/{mailingId}/sendTest | Отправляет тестовое сообщение.



Возвращает доступные шлюза рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.

val result : ResultModelOfListOfMailingGatewayViewModel = webService.mailingGateways(mailingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |

### Return type

**ResultModelOfListOfMailingGatewayViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает модель рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.

val result : ResultModelOfMailingViewModel = webService.mailingGet(mailingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |

### Return type

**ResultModelOfMailingViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список рассылок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата С.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата По.
val filterFrom : kotlin.Int = 56 // kotlin.Int | С какого элемента брать.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько элементов брать.
val filterCreatorIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список id создателей акций для фильтрации.
val filterName : kotlin.String = filterName_example // kotlin.String | Название.
val filterMailingType : MailingWaySendType =  // MailingWaySendType | Тип рассылки.
val filterMarketingCampaignId : kotlin.Int = 56 // kotlin.Int | ID маркетинговой кампании.
val filterSortByAttachDate : kotlin.Boolean = true // kotlin.Boolean | Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления.
val filterLoyaltyProgramIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы программ лояльности.

val result : ResultModelOfPagedViewModelOfMailingBriefViewModel = webService.mailingGetMailings(filterFromDate, filterToDate, filterFrom, filterCount, filterCreatorIds, filterName, filterMailingType, filterMarketingCampaignId, filterSortByAttachDate, filterLoyaltyProgramIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFromDate** | **kotlin.String**| Дата С. | [optional]
 **filterToDate** | **kotlin.String**| Дата По. | [optional]
 **filterFrom** | **kotlin.Int**| С какого элемента брать. | [optional]
 **filterCount** | **kotlin.Int**| Сколько элементов брать. | [optional]
 **filterCreatorIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список id создателей акций для фильтрации. | [optional]
 **filterName** | **kotlin.String**| Название. | [optional]
 **filterMailingType** | **MailingWaySendType**| Тип рассылки. | [optional] [enum: Mail, Sms, Push, Viber, SocialNetworks, ChatBot]
 **filterMarketingCampaignId** | **kotlin.Int**| ID маркетинговой кампании. | [optional]
 **filterSortByAttachDate** | **kotlin.Boolean**| Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления. | [optional]
 **filterLoyaltyProgramIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы программ лояльности. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMailingBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает модель загруженных номеров телефонов в рассылку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.

val result : ResultModelOfMailingPhonesViewModel = webService.mailingPhones(mailingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |

### Return type

**ResultModelOfMailingPhonesViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает рассылку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.
val model : MailingRunViewModel =  // MailingRunViewModel | Дата и время запуска рассылки.

val result : ResultModelOfMailingViewModel = webService.mailingRun(mailingId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |
 **model** | **MailingRunViewModel**| Дата и время запуска рассылки. |

### Return type

**ResultModelOfMailingViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправляет тестовое сообщение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Mailingapi::class.java)
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.
val model : MailingTestsModel =  // MailingTestsModel | Модель тестовой рассылки.

val result : ResultModel = webService.mailingSendTest(mailingId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |
 **model** | **MailingTestsModel**| Модель тестовой рассылки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


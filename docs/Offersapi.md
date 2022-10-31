# Offersapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offersAcceptOfferChanges**](Offersapi.md#offersAcceptOfferChanges) | **POST** v1.2/offers/AcceptChanges | Применить изменения акции.
[**offersDeleteOffer**](Offersapi.md#offersDeleteOffer) | **POST** v1.2/offers/DeleteOffer | Удаляет акцию.
[**offersEditOffer**](Offersapi.md#offersEditOffer) | **POST** v1.2/offers/EditOffer | Редактирует акцию.
[**offersGetAvailableCreators**](Offersapi.md#offersGetAvailableCreators) | **GET** v1.2/offers/AvailableCreators | Возвращает список пользователей, имеющих право создавать акции.
[**offersGetAvailablePartners**](Offersapi.md#offersGetAvailablePartners) | **GET** v1.2/offers/AvailablePartners | Возвращает список Партнеров.
[**offersGetOffer**](Offersapi.md#offersGetOffer) | **GET** v1.2/offers/{offerId}/versions/{offerVersion} | Возвращает информацию об акции (по идентификатору версии).
[**offersGetOfferInfo**](Offersapi.md#offersGetOfferInfo) | **GET** v1.2/offers/OfferInfo | Возвращает информацию об акции.
[**offersGetOfferPartners**](Offersapi.md#offersGetOfferPartners) | **GET** v1.2/offers/OfferPartners | Возвращает список Партнеров, для которых доступна акция.
[**offersGetOfferPeriod**](Offersapi.md#offersGetOfferPeriod) | **GET** v1.2/offers/{offerId}/versions/{offerVersion}/period | Получает вермя действия акции.
[**offersGetOfferPriority**](Offersapi.md#offersGetOfferPriority) | **GET** v1.2/offers/{offerId}/versions/{offerVersion}/priority | Получить приоритет акции.
[**offersGetOfferRules**](Offersapi.md#offersGetOfferRules) | **GET** v1.2/offers/OfferRules | Возвращает список правил акции.
[**offersGetOffers**](Offersapi.md#offersGetOffers) | **GET** v1.2/offers | Возвращает список акций.
[**offersGetOffersCount**](Offersapi.md#offersGetOffersCount) | **GET** v1.2/offers/count | Возвращает количество акций и правил.
[**offersGetRoundingSteps**](Offersapi.md#offersGetRoundingSteps) | **GET** v1.2/offers/RoundingSteps | Получить актуальные шаги округления.
[**offersPostOffersByOfferIdRelatedPartners**](Offersapi.md#offersPostOffersByOfferIdRelatedPartners) | **POST** v1.2/offers/{offerId}/relatedPartners | 
[**offersRejectChanges**](Offersapi.md#offersRejectChanges) | **POST** v1.2/offers/RejectChanges | Отклонение принятых ранее изменений акции.
[**offersResetChanges**](Offersapi.md#offersResetChanges) | **POST** v1.2/offers/ResetChanges | Удаление черновика акции.
[**offersRestoreOffer**](Offersapi.md#offersRestoreOffer) | **POST** v1.2/offers/RestoreOffer | Востановить акцию.
[**offersSaveChanges**](Offersapi.md#offersSaveChanges) | **POST** v1.2/offers/SaveChanges | Сохраняет изменения в акции.
[**offersSendToApproval**](Offersapi.md#offersSendToApproval) | **POST** v1.2/offers/SendToApproval | Отправить акцию на согласование.
[**offersStartOffer**](Offersapi.md#offersStartOffer) | **POST** v1.2/offers/StartOffer | Запускает акцию.
[**offersStopOffer**](Offersapi.md#offersStopOffer) | **POST** v1.2/offers/StopOffer | Остановливает акцию.
[**offersUpdateMarketingCampaign**](Offersapi.md#offersUpdateMarketingCampaign) | **POST** v1.2/offers/{offerId}/marketingCampaign | Обновляет маркетинговую кампанию.
[**offersUpdateOfferCategory**](Offersapi.md#offersUpdateOfferCategory) | **POST** v1.2/offers/{offerId}/categories | Изменяет категорию акции.



Применить изменения акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val acceptOfferChangesModel : AcceptOfferChangesModel =  // AcceptOfferChangesModel | Модель применения изменений для акции.

val result : ResultModel = webService.offersAcceptOfferChanges(acceptOfferChangesModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptOfferChangesModel** | **AcceptOfferChangesModel**| Модель применения изменений для акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет акцию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerModel : EditOfferModelBase =  // EditOfferModelBase | Модель акции.

val result : ResultModel = webService.offersDeleteOffer(offerModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerModel** | **EditOfferModelBase**| Модель акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Редактирует акцию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerModel : EditOfferModel =  // EditOfferModel | Модель редактирования акции.

val result : ResultModelOfInt32 = webService.offersEditOffer(offerModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerModel** | **EditOfferModel**| Модель редактирования акции. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список пользователей, имеющих право создавать акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)

val result : ResultModelOfListOfCreatorModel = webService.offersGetAvailableCreators()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCreatorModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список Партнеров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val viewMode : OfferViewMode =  // OfferViewMode | Доступный режим работы с акциями.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по названию.

val result : ResultModelOfPagedViewModelOfPartnerModel = webService.offersGetAvailablePartners(viewMode, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewMode** | **OfferViewMode**| Доступный режим работы с акциями. | [enum: View, Edit]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **name** | **kotlin.String**| Подстрока для поиска по названию. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPartnerModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об акции (по идентификатору версии).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Идентификатор версии акции.

val result : ResultModelOfCommunicationOfferInfoModel = webService.offersGetOffer(offerId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |
 **offerVersion** | **kotlin.String**| Идентификатор версии акции. |

### Return type

**ResultModelOfCommunicationOfferInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.

val result : ResultModelOfOfferBriefModel = webService.offersGetOfferInfo(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |

### Return type

**ResultModelOfOfferBriefModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список Партнеров, для которых доступна акция.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.

val result : ResultModelOfListOfPartnerModel = webService.offersGetOfferPartners(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |

### Return type

**ResultModelOfListOfPartnerModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает вермя действия акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfOfferPeriodModel = webService.offersGetOfferPeriod(offerId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfOfferPeriodModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить приоритет акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfInt32 = webService.offersGetOfferPriority(offerId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список правил акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.

val result : ResultModelOfListOfOfferRuleModel = webService.offersGetOfferRules(offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |

### Return type

**ResultModelOfListOfOfferRuleModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по названию акции.
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Внутренние идентификаторы торговых точек через запятую, для которых созданы акции.
val creatorIds : kotlin.String = creatorIds_example // kotlin.String | Внутренние идентификаторы пользователей через запятую, создавших акции.
val viewStates : kotlin.collections.MutableList<OfferViewState> =  // kotlin.collections.MutableList<OfferViewState> | Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие).
val sortColumn : OfferSortColumn =  // OfferSortColumn | Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования.
val direction : kotlin.Boolean = true // kotlin.Boolean | Направление сортировки (true - по возрастанию, false - по убыванию).
val states : kotlin.collections.MutableList<OfferState> =  // kotlin.collections.MutableList<OfferState> | Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве).
val partnerIds : kotlin.String = partnerIds_example // kotlin.String | Внутренние идентификаторы Партнеров через запятую, для которых созданы акции.
val categoryIds : kotlin.String = categoryIds_example // kotlin.String | Внутренние идентификаторы категорий акций через запятую.
val priorityLowerBound : kotlin.Int = 56 // kotlin.Int | Нижняя граница приоритета акций.
val priorityUpperBound : kotlin.Int = 56 // kotlin.Int | Верхняя граница приоритета акций.
val marketingCampaignId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции.
val includeMarketingCampaignId : kotlin.Boolean = true // kotlin.Boolean | Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать).
val loyaltyProgramIds : kotlin.String = loyaltyProgramIds_example // kotlin.String | Внутренние идентификаторы Программ лояльности через запятую.
val excludeMarketingCampaign : kotlin.Boolean = true // kotlin.Boolean | Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать).

val result : ResultModelOfOffersBriefModel = webService.offersGetOffers(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **toDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **name** | **kotlin.String**| Подстрока для поиска по названию акции. | [optional]
 **merchantIds** | **kotlin.String**| Внутренние идентификаторы торговых точек через запятую, для которых созданы акции. | [optional]
 **creatorIds** | **kotlin.String**| Внутренние идентификаторы пользователей через запятую, создавших акции. | [optional]
 **viewStates** | **kotlin.collections.MutableList&lt;OfferViewState&gt;**| Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие). | [optional]
 **sortColumn** | **OfferSortColumn**| Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования. | [optional] [enum: Priority, Name, BeginTime, EndTime, State, AttachDate, CreationDate, ChangeDate]
 **direction** | **kotlin.Boolean**| Направление сортировки (true - по возрастанию, false - по убыванию). | [optional]
 **states** | **kotlin.collections.MutableList&lt;OfferState&gt;**| Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). | [optional]
 **partnerIds** | **kotlin.String**| Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. | [optional]
 **categoryIds** | **kotlin.String**| Внутренние идентификаторы категорий акций через запятую. | [optional]
 **priorityLowerBound** | **kotlin.Int**| Нижняя граница приоритета акций. | [optional]
 **priorityUpperBound** | **kotlin.Int**| Верхняя граница приоритета акций. | [optional]
 **marketingCampaignId** | **kotlin.Int**| Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. | [optional]
 **includeMarketingCampaignId** | **kotlin.Boolean**| Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). | [optional]
 **loyaltyProgramIds** | **kotlin.String**| Внутренние идентификаторы Программ лояльности через запятую. | [optional]
 **excludeMarketingCampaign** | **kotlin.Boolean**| Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). | [optional]

### Return type

**ResultModelOfOffersBriefModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает количество акций и правил.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по названию акции.
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Внутренние идентификаторы торговых точек через запятую, для которых созданы акции.
val creatorIds : kotlin.String = creatorIds_example // kotlin.String | Внутренние идентификаторы пользователей через запятую, создавших акции.
val viewStates : kotlin.collections.MutableList<OfferViewState> =  // kotlin.collections.MutableList<OfferViewState> | Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие).
val sortColumn : OfferSortColumn =  // OfferSortColumn | Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования.
val direction : kotlin.Boolean = true // kotlin.Boolean | Направление сортировки (true - по возрастанию, false - по убыванию).
val states : kotlin.collections.MutableList<OfferState> =  // kotlin.collections.MutableList<OfferState> | Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве).
val partnerIds : kotlin.String = partnerIds_example // kotlin.String | Внутренние идентификаторы Партнеров через запятую, для которых созданы акции.
val categoryIds : kotlin.String = categoryIds_example // kotlin.String | Внутренние идентификаторы категорий акций через запятую.
val priorityLowerBound : kotlin.Int = 56 // kotlin.Int | Нижняя граница приоритета акций.
val priorityUpperBound : kotlin.Int = 56 // kotlin.Int | Верхняя граница приоритета акций.
val marketingCampaignId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции.
val includeMarketingCampaignId : kotlin.Boolean = true // kotlin.Boolean | Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать).
val loyaltyProgramIds : kotlin.String = loyaltyProgramIds_example // kotlin.String | Внутренние идентификаторы Программ лояльности через запятую.
val excludeMarketingCampaign : kotlin.Boolean = true // kotlin.Boolean | Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать).

val result : ResultModelOfOffersCountModel = webService.offersGetOffersCount(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **toDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **name** | **kotlin.String**| Подстрока для поиска по названию акции. | [optional]
 **merchantIds** | **kotlin.String**| Внутренние идентификаторы торговых точек через запятую, для которых созданы акции. | [optional]
 **creatorIds** | **kotlin.String**| Внутренние идентификаторы пользователей через запятую, создавших акции. | [optional]
 **viewStates** | **kotlin.collections.MutableList&lt;OfferViewState&gt;**| Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие). | [optional]
 **sortColumn** | **OfferSortColumn**| Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования. | [optional] [enum: Priority, Name, BeginTime, EndTime, State, AttachDate, CreationDate, ChangeDate]
 **direction** | **kotlin.Boolean**| Направление сортировки (true - по возрастанию, false - по убыванию). | [optional]
 **states** | **kotlin.collections.MutableList&lt;OfferState&gt;**| Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). | [optional]
 **partnerIds** | **kotlin.String**| Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. | [optional]
 **categoryIds** | **kotlin.String**| Внутренние идентификаторы категорий акций через запятую. | [optional]
 **priorityLowerBound** | **kotlin.Int**| Нижняя граница приоритета акций. | [optional]
 **priorityUpperBound** | **kotlin.Int**| Верхняя граница приоритета акций. | [optional]
 **marketingCampaignId** | **kotlin.Int**| Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. | [optional]
 **includeMarketingCampaignId** | **kotlin.Boolean**| Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). | [optional]
 **loyaltyProgramIds** | **kotlin.String**| Внутренние идентификаторы Программ лояльности через запятую. | [optional]
 **excludeMarketingCampaign** | **kotlin.Boolean**| Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). | [optional]

### Return type

**ResultModelOfOffersCountModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить актуальные шаги округления.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)

val result : ResultModelOfListOfInt32 = webService.offersGetRoundingSteps()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | 
val partnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModel = webService.offersPostOffersByOfferIdRelatedPartners(offerId, partnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**|  |
 **partnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отклонение принятых ранее изменений акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val rejectOfferChangesModel : RejectOfferChangesModel =  // RejectOfferChangesModel | Модель отклонения изменений.

val result : ResultModel = webService.offersRejectChanges(rejectOfferChangesModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rejectOfferChangesModel** | **RejectOfferChangesModel**| Модель отклонения изменений. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаление черновика акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerModel : EditOfferModelBase =  // EditOfferModelBase | Модель акции.

val result : ResultModel = webService.offersResetChanges(offerModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerModel** | **EditOfferModelBase**| Модель акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Востановить акцию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerModel : EditOfferModelBase =  // EditOfferModelBase | Модель акции.

val result : ResultModel = webService.offersRestoreOffer(offerModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerModel** | **EditOfferModelBase**| Модель акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Сохраняет изменения в акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val modelBase : EditOfferModelBase =  // EditOfferModelBase | Модель с внутренним идентификатором акции.

val result : ResultModel = webService.offersSaveChanges(modelBase)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelBase** | **EditOfferModelBase**| Модель с внутренним идентификатором акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправить акцию на согласование.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val sendOfferToApprovalModel : SendOfferToApprovalModel =  // SendOfferToApprovalModel | Модель отправки акции на согласование.

val result : ResultModel = webService.offersSendToApproval(sendOfferToApprovalModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendOfferToApprovalModel** | **SendOfferToApprovalModel**| Модель отправки акции на согласование. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает акцию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val editOfferModelBase : EditOfferModelBase =  // EditOfferModelBase | Модель акции.

val result : ResultModel = webService.offersStartOffer(editOfferModelBase)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **editOfferModelBase** | **EditOfferModelBase**| Модель акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Остановливает акцию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val editOfferModelBase : EditOfferModelBase =  // EditOfferModelBase | Модель акции.

val result : ResultModel = webService.offersStopOffer(editOfferModelBase)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **editOfferModelBase** | **EditOfferModelBase**| Модель акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет маркетинговую кампанию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.
val marketingCampaignId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор маркетинговой кампании.

val result : ResultModel = webService.offersUpdateMarketingCampaign(offerId, marketingCampaignId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |
 **marketingCampaignId** | **kotlin.Int**| Внутренний идентификатор маркетинговой кампании. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Изменяет категорию акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offersapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.
val offerCategoryId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор новой категории акции.

val result : ResultModel = webService.offersUpdateOfferCategory(offerId, offerCategoryId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |
 **offerCategoryId** | **kotlin.Int**| Внутренний идентификатор новой категории акции. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


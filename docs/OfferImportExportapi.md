# OfferImportExportapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerImportExportCopyOffer**](OfferImportExportapi.md#offerImportExportCopyOffer) | **POST** v1.2/Offers/{offerId}/Copy | Копировать акцию по Id.
[**offerImportExportExportOfferAsJson**](OfferImportExportapi.md#offerImportExportExportOfferAsJson) | **GET** v1.2/Offers/{offerId}/Export/Json | Экспортировать акцию по Id в формате json.
[**offerImportExportExportOfferAsXml**](OfferImportExportapi.md#offerImportExportExportOfferAsXml) | **GET** v1.2/Offers/{offerId}/Export/Xml | Экспортировать акцию по Id в формате xml.
[**offerImportExportGetOffersAsJson**](OfferImportExportapi.md#offerImportExportGetOffersAsJson) | **GET** v1.2/Offers/Export/Json | Экспортировать все акции в формате json.
[**offerImportExportGetOffersAsXml**](OfferImportExportapi.md#offerImportExportGetOffersAsXml) | **GET** v1.2/Offers/Export/Xml | Экспортировать все акции в формате xml.
[**offerImportExportPostOffers**](OfferImportExportapi.md#offerImportExportPostOffers) | **POST** v1.2/Offers/Import | Импортировать акции.



Копировать акцию по Id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Id акции.
val createOfferModel : CreateOfferModel =  // CreateOfferModel | Модель для создания акции.
val versionId : kotlin.Int = 56 // kotlin.Int | Id версии. Если пусто, то последняя подтверждённая.

val result : ResultModelOfInt32 = webService.offerImportExportCopyOffer(offerId, createOfferModel, versionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Id акции. |
 **createOfferModel** | **CreateOfferModel**| Модель для создания акции. |
 **versionId** | **kotlin.Int**| Id версии. Если пусто, то последняя подтверждённая. | [optional]

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать акцию по Id в формате json.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Id акции.
val versionId : kotlin.Int = 56 // kotlin.Int | Id версии. Если пусто, то последняя подтверждённая.

val result : kotlin.String = webService.offerImportExportExportOfferAsJson(offerId, versionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Id акции. |
 **versionId** | **kotlin.Int**| Id версии. Если пусто, то последняя подтверждённая. | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать акцию по Id в формате xml.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Id акции.
val versionId : kotlin.Int = 56 // kotlin.Int | Id версии. Если пусто, то последняя подтверждённая.

val result : kotlin.String = webService.offerImportExportExportOfferAsXml(offerId, versionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Id акции. |
 **versionId** | **kotlin.Int**| Id версии. Если пусто, то последняя подтверждённая. | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать все акции в формате json.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
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

val result : kotlin.String = webService.offerImportExportGetOffersAsJson(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign)
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

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать все акции в формате xml.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
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

val result : kotlin.String = webService.offerImportExportGetOffersAsXml(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign)
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

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Импортировать акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferImportExportapi::class.java)
val importModel : OffersImportModel =  // OffersImportModel | Модель импортируемых акций.
val cancelDrafts : kotlin.Boolean = true // kotlin.Boolean | Отклонять ли черновики при импорте существующих акций.

val result : ResultModelOfOffersImportResponse = webService.offerImportExportPostOffers(importModel, cancelDrafts)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importModel** | **OffersImportModel**| Модель импортируемых акций. |
 **cancelDrafts** | **kotlin.Boolean**| Отклонять ли черновики при импорте существующих акций. | [optional]

### Return type

**ResultModelOfOffersImportResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


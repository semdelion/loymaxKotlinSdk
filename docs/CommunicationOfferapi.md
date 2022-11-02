# CommunicationOfferapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationOfferAddInArchivedOffer**](CommunicationOfferapi.md#communicationOfferAddInArchivedOffer) | **DELETE** v1.2/communicationOffers/{id}/Archive | Отправка акции в архив.
[**communicationOfferGetAvaliableOffers**](CommunicationOfferapi.md#communicationOfferGetAvaliableOffers) | **GET** v1.2/communicationOffers/availableOffers | Возвращает список доступных акций.
[**communicationOfferGetMerchantInfosByBrand**](CommunicationOfferapi.md#communicationOfferGetMerchantInfosByBrand) | **GET** v1.2/communicationOffers/{id}/availableMerchantInfos | Возвращает список магазинов достпных для рекламного материала.
[**communicationOfferGetOffer**](CommunicationOfferapi.md#communicationOfferGetOffer) | **GET** v1.2/communicationOffers/{id} | Получение описания детали для акции.
[**communicationOfferGetOffers**](CommunicationOfferapi.md#communicationOfferGetOffers) | **GET** v1.2/communicationOffers | Возвращает список всех инструкций для акций.
[**communicationOfferGetTargetGroups**](CommunicationOfferapi.md#communicationOfferGetTargetGroups) | **GET** v1.2/communicationOffers/{id}/availableTargetGroups | Возвращает список целевых аудиторий.
[**communicationOfferRestoreOffer**](CommunicationOfferapi.md#communicationOfferRestoreOffer) | **POST** v1.2/communicationOffers/{id}/Restore | Востановить акцию.



Отправка акции в архив.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModel = webService.communicationOfferAddInArchivedOffer(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список доступных акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val substring : kotlin.String = substring_example // kotlin.String | Подстрока для поиска.

val result : ResultModelOfPagedViewModelOfOfferInfoShortViewModel = webService.communicationOfferGetAvaliableOffers(from, count, substring)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **substring** | **kotlin.String**| Подстрока для поиска. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferInfoShortViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список магазинов достпных для рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламного материала.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterCityId : kotlin.Int = 56 // kotlin.Int | 
val filterСategoryID : kotlin.Int = 56 // kotlin.Int | 
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterArchivedShowMode : ArchivedState =  // ArchivedState | 

val result : ResultModelOfListOfMerchantInfoModel = webService.communicationOfferGetMerchantInfosByBrand(id, from, count, filterCityId, filterСategoryID, filterName, filterArchivedShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор рекламного материала. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterCityId** | **kotlin.Int**|  | [optional]
 **filterСategoryID** | **kotlin.Int**|  | [optional]
 **filterName** | **kotlin.String**|  | [optional]
 **filterArchivedShowMode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfListOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получение описания детали для акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор деталей.

val result : ResultModelOfCommunicationOfferModel = webService.communicationOfferGetOffer(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор деталей. |

### Return type

**ResultModelOfCommunicationOfferModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех инструкций для акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val filterCommunicationOfferState : CommunicationOfferState =  // CommunicationOfferState | Статус акции.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата С.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата По.
val filterBrandIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Набор идентификаторов брендов.
val filterCategoriesIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Набор идентификаторов категорий рекламных материалов.
val filterName : kotlin.String = filterName_example // kotlin.String | Подстрока для поиска по имени.
val filterIsArchived : ArchivedState =  // ArchivedState | Признак удаления.
val filterPriorityMin : kotlin.Int = 56 // kotlin.Int | Минимальный приоритет.
val filterPriorityMax : kotlin.Int = 56 // kotlin.Int | Максимальный приоритет.
val filterMarketingCampaignId : kotlin.Int = 56 // kotlin.Int | Идентификатор маркетинговой кампании.
val filterExcludeMarketingCampaign : kotlin.Boolean = true // kotlin.Boolean | Исключает все акции для которых установлена компания.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Со скольки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько.
val filterType : CommunicationOfferType =  // CommunicationOfferType | Тип акции.

val result : ResultModelOfPagedViewModelOfCommunicationOfferModel = webService.communicationOfferGetOffers(filterCommunicationOfferState, filterFromDate, filterToDate, filterBrandIds, filterCategoriesIds, filterName, filterIsArchived, filterPriorityMin, filterPriorityMax, filterMarketingCampaignId, filterExcludeMarketingCampaign, filterFrom, filterCount, filterType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCommunicationOfferState** | **CommunicationOfferState**| Статус акции. | [optional] [enum: Active, CommingSoon]
 **filterFromDate** | **kotlin.String**| Дата С. | [optional]
 **filterToDate** | **kotlin.String**| Дата По. | [optional]
 **filterBrandIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Набор идентификаторов брендов. | [optional]
 **filterCategoriesIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Набор идентификаторов категорий рекламных материалов. | [optional]
 **filterName** | **kotlin.String**| Подстрока для поиска по имени. | [optional]
 **filterIsArchived** | **ArchivedState**| Признак удаления. | [optional] [enum: Archived, NonArchived]
 **filterPriorityMin** | **kotlin.Int**| Минимальный приоритет. | [optional]
 **filterPriorityMax** | **kotlin.Int**| Максимальный приоритет. | [optional]
 **filterMarketingCampaignId** | **kotlin.Int**| Идентификатор маркетинговой кампании. | [optional]
 **filterExcludeMarketingCampaign** | **kotlin.Boolean**| Исключает все акции для которых установлена компания. | [optional]
 **filterFrom** | **kotlin.Int**| Со скольки. | [optional]
 **filterCount** | **kotlin.Int**| Сколько. | [optional]
 **filterType** | **CommunicationOfferType**| Тип акции. | [optional] [enum: Original, PersonalGoods, PersonalOffer, All]

### Return type

**ResultModelOfPagedViewModelOfCommunicationOfferModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список целевых аудиторий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id рекламных материалов.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterLoyaltyPrograms : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterCreatorIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterArchivedShowMode : ArchivedState =  // ArchivedState | 
val filterCalculatedShowMode : TargetGroupCalculatedShowMode =  // TargetGroupCalculatedShowMode | 

val result : ResultModelOfPagedViewModelOfTargetGroupViewModel = webService.communicationOfferGetTargetGroups(id, from, count, filterDateFrom, filterDateTo, filterPartnerIds, filterLoyaltyPrograms, filterCreatorIds, filterSortingIds, filterName, filterArchivedShowMode, filterCalculatedShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id рекламных материалов. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterLoyaltyPrograms** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterCreatorIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterName** | **kotlin.String**|  | [optional]
 **filterArchivedShowMode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **filterCalculatedShowMode** | **TargetGroupCalculatedShowMode**|  | [optional] [enum: NotCalculatedOnly, CalculatedOnly]

### Return type

**ResultModelOfPagedViewModelOfTargetGroupViewModel**

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
val webService = apiClient.createWebservice(CommunicationOfferapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModel = webService.communicationOfferRestoreOffer(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


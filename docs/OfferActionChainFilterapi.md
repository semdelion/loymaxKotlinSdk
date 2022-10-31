# OfferActionChainFilterapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerActionChainFilterGetCardStates**](OfferActionChainFilterapi.md#offerActionChainFilterGetCardStates) | **GET** v1.2/Filters/AvailableCardStates | Возвращает список всех состояний карты.
[**offerActionChainFilterGetEmissions**](OfferActionChainFilterapi.md#offerActionChainFilterGetEmissions) | **GET** v1.2/Filters/AvailableCardEmissions | Получить список всех выпусков карт.
[**offerActionChainFilterGetFilter**](OfferActionChainFilterapi.md#offerActionChainFilterGetFilter) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/filters/{filterId} | Получает информацию о фильтре.
[**offerActionChainFilterGetFilters**](OfferActionChainFilterapi.md#offerActionChainFilterGetFilters) | **GET** v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/filters | Получает информацию о фильтрах цепочки действий.
[**offerActionChainFilterGetFiltersOffers**](OfferActionChainFilterapi.md#offerActionChainFilterGetFiltersOffers) | **GET** v1.2/Filters/AvailableOffers | Получить список доступных в фильтрах акций.
[**offerActionChainFilterGetPersonStates**](OfferActionChainFilterapi.md#offerActionChainFilterGetPersonStates) | **GET** v1.2/Filters/AvailablePersonStates | Возвращает список всех состояний пользователя.
[**offerActionChainFilterGetQuestions**](OfferActionChainFilterapi.md#offerActionChainFilterGetQuestions) | **GET** v1.2/Filters/{id}/questions | Получить вопросы для фильтра.
[**offerActionChainFilterGetWeekDays**](OfferActionChainFilterapi.md#offerActionChainFilterGetWeekDays) | **GET** v1.2/Filters/AvailableWeekDays | Возвращает список всех дней недели.



Возвращает список всех состояний карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)

val result : ResultModelOfListOfCardState = webService.offerActionChainFilterGetCardStates()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCardState**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список всех выпусков карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)

val result : ResultModelOfListOfCardEmissionModel = webService.offerActionChainFilterGetEmissions()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCardEmissionModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает информацию о фильтре.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerChainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки действий.
val filterId : kotlin.Int = 56 // kotlin.Int | Идентификатор фильтра.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.

val result : ResultModelOfFilterViewModel = webService.offerActionChainFilterGetFilter(offerId, offerChainId, filterId, offerVersion)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerChainId** | **kotlin.Int**| Идентификатор цепочки действий. |
 **filterId** | **kotlin.Int**| Идентификатор фильтра. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |

### Return type

**ResultModelOfFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает информацию о фильтрах цепочки действий.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val offerChainId : kotlin.Int = 56 // kotlin.Int | Идентификатор цепочки действий.
val offerVersion : kotlin.String = offerVersion_example // kotlin.String | Дескриптор версии акции.
val filterModelType : FilterModelType =  // FilterModelType | Тип информации о фильтре.

val result : ResultModelOfListOfFilterViewModel = webService.offerActionChainFilterGetFilters(offerId, offerChainId, offerVersion, filterModelType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **offerChainId** | **kotlin.Int**| Идентификатор цепочки действий. |
 **offerVersion** | **kotlin.String**| Дескриптор версии акции. |
 **filterModelType** | **FilterModelType**| Тип информации о фильтре. | [optional] [enum: Full, Short]

### Return type

**ResultModelOfListOfFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список доступных в фильтрах акций.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Идентификатор партнера.
val name : kotlin.String = name_example // kotlin.String | Название акции.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfOfferInfoShortViewModel = webService.offerActionChainFilterGetFiltersOffers(partnerId, name, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Идентификатор партнера. |
 **name** | **kotlin.String**| Название акции. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferInfoShortViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех состояний пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)

val result : ResultModelOfListOfPersonState = webService.offerActionChainFilterGetPersonStates()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPersonState**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить вопросы для фильтра.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id фильтра.

val result : ResultModelOfListOfAnketaQuestionViewModel = webService.offerActionChainFilterGetQuestions(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id фильтра. |

### Return type

**ResultModelOfListOfAnketaQuestionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех дней недели.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferActionChainFilterapi::class.java)

val result : ResultModelOfListOfDayOfWeek = webService.offerActionChainFilterGetWeekDays()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfDayOfWeek**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


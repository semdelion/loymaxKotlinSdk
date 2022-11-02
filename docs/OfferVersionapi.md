# OfferVersionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerVersionGetList**](OfferVersionapi.md#offerVersionGetList) | **GET** v1.2/Offers/{offerId}/versions | Получает список всех версий акции.
[**offerVersionResumeVersion**](OfferVersionapi.md#offerVersionResumeVersion) | **POST** v1.2/Offers/{offerId}/versions/{versionId}/resume | Возобновить версию акции.
[**offerVersionStopVersion**](OfferVersionapi.md#offerVersionStopVersion) | **POST** v1.2/Offers/{offerId}/versions/{versionId}/stop | Останавливает версию акции.



Получает список всех версий акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferVersionapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val fromDate : kotlin.String = fromDate_example // kotlin.String | Дата С.
val toDate : kotlin.String = toDate_example // kotlin.String | Дата По.
val from : kotlin.Int = 56 // kotlin.Int | С какого элемента брать.
val count : kotlin.Int = 56 // kotlin.Int | Сколько элементов брать.
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по имени.
val viewStates : kotlin.collections.MutableList<OfferViewState> =  // kotlin.collections.MutableList<OfferViewState> | Список состояний акции для фильтрации.

val result : ResultModelOfPagedViewModelOfOfferVersionsViewModel = webService.offerVersionGetList(offerId, fromDate, toDate, from, count, name, viewStates)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **fromDate** | **kotlin.String**| Дата С. | [optional]
 **toDate** | **kotlin.String**| Дата По. | [optional]
 **from** | **kotlin.Int**| С какого элемента брать. | [optional]
 **count** | **kotlin.Int**| Сколько элементов брать. | [optional]
 **name** | **kotlin.String**| Подстрока для поиска по имени. | [optional]
 **viewStates** | **kotlin.collections.MutableList&lt;OfferViewState&gt;**| Список состояний акции для фильтрации. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferVersionsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возобновить версию акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferVersionapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val versionId : kotlin.Int = 56 // kotlin.Int | Идентификатор версии.

val result : ResultModel = webService.offerVersionResumeVersion(offerId, versionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **versionId** | **kotlin.Int**| Идентификатор версии. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Останавливает версию акции.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OfferVersionapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.
val versionId : kotlin.Int = 56 // kotlin.Int | Идентификатор версии.

val result : ResultModel = webService.offerVersionStopVersion(offerId, versionId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор акции. |
 **versionId** | **kotlin.Int**| Идентификатор версии. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


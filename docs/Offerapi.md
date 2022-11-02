# Offerapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerGetDetail**](Offerapi.md#offerGetDetail) | **GET** v1.2/Offer/{offerId}/details/{detailId} | Получить детали рекламного материала.
[**offerGetDetailMerchants**](Offerapi.md#offerGetDetailMerchants) | **GET** v1.2/Offer/{offerId}/details/{detailId}/merchants | Получить магазины детали рекламного материала.
[**offerGetDetails**](Offerapi.md#offerGetDetails) | **GET** v1.2/Offer/{id}/details | Получить детали рекламного материала.
[**offerGetOffer**](Offerapi.md#offerGetOffer) | **GET** v1.2/Offer/{id} | Получить рекламный материал по идентификатору.
[**offerGetOfferMerchants**](Offerapi.md#offerGetOfferMerchants) | **GET** v1.2/Offer/{id}/merchants | Получить магазины рекламных материалов.
[**offerGetOffers**](Offerapi.md#offerGetOffers) | **GET** v1.2/Offer | Получить рекламные материалы.



Получить детали рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламного материала.
val detailId : kotlin.String = detailId_example // kotlin.String | Идентификатор детали.

val result : ResultModelOfDetailItem = webService.offerGetDetail(offerId, detailId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор рекламного материала. |
 **detailId** | **kotlin.String**| Идентификатор детали. |

### Return type

**ResultModelOfDetailItem**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить магазины детали рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламного материала.
val detailId : kotlin.String = detailId_example // kotlin.String | Идентификатор детали.

val result : ResultModelOfListOfMerchantInfoModel = webService.offerGetDetailMerchants(offerId, detailId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offerId** | **kotlin.Int**| Идентификатор рекламного материала. |
 **detailId** | **kotlin.String**| Идентификатор детали. |

### Return type

**ResultModelOfListOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить детали рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламного материала.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfDetailItem = webService.offerGetDetails(id, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор рекламного материала. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfDetailItem**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить рекламный материал по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModelOfOfferModel = webService.offerGetOffer(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModelOfOfferModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить магазины рекламных материалов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModelOfListOfMerchantInfoModel = webService.offerGetOfferMerchants(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModelOfListOfMerchantInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить рекламные материалы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Offerapi::class.java)
val filterMerchantId : kotlin.Int = 56 // kotlin.Int | Id магазина.
val filterOfferState : CommunicationOfferState =  // CommunicationOfferState | Статус акции.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Со скольки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько.
val filterType : CommunicationOfferType =  // CommunicationOfferType | Тип акции.
val filterCategoryFilterType : OfferCategoryFilterType =  // OfferCategoryFilterType | Фильтр по категории.
val filterCategoryLogicalNames : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Логические имена категорий.

val result : ResultModelOfPagedViewModelOfOfferModel = webService.offerGetOffers(filterMerchantId, filterOfferState, filterFrom, filterCount, filterType, filterCategoryFilterType, filterCategoryLogicalNames)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterMerchantId** | **kotlin.Int**| Id магазина. | [optional]
 **filterOfferState** | **CommunicationOfferState**| Статус акции. | [optional] [enum: Active, CommingSoon]
 **filterFrom** | **kotlin.Int**| Со скольки. | [optional]
 **filterCount** | **kotlin.Int**| Сколько. | [optional]
 **filterType** | **CommunicationOfferType**| Тип акции. | [optional] [enum: Original, PersonalGoods, PersonalOffer, All]
 **filterCategoryFilterType** | **OfferCategoryFilterType**| Фильтр по категории. | [optional] [enum: SelectByLogicalName, IgnoreByLogicalName, SelectUncategorized]
 **filterCategoryLogicalNames** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Логические имена категорий. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOfferModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


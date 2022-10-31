# OffersBatchapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offersBatchDeleteOffers**](OffersBatchapi.md#offersBatchDeleteOffers) | **POST** v1.2/offers/batch/Delete | Удаляет акции по фильтру.
[**offersBatchStartOffers**](OffersBatchapi.md#offersBatchStartOffers) | **POST** v1.2/offers/batch/Start | Запускает акции по фильтру.
[**offersBatchStopOffers**](OffersBatchapi.md#offersBatchStopOffers) | **POST** v1.2/offers/batch/Stop | Останавливает акции по фильтру.



Удаляет акции по фильтру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OffersBatchapi::class.java)
val filter : OffersListFilter =  // OffersListFilter | Модель для фильтрации.

val result : ResultModel = webService.offersBatchDeleteOffers(filter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **OffersListFilter**| Модель для фильтрации. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает акции по фильтру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OffersBatchapi::class.java)
val filter : OffersListFilter =  // OffersListFilter | Модель для фильтрации.

val result : ResultModel = webService.offersBatchStartOffers(filter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **OffersListFilter**| Модель для фильтрации. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Останавливает акции по фильтру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OffersBatchapi::class.java)
val filter : OffersListFilter =  // OffersListFilter | Модель для фильтрации.

val result : ResultModel = webService.offersBatchStopOffers(filter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **OffersListFilter**| Модель для фильтрации. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


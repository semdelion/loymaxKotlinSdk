# CommunicationOfferCategoryapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationOfferCategoryArchiveCategory**](CommunicationOfferCategoryapi.md#communicationOfferCategoryArchiveCategory) | **POST** v1.2/communicationOffersCategories/{id}/archive | Архивировать категорию рекламного материала.
[**communicationOfferCategoryGetCategories**](CommunicationOfferCategoryapi.md#communicationOfferCategoryGetCategories) | **GET** v1.2/communicationOffersCategories | Получить список категорий рекламных материалов.
[**communicationOfferCategoryGetCategory**](CommunicationOfferCategoryapi.md#communicationOfferCategoryGetCategory) | **GET** v1.2/communicationOffersCategories/{id} | Получить категорию рекламного материала.
[**communicationOfferCategoryRestoreCategory**](CommunicationOfferCategoryapi.md#communicationOfferCategoryRestoreCategory) | **POST** v1.2/communicationOffersCategories/{id}/restore | Восстановить архивированную категорию рекламного материала.



Архивировать категорию рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferCategoryapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModel = webService.communicationOfferCategoryArchiveCategory(id)
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


Получить список категорий рекламных материалов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferCategoryapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterName : kotlin.String = filterName_example // kotlin.String | Название категории.
val filterState : ArchivedState =  // ArchivedState | Признак архивирования категории.
val filterPartnersIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список идентификаторов партнеров.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы, которые будут выбираться первыми.

val result : ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel = webService.communicationOfferCategoryGetCategories(from, count, filterName, filterState, filterPartnersIds, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterName** | **kotlin.String**| Название категории. | [optional]
 **filterState** | **ArchivedState**| Признак архивирования категории. | [optional] [enum: Archived, NonArchived]
 **filterPartnersIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список идентификаторов партнеров. | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы, которые будут выбираться первыми. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить категорию рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferCategoryapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModelOfCommunicationOfferCategoryViewModel = webService.communicationOfferCategoryGetCategory(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModelOfCommunicationOfferCategoryViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить архивированную категорию рекламного материала.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommunicationOfferCategoryapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModel = webService.communicationOfferCategoryRestoreCategory(id)
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


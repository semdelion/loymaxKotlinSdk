# Partnerapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerGetExternalCardInfo**](Partnerapi.md#partnerGetExternalCardInfo) | **GET** v1.2/partners/{id}/Cards/{number} | Возвращает информацию о партнерской карте.
[**partnerGetPartnerByID**](Partnerapi.md#partnerGetPartnerByID) | **GET** v1.2/partners/{id} | Возвращает информацию о Партнере по его внутреннему идентификатору.
[**partnerGetPartnersByName**](Partnerapi.md#partnerGetPartnersByName) | **GET** v1.2/partners | Возвращает список Партнеров.
[**partnerGetPaymentLimits**](Partnerapi.md#partnerGetPaymentLimits) | **GET** v1.2/partners/{id}/paymentLimit | Возвращает информацию об ограничении списания бонусов.
[**partnerReplaceExternalCard**](Partnerapi.md#partnerReplaceExternalCard) | **POST** v1.2/partners/{id}/Cards/{number}/Replace | Заменяет партнерскую карту на карту системы Loymax.



Возвращает информацию о партнерской карте.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Partnerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val number : kotlin.String = number_example // kotlin.String | Номер партнерской карты.

val result : ResultModelOfExternalCardInfoModel = webService.partnerGetExternalCardInfo(id, number)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **number** | **kotlin.String**| Номер партнерской карты. |

### Return type

**ResultModelOfExternalCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о Партнере по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Partnerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.

val result : ResultModelOfPartnerModel = webService.partnerGetPartnerByID(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор Партнера. |

### Return type

**ResultModelOfPartnerModel**

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
val webService = apiClient.createWebservice(Partnerapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterName : kotlin.String = filterName_example // kotlin.String | Подстрока для поиска по названию Партнера.
val filterPermission : kotlin.String = filterPermission_example // kotlin.String | Выбираются партнеры, на которые текущий пользователь имеет указанное право.
val filterOrderByDesc : kotlin.Boolean = true // kotlin.Boolean | Сортировка в обратном порядке (true — да, false — нет).
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список идентификаторов для первоочередного выбора.
val filterLoyaltyPrograms : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список внутренних идентификаторов Программ лояльности.

val result : ResultModelOfPagedViewModelOfPartnerModel = webService.partnerGetPartnersByName(filterFrom, filterCount, filterName, filterPermission, filterOrderByDesc, filterSortingIds, filterLoyaltyPrograms)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterName** | **kotlin.String**| Подстрока для поиска по названию Партнера. | [optional]
 **filterPermission** | **kotlin.String**| Выбираются партнеры, на которые текущий пользователь имеет указанное право. | [optional]
 **filterOrderByDesc** | **kotlin.Boolean**| Сортировка в обратном порядке (true — да, false — нет). | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список идентификаторов для первоочередного выбора. | [optional]
 **filterLoyaltyPrograms** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список внутренних идентификаторов Программ лояльности. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPartnerModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об ограничении списания бонусов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Partnerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.

val result : ResultModelOfListOfPaymentLimitViewModel = webService.partnerGetPaymentLimits(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор Партнера. |

### Return type

**ResultModelOfListOfPaymentLimitViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Заменяет партнерскую карту на карту системы Loymax.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Partnerapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val number : kotlin.String = number_example // kotlin.String | Номер партнерской карты.
val loymaxCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты системы Loymax.

val result : ResultModel = webService.partnerReplaceExternalCard(id, number, loymaxCardId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **number** | **kotlin.String**| Номер партнерской карты. |
 **loymaxCardId** | **kotlin.Int**| Внутренний идентификатор карты системы Loymax. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


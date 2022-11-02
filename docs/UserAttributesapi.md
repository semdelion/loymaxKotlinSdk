# UserAttributesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAttributesGetCommonAttributeValue**](UserAttributesapi.md#userAttributesGetCommonAttributeValue) | **GET** v1.2/User/Attributes/Common/Values/{logicalName} | Возвращает значение общего атрибута клиента.
[**userAttributesGetObjects**](UserAttributesapi.md#userAttributesGetObjects) | **GET** v1.2/User/Attributes/PersonalOffer/Values/{logicalName} | Возвращает список атрибутов из коллекции по JSONPath.
[**userAttributesGetPersonalOfferAttributes**](UserAttributesapi.md#userAttributesGetPersonalOfferAttributes) | **GET** v1.2/User/Attributes/PersonalOffer/Values | Возвращает значения атрибутов \&quot;Персональные товары\&quot; для клиента.
[**userAttributesGetPersonalOfferSets**](UserAttributesapi.md#userAttributesGetPersonalOfferSets) | **GET** v1.2/User/Attributes/PersonalOffer/list | Возвращает список наборов персональных товаров.
[**userAttributesGetValue**](UserAttributesapi.md#userAttributesGetValue) | **GET** v1.2/User/Attributes/PersonalOffer/Values/Raw/{logicalName} | Возвращает значение Персонального предложения.
[**userAttributesSetPersonalOfferAttribute**](UserAttributesapi.md#userAttributesSetPersonalOfferAttribute) | **POST** v1.2/User/Attributes/PersonalOffer/Values/{attributeId} | Обновляет значение атрибута \&quot;Персональные товары\&quot; для клиента.



Возвращает значение общего атрибута клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.

val result : ResultModelOfCommonAttributeJsonModel = webService.userAttributesGetCommonAttributeValue(logicalName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |

### Return type

**ResultModelOfCommonAttributeJsonModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список атрибутов из коллекции по JSONPath.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.
val xPath : kotlin.String = xPath_example // kotlin.String | JSONPath.

val result : kotlin.Any = webService.userAttributesGetObjects(logicalName, xPath)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |
 **xPath** | **kotlin.String**| JSONPath. |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает значения атрибутов \&quot;Персональные товары\&quot; для клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val modelAttributesIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список идентификаторов атрибутов.

val result : ResultModelOfListOfPersonalOfferAttributeValueModel = webService.userAttributesGetPersonalOfferAttributes(modelAttributesIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAttributesIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список идентификаторов атрибутов. | [optional]

### Return type

**ResultModelOfListOfPersonalOfferAttributeValueModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список наборов персональных товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val periodType : TimePeriodType =  // TimePeriodType | Фильтр отображения наборов, сформированных по истории покупок.

val result : ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel = webService.userAttributesGetPersonalOfferSets(fromDate, toDate, from, count, periodType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. |
 **toDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **periodType** | **TimePeriodType**| Фильтр отображения наборов, сформированных по истории покупок. | [optional] [enum: Month]

### Return type

**ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает значение Персонального предложения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.

val result : kotlin.Any = webService.userAttributesGetValue(logicalName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет значение атрибута \&quot;Персональные товары\&quot; для клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributesapi::class.java)
val attributeId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор атрибута.
val model : PersonalOfferAttributeValueModel =  // PersonalOfferAttributeValueModel | Модель со списком выбранных товаров.

val result : ResultModel = webService.userAttributesSetPersonalOfferAttribute(attributeId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **kotlin.Int**| Внутренний идентификатор атрибута. |
 **model** | **PersonalOfferAttributeValueModel**| Модель со списком выбранных товаров. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# CustomerAttributeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerAttributeDeleteAttribute**](CustomerAttributeapi.md#customerAttributeDeleteAttribute) | **DELETE** v1.2/Attributes/{id}/Delete | Удалить атрибут.
[**customerAttributeDisableHistoryRecording**](CustomerAttributeapi.md#customerAttributeDisableHistoryRecording) | **POST** v1.2/Attributes/{id}/history/disable | Выключение истории для атрибута.
[**customerAttributeEnableHistoryRecording**](CustomerAttributeapi.md#customerAttributeEnableHistoryRecording) | **POST** v1.2/Attributes/{id}/history/enable | Включение истории для атрибута.
[**customerAttributeExportAttributeValues**](CustomerAttributeapi.md#customerAttributeExportAttributeValues) | **GET** v1.2/Attributes/csv | Экспортировать значения атрибутов в csv.
[**customerAttributeGet**](CustomerAttributeapi.md#customerAttributeGet) | **GET** v1.2/Attributes/{id} | Получить атрибут по идентификатору.
[**customerAttributeGetList**](CustomerAttributeapi.md#customerAttributeGetList) | **GET** v1.2/Attributes | Получить список всех атрибутов.
[**customerAttributeGetSelectGoodsCount**](CustomerAttributeapi.md#customerAttributeGetSelectGoodsCount) | **GET** v1.2/Attributes/{id}/getSelectGoodsCount | Получение количества выбранных товаров.
[**customerAttributeRestoreAttribute**](CustomerAttributeapi.md#customerAttributeRestoreAttribute) | **POST** v1.2/Attributes/{id}/Restore | Восстановить атрибут.
[**customerAttributeUpdateAttribute**](CustomerAttributeapi.md#customerAttributeUpdateAttribute) | **POST** v1.2/Attributes/{id}/Update | Обновление данных атрибута.



Удалить атрибут.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор атрибута.

val result : ResultModel = webService.customerAttributeDeleteAttribute(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор атрибута. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Выключение истории для атрибута.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id атрибута.

val result : ResultModel = webService.customerAttributeDisableHistoryRecording(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id атрибута. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Включение истории для атрибута.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id атрибута.

val result : ResultModel = webService.customerAttributeEnableHistoryRecording(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id атрибута. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать значения атрибутов в csv.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val attributeLogicalName : kotlin.String = attributeLogicalName_example // kotlin.String | Логическое имя атрибута.
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Идентификатор целевой аудитории.
val fromDate : kotlin.String = fromDate_example // kotlin.String | С какого периода действует значение атрибута.
val toDate : kotlin.String = toDate_example // kotlin.String | По какой период действует значение атрибута.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : kotlin.String = webService.customerAttributeExportAttributeValues(attributeLogicalName, targetGroupId, fromDate, toDate, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeLogicalName** | **kotlin.String**| Логическое имя атрибута. |
 **targetGroupId** | **kotlin.Int**| Идентификатор целевой аудитории. | [optional]
 **fromDate** | **kotlin.String**| С какого периода действует значение атрибута. | [optional]
 **toDate** | **kotlin.String**| По какой период действует значение атрибута. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить атрибут по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModelOfBaseUserAttributeViewModel = webService.customerAttributeGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModelOfBaseUserAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список всех атрибутов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val attributesFilterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val attributesFilterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val attributesFilterPartnerId : kotlin.Int = 56 // kotlin.Int | Id партнера (для получения списка для акции).
val attributesFilterSelectedAttributeId : kotlin.Int = 56 // kotlin.Int | Id выбранного атрибута (для подгрузки значения в фильтре).
val attributesFilterNameSearch : kotlin.String = attributesFilterNameSearch_example // kotlin.String | Название атрибута.
val attributesFilterLogicalName : kotlin.String = attributesFilterLogicalName_example // kotlin.String | Логическое имя.
val attributesFilterIsHidden : kotlin.Boolean = true // kotlin.Boolean | Видимость атрибута.
val attributesFilterIsDeleted : kotlin.Boolean = true // kotlin.Boolean | Архивные/Не архивные.
val attributesFilterValueType : kotlin.collections.MutableList<CommonAttributeValueType> =  // kotlin.collections.MutableList<CommonAttributeValueType> | Тип значения.
val attributesFilterAttributeType : UserAttributeType =  // UserAttributeType | Тип атрибута.

val result : ResultModelOfPagedViewModelOfBaseUserAttributeViewModel = webService.customerAttributeGetList(attributesFilterFrom, attributesFilterCount, attributesFilterPartnerId, attributesFilterSelectedAttributeId, attributesFilterNameSearch, attributesFilterLogicalName, attributesFilterIsHidden, attributesFilterIsDeleted, attributesFilterValueType, attributesFilterAttributeType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributesFilterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **attributesFilterCount** | **kotlin.Int**| Количество. | [optional]
 **attributesFilterPartnerId** | **kotlin.Int**| Id партнера (для получения списка для акции). | [optional]
 **attributesFilterSelectedAttributeId** | **kotlin.Int**| Id выбранного атрибута (для подгрузки значения в фильтре). | [optional]
 **attributesFilterNameSearch** | **kotlin.String**| Название атрибута. | [optional]
 **attributesFilterLogicalName** | **kotlin.String**| Логическое имя. | [optional]
 **attributesFilterIsHidden** | **kotlin.Boolean**| Видимость атрибута. | [optional]
 **attributesFilterIsDeleted** | **kotlin.Boolean**| Архивные/Не архивные. | [optional]
 **attributesFilterValueType** | **kotlin.collections.MutableList&lt;CommonAttributeValueType&gt;**| Тип значения. | [optional]
 **attributesFilterAttributeType** | **UserAttributeType**| Тип атрибута. | [optional] [enum: Notifier, Question, Common, PersonalOffer, StatusSystem]

### Return type

**ResultModelOfPagedViewModelOfBaseUserAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получение количества выбранных товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id атрибута.
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.

val result : ResultModelOfInt32 = webService.customerAttributeGetSelectGoodsCount(id, personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id атрибута. |
 **personId** | **kotlin.Int**| Id пользователя. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить атрибут.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор атрибута.

val result : ResultModel = webService.customerAttributeRestoreAttribute(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор атрибута. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновление данных атрибута.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerAttributeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор атрибута.
val `data` : BaseUserAttributeViewModel =  // BaseUserAttributeViewModel | Данные для обновления.

val result : ResultModel = webService.customerAttributeUpdateAttribute(id, `data`)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор атрибута. |
 **&#x60;data&#x60;** | **BaseUserAttributeViewModel**| Данные для обновления. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


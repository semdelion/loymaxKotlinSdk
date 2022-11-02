# TargetGroupapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetGroupCalculateTargetGroup**](TargetGroupapi.md#targetGroupCalculateTargetGroup) | **POST** v1.2/targetGroups/{id}/calculate | Запускает расчет целевой аудитории.
[**targetGroupGetAllTargetGroups**](TargetGroupapi.md#targetGroupGetAllTargetGroups) | **POST** v1.2/targetGroups/list | Получить все целевые аудитории.
[**targetGroupGetAvailableCreators**](TargetGroupapi.md#targetGroupGetAvailableCreators) | **GET** v1.2/targetGroups/AvailableCreators | Возвращает список пользователей, которые создавали целевые аудитории.
[**targetGroupGetCustomersByTargetGroupLastCalculation**](TargetGroupapi.md#targetGroupGetCustomersByTargetGroupLastCalculation) | **GET** v1.2/targetGroups/{id}/calculation/customers | Возвращает список выбранных идентификаторов клиентов, входящих в последней расчет целевой аудитории.
[**targetGroupGetPersonsByTargetGroupLastCalculation**](TargetGroupapi.md#targetGroupGetPersonsByTargetGroupLastCalculation) | **GET** v1.2/targetGroups/persons | Возвращает список клиентов, входящих в последний расчет целевой аудитории.
[**targetGroupGetTargetGroup**](TargetGroupapi.md#targetGroupGetTargetGroup) | **GET** v1.2/targetGroups/{id} | Возвращает целевую аудиторию по внутреннему идентификатору.
[**targetGroupGetTargetGroupCalculationInfo**](TargetGroupapi.md#targetGroupGetTargetGroupCalculationInfo) | **GET** v1.2/targetGroups/{id}/calculation | Возвращает информацию о последнем расчете целевой аудитории.
[**targetGroupGetTargetGroups**](TargetGroupapi.md#targetGroupGetTargetGroups) | **GET** v1.2/targetGroups | Возвращает все целевые аудитории.
[**targetGroupRestoreTargetGroup**](TargetGroupapi.md#targetGroupRestoreTargetGroup) | **POST** v1.2/targetGroups/{id}/restore | Восстанавливает из архива целевую аудиторию.
[**targetGroupUnfixTargetGroup**](TargetGroupapi.md#targetGroupUnfixTargetGroup) | **POST** v1.2/targetGroups/{id}/unfix | Снимает фиксацию (расчет) с целевой аудитории.
[**targetGroupUploadCalculation**](TargetGroupapi.md#targetGroupUploadCalculation) | **POST** v1.2/targetGroups/import | Импортирует клиентов в ранее созданную целевую аудиторию.



Запускает расчет целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.

val result : ResultModel = webService.targetGroupCalculateTargetGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить все целевые аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val filter : TargetGroupSearchFilter =  // TargetGroupSearchFilter | Фильтр поиска по параметрам.
val from : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val count : kotlin.Int = 56 // kotlin.Int | Объем выборки.
val filterBySortingIds : kotlin.Boolean = true // kotlin.Boolean | Фильтровать только по целевым аудиториям с идентификаторами, переданными в SortingIds.

val result : ResultModelOfPagedViewModelOfTargetGroupBriefViewModel = webService.targetGroupGetAllTargetGroups(filter, from, count, filterBySortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **TargetGroupSearchFilter**| Фильтр поиска по параметрам. |
 **from** | **kotlin.Int**| Начало выборки. | [optional]
 **count** | **kotlin.Int**| Объем выборки. | [optional]
 **filterBySortingIds** | **kotlin.Boolean**| Фильтровать только по целевым аудиториям с идентификаторами, переданными в SortingIds. | [optional]

### Return type

**ResultModelOfPagedViewModelOfTargetGroupBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список пользователей, которые создавали целевые аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)

val result : ResultModelOfListOfCreatorModel = webService.targetGroupGetAvailableCreators()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCreatorModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список выбранных идентификаторов клиентов, входящих в последней расчет целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val types : kotlin.collections.MutableList<IdentifierType> =  // kotlin.collections.MutableList<IdentifierType> | Типы идентификаторов клиентов, входящих в целевую аудиторию.

val result : kotlin.Any = webService.targetGroupGetCustomersByTargetGroupLastCalculation(id, types)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **types** | **kotlin.collections.MutableList&lt;IdentifierType&gt;**| Типы идентификаторов клиентов, входящих в целевую аудиторию. |

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список клиентов, входящих в последний расчет целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterIdentifierText : kotlin.String = filterIdentifierText_example // kotlin.String | Только пользователи с идентификаторами содержащими данный текст.

val result : ResultModelOfPagedViewModelOfUserViewModel = webService.targetGroupGetPersonsByTargetGroupLastCalculation(targetGroupId, from, count, filterIdentifierText)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterIdentifierText** | **kotlin.String**| Только пользователи с идентификаторами содержащими данный текст. | [optional]

### Return type

**ResultModelOfPagedViewModelOfUserViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает целевую аудиторию по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.

val result : ResultModelOfTargetGroupViewModel = webService.targetGroupGetTargetGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |

### Return type

**ResultModelOfTargetGroupViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о последнем расчете целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.

val result : ResultModelOfCalculationModel = webService.targetGroupGetTargetGroupCalculationInfo(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |

### Return type

**ResultModelOfCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает все целевые аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val properties : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Свойства целевой аудитории. Если не указать ни одного, то будут возвращены все (доступные свойства  creationDate, changeDate, fixDate, creatorDescription, lastChangeUserDescription, fixUserDescription, calculationInfo, lastCalculationInfo; hasFilters, operations).
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра в акции.
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.
val chainId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор правила акции.
val offerVersionId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор версии акции.
val isExternal : kotlin.Boolean = true // kotlin.Boolean | Признак импортированной целевой аудитории (true - импортированная, false - неимпортированная).
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterLoyaltyPrograms : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterCreatorIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterArchivedShowMode : ArchivedState =  // ArchivedState | 
val filterCalculatedShowMode : TargetGroupCalculatedShowMode =  // TargetGroupCalculatedShowMode | 

val result : ResultModelOfPagedViewModelOfTargetGroupViewModel = webService.targetGroupGetTargetGroups(from, count, properties, filterId, offerId, chainId, offerVersionId, isExternal, filterDateFrom, filterDateTo, filterPartnerIds, filterLoyaltyPrograms, filterCreatorIds, filterSortingIds, filterName, filterArchivedShowMode, filterCalculatedShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **properties** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Свойства целевой аудитории. Если не указать ни одного, то будут возвращены все (доступные свойства  creationDate, changeDate, fixDate, creatorDescription, lastChangeUserDescription, fixUserDescription, calculationInfo, lastCalculationInfo; hasFilters, operations). | [optional]
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра в акции. | [optional]
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. | [optional]
 **chainId** | **kotlin.Int**| Внутренний идентификатор правила акции. | [optional]
 **offerVersionId** | **kotlin.Int**| Внутренний идентификатор версии акции. | [optional]
 **isExternal** | **kotlin.Boolean**| Признак импортированной целевой аудитории (true - импортированная, false - неимпортированная). | [optional]
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


Восстанавливает из архива целевую аудиторию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.

val result : ResultModel = webService.targetGroupRestoreTargetGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Снимает фиксацию (расчет) с целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.

val result : ResultModel = webService.targetGroupUnfixTargetGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Импортирует клиентов в ранее созданную целевую аудиторию.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val model : TargetGroupImportModel =  // TargetGroupImportModel | Модель импорта идентификаторов клиентов. {Loymax.Domain.Contract.Model.TargetGroups.TargetGroupImportModel}.

val result : ResultModelOfInt32 = webService.targetGroupUploadCalculation(targetGroupId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **model** | **TargetGroupImportModel**| Модель импорта идентификаторов клиентов. {Loymax.Domain.Contract.Model.TargetGroups.TargetGroupImportModel}. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


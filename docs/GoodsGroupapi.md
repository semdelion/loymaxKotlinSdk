# GoodsGroupapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsGroupGetGoodsCodes**](GoodsGroupapi.md#goodsGroupGetGoodsCodes) | **GET** v1.2/goodsGroups/{uid}/goodsCodes | Получает внешние идентификаторы товаров по идентификатору группы товаров.
[**goodsGroupGetGoodsGroup**](GoodsGroupapi.md#goodsGroupGetGoodsGroup) | **GET** v1.2/goodsGroups/{id} | Получить группу товаров по id.
[**goodsGroupGetGoodsGroupByExternalId**](GoodsGroupapi.md#goodsGroupGetGoodsGroupByExternalId) | **GET** v1.2/goodsGroups/{externalId} | Получить группу товаров по внешнему идентификатору.
[**goodsGroupGetGoodsGroupGoodsCount**](GoodsGroupapi.md#goodsGroupGetGoodsGroupGoodsCount) | **GET** v1.2/goodsGroups/{id}/goodsCount | Получить количество товаров в группе товаров.
[**goodsGroupGetGoodsGroups**](GoodsGroupapi.md#goodsGroupGetGoodsGroups) | **GET** v1.2/goodsGroups | Получить полную информацию о группах товаров.
[**goodsGroupRestoreGoodsGroup**](GoodsGroupapi.md#goodsGroupRestoreGoodsGroup) | **POST** v1.2/goodsGroups/{id}/restore | Восстановить из архива группу товаров.



Получает внешние идентификаторы товаров по идентификатору группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний или внутренний идентификатор группы товаров.

val result : kotlin.String = webService.goodsGroupGetGoodsCodes(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний или внутренний идентификатор группы товаров. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить группу товаров по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id группы товаров.

val result : ResultModelOfGoodsGroupViewModel = webService.goodsGroupGetGoodsGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id группы товаров. |

### Return type

**ResultModelOfGoodsGroupViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить группу товаров по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | Внешний идентификатор.

val result : ResultModelOfGoodsGroupViewModel = webService.goodsGroupGetGoodsGroupByExternalId(externalId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **kotlin.String**| Внешний идентификатор. |

### Return type

**ResultModelOfGoodsGroupViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить количество товаров в группе товаров.

Для фиксированной группы товаров - количество зафиксированных товаров, для нефиксированной - текущее количество товаров в наборах.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id группы товаров.

val result : ResultModelOfInt32 = webService.goodsGroupGetGoodsGroupGoodsCount(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id группы товаров. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить полную информацию о группах товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val sortingFilterId : kotlin.Int = 56 // kotlin.Int | ID фильтра, группы товаров которого будут выбираться первыми.
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список идентификаторов для первоочередного выбора.
val properties : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все.
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | 
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | 
val filterCreatorIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterPartnerIds : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val filterArchivedShowMode : ArchivedState =  // ArchivedState | 
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterDateFromLastChange : kotlin.String = filterDateFromLastChange_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfGoodsGroupViewModel = webService.goodsGroupGetGoodsGroups(from, count, sortingFilterId, sortingIds, properties, filterDateFrom, filterDateTo, filterCreatorIds, filterPartnerIds, filterArchivedShowMode, filterName, filterDateFromLastChange)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **sortingFilterId** | **kotlin.Int**| ID фильтра, группы товаров которого будут выбираться первыми. | [optional]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список идентификаторов для первоочередного выбора. | [optional]
 **properties** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. | [optional]
 **filterDateFrom** | **kotlin.String**|  | [optional]
 **filterDateTo** | **kotlin.String**|  | [optional]
 **filterCreatorIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **filterArchivedShowMode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **filterName** | **kotlin.String**|  | [optional]
 **filterDateFromLastChange** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsGroupViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить из архива группу товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id группы товаров.

val result : ResultModel = webService.goodsGroupRestoreGoodsGroup(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id группы товаров. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# TargetGroupSegmentFilterapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetGroupSegmentFilterCalculateTargetGroupSegmentFilter**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterCalculateTargetGroupSegmentFilter) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculate | Запускает расчет фильтра в сегменте целевой аудитории.
[**targetGroupSegmentFilterGetTargetGroupSegmentFilter**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterGetTargetGroupSegmentFilter) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId} | Возвращает фильтр из набора фильтров в сегменте целевой аудитории.
[**targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculation | Возвращает информацию о последнем расчете фильтра в сегменте целевой аудитории.
[**targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/filterInfo | Возвращает информацию о фильтре из набора фильтров в сегменте целевой аудитории.
[**targetGroupSegmentFilterGetTargetGroupSegmentFilters**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterGetTargetGroupSegmentFilters) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters | Возвращает все фильтры из набора фильтров в сегменте целевой аудитории.
[**targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/name | Обновляет название фильтра в сегменте целевой аудитории.
[**targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType**](TargetGroupSegmentFilterapi.md#targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/type | Обновляет тип фильтра в сегменте целевой аудитории.



Запускает расчет фильтра в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.

val result : ResultModel = webService.targetGroupSegmentFilterCalculateTargetGroupSegmentFilter(targetGroupId, segmentId, filterSetId, filterId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает фильтр из набора фильтров в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.

val result : ResultModelOfTargetGroupSegmentFilterViewModel = webService.targetGroupSegmentFilterGetTargetGroupSegmentFilter(targetGroupId, segmentId, filterSetId, filterId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |

### Return type

**ResultModelOfTargetGroupSegmentFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о последнем расчете фильтра в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.

val result : ResultModelOfCalculationModel = webService.targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo(targetGroupId, segmentId, filterSetId, filterId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |

### Return type

**ResultModelOfCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о фильтре из набора фильтров в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.

val result : ResultModelOfFilterViewModel = webService.targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo(targetGroupId, segmentId, filterSetId, filterId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |

### Return type

**ResultModelOfFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает все фильтры из набора фильтров в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.

val result : ResultModelOfListOfTargetGroupSegmentFilterViewModel = webService.targetGroupSegmentFilterGetTargetGroupSegmentFilters(targetGroupId, segmentId, filterSetId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |

### Return type

**ResultModelOfListOfTargetGroupSegmentFilterViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет название фильтра в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.
val model : TargetGroupSegmentFilterNameModel =  // TargetGroupSegmentFilterNameModel | Модель названия фильтра.

val result : ResultModel = webService.targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName(targetGroupId, segmentId, filterSetId, filterId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |
 **model** | **TargetGroupSegmentFilterNameModel**| Модель названия фильтра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет тип фильтра в сегменте целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.
val filterId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор фильтра.
val model : TargetGroupSegmentFilterTypeModel =  // TargetGroupSegmentFilterTypeModel | Модель типа фильтра.

val result : ResultModel = webService.targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType(targetGroupId, segmentId, filterSetId, filterId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |
 **filterId** | **kotlin.Int**| Внутренний идентификатор фильтра. |
 **model** | **TargetGroupSegmentFilterTypeModel**| Модель типа фильтра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# TargetGroupSegmentFilterSetapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet**](TargetGroupSegmentFilterSetapi.md#targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculate | Запускает расчет набора фильтров целевой аудитории.
[**targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet**](TargetGroupSegmentFilterSetapi.md#targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet) | **DELETE** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId} | Удаляет набор фильтров сегмента целевой аудитории.
[**targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet**](TargetGroupSegmentFilterSetapi.md#targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{id} | Возвращает набор фильтров сегмента целевой аудитории по его внутреннему идентификатору.
[**targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo**](TargetGroupSegmentFilterSetapi.md#targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculation | Возвращает информацию о последнем расчете набора фильтров целевой аудитории.
[**targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets**](TargetGroupSegmentFilterSetapi.md#targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets | Возвращает наборы фильтров сегмента целевой аудитории.



Запускает расчет набора фильтров целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterSetapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.

val result : ResultModel = webService.targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet(targetGroupId, segmentId, filterSetId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет набор фильтров сегмента целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterSetapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента целевой аудитории.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.

val result : ResultModel = webService.targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet(targetGroupId, segmentId, filterSetId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента целевой аудитории. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает набор фильтров сегмента целевой аудитории по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterSetapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.

val result : ResultModelOfTargetGroupSegmentFilterSetViewModel = webService.targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet(targetGroupId, segmentId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **id** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |

### Return type

**ResultModelOfTargetGroupSegmentFilterSetViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о последнем расчете набора фильтров целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterSetapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val filterSetId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор набора фильтров.

val result : ResultModelOfCalculationModel = webService.targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo(targetGroupId, segmentId, filterSetId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **filterSetId** | **kotlin.Int**| Внутренний идентификатор набора фильтров. |

### Return type

**ResultModelOfCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает наборы фильтров сегмента целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentFilterSetapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.

val result : ResultModelOfListOfTargetGroupSegmentFilterSetViewModel = webService.targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets(targetGroupId, segmentId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |

### Return type

**ResultModelOfListOfTargetGroupSegmentFilterSetViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


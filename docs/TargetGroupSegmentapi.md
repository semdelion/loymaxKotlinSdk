# TargetGroupSegmentapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetGroupSegmentCalculateTargetGroupSegment**](TargetGroupSegmentapi.md#targetGroupSegmentCalculateTargetGroupSegment) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/calculate | Запускает расчет сегмента целевой аудитории.
[**targetGroupSegmentGetTargetGroupSegment**](TargetGroupSegmentapi.md#targetGroupSegmentGetTargetGroupSegment) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{id} | Возвращает сегмент целевой аудитории по его внутреннему идентификатору.
[**targetGroupSegmentGetTargetGroupSegmentCalculationInfo**](TargetGroupSegmentapi.md#targetGroupSegmentGetTargetGroupSegmentCalculationInfo) | **GET** v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/calculation | Возвращает информацию о последнем расчете сегмента целевой аудитории.
[**targetGroupSegmentGetTargetGroupSegments**](TargetGroupSegmentapi.md#targetGroupSegmentGetTargetGroupSegments) | **GET** v1.2/targetGroups/{targetGroupId}/segments | Возвращает все сегменты целевой аудитории.
[**targetGroupSegmentUpdateTargetGroupSegment**](TargetGroupSegmentapi.md#targetGroupSegmentUpdateTargetGroupSegment) | **POST** v1.2/targetGroups/{targetGroupId}/segments/{segmentId} | Обновляет сегмент целевой аудитории.



Запускает расчет сегмента целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.

val result : ResultModel = webService.targetGroupSegmentCalculateTargetGroupSegment(targetGroupId, segmentId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает сегмент целевой аудитории по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.

val result : ResultModelOfTargetGroupSegmentViewModel = webService.targetGroupSegmentGetTargetGroupSegment(targetGroupId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **id** | **kotlin.Int**| Внутренний идентификатор сегмента. |

### Return type

**ResultModelOfTargetGroupSegmentViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о последнем расчете сегмента целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.

val result : ResultModelOfCalculationModel = webService.targetGroupSegmentGetTargetGroupSegmentCalculationInfo(targetGroupId, segmentId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |

### Return type

**ResultModelOfCalculationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает все сегменты целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel = webService.targetGroupSegmentGetTargetGroupSegments(targetGroupId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет сегмент целевой аудитории.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(TargetGroupSegmentapi::class.java)
val targetGroupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор целевой аудитории.
val segmentId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сегмента.
val model : TargetGroupSegmentModel =  // TargetGroupSegmentModel | Модель сегмента.

val result : ResultModel = webService.targetGroupSegmentUpdateTargetGroupSegment(targetGroupId, segmentId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetGroupId** | **kotlin.Int**| Внутренний идентификатор целевой аудитории. |
 **segmentId** | **kotlin.Int**| Внутренний идентификатор сегмента. |
 **model** | **TargetGroupSegmentModel**| Модель сегмента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


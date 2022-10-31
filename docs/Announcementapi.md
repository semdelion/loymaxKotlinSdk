# Announcementapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcementArchiveAnnouncement**](Announcementapi.md#announcementArchiveAnnouncement) | **POST** v1.2/Announcements/{id}/archive | Отправляет рекламу в архив.
[**announcementCompleteAnnouncement**](Announcementapi.md#announcementCompleteAnnouncement) | **POST** v1.2/Announcements/{id}/complete | Завершает создание рекламы.
[**announcementGetAnnouncement**](Announcementapi.md#announcementGetAnnouncement) | **GET** v1.2/Announcements/{id} | Возвращает информацию о рекламе.
[**announcementGetAnnouncements**](Announcementapi.md#announcementGetAnnouncements) | **GET** v1.2/Announcements | Возвращает список всех реклам для рекламного места.
[**announcementPublishAnnouncement**](Announcementapi.md#announcementPublishAnnouncement) | **POST** v1.2/Announcements/{id}/publish | Публикует рекламу.
[**announcementRestoreAnnouncement**](Announcementapi.md#announcementRestoreAnnouncement) | **POST** v1.2/Announcements/{id}/restore | Восстанавливает рекламу из архива.



Отправляет рекламу в архив.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламы.

val result : ResultModel = webService.announcementArchiveAnnouncement(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает создание рекламы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламы.

val result : ResultModel = webService.announcementCompleteAnnouncement(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о рекламе.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламы.

val result : ResultModelOfAnnouncementModel = webService.announcementGetAnnouncement(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламы. |

### Return type

**ResultModelOfAnnouncementModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список всех реклам для рекламного места.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterTitleSubstr : kotlin.String = filterTitleSubstr_example // kotlin.String | Подстрока для поиска по названию рекламы.
val filterSpaceName : kotlin.String = filterSpaceName_example // kotlin.String | Подстрока для поиска по названию рекламного места.
val filterSpaceLogicalName : kotlin.String = filterSpaceLogicalName_example // kotlin.String | Логическое имя рекламного места.
val filterState : AnnouncementState =  // AnnouncementState | Статус рекламы (Draft — черновик, Ready — готова к публикации, Published — опубликована).
val filterDateFrom : kotlin.String = filterDateFrom_example // kotlin.String | Начальная дата выборки в формате 0000-00-00T00:00:00Z.
val filterDateTo : kotlin.String = filterDateTo_example // kotlin.String | Конечная дата выборки в формате 0000-00-00T00:00:00Z.
val filterArchivedState : ArchivedState =  // ArchivedState | Признак состояния рекламы (true — архивная, false — неархивная).

val result : ResultModelOfPagedViewModelOfAnnouncementModel = webService.announcementGetAnnouncements(from, count, filterTitleSubstr, filterSpaceName, filterSpaceLogicalName, filterState, filterDateFrom, filterDateTo, filterArchivedState)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterTitleSubstr** | **kotlin.String**| Подстрока для поиска по названию рекламы. | [optional]
 **filterSpaceName** | **kotlin.String**| Подстрока для поиска по названию рекламного места. | [optional]
 **filterSpaceLogicalName** | **kotlin.String**| Логическое имя рекламного места. | [optional]
 **filterState** | **AnnouncementState**| Статус рекламы (Draft — черновик, Ready — готова к публикации, Published — опубликована). | [optional] [enum: Draft, Ready, Published]
 **filterDateFrom** | **kotlin.String**| Начальная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterDateTo** | **kotlin.String**| Конечная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterArchivedState** | **ArchivedState**| Признак состояния рекламы (true — архивная, false — неархивная). | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfAnnouncementModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Публикует рекламу.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламы.

val result : ResultModel = webService.announcementPublishAnnouncement(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает рекламу из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Announcementapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор рекламы.

val result : ResultModel = webService.announcementRestoreAnnouncement(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор рекламы. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


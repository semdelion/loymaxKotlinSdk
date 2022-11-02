# FilterTypeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterTypeDeleteFilterType**](FilterTypeapi.md#filterTypeDeleteFilterType) | **POST** v1.2/filterTypes/{id}/Delete | Удалить тип фильтра.
[**filterTypeGetFilterTypes**](FilterTypeapi.md#filterTypeGetFilterTypes) | **GET** v1.2/filterTypes | Возвращает доступные типы фильтров.
[**filterTypeRestoreFilterType**](FilterTypeapi.md#filterTypeRestoreFilterType) | **POST** v1.2/filterTypes/{id}/Restore | Восстановить тип фильтра.



Удалить тип фильтра.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilterTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор типа фильтра.

val result : ResultModel = webService.filterTypeDeleteFilterType(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор типа фильтра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает доступные типы фильтров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilterTypeapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val filterSubstring : kotlin.String = filterSubstring_example // kotlin.String | Подстрока для поиска.
val filterShowMode : ArchivedState =  // ArchivedState | Режим отображения архивных типов фильтров.

val result : ResultModelOfPagedViewModelOfFilterTypeModel = webService.filterTypeGetFilterTypes(from, count, filterSubstring, filterShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **filterSubstring** | **kotlin.String**| Подстрока для поиска. | [optional]
 **filterShowMode** | **ArchivedState**| Режим отображения архивных типов фильтров. | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfFilterTypeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить тип фильтра.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilterTypeapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор типа фильтра.

val result : ResultModel = webService.filterTypeRestoreFilterType(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор типа фильтра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


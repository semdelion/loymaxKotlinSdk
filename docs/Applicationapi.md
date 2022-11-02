# Applicationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationGet**](Applicationapi.md#applicationGet) | **GET** v1.2/OAuth/Applications/{id} | Получает информацию об OAuth-приложении по его идентификатору.
[**applicationGetFilteredPagedList**](Applicationapi.md#applicationGetFilteredPagedList) | **GET** v1.2/OAuth/Applications | Получает список OAuth-приложений.
[**applicationGetSecret**](Applicationapi.md#applicationGetSecret) | **GET** v1.2/OAuth/Applications/{id}/Secret | Получает секретный ключ для OAuth-приложения по его идентификатору.
[**applicationRestore**](Applicationapi.md#applicationRestore) | **POST** v1.2/OAuth/Applications/{id}/Restore | Восстанавливает OAuth-приложение.



Получает информацию об OAuth-приложении по его идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Applicationapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор OAuth-приложения.

val result : ResultModelOfApplicationModel = webService.applicationGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор OAuth-приложения. |

### Return type

**ResultModelOfApplicationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список OAuth-приложений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Applicationapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер элемента, с которого должна начинаться выборка.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterMode : ArchivedState =  // ArchivedState | Режим выбора архивных объектов.
val filterIsOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | Режим прямой сортировки.
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Внутренние идентификаторы Партнеров (Id).

val result : ResultModelOfPagedViewModelOfApplicationModel = webService.applicationGetFilteredPagedList(filterFrom, filterCount, filterMode, filterIsOrderedByAscending, filterPartnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Порядковый номер элемента, с которого должна начинаться выборка. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterMode** | **ArchivedState**| Режим выбора архивных объектов. | [optional] [enum: Archived, NonArchived]
 **filterIsOrderedByAscending** | **kotlin.Boolean**| Режим прямой сортировки. | [optional]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Внутренние идентификаторы Партнеров (Id). | [optional]

### Return type

**ResultModelOfPagedViewModelOfApplicationModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает секретный ключ для OAuth-приложения по его идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Applicationapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор OAuth-приложения.

val result : ResultModelOfString = webService.applicationGetSecret(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор OAuth-приложения. |

### Return type

**ResultModelOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает OAuth-приложение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Applicationapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор OAuth-приложения.

val result : ResultModel = webService.applicationRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор OAuth-приложения. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


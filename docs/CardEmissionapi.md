# CardEmissionapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardEmissionCreateCardEmissionFromCsv**](CardEmissionapi.md#cardEmissionCreateCardEmissionFromCsv) | **PUT** v1.2/emissions/cards/import | Создать выпуск карт из csv файла.
[**cardEmissionGetBatch**](CardEmissionapi.md#cardEmissionGetBatch) | **GET** v1.2/emissions/cards/import/{id} | Возвращает информацию о пакете загрузки.
[**cardEmissionGetCardEmission**](CardEmissionapi.md#cardEmissionGetCardEmission) | **GET** v1.2/emissions/cards/{id} | Получить выпуск карт по id.
[**cardEmissionGetCardEmissionCsv**](CardEmissionapi.md#cardEmissionGetCardEmissionCsv) | **GET** v1.2/emissions/cards/{id}/export | Получить выпуск в виде CSV файла.
[**cardEmissionGetCardEmissionPackingQueueProgress**](CardEmissionapi.md#cardEmissionGetCardEmissionPackingQueueProgress) | **GET** v1.2/emissions/cards/{id}/progress | Получить информацию по фоновой фасовке карт для указанной очереди.
[**cardEmissionGetCardEmissions**](CardEmissionapi.md#cardEmissionGetCardEmissions) | **GET** v1.2/emissions/cards | Получить список выпусков карт.
[**cardEmissionPackCardEmission**](CardEmissionapi.md#cardEmissionPackCardEmission) | **POST** v1.2/emissions/cards/{id}/pack | Расфасовать выпуск карт.



Создать выпуск карт из csv файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val emission : CardEmissionViewModel =  // CardEmissionViewModel | Модель выпуска.

val result : ResultModelOfInt32 = webService.cardEmissionCreateCardEmissionFromCsv(emission)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emission** | **CardEmissionViewModel**| Модель выпуска. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о пакете загрузки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Ид. пакета загрузки.

val result : BatchUploadModel = webService.cardEmissionGetBatch(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Ид. пакета загрузки. |

### Return type

**BatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить выпуск карт по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска.

val result : ResultModelOfCardEmissionViewModel = webService.cardEmissionGetCardEmission(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска. |

### Return type

**ResultModelOfCardEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить выпуск в виде CSV файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска карт.

val result : kotlin.String = webService.cardEmissionGetCardEmissionCsv(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска карт. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить информацию по фоновой фасовке карт для указанной очереди.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска карт.

val result : ResultModelOfCardsPackingQueueInfo = webService.cardEmissionGetCardEmissionPackingQueueProgress(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска карт. |

### Return type

**ResultModelOfCardsPackingQueueInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список выпусков карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterLoyaltyPrograms : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список ПЛ для фильтра по ПЛ.
val filterNameText : kotlin.String = filterNameText_example // kotlin.String | Текст содержащийся в описании.
val filterPackingState : CardEmissionPackingState =  // CardEmissionPackingState | Состояние упаковки.
val filterActivationType : kotlin.Boolean = true // kotlin.Boolean | Тип активации.
val filterCardEmissionType : CardEmissionType =  // CardEmissionType | Тип эмиссии карты.

val result : ResultModelOfPagedViewModelOfCardEmissionViewModel = webService.cardEmissionGetCardEmissions(filterFrom, filterCount, filterLoyaltyPrograms, filterNameText, filterPackingState, filterActivationType, filterCardEmissionType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество. | [optional]
 **filterLoyaltyPrograms** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список ПЛ для фильтра по ПЛ. | [optional]
 **filterNameText** | **kotlin.String**| Текст содержащийся в описании. | [optional]
 **filterPackingState** | **CardEmissionPackingState**| Состояние упаковки. | [optional] [enum: NotPacked, NotRequired, Packed]
 **filterActivationType** | **kotlin.Boolean**| Тип активации. | [optional]
 **filterCardEmissionType** | **CardEmissionType**| Тип эмиссии карты. | [optional] [enum: Generated, Uploaded, UploadTask]

### Return type

**ResultModelOfPagedViewModelOfCardEmissionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Расфасовать выпуск карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardEmissionapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id выпуска карт.

val result : ResultModel = webService.cardEmissionPackCardEmission(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id выпуска карт. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# PartnerDeviceapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerDeviceGetDevice**](PartnerDeviceapi.md#partnerDeviceGetDevice) | **GET** v1.2/partners/{partnerId}/devices/{deviceId} | Возвращает информацию о кассе.
[**partnerDeviceGetPartnerDeviceInfo**](PartnerDeviceapi.md#partnerDeviceGetPartnerDeviceInfo) | **GET** v1.2/partners/{partnerId}/deviceInfo | Возвращает список касс Партнера.
[**partnerDeviceGetPartnerDeviceInfoForOAuthApplication**](PartnerDeviceapi.md#partnerDeviceGetPartnerDeviceInfoForOAuthApplication) | **GET** v1.2/partners/{partnerId}/oauth/devices | Возвращает список касс для привязки к OAuth-приложениям.
[**partnerDeviceGetPartnerDevices**](PartnerDeviceapi.md#partnerDeviceGetPartnerDevices) | **GET** v1.2/partners/{partnerId}/devices | Возвращает список касс Партнера с детальной информацией.
[**partnerDeviceGetPossibleTypes**](PartnerDeviceapi.md#partnerDeviceGetPossibleTypes) | **GET** v1.2/partners/{partnerId}/devices/possibleTypes | Возвращает список типов кассы.
[**partnerDeviceRestore**](PartnerDeviceapi.md#partnerDeviceRestore) | **POST** v1.2/partners/{partnerId}/devices/{deviceId}/restore | Восстанавливает кассу из архива.



Возвращает информацию о кассе.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val deviceId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор кассы.

val result : ResultModelOfDeviceViewModel = webService.partnerDeviceGetDevice(partnerId, deviceId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **deviceId** | **kotlin.Int**| Внутренний идентификатор кассы. |

### Return type

**ResultModelOfDeviceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список касс Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Список внутренних идентификаторов магазинов.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.
val code : kotlin.String = code_example // kotlin.String | Код.
val mode : ArchivedState =  // ArchivedState | Признак состояния кассы.
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | Режим прямой сортировки (true — да, false — нет).

val result : ResultModelOfPagedViewModelOfDeviceBriefViewModel = webService.partnerDeviceGetPartnerDeviceInfo(partnerId, from, count, merchantIds, legalId, code, mode, isOrderedByAscending)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **merchantIds** | **kotlin.String**| Список внутренних идентификаторов магазинов. | [optional]
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. | [optional]
 **code** | **kotlin.String**| Код. | [optional]
 **mode** | **ArchivedState**| Признак состояния кассы. | [optional] [enum: Archived, NonArchived]
 **isOrderedByAscending** | **kotlin.Boolean**| Режим прямой сортировки (true — да, false — нет). | [optional]

### Return type

**ResultModelOfPagedViewModelOfDeviceBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список касс для привязки к OAuth-приложениям.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterLogicalId : kotlin.String = filterLogicalId_example // kotlin.String | Логическое имя кассы.
val filterOAuthApplicationId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор OAuth-приложения.

val result : ResultModelOfPagedViewModelOfDeviceBriefViewModel = webService.partnerDeviceGetPartnerDeviceInfoForOAuthApplication(partnerId, filterFrom, filterCount, filterLogicalId, filterOAuthApplicationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterLogicalId** | **kotlin.String**| Логическое имя кассы. | [optional]
 **filterOAuthApplicationId** | **kotlin.Int**| Внутренний идентификатор OAuth-приложения. | [optional]

### Return type

**ResultModelOfPagedViewModelOfDeviceBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список касс Партнера с детальной информацией.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val merchantIds : kotlin.String = merchantIds_example // kotlin.String | Список внутренних идентификаторов магазинов.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.
val code : kotlin.String = code_example // kotlin.String | Код.
val mode : ArchivedState =  // ArchivedState | Признак состояния кассы.
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | Режим прямой сортировки (true — да, false — нет).

val result : ResultModelOfPagedViewModelOfDeviceViewModel = webService.partnerDeviceGetPartnerDevices(partnerId, from, count, merchantIds, legalId, code, mode, isOrderedByAscending)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **merchantIds** | **kotlin.String**| Список внутренних идентификаторов магазинов. | [optional]
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. | [optional]
 **code** | **kotlin.String**| Код. | [optional]
 **mode** | **ArchivedState**| Признак состояния кассы. | [optional] [enum: Archived, NonArchived]
 **isOrderedByAscending** | **kotlin.Boolean**| Режим прямой сортировки (true — да, false — нет). | [optional]

### Return type

**ResultModelOfPagedViewModelOfDeviceViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список типов кассы.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val nameSubstr : kotlin.String = nameSubstr_example // kotlin.String | Подстрока для поиска по названию типа кассы.

val result : ResultModelOfListOfDeviceTypeViewModel = webService.partnerDeviceGetPossibleTypes(partnerId, count, nameSubstr)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. |
 **nameSubstr** | **kotlin.String**| Подстрока для поиска по названию типа кассы. | [optional]

### Return type

**ResultModelOfListOfDeviceTypeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает кассу из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerDeviceapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val deviceId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор кассы.
val changeCode : kotlin.Boolean = true // kotlin.Boolean | Необходимость изменения кода кассы (true — да, false — нет).

val result : ResultModel = webService.partnerDeviceRestore(partnerId, deviceId, changeCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **deviceId** | **kotlin.Int**| Внутренний идентификатор кассы. |
 **changeCode** | **kotlin.Boolean**| Необходимость изменения кода кассы (true — да, false — нет). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


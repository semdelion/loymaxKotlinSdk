# PartnerLegalapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerLegalGetAccounts**](PartnerLegalapi.md#partnerLegalGetAccounts) | **GET** v1.2/partners/{partnerId}/legals/{legalId}/accounts | Возвращает информацию о дебетовых счетах, принадлежащих юридическому лицу.
[**partnerLegalGetLegal**](PartnerLegalapi.md#partnerLegalGetLegal) | **GET** v1.2/partners/{partnerId}/legals/{legalId} | Возвращает информацию о юридическом лице Партнера.
[**partnerLegalGetLegalBalances**](PartnerLegalapi.md#partnerLegalGetLegalBalances) | **GET** v1.2/partners/{partnerId}/legals/{legalId}/balances | Возвращает информацию о балансах юридического лица.
[**partnerLegalGetLegals**](PartnerLegalapi.md#partnerLegalGetLegals) | **GET** v1.2/partners/{partnerId}/legals | 
[**partnerLegalRestoreLegal**](PartnerLegalapi.md#partnerLegalRestoreLegal) | **POST** v1.2/partners/{partnerId}/legals/{legalId}/restore | Восстанавливает из архива юридическое лицо Партнера.



Возвращает информацию о дебетовых счетах, принадлежащих юридическому лицу.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerLegalapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Программы лояльности.
val name : kotlin.String = name_example // kotlin.String | Подстрока для поиска по названию валюты.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfAccountViewModel = webService.partnerLegalGetAccounts(partnerId, legalId, loyaltyProgramId, name, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. |
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор Программы лояльности. |
 **name** | **kotlin.String**| Подстрока для поиска по названию валюты. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfAccountViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о юридическом лице Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerLegalapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.

val result : ResultModelOfLegalViewModel = webService.partnerLegalGetLegal(partnerId, legalId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. |

### Return type

**ResultModelOfLegalViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о балансах юридического лица.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerLegalapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Программы лояльности.

val result : ResultModelOfListOfMoneyViewModel = webService.partnerLegalGetLegalBalances(partnerId, legalId, loyaltyProgramId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. |
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор Программы лояльности. |

### Return type

**ResultModelOfListOfMoneyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerLegalapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val nameSubstring : kotlin.String = nameSubstring_example // kotlin.String | 
val logicalNameSubstring : kotlin.String = logicalNameSubstring_example // kotlin.String | 
val status : ArchivedState =  // ArchivedState | 
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val code : kotlin.String = code_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfLegalViewModel = webService.partnerLegalGetLegals(partnerId, from, count, nameSubstring, logicalNameSubstring, status, sortingIds, code)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**|  |
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **nameSubstring** | **kotlin.String**|  | [optional]
 **logicalNameSubstring** | **kotlin.String**|  | [optional]
 **status** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **code** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfLegalViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает из архива юридическое лицо Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerLegalapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val legalId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор юридического лица.
val changeCode : kotlin.Boolean = true // kotlin.Boolean | Необходимость изменения кода юридического лица (true — да, false — нет).

val result : ResultModel = webService.partnerLegalRestoreLegal(partnerId, legalId, changeCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **legalId** | **kotlin.Int**| Внутренний идентификатор юридического лица. |
 **changeCode** | **kotlin.Boolean**| Необходимость изменения кода юридического лица (true — да, false — нет). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


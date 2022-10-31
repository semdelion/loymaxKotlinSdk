# PartnerCatalogapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerCatalogGeneratePassword**](PartnerCatalogapi.md#partnerCatalogGeneratePassword) | **GET** v1.2/partners/{partnerId}/catalogs/{catalogId}/generatePassword | Генерирует новый пароль для каталога.
[**partnerCatalogGet**](PartnerCatalogapi.md#partnerCatalogGet) | **GET** v1.2/partners/{partnerId}/catalogs/{catalogId} | Возвращает информацию о каталоге Партнера по внутреннему идентифкатору каталога.
[**partnerCatalogGetByCatalogUid**](PartnerCatalogapi.md#partnerCatalogGetByCatalogUid) | **GET** v1.2/partners/{partnerUid}/catalogs/{catalogUid} | Возвращает информацию о каталоге Партнера по внешнему идентифкатору каталога.
[**partnerCatalogGetPartnerCatalogs**](PartnerCatalogapi.md#partnerCatalogGetPartnerCatalogs) | **GET** v1.2/partners/{partnerId}/catalogs | Возвращает список каталогов Партнера по внутреннему идентификатору.
[**partnerCatalogGetPartnersByPartnerUidCatalogs**](PartnerCatalogapi.md#partnerCatalogGetPartnersByPartnerUidCatalogs) | **GET** v1.2/partners/{partnerUid}/catalogs | Возвращает список каталогов Партнера по внешнему идентификатору.



Генерирует новый пароль для каталога.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerCatalogapi::class.java)
val partnerId : kotlin.String = partnerId_example // kotlin.String | 
val catalogId : kotlin.String = catalogId_example // kotlin.String | 

val result : ResultModelOfString = webService.partnerCatalogGeneratePassword(partnerId, catalogId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.String**|  |
 **catalogId** | **kotlin.String**|  |

### Return type

**ResultModelOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о каталоге Партнера по внутреннему идентифкатору каталога.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerCatalogapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val catalogId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор каталога.

val result : ResultModelOfPartnerCatalogViewModel = webService.partnerCatalogGet(partnerId, catalogId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **catalogId** | **kotlin.Int**| Внутренний идентификатор каталога. |

### Return type

**ResultModelOfPartnerCatalogViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о каталоге Партнера по внешнему идентифкатору каталога.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerCatalogapi::class.java)
val partnerUid : kotlin.String = partnerUid_example // kotlin.String | Внешний идентификатор Партнера.
val catalogUid : kotlin.String = catalogUid_example // kotlin.String | Внешний идентификатор каталога.

val result : ResultModelOfPartnerCatalogViewModel = webService.partnerCatalogGetByCatalogUid(partnerUid, catalogUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerUid** | **kotlin.String**| Внешний идентификатор Партнера. |
 **catalogUid** | **kotlin.String**| Внешний идентификатор каталога. |

### Return type

**ResultModelOfPartnerCatalogViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список каталогов Партнера по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerCatalogapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val name : kotlin.String = name_example // kotlin.String | Название каталога.

val result : ResultModelOfListOfPartnerCatalogViewModel = webService.partnerCatalogGetPartnerCatalogs(partnerId, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **name** | **kotlin.String**| Название каталога. | [optional]

### Return type

**ResultModelOfListOfPartnerCatalogViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список каталогов Партнера по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerCatalogapi::class.java)
val partnerUid : kotlin.String = partnerUid_example // kotlin.String | Внешний идентификатор Партнера.
val name : kotlin.String = name_example // kotlin.String | Название каталога.

val result : ResultModelOfListOfPartnerCatalogViewModel = webService.partnerCatalogGetPartnersByPartnerUidCatalogs(partnerUid, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerUid** | **kotlin.String**| Внешний идентификатор Партнера. |
 **name** | **kotlin.String**| Название каталога. | [optional]

### Return type

**ResultModelOfListOfPartnerCatalogViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# CatalogAttributeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogAttributeGetByPartner**](CatalogAttributeapi.md#catalogAttributeGetByPartner) | **GET** v1.2/catalogs/{partnerId}/attributes | Атрибуты в каталоге партнера.
[**catalogAttributeGetValues**](CatalogAttributeapi.md#catalogAttributeGetValues) | **GET** v1.2/catalogs/{partnerId}/attributes/{attributeId}/values | Получает список значений атрибута в выбранном диапазоне.



Атрибуты в каталоге партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CatalogAttributeapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.

val result : ResultModelOfListOfCatalogAttributeViewModel = webService.catalogAttributeGetByPartner(partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Id партнера. |

### Return type

**ResultModelOfListOfCatalogAttributeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список значений атрибута в выбранном диапазоне.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CatalogAttributeapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Id партнера.
val attributeId : kotlin.Int = 56 // kotlin.Int | ID атрибута.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val nameSubstr : kotlin.String = nameSubstr_example // kotlin.String | Подстрока поиска по названию.

val result : ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel = webService.catalogAttributeGetValues(partnerId, attributeId, from, count, nameSubstr)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Id партнера. |
 **attributeId** | **kotlin.Int**| ID атрибута. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **nameSubstr** | **kotlin.String**| Подстрока поиска по названию. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


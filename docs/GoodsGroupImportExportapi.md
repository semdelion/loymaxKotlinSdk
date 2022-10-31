# GoodsGroupImportExportapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goodsGroupImportExportExportGoodsGroup**](GoodsGroupImportExportapi.md#goodsGroupImportExportExportGoodsGroup) | **GET** v1.2/goodsGroups/{goodsGroupId}/Export | Экспортировать группу товаров по Id.
[**goodsGroupImportExportExportGoodsGroups**](GoodsGroupImportExportapi.md#goodsGroupImportExportExportGoodsGroups) | **GET** v1.2/goodsGroups/Export | Экспортировать группы товаров.
[**goodsGroupImportExportImportGoodsGroups**](GoodsGroupImportExportapi.md#goodsGroupImportExportImportGoodsGroups) | **POST** v1.2/goodsGroups/Import | Импортировать группы товаров.



Экспортировать группу товаров по Id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupImportExportapi::class.java)
val goodsGroupId : kotlin.Int = 56 // kotlin.Int | Id группы товаров.

val result : kotlin.String = webService.goodsGroupImportExportExportGoodsGroup(goodsGroupId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsGroupId** | **kotlin.Int**| Id группы товаров. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Экспортировать группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupImportExportapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val dateFrom : kotlin.String = dateFrom_example // kotlin.String | 
val dateTo : kotlin.String = dateTo_example // kotlin.String | 
val creatorIds : kotlin.String = creatorIds_example // kotlin.String | 
val partnerIds : kotlin.String = partnerIds_example // kotlin.String | 
val archivedShowMode : ArchivedState =  // ArchivedState | 
val name : kotlin.String = name_example // kotlin.String | 
val dateFromLastChange : kotlin.String = dateFromLastChange_example // kotlin.String | 

val result : kotlin.String = webService.goodsGroupImportExportExportGoodsGroups(from, count, dateFrom, dateTo, creatorIds, partnerIds, archivedShowMode, name, dateFromLastChange)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **dateFrom** | **kotlin.String**|  | [optional]
 **dateTo** | **kotlin.String**|  | [optional]
 **creatorIds** | **kotlin.String**|  | [optional]
 **partnerIds** | **kotlin.String**|  | [optional]
 **archivedShowMode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **name** | **kotlin.String**|  | [optional]
 **dateFromLastChange** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Импортировать группы товаров.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GoodsGroupImportExportapi::class.java)
val importModel : GoodsGroupsImportModel =  // GoodsGroupsImportModel | Модель импортируемых групп товаров.
val rewriteExisting : kotlin.Boolean = true // kotlin.Boolean | Перезаписать ли существующую ГТ.

val result : ResultModelOfGoodsGroupsImportResponse = webService.goodsGroupImportExportImportGoodsGroups(importModel, rewriteExisting)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importModel** | **GoodsGroupsImportModel**| Модель импортируемых групп товаров. |
 **rewriteExisting** | **kotlin.Boolean**| Перезаписать ли существующую ГТ. | [optional]

### Return type

**ResultModelOfGoodsGroupsImportResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


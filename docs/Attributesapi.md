# Attributesapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attributesGetAttributeEntities**](Attributesapi.md#attributesGetAttributeEntities) | **GET** v1.2/attribute/{key}/entities | Возвращает информацию о сущностях, к которым привязан атрибут с указанным ключом.
[**attributesGetAttributes**](Attributesapi.md#attributesGetAttributes) | **GET** v1.2/{entityType}/attributes | Возвращает все атрибуты типа сущности.
[**attributesGetByEntityTypeByEntityIdAttributes**](Attributesapi.md#attributesGetByEntityTypeByEntityIdAttributes) | **GET** v1.2/{entityType}/{entityId}/attributes | Возвращает значения атрибутов сущности.
[**attributesUpdateAttribute**](Attributesapi.md#attributesUpdateAttribute) | **POST** v1.2/{entityType}/{entityId}/attributes/{attributeId} | Обновляет значение атрибута сущности.



Возвращает информацию о сущностях, к которым привязан атрибут с указанным ключом.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Attributesapi::class.java)
val key : kotlin.String = key_example // kotlin.String | Ключ атрибута.

val result : ResultModelOfListOfEntityInfoModel = webService.attributesGetAttributeEntities(key)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| Ключ атрибута. |

### Return type

**ResultModelOfListOfEntityInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает все атрибуты типа сущности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Attributesapi::class.java)
val entityType : EntityType =  // EntityType | Тип сущности, для которой предназначен атрибут (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).

val result : ResultModelOfListOfEntityAttributeModel = webService.attributesGetAttributes(entityType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **EntityType**| Тип сущности, для которой предназначен атрибут (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании). | [enum: Offers, Mailings, TargetGroups, GoodsGroups, MarketingCampaigns]

### Return type

**ResultModelOfListOfEntityAttributeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает значения атрибутов сущности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Attributesapi::class.java)
val entityType : EntityType =  // EntityType | Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).
val entityId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сущности.

val result : ResultModelOfListOfEntityAttributeWithValueModel = webService.attributesGetByEntityTypeByEntityIdAttributes(entityType, entityId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **EntityType**| Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании). | [enum: Offers, Mailings, TargetGroups, GoodsGroups, MarketingCampaigns]
 **entityId** | **kotlin.Int**| Внутренний идентификатор сущности. |

### Return type

**ResultModelOfListOfEntityAttributeWithValueModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет значение атрибута сущности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Attributesapi::class.java)
val entityType : EntityType =  // EntityType | Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).
val entityId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор сущности.
val attributeId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор атрибута.
val `value` : kotlin.String = `value`_example // kotlin.String | Новое значение атрибута.

val result : ResultModel = webService.attributesUpdateAttribute(entityType, entityId, attributeId, `value`)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **EntityType**| Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании). | [enum: Offers, Mailings, TargetGroups, GoodsGroups, MarketingCampaigns]
 **entityId** | **kotlin.Int**| Внутренний идентификатор сущности. |
 **attributeId** | **kotlin.Int**| Внутренний идентификатор атрибута. |
 **&#x60;value&#x60;** | **kotlin.String**| Новое значение атрибута. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


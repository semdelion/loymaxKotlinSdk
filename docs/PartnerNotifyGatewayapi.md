# PartnerNotifyGatewayapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerNotifyGatewayDeletePartnerGateway**](PartnerNotifyGatewayapi.md#partnerNotifyGatewayDeletePartnerGateway) | **DELETE** v1.2/partnerNotifyGateways/{id} | Удаляет шлюз Партнера.
[**partnerNotifyGatewayGetPartnerAvailableGateway**](PartnerNotifyGatewayapi.md#partnerNotifyGatewayGetPartnerAvailableGateway) | **GET** v1.2/partnerNotifyGateways/partner/{partnerId} | Возвращает список шлюзов, которые можно добавить Партнеру.
[**partnerNotifyGatewayGetPartnerGateway**](PartnerNotifyGatewayapi.md#partnerNotifyGatewayGetPartnerGateway) | **GET** v1.2/partnerNotifyGateways/{gatewayId} | Возвращает информацию о шлюзе по его внутреннему идентификатору.
[**partnerNotifyGatewayGetPartnerGateways**](PartnerNotifyGatewayapi.md#partnerNotifyGatewayGetPartnerGateways) | **GET** v1.2/partnerNotifyGateways | Возвращает список шлюзов Партнера.



Удаляет шлюз Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerNotifyGatewayapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор шлюза.

val result : ResultModel = webService.partnerNotifyGatewayDeletePartnerGateway(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор шлюза. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список шлюзов, которые можно добавить Партнеру.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerNotifyGatewayapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfGatewayModel = webService.partnerNotifyGatewayGetPartnerAvailableGateway(partnerId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfGatewayModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о шлюзе по его внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerNotifyGatewayapi::class.java)
val gatewayId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор шлюза.

val result : ResultModelOfPartnerNotifyGatewayViewModel = webService.partnerNotifyGatewayGetPartnerGateway(gatewayId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **kotlin.Int**| Внутренний идентификатор шлюза. |

### Return type

**ResultModelOfPartnerNotifyGatewayViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список шлюзов Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerNotifyGatewayapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel = webService.partnerNotifyGatewayGetPartnerGateways(partnerId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


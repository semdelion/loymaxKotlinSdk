# LoyaltyProgramapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loyaltyProgramAddPartner**](LoyaltyProgramapi.md#loyaltyProgramAddPartner) | **PUT** v1.2/LoyaltyPrograms/{id}/Partners/{partnerId} | Добавить партнёра в программу лояльности.
[**loyaltyProgramGet**](LoyaltyProgramapi.md#loyaltyProgramGet) | **GET** v1.2/LoyaltyPrograms | Получить список программ лояльности.
[**loyaltyProgramGetLoyaltyProgramsById**](LoyaltyProgramapi.md#loyaltyProgramGetLoyaltyProgramsById) | **GET** v1.2/LoyaltyPrograms/{id} | Получить программу лояльности по системному идентификатору.
[**loyaltyProgramGetPartners**](LoyaltyProgramapi.md#loyaltyProgramGetPartners) | **GET** v1.2/LoyaltyPrograms/{id}/Partners | Получить список партнёров программы лояльности.



Добавить партнёра в программу лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.
val partnerId : kotlin.Int = 56 // kotlin.Int | Идентификатор партнёра.

val result : ResultModel = webService.loyaltyProgramAddPartner(id, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор программы лояльности. |
 **partnerId** | **kotlin.Int**| Идентификатор партнёра. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список программ лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | С какого элемента брать.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько элементов брать.
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список Id партнёров.
val filterName : kotlin.String = filterName_example // kotlin.String | Подстрока для фильтрации по имени.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список идентификаторов для первоочередного выбора.

val result : ResultModelOfPagedViewModelOfLoyaltyProgramModel = webService.loyaltyProgramGet(filterFrom, filterCount, filterPartnerIds, filterName, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| С какого элемента брать. | [optional]
 **filterCount** | **kotlin.Int**| Сколько элементов брать. | [optional]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список Id партнёров. | [optional]
 **filterName** | **kotlin.String**| Подстрока для фильтрации по имени. | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список идентификаторов для первоочередного выбора. | [optional]

### Return type

**ResultModelOfPagedViewModelOfLoyaltyProgramModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить программу лояльности по системному идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.

val result : ResultModelOfLoyaltyProgramModel = webService.loyaltyProgramGetLoyaltyProgramsById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор программы лояльности. |

### Return type

**ResultModelOfLoyaltyProgramModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список партнёров программы лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoyaltyProgramapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор программы лояльности.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfPartnerModel = webService.loyaltyProgramGetPartners(id, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор программы лояльности. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPartnerModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


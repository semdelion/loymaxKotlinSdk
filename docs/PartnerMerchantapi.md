# PartnerMerchantapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**partnerMerchantGetAvailableMerchants**](PartnerMerchantapi.md#partnerMerchantGetAvailableMerchants) | **GET** v1.2/partners/merchants/availableMerchants | 
[**partnerMerchantGetAvailableMerchantsCountByBrand**](PartnerMerchantapi.md#partnerMerchantGetAvailableMerchantsCountByBrand) | **GET** v1.2/partners/merchants/availableMerchantsCountByBrand | 
[**partnerMerchantGetMerchant**](PartnerMerchantapi.md#partnerMerchantGetMerchant) | **GET** v1.2/partners/{partnerId}/merchants/{merchantId} | Возвращает информацию о торговой точке по внутренним идентификаторам Партнера и торговой точки.
[**partnerMerchantGetMerchantAdditionalInfoNames**](PartnerMerchantapi.md#partnerMerchantGetMerchantAdditionalInfoNames) | **GET** v1.2/partners/merchants/AdditionalInfoNames | 
[**partnerMerchantGetMerchantAdditionalInfoValues**](PartnerMerchantapi.md#partnerMerchantGetMerchantAdditionalInfoValues) | **GET** v1.2/partners/merchants/AdditionalInfoValues | 
[**partnerMerchantGetMerchants**](PartnerMerchantapi.md#partnerMerchantGetMerchants) | **GET** v1.2/partners/{partnerId}/merchants | 
[**partnerMerchantGetMerchantsCountByBrand**](PartnerMerchantapi.md#partnerMerchantGetMerchantsCountByBrand) | **GET** v1.2/partners/{partnerId}/merchants/ByBrands | 
[**partnerMerchantGetPartnersByPartnerUidMerchantsByMerchantUid**](PartnerMerchantapi.md#partnerMerchantGetPartnersByPartnerUidMerchantsByMerchantUid) | **GET** v1.2/partners/{partnerUid}/merchants/{merchantUid} | Возвращает информацию о торговой точке по внешним идентификаторам Партнера и торговой точки.
[**partnerMerchantGetPaymentLimits**](PartnerMerchantapi.md#partnerMerchantGetPaymentLimits) | **GET** v1.2/partners/{partnerId}/merchants/{merchantId}/paymentLimit | Возвращает информацию об ограничениях списания бонусов торговой точки.
[**partnerMerchantRestore**](PartnerMerchantapi.md#partnerMerchantRestore) | **POST** v1.2/partners/{partnerId}/merchants/{merchantId}/restore | Восстановливает торговую точку из архива.





### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val permission : kotlin.String = permission_example // kotlin.String | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val nameSubstring : kotlin.String = nameSubstring_example // kotlin.String | 
val internalNameSubstring : kotlin.String = internalNameSubstring_example // kotlin.String | 
val brandNameSubstring : kotlin.String = brandNameSubstring_example // kotlin.String | 
val brandId : kotlin.Int = 56 // kotlin.Int | 
val locationSubstring : kotlin.String = locationSubstring_example // kotlin.String | 
val uids : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val additionalInfoKey : kotlin.String = additionalInfoKey_example // kotlin.String | 
val additionalInfoValue : kotlin.String = additionalInfoValue_example // kotlin.String | 
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | 
val mode : ArchivedState =  // ArchivedState | 
val merchantIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val partnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfMerchantLineViewModel = webService.partnerMerchantGetAvailableMerchants(permission, from, count, nameSubstring, internalNameSubstring, brandNameSubstring, brandId, locationSubstring, uids, additionalInfoKey, additionalInfoValue, isOrderedByAscending, mode, merchantIds, sortingIds, partnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **kotlin.String**|  |
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **nameSubstring** | **kotlin.String**|  | [optional]
 **internalNameSubstring** | **kotlin.String**|  | [optional]
 **brandNameSubstring** | **kotlin.String**|  | [optional]
 **brandId** | **kotlin.Int**|  | [optional]
 **locationSubstring** | **kotlin.String**|  | [optional]
 **uids** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **additionalInfoKey** | **kotlin.String**|  | [optional]
 **additionalInfoValue** | **kotlin.String**|  | [optional]
 **isOrderedByAscending** | **kotlin.Boolean**|  | [optional]
 **mode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **merchantIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **partnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfMerchantLineViewModel**

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
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val permission : kotlin.String = permission_example // kotlin.String | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val nameSubstring : kotlin.String = nameSubstring_example // kotlin.String | 
val internalNameSubstring : kotlin.String = internalNameSubstring_example // kotlin.String | 
val brandNameSubstring : kotlin.String = brandNameSubstring_example // kotlin.String | 
val brandId : kotlin.Int = 56 // kotlin.Int | 
val locationSubstring : kotlin.String = locationSubstring_example // kotlin.String | 
val uids : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val additionalInfoKey : kotlin.String = additionalInfoKey_example // kotlin.String | 
val additionalInfoValue : kotlin.String = additionalInfoValue_example // kotlin.String | 
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | 
val mode : ArchivedState =  // ArchivedState | 
val merchantIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val partnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfBrandLineViewModel = webService.partnerMerchantGetAvailableMerchantsCountByBrand(permission, from, count, nameSubstring, internalNameSubstring, brandNameSubstring, brandId, locationSubstring, uids, additionalInfoKey, additionalInfoValue, isOrderedByAscending, mode, merchantIds, sortingIds, partnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **kotlin.String**|  |
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **nameSubstring** | **kotlin.String**|  | [optional]
 **internalNameSubstring** | **kotlin.String**|  | [optional]
 **brandNameSubstring** | **kotlin.String**|  | [optional]
 **brandId** | **kotlin.Int**|  | [optional]
 **locationSubstring** | **kotlin.String**|  | [optional]
 **uids** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **additionalInfoKey** | **kotlin.String**|  | [optional]
 **additionalInfoValue** | **kotlin.String**|  | [optional]
 **isOrderedByAscending** | **kotlin.Boolean**|  | [optional]
 **mode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **merchantIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **partnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfBrandLineViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о торговой точке по внутренним идентификаторам Партнера и торговой точки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val merchantId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор торговой точки.

val result : ResultModelOfMerchantViewModel = webService.partnerMerchantGetMerchant(partnerId, merchantId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **merchantId** | **kotlin.Int**| Внутренний идентификатор торговой точки. |

### Return type

**ResultModelOfMerchantViewModel**

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
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val permission : kotlin.String = permission_example // kotlin.String | 
val brandIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val partnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfListOfString = webService.partnerMerchantGetMerchantAdditionalInfoNames(permission, brandIds, partnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **kotlin.String**|  |
 **brandIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **partnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfListOfString**

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
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val permission : kotlin.String = permission_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val brandIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val partnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfListOfString = webService.partnerMerchantGetMerchantAdditionalInfoValues(permission, name, brandIds, partnerIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permission** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **brandIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **partnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfListOfString**

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
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val nameSubstring : kotlin.String = nameSubstring_example // kotlin.String | 
val internalNameSubstring : kotlin.String = internalNameSubstring_example // kotlin.String | 
val brandNameSubstring : kotlin.String = brandNameSubstring_example // kotlin.String | 
val brandId : kotlin.Int = 56 // kotlin.Int | 
val locationSubstring : kotlin.String = locationSubstring_example // kotlin.String | 
val uids : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val additionalInfoKey : kotlin.String = additionalInfoKey_example // kotlin.String | 
val additionalInfoValue : kotlin.String = additionalInfoValue_example // kotlin.String | 
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | 
val mode : ArchivedState =  // ArchivedState | 
val merchantIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfMerchantLineViewModel = webService.partnerMerchantGetMerchants(partnerId, from, count, nameSubstring, internalNameSubstring, brandNameSubstring, brandId, locationSubstring, uids, additionalInfoKey, additionalInfoValue, isOrderedByAscending, mode, merchantIds, sortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**|  |
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **nameSubstring** | **kotlin.String**|  | [optional]
 **internalNameSubstring** | **kotlin.String**|  | [optional]
 **brandNameSubstring** | **kotlin.String**|  | [optional]
 **brandId** | **kotlin.Int**|  | [optional]
 **locationSubstring** | **kotlin.String**|  | [optional]
 **uids** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **additionalInfoKey** | **kotlin.String**|  | [optional]
 **additionalInfoValue** | **kotlin.String**|  | [optional]
 **isOrderedByAscending** | **kotlin.Boolean**|  | [optional]
 **mode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **merchantIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfMerchantLineViewModel**

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
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | 
val from : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Int = 56 // kotlin.Int | 
val nameSubstring : kotlin.String = nameSubstring_example // kotlin.String | 
val internalNameSubstring : kotlin.String = internalNameSubstring_example // kotlin.String | 
val brandNameSubstring : kotlin.String = brandNameSubstring_example // kotlin.String | 
val brandId : kotlin.Int = 56 // kotlin.Int | 
val locationSubstring : kotlin.String = locationSubstring_example // kotlin.String | 
val uids : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | 
val additionalInfoKey : kotlin.String = additionalInfoKey_example // kotlin.String | 
val additionalInfoValue : kotlin.String = additionalInfoValue_example // kotlin.String | 
val isOrderedByAscending : kotlin.Boolean = true // kotlin.Boolean | 
val mode : ArchivedState =  // ArchivedState | 
val merchantIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val sortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfBrandLineViewModel = webService.partnerMerchantGetMerchantsCountByBrand(partnerId, from, count, nameSubstring, internalNameSubstring, brandNameSubstring, brandId, locationSubstring, uids, additionalInfoKey, additionalInfoValue, isOrderedByAscending, mode, merchantIds, sortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**|  |
 **from** | **kotlin.Int**|  | [optional]
 **count** | **kotlin.Int**|  | [optional]
 **nameSubstring** | **kotlin.String**|  | [optional]
 **internalNameSubstring** | **kotlin.String**|  | [optional]
 **brandNameSubstring** | **kotlin.String**|  | [optional]
 **brandId** | **kotlin.Int**|  | [optional]
 **locationSubstring** | **kotlin.String**|  | [optional]
 **uids** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**|  | [optional]
 **additionalInfoKey** | **kotlin.String**|  | [optional]
 **additionalInfoValue** | **kotlin.String**|  | [optional]
 **isOrderedByAscending** | **kotlin.Boolean**|  | [optional]
 **mode** | **ArchivedState**|  | [optional] [enum: Archived, NonArchived]
 **merchantIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **sortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfBrandLineViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о торговой точке по внешним идентификаторам Партнера и торговой точки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerUid : kotlin.String = partnerUid_example // kotlin.String | Внешний идентификатор Партнера.
val merchantUid : kotlin.String = merchantUid_example // kotlin.String | Внешний идентификатор торговой точки.

val result : ResultModelOfMerchantViewModel = webService.partnerMerchantGetPartnersByPartnerUidMerchantsByMerchantUid(partnerUid, merchantUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerUid** | **kotlin.String**| Внешний идентификатор Партнера. |
 **merchantUid** | **kotlin.String**| Внешний идентификатор торговой точки. |

### Return type

**ResultModelOfMerchantViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об ограничениях списания бонусов торговой точки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val merchantId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор торговой точки.

val result : ResultModelOfListOfPaymentLimitViewModel = webService.partnerMerchantGetPaymentLimits(partnerId, merchantId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **merchantId** | **kotlin.Int**| Внутренний идентификатор торговой точки. |

### Return type

**ResultModelOfListOfPaymentLimitViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановливает торговую точку из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PartnerMerchantapi::class.java)
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.
val merchantId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор торговой точки.
val changeCode : kotlin.Boolean = true // kotlin.Boolean | Изменить код (true — изменить, false — не изменять).

val result : ResultModel = webService.partnerMerchantRestore(partnerId, merchantId, changeCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. |
 **merchantId** | **kotlin.Int**| Внутренний идентификатор торговой точки. |
 **changeCode** | **kotlin.Boolean**| Изменить код (true — изменить, false — не изменять). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


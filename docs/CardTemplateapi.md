# CardTemplateapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardTemplateGetTemplateSets**](CardTemplateapi.md#cardTemplateGetTemplateSets) | **GET** v1.2/Cards/template/sets | 
[**cardTemplateGetTemplates**](CardTemplateapi.md#cardTemplateGetTemplates) | **GET** v1.2/Cards/template/sets/{id} | 





### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CardTemplateapi::class.java)
val filterName : kotlin.String = filterName_example // kotlin.String | 
val filterIsDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val filterFrom : kotlin.Int = 56 // kotlin.Int | 
val filterCount : kotlin.Int = 56 // kotlin.Int | 
val filterLoyaltyProgramsIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterPartnersIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterAuthorsIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 

val result : ResultModelOfPagedViewModelOfTemplateSetModel = webService.cardTemplateGetTemplateSets(filterName, filterIsDeleted, filterFrom, filterCount, filterLoyaltyProgramsIds, filterPartnersIds, filterAuthorsIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **kotlin.String**|  | [optional]
 **filterIsDeleted** | **kotlin.Boolean**|  | [optional]
 **filterFrom** | **kotlin.Int**|  | [optional]
 **filterCount** | **kotlin.Int**|  | [optional]
 **filterLoyaltyProgramsIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterPartnersIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterAuthorsIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfTemplateSetModel**

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
val webService = apiClient.createWebservice(CardTemplateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | 

val result : ResultModelOfTemplateSetModel = webService.cardTemplateGetTemplates(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

**ResultModelOfTemplateSetModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# CountryImageapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countryImageGetImage**](CountryImageapi.md#countryImageGetImage) | **GET** v1.2/countries/{countryId}/Images/{imageId} | Получить изображение.
[**countryImageGetImages**](CountryImageapi.md#countryImageGetImages) | **GET** v1.2/countries/{countryId}/Images | Получить список изображений для страны.



Получить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountryImageapi::class.java)
val countryId : kotlin.Int = 56 // kotlin.Int | Идентификатор страны.
val imageId : kotlin.Int = 56 // kotlin.Int | Идентификатор файла.

val result : ResultModelOfImageFileViewModel = webService.countryImageGetImage(countryId, imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | **kotlin.Int**| Идентификатор страны. |
 **imageId** | **kotlin.Int**| Идентификатор файла. |

### Return type

**ResultModelOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список изображений для страны.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CountryImageapi::class.java)
val countryId : kotlin.Int = 56 // kotlin.Int | Идентификатор страны.

val result : ResultModelOfListOfImageFileViewModel = webService.countryImageGetImages(countryId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryId** | **kotlin.Int**| Идентификатор страны. |

### Return type

**ResultModelOfListOfImageFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Imageapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageAddImage**](Imageapi.md#imageAddImage) | **PUT** v1.2/images | Сохранить изображение.
[**imageGetImage**](Imageapi.md#imageGetImage) | **GET** v1.2/images/{imageId} | Получить изображение.
[**imageGetLogo**](Imageapi.md#imageGetLogo) | **GET** v1.2/images/logo | Получить изображение с логотипом.



Сохранить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Imageapi::class.java)
val model : NewFileModel =  // NewFileModel | Новое изображение.

val result : ResultModelOfGuid = webService.imageAddImage(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NewFileModel**| Новое изображение. |

### Return type

**ResultModelOfGuid**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить изображение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Imageapi::class.java)
val imageId : kotlin.String = imageId_example // kotlin.String | Идентификатор изображения.

val result : ResultModelOfFileViewModel = webService.imageGetImage(imageId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageId** | **kotlin.String**| Идентификатор изображения. |

### Return type

**ResultModelOfFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить изображение с логотипом.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Imageapi::class.java)

val result : ResultModelOfFileViewModel = webService.imageGetLogo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfFileViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


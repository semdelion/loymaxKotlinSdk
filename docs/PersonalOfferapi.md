# PersonalOfferapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personalOfferCreatePersonalOffer**](PersonalOfferapi.md#personalOfferCreatePersonalOffer) | **PUT** v1.2/PersonalOffer/create | Создает персональное предложение.
[**personalOfferGetContents**](PersonalOfferapi.md#personalOfferGetContents) | **GET** v1.2/user/personalOffer/{logicalName}/contents | Возвращает содержимое персонального предложения для пользователя.
[**personalOfferGetList**](PersonalOfferapi.md#personalOfferGetList) | **GET** v1.2/PersonalOffer | Возвращает список персональных предложений.
[**personalOfferGetPersonalOfferTypes**](PersonalOfferapi.md#personalOfferGetPersonalOfferTypes) | **GET** v1.2/PersonalOffer/types | Возвращает список доступных типов персональных предложений.
[**personalOfferSetContents**](PersonalOfferapi.md#personalOfferSetContents) | **POST** v1.2/user/personalOffer/{logicalName}/accept | Возвращает содержимое персонального предложения для пользователя.
[**personalOfferUpdatePersonalOffer**](PersonalOfferapi.md#personalOfferUpdatePersonalOffer) | **PUT** v1.2/PersonalOffer/update | Обновляет персональное предложение.



Создает персональное предложение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)
val model : PersonalOfferModelInfo =  // PersonalOfferModelInfo | Модель.

val result : kotlin.Int = webService.personalOfferCreatePersonalOffer(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **PersonalOfferModelInfo**| Модель. |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает содержимое персонального предложения для пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.

val result : ResultModelOfObject = webService.personalOfferGetContents(logicalName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |

### Return type

**ResultModelOfObject**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список персональных предложений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfPersonalOfferModelInfo = webService.personalOfferGetList(from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfPersonalOfferModelInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список доступных типов персональных предложений.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)

val result : kotlin.collections.MutableList<PersonalOfferTypeModel> = webService.personalOfferGetPersonalOfferTypes()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.MutableList&lt;PersonalOfferTypeModel&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает содержимое персонального предложения для пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.
val model : PersonalOfferValueModel =  // PersonalOfferValueModel | Модель данных.

val result : ResultModel = webService.personalOfferSetContents(logicalName, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |
 **model** | **PersonalOfferValueModel**| Модель данных. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет персональное предложение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonalOfferapi::class.java)
val model : PersonalOfferModelInfo =  // PersonalOfferModelInfo | Модель.

val result : PersonalOfferModelInfo = webService.personalOfferUpdatePersonalOffer(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **PersonalOfferModelInfo**| Модель. |

### Return type

**PersonalOfferModelInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


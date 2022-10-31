# CustomerIdentifiersapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerIdentifiersBlockIdentifier**](CustomerIdentifiersapi.md#customerIdentifiersBlockIdentifier) | **POST** v1.2/users/{personId}/identifiers/{id}/block | Блокирование идентификатора.
[**customerIdentifiersGetIdentifier**](CustomerIdentifiersapi.md#customerIdentifiersGetIdentifier) | **GET** v1.2/users/{personId}/identifiers/{id} | Получить идентификатор по ID.
[**customerIdentifiersGetIdentifiers**](CustomerIdentifiersapi.md#customerIdentifiersGetIdentifiers) | **GET** v1.2/users/{personId}/identifiers | Получить список идентификаторов пользователя.
[**customerIdentifiersUnblockIdentifier**](CustomerIdentifiersapi.md#customerIdentifiersUnblockIdentifier) | **POST** v1.2/users/{personId}/identifiers/{id}/unblock | Разблокирование идентификатора.



Блокирование идентификатора.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerIdentifiersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val id : kotlin.Int = 56 // kotlin.Int | Id идентификатора.

val result : ResultModel = webService.customerIdentifiersBlockIdentifier(personId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **id** | **kotlin.Int**| Id идентификатора. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить идентификатор по ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerIdentifiersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val id : kotlin.Int = 56 // kotlin.Int | Id идентификатор.

val result : ResultModelOfIdentifierModel = webService.customerIdentifiersGetIdentifier(personId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **id** | **kotlin.Int**| Id идентификатор. |

### Return type

**ResultModelOfIdentifierModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список идентификаторов пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerIdentifiersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfIdentifierModel = webService.customerIdentifiersGetIdentifiers(personId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfIdentifierModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Разблокирование идентификатора.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CustomerIdentifiersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val id : kotlin.Int = 56 // kotlin.Int | Id идентификатора.

val result : ResultModel = webService.customerIdentifiersUnblockIdentifier(personId, id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **id** | **kotlin.Int**| Id идентификатора. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


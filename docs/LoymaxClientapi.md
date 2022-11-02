# LoymaxClientapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loymaxClientActivities**](LoymaxClientapi.md#loymaxClientActivities) | **GET** v1.2/OAuth/Clients/{provider}/Activities | Получает список доступных для отслеживания типов активности.
[**loymaxClientGet**](LoymaxClientapi.md#loymaxClientGet) | **GET** v1.2/OAuth/Clients/{id} | Возвращает OAuth клиента по id.
[**loymaxClientGetOAuthClients**](LoymaxClientapi.md#loymaxClientGetOAuthClients) | **GET** v1.2/OAuth/Clients | Получает список доступных OAuth клиентов.
[**loymaxClientObjects**](LoymaxClientapi.md#loymaxClientObjects) | **GET** v1.2/OAuth/Clients/{provider}/Objects/{target} | Получает список доступных для отслеживания объектов.
[**loymaxClientRestore**](LoymaxClientapi.md#loymaxClientRestore) | **POST** v1.2/OAuth/Clients/{id}/restore | Восстановление OAuth клиента по id записи.



Получает список доступных для отслеживания типов активности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoymaxClientapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | Провайдер.

val result : ResultModelOfListOfOAuthActivityType = webService.loymaxClientActivities(provider)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| Провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]

### Return type

**ResultModelOfListOfOAuthActivityType**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает OAuth клиента по id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoymaxClientapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id OAuth клиента.

val result : ResultModelOfOAuthSettings = webService.loymaxClientGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id OAuth клиента. |

### Return type

**ResultModelOfOAuthSettings**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список доступных OAuth клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoymaxClientapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val mode : ArchivedState =  // ArchivedState | Признак архивации.

val result : ResultModelOfPagedViewModelOfOAuthSettings = webService.loymaxClientGetOAuthClients(from, count, mode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **mode** | **ArchivedState**| Признак архивации. | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfOAuthSettings**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает список доступных для отслеживания объектов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoymaxClientapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | Провайдер.
val target : kotlin.String = target_example // kotlin.String | Идентификатор объекта (владельца публикаций  пользователь, группа и т.п.).

val result : ResultModelOfListOfClientObjectModel = webService.loymaxClientObjects(provider, target)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| Провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]
 **target** | **kotlin.String**| Идентификатор объекта (владельца публикаций  пользователь, группа и т.п.). |

### Return type

**ResultModelOfListOfClientObjectModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление OAuth клиента по id записи.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LoymaxClientapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id запроса.

val result : ResultModel = webService.loymaxClientRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id запроса. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


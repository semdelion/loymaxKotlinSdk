# UserCardsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCardsAttachCardCancel**](UserCardsapi.md#userCardsAttachCardCancel) | **POST** v1.2/users/{personId}/cards/Attach/Cancel | Отменяет начатый процесс объединения карт.
[**userCardsAttachCardConfirm**](UserCardsapi.md#userCardsAttachCardConfirm) | **POST** v1.2/users/{personId}/cards/Attach/Confirm | Завершает начатый процесс объединения карт.
[**userCardsAttachCardSendConfirmCode**](UserCardsapi.md#userCardsAttachCardSendConfirmCode) | **POST** v1.2/users/{personId}/cards/Attach/SendConfirmCode | Оформляет повторную отправку кода подтверждения при процессе объединения карт.
[**userCardsAttachCardState**](UserCardsapi.md#userCardsAttachCardState) | **GET** v1.2/users/{personId}/cards/Attach | Возвращает текущее состояние процесса присоединения карты.
[**userCardsGetCardsInfo**](UserCardsapi.md#userCardsGetCardsInfo) | **GET** v1.2/users/{personId}/cards | Возвращает список карт клиента.
[**userCardsSetCardInfo**](UserCardsapi.md#userCardsSetCardInfo) | **GET** v1.2/users/{personId}/cards/Set | Возвращает информацию о возможности прикрепления физической карты.



Отменяет начатый процесс объединения карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.userCardsAttachCardCancel(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает начатый процесс объединения карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val confirmCodeModel : ConfirmCodeModel =  // ConfirmCodeModel | Модель кода подтверждения.

val result : ResultModel = webService.userCardsAttachCardConfirm(personId, confirmCodeModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **confirmCodeModel** | **ConfirmCodeModel**| Модель кода подтверждения. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет повторную отправку кода подтверждения при процессе объединения карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.userCardsAttachCardSendConfirmCode(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает текущее состояние процесса присоединения карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfAttachCardState = webService.userCardsAttachCardState(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfAttachCardState**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список карт клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val cardShowMode : CardShowMode =  // CardShowMode | Фильтр карт клиента.

val result : ResultModelOfListOfSystemApiCardInfoModel = webService.userCardsGetCardsInfo(personId, cardShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **cardShowMode** | **CardShowMode**| Фильтр карт клиента. | [optional] [enum: Active, Deleted, AllFromGroup]

### Return type

**ResultModelOfListOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о возможности прикрепления физической карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserCardsapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfSetCardActionInfoModel = webService.userCardsSetCardInfo(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfSetCardActionInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# Registrationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registrationBatchRegistrationConfirm**](Registrationapi.md#registrationBatchRegistrationConfirm) | **PUT** v1.2/Registration/BatchRegistrationConfirm | Пакетное подтверждение регистрации клиентов.
[**registrationGetConfirmRegistrationBatch**](Registrationapi.md#registrationGetConfirmRegistrationBatch) | **GET** v1.2/Registration | Загрузки.
[**registrationPostBeginRegistration**](Registrationapi.md#registrationPostBeginRegistration) | **POST** v1.2/Registration/BeginRegistration | Запускает регистрацию клиента по номеру карты.
[**registrationPostTryFinishRegistration**](Registrationapi.md#registrationPostTryFinishRegistration) | **POST** v1.2/Registration/TryFinishRegistration | Завершает процесс регистрации клиента.
[**registrationRegisterAnonymous**](Registrationapi.md#registrationRegisterAnonymous) | **POST** v1.2/Registration/RegisterAnonym | Запускает анонимную регистрацию клиента.
[**registrationTryFinishRegistration**](Registrationapi.md#registrationTryFinishRegistration) | **POST** v1.2/Registration/TryFinishRegistrationCustomer | Завершает процесс регистрации клиента (через КЦ).



Пакетное подтверждение регистрации клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)
val description : kotlin.String = description_example // kotlin.String | Описание пакетной загрузки.
val file : java.io.File =  // java.io.File | file to upload
val setRandomPasswords : kotlin.Boolean = true // kotlin.Boolean | Устанавливать сгенерированные пароли клиентам без паролей.

val result : ResultModelOfInt32 = webService.registrationBatchRegistrationConfirm(description, file, setRandomPasswords)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **kotlin.String**| Описание пакетной загрузки. |
 **file** | **java.io.File**| file to upload |
 **setRandomPasswords** | **kotlin.Boolean**| Устанавливать сгенерированные пароли клиентам без паролей. | [optional]

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Загрузки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val batchUploadFilterModelState : BatchState =  // BatchState | 
val batchUploadFilterModelIncludeDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val batchUploadFilterModelFromDate : kotlin.String = batchUploadFilterModelFromDate_example // kotlin.String | 
val batchUploadFilterModelToDate : kotlin.String = batchUploadFilterModelToDate_example // kotlin.String | 
val batchUploadFilterModelAuthorId : kotlin.Int = 56 // kotlin.Int | 

val result : ResultModelOfPagedViewModelOfBatchUploadModel = webService.registrationGetConfirmRegistrationBatch(from, count, batchUploadFilterModelState, batchUploadFilterModelIncludeDeleted, batchUploadFilterModelFromDate, batchUploadFilterModelToDate, batchUploadFilterModelAuthorId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **batchUploadFilterModelState** | **BatchState**|  | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **batchUploadFilterModelIncludeDeleted** | **kotlin.Boolean**|  | [optional]
 **batchUploadFilterModelFromDate** | **kotlin.String**|  | [optional]
 **batchUploadFilterModelToDate** | **kotlin.String**|  | [optional]
 **batchUploadFilterModelAuthorId** | **kotlin.Int**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает регистрацию клиента по номеру карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)
val model : RegistrationModel =  // RegistrationModel | Модель запроса регистрации клиента.

val result : ResultModelOfRegistrationResult = webService.registrationPostBeginRegistration(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **RegistrationModel**| Модель запроса регистрации клиента. |

### Return type

**ResultModelOfRegistrationResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает процесс регистрации клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)

val result : ResultModelOfFinishRegistrationResultModel = webService.registrationPostTryFinishRegistration()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfFinishRegistrationResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает анонимную регистрацию клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)
val model : AnonymousRegistrationModel =  // AnonymousRegistrationModel | Данные для анонимной регистрации клиента.

val result : ResultModelOfAnonymousRegistrationResult = webService.registrationRegisterAnonymous(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **AnonymousRegistrationModel**| Данные для анонимной регистрации клиента. |

### Return type

**ResultModelOfAnonymousRegistrationResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает процесс регистрации клиента (через КЦ).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Registrationapi::class.java)
val finishRegistrationModel : FinishRegistrationViewModel =  // FinishRegistrationViewModel | Внутренний идентификатор клиента.

val result : ResultModelOfFinishRegistrationResult = webService.registrationTryFinishRegistration(finishRegistrationModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **finishRegistrationModel** | **FinishRegistrationViewModel**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfFinishRegistrationResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


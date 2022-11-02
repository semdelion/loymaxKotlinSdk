# UserEmailapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userEmailChangeEmailCancel**](UserEmailapi.md#userEmailChangeEmailCancel) | **POST** v1.2/User/Email/CancelChange | Отменяет процесс изменения Email.
[**userEmailGetEmail**](UserEmailapi.md#userEmailGetEmail) | **GET** v1.2/User/Email | Возвращает текущий статус Email клиента.
[**userEmailPostEmailConfirm**](UserEmailapi.md#userEmailPostEmailConfirm) | **POST** v1.2/User/Email/LinkConfirm | Оформляет подтверждение нового Email.
[**userEmailPostEmailConfirmCode**](UserEmailapi.md#userEmailPostEmailConfirmCode) | **POST** v1.2/User/Email/Confirm | Завершает процесс изменения Email.
[**userEmailPostVerifyEmail**](UserEmailapi.md#userEmailPostVerifyEmail) | **POST** v1.2/User/Email/Verify | Верифицирует Email клиента.
[**userEmailSendEmailConfirmCode**](UserEmailapi.md#userEmailSendEmailConfirmCode) | **POST** v1.2/User/Email/SendConfirmCode | Оформляет повторную отправку кода подтверждения при изменении Email.



Отменяет процесс изменения Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)

val result : ResultModel = webService.userEmailChangeEmailCancel()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает текущий статус Email клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)

val result : ResultModelOfUserEmailInfo = webService.userEmailGetEmail()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfUserEmailInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет подтверждение нового Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)
val model : NewEmailConfirmModel =  // NewEmailConfirmModel | Ввод параметров подтверждения нового Email.

val result : ResultModel = webService.userEmailPostEmailConfirm(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NewEmailConfirmModel**| Ввод параметров подтверждения нового Email. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает процесс изменения Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)
val confirmCode : PostConfirmCodeModel =  // PostConfirmCodeModel | Ввод кода подтверждения и пароля.

val result : ResultModel = webService.userEmailPostEmailConfirmCode(confirmCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmCode** | **PostConfirmCodeModel**| Ввод кода подтверждения и пароля. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Верифицирует Email клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)
val model : VerificationModel =  // VerificationModel | Модель верификации Email.

val result : ResultModel = webService.userEmailPostVerifyEmail(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **VerificationModel**| Модель верификации Email. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет повторную отправку кода подтверждения при изменении Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserEmailapi::class.java)

val result : ResultModel = webService.userEmailSendEmailConfirmCode()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


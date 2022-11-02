# UserPhoneapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userPhoneChangePhoneCancel**](UserPhoneapi.md#userPhoneChangePhoneCancel) | **POST** v1.2/User/PhoneNumber/CancelChange | Отменяет процесс привязки номера телефона.
[**userPhoneGetPhone**](UserPhoneapi.md#userPhoneGetPhone) | **GET** v1.2/User/PhoneNumber | Возвращает информацию о номере телефона клиента.
[**userPhonePostPhoneConfirmCode**](UserPhoneapi.md#userPhonePostPhoneConfirmCode) | **POST** v1.2/User/PhoneNumber/Confirm | Завершает процесс привязки номера телефона.
[**userPhoneSendPhoneConfirmCode**](UserPhoneapi.md#userPhoneSendPhoneConfirmCode) | **POST** v1.2/User/PhoneNumber/SendConfirmCode | Повторно отправляет код подтверждения на новый номер телефона.



Отменяет процесс привязки номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserPhoneapi::class.java)

val result : ResultModel = webService.userPhoneChangePhoneCancel()
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


Возвращает информацию о номере телефона клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserPhoneapi::class.java)

val result : ResultModelOfUserPhoneNumberInfo = webService.userPhoneGetPhone()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfUserPhoneNumberInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Завершает процесс привязки номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserPhoneapi::class.java)
val confirmCode : PostConfirmCodeModel =  // PostConfirmCodeModel | Ввод кода подтверждения для привязки нового номера телефона.

val result : ResultModelOfAuthResultModel = webService.userPhonePostPhoneConfirmCode(confirmCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmCode** | **PostConfirmCodeModel**| Ввод кода подтверждения для привязки нового номера телефона. |

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Повторно отправляет код подтверждения на новый номер телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserPhoneapi::class.java)

val result : ResultModel = webService.userPhoneSendPhoneConfirmCode()
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


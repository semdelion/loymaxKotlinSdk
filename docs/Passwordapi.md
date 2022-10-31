# Passwordapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passwordChange**](Passwordapi.md#passwordChange) | **POST** v1.2/User/Password/Change | Обновляет пароль клиента.
[**passwordGetBatches**](Passwordapi.md#passwordGetBatches) | **GET** v1.2/User/Password/BatchUpload | Возвращает список пакетных загрузок паролей.
[**passwordGetOperations**](Passwordapi.md#passwordGetOperations) | **GET** v1.2/User/Password/BatchUpload/{id}/operations | Возвращает список операций пакетной загрузки паролей.
[**passwordResetCancel**](Passwordapi.md#passwordResetCancel) | **POST** v1.2/ResetPassword/Cancel | Отменяет процесс восстановления пароля.
[**passwordResetConfirm**](Passwordapi.md#passwordResetConfirm) | **POST** v1.2/ResetPassword/Confirm | Отправляет введенный код подтверждения для восстановления пароля.
[**passwordResetInfo**](Passwordapi.md#passwordResetInfo) | **POST** v1.2/ResetPassword | Возвращает список нотификаторов клиента, на которые возможна отправка кода подтверждения для восстановления пароля.
[**passwordResetStart**](Passwordapi.md#passwordResetStart) | **POST** v1.2/ResetPassword/Start | Запускает восстановление пароля.
[**passwordSendPassword**](Passwordapi.md#passwordSendPassword) | **POST** v1.2/User/Password/Send | Возвращает пароль на чеке.
[**passwordSet**](Passwordapi.md#passwordSet) | **POST** v1.2/User/Password/Set | Устанавливает пароль клиенту.



Обновляет пароль клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val model : ChangePasswordModel =  // ChangePasswordModel | Модель обновления пароля.

val result : ResultModelOfAuthResultModel = webService.passwordChange(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ChangePasswordModel**| Модель обновления пароля. |

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список пакетных загрузок паролей.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val state : BatchState =  // BatchState | Состояние пакетной загрузки.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfBatchUploadModel = webService.passwordGetBatches(state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **BatchState**| Состояние пакетной загрузки. | [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список операций пакетной загрузки паролей.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетной загрузки паролей.
val state : DeferredOperationState =  // DeferredOperationState | Состояние операции (Completed — завершена, Created — создана, Error — ошибка).
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfBatchUploadDataModel = webService.passwordGetOperations(id, state, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор пакетной загрузки паролей. |
 **state** | **DeferredOperationState**| Состояние операции (Completed — завершена, Created — создана, Error — ошибка). | [enum: Created, Completed, Error]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchUploadDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отменяет процесс восстановления пароля.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val model : ResetPasswordCancelModel =  // ResetPasswordCancelModel | Модель данных для отмены процесса восстановления пароля.

val result : ResultModel = webService.passwordResetCancel(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ResetPasswordCancelModel**| Модель данных для отмены процесса восстановления пароля. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправляет введенный код подтверждения для восстановления пароля.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val model : ResetPasswordConfirmModel =  // ResetPasswordConfirmModel | Модель данных для ввода кода подтверждения.

val result : ResultModelOfAuthResultModel = webService.passwordResetConfirm(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ResetPasswordConfirmModel**| Модель данных для ввода кода подтверждения. |

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список нотификаторов клиента, на которые возможна отправка кода подтверждения для восстановления пароля.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val model : ResetPasswordInfoSearchModel =  // ResetPasswordInfoSearchModel | Модель данных для восстановления пароля.

val result : ResultModelOfResetPasswordInfoModel = webService.passwordResetInfo(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ResetPasswordInfoSearchModel**| Модель данных для восстановления пароля. |

### Return type

**ResultModelOfResetPasswordInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Запускает восстановление пароля.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val model : ResetPasswordStartModel =  // ResetPasswordStartModel | Модель данных для запуска восстановления пароля.

val result : ResultModelOfConfirmCodeResultModel = webService.passwordResetStart(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ResetPasswordStartModel**| Модель данных для запуска восстановления пароля. |

### Return type

**ResultModelOfConfirmCodeResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает пароль на чеке.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val cardNumber : kotlin.String = cardNumber_example // kotlin.String | Номер карты клиента.

val result : ResultModel = webService.passwordSendPassword(cardNumber)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardNumber** | **kotlin.String**| Номер карты клиента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Устанавливает пароль клиенту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Passwordapi::class.java)
val passwordModel : SetPasswordModel =  // SetPasswordModel | Модель пароля.

val result : ResultModelOfAuthResultModel = webService.passwordSet(passwordModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordModel** | **SetPasswordModel**| Модель пароля. |

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


# CallCenterapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callCenterBlockAccount**](CallCenterapi.md#callCenterBlockAccount) | **POST** v1.2/CallCenter/BlockAccount | Блокирует счет.
[**callCenterBlockCard**](CallCenterapi.md#callCenterBlockCard) | **POST** v1.2/CallCenter/BlockCard | Блокирует карту.
[**callCenterChangeCardCategory**](CallCenterapi.md#callCenterChangeCardCategory) | **POST** v1.2/CallCenter/ChangeCardCategory | Заменяет категорию карты.
[**callCenterChangeEmail**](CallCenterapi.md#callCenterChangeEmail) | **POST** v1.2/CallCenter/ChangeEmail | Заменяет Email.
[**callCenterChangePhone**](CallCenterapi.md#callCenterChangePhone) | **POST** v1.2/CallCenter/ChangePhone | Заменяет номер телефона.
[**callCenterDeleteCard**](CallCenterapi.md#callCenterDeleteCard) | **POST** v1.2/CallCenter/DeleteCard | Удаляет карту.
[**callCenterDeregisterPerson**](CallCenterapi.md#callCenterDeregisterPerson) | **POST** v1.2/CallCenter/DeregisterPerson | Удаляет Участника из ПЛ.
[**callCenterRecoverCard**](CallCenterapi.md#callCenterRecoverCard) | **POST** v1.2/CallCenter/RecoverCard | Восстанавливает карту.
[**callCenterReplacePersonCard**](CallCenterapi.md#callCenterReplacePersonCard) | **POST** v1.2/CallCenter/ReplaceCard | Заменяет карту.
[**callCenterSendNewPasswordToEmail**](CallCenterapi.md#callCenterSendNewPasswordToEmail) | **POST** v1.2/CallCenter/SendNewPasswordToEmail | Генерирует новый пароль для Участника ПЛ и отправляет по Email.
[**callCenterSendNewPasswordToPhone**](CallCenterapi.md#callCenterSendNewPasswordToPhone) | **POST** v1.2/CallCenter/SendNewPasswordToPhone | Генерирует новый пароль для Участника ПЛ и отправляет в SMS-сообщении.
[**callCenterUnBlockAccount**](CallCenterapi.md#callCenterUnBlockAccount) | **POST** v1.2/CallCenter/UnBlockAccount | Разблокирует счет.
[**callCenterUnBlockCard**](CallCenterapi.md#callCenterUnBlockCard) | **POST** v1.2/CallCenter/UnBlockCard | Разблокирует карту.
[**callCenterUpdateSubscriptions**](CallCenterapi.md#callCenterUpdateSubscriptions) | **POST** v1.2/CallCenter/UpdateSubscriptions | Обновляет подписки.



Блокирует счет.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val blockAccountModel : BlockAccountModel =  // BlockAccountModel | Модель для операции блокировки/разблокировки счета Участника ПЛ.

val result : ResultModel = webService.callCenterBlockAccount(blockAccountModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockAccountModel** | **BlockAccountModel**| Модель для операции блокировки/разблокировки счета Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Блокирует карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val blockCardModel : BlockCardModel =  // BlockCardModel | Модель для блокировки карты Участника ПЛ.

val result : ResultModel = webService.callCenterBlockCard(blockCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockCardModel** | **BlockCardModel**| Модель для блокировки карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Заменяет категорию карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val changeCardCategory : ChangeCardCategoryModel =  // ChangeCardCategoryModel | Модель для замены категории карты Участника ПЛ.

val result : ResultModel = webService.callCenterChangeCardCategory(changeCardCategory)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeCardCategory** | **ChangeCardCategoryModel**| Модель для замены категории карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Заменяет Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val changeEmailModel : ChangeEmailModel =  // ChangeEmailModel | Модель для замены Email Участника ПЛ.

val result : ResultModel = webService.callCenterChangeEmail(changeEmailModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeEmailModel** | **ChangeEmailModel**| Модель для замены Email Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Заменяет номер телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val changePhoneModel : ChangePhoneModel =  // ChangePhoneModel | Модель для замены номера телефона Участника ПЛ.

val result : ResultModel = webService.callCenterChangePhone(changePhoneModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePhoneModel** | **ChangePhoneModel**| Модель для замены номера телефона Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val deleteCardModel : DeleteCardModel =  // DeleteCardModel | Внутренний идентификатор удаляемой карты Участника ПЛ.

val result : ResultModel = webService.callCenterDeleteCard(deleteCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteCardModel** | **DeleteCardModel**| Внутренний идентификатор удаляемой карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет Участника из ПЛ.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val model : DeregisterPersonModel =  // DeregisterPersonModel | Модель для удаления Участника из ПЛ.

val result : ResultModel = webService.callCenterDeregisterPerson(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **DeregisterPersonModel**| Модель для удаления Участника из ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val recoverCardModel : DeleteCardModel =  // DeleteCardModel | Внутренний идентификатор восстанавливаемой карты Участника ПЛ.

val result : ResultModel = webService.callCenterRecoverCard(recoverCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverCardModel** | **DeleteCardModel**| Внутренний идентификатор восстанавливаемой карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Заменяет карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val replacePersonCardModel : ReplacePersonCardModel =  // ReplacePersonCardModel | Модель для замены карты Участника ПЛ.

val result : ResultModel = webService.callCenterReplacePersonCard(replacePersonCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replacePersonCardModel** | **ReplacePersonCardModel**| Модель для замены карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Генерирует новый пароль для Участника ПЛ и отправляет по Email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val sendNewPasswordModel : SendNewPasswordModel =  // SendNewPasswordModel | Модель для отправки нового пароля Участнику ПЛ.

val result : ResultModel = webService.callCenterSendNewPasswordToEmail(sendNewPasswordModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendNewPasswordModel** | **SendNewPasswordModel**| Модель для отправки нового пароля Участнику ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Генерирует новый пароль для Участника ПЛ и отправляет в SMS-сообщении.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val sendNewPasswordModel : SendNewPasswordModel =  // SendNewPasswordModel | Модель для отправки нового пароля Участнику ПЛ.

val result : ResultModel = webService.callCenterSendNewPasswordToPhone(sendNewPasswordModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendNewPasswordModel** | **SendNewPasswordModel**| Модель для отправки нового пароля Участнику ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Разблокирует счет.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val blockAccountModel : BlockAccountModel =  // BlockAccountModel | Модель для операции блокировки/разблокировки счета Участника ПЛ.

val result : ResultModel = webService.callCenterUnBlockAccount(blockAccountModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockAccountModel** | **BlockAccountModel**| Модель для операции блокировки/разблокировки счета Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Разблокирует карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val unBlockCardModel : UnBlockCardModel =  // UnBlockCardModel | Модель для разблокировки карты Участника ПЛ.

val result : ResultModel = webService.callCenterUnBlockCard(unBlockCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unBlockCardModel** | **UnBlockCardModel**| Модель для разблокировки карты Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет подписки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CallCenterapi::class.java)
val updateSubscriptionsModel : UpdateSubscriptionsModel =  // UpdateSubscriptionsModel | Модель для обновления подписок Участника ПЛ.

val result : ResultModel = webService.callCenterUpdateSubscriptions(updateSubscriptionsModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSubscriptionsModel** | **UpdateSubscriptionsModel**| Модель для обновления подписок Участника ПЛ. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


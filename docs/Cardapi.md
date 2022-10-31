# Cardapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardAttachCardCancel**](Cardapi.md#cardAttachCardCancel) | **POST** v1.2/Cards/Attach/Cancel | Отменяет начатое объединение карт.
[**cardAttachCardConfirm**](Cardapi.md#cardAttachCardConfirm) | **POST** v1.2/Cards/Attach/Confirm | Завершает начатое объединение карт.
[**cardAttachCardSendConfirmCode**](Cardapi.md#cardAttachCardSendConfirmCode) | **POST** v1.2/Cards/Attach/SendConfirmCode | Отправляет повторно код подтверждения в процессе объединения карт.
[**cardAttachCardState**](Cardapi.md#cardAttachCardState) | **GET** v1.2/Cards/Attach | Возвращает текущее состояние процесса прикрепления карты.
[**cardChangeBlockState**](Cardapi.md#cardChangeBlockState) | **POST** v1.2/Cards/{cardId}/ChangeBlockState | Блокирует/разблокирует карту.
[**cardChangeExpiryDate**](Cardapi.md#cardChangeExpiryDate) | **POST** v1.2/Cards/{cardId}/ExpiryDate | Обновляет срок действия карты.
[**cardCheckCardPassword**](Cardapi.md#cardCheckCardPassword) | **GET** v1.2/Cards/{cardId}/checkPassword | Проверяет пароль карты.
[**cardCheckCvc**](Cardapi.md#cardCheckCvc) | **GET** v1.2/Cards/{cardId}/checkCvc | Проверяет CVC-код карты.
[**cardEmitVirtualCardInfo**](Cardapi.md#cardEmitVirtualCardInfo) | **GET** v1.2/Cards/EmitVirtual | Возвращает информацию о возможности выпуска виртуальной карты.
[**cardGetCard**](Cardapi.md#cardGetCard) | **GET** v1.2/Cards/{cardId} | Возвращает информацию о карте по внутреннему идентификатору карты.
[**cardGetCardInfo**](Cardapi.md#cardGetCardInfo) | **GET** v1.2/Cards/{cardId}/CardInfo | Возвращает информацию о карте по ее внутреннему идентификатору.
[**cardGetCardInfosByFilter**](Cardapi.md#cardGetCardInfosByFilter) | **GET** v1.2/Cards/byParams | Возвращает список карт по параметрам.
[**cardGetCardReplacementsByCardId**](Cardapi.md#cardGetCardReplacementsByCardId) | **GET** v1.2/Cards/{cardId}/ReplacementChain | Возвращает цепочку замен карт по внутреннему идентификатору карты.
[**cardGetCards**](Cardapi.md#cardGetCards) | **GET** v1.2/Cards | Возвращает список карт текущего клиента и все операции по ним (OAuth).
[**cardGetCardsByCardNumber**](Cardapi.md#cardGetCardsByCardNumber) | **GET** v1.2/Cards/ByCardNumber | Возвращает информацию о карте по ее номеру и внутреннему идентификатору ПЛ.
[**cardGetQrCode**](Cardapi.md#cardGetQrCode) | **GET** v1.2/Cards/{cardId}/QrCode | Генерирует QR-код для карты по внутреннему идентификатору карты.
[**cardGetRange**](Cardapi.md#cardGetRange) | **GET** v1.2/Cards/Range/{beginCardId}/{endCardId} | Возвращает информацию для диапазона карт из одного выпуска. Количество карт в диапазоне:не более 500.
[**cardIssueCard**](Cardapi.md#cardIssueCard) | **POST** v1.2/Cards/{cardId}/Issue | Обновляет состояние карты на \&quot;Выдана\&quot;.
[**cardReplaceCard**](Cardapi.md#cardReplaceCard) | **POST** v1.2/Cards/{cardId}/Replace | Оформляет замену карты.
[**cardSetCardConfigurationInfo**](Cardapi.md#cardSetCardConfigurationInfo) | **GET** v1.2/Cards/SetCardInfo | Возвращает информацию о настройках по прикреплению карт.
[**cardSetCardInfo**](Cardapi.md#cardSetCardInfo) | **GET** v1.2/Cards/Set | Возвращает информацию о возможности прикрепления физической карты.



Отменяет начатое объединение карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModel = webService.cardAttachCardCancel()
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


Завершает начатое объединение карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val confirmCode : kotlin.String = confirmCode_example // kotlin.String | Код подтверждения.

val result : ResultModel = webService.cardAttachCardConfirm(confirmCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmCode** | **kotlin.String**| Код подтверждения. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправляет повторно код подтверждения в процессе объединения карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModel = webService.cardAttachCardSendConfirmCode()
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


Возвращает текущее состояние процесса прикрепления карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModelOfAttachCardState = webService.cardAttachCardState()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfAttachCardState**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Блокирует/разблокирует карту.

В случае успешного завершения вызова, карта меняет значение флага \&quot;Заблокирована для оплаты\&quot; с текущего на противоположное.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.
val password : kotlin.String = password_example // kotlin.String | Пароль.
val reason : kotlin.String = reason_example // kotlin.String | Причины блокировки.

val result : ResultModel = webService.cardChangeBlockState(cardId, password, reason)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |
 **password** | **kotlin.String**| Пароль. |
 **reason** | **kotlin.String**| Причины блокировки. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет срок действия карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.
val changeExpiryDate : ChangeExpiryDateModel =  // ChangeExpiryDateModel | Данные для изменения срока действия карты.

val result : ResultModel = webService.cardChangeExpiryDate(cardId, changeExpiryDate)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |
 **changeExpiryDate** | **ChangeExpiryDateModel**| Данные для изменения срока действия карты. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проверяет пароль карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.
val cardPassword : kotlin.String = cardPassword_example // kotlin.String | Пароль.

val result : ResultModelOfBoolean = webService.cardCheckCardPassword(cardId, cardPassword)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |
 **cardPassword** | **kotlin.String**| Пароль. |

### Return type

**ResultModelOfBoolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проверяет CVC-код карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.
val cvc : kotlin.String = cvc_example // kotlin.String | CVC-код.

val result : ResultModelOfBoolean = webService.cardCheckCvc(cardId, cvc)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |
 **cvc** | **kotlin.String**| CVC-код. |

### Return type

**ResultModelOfBoolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о возможности выпуска виртуальной карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModelOfEmitVirtualCardInfoModel = webService.cardEmitVirtualCardInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfEmitVirtualCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о карте по внутреннему идентификатору карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.

val result : ResultModelOfCardInfo = webService.cardGetCard(cardId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |

### Return type

**ResultModelOfCardInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о карте по ее внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.

val result : ResultModelOfSystemApiCardInfoModel = webService.cardGetCardInfo(cardId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |

### Return type

**ResultModelOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список карт по параметрам.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val state : CardState =  // CardState | Состояние карты (сгенерирована, расфасована, активирована, заменена, создается, создана, готова к выдаче, выдана клиенту, срок действия истек).
val hasPerson : kotlin.Boolean = true // kotlin.Boolean | Привязана ли карта к пользователю (true-привязана, false-не привязана).
val isBlocked : kotlin.Boolean = true // kotlin.Boolean | Является ли карта заблокированной (true-заблокирована, false-не заблокирована).
val isGift : kotlin.Boolean = true // kotlin.Boolean | Является ли карта подарочной (true-подарочная, false-не подарочная).
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | Является ли карта удаленной (true-удалена, false-не удалена).

val result : ResultModelOfPagedViewModelOfSystemApiCardInfoModel = webService.cardGetCardInfosByFilter(from, count, state, hasPerson, isBlocked, isGift, isDeleted)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. |
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. |
 **state** | **CardState**| Состояние карты (сгенерирована, расфасована, активирована, заменена, создается, создана, готова к выдаче, выдана клиенту, срок действия истек). | [enum: Emitted, Packed, Activated, Replaced, Creating, Created, Prepared, Issued, Expired]
 **hasPerson** | **kotlin.Boolean**| Привязана ли карта к пользователю (true-привязана, false-не привязана). | [optional]
 **isBlocked** | **kotlin.Boolean**| Является ли карта заблокированной (true-заблокирована, false-не заблокирована). | [optional]
 **isGift** | **kotlin.Boolean**| Является ли карта подарочной (true-подарочная, false-не подарочная). | [optional]
 **isDeleted** | **kotlin.Boolean**| Является ли карта удаленной (true-удалена, false-не удалена). | [optional]

### Return type

**ResultModelOfPagedViewModelOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает цепочку замен карт по внутреннему идентификатору карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfSystemApiCardInfoModel = webService.cardGetCardReplacementsByCardId(cardId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список карт текущего клиента и все операции по ним (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModelOfListOfCardInfo = webService.cardGetCards()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfCardInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о карте по ее номеру и внутреннему идентификатору ПЛ.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardNumber : kotlin.String = cardNumber_example // kotlin.String | Номер карты.
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Программы лояльности.

val result : ResultModelOfSystemApiCardInfoModel = webService.cardGetCardsByCardNumber(cardNumber, loyaltyProgramId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardNumber** | **kotlin.String**| Номер карты. |
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор Программы лояльности. | [optional]

### Return type

**ResultModelOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Генерирует QR-код для карты по внутреннему идентификатору карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты.

val result : ResultModelOfQrCodeModel = webService.cardGetQrCode(cardId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор карты. |

### Return type

**ResultModelOfQrCodeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию для диапазона карт из одного выпуска. Количество карт в диапазоне:не более 500.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val beginCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты начала диапазона.
val endCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты конца диапазона.

val result : ResultModelOfListOfCardCompactInfoModel = webService.cardGetRange(beginCardId, endCardId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beginCardId** | **kotlin.Int**| Внутренний идентификатор карты начала диапазона. |
 **endCardId** | **kotlin.Int**| Внутренний идентификатор карты конца диапазона. |

### Return type

**ResultModelOfListOfCardCompactInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет состояние карты на \&quot;Выдана\&quot;.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор неактивированной карты.
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера, выдающего карту.

val result : ResultModel = webService.cardIssueCard(cardId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор неактивированной карты. |
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера, выдающего карту. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет замену карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор заменяемой карты.
val replaceCardModel : ReplaceCardModel =  // ReplaceCardModel | ViewModel входных параметров замены карты.

val result : ResultModelOfReplaceCardResult = webService.cardReplaceCard(cardId, replaceCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Внутренний идентификатор заменяемой карты. |
 **replaceCardModel** | **ReplaceCardModel**| ViewModel входных параметров замены карты. |

### Return type

**ResultModelOfReplaceCardResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о настройках по прикреплению карт.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModelOfEmitCardInfoModel = webService.cardSetCardConfigurationInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfEmitCardInfoModel**

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
val webService = apiClient.createWebservice(Cardapi::class.java)

val result : ResultModelOfSetCardActionInfoModel = webService.cardSetCardInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfSetCardActionInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


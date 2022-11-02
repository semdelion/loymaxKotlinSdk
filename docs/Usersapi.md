# Usersapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersAcceptTenderOffer**](Usersapi.md#usersAcceptTenderOffer) | **POST** v1.2/users/{personId}/AcceptTenderOffer | Оформляет принятие клиентом оферты.
[**usersCancelConfirmPhone**](Usersapi.md#usersCancelConfirmPhone) | **POST** v1.2/users/{personId}/CancelConfirmPhone | Отменяет верификацию номера телефона.
[**usersChangeTimeZone**](Usersapi.md#usersChangeTimeZone) | **POST** v1.2/users/{personId}/ChangeTimeZone | Оформляет изменение часового пояса клиента.
[**usersCheckUserPassword**](Usersapi.md#usersCheckUserPassword) | **GET** v1.2/users/{personId}/CheckPassword | Проверяет пароль клиента.
[**usersConfirmPhoneCode**](Usersapi.md#usersConfirmPhoneCode) | **POST** v1.2/users/{personId}/PostConfirmPhoneCode | Проверяет код подтверждения номера телефона.
[**usersDeleteAnswer**](Usersapi.md#usersDeleteAnswer) | **POST** v1.2/users/{personId}/DeleteAnswerSets | Удаляет вариант ответа анкеты.
[**usersDeregister**](Usersapi.md#usersDeregister) | **POST** v1.2/users/{personId}/Deregister | Оформляет выход из Программы лояльности.
[**usersEmitVirtualCardInfo**](Usersapi.md#usersEmitVirtualCardInfo) | **GET** v1.2/users/{personId}/EmitVirtual | Возвращает информацию о возможности выпуска виртуальной карты.
[**usersGetAttributes**](Usersapi.md#usersGetAttributes) | **GET** v1.2/users/{personId}/Attributes | Возвращает список партнерских атрибутов клиента.
[**usersGetBalance**](Usersapi.md#usersGetBalance) | **GET** v1.2/users/code/{identifier}/balance | Возвращает балансы по номеру телефона или номеру карты.
[**usersGetBalances**](Usersapi.md#usersGetBalances) | **GET** v1.2/users/{personId}/Balance | Возвращает информацию о балансе клиента.
[**usersGetCommunicationOffers**](Usersapi.md#usersGetCommunicationOffers) | **GET** v1.2/users/{personId}/CommunicationOffers | Возвращает список акций клиента.
[**usersGetCurrentPersonInfo**](Usersapi.md#usersGetCurrentPersonInfo) | **GET** v1.2/users/Current | Возвращает информацию о текущем пользователе.
[**usersGetCurrentUserName**](Usersapi.md#usersGetCurrentUserName) | **GET** v1.2/users/Current/name | Возвращает Ф.И.О. текущего пользователя.
[**usersGetDetailedBalance**](Usersapi.md#usersGetDetailedBalance) | **GET** v1.2/users/{personId}/DetailedBalance | Возвращает информацию о детализированном балансе клиента.
[**usersGetDetailedBalanceItemOperations**](Usersapi.md#usersGetDetailedBalanceItemOperations) | **GET** v1.2/users/{personId}/DetailedBalance/{currencyId}/Operations | Возвращает информацию об операциях активации и сгораниях по конкретному счету клиента.
[**usersGetPartnerPurchaseAmount**](Usersapi.md#usersGetPartnerPurchaseAmount) | **GET** v1.2/users/{personId}/GetPartnerPurchaseAmount/{partnerId} | Возвращает информацию о сумме покупок клиента у Партнера.
[**usersGetPersonAttributesInfo**](Usersapi.md#usersGetPersonAttributesInfo) | **GET** v1.2/users/GetPersonAttributesInfo | Возвращает информацию об атрибутах клиента.
[**usersGetPersonCoupons**](Usersapi.md#usersGetPersonCoupons) | **GET** v1.2/users/{personId}/Coupons | Возвращает информацию о купонах клиента.
[**usersGetPersonInfoById**](Usersapi.md#usersGetPersonInfoById) | **GET** v1.2/users/{id} | Возвращает информацию о клиенте по внутреннему идентификатору.
[**usersGetPersonInfoByPhone**](Usersapi.md#usersGetPersonInfoByPhone) | **GET** v1.2/users | Возвращает информацию о клиенте по номеру телефона.
[**usersGetPersonalOfferDetails**](Usersapi.md#usersGetPersonalOfferDetails) | **GET** v1.2/users/{personId}/CommunicationOffers/{offerId}/Details | Возвращает детали персонального предложения клиента.
[**usersGetPhone**](Usersapi.md#usersGetPhone) | **GET** v1.2/users/{personId}/Phone | Возвращает информацию о номере телефона клиента.
[**usersGetPreviewQuestions**](Usersapi.md#usersGetPreviewQuestions) | **GET** v1.2/users/PreviewQuestions | Возвращает информацию о вопросах анкеты для предпросмотра анкеты.
[**usersGetQrCodeByCardNumber**](Usersapi.md#usersGetQrCodeByCardNumber) | **GET** v1.2/users/code/{identifier}/cards/{cardNumber}/qrcode | Генерирует QR-код для карты клиента по номеру карты (OAuth).
[**usersGetQuestions**](Usersapi.md#usersGetQuestions) | **GET** v1.2/users/{personId}/Questions | Возвращает информацию о вопросах анкеты.
[**usersGetRegistrationActions**](Usersapi.md#usersGetRegistrationActions) | **GET** v1.2/users/{personId}/RegistrationActions | Возвращает действия, для которых нужны шаги регистрации.
[**usersGetSubscriptions**](Usersapi.md#usersGetSubscriptions) | **GET** v1.2/users/{personId}/Subscriptions | Возвращает информацию о подписках клиента.
[**usersGetUserAttributesValues**](Usersapi.md#usersGetUserAttributesValues) | **GET** v1.2/users/{personId}/AttributesValues | Возвращает список значений атрибутов клиента.
[**usersMergeAccounts**](Usersapi.md#usersMergeAccounts) | **POST** v1.2/users/{targetPersonId}/MergeAccount/{sourcePersonId} | Объединение счетов без подтверждения.
[**usersSendConfirmCode**](Usersapi.md#usersSendConfirmCode) | **POST** v1.2/users/{personId}/SendConfirmPhoneCode | Отправляет повторно код подтверждения номера телефона.
[**usersSetCard**](Usersapi.md#usersSetCard) | **POST** v1.2/users/{personId}/SetCard | Оформляет прикрепление карты к клиенту.
[**usersSetClientAttributeValue**](Usersapi.md#usersSetClientAttributeValue) | **POST** v1.2/users/code/{identifier}/attributes | Устанавливает значение атрибута клиента через OAuth.
[**usersSetEmail**](Usersapi.md#usersSetEmail) | **POST** v1.2/users/{personId}/SetEmail | Привязывает email к клиенту.
[**usersSetPhone**](Usersapi.md#usersSetPhone) | **POST** v1.2/users/{personId}/SetPhone | Привязывает номер телефона к клиенту.
[**usersSetRandomPassword**](Usersapi.md#usersSetRandomPassword) | **POST** v1.2/users/{personId}/SetRandomPassword | Устанавливает пароль клиента.
[**usersSubscribeToAll**](Usersapi.md#usersSubscribeToAll) | **POST** v1.2/users/{personId}/Subscribe | Оформляет подписку клиента на все типы подписок.
[**usersUnsubscribeFromAll**](Usersapi.md#usersUnsubscribeFromAll) | **POST** v1.2/users/{personId}/Unsubscribe | Оформляет отказ клиента от всех типов подписок.
[**usersUpdateAnswers**](Usersapi.md#usersUpdateAnswers) | **POST** v1.2/users/{personId}/UpdateAnswers | Обновляет ответы на вопросы анкеты.
[**usersUpdateEmail**](Usersapi.md#usersUpdateEmail) | **POST** v1.2/users/{personId}/notifiers/Email | Изменяет состояние нотификатора (email).
[**usersUpdatePhoneStatus**](Usersapi.md#usersUpdatePhoneStatus) | **POST** v1.2/users/{personId}/notifiers/Phone | Изменяет состояние нотификатора (номера телефона).
[**usersUpdateUserAttributeValue**](Usersapi.md#usersUpdateUserAttributeValue) | **POST** v1.2/users/{personId}/UpdateAttributeValue | Обновляет значение атрибута.



Оформляет принятие клиентом оферты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.usersAcceptTenderOffer(personId)
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


Отменяет верификацию номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.usersCancelConfirmPhone(personId)
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


Оформляет изменение часового пояса клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val model : ChangeTimeZoneModel =  // ChangeTimeZoneModel | Модель для ввода значения, где 0-время по UTC, 2-(UTC+02:00) и т.д.

val result : ResultModel = webService.usersChangeTimeZone(personId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **model** | **ChangeTimeZoneModel**| Модель для ввода значения, где 0-время по UTC, 2-(UTC+02:00) и т.д. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проверяет пароль клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val password : kotlin.String = password_example // kotlin.String | Пароль клиента.

val result : ResultModel = webService.usersCheckUserPassword(personId, password)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **password** | **kotlin.String**| Пароль клиента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Проверяет код подтверждения номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val confirmCode : PostConfirmCodeModel =  // PostConfirmCodeModel | Модель кода подтверждения.

val result : ResultModel = webService.usersConfirmPhoneCode(personId, confirmCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **confirmCode** | **PostConfirmCodeModel**| Модель кода подтверждения. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет вариант ответа анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val number : kotlin.Int = 56 // kotlin.Int | Идентификатор набора.

val result : ResultModel = webService.usersDeleteAnswer(personId, number)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **number** | **kotlin.Int**| Идентификатор набора. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет выход из Программы лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val model : DeregisterModel =  // DeregisterModel | Модель с параметрами.

val result : ResultModel = webService.usersDeregister(personId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **model** | **DeregisterModel**| Модель с параметрами. |

### Return type

**ResultModel**

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
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfEmitVirtualCardInfoModel = webService.usersEmitVirtualCardInfo(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfEmitVirtualCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список партнерских атрибутов клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfListOfAttributePartnerValueModel = webService.usersGetAttributes(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfListOfAttributePartnerValueModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает балансы по номеру телефона или номеру карты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val identifier : kotlin.String = identifier_example // kotlin.String | Номер телефона или номер карты.

val result : ResultModelOfListOfAccountBalanceModel = webService.usersGetBalance(identifier)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**| Номер телефона или номер карты. |

### Return type

**ResultModelOfListOfAccountBalanceModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о балансе клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfListOfAccountBalanceModel = webService.usersGetBalances(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfListOfAccountBalanceModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список акций клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val filterMerchantId : kotlin.Int = 56 // kotlin.Int | Id магазина.
val filterOfferState : CommunicationOfferState =  // CommunicationOfferState | Статус акции.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Со скольки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Сколько.
val filterType : CommunicationOfferType =  // CommunicationOfferType | Тип акции.
val filterCategoryFilterType : OfferCategoryFilterType =  // OfferCategoryFilterType | Фильтр по категории.
val filterCategoryLogicalNames : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Логические имена категорий.

val result : ResultModelOfPagedViewModelOfCommunicationOfferModel = webService.usersGetCommunicationOffers(personId, filterMerchantId, filterOfferState, filterFrom, filterCount, filterType, filterCategoryFilterType, filterCategoryLogicalNames)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **filterMerchantId** | **kotlin.Int**| Id магазина. | [optional]
 **filterOfferState** | **CommunicationOfferState**| Статус акции. | [optional] [enum: Active, CommingSoon]
 **filterFrom** | **kotlin.Int**| Со скольки. | [optional]
 **filterCount** | **kotlin.Int**| Сколько. | [optional]
 **filterType** | **CommunicationOfferType**| Тип акции. | [optional] [enum: Original, PersonalGoods, PersonalOffer, All]
 **filterCategoryFilterType** | **OfferCategoryFilterType**| Фильтр по категории. | [optional] [enum: SelectByLogicalName, IgnoreByLogicalName, SelectUncategorized]
 **filterCategoryLogicalNames** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Логические имена категорий. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCommunicationOfferModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о текущем пользователе.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)

val result : ResultModelOfSystemUserViewModel = webService.usersGetCurrentPersonInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfSystemUserViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает Ф.И.О. текущего пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)

val result : ResultModelOfUserName = webService.usersGetCurrentUserName()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfUserName**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о детализированном балансе клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val archivedState : ArchivedState =  // ArchivedState | Состояние валюты.
val date : kotlin.String = date_example // kotlin.String | Дата (null, если текущая).

val result : ResultModelOfDetailedBalanceInfoViewModel = webService.usersGetDetailedBalance(personId, archivedState, date)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **archivedState** | **ArchivedState**| Состояние валюты. | [optional] [enum: Archived, NonArchived]
 **date** | **kotlin.String**| Дата (null, если текущая). | [optional]

### Return type

**ResultModelOfDetailedBalanceInfoViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об операциях активации и сгораниях по конкретному счету клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val currencyId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата выборки в формате 0000-00-00T00:00:00Z.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата выборки в формате 0000-00-00T00:00:00Z.
val filterChangeTypes : kotlin.collections.MutableList<AccountChangeType> =  // kotlin.collections.MutableList<AccountChangeType> | Фильтр по типу изменения (активации/сгорания).
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfDetailedAccountChangeViewModel = webService.usersGetDetailedBalanceItemOperations(personId, currencyId, from, count, filterFromDate, filterToDate, filterChangeTypes, filterFrom, filterCount)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **currencyId** | **kotlin.Int**| Внутренний идентификатор валюты. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterFromDate** | **kotlin.String**| Начальная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterChangeTypes** | **kotlin.collections.MutableList&lt;AccountChangeType&gt;**| Фильтр по типу изменения (активации/сгорания). | [optional]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfDetailedAccountChangeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о сумме покупок клиента у Партнера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val partnerId : kotlin.String = partnerId_example // kotlin.String | Внешний идентификатор Партнера.

val result : ResultModelOfMoneyViewModel = webService.usersGetPartnerPurchaseAmount(personId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **partnerId** | **kotlin.String**| Внешний идентификатор Партнера. |

### Return type

**ResultModelOfMoneyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об атрибутах клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)

val result : ResultModelOfListOfPersonAttributeModel = webService.usersGetPersonAttributesInfo()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPersonAttributeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о купонах клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterEmissionIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | 
val filterCouponStates : kotlin.collections.MutableList<CouponState> =  // kotlin.collections.MutableList<CouponState> | 
val filterChangedStateDateFrom : kotlin.String = filterChangedStateDateFrom_example // kotlin.String | 
val filterChangedStateDateTo : kotlin.String = filterChangedStateDateTo_example // kotlin.String | 
val filterCouponNumber : kotlin.String = filterCouponNumber_example // kotlin.String | 

val result : ResultModelOfPagedViewModelOfCouponViewModel = webService.usersGetPersonCoupons(personId, count, from, filterEmissionIds, filterCouponStates, filterChangedStateDateFrom, filterChangedStateDateTo, filterCouponNumber)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. |
 **filterEmissionIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**|  | [optional]
 **filterCouponStates** | **kotlin.collections.MutableList&lt;CouponState&gt;**|  | [optional]
 **filterChangedStateDateFrom** | **kotlin.String**|  | [optional]
 **filterChangedStateDateTo** | **kotlin.String**|  | [optional]
 **filterCouponNumber** | **kotlin.String**|  | [optional]

### Return type

**ResultModelOfPagedViewModelOfCouponViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о клиенте по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfPersonInfoModel = webService.usersGetPersonInfoById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfPersonInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о клиенте по номеру телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val phone : kotlin.String = phone_example // kotlin.String | Номер телефона клиента.

val result : ResultModelOfListOfPersonInfoModel = webService.usersGetPersonInfoByPhone(phone)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **kotlin.String**| Номер телефона клиента. |

### Return type

**ResultModelOfListOfPersonInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает детали персонального предложения клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val offerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор акции.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfDetailItem = webService.usersGetPersonalOfferDetails(personId, offerId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **offerId** | **kotlin.Int**| Внутренний идентификатор акции. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfDetailItem**

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
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfUserPhoneNumberInfo = webService.usersGetPhone(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfUserPhoneNumberInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о вопросах анкеты для предпросмотра анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val filterOnlyRequired : kotlin.Boolean = true // kotlin.Boolean | True-только вопросы с отмеченным чекбоксом \"Видимый при регистрации\",false-все вопросы.

val result : ResultModelOfListOfQuestionnaireItemModel = webService.usersGetPreviewQuestions(filterOnlyRequired)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterOnlyRequired** | **kotlin.Boolean**| True-только вопросы с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;,false-все вопросы. | [optional]

### Return type

**ResultModelOfListOfQuestionnaireItemModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Генерирует QR-код для карты клиента по номеру карты (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val identifier : kotlin.String = identifier_example // kotlin.String | Номер телефона или номер любой активной Карты Участника ПЛ, которому принадлежит Карта.
val cardNumber : kotlin.String = cardNumber_example // kotlin.String | Номер карты.
val isConvertToServerTimeNeeded : kotlin.Boolean = true // kotlin.Boolean | Нужно ли преобразовать время генерации кода во время сервера.

val result : ResultModelOfQrCodeModel = webService.usersGetQrCodeByCardNumber(identifier, cardNumber, isConvertToServerTimeNeeded)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**| Номер телефона или номер любой активной Карты Участника ПЛ, которому принадлежит Карта. |
 **cardNumber** | **kotlin.String**| Номер карты. |
 **isConvertToServerTimeNeeded** | **kotlin.Boolean**| Нужно ли преобразовать время генерации кода во время сервера. | [optional]

### Return type

**ResultModelOfQrCodeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о вопросах анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val filterOnlyRequired : kotlin.Boolean = true // kotlin.Boolean | True-только вопросы с отмеченным чекбоксом \"Видимый при регистрации\",false-все вопросы.

val result : ResultModelOfListOfQuestionnaireItemModel = webService.usersGetQuestions(personId, filterOnlyRequired)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **filterOnlyRequired** | **kotlin.Boolean**| True-только вопросы с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;,false-все вопросы. | [optional]

### Return type

**ResultModelOfListOfQuestionnaireItemModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает действия, для которых нужны шаги регистрации.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfUserActionsResult = webService.usersGetRegistrationActions(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfUserActionsResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о подписках клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfListOfSubscriptionViewModel = webService.usersGetSubscriptions(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfListOfSubscriptionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список значений атрибутов клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterAttributeName : kotlin.String = filterAttributeName_example // kotlin.String | Название атрибута.

val result : ResultModelOfPagedViewModelOfUserAttributeValueViewModel = webService.usersGetUserAttributesValues(personId, filterFrom, filterCount, filterAttributeName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterAttributeName** | **kotlin.String**| Название атрибута. | [optional]

### Return type

**ResultModelOfPagedViewModelOfUserAttributeValueViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Объединение счетов без подтверждения.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val targetPersonId : kotlin.Int = 56 // kotlin.Int | Id пользователя, со счетом которого будет объединение.
val sourcePersonId : kotlin.Int = 56 // kotlin.Int | Id пользователя, счет которого присоединяется.

val result : ResultModel = webService.usersMergeAccounts(targetPersonId, sourcePersonId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetPersonId** | **kotlin.Int**| Id пользователя, со счетом которого будет объединение. |
 **sourcePersonId** | **kotlin.Int**| Id пользователя, счет которого присоединяется. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправляет повторно код подтверждения номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.usersSendConfirmCode(personId)
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


Оформляет прикрепление карты к клиенту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val setCardModel : SetCardModel =  // SetCardModel | Модель представления карты.

val result : ResultModelOfCardCompactInfoModel = webService.usersSetCard(personId, setCardModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **setCardModel** | **SetCardModel**| Модель представления карты. |

### Return type

**ResultModelOfCardCompactInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Устанавливает значение атрибута клиента через OAuth.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val identifier : kotlin.String = identifier_example // kotlin.String | Идентификатор клиента.
val model : UserAttributeValueModel =  // UserAttributeValueModel | Модель для установки значения атрибута клиента.

val result : ResultModel = webService.usersSetClientAttributeValue(identifier, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **kotlin.String**| Идентификатор клиента. |
 **model** | **UserAttributeValueModel**| Модель для установки значения атрибута клиента. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Привязывает email к клиенту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val setNewEmailModel : SetNewEmailModel =  // SetNewEmailModel | Модель для привязки email.
val attachType : CustomerActionType =  // CustomerActionType | Тип привязки email.

val result : ResultModel = webService.usersSetEmail(personId, setNewEmailModel, attachType)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **setNewEmailModel** | **SetNewEmailModel**| Модель для привязки email. |
 **attachType** | **CustomerActionType**| Тип привязки email. | [enum: Site, Sms, Operator, MobileApplication, Import, Paper]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Привязывает номер телефона к клиенту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val setNewPhoneModel : SetNewPhoneModel =  // SetNewPhoneModel | Модель для прикрепления номера телефона.

val result : ResultModelOfConfirmCodeResultModel = webService.usersSetPhone(personId, setNewPhoneModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **setNewPhoneModel** | **SetNewPhoneModel**| Модель для прикрепления номера телефона. |

### Return type

**ResultModelOfConfirmCodeResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Устанавливает пароль клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val needNotify : kotlin.Boolean = true // kotlin.Boolean | Отправить клиенту уведомление об установке пароля (true-да, false-нет).

val result : ResultModel = webService.usersSetRandomPassword(personId, needNotify)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **needNotify** | **kotlin.Boolean**| Отправить клиенту уведомление об установке пароля (true-да, false-нет). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет подписку клиента на все типы подписок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.usersSubscribeToAll(personId)
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


Оформляет отказ клиента от всех типов подписок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModel = webService.usersUnsubscribeFromAll(personId)
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


Обновляет ответы на вопросы анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val updateAnswers : kotlin.collections.MutableList<QuestionAnswerModel> =  // kotlin.collections.MutableList<QuestionAnswerModel> | Ответы.

val result : ResultModelOfQuestionsErrorsModel = webService.usersUpdateAnswers(personId, updateAnswers)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **updateAnswers** | **kotlin.collections.MutableList&lt;QuestionAnswerModel&gt;**| Ответы. |

### Return type

**ResultModelOfQuestionsErrorsModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Изменяет состояние нотификатора (email).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val model : NotifierChangeModel =  // NotifierChangeModel | Модель нотификатора (true-верифицирован, false-не верифицирован).

val result : ResultModel = webService.usersUpdateEmail(personId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **model** | **NotifierChangeModel**| Модель нотификатора (true-верифицирован, false-не верифицирован). |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Изменяет состояние нотификатора (номера телефона).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val model : NotifierChangeModel =  // NotifierChangeModel | Модель нотификатора (true-верифицирован, false-не верифицирован).

val result : ResultModel = webService.usersUpdatePhoneStatus(personId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **model** | **NotifierChangeModel**| Модель нотификатора (true-верифицирован, false-не верифицирован). |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Обновляет значение атрибута.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Usersapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val `value` : UserAttributeValueViewModel =  // UserAttributeValueViewModel | Значение атрибута для обновления.

val result : ResultModelOfUserAttributeValueUpdateError = webService.usersUpdateUserAttributeValue(personId, `value`)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **&#x60;value&#x60;** | **UserAttributeValueViewModel**| Значение атрибута для обновления. |

### Return type

**ResultModelOfUserAttributeValueUpdateError**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


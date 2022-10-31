# Userapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCheckBoughtList**](Userapi.md#userCheckBoughtList) | **POST** v1.2/User/CheckBoughtList | Возвращает информацию о том, куплен ли каждый из товаров (OAuth).
[**userConfirmDeregistration**](Userapi.md#userConfirmDeregistration) | **POST** v1.2/User/Deregistration/Confirm | Оформляет выход из Программы лояльности.
[**userConfirmSubscriptions**](Userapi.md#userConfirmSubscriptions) | **POST** v1.2/User/Subscriptions/Confirm | Оформляет подписку на все типы подписок при регистрации нового клиента.
[**userDeleteAnswer**](Userapi.md#userDeleteAnswer) | **DELETE** v1.2/User/DeleteAnswerSets | Удаляет все ответы из набора вопросов анкеты.
[**userGetActivationOperations**](Userapi.md#userGetActivationOperations) | **GET** v1.2/User/DetailedBalance/{currencyId}/Activations | Возвращает информацию об операциях активации по конкретному счету клиента (OAuth).
[**userGetAttributes**](Userapi.md#userGetAttributes) | **GET** v1.2/User/Attributes | Возвращает список партнерских атрибутов клиента (OAuth).
[**userGetBalances**](Userapi.md#userGetBalances) | **GET** v1.2/User/Balance | Возвращает информацию о балансе клиента (OAuth).
[**userGetDetailedBalance**](Userapi.md#userGetDetailedBalance) | **GET** v1.2/User/DetailedBalance | Возвращает информацию о детализированном балансе клиента (OAuth).
[**userGetDetailedBalanceItemOperations**](Userapi.md#userGetDetailedBalanceItemOperations) | **GET** v1.2/User/DetailedBalance/{currencyId}/Operations | Возвращает информацию обо всех операциях активации и сгораниях по конкретному счету клиента (OAuth).
[**userGetExpirationOperations**](Userapi.md#userGetExpirationOperations) | **GET** v1.2/User/DetailedBalance/{currencyId}/Expirations | Возвращает информацию об операциях сгорания по конкретному счету пользователя (OAuth).
[**userGetLogins**](Userapi.md#userGetLogins) | **GET** v1.2/User/Logins | Возвращает список логинов клиента.
[**userGetQuestionnaireItems**](Userapi.md#userGetQuestionnaireItems) | **GET** v1.2/User/Questions | Возвращает информацию о вопросах анкеты (OAuth).
[**userGetReferrer**](Userapi.md#userGetReferrer) | **GET** v1.2/User/Referrer | Возвращает номер бонусной карты реферера.
[**userGetRegistrationActions**](Userapi.md#userGetRegistrationActions) | **GET** v1.2/User/RegistrationActions | Возвращает список действий, для которых нужны шаги регистрации.
[**userGetSubscriptions**](Userapi.md#userGetSubscriptions) | **GET** v1.2/User/Subscriptions | Возвращает список подписок клиента.
[**userGetUserAttributeValuesHistory**](Userapi.md#userGetUserAttributeValuesHistory) | **GET** v1.2/User/Attributes/{logicalName}/History | Возвращает историю изменений значений атрибута клиента.
[**userGetUserInfo**](Userapi.md#userGetUserInfo) | **GET** v1.2/User | Возвращает информацию о клиенте (OAuth).
[**userPostAcceptTenderOffer**](Userapi.md#userPostAcceptTenderOffer) | **POST** v1.2/User/AcceptTenderOffer | Оформляет принятие оферты.
[**userPostQuestionnaireAnswers**](Userapi.md#userPostQuestionnaireAnswers) | **POST** v1.2/User/Answers | Обновляет ответы на вопросы анкеты.
[**userRejectSubscriptions**](Userapi.md#userRejectSubscriptions) | **POST** v1.2/User/Subscriptions/Reject | Оформляет отказ от всех типов подписок.
[**userSendDeregistrationConfirmCode**](Userapi.md#userSendDeregistrationConfirmCode) | **POST** v1.2/User/Deregistration/SendConfirmCode | Оформляет отправку кода подтверждения для выхода из Программы лояльности.



Возвращает информацию о том, куплен ли каждый из товаров (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val goodsIds : CheckBoughtListModel =  // CheckBoughtListModel | Список внешних идентификаторов товаров (не более двух, через запятую).

val result : ResultModelOfListOfCheckBoughtListResultModel = webService.userCheckBoughtList(goodsIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goodsIds** | **CheckBoughtListModel**| Список внешних идентификаторов товаров (не более двух, через запятую). |

### Return type

**ResultModelOfListOfCheckBoughtListResultModel**

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
val webService = apiClient.createWebservice(Userapi::class.java)
val model : ConfirmDeregistrationModel =  // ConfirmDeregistrationModel | Модель с параметрами.

val result : ResultModel = webService.userConfirmDeregistration(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **ConfirmDeregistrationModel**| Модель с параметрами. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет подписку на все типы подписок при регистрации нового клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModel = webService.userConfirmSubscriptions()
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


Удаляет все ответы из набора вопросов анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val tag : kotlin.Int = 56 // kotlin.Int | Номер набора ответов.

val result : ResultModel = webService.userDeleteAnswer(tag)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **kotlin.Int**| Номер набора ответов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об операциях активации по конкретному счету клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val currencyId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата выборки в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата выборки в формате 0000-00-00T00:00:00Z.
val orderByDateAscending : kotlin.Boolean = true // kotlin.Boolean | Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому).

val result : ResultModelOfPagedViewModelOfAccountChangeViewModel = webService.userGetActivationOperations(currencyId, from, count, fromDate, toDate, orderByDateAscending)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **kotlin.Int**| Внутренний идентификатор валюты. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **fromDate** | **kotlin.String**| Начальная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **toDate** | **kotlin.String**| Конечная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **orderByDateAscending** | **kotlin.Boolean**| Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому). | [optional]

### Return type

**ResultModelOfPagedViewModelOfAccountChangeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список партнерских атрибутов клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfListOfAttributePartnerValueModel = webService.userGetAttributes()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfAttributePartnerValueModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о балансе клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfListOfAccountBalanceModel = webService.userGetBalances()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfAccountBalanceModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о детализированном балансе клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val state : ArchivedState =  // ArchivedState | Состояние валюты.
val date : kotlin.String = date_example // kotlin.String | Дата (если текущая, то значение null).

val result : ResultModelOfDetailedBalanceInfoViewModel = webService.userGetDetailedBalance(state, date)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **ArchivedState**| Состояние валюты. | [optional] [enum: Archived, NonArchived]
 **date** | **kotlin.String**| Дата (если текущая, то значение null). | [optional]

### Return type

**ResultModelOfDetailedBalanceInfoViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию обо всех операциях активации и сгораниях по конкретному счету клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val currencyId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.
val orderByDateAscending : kotlin.Boolean = true // kotlin.Boolean | Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому).
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата выборки в формате 0000-00-00T00:00:00Z.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата выборки в формате 0000-00-00T00:00:00Z.
val filterChangeTypes : kotlin.collections.MutableList<AccountChangeType> =  // kotlin.collections.MutableList<AccountChangeType> | Фильтр по типу изменения (активации/сгорания).
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPagedViewModelOfAccountChangeViewModel = webService.userGetDetailedBalanceItemOperations(currencyId, orderByDateAscending, filterFromDate, filterToDate, filterChangeTypes, filterFrom, filterCount)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **kotlin.Int**| Внутренний идентификатор валюты. |
 **orderByDateAscending** | **kotlin.Boolean**| Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому). | [optional]
 **filterFromDate** | **kotlin.String**| Начальная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **filterChangeTypes** | **kotlin.collections.MutableList&lt;AccountChangeType&gt;**| Фильтр по типу изменения (активации/сгорания). | [optional]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPagedViewModelOfAccountChangeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию об операциях сгорания по конкретному счету пользователя (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val currencyId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата выборки в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата выборки в формате 0000-00-00T00:00:00Z.
val orderByDateAscending : kotlin.Boolean = true // kotlin.Boolean | True-сортировка по дате от прошлого к будущему, false-сортировка по дате от будущего к прошлому.

val result : ResultModelOfPagedViewModelOfAccountChangeViewModel = webService.userGetExpirationOperations(currencyId, from, count, fromDate, toDate, orderByDateAscending)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | **kotlin.Int**| Внутренний идентификатор валюты. |
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **fromDate** | **kotlin.String**| Начальная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **toDate** | **kotlin.String**| Конечная дата выборки в формате 0000-00-00T00:00:00Z. | [optional]
 **orderByDateAscending** | **kotlin.Boolean**| True-сортировка по дате от прошлого к будущему, false-сортировка по дате от будущего к прошлому. | [optional]

### Return type

**ResultModelOfPagedViewModelOfAccountChangeViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список логинов клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfUserIdentifiersInfoResult = webService.userGetLogins()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfUserIdentifiersInfoResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о вопросах анкеты (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val filterOnlyRequired : kotlin.Boolean = true // kotlin.Boolean | True-только вопросы с отмеченным чекбоксом \"Видимый при регистрации\",false-все вопросы.

val result : ResultModelOfListOfQuestionnaireItemModel = webService.userGetQuestionnaireItems(filterOnlyRequired)
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


Возвращает номер бонусной карты реферера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfReferrerInfoViewModel = webService.userGetReferrer()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfReferrerInfoViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список действий, для которых нужны шаги регистрации.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfUserActionsResult = webService.userGetRegistrationActions()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfUserActionsResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список подписок клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val subscriptionExternalIds : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Внешний идентификатор рассылки.

val result : ResultModelOfListOfSubscriptionViewModel = webService.userGetSubscriptions(subscriptionExternalIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionExternalIds** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Внешний идентификатор рассылки. |

### Return type

**ResultModelOfListOfSubscriptionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает историю изменений значений атрибута клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.
val filterCreateDateFrom : kotlin.String = filterCreateDateFrom_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00 00 00Z (Если не задана, то - самая ранняя).
val filterCreateDateTo : kotlin.String = filterCreateDateTo_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00 00 00Z.(Если не задана, то - самая поздняя).
val filterSortDescendingByCreateDateTime : kotlin.Boolean = true // kotlin.Boolean | Тип сортировки (true-по убыванию, false-по возрастанию).
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPersonAttributeValueHistoryModel = webService.userGetUserAttributeValuesHistory(logicalName, filterCreateDateFrom, filterCreateDateTo, filterSortDescendingByCreateDateTime, filterFrom, filterCount)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |
 **filterCreateDateFrom** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00 00 00Z (Если не задана, то - самая ранняя). | [optional]
 **filterCreateDateTo** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00 00 00Z.(Если не задана, то - самая поздняя). | [optional]
 **filterSortDescendingByCreateDateTime** | **kotlin.Boolean**| Тип сортировки (true-по убыванию, false-по возрастанию). | [optional]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]

### Return type

**ResultModelOfPersonAttributeValueHistoryModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о клиенте (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val payload : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Список логических имен атрибутов клиента  State, Cards, BalanceShortInfo, BalanceDetailedInfo, EmailDetailedInfo, Attributes.{название атрибута} (например Attributes.FirstName).

val result : ResultModelOfUserInfoResult = webService.userGetUserInfo(payload)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Список логических имен атрибутов клиента  State, Cards, BalanceShortInfo, BalanceDetailedInfo, EmailDetailedInfo, Attributes.{название атрибута} (например Attributes.FirstName). | [optional]

### Return type

**ResultModelOfUserInfoResult**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет принятие оферты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModel = webService.userPostAcceptTenderOffer()
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


Обновляет ответы на вопросы анкеты.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)
val updateAnswersModel : kotlin.collections.MutableList<QuestionAnswerModel> =  // kotlin.collections.MutableList<QuestionAnswerModel> | Ответы.

val result : ResultModelOfQuestionsErrorsModel = webService.userPostQuestionnaireAnswers(updateAnswersModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateAnswersModel** | **kotlin.collections.MutableList&lt;QuestionAnswerModel&gt;**| Ответы. |

### Return type

**ResultModelOfQuestionsErrorsModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Оформляет отказ от всех типов подписок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModel = webService.userRejectSubscriptions()
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


Оформляет отправку кода подтверждения для выхода из Программы лояльности.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Userapi::class.java)

val result : ResultModelOfSendDeregistrationConfirmCodeResultModel = webService.userSendDeregistrationConfirmCode()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfSendDeregistrationConfirmCodeResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


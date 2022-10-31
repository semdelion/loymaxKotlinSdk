# Historyapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**historyGetGoodsIds**](Historyapi.md#historyGetGoodsIds) | **GET** v1.2/History/GoodsIds | Возвращает список товаров за указанный период времени (OAuth).
[**historyGetHistory**](Historyapi.md#historyGetHistory) | **GET** v1.2/History | Возвращает историю операций клиента (OAuth).
[**historyGetHistoryAggregateWithdrawRewardPurchase**](Historyapi.md#historyGetHistoryAggregateWithdrawRewardPurchase) | **GET** v1.2/History/AggregateWithdrawRewardPurchase | Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок (OAuth).
[**historyGetHistoryAggregateWithdrawRewardPurchaseByPerson**](Historyapi.md#historyGetHistoryAggregateWithdrawRewardPurchaseByPerson) | **GET** v1.2/Users/{personId}/History/AggregateWithdrawRewardPurchase | Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок.
[**historyGetHistoryByPerson**](Historyapi.md#historyGetHistoryByPerson) | **GET** v1.2/Users/{personId}/History | Возвращает историю операций клиента.
[**historySendHistoryToEmail**](Historyapi.md#historySendHistoryToEmail) | **PUT** v1.2/History/SendToEmail | Отправляет историю операций клиенту по email.



Возвращает список товаров за указанный период времени (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val fromDate : kotlin.String = fromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val toDate : kotlin.String = toDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val brandUid : kotlin.String = brandUid_example // kotlin.String | Внешний идентификатор бренда.

val result : ResultModelOfListOfString = webService.historyGetGoodsIds(fromDate, toDate, brandUid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. |
 **toDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. |
 **brandUid** | **kotlin.String**| Внешний идентификатор бренда. | [optional]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает историю операций клиента (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val filterCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты. Возвращает историю только по этой карте.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterHistoryItemType : HistoryItemType =  // HistoryItemType | Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}.
val filterChequeNumber : kotlin.String = filterChequeNumber_example // kotlin.String | Номер чека.
val filterOperationTypes : kotlin.collections.MutableList<HistoryItemOperationType> =  // kotlin.collections.MutableList<HistoryItemOperationType> | Типы операций.
val filterCurrentUser : kotlin.Boolean = true // kotlin.Boolean | По текущему клиенту (true), по группе клиентов (false).

val result : ResultModelOfHistoryListModel = webService.historyGetHistory(filterFromDate, filterToDate, filterCardId, filterFrom, filterCount, filterHistoryItemType, filterChequeNumber, filterOperationTypes, filterCurrentUser)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterCardId** | **kotlin.Int**| Внутренний идентификатор карты. Возвращает историю только по этой карте. | [optional]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterHistoryItemType** | **HistoryItemType**| Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. | [optional] [enum: All, Purchase, RewardData, WithdrawData]
 **filterChequeNumber** | **kotlin.String**| Номер чека. | [optional]
 **filterOperationTypes** | **kotlin.collections.MutableList&lt;HistoryItemOperationType&gt;**| Типы операций. | [optional]
 **filterCurrentUser** | **kotlin.Boolean**| По текущему клиенту (true), по группе клиентов (false). | [optional]

### Return type

**ResultModelOfHistoryListModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю.
val filterCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты (будет получена история только по этой карте).
val filterHistoryItemType : HistoryItemType =  // HistoryItemType | Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}.
val filterCurrentUser : kotlin.Boolean = true // kotlin.Boolean | По текущему клиенту (true), по группе клиента (false).

val result : ResultModelOfHistoryAggregateWithdrawRewardModel = webService.historyGetHistoryAggregateWithdrawRewardPurchase(filterFromDate, filterToDate, filterCardId, filterHistoryItemType, filterCurrentUser)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю. | [optional]
 **filterCardId** | **kotlin.Int**| Внутренний идентификатор карты (будет получена история только по этой карте). | [optional]
 **filterHistoryItemType** | **HistoryItemType**| Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}. | [optional] [enum: All, Purchase, RewardData, WithdrawData]
 **filterCurrentUser** | **kotlin.Boolean**| По текущему клиенту (true), по группе клиента (false). | [optional]

### Return type

**ResultModelOfHistoryAggregateWithdrawRewardModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю.
val filterCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты (будет получена история только по этой карте).
val filterHistoryItemType : HistoryItemType =  // HistoryItemType | Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}.
val filterCurrentUser : kotlin.Boolean = true // kotlin.Boolean | По текущему клиенту (true), по группе клиента (false).

val result : ResultModelOfHistoryAggregateWithdrawRewardModel = webService.historyGetHistoryAggregateWithdrawRewardPurchaseByPerson(personId, filterFromDate, filterToDate, filterCardId, filterHistoryItemType, filterCurrentUser)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **filterFromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю. | [optional]
 **filterCardId** | **kotlin.Int**| Внутренний идентификатор карты (будет получена история только по этой карте). | [optional]
 **filterHistoryItemType** | **HistoryItemType**| Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}. | [optional] [enum: All, Purchase, RewardData, WithdrawData]
 **filterCurrentUser** | **kotlin.Boolean**| По текущему клиенту (true), по группе клиента (false). | [optional]

### Return type

**ResultModelOfHistoryAggregateWithdrawRewardModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает историю операций клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Дата с которой необходимо вывести историю.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Дата до которой необходимо вывести историю.
val filterCardId : kotlin.Int = 56 // kotlin.Int | ID карты. Если указан, то будет получена история только по этой карте.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начиная с какого элемента необходимо выводить.
val filterCount : kotlin.Int = 56 // kotlin.Int | Кол-во элементов для вывода.
val filterHistoryItemType : HistoryItemType =  // HistoryItemType | Тип события в истории {Loymax.Mobile.Contract.Models.History.HistoryFilterV13.HistoryItemType}.
val filterChequeNumber : kotlin.String = filterChequeNumber_example // kotlin.String | Номер чека.
val filterOperationTypes : kotlin.collections.MutableList<kotlin.String> =  // kotlin.collections.MutableList<kotlin.String> | Типы операций с указанием покупка или возврат.
val filterCurrentUser : kotlin.Boolean = true // kotlin.Boolean | По текущему пользователю, или по группе пользователя.

val result : ResultModelOfHistoryListModel = webService.historyGetHistoryByPerson(personId, filterFromDate, filterToDate, filterCardId, filterFrom, filterCount, filterHistoryItemType, filterChequeNumber, filterOperationTypes, filterCurrentUser)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **filterFromDate** | **kotlin.String**| Дата с которой необходимо вывести историю. | [optional]
 **filterToDate** | **kotlin.String**| Дата до которой необходимо вывести историю. | [optional]
 **filterCardId** | **kotlin.Int**| ID карты. Если указан, то будет получена история только по этой карте. | [optional]
 **filterFrom** | **kotlin.Int**| Начиная с какого элемента необходимо выводить. | [optional]
 **filterCount** | **kotlin.Int**| Кол-во элементов для вывода. | [optional]
 **filterHistoryItemType** | **HistoryItemType**| Тип события в истории {Loymax.Mobile.Contract.Models.History.HistoryFilterV13.HistoryItemType}. | [optional] [enum: All, Purchase, RewardData, WithdrawData]
 **filterChequeNumber** | **kotlin.String**| Номер чека. | [optional]
 **filterOperationTypes** | **kotlin.collections.MutableList&lt;kotlin.String&gt;**| Типы операций с указанием покупка или возврат. | [optional]
 **filterCurrentUser** | **kotlin.Boolean**| По текущему пользователю, или по группе пользователя. | [optional]

### Return type

**ResultModelOfHistoryListModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отправляет историю операций клиенту по email.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Historyapi::class.java)
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val filterCardId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор карты. Возвращает историю только по этой карте.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterHistoryItemType : HistoryItemType =  // HistoryItemType | Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}.
val filterChequeNumber : kotlin.String = filterChequeNumber_example // kotlin.String | Номер чека.
val filterOperationTypes : kotlin.collections.MutableList<HistoryItemOperationType> =  // kotlin.collections.MutableList<HistoryItemOperationType> | Типы операций.
val filterCurrentUser : kotlin.Boolean = true // kotlin.Boolean | По текущему клиенту (true), по группе клиентов (false).

val result : ResultModel = webService.historySendHistoryToEmail(filterFromDate, filterToDate, filterCardId, filterFrom, filterCount, filterHistoryItemType, filterChequeNumber, filterOperationTypes, filterCurrentUser)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterCardId** | **kotlin.Int**| Внутренний идентификатор карты. Возвращает историю только по этой карте. | [optional]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterHistoryItemType** | **HistoryItemType**| Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. | [optional] [enum: All, Purchase, RewardData, WithdrawData]
 **filterChequeNumber** | **kotlin.String**| Номер чека. | [optional]
 **filterOperationTypes** | **kotlin.collections.MutableList&lt;HistoryItemOperationType&gt;**| Типы операций. | [optional]
 **filterCurrentUser** | **kotlin.Boolean**| По текущему клиенту (true), по группе клиентов (false). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


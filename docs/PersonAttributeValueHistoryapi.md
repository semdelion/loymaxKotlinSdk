# PersonAttributeValueHistoryapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personAttributeValueHistoryGetPersonAttributeHistory**](PersonAttributeValueHistoryapi.md#personAttributeValueHistoryGetPersonAttributeHistory) | **GET** v1.2/users/{personId}/attributes/{attributeId}/history | Получить историю изменения значения атрибута пользователя.



Получить историю изменения значения атрибута пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PersonAttributeValueHistoryapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val attributeId : kotlin.Int = 56 // kotlin.Int | Id атрибута.
val filterCreateDateFrom : kotlin.String = filterCreateDateFrom_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00 00 00Z (Если не задана, то - самая ранняя).
val filterCreateDateTo : kotlin.String = filterCreateDateTo_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00 00 00Z.(Если не задана, то - самая поздняя).
val filterSortDescendingByCreateDateTime : kotlin.Boolean = true // kotlin.Boolean | Тип сортировки (true-по убыванию, false-по возрастанию).
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.

val result : ResultModelOfPersonAttributeValueHistoryModel = webService.personAttributeValueHistoryGetPersonAttributeHistory(personId, attributeId, filterCreateDateFrom, filterCreateDateTo, filterSortDescendingByCreateDateTime, filterFrom, filterCount)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Id пользователя. |
 **attributeId** | **kotlin.Int**| Id атрибута. |
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


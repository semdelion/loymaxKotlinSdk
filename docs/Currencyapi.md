# Currencyapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currencyCreate**](Currencyapi.md#currencyCreate) | **PUT** v1.2/currency | Создает новую валюту.
[**currencyGetById**](Currencyapi.md#currencyGetById) | **GET** v1.2/currency/{id} | Возвращает информацию о валюте по внутреннему идентификатору.
[**currencyGetByUid**](Currencyapi.md#currencyGetByUid) | **GET** v1.2/currency/{uid} | Возвращает информацию о валюте по внешнему идентификатору.
[**currencyRestoreCurrency**](Currencyapi.md#currencyRestoreCurrency) | **POST** v1.2/currency/{id}/restore | Возвращает валюту из архива.



Создает новую валюту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Currencyapi::class.java)
val model : CurrencyViewModel =  // CurrencyViewModel | Модель создания валюты.

val result : ResultModelOfCurrencyViewModel = webService.currencyCreate(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **CurrencyViewModel**| Модель создания валюты. |

### Return type

**ResultModelOfCurrencyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о валюте по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Currencyapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.

val result : ResultModelOfCurrencyViewModel = webService.currencyGetById(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор валюты. |

### Return type

**ResultModelOfCurrencyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о валюте по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Currencyapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор валюты.

val result : ResultModelOfCurrencyViewModel = webService.currencyGetByUid(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор валюты. |

### Return type

**ResultModelOfCurrencyViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает валюту из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Currencyapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор валюты.
val changeCode : kotlin.Boolean = true // kotlin.Boolean | Генерация нового кода валюты (true - генерировать код, false - не генерировать код).

val result : ResultModel = webService.currencyRestoreCurrency(id, changeCode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор валюты. |
 **changeCode** | **kotlin.Boolean**| Генерация нового кода валюты (true - генерировать код, false - не генерировать код). | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


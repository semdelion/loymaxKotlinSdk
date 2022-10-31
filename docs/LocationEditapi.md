# LocationEditapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationEditCreate**](LocationEditapi.md#locationEditCreate) | **PUT** v1.2/locations | Добавляет новое местоположение.
[**locationEditGet**](LocationEditapi.md#locationEditGet) | **GET** v1.2/locations/{id} | Возвращает информацию о местоположении по внутреннему идентификатору.
[**locationEditGetByUid**](LocationEditapi.md#locationEditGetByUid) | **GET** v1.2/locations/{uid} | Возвращает информацию о местоположении по внешнему идентификатору.
[**locationEditGetCities**](LocationEditapi.md#locationEditGetCities) | **GET** v1.2/locations/CitiesStartWith | Получить список городов.
[**locationEditGetCitiesByRegionId**](LocationEditapi.md#locationEditGetCitiesByRegionId) | **GET** v1.2/locations/Region/{regionId}/Cities | Получить список городов.
[**locationEditGetCountries**](LocationEditapi.md#locationEditGetCountries) | **GET** v1.2/locations/Countries | Получить список стран.
[**locationEditGetHouses**](LocationEditapi.md#locationEditGetHouses) | **GET** v1.2/locations/Houses | Получить список домов.
[**locationEditGetLocationsCities**](LocationEditapi.md#locationEditGetLocationsCities) | **GET** v1.2/locations/Cities | Возвращает список населенных пунктов.
[**locationEditGetRegions**](LocationEditapi.md#locationEditGetRegions) | **GET** v1.2/locations/Regions | Получить список регионов.
[**locationEditGetStreets**](LocationEditapi.md#locationEditGetStreets) | **GET** v1.2/locations/Streets | Получить список улиц.



Добавляет новое местоположение.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val model : LocationDataModel =  // LocationDataModel | Модель описания местоположения торговой точки.

val result : ResultModelOfInt32 = webService.locationEditCreate(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **LocationDataModel**| Модель описания местоположения торговой точки. |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о местоположении по внутреннему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор местоположения.

val result : ResultModelOfLocationDataModel = webService.locationEditGet(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Внутренний идентификатор местоположения. |

### Return type

**ResultModelOfLocationDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о местоположении по внешнему идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val uid : kotlin.String = uid_example // kotlin.String | Внешний идентификатор местоположения.

val result : ResultModelOfLocationDataModel = webService.locationEditGetByUid(uid)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **kotlin.String**| Внешний идентификатор местоположения. |

### Return type

**ResultModelOfLocationDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список городов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | Поисковая строка.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.

val result : ResultModelOfListOfString = webService.locationEditGetCities(startWith, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startWith** | **kotlin.String**| Поисковая строка. | [optional]
 **count** | **kotlin.Int**| Кол-во выводимых элементов. | [optional]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список городов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val regionId : kotlin.Int = 56 // kotlin.Int | Id региона.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfCityViewModel = webService.locationEditGetCitiesByRegionId(regionId, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **kotlin.Int**| Id региона. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCityViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список стран.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterStartWith : kotlin.String = filterStartWith_example // kotlin.String | Поисковая строка.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы стран, которые будут выбираться первыми.

val result : ResultModelOfPagedViewModelOfCountryViewModel = webService.locationEditGetCountries(filterFrom, filterCount, filterStartWith, filterSortingIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество. | [optional]
 **filterStartWith** | **kotlin.String**| Поисковая строка. | [optional]
 **filterSortingIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы стран, которые будут выбираться первыми. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCountryViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список домов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | С какого элемента выводить.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.
val street : kotlin.String = street_example // kotlin.String | Фильтр по улице.
val city : kotlin.String = city_example // kotlin.String | Название города.

val result : ResultModelOfListOfString = webService.locationEditGetHouses(startWith, count, street, city)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startWith** | **kotlin.String**| С какого элемента выводить. | [optional]
 **count** | **kotlin.Int**| Кол-во выводимых элементов. | [optional]
 **street** | **kotlin.String**| Фильтр по улице. | [optional]
 **city** | **kotlin.String**| Название города. | [optional]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список населенных пунктов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val startSubstr : kotlin.String = startSubstr_example // kotlin.String | Подстрока для поиска по названию населенного пункта.
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val regionName : kotlin.String = regionName_example // kotlin.String | Название региона.

val result : ResultModelOfPagedViewModelOfCityDataModel = webService.locationEditGetLocationsCities(startSubstr, from, count, regionName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startSubstr** | **kotlin.String**| Подстрока для поиска по названию населенного пункта. | [optional]
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **regionName** | **kotlin.String**| Название региона. | [optional]

### Return type

**ResultModelOfPagedViewModelOfCityDataModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список регионов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | Поисковая строка.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfRegionViewModel = webService.locationEditGetRegions(startWith, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startWith** | **kotlin.String**| Поисковая строка. | [optional]
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]

### Return type

**ResultModelOfPagedViewModelOfRegionViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список улиц.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(LocationEditapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | С какого элемента выводить.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.
val city : kotlin.String = city_example // kotlin.String | Фильтр по городу.

val result : ResultModelOfListOfString = webService.locationEditGetStreets(startWith, count, city)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startWith** | **kotlin.String**| С какого элемента выводить. | [optional]
 **count** | **kotlin.Int**| Кол-во выводимых элементов. | [optional]
 **city** | **kotlin.String**| Фильтр по городу. | [optional]

### Return type

**ResultModelOfListOfString**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


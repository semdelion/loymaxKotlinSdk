# CommonLocationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonLocationGetCities**](CommonLocationapi.md#commonLocationGetCities) | **GET** v1.2/Location/CitiesStartWith | Получить список городов.
[**commonLocationGetCitiesByRegionId**](CommonLocationapi.md#commonLocationGetCitiesByRegionId) | **GET** v1.2/Location/Region/{regionId}/Cities | Получить список городов.
[**commonLocationGetCountries**](CommonLocationapi.md#commonLocationGetCountries) | **GET** v1.2/Location/Countries | Получить список стран.
[**commonLocationGetHouses**](CommonLocationapi.md#commonLocationGetHouses) | **GET** v1.2/Location/Houses | Получить список домов.
[**commonLocationGetRegions**](CommonLocationapi.md#commonLocationGetRegions) | **GET** v1.2/Location/Regions | Получить список регионов.
[**commonLocationGetStreets**](CommonLocationapi.md#commonLocationGetStreets) | **GET** v1.2/Location/Streets | Получить список улиц.



Получить список городов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | Поисковая строка.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.

val result : ResultModelOfListOfString = webService.commonLocationGetCities(startWith, count)
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
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val regionId : kotlin.Int = 56 // kotlin.Int | Id региона.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfCityViewModel = webService.commonLocationGetCitiesByRegionId(regionId, from, count)
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
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterStartWith : kotlin.String = filterStartWith_example // kotlin.String | Поисковая строка.
val filterSortingIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы стран, которые будут выбираться первыми.

val result : ResultModelOfPagedViewModelOfCountryViewModel = webService.commonLocationGetCountries(filterFrom, filterCount, filterStartWith, filterSortingIds)
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
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | С какого элемента выводить.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.
val street : kotlin.String = street_example // kotlin.String | Фильтр по улице.
val city : kotlin.String = city_example // kotlin.String | Название города.

val result : ResultModelOfListOfString = webService.commonLocationGetHouses(startWith, count, street, city)
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


Получить список регионов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | Поисковая строка.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfPagedViewModelOfRegionViewModel = webService.commonLocationGetRegions(startWith, from, count)
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
val webService = apiClient.createWebservice(CommonLocationapi::class.java)
val startWith : kotlin.String = startWith_example // kotlin.String | С какого элемента выводить.
val count : kotlin.Int = 56 // kotlin.Int | Кол-во выводимых элементов.
val city : kotlin.String = city_example // kotlin.String | Фильтр по городу.

val result : ResultModelOfListOfString = webService.commonLocationGetStreets(startWith, count, city)
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


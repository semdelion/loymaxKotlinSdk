# Geoapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoPostCoordinate**](Geoapi.md#geoPostCoordinate) | **POST** v1.2/Geo/Coordinate | Передача информации о местоположении пользователя.



Передача информации о местоположении пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Geoapi::class.java)
val coordinate : GeoCoordinateModel =  // GeoCoordinateModel | Координаты местоположения пользователя.

val result : ResultModel = webService.geoPostCoordinate(coordinate)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coordinate** | **GeoCoordinateModel**| Координаты местоположения пользователя. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


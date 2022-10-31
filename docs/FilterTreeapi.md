# FilterTreeapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterTreeGetCustomerIdentificationTree**](FilterTreeapi.md#filterTreeGetCustomerIdentificationTree) | **GET** v1.2/Filters/customerIdentificationTree | Возвращает дерево доступных способов идентификации.



Возвращает дерево доступных способов идентификации.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(FilterTreeapi::class.java)

val result : ResultModelOfCustomerIdentificationTreeModel = webService.filterTreeGetCustomerIdentificationTree()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfCustomerIdentificationTreeModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


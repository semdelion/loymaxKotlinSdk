# UserAttributeValueapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAttributeValueGetAttributeValue**](UserAttributeValueapi.md#userAttributeValueGetAttributeValue) | **GET** v1.2/userAttributeValue/{userId} | Возвращает значение атрибута клиента.



Возвращает значение атрибута клиента.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserAttributeValueapi::class.java)
val userId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.
val logicalName : kotlin.String = logicalName_example // kotlin.String | Логическое имя атрибута.

val result : ResultModelOfUserAttributeValueViewModel = webService.userAttributeValueGetAttributeValue(userId, logicalName)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| Внутренний идентификатор клиента. |
 **logicalName** | **kotlin.String**| Логическое имя атрибута. |

### Return type

**ResultModelOfUserAttributeValueViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


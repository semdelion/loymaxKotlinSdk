# OAuthProviderMethodsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oAuthProviderMethodsGetMethods**](OAuthProviderMethodsapi.md#oAuthProviderMethodsGetMethods) | **GET** v1.2/OAuthProviders/{provider}/Methods | Получает методы для обращения к апи социальной сети.



Получает методы для обращения к апи социальной сети.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OAuthProviderMethodsapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | Провайдер социальной сети.

val result : ResultModelOfOAuthProviderMethodsViewModel = webService.oAuthProviderMethodsGetMethods(provider)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| Провайдер социальной сети. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]

### Return type

**ResultModelOfOAuthProviderMethodsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


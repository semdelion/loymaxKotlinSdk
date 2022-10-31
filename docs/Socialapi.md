# Socialapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**socialGet**](Socialapi.md#socialGet) | **GET** v1.2/Social/Clients | Получает список доступных OAuth клиентов.
[**socialGetSocialClientsByProvider**](Socialapi.md#socialGetSocialClientsByProvider) | **GET** v1.2/Social/Clients/{provider} | Получает OAuth клиента для указанного провайдера.



Получает список доступных OAuth клиентов.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Socialapi::class.java)

val result : ResultModelOfListOfOAuthSettingsViewModel = webService.socialGet()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfOAuthSettingsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает OAuth клиента для указанного провайдера.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Socialapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | Провайдер.

val result : ResultModelOfOAuthSettingsViewModel = webService.socialGetSocialClientsByProvider(provider)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| Провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]

### Return type

**ResultModelOfOAuthSettingsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


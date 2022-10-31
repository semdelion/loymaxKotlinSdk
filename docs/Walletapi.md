# Walletapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetWalletCard**](Walletapi.md#walletGetWalletCard) | **GET** v1.2/Cards/Wallet/{link} | Получаем Wallet-карту для пользователя, или ссылку на AppleWallet карту.
[**walletGetWalletCardLink**](Walletapi.md#walletGetWalletCardLink) | **GET** v1.2/Cards/{cardId}/Wallet | Получаем ссылку для скачивания карты(если авторизованы).



Получаем Wallet-карту для пользователя, или ссылку на AppleWallet карту.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Walletapi::class.java)
val link : kotlin.String = link_example // kotlin.String | Ссылка для получения Wallet карты.
val platform : PlatformType =  // PlatformType | Платформа для которой возвращаем карту.

val result : kotlin.Any = webService.walletGetWalletCard(link, platform)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **link** | **kotlin.String**| Ссылка для получения Wallet карты. |
 **platform** | **PlatformType**| Платформа для которой возвращаем карту. | [optional] [enum: Ios, Android, WindowsPhone, Harmony, Unknown]

### Return type

**kotlin.Any**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получаем ссылку для скачивания карты(если авторизованы).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(Walletapi::class.java)
val cardId : kotlin.Int = 56 // kotlin.Int | Id карты.
val platform : PlatformType =  // PlatformType | Платформа для которой возвращаем ссылку.

val result : ResultModelOfWalletCardLinkViewModel = webService.walletGetWalletCardLink(cardId, platform)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| Id карты. |
 **platform** | **PlatformType**| Платформа для которой возвращаем ссылку. | [optional] [enum: Ios, Android, WindowsPhone, Harmony, Unknown]

### Return type

**ResultModelOfWalletCardLinkViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


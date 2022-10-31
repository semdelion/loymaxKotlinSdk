# UserSocialapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSocialGetAccounts**](UserSocialapi.md#userSocialGetAccounts) | **GET** v1.2/users/{personId}/SocialAccounts | Возвращает список всех аккаунтов клиента в социальных сетях.
[**userSocialLoginSocialV12**](UserSocialapi.md#userSocialLoginSocialV12) | **GET** v1.2/user/{provider}/Login | Авторизует клиента через привязанную к аккаунту социальную сеть (OAuth).
[**userSocialRemoveSocial**](UserSocialapi.md#userSocialRemoveSocial) | **POST** v1.2/user/{provider}/Remove | Отвязывает аккаунт от социальной сети.
[**userSocialSetSocial**](UserSocialapi.md#userSocialSetSocial) | **GET** v1.2/user/{provider}/Set | Привязывает аккаунт к социальной сети.
[**userSocialSocialGroups**](UserSocialapi.md#userSocialSocialGroups) | **GET** v1.2/user/Social/Groups | Возвращает информацию о группах в социальных сетях, в которых состоит клиент.



Возвращает список всех аккаунтов клиента в социальных сетях.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserSocialapi::class.java)
val personId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента.

val result : ResultModelOfListOfOAuthIdentifierInfo = webService.userSocialGetAccounts(personId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **kotlin.Int**| Внутренний идентификатор клиента. |

### Return type

**ResultModelOfListOfOAuthIdentifierInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Авторизует клиента через привязанную к аккаунту социальную сеть (OAuth).

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserSocialapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | OAuth-провайдер.
val code : kotlin.String = code_example // kotlin.String | Код авторизации, переданный OAuth-провайдером.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | Адрес, для которого был получен код авторизации.

val result : ResultModelOfAuthResultModel = webService.userSocialLoginSocialV12(provider, code, redirectUri)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| OAuth-провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]
 **code** | **kotlin.String**| Код авторизации, переданный OAuth-провайдером. |
 **redirectUri** | **kotlin.String**| Адрес, для которого был получен код авторизации. | [optional]

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Отвязывает аккаунт от социальной сети.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserSocialapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | OAuth-провайдер.

val result : ResultModel = webService.userSocialRemoveSocial(provider)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| OAuth-провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Привязывает аккаунт к социальной сети.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserSocialapi::class.java)
val provider : OAuthProviderType =  // OAuthProviderType | OAuth-провайдер.
val code : kotlin.String = code_example // kotlin.String | Код авторизации, переданный OAuth-провайдером.
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | Адрес, для которого был получен код авторизации.

val result : ResultModel = webService.userSocialSetSocial(provider, code, redirectUri)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **OAuthProviderType**| OAuth-провайдер. | [enum: VKontakte, MyMail, Odnoklassniki, Loymax, Apple]
 **code** | **kotlin.String**| Код авторизации, переданный OAuth-провайдером. |
 **redirectUri** | **kotlin.String**| Адрес, для которого был получен код авторизации. | [optional]

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о группах в социальных сетях, в которых состоит клиент.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserSocialapi::class.java)

val result : ResultModelOfListOfOAuthUserGroupMember = webService.userSocialSocialGroups()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfOAuthUserGroupMember**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


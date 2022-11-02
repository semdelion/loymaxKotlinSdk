# PhoneSettingsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phoneSettingsArchiveSetting**](PhoneSettingsapi.md#phoneSettingsArchiveSetting) | **POST** v1.2/PhoneSettings/{settingId}/Archive | Заархивировать настройку.
[**phoneSettingsCreateSetting**](PhoneSettingsapi.md#phoneSettingsCreateSetting) | **PUT** v1.2/PhoneSettings/Create | Создать формат номера телефона.
[**phoneSettingsGetActiveSettingsList**](PhoneSettingsapi.md#phoneSettingsGetActiveSettingsList) | **GET** v1.2/PhoneSettings/Active | Получить список активных настроек отображения телефона.
[**phoneSettingsGetSetting**](PhoneSettingsapi.md#phoneSettingsGetSetting) | **GET** v1.2/PhoneSettings/{settingId} | Получить формат номера телефона по Id.
[**phoneSettingsGetSettingsList**](PhoneSettingsapi.md#phoneSettingsGetSettingsList) | **POST** v1.2/PhoneSettings/List | Получить настройки отображения телефона.
[**phoneSettingsRestoreSetting**](PhoneSettingsapi.md#phoneSettingsRestoreSetting) | **POST** v1.2/PhoneSettings/{settingId}/Restore | Восстановить настройку.
[**phoneSettingsUpdateSetting**](PhoneSettingsapi.md#phoneSettingsUpdateSetting) | **POST** v1.2/PhoneSettings/{settingId}/Update | Изменить формат номера телефона.



Заархивировать настройку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val settingId : kotlin.Int = 56 // kotlin.Int | Идентификатор настройки.

val result : ResultModel = webService.phoneSettingsArchiveSetting(settingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingId** | **kotlin.Int**| Идентификатор настройки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Создать формат номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val model : PhoneSettingsViewModel =  // PhoneSettingsViewModel | Новый формат номера.

val result : ResultModelOfNullableOfInt32 = webService.phoneSettingsCreateSetting(model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **PhoneSettingsViewModel**| Новый формат номера. |

### Return type

**ResultModelOfNullableOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список активных настроек отображения телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)

val result : ResultModelOfListOfPhoneSettingsViewModel = webService.phoneSettingsGetActiveSettingsList()
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ResultModelOfListOfPhoneSettingsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить формат номера телефона по Id.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val settingId : kotlin.Int = 56 // kotlin.Int | Идентификатор настройки.

val result : ResultModelOfPhoneSettingsViewModel = webService.phoneSettingsGetSetting(settingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingId** | **kotlin.Int**| Идентификатор настройки. |

### Return type

**ResultModelOfPhoneSettingsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить настройки отображения телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val phoneSettingsFilter : PhoneSettingsFilter =  // PhoneSettingsFilter | Фильтр.

val result : ResultModelOfPagedViewModelOfPhoneSettingsViewModel = webService.phoneSettingsGetSettingsList(phoneSettingsFilter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneSettingsFilter** | **PhoneSettingsFilter**| Фильтр. |

### Return type

**ResultModelOfPagedViewModelOfPhoneSettingsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить настройку.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val settingId : kotlin.Int = 56 // kotlin.Int | Идентификатор настройки.

val result : ResultModel = webService.phoneSettingsRestoreSetting(settingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingId** | **kotlin.Int**| Идентификатор настройки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Изменить формат номера телефона.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(PhoneSettingsapi::class.java)
val settingId : kotlin.Int = 56 // kotlin.Int | Идентификатор настройки.
val model : PhoneSettingsViewModel =  // PhoneSettingsViewModel | Измененный формат номера.

val result : ResultModel = webService.phoneSettingsUpdateSetting(settingId, model)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingId** | **kotlin.Int**| Идентификатор настройки. |
 **model** | **PhoneSettingsViewModel**| Измененный формат номера. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


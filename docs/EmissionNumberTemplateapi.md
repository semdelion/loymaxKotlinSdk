# EmissionNumberTemplateapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emissionNumberTemplateGetEmissionTemplate**](EmissionNumberTemplateapi.md#emissionNumberTemplateGetEmissionTemplate) | **GET** v1.2/emissionNumberTemplates/{id} | Возвращает шаблон для генерации номеров выпусков по его ID.
[**emissionNumberTemplateGetEmissionTemplates**](EmissionNumberTemplateapi.md#emissionNumberTemplateGetEmissionTemplates) | **GET** v1.2/emissionNumberTemplates | Получение списка всех шаблонов для генерации номеров выпусков.
[**emissionNumberTemplateRestoreEmissionNumberTemplate**](EmissionNumberTemplateapi.md#emissionNumberTemplateRestoreEmissionNumberTemplate) | **POST** v1.2/emissionNumberTemplates/{id}/restore | Восстановить из архива шаблон для генерации номеров выпусков.



Возвращает шаблон для генерации номеров выпусков по его ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EmissionNumberTemplateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | ID шаблона уведомлений.

val result : ResultModelOfNumberTemplateViewModel = webService.emissionNumberTemplateGetEmissionTemplate(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| ID шаблона уведомлений. |

### Return type

**ResultModelOfNumberTemplateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получение списка всех шаблонов для генерации номеров выпусков.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EmissionNumberTemplateapi::class.java)
val filterFrom : kotlin.Int = 56 // kotlin.Int | Начало выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество.
val filterEmissionType : EmissionTypeEnum =  // EmissionTypeEnum | Тип шаблона уведомлений.
val filterTextSubStr : kotlin.String = filterTextSubStr_example // kotlin.String | Подстрока текстового описания шаблона.
val filterShowMode : ArchivedState =  // ArchivedState | Режим отображения архивных шаблонов.

val result : ResultModelOfPagedViewModelOfNumberTemplateViewModel = webService.emissionNumberTemplateGetEmissionTemplates(filterFrom, filterCount, filterEmissionType, filterTextSubStr, filterShowMode)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFrom** | **kotlin.Int**| Начало выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество. | [optional]
 **filterEmissionType** | **EmissionTypeEnum**| Тип шаблона уведомлений. | [optional] [enum: CardEmission, BookletEmission, CouponEmission]
 **filterTextSubStr** | **kotlin.String**| Подстрока текстового описания шаблона. | [optional]
 **filterShowMode** | **ArchivedState**| Режим отображения архивных шаблонов. | [optional] [enum: Archived, NonArchived]

### Return type

**ResultModelOfPagedViewModelOfNumberTemplateViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановить из архива шаблон для генерации номеров выпусков.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(EmissionNumberTemplateapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор.

val result : ResultModel = webService.emissionNumberTemplateRestoreEmissionNumberTemplate(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


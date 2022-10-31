# UserGroupapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userGroupGetGroupCardsInfo**](UserGroupapi.md#userGroupGetGroupCardsInfo) | **GET** v1.2/UserGroups/{groupId}/Cards | Возвращает информацию по картам клиентов, счета которых объединены в группу.
[**userGroupGetGroupMembers**](UserGroupapi.md#userGroupGetGroupMembers) | **GET** v1.2/UserGroups/{groupId} | Возвращает список клиентов, счета которых объединены в группу.
[**userGroupSearchPersonsByAttributes**](UserGroupapi.md#userGroupSearchPersonsByAttributes) | **POST** v1.2/UserGroups/SearchByAttributes | Возвращает информацию о клиентах группы по их атрибутам.



Возвращает информацию по картам клиентов, счета которых объединены в группу.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserGroupapi::class.java)
val groupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы.
val cardShowMode : GroupCardShowMode =  // GroupCardShowMode | Фильтр отображения карт (All — все карты, в т. ч. удаленные, NotDeleted — все неудаленные карты).
val personIdToExclude : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор клиента, карты которого не отображать.

val result : ResultModelOfListOfSystemApiCardInfoModel = webService.userGroupGetGroupCardsInfo(groupId, cardShowMode, personIdToExclude)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.Int**| Внутренний идентификатор группы. |
 **cardShowMode** | **GroupCardShowMode**| Фильтр отображения карт (All — все карты, в т. ч. удаленные, NotDeleted — все неудаленные карты). | [optional] [enum: All, NotDeleted]
 **personIdToExclude** | **kotlin.Int**| Внутренний идентификатор клиента, карты которого не отображать. | [optional]

### Return type

**ResultModelOfListOfSystemApiCardInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список клиентов, счета которых объединены в группу.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserGroupapi::class.java)
val groupId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор группы.

val result : ResultModelOfPersonsGroupInfoModel = webService.userGroupGetGroupMembers(groupId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.Int**| Внутренний идентификатор группы. |

### Return type

**ResultModelOfPersonsGroupInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о клиентах группы по их атрибутам.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(UserGroupapi::class.java)
val filter : SearchByAttributesModel =  // SearchByAttributesModel | Модель запроса.

val result : ResultModelOfPagedViewModelOfPersonsGroupInfoModel = webService.userGroupSearchPersonsByAttributes(filter)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **SearchByAttributesModel**| Модель запроса. |

### Return type

**ResultModelOfPagedViewModelOfPersonsGroupInfoModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


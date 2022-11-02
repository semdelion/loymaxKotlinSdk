# SystemUserapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemUserAddRoleToUser**](SystemUserapi.md#systemUserAddRoleToUser) | **PUT** v1.2/SystemUsers/{userId}/roles/{roleId} | Добавляет роль пользователю.
[**systemUserAddUserPermissions**](SystemUserapi.md#systemUserAddUserPermissions) | **PUT** v1.2/SystemUsers/{userId}/permissions/add | 
[**systemUserChangeUserPassword**](SystemUserapi.md#systemUserChangeUserPassword) | **POST** v1.2/SystemUsers/{id}/ChangePassword | Метод для смены пароля текущего пользователя.
[**systemUserDeleteUserPermissions**](SystemUserapi.md#systemUserDeleteUserPermissions) | **DELETE** v1.2/SystemUsers/{userId}/permissions/delete | 
[**systemUserGetUser**](SystemUserapi.md#systemUserGetUser) | **GET** v1.2/SystemUsers/{id} | Получить пользователя по ID.
[**systemUserGetUsers**](SystemUserapi.md#systemUserGetUsers) | **GET** v1.2/SystemUsers | Список всех пользователей.
[**systemUserRecoverUser**](SystemUserapi.md#systemUserRecoverUser) | **POST** v1.2/SystemUsers/{id}/recover | Восстановление пользователя.
[**systemUserUpdateUserPermissions**](SystemUserapi.md#systemUserUpdateUserPermissions) | **POST** v1.2/SystemUsers/{userId}/permissions/update | 



Добавляет роль пользователю.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val userId : kotlin.Int = 56 // kotlin.Int | Id пользователя.
val roleId : kotlin.Int = 56 // kotlin.Int | Id роли.
val userRole : UserRoleModel =  // UserRoleModel | Модель роли пользователя.

val result : ResultModel = webService.systemUserAddRoleToUser(userId, roleId, userRole)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**| Id пользователя. |
 **roleId** | **kotlin.Int**| Id роли. |
 **userRole** | **UserRoleModel**| Модель роли пользователя. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val userId : kotlin.Int = 56 // kotlin.Int | 
val models : kotlin.collections.MutableList<UserPermissionModel> =  // kotlin.collections.MutableList<UserPermissionModel> | 

val result : ResultModel = webService.systemUserAddUserPermissions(userId, models)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**|  |
 **models** | **kotlin.collections.MutableList&lt;UserPermissionModel&gt;**|  |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Метод для смены пароля текущего пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентфикатор пользователя.
val changePasswordModel : ChangePasswordModel =  // ChangePasswordModel | Модель смены пароля.

val result : ResultModelOfAuthResultModel = webService.systemUserChangeUserPassword(id, changePasswordModel)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентфикатор пользователя. |
 **changePasswordModel** | **ChangePasswordModel**| Модель смены пароля. |

### Return type

**ResultModelOfAuthResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val userId : kotlin.Int = 56 // kotlin.Int | 
val permissions : kotlin.collections.MutableList<UserPermissionModel> =  // kotlin.collections.MutableList<UserPermissionModel> | 

val result : ResultModel = webService.systemUserDeleteUserPermissions(userId, permissions)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**|  |
 **permissions** | **kotlin.collections.MutableList&lt;UserPermissionModel&gt;**|  |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить пользователя по ID.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id пользователя.

val result : ResultModelOfSystemUserWithPermissionsViewModel = webService.systemUserGetUser(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id пользователя. |

### Return type

**ResultModelOfSystemUserWithPermissionsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Список всех пользователей.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val identifierText : kotlin.String = identifierText_example // kotlin.String | Текст идентификатора.
val searchSubstring : kotlin.String = searchSubstring_example // kotlin.String | Строка поиска.

val result : ResultModelOfPagedViewModelOfSystemUserWithPermissionsViewModel = webService.systemUserGetUsers(from, count, identifierText, searchSubstring)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **identifierText** | **kotlin.String**| Текст идентификатора. | [optional]
 **searchSubstring** | **kotlin.String**| Строка поиска. | [optional]

### Return type

**ResultModelOfPagedViewModelOfSystemUserWithPermissionsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстановление пользователя.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Id пользователя.

val result : ResultModel = webService.systemUserRecoverUser(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Id пользователя. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml




### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(SystemUserapi::class.java)
val userId : kotlin.Int = 56 // kotlin.Int | 
val models : kotlin.collections.MutableList<UserPermissionModel> =  // kotlin.collections.MutableList<UserPermissionModel> | 

val result : ResultModel = webService.systemUserUpdateUserPermissions(userId, models)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.Int**|  |
 **models** | **kotlin.collections.MutableList&lt;UserPermissionModel&gt;**|  |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


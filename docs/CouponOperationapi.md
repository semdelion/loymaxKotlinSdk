# CouponOperationapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**couponOperationIssueCouponBatch**](CouponOperationapi.md#couponOperationIssueCouponBatch) | **POST** v1.2/coupons/BatchCouponById | Пакетная выдача купонов. На вход подаётся файл формата .csv или .txt.  EmissionId - Id выпуска купонов, из которого будет осуществлятся выдача.  Identifier - идентификатор клиента, которому выдается купон.  IdType - тип идентификатора клиента (необязательный столбец). Может быть один из PersonUid/CardNumber/Phone/PersonID/Email  Метод создаёт пакет и ставит его в очередь на выполнение.



Пакетная выдача купонов. На вход подаётся файл формата .csv или .txt.  EmissionId - Id выпуска купонов, из которого будет осуществлятся выдача.  Identifier - идентификатор клиента, которому выдается купон.  IdType - тип идентификатора клиента (необязательный столбец). Может быть один из PersonUid/CardNumber/Phone/PersonID/Email  Метод создаёт пакет и ставит его в очередь на выполнение.

&lt;para&gt;              Пример CSV файла.              EmissionId,Identifier,IdType              1,79998886622,Phone              1,79998886622,Phone              2,1234657899996666,CardNumber              &lt;/para&gt;              .

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(CouponOperationapi::class.java)
val file : java.io.File =  // java.io.File | file to upload

val result : ResultModelOfInt32 = webService.couponOperationIssueCouponBatch(file)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| file to upload |

### Return type

**ResultModelOfInt32**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


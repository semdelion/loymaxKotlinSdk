# BatchOperationsapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchOperationsGetAvailableLegals**](BatchOperationsapi.md#batchOperationsGetAvailableLegals) | **GET** v1.2/deposit/legals | Возвращает список юридических лиц, доступных для операций начисления/списания.
[**batchOperationsGetBatch**](BatchOperationsapi.md#batchOperationsGetBatch) | **GET** v1.2/deposit/{batchId} | Возвращает список операций по внутреннему идентификатору пакетного начисления/списания.
[**batchOperationsGetBatchOperationsQueueProgress**](BatchOperationsapi.md#batchOperationsGetBatchOperationsQueueProgress) | **GET** v1.2/deposit/{batchId}/progress | Возвращает информацию о прогрессе выполнения пакетного начисления/списания.
[**batchOperationsGetBatchOperationsTransactionQueueProgress**](BatchOperationsapi.md#batchOperationsGetBatchOperationsTransactionQueueProgress) | **GET** v1.2/deposit/{batchId}/transactionProgress | Возвращает информацию о количестве обработанных операций в пакетном начислении/списании.
[**batchOperationsGetOperations**](BatchOperationsapi.md#batchOperationsGetOperations) | **GET** v1.2/deposit/{batchId}/operations | Возвращает детальный список операций по внутреннему идентификатору пакетного начисления/списания.
[**batchOperationsGetOperationsCsv**](BatchOperationsapi.md#batchOperationsGetOperationsCsv) | **GET** v1.2/deposit/{batchId}/export | Возвращает список пакетных начислений/списаний в виде csv-файла.
[**batchOperationsGetOperationsDataFromCsv**](BatchOperationsapi.md#batchOperationsGetOperationsDataFromCsv) | **POST** v1.2/deposit/validateCsv | Возвращает список номеров карт и соответствующих сумм для начисления/списания, извлеченных из csv-файла.
[**batchOperationsGetOperationsHistory**](BatchOperationsapi.md#batchOperationsGetOperationsHistory) | **GET** v1.2/deposit | Возвращает историю операций с бонусами.



Возвращает список юридических лиц, доступных для операций начисления/списания.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val substring : kotlin.String = substring_example // kotlin.String | Подстрока для поиска по названию юридического лица.
val mode : ArchivedState =  // ArchivedState | Признак состояния юрилического лица (Archived - архивное, NonArchived - неархивное).
val loyaltyProgramId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор программы лояльности.
val partnerId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор Партнера.

val result : ResultModelOfPagedViewModelOfLegalViewModel = webService.batchOperationsGetAvailableLegals(from, count, substring, mode, loyaltyProgramId, partnerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **substring** | **kotlin.String**| Подстрока для поиска по названию юридического лица. | [optional]
 **mode** | **ArchivedState**| Признак состояния юрилического лица (Archived - архивное, NonArchived - неархивное). | [optional] [enum: Archived, NonArchived]
 **loyaltyProgramId** | **kotlin.Int**| Внутренний идентификатор программы лояльности. | [optional]
 **partnerId** | **kotlin.Int**| Внутренний идентификатор Партнера. | [optional]

### Return type

**ResultModelOfPagedViewModelOfLegalViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список операций по внутреннему идентификатору пакетного начисления/списания.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного начисления/списания.

val result : ResultModelOfBatchOperationsViewModel = webService.batchOperationsGetBatch(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного начисления/списания. |

### Return type

**ResultModelOfBatchOperationsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о прогрессе выполнения пакетного начисления/списания.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного начисления/списания.

val result : ResultModelOfBatchOperationsQueueInfo = webService.batchOperationsGetBatchOperationsQueueProgress(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного начисления/списания. |

### Return type

**ResultModelOfBatchOperationsQueueInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает информацию о количестве обработанных операций в пакетном начислении/списании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного начисления/списания.

val result : ResultModelOfBatchOperationsTransactionQueueInfo = webService.batchOperationsGetBatchOperationsTransactionQueueProgress(batchId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного начисления/списания. |

### Return type

**ResultModelOfBatchOperationsTransactionQueueInfo**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает детальный список операций по внутреннему идентификатору пакетного начисления/списания.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного начисления/списания.
val filterIdentifierType : IdentifierType =  // IdentifierType | Тип идентификатора клиента.
val filterFrom : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val filterCount : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterIsCustomerIdNeeded : kotlin.Boolean = true // kotlin.Boolean | Нужно ли для операций возвращать CustomerId.

val result : ResultModelOfPagedViewModelOfOperationViewModel = webService.batchOperationsGetOperations(batchId, filterIdentifierType, filterFrom, filterCount, filterIsCustomerIdNeeded)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного начисления/списания. |
 **filterIdentifierType** | **IdentifierType**| Тип идентификатора клиента. | [optional] [enum: CardNumber, Login, CardBarCode, CardTrack1, CardTrack2, CardTrack3, UID, Data, Anonymous, Phone, Email, OAuth, OAuthApplication, Coupon, PartnerCoupon, PhoneHash, AppleWalletCard, GpayWalletCard, QrCode, PersonUID, GiftCertificateNumber, GiftCertificateBarcode, GiftCertificateTrack1, GiftCertificateTrack2, GiftCertificateTrack3, GiftCertificateQrCode]
 **filterFrom** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **filterCount** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterIsCustomerIdNeeded** | **kotlin.Boolean**| Нужно ли для операций возвращать CustomerId. | [optional]

### Return type

**ResultModelOfPagedViewModelOfOperationViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список пакетных начислений/списаний в виде csv-файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val batchId : kotlin.Int = 56 // kotlin.Int | Внутренний идентификатор пакетного начисления/списания.
val deferredOperationState : DeferredOperationState =  // DeferredOperationState | Состояние операции (Created - в процессе инициализации, Completed - подтверждена, Error - ошибка).
val timeZone : kotlin.Int = 56 // kotlin.Int | Часовой пояс, в котором проводилась операция начисления/списания.

val result : kotlin.String = webService.batchOperationsGetOperationsCsv(batchId, deferredOperationState, timeZone)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **kotlin.Int**| Внутренний идентификатор пакетного начисления/списания. |
 **deferredOperationState** | **DeferredOperationState**| Состояние операции (Created - в процессе инициализации, Completed - подтверждена, Error - ошибка). | [enum: Created, Completed, Error]
 **timeZone** | **kotlin.Int**| Часовой пояс, в котором проводилась операция начисления/списания. | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список номеров карт и соответствующих сумм для начисления/списания, извлеченных из csv-файла.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val file : java.io.File =  // java.io.File | file to upload

val result : ResultModelOfParsedBatchOperationsModel = webService.batchOperationsGetOperationsDataFromCsv(file)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| file to upload |

### Return type

**ResultModelOfParsedBatchOperationsModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает историю операций с бонусами.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(BatchOperationsapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | Порядковый номер начального элемента выборки.
val count : kotlin.Int = 56 // kotlin.Int | Количество возвращаемых элементов выборки.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начальная дата периода в формате 0000-00-00T00:00:00Z.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конечная дата периода в формате 0000-00-00T00:00:00Z.
val filterType : BatchType =  // BatchType | Тип операции (Deposit – начисление, Withdraw – списание).
val filterState : BatchState =  // BatchState | Состояние операции (NotProcessed – необработанная, Processed – обработанная,  Suspended - приостановлена).
val filterIdentifier : kotlin.String = filterIdentifier_example // kotlin.String | Значение идентификатора клиента.
val filterIdentifierType : IdentifierType =  // IdentifierType | Тип идентификатора клиента.
val filterLoyaltyPrograms : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список программ лояльности.
val filterMarketingCampaigns : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Список маркетинговых компаний.
val filterTargetGroup : kotlin.Int = 56 // kotlin.Int | Целевая аудитория.

val result : ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel = webService.batchOperationsGetOperationsHistory(from, count, filterFromDate, filterToDate, filterType, filterState, filterIdentifier, filterIdentifierType, filterLoyaltyPrograms, filterMarketingCampaigns, filterTargetGroup)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| Порядковый номер начального элемента выборки. | [optional]
 **count** | **kotlin.Int**| Количество возвращаемых элементов выборки. | [optional]
 **filterFromDate** | **kotlin.String**| Начальная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterToDate** | **kotlin.String**| Конечная дата периода в формате 0000-00-00T00:00:00Z. | [optional]
 **filterType** | **BatchType**| Тип операции (Deposit – начисление, Withdraw – списание). | [optional] [enum: Withdraw, Deposit]
 **filterState** | **BatchState**| Состояние операции (NotProcessed – необработанная, Processed – обработанная,  Suspended - приостановлена). | [optional] [enum: NotProcessed, Processed, Suspended, ProcessedWithError]
 **filterIdentifier** | **kotlin.String**| Значение идентификатора клиента. | [optional]
 **filterIdentifierType** | **IdentifierType**| Тип идентификатора клиента. | [optional] [enum: CardNumber, Login, CardBarCode, CardTrack1, CardTrack2, CardTrack3, UID, Data, Anonymous, Phone, Email, OAuth, OAuthApplication, Coupon, PartnerCoupon, PhoneHash, AppleWalletCard, GpayWalletCard, QrCode, PersonUID, GiftCertificateNumber, GiftCertificateBarcode, GiftCertificateTrack1, GiftCertificateTrack2, GiftCertificateTrack3, GiftCertificateQrCode]
 **filterLoyaltyPrograms** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список программ лояльности. | [optional]
 **filterMarketingCampaigns** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Список маркетинговых компаний. | [optional]
 **filterTargetGroup** | **kotlin.Int**| Целевая аудитория. | [optional]

### Return type

**ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


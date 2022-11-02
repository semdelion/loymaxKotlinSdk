# MarketingCampaignapi

All URIs are relative to *https://saray.loymax.tech/publicapi*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketingCampaignAddBatchOperations**](MarketingCampaignapi.md#marketingCampaignAddBatchOperations) | **PUT** v1.2/campaigns/{id}/batchOperations | Добавляет операцию начисления/списания к кампании.
[**marketingCampaignAddCommunicationOffer**](MarketingCampaignapi.md#marketingCampaignAddCommunicationOffer) | **PUT** v1.2/campaigns/{id}/communicationOffers | Добавить рекламный материал для маркетинговой кампании.
[**marketingCampaignAddMailing**](MarketingCampaignapi.md#marketingCampaignAddMailing) | **PUT** v1.2/campaigns/{id}/mailings | Добавляет рассылку к кампании.
[**marketingCampaignDeleteOffer**](MarketingCampaignapi.md#marketingCampaignDeleteOffer) | **DELETE** v1.2/campaigns/{id}/offers/{offerId} | Удалить акцию из маркетинговой кампании.
[**marketingCampaignGetAvailableBatchOperations**](MarketingCampaignapi.md#marketingCampaignGetAvailableBatchOperations) | **GET** v1.2/campaigns/{id}/availableBatchOperations | Получает доступные для прикрепления операции начисления/списания.
[**marketingCampaignGetAvailableMailings**](MarketingCampaignapi.md#marketingCampaignGetAvailableMailings) | **GET** v1.2/campaigns/{id}/availableMailings | Получает доступные для прикрепления рассылки.
[**marketingCampaignGetList**](MarketingCampaignapi.md#marketingCampaignGetList) | **GET** v1.2/campaigns | Возвращает список кампаний с фильтрацией по указанным параметрам.
[**marketingCampaignGetMetrics**](MarketingCampaignapi.md#marketingCampaignGetMetrics) | **GET** v1.2/campaigns/{id}/metrics | Возвращает показатели кампании.
[**marketingCampaignGetOffers**](MarketingCampaignapi.md#marketingCampaignGetOffers) | **GET** v1.2/campaigns/{id}/offers | Получить список акций для маркетинговой кампании.
[**marketingCampaignGetOne**](MarketingCampaignapi.md#marketingCampaignGetOne) | **GET** v1.2/campaigns/{id} | Возвращает кампанию по идентификатору.
[**marketingCampaignRemoveCommunicationOffer**](MarketingCampaignapi.md#marketingCampaignRemoveCommunicationOffer) | **DELETE** v1.2/campaigns/{id}/communicationOffers/{communicationOfferId} | Удаляет рекламный материал из кампании.
[**marketingCampaignRemoveMailing**](MarketingCampaignapi.md#marketingCampaignRemoveMailing) | **DELETE** v1.2/campaigns/{id}/mailings/{mailingId} | Удаляет рассылку из кампании.
[**marketingCampaignRestore**](MarketingCampaignapi.md#marketingCampaignRestore) | **POST** v1.2/campaigns/{id}/restore | Восстанавливает кампанию из архива.



Добавляет операцию начисления/списания к кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val batchOperationId : kotlin.Int = 56 // kotlin.Int | Идентификатор операции начисления/списания.

val result : ResultModel = webService.marketingCampaignAddBatchOperations(id, batchOperationId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **batchOperationId** | **kotlin.Int**| Идентификатор операции начисления/списания. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавить рекламный материал для маркетинговой кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор маркетинговой кампании.
val communicationOfferId : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламных материалов.

val result : ResultModel = webService.marketingCampaignAddCommunicationOffer(id, communicationOfferId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор маркетинговой кампании. |
 **communicationOfferId** | **kotlin.Int**| Идентификатор рекламных материалов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Добавляет рассылку к кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.

val result : ResultModel = webService.marketingCampaignAddMailing(id, mailingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удалить акцию из маркетинговой кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор маркетинговой кампании.
val offerId : kotlin.Int = 56 // kotlin.Int | Идентификатор акции.

val result : ResultModel = webService.marketingCampaignDeleteOffer(id, offerId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор маркетинговой кампании. |
 **offerId** | **kotlin.Int**| Идентификатор акции. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает доступные для прикрепления операции начисления/списания.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Подстрока системного описания начисления/списания .

val result : ResultModelOfListOfBatchOperationsBriefViewModel = webService.marketingCampaignGetAvailableBatchOperations(id, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Подстрока системного описания начисления/списания . | [optional]

### Return type

**ResultModelOfListOfBatchOperationsBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получает доступные для прикрепления рассылки.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Подстрока названия рассылок.

val result : ResultModelOfPagedViewModelOfMailingBriefViewModel = webService.marketingCampaignGetAvailableMailings(id, from, count, name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Подстрока названия рассылок. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMailingBriefViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает список кампаний с фильтрацией по указанным параметрам.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.
val name : kotlin.String = name_example // kotlin.String | Подстрока названия.
val filterFromDate : kotlin.String = filterFromDate_example // kotlin.String | Начало периода.
val filterToDate : kotlin.String = filterToDate_example // kotlin.String | Конец периода.
val filterMode : ArchivedState =  // ArchivedState | Режим выбора архивных объектов.
val filterPartnerIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы партнеров.
val filterLoyaltyProgramIds : kotlin.collections.MutableList<kotlin.Int> =  // kotlin.collections.MutableList<kotlin.Int> | Идентификаторы программ лояльности.

val result : ResultModelOfPagedViewModelOfMarketingCampaignViewModel = webService.marketingCampaignGetList(from, count, name, filterFromDate, filterToDate, filterMode, filterPartnerIds, filterLoyaltyProgramIds)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.Int**| From. | [optional]
 **count** | **kotlin.Int**| Count. | [optional]
 **name** | **kotlin.String**| Подстрока названия. | [optional]
 **filterFromDate** | **kotlin.String**| Начало периода. | [optional]
 **filterToDate** | **kotlin.String**| Конец периода. | [optional]
 **filterMode** | **ArchivedState**| Режим выбора архивных объектов. | [optional] [enum: Archived, NonArchived]
 **filterPartnerIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы партнеров. | [optional]
 **filterLoyaltyProgramIds** | **kotlin.collections.MutableList&lt;kotlin.Int&gt;**| Идентификаторы программ лояльности. | [optional]

### Return type

**ResultModelOfPagedViewModelOfMarketingCampaignViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает показатели кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.

val result : ResultModelOfCampaignMetricsViewModel = webService.marketingCampaignGetMetrics(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |

### Return type

**ResultModelOfCampaignMetricsViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Получить список акций для маркетинговой кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор маркетинговой кампании.
val from : kotlin.Int = 56 // kotlin.Int | From.
val count : kotlin.Int = 56 // kotlin.Int | Count.

val result : ResultModelOfOffersBriefModel = webService.marketingCampaignGetOffers(id, from, count)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор маркетинговой кампании. |
 **from** | **kotlin.Int**| From. |
 **count** | **kotlin.Int**| Count. |

### Return type

**ResultModelOfOffersBriefModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Возвращает кампанию по идентификатору.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.

val result : ResultModelOfMarketingCampaignViewModel = webService.marketingCampaignGetOne(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |

### Return type

**ResultModelOfMarketingCampaignViewModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет рекламный материал из кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val communicationOfferId : kotlin.Int = 56 // kotlin.Int | Идентификатор рекламных материалов.

val result : ResultModel = webService.marketingCampaignRemoveCommunicationOffer(id, communicationOfferId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **communicationOfferId** | **kotlin.Int**| Идентификатор рекламных материалов. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Удаляет рассылку из кампании.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.
val mailingId : kotlin.Int = 56 // kotlin.Int | Идентификатор рассылки.

val result : ResultModel = webService.marketingCampaignRemoveMailing(id, mailingId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |
 **mailingId** | **kotlin.Int**| Идентификатор рассылки. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


Восстанавливает кампанию из архива.

### Example
```kotlin
// Import classes:
//import loymax.sdk.*
//import loymax.sdk.infrastructure.*
//import loymax.sdk.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(MarketingCampaignapi::class.java)
val id : kotlin.Int = 56 // kotlin.Int | Идентификатор кампании.

val result : ResultModel = webService.marketingCampaignRestore(id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Идентификатор кампании. |

### Return type

**ResultModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml


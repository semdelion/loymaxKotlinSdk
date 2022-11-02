package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface BatchOperationsService {
    /**
     * Возвращает список юридических лиц, доступных для операций начисления/списания.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param substring Подстрока для поиска по названию юридического лица. (optional)
     * @param mode Признак состояния юрилического лица (Archived - архивное, NonArchived - неархивное). (optional)
     * @param loyaltyProgramId Внутренний идентификатор программы лояльности. (optional)
     * @param partnerId Внутренний идентификатор Партнера. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLegalViewModel]>
     */
    @GET("v1.2/deposit/legals")
    fun batchOperationsGetAvailableLegals(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("substring") substring: kotlin.String? = null, @Query("mode") mode: ArchivedState? = null, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null, @Query("partnerId") partnerId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfLegalViewModel>

    /**
     * Возвращает список операций по внутреннему идентификатору пакетного начисления/списания.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного начисления/списания.
     * @return [Call]<[ResultModelOfBatchOperationsViewModel]>
     */
    @GET("v1.2/deposit/{batchId}")
    fun batchOperationsGetBatch(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchOperationsViewModel>

    /**
     * Возвращает информацию о прогрессе выполнения пакетного начисления/списания.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного начисления/списания.
     * @return [Call]<[ResultModelOfBatchOperationsQueueInfo]>
     */
    @GET("v1.2/deposit/{batchId}/progress")
    fun batchOperationsGetBatchOperationsQueueProgress(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchOperationsQueueInfo>

    /**
     * Возвращает информацию о количестве обработанных операций в пакетном начислении/списании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного начисления/списания.
     * @return [Call]<[ResultModelOfBatchOperationsTransactionQueueInfo]>
     */
    @GET("v1.2/deposit/{batchId}/transactionProgress")
    fun batchOperationsGetBatchOperationsTransactionQueueProgress(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchOperationsTransactionQueueInfo>

    /**
     * Возвращает детальный список операций по внутреннему идентификатору пакетного начисления/списания.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного начисления/списания.
     * @param filterIdentifierType Тип идентификатора клиента. (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterIsCustomerIdNeeded Нужно ли для операций возвращать CustomerId. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOperationViewModel]>
     */
    @GET("v1.2/deposit/{batchId}/operations")
    fun batchOperationsGetOperations(@Path("batchId") batchId: kotlin.Int, @Query("filter.identifierType") filterIdentifierType: IdentifierType? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.isCustomerIdNeeded") filterIsCustomerIdNeeded: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfOperationViewModel>

    /**
     * Возвращает список пакетных начислений/списаний в виде csv-файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного начисления/списания.
     * @param deferredOperationState Состояние операции (Created - в процессе инициализации, Completed - подтверждена, Error - ошибка).
     * @param timeZone Часовой пояс, в котором проводилась операция начисления/списания. (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/deposit/{batchId}/export")
    fun batchOperationsGetOperationsCsv(@Path("batchId") batchId: kotlin.Int, @Query("deferredOperationState") deferredOperationState: DeferredOperationState, @Query("timeZone") timeZone: kotlin.Int? = null): Call<kotlin.String>

    /**
     * Возвращает список номеров карт и соответствующих сумм для начисления/списания, извлеченных из csv-файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param file file to upload
     * @return [Call]<[ResultModelOfParsedBatchOperationsModel]>
     */
    @POST("v1.2/deposit/validateCsv")
    fun batchOperationsGetOperationsDataFromCsv(@Query("file") file: java.io.File): Call<ResultModelOfParsedBatchOperationsModel>

    /**
     * Возвращает историю операций с бонусами.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterFromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterToDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterType Тип операции (Deposit – начисление, Withdraw – списание). (optional)
     * @param filterState Состояние операции (NotProcessed – необработанная, Processed – обработанная,  Suspended - приостановлена). (optional)
     * @param filterIdentifier Значение идентификатора клиента. (optional)
     * @param filterIdentifierType Тип идентификатора клиента. (optional)
     * @param filterLoyaltyPrograms Список программ лояльности. (optional)
     * @param filterMarketingCampaigns Список маркетинговых компаний. (optional)
     * @param filterTargetGroup Целевая аудитория. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel]>
     */
    @GET("v1.2/deposit")
    fun batchOperationsGetOperationsHistory(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.type") filterType: BatchType? = null, @Query("filter.state") filterState: BatchState? = null, @Query("filter.identifier") filterIdentifier: kotlin.String? = null, @Query("filter.identifierType") filterIdentifierType: IdentifierType? = null, @Query("filter.loyaltyPrograms") filterLoyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.marketingCampaigns") filterMarketingCampaigns: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.targetGroup") filterTargetGroup: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel>

}

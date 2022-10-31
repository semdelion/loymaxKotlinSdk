package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BatchState
import loymax.sdk.models.DeferredOperationState
import loymax.sdk.models.IdentifierType
import loymax.sdk.models.ResultModelOfBatchCustomersImportModel
import loymax.sdk.models.ResultModelOfCustomersImportProgressInfoModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchCustomersImportModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfCreatorModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfOperationCustomersImportModel

interface CustomersImportapi {
    /**
     * Получить список операций по состоянию для группы операций в виде csv-файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Id группы операций.
     * @param deferredOperationState Состояние по которому будут отфильтрованы операции. (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/customersImport/{batchId}/export")
    fun customersImportExportOperationsCsv(@Path("batchId") batchId: kotlin.Int, @Query("deferredOperationState") deferredOperationState: DeferredOperationState? = null): Call<kotlin.String>

    /**
     * Получить авторов для фильтра.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Имя. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCreatorModel]>
     */
    @GET("v1.2/customersImport/creators")
    fun customersImportGetAvailableCreators(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfCreatorModel>

    /**
     * Получить пакет по его id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId ID пакетной операции.
     * @return [Call]<[ResultModelOfBatchCustomersImportModel]>
     */
    @GET("v1.2/customersImport/{batchId}")
    fun customersImportGetBatch(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchCustomersImportModel>

    /**
     * Получить информацию о фоновой обработке операций для группы операций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Id группы операций.
     * @return [Call]<[ResultModelOfCustomersImportProgressInfoModel]>
     */
    @GET("v1.2/customersImport/{batchId}/progress")
    fun customersImportGetBatchOperationsQueueProgress(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfCustomersImportProgressInfoModel>

    /**
     * Получить историю.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterState Состояние операции. (optional)
     * @param filterImportIdentifierType Тип идентификатора по которому импортируются клиенты. (optional)
     * @param filterCreatorGetAll Получить записи по всем авторам. (optional)
     * @param filterCreatorCreatorId Идентификатор автора. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchCustomersImportModel]>
     */
    @GET("v1.2/customersImport")
    fun customersImportGetHistory(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.state") filterState: BatchState? = null, @Query("filter.importIdentifierType") filterImportIdentifierType: IdentifierType? = null, @Query("filter.creator.getAll") filterCreatorGetAll: kotlin.Boolean? = null, @Query("filter.creator.creatorId") filterCreatorCreatorId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchCustomersImportModel>

    /**
     * Получить список операций по состоянию для группы операций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Id группы операций.
     * @param deferredOperationState Состояние по которому будут отфильтрованы операции.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOperationCustomersImportModel]>
     */
    @GET("v1.2/customersImport/{batchId}/operations")
    fun customersImportGetOperations(@Path("batchId") batchId: kotlin.Int, @Query("deferredOperationState") deferredOperationState: DeferredOperationState, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfOperationCustomersImportModel>

}

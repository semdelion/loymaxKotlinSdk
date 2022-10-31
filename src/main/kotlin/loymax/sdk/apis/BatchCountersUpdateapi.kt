package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BatchState
import loymax.sdk.models.BatchUploadModel
import loymax.sdk.models.DeferredOperationState
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadDataModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadModel

interface BatchCountersUpdateapi {
    /**
     * Возвращает список операций пакетной загрузки значений счетчиков.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param batchUploadFilterModelState  (optional)
     * @param batchUploadFilterModelIncludeDeleted  (optional)
     * @param batchUploadFilterModelFromDate  (optional)
     * @param batchUploadFilterModelToDate  (optional)
     * @param batchUploadFilterModelAuthorId  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadModel]>
     */
    @GET("v1.2/countersUpdate")
    fun batchCountersUpdateGet(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("batchUploadFilterModel.state") batchUploadFilterModelState: BatchState? = null, @Query("batchUploadFilterModel.includeDeleted") batchUploadFilterModelIncludeDeleted: kotlin.Boolean? = null, @Query("batchUploadFilterModel.fromDate") batchUploadFilterModelFromDate: kotlin.String? = null, @Query("batchUploadFilterModel.toDate") batchUploadFilterModelToDate: kotlin.String? = null, @Query("batchUploadFilterModel.authorId") batchUploadFilterModelAuthorId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadModel>

    /**
     * Возвращает информацию о пакете загрузки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Ид. пакета загрузки.
     * @return [Call]<[BatchUploadModel]>
     */
    @GET("v1.2/countersUpdate/{id}")
    fun batchCountersUpdateGetBatch(@Path("id") id: kotlin.Int): Call<BatchUploadModel>

    /**
     * Операции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Пакет.
     * @param state The {Loymax.Domain.Contract.DeferredOperationState}. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadDataModel]>
     */
    @GET("v1.2/countersUpdate/{id}/operations")
    fun batchCountersUpdateGetOperations(@Path("id") id: kotlin.Int, @Query("state") state: DeferredOperationState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadDataModel>

}

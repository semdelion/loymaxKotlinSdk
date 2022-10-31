package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BatchState
import loymax.sdk.models.DeferredOperationState
import loymax.sdk.models.ResultModelOfBatchUploadModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadDataModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadModel

interface BatchCustomersMergeapi {
    /**
     * Возвращает информацию о пакетном объединении по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного объединения.
     * @return [Call]<[ResultModelOfBatchUploadModel]>
     */
    @GET("v1.2/customersMerge/{batchId}")
    fun batchCustomersMergeGetBatch(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchUploadModel>

    /**
     * Возвращает информацию о пакетном объединении.
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
    @GET("v1.2/customersMerge")
    fun batchCustomersMergeGetCustomersMergeBatches(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("batchUploadFilterModel.state") batchUploadFilterModelState: BatchState? = null, @Query("batchUploadFilterModel.includeDeleted") batchUploadFilterModelIncludeDeleted: kotlin.Boolean? = null, @Query("batchUploadFilterModel.fromDate") batchUploadFilterModelFromDate: kotlin.String? = null, @Query("batchUploadFilterModel.toDate") batchUploadFilterModelToDate: kotlin.String? = null, @Query("batchUploadFilterModel.authorId") batchUploadFilterModelAuthorId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadModel>

    /**
     * Возвращает список операций по внутреннему идентификатору пакетного объединения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор пакетного объединения.
     * @param state Состояние операции (Created — создана, Completed — выполнена, Error — ошибка при выполнении) {Loymax.Domain.Contract.DeferredOperationState}. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadDataModel]>
     */
    @GET("v1.2/customersMerge/{id}/operations")
    fun batchCustomersMergeGetOperations(@Path("id") id: kotlin.Int, @Query("state") state: DeferredOperationState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadDataModel>

}

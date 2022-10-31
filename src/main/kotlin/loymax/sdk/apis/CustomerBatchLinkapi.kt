package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BatchState
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadDataModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBatchUploadModel

interface CustomerBatchLinkapi {
    /**
     * Получить список объединений счетов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state Состояние. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadModel]>
     */
    @GET("v1.2/customers/batchMerge")
    fun customerBatchLinkGetBatches(@Query("state") state: BatchState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadModel>

    /**
     * Получить список операций объединений счетов клиентов, завершившихся ошибкой.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id пакета.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadDataModel]>
     */
    @GET("v1.2/customers/batchMerge/{id}/FailedOperations")
    fun customerBatchLinkGetOperations(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadDataModel>

}

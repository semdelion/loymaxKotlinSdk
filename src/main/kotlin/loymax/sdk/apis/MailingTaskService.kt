package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface MailingTaskService {
    /**
     * Отменяет задачу рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @param mailingTaskId Идентификатор задачи.
     * @return [Call]<[ResultModelOfMailingTaskViewModel]>
     */
    @POST("v1.2/mailings/{mailingId}/tasks/{mailingTaskId}/cancel")
    fun mailingTaskCancel(@Path("mailingId") mailingId: kotlin.Int, @Path("mailingTaskId") mailingTaskId: kotlin.Int): Call<ResultModelOfMailingTaskViewModel>

    /**
     * Возвращает список задач для рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @param from From.
     * @param count Count.
     * @return [Call]<[ResultModelOfPagedViewModelOfMailingTaskViewModel]>
     */
    @GET("v1.2/mailings/{mailingId}/tasks")
    fun mailingTaskGetMailingsTasks(@Path("mailingId") mailingId: kotlin.Int, @Query("from") from: kotlin.Int, @Query("count") count: kotlin.Int): Call<ResultModelOfPagedViewModelOfMailingTaskViewModel>

}

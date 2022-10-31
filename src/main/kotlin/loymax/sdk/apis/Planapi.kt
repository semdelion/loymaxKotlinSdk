package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfPlanViewModel
import loymax.sdk.models.ResultModelOfPlanViewModel

interface Planapi {
    /**
     * Получить план.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Id партнера.
     * @param month Номер месяца.
     * @param year Год.
     * @return [Call]<[ResultModelOfPlanViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/plans/{year}/{month}")
    fun planGetPlan(@Path("partnerId") partnerId: kotlin.Int, @Path("month") month: kotlin.Int, @Path("year") year: kotlin.Int): Call<ResultModelOfPlanViewModel>

    /**
     * Получить список планов партнера за конкретный год.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Id партнера.
     * @param year Год.
     * @return [Call]<[ResultModelOfListOfPlanViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/plans/{year}")
    fun planGetPlans(@Path("partnerId") partnerId: kotlin.Int, @Path("year") year: kotlin.Int): Call<ResultModelOfListOfPlanViewModel>

}

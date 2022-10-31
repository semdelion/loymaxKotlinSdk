package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfUserAttributeViewModel

interface PartnerUserAttributeapi {
    /**
     * Возвращает набор партнерских атрибутов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @return [Call]<[ResultModelOfListOfUserAttributeViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/userAttributes")
    fun partnerUserAttributeGetUserAttributes(@Path("partnerId") partnerId: kotlin.Int): Call<ResultModelOfListOfUserAttributeViewModel>

}

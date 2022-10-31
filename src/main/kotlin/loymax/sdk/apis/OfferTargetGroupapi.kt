package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfTargetGroupBriefViewModel

interface OfferTargetGroupapi {
    /**
     * Получает список целевых аудиторий для акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfListOfTargetGroupBriefViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/targetGroups")
    fun offerTargetGroupGetOfferTargetGroups(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfListOfTargetGroupBriefViewModel>

}

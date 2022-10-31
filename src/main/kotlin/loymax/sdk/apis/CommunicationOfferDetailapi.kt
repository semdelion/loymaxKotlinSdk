package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfOfferDetailModel
import loymax.sdk.models.ResultModelOfOfferDetailModel

interface CommunicationOfferDetailapi {
    /**
     * Получение описания детали для акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param id Идентификатор деталей.
     * @return [Call]<[ResultModelOfOfferDetailModel]>
     */
    @GET("v1.2/communicationOffers/{offerId}/details/{id}")
    fun communicationOfferDetailGetOfferDetail(@Path("offerId") offerId: kotlin.Int, @Path("id") id: kotlin.String): Call<ResultModelOfOfferDetailModel>

    /**
     * Возвращает список деталей для акций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @return [Call]<[ResultModelOfListOfOfferDetailModel]>
     */
    @GET("v1.2/communicationOffers/{offerId}/details")
    fun communicationOfferDetailGetOfferDetails(@Path("offerId") offerId: kotlin.Int): Call<ResultModelOfListOfOfferDetailModel>

}

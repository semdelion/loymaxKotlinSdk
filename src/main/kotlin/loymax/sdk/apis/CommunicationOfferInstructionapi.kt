package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfOfferInstructionsModel

interface CommunicationOfferInstructionapi {
    /**
     * Возвращает все инструкций для акций в виде многострочного текста.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @return [Call]<[ResultModelOfOfferInstructionsModel]>
     */
    @GET("v1.2/communicationOffers/{offerId}/instructions")
    fun communicationOfferInstructionGetOfferInstructions(@Path("offerId") offerId: kotlin.Int): Call<ResultModelOfOfferInstructionsModel>

}

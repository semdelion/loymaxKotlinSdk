package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface OfferActionsService {
    /**
     * Получает список не удаленных действий в цепочке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerChainId Идентификатор цепочки.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfListOfOfferActionViewModelBase]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/actions")
    fun offerActionsGetList(@Path("offerId") offerId: kotlin.Int, @Path("offerChainId") offerChainId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfListOfOfferActionViewModelBase>

    /**
     * Получает модель действия.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerChainId Идентификатор цепочки.
     * @param actionId Идентификатор действия.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfOfferActionViewModelBase]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/actions/{actionId}")
    fun offerActionsGetOfferAction(@Path("offerId") offerId: kotlin.Int, @Path("offerChainId") offerChainId: kotlin.Int, @Path("actionId") actionId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfOfferActionViewModelBase>

}

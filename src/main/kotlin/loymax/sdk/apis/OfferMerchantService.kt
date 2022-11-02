package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface OfferMerchantService {
    /**
     * Получает список магазинов, для которых работает акция.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @param includeDeleted Включая удаленные. (optional)
     * @return [Call]<[ResultModelOfMerchantsSubFilterViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/merchants")
    fun offerMerchantGetOfferMerchantFilter(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String, @Query("includeDeleted") includeDeleted: kotlin.Boolean? = null): Call<ResultModelOfMerchantsSubFilterViewModel>

}

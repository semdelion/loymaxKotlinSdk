package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfMoneyViewModel

interface Purchasesapi {
    /**
     * Сумма покупок по партнеру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Идентификатор партнера.
     * @return [Call]<[ResultModelOfMoneyViewModel]>
     */
    @GET("v1.2/User/Purchases/SumByPartner")
    fun purchasesSumByPartner(@Query("partnerId") partnerId: kotlin.String): Call<ResultModelOfMoneyViewModel>

}

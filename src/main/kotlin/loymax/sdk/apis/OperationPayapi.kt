package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfOperationPayViewModel

interface OperationPayapi {
    /**
     * Информация какими способами оплачена покупка.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Id покупки.
     * @return [Call]<[ResultModelOfListOfOperationPayViewModel]>
     */
    @GET("v1.2/operationPay")
    fun operationPayGetByPurchase(@Query("purchaseId") purchaseId: kotlin.Int): Call<ResultModelOfListOfOperationPayViewModel>

}

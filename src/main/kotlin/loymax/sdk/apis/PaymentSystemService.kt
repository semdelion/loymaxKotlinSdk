package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PaymentSystemService {
    /**
     * Получить список платежных систем.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From.
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPaymentSystemViewModel]>
     */
    @GET("v1.2/paymentSystem")
    fun paymentSystemGetPaymentSystems(@Query("from") from: kotlin.Int, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfPaymentSystemViewModel>

}

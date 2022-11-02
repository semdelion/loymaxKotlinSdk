package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CouponEmissionImagesService {
    /**
     * Возвращает изображение выпуска купонов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска купонов.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/emissions/coupons/{emissionId}/Image")
    fun couponEmissionImagesGetImage(@Path("emissionId") emissionId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

}

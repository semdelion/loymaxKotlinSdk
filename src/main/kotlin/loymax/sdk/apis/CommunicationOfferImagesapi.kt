package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfImageFileViewModel
import loymax.sdk.models.ResultModelOfListOfImageFileViewModel

interface CommunicationOfferImagesapi {
    /**
     * Получить изображение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param imageId Идентификатор файла.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/communicationOffers/{offerId}/Images/{imageId}")
    fun communicationOfferImagesGetImage(@Path("offerId") offerId: kotlin.Int, @Path("imageId") imageId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

    /**
     * Получить список изображений для акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @return [Call]<[ResultModelOfListOfImageFileViewModel]>
     */
    @GET("v1.2/communicationOffers/{offerId}/Images")
    fun communicationOfferImagesGetImages(@Path("offerId") offerId: kotlin.Int): Call<ResultModelOfListOfImageFileViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfImageFileViewModel
import loymax.sdk.models.ResultModelOfListOfImageFileViewModel

interface LoyaltyProgramsImagesapi {
    /**
     * Получить изображение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loyaltyProgramId Идентификатор программы лояльности.
     * @param imageId Идентификатор файла.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/loyaltyPrograms/{loyaltyProgramId}/Images/{imageId}")
    fun loyaltyProgramsImagesGetImage(@Path("loyaltyProgramId") loyaltyProgramId: kotlin.Int, @Path("imageId") imageId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

    /**
     * Получить список изображений для программы лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loyaltyProgramId Идентификатор программы лояльности.
     * @return [Call]<[ResultModelOfListOfImageFileViewModel]>
     */
    @GET("v1.2/loyaltyPrograms/{loyaltyProgramId}/Images")
    fun loyaltyProgramsImagesGetImages(@Path("loyaltyProgramId") loyaltyProgramId: kotlin.Int): Call<ResultModelOfListOfImageFileViewModel>

}

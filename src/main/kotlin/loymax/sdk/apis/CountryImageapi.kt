package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfImageFileViewModel
import loymax.sdk.models.ResultModelOfListOfImageFileViewModel

interface CountryImageapi {
    /**
     * Получить изображение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param countryId Идентификатор страны.
     * @param imageId Идентификатор файла.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/countries/{countryId}/Images/{imageId}")
    fun countryImageGetImage(@Path("countryId") countryId: kotlin.Int, @Path("imageId") imageId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

    /**
     * Получить список изображений для страны.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param countryId Идентификатор страны.
     * @return [Call]<[ResultModelOfListOfImageFileViewModel]>
     */
    @GET("v1.2/countries/{countryId}/Images")
    fun countryImageGetImages(@Path("countryId") countryId: kotlin.Int): Call<ResultModelOfListOfImageFileViewModel>

}

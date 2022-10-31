package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfImageFileViewModel
import loymax.sdk.models.ResultModelOfListOfImageFileViewModel

interface BrandsImagesapi {
    /**
     * Возвращает информацию об изображении бренда.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Внутренний идентификатор бренда.
     * @param imageId Внутренний идентификатор изображения.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/brands/{brandId}/Images/{imageId}")
    fun brandsImagesGetImage(@Path("brandId") brandId: kotlin.Int, @Path("imageId") imageId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

    /**
     * Возвращает список изображений для бренда.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Внутренний идентификатор бренда.
     * @return [Call]<[ResultModelOfListOfImageFileViewModel]>
     */
    @GET("v1.2/brands/{brandId}/Images")
    fun brandsImagesGetImages(@Path("brandId") brandId: kotlin.Int): Call<ResultModelOfListOfImageFileViewModel>

}

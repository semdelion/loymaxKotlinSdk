package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfImageFileViewModel
import loymax.sdk.models.ResultModelOfListOfImageFileViewModel

interface CardCategoryImagesapi {
    /**
     * Получить изображение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryId Идентификатор категории карт.
     * @param imageId Идентификатор файла.
     * @return [Call]<[ResultModelOfImageFileViewModel]>
     */
    @GET("v1.2/cardCategories/{categoryId}/Images/{imageId}")
    fun cardCategoryImagesGetImage(@Path("categoryId") categoryId: kotlin.Int, @Path("imageId") imageId: kotlin.Int): Call<ResultModelOfImageFileViewModel>

    /**
     * Получить список изображений для категории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryId Идентификатор категории карт.
     * @return [Call]<[ResultModelOfListOfImageFileViewModel]>
     */
    @GET("v1.2/cardCategories/{categoryId}/Images")
    fun cardCategoryImagesGetImages(@Path("categoryId") categoryId: kotlin.Int): Call<ResultModelOfListOfImageFileViewModel>

}

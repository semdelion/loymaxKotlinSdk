package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfOfferCategoryViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferCategoryViewModel

interface OfferCategoryapi {
    /**
     * Возвращает список категорий акций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param partnerId Id партнера. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferCategoryViewModel]>
     */
    @GET("v1.2/offerCategories")
    fun offerCategoryGetOfferCategories(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("partnerId") partnerId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfOfferCategoryViewModel>

    /**
     * Возвращает категорию акций по ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id категории акций.
     * @return [Call]<[ResultModelOfOfferCategoryViewModel]>
     */
    @GET("v1.2/offerCategories/{id}")
    fun offerCategoryGetOfferCategory(@Path("id") id: kotlin.Int): Call<ResultModelOfOfferCategoryViewModel>

}

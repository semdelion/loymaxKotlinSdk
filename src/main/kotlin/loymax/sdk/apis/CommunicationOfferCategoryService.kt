package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CommunicationOfferCategoryService {
    /**
     * Архивировать категорию рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/communicationOffersCategories/{id}/archive")
    fun communicationOfferCategoryArchiveCategory(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Получить список категорий рекламных материалов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterName Название категории. (optional)
     * @param filterState Признак архивирования категории. (optional)
     * @param filterPartnersIds Список идентификаторов партнеров. (optional)
     * @param filterSortingIds Идентификаторы, которые будут выбираться первыми. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel]>
     */
    @GET("v1.2/communicationOffersCategories")
    fun communicationOfferCategoryGetCategories(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.state") filterState: ArchivedState? = null, @Query("filter.partnersIds") filterPartnersIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel>

    /**
     * Получить категорию рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModelOfCommunicationOfferCategoryViewModel]>
     */
    @GET("v1.2/communicationOffersCategories/{id}")
    fun communicationOfferCategoryGetCategory(@Path("id") id: kotlin.Int): Call<ResultModelOfCommunicationOfferCategoryViewModel>

    /**
     * Восстановить архивированную категорию рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/communicationOffersCategories/{id}/restore")
    fun communicationOfferCategoryRestoreCategory(@Path("id") id: kotlin.Int): Call<ResultModel>

}

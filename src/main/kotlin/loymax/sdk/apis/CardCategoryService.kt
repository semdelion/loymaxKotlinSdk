package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CardCategoryService {
    /**
     * Возвращает список всех категорий карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param substring Подстрока для поиска. (optional)
     * @param forImport Фильтр. True категории для импорта. False все. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCardCategoryModel]>
     */
    @GET("v1.2/cardCategories")
    fun cardCategoryGetCardCategories(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("substring") substring: kotlin.String? = null, @Query("forImport") forImport: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfCardCategoryModel>

    /**
     * Возвращает категорию по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id категории.
     * @return [Call]<[ResultModelOfCardCategoryModel]>
     */
    @GET("v1.2/cardCategories/{id}")
    fun cardCategoryGetCardCategory(@Path("id") id: kotlin.Int): Call<ResultModelOfCardCategoryModel>

}

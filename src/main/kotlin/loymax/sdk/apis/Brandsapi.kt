package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BrandInfoState
import loymax.sdk.models.ResultModelOfBrandViewModel
import loymax.sdk.models.ResultModelOfCommonBrandModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBrandModel

interface Brandsapi {
    /**
     * Возвращает информацию о бренде по его внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор бренда.
     * @return [Call]<[ResultModelOfCommonBrandModel]>
     */
    @GET("v1.2/brands/{uid}")
    fun brandsGetBrandInfo(@Path("uid") uid: kotlin.String): Call<ResultModelOfCommonBrandModel>

    /**
     * Возвращает информацию о бренде по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор бренда.
     * @return [Call]<[ResultModelOfBrandViewModel]>
     */
    @GET("v1.2/brands/{id}")
    fun brandsGetBrandInfoById(@Path("id") id: kotlin.Int): Call<ResultModelOfBrandViewModel>

    /**
     * Возвращает список всех брендов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterState Состояние бренда (Hidden — скрытый, Normal — обычный). (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterSubstring Подстрока для поиска по названию бренда. (optional)
     * @param filterSortingIds Внутренние идентификаторы брендов, которые будут отображены первыми в списке. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBrandModel]>
     */
    @GET("v1.2/brands")
    fun brandsGetBrands(@Query("filter.state") filterState: BrandInfoState? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.substring") filterSubstring: kotlin.String? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfBrandModel>

}

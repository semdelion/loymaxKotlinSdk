package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface GoodsCatalogService {
    /**
     * Получить информацию об элементе в каталоге.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param catalogItemId Id элемента.
     * @param partnerId Id партнера. (optional)
     * @return [Call]<[ResultModelOfGoodsCatalogLeafViewModel]>
     */
    @GET("v1.2/goodsCatalog/info/{catalogItemId}")
    fun goodsCatalogGetCatalogItemInfo(@Path("catalogItemId") catalogItemId: kotlin.Int, @Query("partnerId") partnerId: kotlin.Int? = null): Call<ResultModelOfGoodsCatalogLeafViewModel>

    /**
     * Получить каталог товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Id партнера.
     * @param catalogId Id каtалога. (optional)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsCatalog")
    fun goodsCatalogGetGoodsCatalog(@Query("partnerId") partnerId: kotlin.Int, @Query("catalogId") catalogId: kotlin.Int? = null, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

}

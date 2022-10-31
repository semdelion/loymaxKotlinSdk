package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfCatalogAttributeViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel

interface CatalogAttributeapi {
    /**
     * Атрибуты в каталоге партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Id партнера.
     * @return [Call]<[ResultModelOfListOfCatalogAttributeViewModel]>
     */
    @GET("v1.2/catalogs/{partnerId}/attributes")
    fun catalogAttributeGetByPartner(@Path("partnerId") partnerId: kotlin.Int): Call<ResultModelOfListOfCatalogAttributeViewModel>

    /**
     * Получает список значений атрибута в выбранном диапазоне.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Id партнера.
     * @param attributeId ID атрибута.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param nameSubstr Подстрока поиска по названию. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel]>
     */
    @GET("v1.2/catalogs/{partnerId}/attributes/{attributeId}/values")
    fun catalogAttributeGetValues(@Path("partnerId") partnerId: kotlin.Int, @Path("attributeId") attributeId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstr") nameSubstr: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface GoodsGroupSetService {
    /**
     * Получить наборы группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param type Тип набора. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsSetViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/goodsSets")
    fun goodsGroupSetGetGoodsGroupGoodsSets(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("type") type: GoodsSetType? = null): Call<ResultModelOfPagedViewModelOfGoodsSetViewModel>

    /**
     * Редактировать набор группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param name Название. (optional)
     * @param type  (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}")
    fun goodsGroupSetUpdateGoodsGroupGoodsSet(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("name") name: kotlin.String? = null, @Query("type") type: GoodsSetType? = null): Call<ResultModel>

}

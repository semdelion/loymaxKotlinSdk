package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfGoodsSetAttributeFilterItemViewModel
import loymax.sdk.models.ResultModelOfListOfCatalogAttributeViewModel
import loymax.sdk.models.ResultModelOfListOfGoodsSetAttributeFilterItemViewModel

interface GoodsGroupSetAttributeFilterapi {
    /**
     * Доступные для выбора атрибуты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора группы товаров.
     * @param partnerId Id партнера.
     * @return [Call]<[ResultModelOfListOfCatalogAttributeViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/availableAttributes")
    fun goodsGroupSetAttributeFilterGetAvailableAttributes(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("partnerId") partnerId: kotlin.Int): Call<ResultModelOfListOfCatalogAttributeViewModel>

    /**
     * Получает фильтр по атрибутам по его ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора группы товаров.
     * @param attributeItemId Id фильтра.
     * @return [Call]<[ResultModelOfGoodsSetAttributeFilterItemViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}")
    fun goodsGroupSetAttributeFilterGetGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Path("attributeItemId") attributeItemId: kotlin.Int): Call<ResultModelOfGoodsSetAttributeFilterItemViewModel>

    /**
     * Получить фильтры по атрибутам набора группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора группы товаров.
     * @return [Call]<[ResultModelOfListOfGoodsSetAttributeFilterItemViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems")
    fun goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int): Call<ResultModelOfListOfGoodsSetAttributeFilterItemViewModel>

    /**
     * Получает атрибуты, доступные для выбора в атрибутном фильтре.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора группы товаров.
     * @param attributeItemId Id фильтра по атрибутам.
     * @param partnerId Id партнера.
     * @return [Call]<[ResultModelOfListOfCatalogAttributeViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}/availableAttributes")
    fun goodsGroupSetAttributeFilterGetItemAvailableAttributes(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Path("attributeItemId") attributeItemId: kotlin.Int, @Query("partnerId") partnerId: kotlin.Int): Call<ResultModelOfListOfCatalogAttributeViewModel>

}

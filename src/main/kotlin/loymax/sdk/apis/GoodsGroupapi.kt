package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfGoodsGroupViewModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfPagedViewModelOfGoodsGroupViewModel

interface GoodsGroupapi {
    /**
     * Получает внешние идентификаторы товаров по идентификатору группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний или внутренний идентификатор группы товаров.
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/goodsGroups/{uid}/goodsCodes")
    fun goodsGroupGetGoodsCodes(@Path("uid") uid: kotlin.String): Call<kotlin.String>

    /**
     * Получить группу товаров по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id группы товаров.
     * @return [Call]<[ResultModelOfGoodsGroupViewModel]>
     */
    @GET("v1.2/goodsGroups/{id}")
    fun goodsGroupGetGoodsGroup(@Path("id") id: kotlin.Int): Call<ResultModelOfGoodsGroupViewModel>

    /**
     * Получить группу товаров по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param externalId Внешний идентификатор.
     * @return [Call]<[ResultModelOfGoodsGroupViewModel]>
     */
    @GET("v1.2/goodsGroups/{externalId}")
    fun goodsGroupGetGoodsGroupByExternalId(@Path("externalId") externalId: kotlin.String): Call<ResultModelOfGoodsGroupViewModel>

    /**
     * Получить количество товаров в группе товаров.
     * Для фиксированной группы товаров - количество зафиксированных товаров, для нефиксированной - текущее количество товаров в наборах.
     * Responses:
     *  - 200: OK
     *
     * @param id Id группы товаров.
     * @return [Call]<[ResultModelOfInt32]>
     */
    @GET("v1.2/goodsGroups/{id}/goodsCount")
    fun goodsGroupGetGoodsGroupGoodsCount(@Path("id") id: kotlin.Int): Call<ResultModelOfInt32>

    /**
     * Получить полную информацию о группах товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param sortingFilterId ID фильтра, группы товаров которого будут выбираться первыми. (optional)
     * @param sortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterName  (optional)
     * @param filterDateFromLastChange  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsGroupViewModel]>
     */
    @GET("v1.2/goodsGroups")
    fun goodsGroupGetGoodsGroups(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("sortingFilterId") sortingFilterId: kotlin.Int? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("properties") properties: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.creatorIds") filterCreatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filter.archivedShowMode") filterArchivedShowMode: ArchivedState? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.dateFromLastChange") filterDateFromLastChange: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfGoodsGroupViewModel>

    /**
     * Восстановить из архива группу товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id группы товаров.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/goodsGroups/{id}/restore")
    fun goodsGroupRestoreGoodsGroup(@Path("id") id: kotlin.Int): Call<ResultModel>

}

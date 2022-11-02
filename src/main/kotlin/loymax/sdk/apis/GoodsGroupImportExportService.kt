package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface GoodsGroupImportExportService {
    /**
     * Экспортировать группу товаров по Id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/Export")
    fun goodsGroupImportExportExportGoodsGroup(@Path("goodsGroupId") goodsGroupId: kotlin.Int): Call<kotlin.String>

    /**
     * Экспортировать группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param creatorIds  (optional)
     * @param partnerIds  (optional)
     * @param archivedShowMode  (optional)
     * @param name  (optional)
     * @param dateFromLastChange  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/goodsGroups/Export")
    fun goodsGroupImportExportExportGoodsGroups(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("dateFrom") dateFrom: kotlin.String? = null, @Query("dateTo") dateTo: kotlin.String? = null, @Query("creatorIds") creatorIds: kotlin.String? = null, @Query("partnerIds") partnerIds: kotlin.String? = null, @Query("archivedShowMode") archivedShowMode: ArchivedState? = null, @Query("name") name: kotlin.String? = null, @Query("dateFromLastChange") dateFromLastChange: kotlin.String? = null): Call<kotlin.String>

    /**
     * Импортировать группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param importModel Модель импортируемых групп товаров.
     * @param rewriteExisting Перезаписать ли существующую ГТ. (optional)
     * @return [Call]<[ResultModelOfGoodsGroupsImportResponse]>
     */
    @POST("v1.2/goodsGroups/Import")
    fun goodsGroupImportExportImportGoodsGroups(@Query("importModel") importModel: GoodsGroupsImportModel, @Query("rewriteExisting") rewriteExisting: kotlin.Boolean? = null): Call<ResultModelOfGoodsGroupsImportResponse>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface AttributesService {
    /**
     * Возвращает информацию о сущностях, к которым привязан атрибут с указанным ключом.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param key Ключ атрибута.
     * @return [Call]<[ResultModelOfListOfEntityInfoModel]>
     */
    @GET("v1.2/attribute/{key}/entities")
    fun attributesGetAttributeEntities(@Path("key") key: kotlin.String): Call<ResultModelOfListOfEntityInfoModel>

    /**
     * Возвращает все атрибуты типа сущности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType Тип сущности, для которой предназначен атрибут (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).
     * @return [Call]<[ResultModelOfListOfEntityAttributeModel]>
     */
    @GET("v1.2/{entityType}/attributes")
    fun attributesGetAttributes(@Path("entityType") entityType: EntityType): Call<ResultModelOfListOfEntityAttributeModel>

    /**
     * Возвращает значения атрибутов сущности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).
     * @param entityId Внутренний идентификатор сущности.
     * @return [Call]<[ResultModelOfListOfEntityAttributeWithValueModel]>
     */
    @GET("v1.2/{entityType}/{entityId}/attributes")
    fun attributesGetByEntityTypeByEntityIdAttributes(@Path("entityType") entityType: EntityType, @Path("entityId") entityId: kotlin.Int): Call<ResultModelOfListOfEntityAttributeWithValueModel>

    /**
     * Обновляет значение атрибута сущности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType Тип сущности (Offers — акции, Mailings — рассылки, TargetGroups — целевые аудитории, GoodsGroups — группы товаров, MarketingCampaigns — маркетинговые кампании).
     * @param entityId Внутренний идентификатор сущности.
     * @param attributeId Внутренний идентификатор атрибута.
     * @param `value` Новое значение атрибута.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/{entityType}/{entityId}/attributes/{attributeId}")
    fun attributesUpdateAttribute(@Path("entityType") entityType: EntityType, @Path("entityId") entityId: kotlin.Int, @Path("attributeId") attributeId: kotlin.Int, @Query("value") `value`: kotlin.String): Call<ResultModel>

}

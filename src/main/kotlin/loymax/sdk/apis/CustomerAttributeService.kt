package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CustomerAttributeService {
    /**
     * Удалить атрибут.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор атрибута.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/Attributes/{id}/Delete")
    fun customerAttributeDeleteAttribute(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Выключение истории для атрибута.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id атрибута.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Attributes/{id}/history/disable")
    fun customerAttributeDisableHistoryRecording(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Включение истории для атрибута.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id атрибута.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Attributes/{id}/history/enable")
    fun customerAttributeEnableHistoryRecording(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Экспортировать значения атрибутов в csv.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param attributeLogicalName Логическое имя атрибута.
     * @param targetGroupId Идентификатор целевой аудитории. (optional)
     * @param fromDate С какого периода действует значение атрибута. (optional)
     * @param toDate По какой период действует значение атрибута. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/Attributes/csv")
    fun customerAttributeExportAttributeValues(@Query("attributeLogicalName") attributeLogicalName: kotlin.String, @Query("targetGroupId") targetGroupId: kotlin.Int? = null, @Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<kotlin.String>

    /**
     * Получить атрибут по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModelOfBaseUserAttributeViewModel]>
     */
    @GET("v1.2/Attributes/{id}")
    fun customerAttributeGet(@Path("id") id: kotlin.Int): Call<ResultModelOfBaseUserAttributeViewModel>

    /**
     * Получить список всех атрибутов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param attributesFilterFrom Начало выборки. (optional)
     * @param attributesFilterCount Количество. (optional)
     * @param attributesFilterPartnerId Id партнера (для получения списка для акции). (optional)
     * @param attributesFilterSelectedAttributeId Id выбранного атрибута (для подгрузки значения в фильтре). (optional)
     * @param attributesFilterNameSearch Название атрибута. (optional)
     * @param attributesFilterLogicalName Логическое имя. (optional)
     * @param attributesFilterIsHidden Видимость атрибута. (optional)
     * @param attributesFilterIsDeleted Архивные/Не архивные. (optional)
     * @param attributesFilterValueType Тип значения. (optional)
     * @param attributesFilterAttributeType Тип атрибута. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBaseUserAttributeViewModel]>
     */
    @GET("v1.2/Attributes")
    fun customerAttributeGetList(@Query("attributesFilter.from") attributesFilterFrom: kotlin.Int? = null, @Query("attributesFilter.count") attributesFilterCount: kotlin.Int? = null, @Query("attributesFilter.partnerId") attributesFilterPartnerId: kotlin.Int? = null, @Query("attributesFilter.selectedAttributeId") attributesFilterSelectedAttributeId: kotlin.Int? = null, @Query("attributesFilter.nameSearch") attributesFilterNameSearch: kotlin.String? = null, @Query("attributesFilter.logicalName") attributesFilterLogicalName: kotlin.String? = null, @Query("attributesFilter.isHidden") attributesFilterIsHidden: kotlin.Boolean? = null, @Query("attributesFilter.isDeleted") attributesFilterIsDeleted: kotlin.Boolean? = null, @Query("attributesFilter.valueType") attributesFilterValueType: kotlin.collections.MutableList<CommonAttributeValueType>? = null, @Query("attributesFilter.attributeType") attributesFilterAttributeType: UserAttributeType? = null): Call<ResultModelOfPagedViewModelOfBaseUserAttributeViewModel>

    /**
     * Получение количества выбранных товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id атрибута.
     * @param personId Id пользователя.
     * @return [Call]<[ResultModelOfInt32]>
     */
    @GET("v1.2/Attributes/{id}/getSelectGoodsCount")
    fun customerAttributeGetSelectGoodsCount(@Path("id") id: kotlin.Int, @Query("personId") personId: kotlin.Int): Call<ResultModelOfInt32>

    /**
     * Восстановить атрибут.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор атрибута.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Attributes/{id}/Restore")
    fun customerAttributeRestoreAttribute(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Обновление данных атрибута.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор атрибута.
     * @param id Идентификатор. (optional)
     * @param name Имя. (optional)
     * @param order Порядковый номер. (optional)
     * @param logicalName Логическое имя. (optional)
     * @param historyIsRecorded История записывается. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Attributes/{id}/Update")
    fun customerAttributeUpdateAttribute(@Path("id") id: kotlin.Int, @Query("id") id1: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("order") order: kotlin.Int? = null, @Query("logicalName") logicalName: kotlin.String? = null, @Query("historyIsRecorded") historyIsRecorded: kotlin.Boolean? = null): Call<ResultModel>

}

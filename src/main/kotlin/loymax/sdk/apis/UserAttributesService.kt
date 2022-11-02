package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserAttributesService {
    /**
     * Возвращает значение общего атрибута клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @return [Call]<[ResultModelOfCommonAttributeJsonModel]>
     */
    @GET("v1.2/User/Attributes/Common/Values/{logicalName}")
    fun userAttributesGetCommonAttributeValue(@Path("logicalName") logicalName: kotlin.String): Call<ResultModelOfCommonAttributeJsonModel>

    /**
     * Возвращает список атрибутов из коллекции по JSONPath.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @param xPath JSONPath.
     * @return [Call]<[kotlin.Any]>
     */
    @GET("v1.2/User/Attributes/PersonalOffer/Values/{logicalName}")
    fun userAttributesGetObjects(@Path("logicalName") logicalName: kotlin.String, @Query("xPath") xPath: kotlin.String): Call<kotlin.Any>

    /**
     * Возвращает значения атрибутов \&quot;Персональные товары\&quot; для клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param modelAttributesIds Список идентификаторов атрибутов. (optional)
     * @return [Call]<[ResultModelOfListOfPersonalOfferAttributeValueModel]>
     */
    @GET("v1.2/User/Attributes/PersonalOffer/Values")
    fun userAttributesGetPersonalOfferAttributes(@Query("model.attributesIds") modelAttributesIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfListOfPersonalOfferAttributeValueModel>

    /**
     * Возвращает список наборов персональных товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z.
     * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param periodType Фильтр отображения наборов, сформированных по истории покупок. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel]>
     */
    @GET("v1.2/User/Attributes/PersonalOffer/list")
    fun userAttributesGetPersonalOfferSets(@Query("fromDate") fromDate: kotlin.String, @Query("toDate") toDate: kotlin.String, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("periodType") periodType: TimePeriodType? = null): Call<ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel>

    /**
     * Возвращает значение Персонального предложения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @return [Call]<[kotlin.Any]>
     */
    @GET("v1.2/User/Attributes/PersonalOffer/Values/Raw/{logicalName}")
    fun userAttributesGetValue(@Path("logicalName") logicalName: kotlin.String): Call<kotlin.Any>

    /**
     * Обновляет значение атрибута \&quot;Персональные товары\&quot; для клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param attributeId Внутренний идентификатор атрибута.
     * @param goodsIds Список внутренних идентификаторов товаров. (optional)
     * @param attributeId Внутренний идентификатор атрибута. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Attributes/PersonalOffer/Values/{attributeId}")
    fun userAttributesSetPersonalOfferAttribute(@Path("attributeId") attributeId: kotlin.Int, @Query("goodsIds") goodsIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("attributeId") attributeId1: kotlin.Int? = null): Call<ResultModel>

}

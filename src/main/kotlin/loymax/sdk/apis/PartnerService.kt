package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PartnerService {
    /**
     * Возвращает информацию о партнерской карте.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор Партнера.
     * @param number Номер партнерской карты.
     * @return [Call]<[ResultModelOfExternalCardInfoModel]>
     */
    @GET("v1.2/partners/{id}/Cards/{number}")
    fun partnerGetExternalCardInfo(@Path("id") id: kotlin.Int, @Path("number") number: kotlin.String): Call<ResultModelOfExternalCardInfoModel>

    /**
     * Возвращает информацию о Партнере по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор Партнера.
     * @return [Call]<[ResultModelOfPartnerModel]>
     */
    @GET("v1.2/partners/{id}")
    fun partnerGetPartnerByID(@Path("id") id: kotlin.Int): Call<ResultModelOfPartnerModel>

    /**
     * Возвращает список Партнеров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterName Подстрока для поиска по названию Партнера. (optional)
     * @param filterPermission Выбираются партнеры, на которые текущий пользователь имеет указанное право. (optional)
     * @param filterOrderByDesc Сортировка в обратном порядке (true — да, false — нет). (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param filterLoyaltyPrograms Список внутренних идентификаторов Программ лояльности. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPartnerModel]>
     */
    @GET("v1.2/partners")
    fun partnerGetPartnersByName(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.permission") filterPermission: kotlin.String? = null, @Query("filter.orderByDesc") filterOrderByDesc: kotlin.Boolean? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.loyaltyPrograms") filterLoyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfPartnerModel>

    /**
     * Возвращает информацию об ограничении списания бонусов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор Партнера.
     * @return [Call]<[ResultModelOfListOfPaymentLimitViewModel]>
     */
    @GET("v1.2/partners/{id}/paymentLimit")
    fun partnerGetPaymentLimits(@Path("id") id: kotlin.Int): Call<ResultModelOfListOfPaymentLimitViewModel>

    /**
     * Заменяет партнерскую карту на карту системы Loymax.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор Партнера.
     * @param number Номер партнерской карты.
     * @param loymaxCardId Внутренний идентификатор карты системы Loymax.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/partners/{id}/Cards/{number}/Replace")
    fun partnerReplaceExternalCard(@Path("id") id: kotlin.Int, @Path("number") number: kotlin.String, @Query("loymaxCardId") loymaxCardId: kotlin.Int): Call<ResultModel>

}

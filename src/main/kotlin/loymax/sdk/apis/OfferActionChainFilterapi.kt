package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.FilterModelType
import loymax.sdk.models.ResultModelOfFilterViewModel
import loymax.sdk.models.ResultModelOfListOfAnketaQuestionViewModel
import loymax.sdk.models.ResultModelOfListOfCardEmissionModel
import loymax.sdk.models.ResultModelOfListOfCardState
import loymax.sdk.models.ResultModelOfListOfDayOfWeek
import loymax.sdk.models.ResultModelOfListOfFilterViewModel
import loymax.sdk.models.ResultModelOfListOfPersonState
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferInfoShortViewModel

interface OfferActionChainFilterapi {
    /**
     * Возвращает список всех состояний карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCardState]>
     */
    @GET("v1.2/Filters/AvailableCardStates")
    fun offerActionChainFilterGetCardStates(): Call<ResultModelOfListOfCardState>

    /**
     * Получить список всех выпусков карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCardEmissionModel]>
     */
    @GET("v1.2/Filters/AvailableCardEmissions")
    fun offerActionChainFilterGetEmissions(): Call<ResultModelOfListOfCardEmissionModel>

    /**
     * Получает информацию о фильтре.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerChainId Идентификатор цепочки действий.
     * @param filterId Идентификатор фильтра.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfFilterViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/filters/{filterId}")
    fun offerActionChainFilterGetFilter(@Path("offerId") offerId: kotlin.Int, @Path("offerChainId") offerChainId: kotlin.Int, @Path("filterId") filterId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfFilterViewModel>

    /**
     * Получает информацию о фильтрах цепочки действий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerChainId Идентификатор цепочки действий.
     * @param offerVersion Дескриптор версии акции.
     * @param filterModelType Тип информации о фильтре. (optional)
     * @return [Call]<[ResultModelOfListOfFilterViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}/filters")
    fun offerActionChainFilterGetFilters(@Path("offerId") offerId: kotlin.Int, @Path("offerChainId") offerChainId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String, @Query("filterModelType") filterModelType: FilterModelType? = null): Call<ResultModelOfListOfFilterViewModel>

    /**
     * Получить список доступных в фильтрах акций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Идентификатор партнера.
     * @param name Название акции. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferInfoShortViewModel]>
     */
    @GET("v1.2/Filters/AvailableOffers")
    fun offerActionChainFilterGetFiltersOffers(@Query("partnerId") partnerId: kotlin.Int, @Query("name") name: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfOfferInfoShortViewModel>

    /**
     * Возвращает список всех состояний пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPersonState]>
     */
    @GET("v1.2/Filters/AvailablePersonStates")
    fun offerActionChainFilterGetPersonStates(): Call<ResultModelOfListOfPersonState>

    /**
     * Получить вопросы для фильтра.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id фильтра.
     * @return [Call]<[ResultModelOfListOfAnketaQuestionViewModel]>
     */
    @GET("v1.2/Filters/{id}/questions")
    fun offerActionChainFilterGetQuestions(@Path("id") id: kotlin.Int): Call<ResultModelOfListOfAnketaQuestionViewModel>

    /**
     * Возвращает список всех дней недели.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfDayOfWeek]>
     */
    @GET("v1.2/Filters/AvailableWeekDays")
    fun offerActionChainFilterGetWeekDays(): Call<ResultModelOfListOfDayOfWeek>

}

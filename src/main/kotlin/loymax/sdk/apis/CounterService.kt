package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CounterService {
    /**
     * Возвращает счетчик по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор счетчика.
     * @return [Call]<[ResultModelOfCounterViewModel]>
     */
    @GET("v1.2/Counters/{id}")
    fun counterGet(@Path("id") id: kotlin.Int): Call<ResultModelOfCounterViewModel>

    /**
     * Возвращает список доступных счетчиков.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterEventType Тип события. (optional)
     * @param filterNameText Текст, содержащийся в названии счетчика. (optional)
     * @param filterCounterType Тип счетчика. (optional)
     * @param filterDateFrom С какой даты искать. (optional)
     * @param filterDateTo По какую дату искать. (optional)
     * @param filterPartners Список партнеров, по которым будут отфильтрованы счетчики. (optional)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyProgramIds Список id программ лояльности, для фильтрации счетчиков. (optional)
     * @param filterRequiredTargets Обязательные параметры счетчика. (optional)
     * @param filterSupportedTargets Поддерживаемые параметры счетчика. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCounterBaseViewModel]>
     */
    @GET("v1.2/Counters")
    fun counterGetAvailableCounters(@Query("filter.eventType") filterEventType: OfferEventType? = null, @Query("filter.nameText") filterNameText: kotlin.String? = null, @Query("filter.counterType") filterCounterType: CounterType? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.partners") filterPartners: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.loyaltyProgramIds") filterLoyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.requiredTargets") filterRequiredTargets: kotlin.collections.MutableList<CounterTarget>? = null, @Query("filter.supportedTargets") filterSupportedTargets: kotlin.collections.MutableList<CounterTarget>? = null): Call<ResultModelOfPagedViewModelOfCounterBaseViewModel>

    /**
     * Возвращает список доступных параметров счетчика.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventTypes Список типов событий.
     * @return [Call]<[ResultModelOfListOfCounterTargetViewModel]>
     */
    @GET("v1.2/Counters/Targets")
    fun counterGetTargets(@Query("eventTypes") eventTypes: kotlin.collections.MutableList<OfferEventType>): Call<ResultModelOfListOfCounterTargetViewModel>

}

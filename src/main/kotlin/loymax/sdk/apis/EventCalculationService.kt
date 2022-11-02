package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface EventCalculationService {
    /**
     * Возвращает информацию о расчёте по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор расчёта.
     * @return [Call]<[ResultModelOfEventCalculationModel]>
     */
    @GET("v1.2/EventCalculations/{id}")
    fun eventCalculationGetById(@Path("id") id: kotlin.Long): Call<ResultModelOfEventCalculationModel>

    /**
     * Возвращает список расчётов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCalculationKey Ключ расчёта. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfEventCalculationModel]>
     */
    @GET("v1.2/EventCalculations")
    fun eventCalculationGetPagedList(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.calculationKey") filterCalculationKey: kotlin.Long? = null): Call<ResultModelOfPagedViewModelOfEventCalculationModel>

}

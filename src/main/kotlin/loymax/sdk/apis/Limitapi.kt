package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfLimitRuleModel
import loymax.sdk.models.ResultModelOfListOfLimitPeriod
import loymax.sdk.models.ResultModelOfListOfLimitTypeModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfLimitRuleModel

interface Limitapi {
    /**
     * Получить доступные периоды для конкретного правила.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param typeName The type.
     * @return [Call]<[ResultModelOfListOfLimitPeriod]>
     */
    @GET("v1.2/LimitRules/Periods")
    fun limitGetLimitPeriods(@Query("typeName") typeName: kotlin.String): Call<ResultModelOfListOfLimitPeriod>

    /**
     * Получить информацию о типах лимитов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfLimitTypeModel]>
     */
    @GET("v1.2/LimitRules/Types")
    fun limitGetLimitTypes(): Call<ResultModelOfListOfLimitTypeModel>

    /**
     * Получить информацию о правиле лимита.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор правила.
     * @return [Call]<[ResultModelOfLimitRuleModel]>
     */
    @GET("v1.2/LimitRules/{id}")
    fun limitGetRule(@Path("id") id: kotlin.Int): Call<ResultModelOfLimitRuleModel>

    /**
     * Получить текущие правила на страницах.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param status Фильтр для отображения списка. (optional)
     * @param from С какого. (optional)
     * @param count Сколько. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLimitRuleModel]>
     */
    @GET("v1.2/LimitRules")
    fun limitGetRules(@Query("status") status: ArchivedState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfLimitRuleModel>

    /**
     * Восстановление правила.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор правила.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/LimitRules/{id}/Restore")
    fun limitRestoreRule(@Path("id") id: kotlin.Int): Call<ResultModel>

}

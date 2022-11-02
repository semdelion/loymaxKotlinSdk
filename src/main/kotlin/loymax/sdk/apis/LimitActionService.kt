package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface LimitActionService {
    /**
     * Получить действие для конкретной границы правила.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @param borderId Идентификатор границы.
     * @param actionId Идентификатор действия.
     * @return [Call]<[ResultModelOfLimitActionViewModel]>
     */
    @GET("v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}")
    fun limitActionGetAction(@Path("ruleId") ruleId: kotlin.Int, @Path("borderId") borderId: kotlin.Int, @Path("actionId") actionId: kotlin.Int): Call<ResultModelOfLimitActionViewModel>

    /**
     * Получить список действий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @param borderId Идентификатор границы.
     * @return [Call]<[ResultModelOfListOfLimitActionViewModel]>
     */
    @GET("v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions")
    fun limitActionGetActions(@Path("ruleId") ruleId: kotlin.Int, @Path("borderId") borderId: kotlin.Int): Call<ResultModelOfListOfLimitActionViewModel>

    /**
     * Восстановление действия.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @param borderId Идентификатор границы.
     * @param actionId Идентификатор действия.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}/Restore")
    fun limitActionRestoreAction(@Path("ruleId") ruleId: kotlin.Int, @Path("borderId") borderId: kotlin.Int, @Path("actionId") actionId: kotlin.Int): Call<ResultModel>

}

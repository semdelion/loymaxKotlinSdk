package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface LimitBorderService {
    /**
     * Получить границу для указанного правила.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @param borderId Идентификатор границы.
     * @return [Call]<[ResultModelOfLimitBorderModel]>
     */
    @GET("v1.2/LimitRules/{ruleId}/Borders/{borderId}")
    fun limitBorderGetBorder(@Path("ruleId") ruleId: kotlin.Int, @Path("borderId") borderId: kotlin.Int): Call<ResultModelOfLimitBorderModel>

    /**
     * Получить список границ для указанного правила.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @return [Call]<[ResultModelOfListOfLimitBorderModel]>
     */
    @GET("v1.2/LimitRules/{ruleId}/Borders")
    fun limitBorderGetBorders(@Path("ruleId") ruleId: kotlin.Int): Call<ResultModelOfListOfLimitBorderModel>

    /**
     * Восстановление границы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ruleId Идентификатор правила.
     * @param borderId Идентификатор границы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/LimitRules/{ruleId}/Borders/{borderId}/Restore")
    fun limitBorderRestoreBorder(@Path("ruleId") ruleId: kotlin.Int, @Path("borderId") borderId: kotlin.Int): Call<ResultModel>

}

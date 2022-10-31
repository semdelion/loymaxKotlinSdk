package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfLegalViewModel

interface Legalapi {
    /**
     * Возвращает список доступных юридических лиц.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param name Подстрока для поиска по названию юридического лица. (optional)
     * @param partnersIds Внутренние идентификаторы Партнеров. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности. (optional)
     * @return [Call]<[ResultModelOfListOfLegalViewModel]>
     */
    @GET("v1.2/legals")
    fun legalGetLegals(@Query("name") name: kotlin.String? = null, @Query("partnersIds") partnersIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null): Call<ResultModelOfListOfLegalViewModel>

}

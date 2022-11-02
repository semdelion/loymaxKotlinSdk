package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PartnerLegalService {
    /**
     * Возвращает информацию о дебетовых счетах, принадлежащих юридическому лицу.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param legalId Внутренний идентификатор юридического лица.
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности.
     * @param name Подстрока для поиска по названию валюты. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfAccountViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/legals/{legalId}/accounts")
    fun partnerLegalGetAccounts(@Path("partnerId") partnerId: kotlin.Int, @Path("legalId") legalId: kotlin.Int, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int, @Query("name") name: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfAccountViewModel>

    /**
     * Возвращает информацию о юридическом лице Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param legalId Внутренний идентификатор юридического лица.
     * @return [Call]<[ResultModelOfLegalViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/legals/{legalId}")
    fun partnerLegalGetLegal(@Path("partnerId") partnerId: kotlin.Int, @Path("legalId") legalId: kotlin.Int): Call<ResultModelOfLegalViewModel>

    /**
     * Возвращает информацию о балансах юридического лица.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param legalId Внутренний идентификатор юридического лица.
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности.
     * @return [Call]<[ResultModelOfListOfMoneyViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/legals/{legalId}/balances")
    fun partnerLegalGetLegalBalances(@Path("partnerId") partnerId: kotlin.Int, @Path("legalId") legalId: kotlin.Int, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int): Call<ResultModelOfListOfMoneyViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId 
     * @param from  (optional)
     * @param count  (optional)
     * @param nameSubstring  (optional)
     * @param logicalNameSubstring  (optional)
     * @param status  (optional)
     * @param sortingIds  (optional)
     * @param code  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLegalViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/legals")
    fun partnerLegalGetLegals(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstring") nameSubstring: kotlin.String? = null, @Query("logicalNameSubstring") logicalNameSubstring: kotlin.String? = null, @Query("status") status: ArchivedState? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("code") code: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfLegalViewModel>

    /**
     * Восстанавливает из архива юридическое лицо Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param legalId Внутренний идентификатор юридического лица.
     * @param changeCode Необходимость изменения кода юридического лица (true — да, false — нет). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/partners/{partnerId}/legals/{legalId}/restore")
    fun partnerLegalRestoreLegal(@Path("partnerId") partnerId: kotlin.Int, @Path("legalId") legalId: kotlin.Int, @Query("changeCode") changeCode: kotlin.Boolean? = null): Call<ResultModel>

}

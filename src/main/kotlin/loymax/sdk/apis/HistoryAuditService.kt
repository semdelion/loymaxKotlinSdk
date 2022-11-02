package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface HistoryAuditService {
    /**
     * Получить аудит по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModelOfHistoryAuditViewModel]>
     */
    @GET("v1.2/audits/{id}")
    fun historyAuditGetAuditById(@Path("id") id: kotlin.Int): Call<ResultModelOfHistoryAuditViewModel>

    /**
     * Получить аудиты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCardNumber  (optional)
     * @param filterAuditTypes  (optional)
     * @param filterPersonId  (optional)
     * @param filterIsUser  (optional)
     * @param filterClientAuditsRequired  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfHistoryAuditViewModel]>
     */
    @GET("v1.2/audits")
    fun historyAuditGetAudits(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.cardNumber") filterCardNumber: kotlin.String? = null, @Query("filter.auditTypes") filterAuditTypes: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filter.personId") filterPersonId: kotlin.Int? = null, @Query("filter.isUser") filterIsUser: kotlin.Boolean? = null, @Query("filter.clientAuditsRequired") filterClientAuditsRequired: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfHistoryAuditViewModel>

}

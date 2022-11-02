package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface MarketingCampaignService {
    /**
     * Добавляет операцию начисления/списания к кампании.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Идентификатор кампании.
     * @param batchOperationId Идентификатор операции начисления/списания.
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/campaigns/{id}/batchOperations")
    fun marketingCampaignAddBatchOperations(@Path("id") id: kotlin.Int, @Query("batchOperationId") batchOperationId: kotlin.Int): Call<ResultModel>

    /**
     * Добавить рекламный материал для маркетинговой кампании.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Идентификатор маркетинговой кампании.
     * @param communicationOfferId Идентификатор рекламных материалов.
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/campaigns/{id}/communicationOffers")
    fun marketingCampaignAddCommunicationOffer(@Path("id") id: kotlin.Int, @Query("communicationOfferId") communicationOfferId: kotlin.Int): Call<ResultModel>

    /**
     * Добавляет рассылку к кампании.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Идентификатор кампании.
     * @param mailingId Идентификатор рассылки.
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/campaigns/{id}/mailings")
    fun marketingCampaignAddMailing(@Path("id") id: kotlin.Int, @Query("mailingId") mailingId: kotlin.Int): Call<ResultModel>

    /**
     * Удалить акцию из маркетинговой кампании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор маркетинговой кампании.
     * @param offerId Идентификатор акции.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/campaigns/{id}/offers/{offerId}")
    fun marketingCampaignDeleteOffer(@Path("id") id: kotlin.Int, @Path("offerId") offerId: kotlin.Int): Call<ResultModel>

    /**
     * Получает доступные для прикрепления операции начисления/списания.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Подстрока системного описания начисления/списания . (optional)
     * @return [Call]<[ResultModelOfListOfBatchOperationsBriefViewModel]>
     */
    @GET("v1.2/campaigns/{id}/availableBatchOperations")
    fun marketingCampaignGetAvailableBatchOperations(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfListOfBatchOperationsBriefViewModel>

    /**
     * Получает доступные для прикрепления рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Подстрока названия рассылок. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMailingBriefViewModel]>
     */
    @GET("v1.2/campaigns/{id}/availableMailings")
    fun marketingCampaignGetAvailableMailings(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfMailingBriefViewModel>

    /**
     * Возвращает список кампаний с фильтрацией по указанным параметрам.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Подстрока названия. (optional)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterMode Режим выбора архивных объектов. (optional)
     * @param filterPartnerIds Идентификаторы партнеров. (optional)
     * @param filterLoyaltyProgramIds Идентификаторы программ лояльности. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMarketingCampaignViewModel]>
     */
    @GET("v1.2/campaigns")
    fun marketingCampaignGetList(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.mode") filterMode: ArchivedState? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.loyaltyProgramIds") filterLoyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfMarketingCampaignViewModel>

    /**
     * Возвращает показатели кампании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @return [Call]<[ResultModelOfCampaignMetricsViewModel]>
     */
    @GET("v1.2/campaigns/{id}/metrics")
    fun marketingCampaignGetMetrics(@Path("id") id: kotlin.Int): Call<ResultModelOfCampaignMetricsViewModel>

    /**
     * Получить список акций для маркетинговой кампании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор маркетинговой кампании.
     * @param from From.
     * @param count Count.
     * @return [Call]<[ResultModelOfOffersBriefModel]>
     */
    @GET("v1.2/campaigns/{id}/offers")
    fun marketingCampaignGetOffers(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int, @Query("count") count: kotlin.Int): Call<ResultModelOfOffersBriefModel>

    /**
     * Возвращает кампанию по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @return [Call]<[ResultModelOfMarketingCampaignViewModel]>
     */
    @GET("v1.2/campaigns/{id}")
    fun marketingCampaignGetOne(@Path("id") id: kotlin.Int): Call<ResultModelOfMarketingCampaignViewModel>

    /**
     * Удаляет рекламный материал из кампании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @param communicationOfferId Идентификатор рекламных материалов.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/campaigns/{id}/communicationOffers/{communicationOfferId}")
    fun marketingCampaignRemoveCommunicationOffer(@Path("id") id: kotlin.Int, @Path("communicationOfferId") communicationOfferId: kotlin.Int): Call<ResultModel>

    /**
     * Удаляет рассылку из кампании.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @param mailingId Идентификатор рассылки.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/campaigns/{id}/mailings/{mailingId}")
    fun marketingCampaignRemoveMailing(@Path("id") id: kotlin.Int, @Path("mailingId") mailingId: kotlin.Int): Call<ResultModel>

    /**
     * Восстанавливает кампанию из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор кампании.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/campaigns/{id}/restore")
    fun marketingCampaignRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

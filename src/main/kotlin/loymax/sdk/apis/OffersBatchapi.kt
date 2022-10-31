package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.OffersListFilter
import loymax.sdk.models.ResultModel

interface OffersBatchapi {
    /**
     * Удаляет акции по фильтру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Подстрока для поиска по названию акции. (optional)
     * @param merchantIds Внутренние идентификаторы торговых точек через запятую, для которых созданы акции. (optional)
     * @param creatorIds Внутренние идентификаторы пользователей через запятую, создавших акции. (optional)
     * @param viewStates Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие). (optional)
     * @param sortColumn  (optional)
     * @param direction Направление сортировки (true - по возрастанию, false - по убыванию). (optional)
     * @param states Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). (optional)
     * @param partnerIds Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. (optional)
     * @param categoryIds Внутренние идентификаторы категорий акций через запятую. (optional)
     * @param priority  (optional)
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. (optional)
     * @param includeMarketingCampaignId Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). (optional)
     * @param loyaltyProgramIds Внутренние идентификаторы Программ лояльности через запятую. (optional)
     * @param excludeMarketingCampaign Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/batch/Delete")
    fun offersBatchDeleteOffers(@Query("fromDate") fromDate: java.time.OffsetDateTime? = null, @Query("toDate") toDate: java.time.OffsetDateTime? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("creatorIds") creatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("categoryIds") categoryIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("priority") priority: PriorityRange? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<ResultModel>

    /**
     * Запускает акции по фильтру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Подстрока для поиска по названию акции. (optional)
     * @param merchantIds Внутренние идентификаторы торговых точек через запятую, для которых созданы акции. (optional)
     * @param creatorIds Внутренние идентификаторы пользователей через запятую, создавших акции. (optional)
     * @param viewStates Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие). (optional)
     * @param sortColumn  (optional)
     * @param direction Направление сортировки (true - по возрастанию, false - по убыванию). (optional)
     * @param states Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). (optional)
     * @param partnerIds Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. (optional)
     * @param categoryIds Внутренние идентификаторы категорий акций через запятую. (optional)
     * @param priority  (optional)
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. (optional)
     * @param includeMarketingCampaignId Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). (optional)
     * @param loyaltyProgramIds Внутренние идентификаторы Программ лояльности через запятую. (optional)
     * @param excludeMarketingCampaign Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/batch/Start")
    fun offersBatchStartOffers(@Query("fromDate") fromDate: java.time.OffsetDateTime? = null, @Query("toDate") toDate: java.time.OffsetDateTime? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("creatorIds") creatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("categoryIds") categoryIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("priority") priority: PriorityRange? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<ResultModel>

    /**
     * Останавливает акции по фильтру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Подстрока для поиска по названию акции. (optional)
     * @param merchantIds Внутренние идентификаторы торговых точек через запятую, для которых созданы акции. (optional)
     * @param creatorIds Внутренние идентификаторы пользователей через запятую, создавших акции. (optional)
     * @param viewStates Состояния акций по времени действия (Future — будущие, Present — действуют, Past — прошедшие). (optional)
     * @param sortColumn  (optional)
     * @param direction Направление сортировки (true - по возрастанию, false - по убыванию). (optional)
     * @param states Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). (optional)
     * @param partnerIds Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. (optional)
     * @param categoryIds Внутренние идентификаторы категорий акций через запятую. (optional)
     * @param priority  (optional)
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. (optional)
     * @param includeMarketingCampaignId Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). (optional)
     * @param loyaltyProgramIds Внутренние идентификаторы Программ лояльности через запятую. (optional)
     * @param excludeMarketingCampaign Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/batch/Stop")
    fun offersBatchStopOffers(@Query("fromDate") fromDate: java.time.OffsetDateTime? = null, @Query("toDate") toDate: java.time.OffsetDateTime? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("creatorIds") creatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("categoryIds") categoryIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("priority") priority: PriorityRange? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<ResultModel>

}

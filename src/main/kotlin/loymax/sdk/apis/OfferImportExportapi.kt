package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.CreateOfferModel
import loymax.sdk.models.OfferSortColumn
import loymax.sdk.models.OfferState
import loymax.sdk.models.OfferViewState
import loymax.sdk.models.OffersImportModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfOffersImportResponse

interface OfferImportExportapi {
    /**
     * Копировать акцию по Id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции.
     * @param name Название акции. (optional)
     * @param dateFrom Дата начала действия акции. (optional)
     * @param dateTo Дата окончания действия акции. (optional)
     * @param partnerId Внутренний идентификатор Партнера. (optional)
     * @param description Описание акции. (optional)
     * @param isSum Признак суммируемости акции с другими (true — суммируется, false — не суммируется). (optional)
     * @param priority Приоритет акции. (optional)
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности. (optional)
     * @param versionId Id версии. Если пусто, то последняя подтверждённая. (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @POST("v1.2/Offers/{offerId}/Copy")
    fun offerImportExportCopyOffer(@Path("offerId") offerId: kotlin.Int, @Query("name") name: kotlin.String? = null, @Query("dateFrom") dateFrom: java.time.OffsetDateTime? = null, @Query("dateTo") dateTo: java.time.OffsetDateTime? = null, @Query("partnerId") partnerId: kotlin.Int? = null, @Query("description") description: kotlin.String? = null, @Query("isSum") isSum: kotlin.Boolean? = null, @Query("priority") priority: kotlin.Int? = null, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null, @Query("versionId") versionId: kotlin.Int? = null): Call<ResultModelOfInt32>

    /**
     * Экспортировать акцию по Id в формате json.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции.
     * @param versionId Id версии. Если пусто, то последняя подтверждённая. (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/Offers/{offerId}/Export/Json")
    fun offerImportExportExportOfferAsJson(@Path("offerId") offerId: kotlin.Int, @Query("versionId") versionId: kotlin.Int? = null): Call<kotlin.String>

    /**
     * Экспортировать акцию по Id в формате xml.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции.
     * @param versionId Id версии. Если пусто, то последняя подтверждённая. (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/Offers/{offerId}/Export/Xml")
    fun offerImportExportExportOfferAsXml(@Path("offerId") offerId: kotlin.Int, @Query("versionId") versionId: kotlin.Int? = null): Call<kotlin.String>

    /**
     * Экспортировать все акции в формате json.
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
     * @param sortColumn Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования. (optional)
     * @param direction Направление сортировки (true - по возрастанию, false - по убыванию). (optional)
     * @param states Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). (optional)
     * @param partnerIds Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. (optional)
     * @param categoryIds Внутренние идентификаторы категорий акций через запятую. (optional)
     * @param priorityLowerBound Нижняя граница приоритета акций. (optional)
     * @param priorityUpperBound Верхняя граница приоритета акций. (optional)
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. (optional)
     * @param includeMarketingCampaignId Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). (optional)
     * @param loyaltyProgramIds Внутренние идентификаторы Программ лояльности через запятую. (optional)
     * @param excludeMarketingCampaign Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/Offers/Export/Json")
    fun offerImportExportGetOffersAsJson(@Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("creatorIds") creatorIds: kotlin.String? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.String? = null, @Query("categoryIds") categoryIds: kotlin.String? = null, @Query("priority.lowerBound") priorityLowerBound: kotlin.Int? = null, @Query("priority.upperBound") priorityUpperBound: kotlin.Int? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.String? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<kotlin.String>

    /**
     * Экспортировать все акции в формате xml.
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
     * @param sortColumn Тип сортировки акций в списке (Priority — по приоритету, Name — по названию, BeginTime — по времени начала, EndTime — по времени завершения, State — по статусу, AttachDate — по дате прикрепления к маркетинговой кампании, CreationDate — по дате создания, Changedate — по дате редактирования. (optional)
     * @param direction Направление сортировки (true - по возрастанию, false - по убыванию). (optional)
     * @param states Состояние акции (Run — запущена, Stop — остановлена, Archived — в архиве). (optional)
     * @param partnerIds Внутренние идентификаторы Партнеров через запятую, для которых созданы акции. (optional)
     * @param categoryIds Внутренние идентификаторы категорий акций через запятую. (optional)
     * @param priorityLowerBound Нижняя граница приоритета акций. (optional)
     * @param priorityUpperBound Верхняя граница приоритета акций. (optional)
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании, в рамках которой созданы акции. (optional)
     * @param includeMarketingCampaignId Признак включения в список акций, входящих в указанную маркетинговую кампанию (true — включать, false — исключать). (optional)
     * @param loyaltyProgramIds Внутренние идентификаторы Программ лояльности через запятую. (optional)
     * @param excludeMarketingCampaign Признак исключения из списка всех акций, входящих в какую-либо маркетинговую кампанию (true — исключить, false — не исключать). (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/Offers/Export/Xml")
    fun offerImportExportGetOffersAsXml(@Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("creatorIds") creatorIds: kotlin.String? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.String? = null, @Query("categoryIds") categoryIds: kotlin.String? = null, @Query("priority.lowerBound") priorityLowerBound: kotlin.Int? = null, @Query("priority.upperBound") priorityUpperBound: kotlin.Int? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.String? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<kotlin.String>

    /**
     * Импортировать акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param importModel Модель импортируемых акций.
     * @param cancelDrafts Отклонять ли черновики при импорте существующих акций. (optional)
     * @return [Call]<[ResultModelOfOffersImportResponse]>
     */
    @POST("v1.2/Offers/Import")
    fun offerImportExportPostOffers(@Query("importModel") importModel: OffersImportModel, @Query("cancelDrafts") cancelDrafts: kotlin.Boolean? = null): Call<ResultModelOfOffersImportResponse>

}

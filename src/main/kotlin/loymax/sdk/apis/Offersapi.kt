package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.AcceptOfferChangesModel
import loymax.sdk.models.EditOfferModel
import loymax.sdk.models.EditOfferModelBase
import loymax.sdk.models.OfferSortColumn
import loymax.sdk.models.OfferState
import loymax.sdk.models.OfferViewMode
import loymax.sdk.models.OfferViewState
import loymax.sdk.models.RejectOfferChangesModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfCommunicationOfferInfoModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfListOfCreatorModel
import loymax.sdk.models.ResultModelOfListOfInt32
import loymax.sdk.models.ResultModelOfListOfOfferRuleModel
import loymax.sdk.models.ResultModelOfListOfPartnerModel
import loymax.sdk.models.ResultModelOfOfferBriefModel
import loymax.sdk.models.ResultModelOfOfferPeriodModel
import loymax.sdk.models.ResultModelOfOffersBriefModel
import loymax.sdk.models.ResultModelOfOffersCountModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfPartnerModel
import loymax.sdk.models.SendOfferToApprovalModel

interface Offersapi {
    /**
     * Применить изменения акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param acceptOfferChangesModel Модель применения изменений для акции.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/AcceptChanges")
    fun offersAcceptOfferChanges(@Query("acceptOfferChangesModel") acceptOfferChangesModel: AcceptOfferChangesModel): Call<ResultModel>

    /**
     * Удаляет акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/DeleteOffer")
    fun offersDeleteOffer(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Редактирует акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerModel Модель редактирования акции.
     * @return [Call]<[ResultModelOfInt32]>
     */
    @POST("v1.2/offers/EditOffer")
    fun offersEditOffer(@Query("offerModel") offerModel: EditOfferModel): Call<ResultModelOfInt32>

    /**
     * Возвращает список пользователей, имеющих право создавать акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCreatorModel]>
     */
    @GET("v1.2/offers/AvailableCreators")
    fun offersGetAvailableCreators(): Call<ResultModelOfListOfCreatorModel>

    /**
     * Возвращает список Партнеров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param viewMode Доступный режим работы с акциями.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Подстрока для поиска по названию. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPartnerModel]>
     */
    @GET("v1.2/offers/AvailablePartners")
    fun offersGetAvailablePartners(@Query("viewMode") viewMode: OfferViewMode, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfPartnerModel>

    /**
     * Возвращает информацию об акции (по идентификатору версии).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @param offerVersion Идентификатор версии акции.
     * @return [Call]<[ResultModelOfCommunicationOfferInfoModel]>
     */
    @GET("v1.2/offers/{offerId}/versions/{offerVersion}")
    fun offersGetOffer(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfCommunicationOfferInfoModel>

    /**
     * Возвращает информацию об акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @return [Call]<[ResultModelOfOfferBriefModel]>
     */
    @GET("v1.2/offers/OfferInfo")
    fun offersGetOfferInfo(@Query("offerId") offerId: kotlin.Int): Call<ResultModelOfOfferBriefModel>

    /**
     * Возвращает список Партнеров, для которых доступна акция.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @return [Call]<[ResultModelOfListOfPartnerModel]>
     */
    @GET("v1.2/offers/OfferPartners")
    fun offersGetOfferPartners(@Query("offerId") offerId: kotlin.Int): Call<ResultModelOfListOfPartnerModel>

    /**
     * Получает вермя действия акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfOfferPeriodModel]>
     */
    @GET("v1.2/offers/{offerId}/versions/{offerVersion}/period")
    fun offersGetOfferPeriod(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfOfferPeriodModel>

    /**
     * Получить приоритет акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfInt32]>
     */
    @GET("v1.2/offers/{offerId}/versions/{offerVersion}/priority")
    fun offersGetOfferPriority(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfInt32>

    /**
     * Возвращает список правил акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @return [Call]<[ResultModelOfListOfOfferRuleModel]>
     */
    @GET("v1.2/offers/OfferRules")
    fun offersGetOfferRules(@Query("offerId") offerId: kotlin.Int): Call<ResultModelOfListOfOfferRuleModel>

    /**
     * Возвращает список акций.
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
     * @return [Call]<[ResultModelOfOffersBriefModel]>
     */
    @GET("v1.2/offers")
    fun offersGetOffers(@Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("creatorIds") creatorIds: kotlin.String? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.String? = null, @Query("categoryIds") categoryIds: kotlin.String? = null, @Query("priority.lowerBound") priorityLowerBound: kotlin.Int? = null, @Query("priority.upperBound") priorityUpperBound: kotlin.Int? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.String? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<ResultModelOfOffersBriefModel>

    /**
     * Возвращает количество акций и правил.
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
     * @return [Call]<[ResultModelOfOffersCountModel]>
     */
    @GET("v1.2/offers/count")
    fun offersGetOffersCount(@Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("creatorIds") creatorIds: kotlin.String? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null, @Query("sortColumn") sortColumn: OfferSortColumn? = null, @Query("direction") direction: kotlin.Boolean? = null, @Query("states") states: kotlin.collections.MutableList<OfferState>? = null, @Query("partnerIds") partnerIds: kotlin.String? = null, @Query("categoryIds") categoryIds: kotlin.String? = null, @Query("priority.lowerBound") priorityLowerBound: kotlin.Int? = null, @Query("priority.upperBound") priorityUpperBound: kotlin.Int? = null, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null, @Query("includeMarketingCampaignId") includeMarketingCampaignId: kotlin.Boolean? = null, @Query("loyaltyProgramIds") loyaltyProgramIds: kotlin.String? = null, @Query("excludeMarketingCampaign") excludeMarketingCampaign: kotlin.Boolean? = null): Call<ResultModelOfOffersCountModel>

    /**
     * Получить актуальные шаги округления.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfInt32]>
     */
    @GET("v1.2/offers/RoundingSteps")
    fun offersGetRoundingSteps(): Call<ResultModelOfListOfInt32>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId 
     * @param partnerIds 
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/{offerId}/relatedPartners")
    fun offersPostOffersByOfferIdRelatedPartners(@Path("offerId") offerId: kotlin.Int, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>): Call<ResultModel>

    /**
     * Отклонение принятых ранее изменений акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param rejectOfferChangesModel Модель отклонения изменений.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/RejectChanges")
    fun offersRejectChanges(@Query("rejectOfferChangesModel") rejectOfferChangesModel: RejectOfferChangesModel): Call<ResultModel>

    /**
     * Удаление черновика акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/ResetChanges")
    fun offersResetChanges(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Востановить акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/RestoreOffer")
    fun offersRestoreOffer(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Сохраняет изменения в акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/SaveChanges")
    fun offersSaveChanges(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Отправить акцию на согласование.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param sendOfferToApprovalModel Модель отправки акции на согласование.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/SendToApproval")
    fun offersSendToApproval(@Query("sendOfferToApprovalModel") sendOfferToApprovalModel: SendOfferToApprovalModel): Call<ResultModel>

    /**
     * Запускает акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/StartOffer")
    fun offersStartOffer(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Остановливает акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Id акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/StopOffer")
    fun offersStopOffer(@Query("offerId") offerId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Обновляет маркетинговую кампанию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @param marketingCampaignId Внутренний идентификатор маркетинговой кампании. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/{offerId}/marketingCampaign")
    fun offersUpdateMarketingCampaign(@Path("offerId") offerId: kotlin.Int, @Query("marketingCampaignId") marketingCampaignId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Изменяет категорию акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Внутренний идентификатор акции.
     * @param offerCategoryId Внутренний идентификатор новой категории акции. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/offers/{offerId}/categories")
    fun offersUpdateOfferCategory(@Path("offerId") offerId: kotlin.Int, @Query("offerCategoryId") offerCategoryId: kotlin.Int? = null): Call<ResultModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface MailingService {
    /**
     * Возвращает доступные шлюза рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @return [Call]<[ResultModelOfListOfMailingGatewayViewModel]>
     */
    @GET("v1.2/mailings/{mailingId}/gateways")
    fun mailingGateways(@Path("mailingId") mailingId: kotlin.Int): Call<ResultModelOfListOfMailingGatewayViewModel>

    /**
     * Возвращает модель рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @return [Call]<[ResultModelOfMailingViewModel]>
     */
    @GET("v1.2/mailings/{mailingId}")
    fun mailingGet(@Path("mailingId") mailingId: kotlin.Int): Call<ResultModelOfMailingViewModel>

    /**
     * Получить список рассылок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCreatorIds Список id создателей акций для фильтрации. (optional)
     * @param filterName Название. (optional)
     * @param filterMailingType Тип рассылки. (optional)
     * @param filterMarketingCampaignId ID маркетинговой кампании. (optional)
     * @param filterSortByAttachDate Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления. (optional)
     * @param filterLoyaltyProgramIds Идентификаторы программ лояльности. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMailingBriefViewModel]>
     */
    @GET("v1.2/mailings")
    fun mailingGetMailings(@Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.creatorIds") filterCreatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.mailingType") filterMailingType: MailingWaySendType? = null, @Query("filter.marketingCampaignId") filterMarketingCampaignId: kotlin.Int? = null, @Query("filter.sortByAttachDate") filterSortByAttachDate: kotlin.Boolean? = null, @Query("filter.loyaltyProgramIds") filterLoyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfMailingBriefViewModel>

    /**
     * Возвращает модель загруженных номеров телефонов в рассылку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @return [Call]<[ResultModelOfMailingPhonesViewModel]>
     */
    @GET("v1.2/mailings/{mailingId}/phones")
    fun mailingPhones(@Path("mailingId") mailingId: kotlin.Int): Call<ResultModelOfMailingPhonesViewModel>

    /**
     * Запускает рассылку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @param planRunDate Плановая дата и время запуска. (optional)
     * @param ignoreUnidentifiedPhoneNumbers Запускать ли рассылку, даже если загружены номера, которых нет в системе. (optional)
     * @return [Call]<[ResultModelOfMailingViewModel]>
     */
    @POST("v1.2/mailings/{mailingId}/run")
    fun mailingRun(@Path("mailingId") mailingId: kotlin.Int, @Query("planRunDate") planRunDate: java.time.OffsetDateTime? = null, @Query("ignoreUnidentifiedPhoneNumbers") ignoreUnidentifiedPhoneNumbers: kotlin.Boolean? = null): Call<ResultModelOfMailingViewModel>

    /**
     * Отправляет тестовое сообщение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailingId Идентификатор рассылки.
     * @param testRecipient Получатель тестового сообщения.  Если для рассылки указана целевая аудитория, необходимо ввести номер карты. Если загружен список номеров, необходимо ввести номер телефона. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/mailings/{mailingId}/sendTest")
    fun mailingSendTest(@Path("mailingId") mailingId: kotlin.Int, @Query("testRecipient") testRecipient: kotlin.String? = null): Call<ResultModel>

}

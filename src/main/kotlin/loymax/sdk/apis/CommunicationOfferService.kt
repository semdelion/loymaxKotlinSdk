package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CommunicationOfferService {
    /**
     * Отправка акции в архив.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/communicationOffers/{id}/Archive")
    fun communicationOfferAddInArchivedOffer(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает список доступных акций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param substring Подстрока для поиска. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferInfoShortViewModel]>
     */
    @GET("v1.2/communicationOffers/availableOffers")
    fun communicationOfferGetAvaliableOffers(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("substring") substring: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfOfferInfoShortViewModel>

    /**
     * Возвращает список магазинов достпных для рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор рекламного материала.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterCityId  (optional)
     * @param filterСategoryID  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @return [Call]<[ResultModelOfListOfMerchantInfoModel]>
     */
    @GET("v1.2/communicationOffers/{id}/availableMerchantInfos")
    fun communicationOfferGetMerchantInfosByBrand(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.cityId") filterCityId: kotlin.Int? = null, @Query("filter.сategoryID") filterСategoryID: kotlin.Int? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.archivedShowMode") filterArchivedShowMode: ArchivedState? = null): Call<ResultModelOfListOfMerchantInfoModel>

    /**
     * Получение описания детали для акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор деталей.
     * @return [Call]<[ResultModelOfCommunicationOfferModel]>
     */
    @GET("v1.2/communicationOffers/{id}")
    fun communicationOfferGetOffer(@Path("id") id: kotlin.Int): Call<ResultModelOfCommunicationOfferModel>

    /**
     * Возвращает список всех инструкций для акций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterCommunicationOfferState Статус акции. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterBrandIds Набор идентификаторов брендов. (optional)
     * @param filterCategoriesIds Набор идентификаторов категорий рекламных материалов. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterIsArchived Признак удаления. (optional)
     * @param filterPriorityMin Минимальный приоритет. (optional)
     * @param filterPriorityMax Максимальный приоритет. (optional)
     * @param filterMarketingCampaignId Идентификатор маркетинговой кампании. (optional)
     * @param filterExcludeMarketingCampaign Исключает все акции для которых установлена компания. (optional)
     * @param filterFrom Со скольки. (optional)
     * @param filterCount Сколько. (optional)
     * @param filterType Тип акции. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCommunicationOfferModel]>
     */
    @GET("v1.2/communicationOffers")
    fun communicationOfferGetOffers(@Query("filter.communicationOfferState") filterCommunicationOfferState: CommunicationOfferState? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.brandIds") filterBrandIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.categoriesIds") filterCategoriesIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.isArchived") filterIsArchived: ArchivedState? = null, @Query("filter.priorityMin") filterPriorityMin: kotlin.Int? = null, @Query("filter.priorityMax") filterPriorityMax: kotlin.Int? = null, @Query("filter.marketingCampaignId") filterMarketingCampaignId: kotlin.Int? = null, @Query("filter.excludeMarketingCampaign") filterExcludeMarketingCampaign: kotlin.Boolean? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.type") filterType: CommunicationOfferType? = null): Call<ResultModelOfPagedViewModelOfCommunicationOfferModel>

    /**
     * Возвращает список целевых аудиторий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id рекламных материалов.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyPrograms  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterSortingIds  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterCalculatedShowMode  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfTargetGroupViewModel]>
     */
    @GET("v1.2/communicationOffers/{id}/availableTargetGroups")
    fun communicationOfferGetTargetGroups(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.loyaltyPrograms") filterLoyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.creatorIds") filterCreatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.archivedShowMode") filterArchivedShowMode: ArchivedState? = null, @Query("filter.calculatedShowMode") filterCalculatedShowMode: TargetGroupCalculatedShowMode? = null): Call<ResultModelOfPagedViewModelOfTargetGroupViewModel>

    /**
     * Востановить акцию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/communicationOffers/{id}/Restore")
    fun communicationOfferRestoreOffer(@Path("id") id: kotlin.Int): Call<ResultModel>

}

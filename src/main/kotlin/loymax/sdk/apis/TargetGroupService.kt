package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface TargetGroupService {
    /**
     * Запускает расчет целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{id}/calculate")
    fun targetGroupCalculateTargetGroup(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Получить все целевые аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param partnerIds  (optional)
     * @param loyaltyPrograms  (optional)
     * @param creatorIds  (optional)
     * @param sortingIds  (optional)
     * @param name  (optional)
     * @param archivedShowMode  (optional)
     * @param calculatedShowMode  (optional)
     * @param from Начало выборки. (optional)
     * @param count Объем выборки. (optional)
     * @param filterBySortingIds Фильтровать только по целевым аудиториям с идентификаторами, переданными в SortingIds. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfTargetGroupBriefViewModel]>
     */
    @POST("v1.2/targetGroups/list")
    fun targetGroupGetAllTargetGroups(@Query("dateFrom") dateFrom: java.time.OffsetDateTime? = null, @Query("dateTo") dateTo: java.time.OffsetDateTime? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("loyaltyPrograms") loyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("creatorIds") creatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("name") name: kotlin.String? = null, @Query("archivedShowMode") archivedShowMode: ArchivedState? = null, @Query("calculatedShowMode") calculatedShowMode: TargetGroupCalculatedShowMode? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filterBySortingIds") filterBySortingIds: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfTargetGroupBriefViewModel>

    /**
     * Возвращает список пользователей, которые создавали целевые аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCreatorModel]>
     */
    @GET("v1.2/targetGroups/AvailableCreators")
    fun targetGroupGetAvailableCreators(): Call<ResultModelOfListOfCreatorModel>

    /**
     * Возвращает список выбранных идентификаторов клиентов, входящих в последней расчет целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @param types Типы идентификаторов клиентов, входящих в целевую аудиторию.
     * @return [Call]<[kotlin.Any]>
     */
    @GET("v1.2/targetGroups/{id}/calculation/customers")
    fun targetGroupGetCustomersByTargetGroupLastCalculation(@Path("id") id: kotlin.Int, @Query("types") types: kotlin.collections.MutableList<IdentifierType>): Call<kotlin.Any>

    /**
     * Возвращает список клиентов, входящих в последний расчет целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterIdentifierText Только пользователи с идентификаторами содержащими данный текст. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfUserViewModel]>
     */
    @GET("v1.2/targetGroups/persons")
    fun targetGroupGetPersonsByTargetGroupLastCalculation(@Query("targetGroupId") targetGroupId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.identifierText") filterIdentifierText: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfUserViewModel>

    /**
     * Возвращает целевую аудиторию по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @return [Call]<[ResultModelOfTargetGroupViewModel]>
     */
    @GET("v1.2/targetGroups/{id}")
    fun targetGroupGetTargetGroup(@Path("id") id: kotlin.Int): Call<ResultModelOfTargetGroupViewModel>

    /**
     * Возвращает информацию о последнем расчете целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @return [Call]<[ResultModelOfCalculationModel]>
     */
    @GET("v1.2/targetGroups/{id}/calculation")
    fun targetGroupGetTargetGroupCalculationInfo(@Path("id") id: kotlin.Int): Call<ResultModelOfCalculationModel>

    /**
     * Возвращает все целевые аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param properties Свойства целевой аудитории. Если не указать ни одного, то будут возвращены все (доступные свойства  creationDate, changeDate, fixDate, creatorDescription, lastChangeUserDescription, fixUserDescription, calculationInfo, lastCalculationInfo; hasFilters, operations). (optional)
     * @param filterId Внутренний идентификатор фильтра в акции. (optional)
     * @param offerId Внутренний идентификатор акции. (optional)
     * @param chainId Внутренний идентификатор правила акции. (optional)
     * @param offerVersionId Внутренний идентификатор версии акции. (optional)
     * @param isExternal Признак импортированной целевой аудитории (true - импортированная, false - неимпортированная). (optional)
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
    @GET("v1.2/targetGroups")
    fun targetGroupGetTargetGroups(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("properties") properties: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filterId") filterId: kotlin.Int? = null, @Query("offerId") offerId: kotlin.Int? = null, @Query("chainId") chainId: kotlin.Int? = null, @Query("offerVersionId") offerVersionId: kotlin.Int? = null, @Query("isExternal") isExternal: kotlin.Boolean? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.loyaltyPrograms") filterLoyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.creatorIds") filterCreatorIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.archivedShowMode") filterArchivedShowMode: ArchivedState? = null, @Query("filter.calculatedShowMode") filterCalculatedShowMode: TargetGroupCalculatedShowMode? = null): Call<ResultModelOfPagedViewModelOfTargetGroupViewModel>

    /**
     * Восстанавливает из архива целевую аудиторию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{id}/restore")
    fun targetGroupRestoreTargetGroup(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Снимает фиксацию (расчет) с целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор целевой аудитории.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{id}/unfix")
    fun targetGroupUnfixTargetGroup(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Импортирует клиентов в ранее созданную целевую аудиторию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param identifierType  (optional)
     * @param ignoreError  (optional)
     * @param operationType  (optional)
     * @param identifiers  (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @POST("v1.2/targetGroups/import")
    fun targetGroupUploadCalculation(@Query("targetGroupId") targetGroupId: kotlin.Int, @Query("identifierType") identifierType: IdentifierTypeEnum? = null, @Query("ignoreError") ignoreError: kotlin.Boolean? = null, @Query("operationType") operationType: OperationTypeEnum? = null, @Query("identifiers") identifiers: kotlin.collections.MutableList<kotlin.String>? = null): Call<ResultModelOfInt32>

}

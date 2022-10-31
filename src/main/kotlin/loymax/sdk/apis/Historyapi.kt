package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.HistoryItemOperationType
import loymax.sdk.models.HistoryItemType
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfHistoryAggregateWithdrawRewardModel
import loymax.sdk.models.ResultModelOfHistoryListModel
import loymax.sdk.models.ResultModelOfListOfString

interface Historyapi {
    /**
     * Возвращает список товаров за указанный период времени (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Начальная дата периода в формате 0000-00-00T00:00:00Z.
     * @param toDate Конечная дата периода в формате 0000-00-00T00:00:00Z.
     * @param brandUid Внешний идентификатор бренда. (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/History/GoodsIds")
    fun historyGetGoodsIds(@Query("fromDate") fromDate: kotlin.String, @Query("toDate") toDate: kotlin.String, @Query("brandUid") brandUid: kotlin.String? = null): Call<ResultModelOfListOfString>

    /**
     * Возвращает историю операций клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterToDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterCardId Внутренний идентификатор карты. Возвращает историю только по этой карте. (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterHistoryItemType Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. (optional)
     * @param filterChequeNumber Номер чека. (optional)
     * @param filterOperationTypes Типы операций. (optional)
     * @param filterCurrentUser По текущему клиенту (true), по группе клиентов (false). (optional)
     * @return [Call]<[ResultModelOfHistoryListModel]>
     */
    @GET("v1.2/History")
    fun historyGetHistory(@Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.cardId") filterCardId: kotlin.Int? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.historyItemType") filterHistoryItemType: HistoryItemType? = null, @Query("filter.chequeNumber") filterChequeNumber: kotlin.String? = null, @Query("filter.operationTypes") filterOperationTypes: kotlin.collections.MutableList<HistoryItemOperationType>? = null, @Query("filter.currentUser") filterCurrentUser: kotlin.Boolean? = null): Call<ResultModelOfHistoryListModel>

    /**
     * Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFromDate Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю. (optional)
     * @param filterToDate Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю. (optional)
     * @param filterCardId Внутренний идентификатор карты (будет получена история только по этой карте). (optional)
     * @param filterHistoryItemType Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}. (optional)
     * @param filterCurrentUser По текущему клиенту (true), по группе клиента (false). (optional)
     * @return [Call]<[ResultModelOfHistoryAggregateWithdrawRewardModel]>
     */
    @GET("v1.2/History/AggregateWithdrawRewardPurchase")
    fun historyGetHistoryAggregateWithdrawRewardPurchase(@Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.cardId") filterCardId: kotlin.Int? = null, @Query("filter.historyItemType") filterHistoryItemType: HistoryItemType? = null, @Query("filter.currentUser") filterCurrentUser: kotlin.Boolean? = null): Call<ResultModelOfHistoryAggregateWithdrawRewardModel>

    /**
     * Возвращает сумму покупок, сумму начисленных и списанных бонусов в рамках покупок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param filterFromDate Начальная дата периода в формате 0000-00-00T00 00 00Z, с которой необходимо вывести историю. (optional)
     * @param filterToDate Конечная дата периода в формате 0000-00-00T00 00 00Z, до которой необходимо вывести историю. (optional)
     * @param filterCardId Внутренний идентификатор карты (будет получена история только по этой карте). (optional)
     * @param filterHistoryItemType Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.AggregateHistoryFilter.HistoryItemType}. (optional)
     * @param filterCurrentUser По текущему клиенту (true), по группе клиента (false). (optional)
     * @return [Call]<[ResultModelOfHistoryAggregateWithdrawRewardModel]>
     */
    @GET("v1.2/Users/{personId}/History/AggregateWithdrawRewardPurchase")
    fun historyGetHistoryAggregateWithdrawRewardPurchaseByPerson(@Path("personId") personId: kotlin.Int, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.cardId") filterCardId: kotlin.Int? = null, @Query("filter.historyItemType") filterHistoryItemType: HistoryItemType? = null, @Query("filter.currentUser") filterCurrentUser: kotlin.Boolean? = null): Call<ResultModelOfHistoryAggregateWithdrawRewardModel>

    /**
     * Возвращает историю операций клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param filterFromDate Дата с которой необходимо вывести историю. (optional)
     * @param filterToDate Дата до которой необходимо вывести историю. (optional)
     * @param filterCardId ID карты. Если указан, то будет получена история только по этой карте. (optional)
     * @param filterFrom Начиная с какого элемента необходимо выводить. (optional)
     * @param filterCount Кол-во элементов для вывода. (optional)
     * @param filterHistoryItemType Тип события в истории {Loymax.Mobile.Contract.Models.History.HistoryFilterV13.HistoryItemType}. (optional)
     * @param filterChequeNumber Номер чека. (optional)
     * @param filterOperationTypes Типы операций с указанием покупка или возврат. (optional)
     * @param filterCurrentUser По текущему пользователю, или по группе пользователя. (optional)
     * @return [Call]<[ResultModelOfHistoryListModel]>
     */
    @GET("v1.2/Users/{personId}/History")
    fun historyGetHistoryByPerson(@Path("personId") personId: kotlin.Int, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.cardId") filterCardId: kotlin.Int? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.historyItemType") filterHistoryItemType: HistoryItemType? = null, @Query("filter.chequeNumber") filterChequeNumber: kotlin.String? = null, @Query("filter.operationTypes") filterOperationTypes: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filter.currentUser") filterCurrentUser: kotlin.Boolean? = null): Call<ResultModelOfHistoryListModel>

    /**
     * Отправляет историю операций клиенту по email.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param filterFromDate Начальная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterToDate Конечная дата периода в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterCardId Внутренний идентификатор карты. Возвращает историю только по этой карте. (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterHistoryItemType Тип события в истории. Возможные значения  All-все события, Purchase-события, связанные с покупкой, RewardData-события, связанные с начислением бонусов без покупки, WithdrawData-события, связанные со списанием бонусов без покупки. {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. (optional)
     * @param filterChequeNumber Номер чека. (optional)
     * @param filterOperationTypes Типы операций. (optional)
     * @param filterCurrentUser По текущему клиенту (true), по группе клиентов (false). (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/History/SendToEmail")
    fun historySendHistoryToEmail(@Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.cardId") filterCardId: kotlin.Int? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.historyItemType") filterHistoryItemType: HistoryItemType? = null, @Query("filter.chequeNumber") filterChequeNumber: kotlin.String? = null, @Query("filter.operationTypes") filterOperationTypes: kotlin.collections.MutableList<HistoryItemOperationType>? = null, @Query("filter.currentUser") filterCurrentUser: kotlin.Boolean? = null): Call<ResultModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.AccountChangeType
import loymax.sdk.models.ArchivedState
import loymax.sdk.models.CheckBoughtListModel
import loymax.sdk.models.ConfirmDeregistrationModel
import loymax.sdk.models.QuestionAnswerModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfDetailedBalanceInfoViewModel
import loymax.sdk.models.ResultModelOfListOfAccountBalanceModel
import loymax.sdk.models.ResultModelOfListOfAttributePartnerValueModel
import loymax.sdk.models.ResultModelOfListOfCheckBoughtListResultModel
import loymax.sdk.models.ResultModelOfListOfQuestionnaireItemModel
import loymax.sdk.models.ResultModelOfListOfSubscriptionViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfAccountChangeViewModel
import loymax.sdk.models.ResultModelOfPersonAttributeValueHistoryModel
import loymax.sdk.models.ResultModelOfQuestionsErrorsModel
import loymax.sdk.models.ResultModelOfReferrerInfoViewModel
import loymax.sdk.models.ResultModelOfSendDeregistrationConfirmCodeResultModel
import loymax.sdk.models.ResultModelOfUserActionsResult
import loymax.sdk.models.ResultModelOfUserIdentifiersInfoResult
import loymax.sdk.models.ResultModelOfUserInfoResult

interface Userapi {
    /**
     * Возвращает информацию о том, куплен ли каждый из товаров (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param rows  (optional)
     * @return [Call]<[ResultModelOfListOfCheckBoughtListResultModel]>
     */
    @POST("v1.2/User/CheckBoughtList")
    fun userCheckBoughtList(@Query("rows") rows: kotlin.collections.MutableList<kotlin.String>? = null): Call<ResultModelOfListOfCheckBoughtListResultModel>

    /**
     * Оформляет выход из Программы лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reason Причина выхода (необязательный параметр). (optional)
     * @param confirmCode Код подтверждения. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Deregistration/Confirm")
    fun userConfirmDeregistration(@Query("reason") reason: kotlin.String? = null, @Query("confirmCode") confirmCode: kotlin.String? = null): Call<ResultModel>

    /**
     * Оформляет подписку на все типы подписок при регистрации нового клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Subscriptions/Confirm")
    fun userConfirmSubscriptions(): Call<ResultModel>

    /**
     * Удаляет все ответы из набора вопросов анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param tag Номер набора ответов.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/User/DeleteAnswerSets")
    fun userDeleteAnswer(@Query("tag") tag: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает информацию об операциях активации по конкретному счету клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currencyId Внутренний идентификатор валюты.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param fromDate Начальная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param toDate Конечная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param orderByDateAscending Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfAccountChangeViewModel]>
     */
    @GET("v1.2/User/DetailedBalance/{currencyId}/Activations")
    fun userGetActivationOperations(@Path("currencyId") currencyId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("orderByDateAscending") orderByDateAscending: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfAccountChangeViewModel>

    /**
     * Возвращает список партнерских атрибутов клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfAttributePartnerValueModel]>
     */
    @GET("v1.2/User/Attributes")
    fun userGetAttributes(): Call<ResultModelOfListOfAttributePartnerValueModel>

    /**
     * Возвращает информацию о балансе клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfAccountBalanceModel]>
     */
    @GET("v1.2/User/Balance")
    fun userGetBalances(): Call<ResultModelOfListOfAccountBalanceModel>

    /**
     * Возвращает информацию о детализированном балансе клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state Состояние валюты. (optional)
     * @param date Дата (если текущая, то значение null). (optional)
     * @return [Call]<[ResultModelOfDetailedBalanceInfoViewModel]>
     */
    @GET("v1.2/User/DetailedBalance")
    fun userGetDetailedBalance(@Query("state") state: ArchivedState? = null, @Query("date") date: kotlin.String? = null): Call<ResultModelOfDetailedBalanceInfoViewModel>

    /**
     * Возвращает информацию обо всех операциях активации и сгораниях по конкретному счету клиента (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currencyId Внутренний идентификатор валюты.
     * @param orderByDateAscending Тип сортировки (true-по дате от прошлого к будущему, false-по дате от будущего к прошлому). (optional)
     * @param filterFromDate Начальная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterToDate Конечная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterChangeTypes Фильтр по типу изменения (активации/сгорания). (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfAccountChangeViewModel]>
     */
    @GET("v1.2/User/DetailedBalance/{currencyId}/Operations")
    fun userGetDetailedBalanceItemOperations(@Path("currencyId") currencyId: kotlin.Int, @Query("orderByDateAscending") orderByDateAscending: kotlin.Boolean? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.changeTypes") filterChangeTypes: kotlin.collections.MutableList<AccountChangeType>? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfAccountChangeViewModel>

    /**
     * Возвращает информацию об операциях сгорания по конкретному счету пользователя (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currencyId Внутренний идентификатор валюты.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param fromDate Начальная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param toDate Конечная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param orderByDateAscending True-сортировка по дате от прошлого к будущему, false-сортировка по дате от будущего к прошлому. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfAccountChangeViewModel]>
     */
    @GET("v1.2/User/DetailedBalance/{currencyId}/Expirations")
    fun userGetExpirationOperations(@Path("currencyId") currencyId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("orderByDateAscending") orderByDateAscending: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfAccountChangeViewModel>

    /**
     * Возвращает список логинов клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfUserIdentifiersInfoResult]>
     */
    @GET("v1.2/User/Logins")
    fun userGetLogins(): Call<ResultModelOfUserIdentifiersInfoResult>

    /**
     * Возвращает информацию о вопросах анкеты (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterOnlyRequired True-только вопросы с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;,false-все вопросы. (optional)
     * @return [Call]<[ResultModelOfListOfQuestionnaireItemModel]>
     */
    @GET("v1.2/User/Questions")
    fun userGetQuestionnaireItems(@Query("filter.onlyRequired") filterOnlyRequired: kotlin.Boolean? = null): Call<ResultModelOfListOfQuestionnaireItemModel>

    /**
     * Возвращает номер бонусной карты реферера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfReferrerInfoViewModel]>
     */
    @GET("v1.2/User/Referrer")
    fun userGetReferrer(): Call<ResultModelOfReferrerInfoViewModel>

    /**
     * Возвращает список действий, для которых нужны шаги регистрации.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfUserActionsResult]>
     */
    @GET("v1.2/User/RegistrationActions")
    fun userGetRegistrationActions(): Call<ResultModelOfUserActionsResult>

    /**
     * Возвращает список подписок клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionExternalIds Внешний идентификатор рассылки.
     * @return [Call]<[ResultModelOfListOfSubscriptionViewModel]>
     */
    @GET("v1.2/User/Subscriptions")
    fun userGetSubscriptions(@Query("subscriptionExternalIds") subscriptionExternalIds: kotlin.collections.MutableList<kotlin.String>): Call<ResultModelOfListOfSubscriptionViewModel>

    /**
     * Возвращает историю изменений значений атрибута клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @param filterCreateDateFrom Начальная дата периода в формате 0000-00-00T00 00 00Z (Если не задана, то - самая ранняя). (optional)
     * @param filterCreateDateTo Конечная дата периода в формате 0000-00-00T00 00 00Z.(Если не задана, то - самая поздняя). (optional)
     * @param filterSortDescendingByCreateDateTime Тип сортировки (true-по убыванию, false-по возрастанию). (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPersonAttributeValueHistoryModel]>
     */
    @GET("v1.2/User/Attributes/{logicalName}/History")
    fun userGetUserAttributeValuesHistory(@Path("logicalName") logicalName: kotlin.String, @Query("filter.createDateFrom") filterCreateDateFrom: kotlin.String? = null, @Query("filter.createDateTo") filterCreateDateTo: kotlin.String? = null, @Query("filter.sortDescendingByCreateDateTime") filterSortDescendingByCreateDateTime: kotlin.Boolean? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null): Call<ResultModelOfPersonAttributeValueHistoryModel>

    /**
     * Возвращает информацию о клиенте (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param payload Список логических имен атрибутов клиента  State, Cards, BalanceShortInfo, BalanceDetailedInfo, EmailDetailedInfo, Attributes.{название атрибута} (например Attributes.FirstName). (optional)
     * @return [Call]<[ResultModelOfUserInfoResult]>
     */
    @GET("v1.2/User")
    fun userGetUserInfo(@Query("payload") payload: kotlin.collections.MutableList<kotlin.String>? = null): Call<ResultModelOfUserInfoResult>

    /**
     * Оформляет принятие оферты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/AcceptTenderOffer")
    fun userPostAcceptTenderOffer(): Call<ResultModel>

    /**
     * Обновляет ответы на вопросы анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param updateAnswersModel Ответы.
     * @return [Call]<[ResultModelOfQuestionsErrorsModel]>
     */
    @POST("v1.2/User/Answers")
    fun userPostQuestionnaireAnswers(@Query("updateAnswersModel") updateAnswersModel: kotlin.collections.MutableList<QuestionAnswerModel>): Call<ResultModelOfQuestionsErrorsModel>

    /**
     * Оформляет отказ от всех типов подписок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Subscriptions/Reject")
    fun userRejectSubscriptions(): Call<ResultModel>

    /**
     * Оформляет отправку кода подтверждения для выхода из Программы лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfSendDeregistrationConfirmCodeResultModel]>
     */
    @POST("v1.2/User/Deregistration/SendConfirmCode")
    fun userSendDeregistrationConfirmCode(): Call<ResultModelOfSendDeregistrationConfirmCodeResultModel>

}

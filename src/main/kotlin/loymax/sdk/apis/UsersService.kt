package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UsersService {
    /**
     * Оформляет принятие клиентом оферты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/AcceptTenderOffer")
    fun usersAcceptTenderOffer(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Отменяет верификацию номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/CancelConfirmPhone")
    fun usersCancelConfirmPhone(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Оформляет изменение часового пояса клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param timeZone Часовой пояс. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/ChangeTimeZone")
    fun usersChangeTimeZone(@Path("personId") personId: kotlin.Int, @Query("timeZone") timeZone: kotlin.Int? = null): Call<ResultModel>

    /**
     * Проверяет пароль клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param password Пароль клиента.
     * @return [Call]<[ResultModel]>
     */
    @GET("v1.2/users/{personId}/CheckPassword")
    fun usersCheckUserPassword(@Path("personId") personId: kotlin.Int, @Query("password") password: kotlin.String): Call<ResultModel>

    /**
     * Проверяет код подтверждения номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param confirmCode Код подтверждения. (optional)
     * @param password Пароль. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/PostConfirmPhoneCode")
    fun usersConfirmPhoneCode(@Path("personId") personId: kotlin.Int, @Query("confirmCode") confirmCode: kotlin.String? = null, @Query("password") password: kotlin.String? = null): Call<ResultModel>

    /**
     * Удаляет вариант ответа анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param number Идентификатор набора.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/DeleteAnswerSets")
    fun usersDeleteAnswer(@Path("personId") personId: kotlin.Int, @Query("number") number: kotlin.Int): Call<ResultModel>

    /**
     * Оформляет выход из Программы лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param reason Причина выхода. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/Deregister")
    fun usersDeregister(@Path("personId") personId: kotlin.Int, @Query("reason") reason: kotlin.String? = null): Call<ResultModel>

    /**
     * Возвращает информацию о возможности выпуска виртуальной карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfEmitVirtualCardInfoModel]>
     */
    @GET("v1.2/users/{personId}/EmitVirtual")
    fun usersEmitVirtualCardInfo(@Path("personId") personId: kotlin.Int): Call<ResultModelOfEmitVirtualCardInfoModel>

    /**
     * Возвращает список партнерских атрибутов клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfAttributePartnerValueModel]>
     */
    @GET("v1.2/users/{personId}/Attributes")
    fun usersGetAttributes(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfAttributePartnerValueModel>

    /**
     * Возвращает балансы по номеру телефона или номеру карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param identifier Номер телефона или номер карты.
     * @return [Call]<[ResultModelOfListOfAccountBalanceModel]>
     */
    @GET("v1.2/users/code/{identifier}/balance")
    fun usersGetBalance(@Path("identifier") identifier: kotlin.String): Call<ResultModelOfListOfAccountBalanceModel>

    /**
     * Возвращает информацию о балансе клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfAccountBalanceModel]>
     */
    @GET("v1.2/users/{personId}/Balance")
    fun usersGetBalances(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfAccountBalanceModel>

    /**
     * Возвращает список акций клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param filterMerchantId Id магазина. (optional)
     * @param filterOfferState Статус акции. (optional)
     * @param filterFrom Со скольки. (optional)
     * @param filterCount Сколько. (optional)
     * @param filterType Тип акции. (optional)
     * @param filterCategoryFilterType Фильтр по категории. (optional)
     * @param filterCategoryLogicalNames Логические имена категорий. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCommunicationOfferModel]>
     */
    @GET("v1.2/users/{personId}/CommunicationOffers")
    fun usersGetCommunicationOffers(@Path("personId") personId: kotlin.Int, @Query("filter.merchantId") filterMerchantId: kotlin.Int? = null, @Query("filter.offerState") filterOfferState: CommunicationOfferState? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.type") filterType: CommunicationOfferType? = null, @Query("filter.categoryFilterType") filterCategoryFilterType: OfferCategoryFilterType? = null, @Query("filter.categoryLogicalNames") filterCategoryLogicalNames: kotlin.collections.MutableList<kotlin.String>? = null): Call<ResultModelOfPagedViewModelOfCommunicationOfferModel>

    /**
     * Возвращает информацию о текущем пользователе.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfSystemUserViewModel]>
     */
    @GET("v1.2/users/Current")
    fun usersGetCurrentPersonInfo(): Call<ResultModelOfSystemUserViewModel>

    /**
     * Возвращает Ф.И.О. текущего пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfUserName]>
     */
    @GET("v1.2/users/Current/name")
    fun usersGetCurrentUserName(): Call<ResultModelOfUserName>

    /**
     * Возвращает информацию о детализированном балансе клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param archivedState Состояние валюты. (optional)
     * @param date Дата (null, если текущая). (optional)
     * @return [Call]<[ResultModelOfDetailedBalanceInfoViewModel]>
     */
    @GET("v1.2/users/{personId}/DetailedBalance")
    fun usersGetDetailedBalance(@Path("personId") personId: kotlin.Int, @Query("archivedState") archivedState: ArchivedState? = null, @Query("date") date: kotlin.String? = null): Call<ResultModelOfDetailedBalanceInfoViewModel>

    /**
     * Возвращает информацию об операциях активации и сгораниях по конкретному счету клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param currencyId Внутренний идентификатор валюты.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterFromDate Начальная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterToDate Конечная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterChangeTypes Фильтр по типу изменения (активации/сгорания). (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDetailedAccountChangeViewModel]>
     */
    @GET("v1.2/users/{personId}/DetailedBalance/{currencyId}/Operations")
    fun usersGetDetailedBalanceItemOperations(@Path("personId") personId: kotlin.Int, @Path("currencyId") currencyId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.changeTypes") filterChangeTypes: kotlin.collections.MutableList<AccountChangeType>? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfDetailedAccountChangeViewModel>

    /**
     * Возвращает информацию о сумме покупок клиента у Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param partnerId Внешний идентификатор Партнера.
     * @return [Call]<[ResultModelOfMoneyViewModel]>
     */
    @GET("v1.2/users/{personId}/GetPartnerPurchaseAmount/{partnerId}")
    fun usersGetPartnerPurchaseAmount(@Path("personId") personId: kotlin.Int, @Path("partnerId") partnerId: kotlin.String): Call<ResultModelOfMoneyViewModel>

    /**
     * Возвращает информацию об атрибутах клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPersonAttributeModel]>
     */
    @GET("v1.2/users/GetPersonAttributesInfo")
    fun usersGetPersonAttributesInfo(): Call<ResultModelOfListOfPersonAttributeModel>

    /**
     * Возвращает информацию о купонах клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param count Количество возвращаемых элементов выборки.
     * @param from Порядковый номер начального элемента выборки.
     * @param filterEmissionIds  (optional)
     * @param filterCouponStates  (optional)
     * @param filterChangedStateDateFrom  (optional)
     * @param filterChangedStateDateTo  (optional)
     * @param filterCouponNumber  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCouponViewModel]>
     */
    @GET("v1.2/users/{personId}/Coupons")
    fun usersGetPersonCoupons(@Path("personId") personId: kotlin.Int, @Query("count") count: kotlin.Int, @Query("from") from: kotlin.Int, @Query("filter.emissionIds") filterEmissionIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.couponStates") filterCouponStates: kotlin.collections.MutableList<CouponState>? = null, @Query("filter.changedStateDateFrom") filterChangedStateDateFrom: kotlin.String? = null, @Query("filter.changedStateDateTo") filterChangedStateDateTo: kotlin.String? = null, @Query("filter.couponNumber") filterCouponNumber: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfCouponViewModel>

    /**
     * Возвращает информацию о клиенте по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfPersonInfoModel]>
     */
    @GET("v1.2/users/{id}")
    fun usersGetPersonInfoById(@Path("id") id: kotlin.Int): Call<ResultModelOfPersonInfoModel>

    /**
     * Возвращает информацию о клиенте по номеру телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param phone Номер телефона клиента.
     * @return [Call]<[ResultModelOfListOfPersonInfoModel]>
     */
    @GET("v1.2/users")
    fun usersGetPersonInfoByPhone(@Query("phone") phone: kotlin.String): Call<ResultModelOfListOfPersonInfoModel>

    /**
     * Возвращает детали персонального предложения клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param offerId Внутренний идентификатор акции.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDetailItem]>
     */
    @GET("v1.2/users/{personId}/CommunicationOffers/{offerId}/Details")
    fun usersGetPersonalOfferDetails(@Path("personId") personId: kotlin.Int, @Path("offerId") offerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfDetailItem>

    /**
     * Возвращает информацию о номере телефона клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfUserPhoneNumberInfo]>
     */
    @GET("v1.2/users/{personId}/Phone")
    fun usersGetPhone(@Path("personId") personId: kotlin.Int): Call<ResultModelOfUserPhoneNumberInfo>

    /**
     * Возвращает информацию о вопросах анкеты для предпросмотра анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterOnlyRequired True-только вопросы с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;,false-все вопросы. (optional)
     * @return [Call]<[ResultModelOfListOfQuestionnaireItemModel]>
     */
    @GET("v1.2/users/PreviewQuestions")
    fun usersGetPreviewQuestions(@Query("filter.onlyRequired") filterOnlyRequired: kotlin.Boolean? = null): Call<ResultModelOfListOfQuestionnaireItemModel>

    /**
     * Генерирует QR-код для карты клиента по номеру карты (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param identifier Номер телефона или номер любой активной Карты Участника ПЛ, которому принадлежит Карта.
     * @param cardNumber Номер карты.
     * @param isConvertToServerTimeNeeded Нужно ли преобразовать время генерации кода во время сервера. (optional)
     * @return [Call]<[ResultModelOfQrCodeModel]>
     */
    @GET("v1.2/users/code/{identifier}/cards/{cardNumber}/qrcode")
    fun usersGetQrCodeByCardNumber(@Path("identifier") identifier: kotlin.String, @Path("cardNumber") cardNumber: kotlin.String, @Query("isConvertToServerTimeNeeded") isConvertToServerTimeNeeded: kotlin.Boolean? = null): Call<ResultModelOfQrCodeModel>

    /**
     * Возвращает информацию о вопросах анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param filterOnlyRequired True-только вопросы с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;,false-все вопросы. (optional)
     * @return [Call]<[ResultModelOfListOfQuestionnaireItemModel]>
     */
    @GET("v1.2/users/{personId}/Questions")
    fun usersGetQuestions(@Path("personId") personId: kotlin.Int, @Query("filter.onlyRequired") filterOnlyRequired: kotlin.Boolean? = null): Call<ResultModelOfListOfQuestionnaireItemModel>

    /**
     * Возвращает действия, для которых нужны шаги регистрации.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfUserActionsResult]>
     */
    @GET("v1.2/users/{personId}/RegistrationActions")
    fun usersGetRegistrationActions(@Path("personId") personId: kotlin.Int): Call<ResultModelOfUserActionsResult>

    /**
     * Возвращает информацию о подписках клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfSubscriptionViewModel]>
     */
    @GET("v1.2/users/{personId}/Subscriptions")
    fun usersGetSubscriptions(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfSubscriptionViewModel>

    /**
     * Возвращает список значений атрибутов клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterAttributeName Название атрибута. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfUserAttributeValueViewModel]>
     */
    @GET("v1.2/users/{personId}/AttributesValues")
    fun usersGetUserAttributesValues(@Path("personId") personId: kotlin.Int, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.attributeName") filterAttributeName: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfUserAttributeValueViewModel>

    /**
     * Объединение счетов без подтверждения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetPersonId Id пользователя, со счетом которого будет объединение.
     * @param sourcePersonId Id пользователя, счет которого присоединяется.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{targetPersonId}/MergeAccount/{sourcePersonId}")
    fun usersMergeAccounts(@Path("targetPersonId") targetPersonId: kotlin.Int, @Path("sourcePersonId") sourcePersonId: kotlin.Int): Call<ResultModel>

    /**
     * Отправляет повторно код подтверждения номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/SendConfirmPhoneCode")
    fun usersSendConfirmCode(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Оформляет прикрепление карты к клиенту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param cardNumber Номер карты. (optional)
     * @param cvcCode CVC-код. (optional)
     * @return [Call]<[ResultModelOfCardCompactInfoModel]>
     */
    @POST("v1.2/users/{personId}/SetCard")
    fun usersSetCard(@Path("personId") personId: kotlin.Int, @Query("cardNumber") cardNumber: kotlin.String? = null, @Query("cvcCode") cvcCode: kotlin.String? = null): Call<ResultModelOfCardCompactInfoModel>

    /**
     * Устанавливает значение атрибута клиента через OAuth.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param identifier Идентификатор клиента.
     * @param attribute  (optional)
     * @param value Значение атрибута клиента. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/code/{identifier}/attributes")
    fun usersSetClientAttributeValue(@Path("identifier") identifier: kotlin.String, @Query("attribute") attribute: UserAttributeModel? = null, @Query("value") value: kotlin.String? = null): Call<ResultModel>

    /**
     * Привязывает email к клиенту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param email Email. (optional)
     * @param attachType Тип привязки email.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/SetEmail")
    fun usersSetEmail(@Path("personId") personId: kotlin.Int, @Query("email") email: kotlin.String? = null, @Query("attachType") attachType: CustomerActionType): Call<ResultModel>

    /**
     * Привязывает номер телефона к клиенту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param phone Номер телефона. (optional)
     * @param withoutCall Признак прикрепление номера телефона без звонка (true-без звонка, false-со звонком). (optional)
     * @return [Call]<[ResultModelOfConfirmCodeResultModel]>
     */
    @POST("v1.2/users/{personId}/SetPhone")
    fun usersSetPhone(@Path("personId") personId: kotlin.Int, @Query("phone") phone: kotlin.String? = null, @Query("withoutCall") withoutCall: kotlin.Boolean? = null): Call<ResultModelOfConfirmCodeResultModel>

    /**
     * Устанавливает пароль клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param needNotify Отправить клиенту уведомление об установке пароля (true-да, false-нет). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/SetRandomPassword")
    fun usersSetRandomPassword(@Path("personId") personId: kotlin.Int, @Query("needNotify") needNotify: kotlin.Boolean? = null): Call<ResultModel>

    /**
     * Оформляет подписку клиента на все типы подписок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/Subscribe")
    fun usersSubscribeToAll(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Оформляет отказ клиента от всех типов подписок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/Unsubscribe")
    fun usersUnsubscribeFromAll(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Обновляет ответы на вопросы анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param updateAnswers Ответы.
     * @return [Call]<[ResultModelOfQuestionsErrorsModel]>
     */
    @POST("v1.2/users/{personId}/UpdateAnswers")
    fun usersUpdateAnswers(@Path("personId") personId: kotlin.Int, @Query("updateAnswers") updateAnswers: kotlin.collections.MutableList<QuestionAnswerModel>): Call<ResultModelOfQuestionsErrorsModel>

    /**
     * Изменяет состояние нотификатора (email).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param isVerified Статус верификации нотификатора. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/notifiers/Email")
    fun usersUpdateEmail(@Path("personId") personId: kotlin.Int, @Query("isVerified") isVerified: kotlin.Boolean? = null): Call<ResultModel>

    /**
     * Изменяет состояние нотификатора (номера телефона).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param isVerified Статус верификации нотификатора. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/notifiers/Phone")
    fun usersUpdatePhoneStatus(@Path("personId") personId: kotlin.Int, @Query("isVerified") isVerified: kotlin.Boolean? = null): Call<ResultModel>

    /**
     * Обновляет значение атрибута.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param id Внутренний идентификатор значения атрибута. (optional)
     * @param attribute  (optional)
     * @param value Значение атрибута. (optional)
     * @return [Call]<[ResultModelOfUserAttributeValueUpdateError]>
     */
    @POST("v1.2/users/{personId}/UpdateAttributeValue")
    fun usersUpdateUserAttributeValue(@Path("personId") personId: kotlin.Int, @Query("id") id: kotlin.Int? = null, @Query("attribute") attribute: BaseUserAttributeViewModel? = null, @Query("value") value: kotlin.String? = null): Call<ResultModelOfUserAttributeValueUpdateError>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CardService {
    /**
     * Отменяет начатое объединение карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/Attach/Cancel")
    fun cardAttachCardCancel(): Call<ResultModel>

    /**
     * Завершает начатое объединение карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param confirmCode Код подтверждения.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/Attach/Confirm")
    fun cardAttachCardConfirm(@Query("confirmCode") confirmCode: kotlin.String): Call<ResultModel>

    /**
     * Отправляет повторно код подтверждения в процессе объединения карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/Attach/SendConfirmCode")
    fun cardAttachCardSendConfirmCode(): Call<ResultModel>

    /**
     * Возвращает текущее состояние процесса прикрепления карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfAttachCardState]>
     */
    @GET("v1.2/Cards/Attach")
    fun cardAttachCardState(): Call<ResultModelOfAttachCardState>

    /**
     * Блокирует/разблокирует карту.
     * В случае успешного завершения вызова, карта меняет значение флага \&quot;Заблокирована для оплаты\&quot; с текущего на противоположное.
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @param password Пароль.
     * @param reason Причины блокировки. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/{cardId}/ChangeBlockState")
    fun cardChangeBlockState(@Path("cardId") cardId: kotlin.Int, @Query("password") password: kotlin.String, @Query("reason") reason: kotlin.String? = null): Call<ResultModel>

    /**
     * Обновляет срок действия карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @param expiryDate Дата истечения срока действия карты. (optional)
     * @param comment Комментарий. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/{cardId}/ExpiryDate")
    fun cardChangeExpiryDate(@Path("cardId") cardId: kotlin.Int, @Query("expiryDate") expiryDate: java.time.OffsetDateTime? = null, @Query("comment") comment: kotlin.String? = null): Call<ResultModel>

    /**
     * Проверяет пароль карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @param cardPassword Пароль.
     * @return [Call]<[ResultModelOfBoolean]>
     */
    @GET("v1.2/Cards/{cardId}/checkPassword")
    fun cardCheckCardPassword(@Path("cardId") cardId: kotlin.Int, @Query("cardPassword") cardPassword: kotlin.String): Call<ResultModelOfBoolean>

    /**
     * Проверяет CVC-код карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @param cvc CVC-код.
     * @return [Call]<[ResultModelOfBoolean]>
     */
    @GET("v1.2/Cards/{cardId}/checkCvc")
    fun cardCheckCvc(@Path("cardId") cardId: kotlin.Int, @Query("cvc") cvc: kotlin.String): Call<ResultModelOfBoolean>

    /**
     * Возвращает информацию о возможности выпуска виртуальной карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfEmitVirtualCardInfoModel]>
     */
    @GET("v1.2/Cards/EmitVirtual")
    fun cardEmitVirtualCardInfo(): Call<ResultModelOfEmitVirtualCardInfoModel>

    /**
     * Возвращает информацию о карте по внутреннему идентификатору карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @return [Call]<[ResultModelOfCardInfo]>
     */
    @GET("v1.2/Cards/{cardId}")
    fun cardGetCard(@Path("cardId") cardId: kotlin.Int): Call<ResultModelOfCardInfo>

    /**
     * Возвращает информацию о карте по ее внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @return [Call]<[ResultModelOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/Cards/{cardId}/CardInfo")
    fun cardGetCardInfo(@Path("cardId") cardId: kotlin.Int): Call<ResultModelOfSystemApiCardInfoModel>

    /**
     * Возвращает список карт по параметрам.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки.
     * @param count Количество возвращаемых элементов выборки.
     * @param state Состояние карты (сгенерирована, расфасована, активирована, заменена, создается, создана, готова к выдаче, выдана клиенту, срок действия истек).
     * @param hasPerson Привязана ли карта к пользователю (true-привязана, false-не привязана). (optional)
     * @param isBlocked Является ли карта заблокированной (true-заблокирована, false-не заблокирована). (optional)
     * @param isGift Является ли карта подарочной (true-подарочная, false-не подарочная). (optional)
     * @param isDeleted Является ли карта удаленной (true-удалена, false-не удалена). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/Cards/byParams")
    fun cardGetCardInfosByFilter(@Query("from") from: kotlin.Int, @Query("count") count: kotlin.Int, @Query("state") state: CardState, @Query("hasPerson") hasPerson: kotlin.Boolean? = null, @Query("isBlocked") isBlocked: kotlin.Boolean? = null, @Query("isGift") isGift: kotlin.Boolean? = null, @Query("isDeleted") isDeleted: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfSystemApiCardInfoModel>

    /**
     * Возвращает цепочку замен карт по внутреннему идентификатору карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/Cards/{cardId}/ReplacementChain")
    fun cardGetCardReplacementsByCardId(@Path("cardId") cardId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfSystemApiCardInfoModel>

    /**
     * Возвращает список карт текущего клиента и все операции по ним (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCardInfo]>
     */
    @GET("v1.2/Cards")
    fun cardGetCards(): Call<ResultModelOfListOfCardInfo>

    /**
     * Возвращает информацию о карте по ее номеру и внутреннему идентификатору ПЛ.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardNumber Номер карты.
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности. (optional)
     * @return [Call]<[ResultModelOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/Cards/ByCardNumber")
    fun cardGetCardsByCardNumber(@Query("cardNumber") cardNumber: kotlin.String, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null): Call<ResultModelOfSystemApiCardInfoModel>

    /**
     * Генерирует QR-код для карты по внутреннему идентификатору карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты.
     * @return [Call]<[ResultModelOfQrCodeModel]>
     */
    @GET("v1.2/Cards/{cardId}/QrCode")
    fun cardGetQrCode(@Path("cardId") cardId: kotlin.Int): Call<ResultModelOfQrCodeModel>

    /**
     * Возвращает информацию для диапазона карт из одного выпуска. Количество карт в диапазоне:не более 500.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param beginCardId Внутренний идентификатор карты начала диапазона.
     * @param endCardId Внутренний идентификатор карты конца диапазона.
     * @return [Call]<[ResultModelOfListOfCardCompactInfoModel]>
     */
    @GET("v1.2/Cards/Range/{beginCardId}/{endCardId}")
    fun cardGetRange(@Path("beginCardId") beginCardId: kotlin.Int, @Path("endCardId") endCardId: kotlin.Int): Call<ResultModelOfListOfCardCompactInfoModel>

    /**
     * Обновляет состояние карты на \&quot;Выдана\&quot;.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор неактивированной карты.
     * @param partnerId Внутренний идентификатор Партнера, выдающего карту.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/{cardId}/Issue")
    fun cardIssueCard(@Path("cardId") cardId: kotlin.Int, @Query("partnerId") partnerId: kotlin.Int): Call<ResultModel>

    /**
     * Оформляет замену карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор заменяемой карты.
     * @param cardNumber Номер новой карты. (optional)
     * @param cvcCode CVC-код новой карты. (optional)
     * @param cardPassword Пароль новой карты. (optional)
     * @param password Пароль от ЛК для повторной авторизации клиента. (optional)
     * @return [Call]<[ResultModelOfReplaceCardResult]>
     */
    @POST("v1.2/Cards/{cardId}/Replace")
    fun cardReplaceCard(@Path("cardId") cardId: kotlin.Int, @Query("cardNumber") cardNumber: kotlin.String? = null, @Query("cvcCode") cvcCode: kotlin.String? = null, @Query("cardPassword") cardPassword: kotlin.String? = null, @Query("password") password: kotlin.String? = null): Call<ResultModelOfReplaceCardResult>

    /**
     * Возвращает информацию о настройках по прикреплению карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfEmitCardInfoModel]>
     */
    @GET("v1.2/Cards/SetCardInfo")
    fun cardSetCardConfigurationInfo(): Call<ResultModelOfEmitCardInfoModel>

    /**
     * Возвращает информацию о возможности прикрепления физической карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfSetCardActionInfoModel]>
     */
    @GET("v1.2/Cards/Set")
    fun cardSetCardInfo(): Call<ResultModelOfSetCardActionInfoModel>

}

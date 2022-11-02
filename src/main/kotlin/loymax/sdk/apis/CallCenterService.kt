package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CallCenterService {
    /**
     * Блокирует счет.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор Участника ПЛ. (optional)
     * @param comment Комментарий. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/BlockAccount")
    fun callCenterBlockAccount(@Query("personId") personId: kotlin.Int? = null, @Query("comment") comment: kotlin.String? = null): Call<ResultModel>

    /**
     * Блокирует карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardID Внутренний идентификатор карты Участника ПЛ. (optional)
     * @param callerPhone Номер телефона Участника ПЛ. (optional)
     * @param comment Комментарий. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/BlockCard")
    fun callCenterBlockCard(@Query("cardID") cardID: kotlin.Int? = null, @Query("callerPhone") callerPhone: kotlin.String? = null, @Query("comment") comment: kotlin.String? = null): Call<ResultModel>

    /**
     * Заменяет категорию карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор карты Участника ПЛ. (optional)
     * @param cardCategoryId Внутренний идентификатор новой категории карты Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/ChangeCardCategory")
    fun callCenterChangeCardCategory(@Query("cardId") cardId: kotlin.Int? = null, @Query("cardCategoryId") cardCategoryId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Заменяет Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор Участника ПЛ. (optional)
     * @param newEmail Новый Email Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/ChangeEmail")
    fun callCenterChangeEmail(@Query("personId") personId: kotlin.Int? = null, @Query("newEmail") newEmail: kotlin.String? = null): Call<ResultModel>

    /**
     * Заменяет номер телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор Участника ПЛ. (optional)
     * @param newPhone Новый номер телефона Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/ChangePhone")
    fun callCenterChangePhone(@Query("personId") personId: kotlin.Int? = null, @Query("newPhone") newPhone: kotlin.String? = null): Call<ResultModel>

    /**
     * Удаляет карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор удаляемой карты. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/DeleteCard")
    fun callCenterDeleteCard(@Query("cardId") cardId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Удаляет Участника из ПЛ.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор удаляемого Участника ПЛ. (optional)
     * @param reason Причина выхода Участника из ПЛ. (optional)
     * @param callerPhone Номер телефона Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/DeregisterPerson")
    fun callCenterDeregisterPerson(@Query("personId") personId: kotlin.Int? = null, @Query("reason") reason: kotlin.String? = null, @Query("callerPhone") callerPhone: kotlin.String? = null): Call<ResultModel>

    /**
     * Восстанавливает карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Внутренний идентификатор удаляемой карты. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/RecoverCard")
    fun callCenterRecoverCard(@Query("cardId") cardId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Заменяет карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param oldCardId Внутренний идентификатор карты Участника ПЛ, которую необходимо заменить. (optional)
     * @param newCardId Внутренний идентификатор новой карты Участника ПЛ. (optional)
     * @param cvcCode CVC-код (при наличии). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/ReplaceCard")
    fun callCenterReplacePersonCard(@Query("oldCardId") oldCardId: kotlin.Int? = null, @Query("newCardId") newCardId: kotlin.Int? = null, @Query("cvcCode") cvcCode: kotlin.String? = null): Call<ResultModel>

    /**
     * Генерирует новый пароль для Участника ПЛ и отправляет по Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personID Внутренний идентификатор Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/SendNewPasswordToEmail")
    fun callCenterSendNewPasswordToEmail(@Query("personID") personID: kotlin.Int? = null): Call<ResultModel>

    /**
     * Генерирует новый пароль для Участника ПЛ и отправляет в SMS-сообщении.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personID Внутренний идентификатор Участника ПЛ. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/SendNewPasswordToPhone")
    fun callCenterSendNewPasswordToPhone(@Query("personID") personID: kotlin.Int? = null): Call<ResultModel>

    /**
     * Разблокирует счет.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор Участника ПЛ. (optional)
     * @param comment Комментарий. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/UnBlockAccount")
    fun callCenterUnBlockAccount(@Query("personId") personId: kotlin.Int? = null, @Query("comment") comment: kotlin.String? = null): Call<ResultModel>

    /**
     * Разблокирует карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param unBlockCardModel Модель для разблокировки карты Участника ПЛ.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/UnBlockCard")
    fun callCenterUnBlockCard(@Query("unBlockCardModel") unBlockCardModel: UnBlockCardModel): Call<ResultModel>

    /**
     * Обновляет подписки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор Участника ПЛ. (optional)
     * @param values Подписки. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/CallCenter/UpdateSubscriptions")
    fun callCenterUpdateSubscriptions(@Query("personId") personId: kotlin.Int? = null, @Query("values") values: kotlin.collections.MutableList<SubscriptionViewModel>? = null): Call<ResultModel>

}

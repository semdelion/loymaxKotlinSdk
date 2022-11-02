package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PasswordService {
    /**
     * Обновляет пароль клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param oldPassword Старый пароль. (optional)
     * @param newPassword Новый пароль. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @POST("v1.2/User/Password/Change")
    fun passwordChange(@Query("oldPassword") oldPassword: kotlin.String? = null, @Query("newPassword") newPassword: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

    /**
     * Возвращает список пакетных загрузок паролей.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state Состояние пакетной загрузки.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadModel]>
     */
    @GET("v1.2/User/Password/BatchUpload")
    fun passwordGetBatches(@Query("state") state: BatchState, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadModel>

    /**
     * Возвращает список операций пакетной загрузки паролей.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор пакетной загрузки паролей.
     * @param state Состояние операции (Completed — завершена, Created — создана, Error — ошибка).
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadDataModel]>
     */
    @GET("v1.2/User/Password/BatchUpload/{id}/operations")
    fun passwordGetOperations(@Path("id") id: kotlin.Int, @Query("state") state: DeferredOperationState, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadDataModel>

    /**
     * Отменяет процесс восстановления пароля.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notifierIdentity Нотификатор (номер телефона/email). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/ResetPassword/Cancel")
    fun passwordResetCancel(@Query("notifierIdentity") notifierIdentity: kotlin.String? = null): Call<ResultModel>

    /**
     * Отправляет введенный код подтверждения для восстановления пароля.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notifierIdentity Нотификатор (номер телефона/email). (optional)
     * @param confirmCode Код подтверждения. (optional)
     * @param newPassword Новый пароль. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @POST("v1.2/ResetPassword/Confirm")
    fun passwordResetConfirm(@Query("notifierIdentity") notifierIdentity: kotlin.String? = null, @Query("confirmCode") confirmCode: kotlin.String? = null, @Query("newPassword") newPassword: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

    /**
     * Возвращает список нотификаторов клиента, на которые возможна отправка кода подтверждения для восстановления пароля.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param identifier Идентификатор пользователя. (optional)
     * @return [Call]<[ResultModelOfResetPasswordInfoModel]>
     */
    @POST("v1.2/ResetPassword")
    fun passwordResetInfo(@Query("identifier") identifier: kotlin.String? = null): Call<ResultModelOfResetPasswordInfoModel>

    /**
     * Запускает восстановление пароля.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notifierIdentity Нотификатор (номер телефона/email). (optional)
     * @return [Call]<[ResultModelOfConfirmCodeResultModel]>
     */
    @POST("v1.2/ResetPassword/Start")
    fun passwordResetStart(@Query("notifierIdentity") notifierIdentity: kotlin.String? = null): Call<ResultModelOfConfirmCodeResultModel>

    /**
     * Возвращает пароль на чеке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardNumber Номер карты клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Password/Send")
    fun passwordSendPassword(@Query("cardNumber") cardNumber: kotlin.String): Call<ResultModel>

    /**
     * Устанавливает пароль клиенту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param password Пароль. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @POST("v1.2/User/Password/Set")
    fun passwordSet(@Query("password") password: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

}

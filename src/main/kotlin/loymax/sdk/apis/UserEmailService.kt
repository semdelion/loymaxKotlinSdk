package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserEmailService {
    /**
     * Отменяет процесс изменения Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Email/CancelChange")
    fun userEmailChangeEmailCancel(): Call<ResultModel>

    /**
     * Возвращает текущий статус Email клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfUserEmailInfo]>
     */
    @GET("v1.2/User/Email")
    fun userEmailGetEmail(): Call<ResultModelOfUserEmailInfo>

    /**
     * Оформляет подтверждение нового Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param model Ввод параметров подтверждения нового Email.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Email/LinkConfirm")
    fun userEmailPostEmailConfirm(@Query("model") model: NewEmailConfirmModel): Call<ResultModel>

    /**
     * Завершает процесс изменения Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param confirmCode Код подтверждения. (optional)
     * @param password Пароль. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Email/Confirm")
    fun userEmailPostEmailConfirmCode(@Query("confirmCode") confirmCode: kotlin.String? = null, @Query("password") password: kotlin.String? = null): Call<ResultModel>

    /**
     * Верифицирует Email клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notifierValue Значение нотификатора. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Email/Verify")
    fun userEmailPostVerifyEmail(@Query("notifierValue") notifierValue: kotlin.String? = null): Call<ResultModel>

    /**
     * Оформляет повторную отправку кода подтверждения при изменении Email.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/Email/SendConfirmCode")
    fun userEmailSendEmailConfirmCode(): Call<ResultModel>

}

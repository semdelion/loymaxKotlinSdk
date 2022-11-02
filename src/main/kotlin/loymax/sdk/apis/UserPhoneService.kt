package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserPhoneService {
    /**
     * Отменяет процесс привязки номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/PhoneNumber/CancelChange")
    fun userPhoneChangePhoneCancel(): Call<ResultModel>

    /**
     * Возвращает информацию о номере телефона клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfUserPhoneNumberInfo]>
     */
    @GET("v1.2/User/PhoneNumber")
    fun userPhoneGetPhone(): Call<ResultModelOfUserPhoneNumberInfo>

    /**
     * Завершает процесс привязки номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param confirmCode Код подтверждения. (optional)
     * @param password Пароль. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @POST("v1.2/User/PhoneNumber/Confirm")
    fun userPhonePostPhoneConfirmCode(@Query("confirmCode") confirmCode: kotlin.String? = null, @Query("password") password: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

    /**
     * Повторно отправляет код подтверждения на новый номер телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/User/PhoneNumber/SendConfirmCode")
    fun userPhoneSendPhoneConfirmCode(): Call<ResultModel>

}

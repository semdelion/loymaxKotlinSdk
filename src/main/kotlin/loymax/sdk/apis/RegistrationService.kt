package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface RegistrationService {
    /**
     * Пакетное подтверждение регистрации клиентов.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param description Описание пакетной загрузки.
     * @param file file to upload
     * @param setRandomPasswords Устанавливать сгенерированные пароли клиентам без паролей. (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @PUT("v1.2/Registration/BatchRegistrationConfirm")
    fun registrationBatchRegistrationConfirm(@Query("description") description: kotlin.String, @Query("file") file: java.io.File, @Query("setRandomPasswords") setRandomPasswords: kotlin.Boolean? = null): Call<ResultModelOfInt32>

    /**
     * Загрузки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param batchUploadFilterModelState  (optional)
     * @param batchUploadFilterModelIncludeDeleted  (optional)
     * @param batchUploadFilterModelFromDate  (optional)
     * @param batchUploadFilterModelToDate  (optional)
     * @param batchUploadFilterModelAuthorId  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchUploadModel]>
     */
    @GET("v1.2/Registration")
    fun registrationGetConfirmRegistrationBatch(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("batchUploadFilterModel.state") batchUploadFilterModelState: BatchState? = null, @Query("batchUploadFilterModel.includeDeleted") batchUploadFilterModelIncludeDeleted: kotlin.Boolean? = null, @Query("batchUploadFilterModel.fromDate") batchUploadFilterModelFromDate: kotlin.String? = null, @Query("batchUploadFilterModel.toDate") batchUploadFilterModelToDate: kotlin.String? = null, @Query("batchUploadFilterModel.authorId") batchUploadFilterModelAuthorId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBatchUploadModel>

    /**
     * Запускает регистрацию клиента по номеру карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param login Логин. (optional)
     * @param password Пароль. (optional)
     * @param withoutCall Регистрация начата без звонка. (optional)
     * @param cvcCode CVC-код. (optional)
     * @return [Call]<[ResultModelOfRegistrationResult]>
     */
    @POST("v1.2/Registration/BeginRegistration")
    fun registrationPostBeginRegistration(@Query("login") login: kotlin.String? = null, @Query("password") password: kotlin.String? = null, @Query("withoutCall") withoutCall: kotlin.Boolean? = null, @Query("cvcCode") cvcCode: kotlin.String? = null): Call<ResultModelOfRegistrationResult>

    /**
     * Завершает процесс регистрации клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfFinishRegistrationResultModel]>
     */
    @POST("v1.2/Registration/TryFinishRegistration")
    fun registrationPostTryFinishRegistration(): Call<ResultModelOfFinishRegistrationResultModel>

    /**
     * Запускает анонимную регистрацию клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userIdentifier Внешний идентификатор клиента. (optional)
     * @param password Пароль. (optional)
     * @return [Call]<[ResultModelOfAnonymousRegistrationResult]>
     */
    @POST("v1.2/Registration/RegisterAnonym")
    fun registrationRegisterAnonymous(@Query("userIdentifier") userIdentifier: java.util.UUID? = null, @Query("password") password: kotlin.String? = null): Call<ResultModelOfAnonymousRegistrationResult>

    /**
     * Завершает процесс регистрации клиента (через КЦ).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента. (optional)
     * @return [Call]<[ResultModelOfFinishRegistrationResult]>
     */
    @POST("v1.2/Registration/TryFinishRegistrationCustomer")
    fun registrationTryFinishRegistration(@Query("personId") personId: kotlin.Int? = null): Call<ResultModelOfFinishRegistrationResult>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PasswordRequirementsService {
    /**
     * Возвращает список требований к паролям.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPasswordRuleViewModel]>
     */
    @GET("v1.2/Password/Requirements/Settings")
    fun passwordRequirementsGetAll(): Call<ResultModelOfListOfPasswordRuleViewModel>

    /**
     * Получить список активных правил проверок пароля.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPasswordRequirementViewModel]>
     */
    @GET("v1.2/Password/Requirements")
    fun passwordRequirementsGetAllActiveRules(): Call<ResultModelOfListOfPasswordRequirementViewModel>

}

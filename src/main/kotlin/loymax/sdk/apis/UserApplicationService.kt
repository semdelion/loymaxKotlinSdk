package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserApplicationService {
    /**
     * Возвращает список OAuth-приложений клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfUserApplicationViewModel]>
     */
    @GET("v1.2/Applications")
    fun userApplicationGetApplications(): Call<ResultModelOfListOfUserApplicationViewModel>

    /**
     * Удаляет OAuth-приложение клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userApplicationId Внутренний идентификатор OAuth-приложения.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/Applications/{userApplicationId}")
    fun userApplicationRemove(@Path("userApplicationId") userApplicationId: kotlin.Int): Call<ResultModel>

}

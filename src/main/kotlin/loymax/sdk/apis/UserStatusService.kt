package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserStatusService {
    /**
     * Возвращает информацию о статусной системе и статусе клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfSystemApiPersonStatusViewModel]>
     */
    @GET("v1.2/users/{personId}/status")
    fun userStatusGetStatusInfo(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfSystemApiPersonStatusViewModel>

    /**
     * Возвращает клиенту подробную информацию о его статусах в статусных системах.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки (где 0–последняя созданная статусная система). Если не заполнять, возвращает все статусные системы. (optional)
     * @param count Количество возвращаемых элементов выборки. Если не заполнять, возвращает все статусные системы. (optional)
     * @return [Call]<[ResultModelOfListOfPersonStatusViewModel]>
     */
    @GET("v1.2/user/status")
    fun userStatusGetStatusesInfo(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfListOfPersonStatusViewModel>

    /**
     * Возвращает клиенту информацию о статусе по логическому имени статусной системы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя статусной системы.
     * @return [Call]<[ResultModelOfPersonStatusViewModel]>
     */
    @GET("v1.2/users/status/{logicalName}")
    fun userStatusGetUsersStatusByLogicalName(@Path("logicalName") logicalName: kotlin.String): Call<ResultModelOfPersonStatusViewModel>

}

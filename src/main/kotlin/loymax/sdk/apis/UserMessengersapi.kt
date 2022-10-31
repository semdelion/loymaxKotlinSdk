package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfUserMessengersViewModel

interface UserMessengersapi {
    /**
     * Возвращает информацию о мессенджерах клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfUserMessengersViewModel]>
     */
    @GET("v1.2/users/{personId}/messengers")
    fun userMessengersGet(@Path("personId") personId: kotlin.Int): Call<ResultModelOfUserMessengersViewModel>

}

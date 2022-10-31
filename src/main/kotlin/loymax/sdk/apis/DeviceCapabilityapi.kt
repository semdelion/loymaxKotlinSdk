package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfDeviceCapabilityViewModel

interface DeviceCapabilityapi {
    /**
     * Возвращает информацию о всех настройках кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deviceTypeId Внутренний идентификатор типа кассы.
     * @return [Call]<[ResultModelOfListOfDeviceCapabilityViewModel]>
     */
    @GET("v1.2/DeviceCapabilities/{deviceTypeId}")
    fun deviceCapabilityGetAll(@Path("deviceTypeId") deviceTypeId: kotlin.Int): Call<ResultModelOfListOfDeviceCapabilityViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PushableDeviceService {
    /**
     * Список всех push-устройств клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param searchOption Параметр поиска пуш-устройств. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPushableDeviceViewModel]>
     */
    @GET("v1.2/users/{personId}/PushableDevices")
    fun pushableDeviceGetPushDevices(@Path("personId") personId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("searchOption") searchOption: PushableDeviceSearchOption? = null): Call<ResultModelOfPagedViewModelOfPushableDeviceViewModel>

}

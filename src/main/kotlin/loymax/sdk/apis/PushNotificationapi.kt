package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.PushNotificationStateModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfDeviceInfoModel
import loymax.sdk.models.ResultModelOfNotificationDetailsViewModel

interface PushNotificationapi {
    /**
     * Возвращает данные оповещения по идентификатору сообщения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param messageId Идентификатор Push сообщения.
     * @return [Call]<[ResultModelOfNotificationDetailsViewModel]>
     */
    @GET("v1.2/Pushes/{messageId}")
    fun pushNotificationGetDetails(@Path("messageId") messageId: kotlin.Long): Call<ResultModelOfNotificationDetailsViewModel>

    /**
     * Получить  информацию о текущем устройстве.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceInfoModel]>
     */
    @GET("v1.2/Pushes")
    fun pushNotificationGetDeviceInfo(): Call<ResultModelOfDeviceInfoModel>

    /**
     * Установить статус Push сообщения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param messageId Идентификатор Push-уведомления.
     * @param state  (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Pushes/{messageId}/state")
    fun pushNotificationSetState(@Path("messageId") messageId: kotlin.Long, @Query("state") state: PushNotificationState? = null): Call<ResultModel>

}

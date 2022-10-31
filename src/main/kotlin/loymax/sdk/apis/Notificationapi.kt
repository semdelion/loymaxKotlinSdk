package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfNotificationViewModel
import loymax.sdk.models.ResultModelOfNotificationsCountViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfNotificationViewModel

interface Notificationapi {
    /**
     * Удалить оповещение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notificationId Внутренний идентификатор оповещения (Id).
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/Notification/{notificationId}")
    fun notificationDelete(@Path("notificationId") notificationId: kotlin.Long): Call<ResultModel>

    /**
     * Получить количество оповещений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfNotificationsCountViewModel]>
     */
    @GET("v1.2/Notification/Count")
    fun notificationGetCount(): Call<ResultModelOfNotificationsCountViewModel>

    /**
     * Получение списка оповещений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер элемента, с которого должна начинаться выборка. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfNotificationViewModel]>
     */
    @GET("v1.2/Notification")
    fun notificationGetNotifications(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfNotificationViewModel>

    /**
     * Отметить оповещение как прочитанное.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notificationId Внутренний идентификатор оповещения (Id).
     * @return [Call]<[ResultModelOfNotificationViewModel]>
     */
    @POST("v1.2/Notification/{notificationId}/Read")
    fun notificationRead(@Path("notificationId") notificationId: kotlin.Long): Call<ResultModelOfNotificationViewModel>

    /**
     * Пометить все оповещения прочитанными.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfInt32]>
     */
    @POST("v1.2/Notification/Read")
    fun notificationReadAll(): Call<ResultModelOfInt32>

}

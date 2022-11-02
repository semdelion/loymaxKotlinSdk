package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface SubscriptionTypeService {
    /**
     * Возвращает тип подписки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Индификатор типа подписки.
     * @return [Call]<[ResultModelOfSystemApiSubscriptionTypeViewModel]>
     */
    @GET("v1.2/SubscriptionTypes/{id}")
    fun subscriptionTypeGet(@Path("id") id: kotlin.Int): Call<ResultModelOfSystemApiSubscriptionTypeViewModel>

    /**
     * Возвращает список всех типов подписок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterSubscriptionType Тип подписки. (optional)
     * @param filterNotificationGatewayType Тип канала. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel]>
     */
    @GET("v1.2/SubscriptionTypes")
    fun subscriptionTypeGetAll(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.subscriptionType") filterSubscriptionType: MailingSubscriptionType? = null, @Query("filter.notificationGatewayType") filterNotificationGatewayType: NotificationGatewayType? = null): Call<ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel>

    /**
     * Возвращает список доступных типов подписки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfMailingSubscriptionType]>
     */
    @GET("v1.2/SubscriptionTypes/availableSubscriptionTypes")
    fun subscriptionTypeGetAvailableSubscriptionTypes(): Call<ResultModelOfListOfMailingSubscriptionType>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.NotificationMessageState
import loymax.sdk.models.NotifyType
import loymax.sdk.models.PlatformType
import loymax.sdk.models.ResultModelOfChatBotMessageViewModel
import loymax.sdk.models.ResultModelOfListOfString
import loymax.sdk.models.ResultModelOfMailMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfChatBotMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfMailMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfPushMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfSmsMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfViberMessageViewModel
import loymax.sdk.models.ResultModelOfPushMessageViewModel
import loymax.sdk.models.ResultModelOfSmsMessageViewModel
import loymax.sdk.models.ResultModelOfSocialNetworksMessageViewModel
import loymax.sdk.models.ResultModelOfViberMessageViewModel

interface Messageapi {
    /**
     * Получает chatBot сообщение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param chatBotId Идентификатор.
     * @return [Call]<[ResultModelOfChatBotMessageViewModel]>
     */
    @GET("v1.2/messages/chatBot/{chatBotId}")
    fun messageGetChatBotMessage(@Path("chatBotId") chatBotId: kotlin.Long): Call<ResultModelOfChatBotMessageViewModel>

    /**
     * Получает список chatbot сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfChatBotMessageViewModel]>
     */
    @GET("v1.2/messages/chatBot")
    fun messageGetChatBotMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.phone") filterPhone: kotlin.String? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfChatBotMessageViewModel>

    /**
     * Получает информацию о mail сообщении.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param mailId Идентификатор mail сообщения.
     * @return [Call]<[ResultModelOfMailMessageViewModel]>
     */
    @GET("v1.2/messages/mail/{mailId}")
    fun messageGetMailMessage(@Path("mailId") mailId: kotlin.Long): Call<ResultModelOfMailMessageViewModel>

    /**
     * Получает список отправленных mail сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterToEmail  (optional)
     * @param filterHeader  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMailMessageViewModel]>
     */
    @GET("v1.2/messages/mail")
    fun messageGetMailMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.toEmail") filterToEmail: kotlin.String? = null, @Query("filter.header") filterHeader: kotlin.String? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfMailMessageViewModel>

    /**
     * Получает нотификаторы из сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param messagesNotifiersFilterPersonUid Гуид пользователя. (optional)
     * @param messagesNotifiersFilterNotifyType Тип нотификатора. (optional)
     * @param messagesNotifiersFilterSubstring Подстрока для поиска. (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/messages/notifiers")
    fun messageGetMessagesNotifiers(@Query("messagesNotifiersFilter.personUid") messagesNotifiersFilterPersonUid: kotlin.String? = null, @Query("messagesNotifiersFilter.notifyType") messagesNotifiersFilterNotifyType: NotifyType? = null, @Query("messagesNotifiersFilter.substring") messagesNotifiersFilterSubstring: kotlin.String? = null): Call<ResultModelOfListOfString>

    /**
     * Получает push сообщение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param pushId Идентификатор.
     * @return [Call]<[ResultModelOfPushMessageViewModel]>
     */
    @GET("v1.2/messages/push/{pushId}")
    fun messageGetPushMessage(@Path("pushId") pushId: kotlin.Long): Call<ResultModelOfPushMessageViewModel>

    /**
     * Получает список push сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPlatformType  (optional)
     * @param filterState  (optional)
     * @param filterHeader  (optional)
     * @param filterPersonUid  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPushMessageViewModel]>
     */
    @GET("v1.2/messages/push")
    fun messageGetPushMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.platformType") filterPlatformType: kotlin.collections.MutableList<PlatformType>? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null, @Query("filter.header") filterHeader: kotlin.String? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfPushMessageViewModel>

    /**
     * Получает информацию о sms сообщении.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param smsId Идентификатор sms сообщения.
     * @return [Call]<[ResultModelOfSmsMessageViewModel]>
     */
    @GET("v1.2/messages/sms/{smsId}")
    fun messageGetSmsMessage(@Path("smsId") smsId: kotlin.Long): Call<ResultModelOfSmsMessageViewModel>

    /**
     * Получает список отправленных смс сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterPersonUid  (optional)
     * @param filterState  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSmsMessageViewModel]>
     */
    @GET("v1.2/messages/sms")
    fun messageGetSmsMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.phone") filterPhone: kotlin.String? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null): Call<ResultModelOfPagedViewModelOfSmsMessageViewModel>

    /**
     * Получает socialNetwork сообщение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param socialNetworksId Идентификатор.
     * @return [Call]<[ResultModelOfSocialNetworksMessageViewModel]>
     */
    @GET("v1.2/messages/socialNetworks/{socialNetworksId}")
    fun messageGetSocialNetworksMessage(@Path("socialNetworksId") socialNetworksId: kotlin.Long): Call<ResultModelOfSocialNetworksMessageViewModel>

    /**
     * Получает список socialNetworks сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel]>
     */
    @GET("v1.2/messages/socialNetworks")
    fun messageGetSocialNetworksMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.phone") filterPhone: kotlin.String? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel>

    /**
     * Получает viber сообщение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param viberId Идентификатор.
     * @return [Call]<[ResultModelOfViberMessageViewModel]>
     */
    @GET("v1.2/messages/viber/{viberId}")
    fun messageGetViberMessage(@Path("viberId") viberId: kotlin.Long): Call<ResultModelOfViberMessageViewModel>

    /**
     * Получает список viber сообщений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfViberMessageViewModel]>
     */
    @GET("v1.2/messages/viber")
    fun messageGetViberMessages(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.phone") filterPhone: kotlin.String? = null, @Query("filter.state") filterState: kotlin.collections.MutableList<NotificationMessageState>? = null, @Query("filter.personUid") filterPersonUid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfViberMessageViewModel>

}

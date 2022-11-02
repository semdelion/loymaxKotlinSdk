package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface NotifyTemplateService {
    /**
     * Возвращает список доступных типов подписки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfMailingSubscriptionType]>
     */
    @GET("v1.2/notifyTemplates/availableSubscriptionTypes")
    fun notifyTemplateGetAvailableSubscriptionTypes(): Call<ResultModelOfListOfMailingSubscriptionType>

    /**
     * Возвращает шаблон уведомлений по его ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id ID шаблона уведомлений.
     * @return [Call]<[ResultModelOfNotifyTemplateViewModel]>
     */
    @GET("v1.2/notifyTemplates/{id}")
    fun notifyTemplateGetNotifyTemplate(@Path("id") id: kotlin.Int): Call<ResultModelOfNotifyTemplateViewModel>

    /**
     * Возвращает список шаблонов уведомлений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param requestModelFrom С какого. (optional)
     * @param requestModelCount Сколько. (optional)
     * @param requestModelTemplateType Тип шаблона уведомлений. (optional)
     * @param requestModelLogicalNameSubStr Подстрока логического имени шаблона. (optional)
     * @param requestModelTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param requestModelSubscriptionType Тип подписки. (optional)
     * @param requestModelShowMode Режим отображения архивных шаблонов. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfNotifyTemplateViewModel]>
     */
    @GET("v1.2/notifyTemplates")
    fun notifyTemplateGetNotifyTemplates(@Query("requestModel.from") requestModelFrom: kotlin.Int? = null, @Query("requestModel.count") requestModelCount: kotlin.Int? = null, @Query("requestModel.templateType") requestModelTemplateType: TemplateType? = null, @Query("requestModel.logicalNameSubStr") requestModelLogicalNameSubStr: kotlin.String? = null, @Query("requestModel.textSubStr") requestModelTextSubStr: kotlin.String? = null, @Query("requestModel.subscriptionType") requestModelSubscriptionType: MailingSubscriptionType? = null, @Query("requestModel.showMode") requestModelShowMode: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfNotifyTemplateViewModel>

    /**
     * Восстановление удаленного шаблона уведомлений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id ID шаблона уведомлений.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/notifyTemplates/{id}/restore")
    fun notifyTemplateRestoreNotifyTemplate(@Path("id") id: kotlin.Int): Call<ResultModel>

}

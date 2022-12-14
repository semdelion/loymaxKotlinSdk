/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package loymax.sdk.models

import loymax.sdk.models.LegalViewModel
import loymax.sdk.models.LoyaltyProgramInfoViewModel
import loymax.sdk.models.MailingDestinationType
import loymax.sdk.models.MailingGatewayViewModel
import loymax.sdk.models.MailingMessageViewModel
import loymax.sdk.models.MailingWaySendType
import loymax.sdk.models.MarketingCampaignSimpleViewModel
import loymax.sdk.models.PushMessageType

import com.squareup.moshi.Json

/**
 * Модель для рассылки.
 *
 * @param id Идентификатор рассылки.
 * @param name Название рассылки.
 * @param gateway 
 * @param legal 
 * @param mailingTypeId Тип рассылки (моментальная или плановая).
 * @param targetGroupIds Список целевых аудиторий.
 * @param destinationType 
 * @param isAbleToStart Возможно ли начать рассылку.
 * @param isAbleToEdit Возможно ли редактировать рассылку.
 * @param waySendType 
 * @param creator Автор рассылки.
 * @param creationDate Дата создания рассылки.
 * @param lastChangeUser Автор последних изменений.
 * @param changeDate Дата изменения.
 * @param messageType 
 * @param mailingMessage 
 * @param priceOneMessage Стоимость одного сообщения.
 * @param usersCount Количество пользователей.
 * @param marketingCampaign 
 * @param loyaltyProgram 
 * @param includeUnverifiedNotifiers Возможна ли отправка на неверифицированный нотификатор или нет.
 */

data class MailingViewModel (

    /* Идентификатор рассылки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название рассылки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "gateway")
    var gateway: MailingGatewayViewModel? = null,

    @Json(name = "legal")
    var legal: LegalViewModel? = null,

    /* Тип рассылки (моментальная или плановая). */
    @Json(name = "mailingTypeId")
    var mailingTypeId: kotlin.Int? = null,

    /* Список целевых аудиторий. */
    @Json(name = "targetGroupIds")
    var targetGroupIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    @Json(name = "destinationType")
    var destinationType: MailingDestinationType? = null,

    /* Возможно ли начать рассылку. */
    @Json(name = "isAbleToStart")
    var isAbleToStart: kotlin.Boolean? = null,

    /* Возможно ли редактировать рассылку. */
    @Json(name = "isAbleToEdit")
    var isAbleToEdit: kotlin.Boolean? = null,

    @Json(name = "waySendType")
    var waySendType: MailingWaySendType? = null,

    /* Автор рассылки. */
    @Json(name = "creator")
    var creator: kotlin.String? = null,

    /* Дата создания рассылки. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Автор последних изменений. */
    @Json(name = "lastChangeUser")
    var lastChangeUser: kotlin.String? = null,

    /* Дата изменения. */
    @Json(name = "changeDate")
    var changeDate: java.time.OffsetDateTime? = null,

    @Json(name = "messageType")
    var messageType: PushMessageType? = null,

    @Json(name = "mailingMessage")
    var mailingMessage: MailingMessageViewModel? = null,

    /* Стоимость одного сообщения. */
    @Json(name = "priceOneMessage")
    var priceOneMessage: kotlin.Double? = null,

    /* Количество пользователей. */
    @Json(name = "usersCount")
    var usersCount: kotlin.Int? = null,

    @Json(name = "marketingCampaign")
    var marketingCampaign: MarketingCampaignSimpleViewModel? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramInfoViewModel? = null,

    /* Возможна ли отправка на неверифицированный нотификатор или нет. */
    @Json(name = "includeUnverifiedNotifiers")
    var includeUnverifiedNotifiers: kotlin.Boolean? = null

)


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

import loymax.sdk.models.MailingSubscriptionType
import loymax.sdk.models.MailingTimeLimitType
import loymax.sdk.models.TimeUnitsLimit

import com.squareup.moshi.Json

/**
 * ViewModel для типа подписки.
 *
 * @param id Id типа подписки.
 * @param name Название типа подписки.
 * @param type 
 * @param smsEnable Оповещение по Sms.
 * @param emailEnable Оповещение по Email.
 * @param pushEnable Оповещение по Email.
 * @param viberEnable Оповещение по Viber.
 * @param socialNetworksEnable Оповещение по SocialNetworks.
 * @param timeLimitType 
 * @param chatBotEnable Оповещение по ChatBot.
 * @param lifeTime Время жизни рассылки.
 * @param timeUnit 
 */

data class SubscriptionTypeViewModel (

    /* Id типа подписки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название типа подписки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "type")
    var type: MailingSubscriptionType? = null,

    /* Оповещение по Sms. */
    @Json(name = "smsEnable")
    var smsEnable: kotlin.Boolean? = null,

    /* Оповещение по Email. */
    @Json(name = "emailEnable")
    var emailEnable: kotlin.Boolean? = null,

    /* Оповещение по Email. */
    @Json(name = "pushEnable")
    var pushEnable: kotlin.Boolean? = null,

    /* Оповещение по Viber. */
    @Json(name = "viberEnable")
    var viberEnable: kotlin.Boolean? = null,

    /* Оповещение по SocialNetworks. */
    @Json(name = "socialNetworksEnable")
    var socialNetworksEnable: kotlin.Boolean? = null,

    @Json(name = "timeLimitType")
    var timeLimitType: MailingTimeLimitType? = null,

    /* Оповещение по ChatBot. */
    @Json(name = "chatBotEnable")
    var chatBotEnable: kotlin.Boolean? = null,

    /* Время жизни рассылки. */
    @Json(name = "lifeTime")
    var lifeTime: kotlin.Int? = null,

    @Json(name = "timeUnit")
    var timeUnit: TimeUnitsLimit? = null

)


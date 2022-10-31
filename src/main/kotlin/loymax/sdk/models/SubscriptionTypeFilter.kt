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
import loymax.sdk.models.NotificationGatewayType

import com.squareup.moshi.Json

/**
 * Фильтр типов подписок.
 *
 * @param searchedText Текст поиска.
 * @param subscriptionType 
 * @param notificationGatewayType 
 */

data class SubscriptionTypeFilter (

    /* Текст поиска. */
    @Json(name = "searchedText")
    var searchedText: kotlin.String? = null,

    @Json(name = "subscriptionType")
    var subscriptionType: MailingSubscriptionType? = null,

    @Json(name = "notificationGatewayType")
    var notificationGatewayType: NotificationGatewayType? = null

)

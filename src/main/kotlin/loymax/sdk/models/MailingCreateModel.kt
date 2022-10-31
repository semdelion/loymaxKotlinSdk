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

import loymax.sdk.models.MailingWaySendType

import com.squareup.moshi.Json

/**
 * Модель создания рассылки.
 *
 * @param legalId Идентификатор юр.лица.
 * @param name Название рассылки.
 * @param waySendType 
 * @param loyaltyProgramId Программа лояльности.
 * @param marketingCampaignId Идентификатор маркетинговой компании.
 */

data class MailingCreateModel (

    /* Идентификатор юр.лица. */
    @Json(name = "legalId")
    var legalId: kotlin.Int? = null,

    /* Название рассылки. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "waySendType")
    var waySendType: MailingWaySendType? = null,

    /* Программа лояльности. */
    @Json(name = "loyaltyProgramId")
    var loyaltyProgramId: kotlin.Int? = null,

    /* Идентификатор маркетинговой компании. */
    @Json(name = "marketingCampaignId")
    var marketingCampaignId: kotlin.Int? = null

)


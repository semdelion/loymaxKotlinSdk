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

import loymax.sdk.models.LoyaltyProgramInfoViewModel
import loymax.sdk.models.MarketingCampaignViewModel
import loymax.sdk.models.OfferCategoryViewModel
import loymax.sdk.models.OfferState
import loymax.sdk.models.PartnerModel

import com.squareup.moshi.Json

/**
 * Модель с информацией об акции.
 *
 * @param name Название.
 * @param beginTime Дата начала.
 * @param description Описание.
 * @param isSum Суммируемая.
 * @param priority Приоритет.
 * @param partner 
 * @param creationDate Дата создания.
 * @param lastChangeDate Дата последнего изменения.
 * @param creator Создатель.
 * @param lastChangeUser Автор последних изменений.
 * @param externalID Внешний ID.
 * @param applyChangesDate Дата подтверждения.
 * @param expirationDate Дата завершения.
 * @param state 
 * @param offerCategory 
 * @param marketingCampaign 
 * @param loyaltyProgram 
 */

data class OfferInfoModel (

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Дата начала. */
    @Json(name = "beginTime")
    var beginTime: java.time.OffsetDateTime? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Суммируемая. */
    @Json(name = "isSum")
    var isSum: kotlin.Boolean? = null,

    /* Приоритет. */
    @Json(name = "priority")
    var priority: kotlin.Int? = null,

    @Json(name = "partner")
    var partner: PartnerModel? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Дата последнего изменения. */
    @Json(name = "lastChangeDate")
    var lastChangeDate: java.time.OffsetDateTime? = null,

    /* Создатель. */
    @Json(name = "creator")
    var creator: kotlin.String? = null,

    /* Автор последних изменений. */
    @Json(name = "lastChangeUser")
    var lastChangeUser: kotlin.String? = null,

    /* Внешний ID. */
    @Json(name = "externalID")
    var externalID: kotlin.String? = null,

    /* Дата подтверждения. */
    @Json(name = "applyChangesDate")
    var applyChangesDate: java.time.OffsetDateTime? = null,

    /* Дата завершения. */
    @Json(name = "expirationDate")
    var expirationDate: java.time.OffsetDateTime? = null,

    @Json(name = "state")
    var state: OfferState? = null,

    @Json(name = "offerCategory")
    var offerCategory: OfferCategoryViewModel? = null,

    @Json(name = "marketingCampaign")
    var marketingCampaign: MarketingCampaignViewModel? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramInfoViewModel? = null

)

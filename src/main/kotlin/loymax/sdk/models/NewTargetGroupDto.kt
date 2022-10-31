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

import loymax.sdk.models.IdentifiersDto
import loymax.sdk.models.LoyaltyProgramDto
import loymax.sdk.models.PartnerDto

import com.squareup.moshi.Json

/**
 * Новая целевая аудитория.
 *
 * @param name Название.
 * @param description Описание.
 * @param partner 
 * @param loyaltyProgram 
 * @param identifiers 
 */

data class NewTargetGroupDto (

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "partner")
    var partner: PartnerDto? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramDto? = null,

    @Json(name = "identifiers")
    var identifiers: IdentifiersDto? = null

)


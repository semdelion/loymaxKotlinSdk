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

import loymax.sdk.models.PartnerLoyaltyProgramModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param externalId 
 * @param name 
 * @param canEdit 
 * @param loyaltyPrograms 
 * @param legalName 
 */

data class PartnerModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "externalId")
    var externalId: java.util.UUID? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "canEdit")
    var canEdit: kotlin.Boolean? = null,

    @Json(name = "loyaltyPrograms")
    var loyaltyPrograms: kotlin.collections.MutableList<PartnerLoyaltyProgramModel>? = null,

    @Json(name = "legalName")
    var legalName: kotlin.String? = null

)


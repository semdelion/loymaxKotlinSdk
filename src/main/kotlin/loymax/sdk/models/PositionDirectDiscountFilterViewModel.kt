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

import loymax.sdk.models.OfferInfoShortViewModel

import com.squareup.moshi.Json

/**
 * View-модель фильтра \"Наличие прямой скидки\".
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param offer 
 */

data class PositionDirectDiscountFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    @Json(name = "offer")
    var offer: OfferInfoShortViewModel? = null

)


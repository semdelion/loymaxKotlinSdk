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

import loymax.sdk.models.PartnerDto

import com.squareup.moshi.Json

/**
 * Партнеры, к которым относится акция.
 *
 * @param partners Коллекция партнеров.
 */

data class OfferPartners (

    /* Коллекция партнеров. */
    @Json(name = "partners")
    var partners: kotlin.collections.MutableList<PartnerDto>? = null

)


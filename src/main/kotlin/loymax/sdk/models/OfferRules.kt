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

import loymax.sdk.models.OfferEventDto

import com.squareup.moshi.Json

/**
 * Правила обработки событий для акции.
 *
 * @param events События.
 */

data class OfferRules (

    /* События. */
    @Json(name = "events")
    var events: kotlin.collections.MutableList<OfferEventDto>? = null

)


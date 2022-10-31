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

import loymax.sdk.models.OfferActionsChainDto

import com.squareup.moshi.Json

/**
 * Событие \"Активация карты\" для акции.
 *
 * @param chains Цепочки действий для обработки события.
 */

data class CardActivationEventDto (

    /* Цепочки действий для обработки события. */
    @Json(name = "chains")
    var chains: kotlin.collections.MutableList<OfferActionsChainDto>? = null

)


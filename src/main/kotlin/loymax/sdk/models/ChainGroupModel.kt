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

import loymax.sdk.models.ChainModel
import loymax.sdk.models.OfferEventType

import com.squareup.moshi.Json

/**
 * Фильтр для списка счетов кассы.
 *
 * @param actionId Действие, на которое завязана цепочка.
 * @param eventType 
 * @param chains Цепочки действий.
 */

data class ChainGroupModel (

    /* Действие, на которое завязана цепочка. */
    @Json(name = "actionId")
    var actionId: kotlin.Int? = null,

    @Json(name = "eventType")
    var eventType: OfferEventType? = null,

    /* Цепочки действий. */
    @Json(name = "chains")
    var chains: kotlin.collections.MutableList<ChainModel>? = null

)


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

import loymax.sdk.models.ActionDto
import loymax.sdk.models.FilterDto

import com.squareup.moshi.Json

/**
 * Цепочка действий акции.
 *
 * @param filters Фильтры цепочки.
 * @param actions Действия.
 * @param order Порядковый номер цепочки.
 * @param name Название цепочки.
 */

data class OfferActionsChainDto (

    /* Фильтры цепочки. */
    @Json(name = "filters")
    var filters: kotlin.collections.MutableList<FilterDto>? = null,

    /* Действия. */
    @Json(name = "actions")
    var actions: kotlin.collections.MutableList<ActionDto>? = null,

    /* Порядковый номер цепочки. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Название цепочки. */
    @Json(name = "name")
    var name: kotlin.String? = null

)


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

import loymax.sdk.models.ActionModel
import loymax.sdk.models.FilterModel
import loymax.sdk.models.PositionModel

import com.squareup.moshi.Json

/**
 * Фильтр для списка счетов кассы.
 *
 * @param id Идентификатор.
 * @param name Наименование.
 * @param `break` Не выполнено, так как контекст пуст, или ещё чего.
 * @param positions Пришедшие позиции.
 * @param filters Фильтры.
 * @param actions Список действий.
 * @param calculationDuration Длительность расчета в миллисекундах.
 */

data class ChainModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Наименование. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Не выполнено, так как контекст пуст, или ещё чего. */
    @Json(name = "break")
    var `break`: kotlin.Boolean? = null,

    /* Пришедшие позиции. */
    @Json(name = "positions")
    var positions: kotlin.collections.MutableList<PositionModel>? = null,

    /* Фильтры. */
    @Json(name = "filters")
    var filters: kotlin.collections.MutableList<FilterModel>? = null,

    /* Список действий. */
    @Json(name = "actions")
    var actions: kotlin.collections.MutableList<ActionModel>? = null,

    /* Длительность расчета в миллисекундах. */
    @Json(name = "calculationDuration")
    var calculationDuration: kotlin.Double? = null

)


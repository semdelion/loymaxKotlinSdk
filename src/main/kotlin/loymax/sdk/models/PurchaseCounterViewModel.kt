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

import loymax.sdk.models.CounterAggregationStrategy
import loymax.sdk.models.CounterTarget
import loymax.sdk.models.CreatorModel
import loymax.sdk.models.LoyaltyProgramModel
import loymax.sdk.models.PartnerViewModel

import com.squareup.moshi.Json

/**
 * Модель представления для счетчика, связанного с покупкой.
 *
 * @param id Внутренний идентификатор счетчика.
 * @param uid Внешний идентификатор счетчика.
 * @param name Название счетчика.
 * @param author 
 * @param creationDate Дата создания счетчика.
 * @param partner 
 * @param targets Список моделей для счетчика.
 * @param loyaltyProgram 
 * @param aggregationStrategy 
 * @param editable Доступность редактирования счетчика (true - можно редактировать, false - нельзя).
 */

data class PurchaseCounterViewModel (

    /* Внутренний идентификатор счетчика. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Внешний идентификатор счетчика. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Название счетчика. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "author")
    var author: CreatorModel? = null,

    /* Дата создания счетчика. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    @Json(name = "partner")
    var partner: PartnerViewModel? = null,

    /* Список моделей для счетчика. */
    @Json(name = "targets")
    var targets: kotlin.collections.MutableList<CounterTarget>? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramModel? = null,

    @Json(name = "aggregationStrategy")
    var aggregationStrategy: CounterAggregationStrategy? = null,

    /* Доступность редактирования счетчика (true - можно редактировать, false - нельзя). */
    @Json(name = "editable")
    var editable: kotlin.Boolean? = null

)


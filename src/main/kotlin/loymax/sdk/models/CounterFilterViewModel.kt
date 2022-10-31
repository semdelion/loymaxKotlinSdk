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

import loymax.sdk.models.CounterFilterAdditionalInformationViewModel
import loymax.sdk.models.CounterFilterRestrictionsType
import loymax.sdk.models.DatePeriodType
import loymax.sdk.models.FilterOperation
import loymax.sdk.models.RestrictionPeriodType

import com.squareup.moshi.Json

/**
 * View модель фильтра \"Счётчик\".
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param counterId Id.
 * @param counterName Название.
 * @param operation 
 * @param restrictionsType 
 * @param `value` Значение для сравнения.
 * @param addinitionalInfromation Дополнительная информация фильтра для счетчика.
 * @param restrictionPeriodType 
 * @param restrictionPeriod Ограничение для просмотра изменения значений в минутах.
 * @param periodType 
 * @param dateFrom Дата1.
 * @param dateTo Дата2.
 */

data class CounterFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Id. */
    @Json(name = "counterId")
    var counterId: kotlin.Int? = null,

    /* Название. */
    @Json(name = "counterName")
    var counterName: kotlin.String? = null,

    @Json(name = "operation")
    var operation: FilterOperation? = null,

    @Json(name = "restrictionsType")
    var restrictionsType: CounterFilterRestrictionsType? = null,

    /* Значение для сравнения. */
    @Json(name = "value")
    var `value`: kotlin.Double? = null,

    /* Дополнительная информация фильтра для счетчика. */
    @Json(name = "addinitionalInfromation")
    var addinitionalInfromation: kotlin.collections.MutableList<CounterFilterAdditionalInformationViewModel>? = null,

    @Json(name = "restrictionPeriodType")
    var restrictionPeriodType: RestrictionPeriodType? = null,

    /* Ограничение для просмотра изменения значений в минутах. */
    @Json(name = "restrictionPeriod")
    var restrictionPeriod: kotlin.Int? = null,

    @Json(name = "periodType")
    var periodType: DatePeriodType? = null,

    /* Дата1. */
    @Json(name = "dateFrom")
    var dateFrom: java.time.OffsetDateTime? = null,

    /* Дата2. */
    @Json(name = "dateTo")
    var dateTo: java.time.OffsetDateTime? = null

)

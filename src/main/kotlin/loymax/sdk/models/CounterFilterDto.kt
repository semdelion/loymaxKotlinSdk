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

import loymax.sdk.models.ComparisonOperator
import loymax.sdk.models.CounterFilterAddinitionalInfromationDto
import loymax.sdk.models.CounterFilterRestrictionsType
import loymax.sdk.models.DatePeriodType
import loymax.sdk.models.RestrictionPeriodType

import com.squareup.moshi.Json

/**
 * Фильтр \"Счётчик\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param counter Счетчик.
 * @param operation 
 * @param `value` Значение для сравнения.
 * @param restrictionsType 
 * @param addinitionalInfromation Дополнительные параметры.
 * @param restrictionPeriod Ограничение для просмотра изменения значений в ед.
 * @param periodType 
 * @param dateFrom С.
 * @param dateTo По.
 * @param restrictionPeriodType 
 */

data class CounterFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Счетчик. */
    @Json(name = "counter")
    var counter: kotlin.Any? = null,

    @Json(name = "operation")
    var operation: ComparisonOperator? = null,

    /* Значение для сравнения. */
    @Json(name = "value")
    var `value`: kotlin.Double? = null,

    @Json(name = "restrictionsType")
    var restrictionsType: CounterFilterRestrictionsType? = null,

    /* Дополнительные параметры. */
    @Json(name = "addinitionalInfromation")
    var addinitionalInfromation: kotlin.collections.MutableList<CounterFilterAddinitionalInfromationDto>? = null,

    /* Ограничение для просмотра изменения значений в ед. */
    @Json(name = "restrictionPeriod")
    var restrictionPeriod: kotlin.Int? = null,

    @Json(name = "periodType")
    var periodType: DatePeriodType? = null,

    /* С. */
    @Json(name = "dateFrom")
    var dateFrom: java.time.OffsetDateTime? = null,

    /* По. */
    @Json(name = "dateTo")
    var dateTo: java.time.OffsetDateTime? = null,

    @Json(name = "restrictionPeriodType")
    var restrictionPeriodType: RestrictionPeriodType? = null

)


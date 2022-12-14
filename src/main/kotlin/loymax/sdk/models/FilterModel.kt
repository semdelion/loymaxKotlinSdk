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


import com.squareup.moshi.Json

/**
 * Результат фильтрации.
 *
 * @param id Идентификатор фильтра.
 * @param name Наименование фильтра.
 * @param checkValue Значение фильтрации.
 * @param checkDetails Детали фильтрации.
 * @param calculationDuration Длительность расчета в миллисекундах.
 */

data class FilterModel (

    /* Идентификатор фильтра. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Наименование фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Значение фильтрации. */
    @Json(name = "checkValue")
    var checkValue: kotlin.Boolean? = null,

    /* Детали фильтрации. */
    @Json(name = "checkDetails")
    var checkDetails: kotlin.String? = null,

    /* Длительность расчета в миллисекундах. */
    @Json(name = "calculationDuration")
    var calculationDuration: kotlin.Double? = null

)


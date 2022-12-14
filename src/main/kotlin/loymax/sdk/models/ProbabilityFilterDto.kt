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
 * Фильтр \"Вероятность\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param probabilityValue Вероятность (от 0 до 1).
 */

data class ProbabilityFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Вероятность (от 0 до 1). */
    @Json(name = "probabilityValue")
    var probabilityValue: kotlin.Double? = null

)


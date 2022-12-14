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
 * Модель для ключа обсчёта товаров.
 *
 * @param name Наименование.
 * @param `value` Значение.
 */

data class CalculationKeyModel (

    /* Наименование. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Значение. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)


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

import loymax.sdk.models.HistoryChequeAdditionalAttributeType

import com.squareup.moshi.Json

/**
 * Атрибут чека.
 *
 * @param type 
 * @param name Имя атрибута.
 * @param stringValue Строковое значение атрибута.
 * @param decimalValue Decimal значение атрибута.
 * @param `value` Значение в строковом выражении.
 */

data class HistoryChequeAdditionalAttributeModel (

    @Json(name = "type")
    var type: HistoryChequeAdditionalAttributeType? = null,

    /* Имя атрибута. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Строковое значение атрибута. */
    @Json(name = "stringValue")
    var stringValue: kotlin.String? = null,

    /* Decimal значение атрибута. */
    @Json(name = "decimalValue")
    var decimalValue: kotlin.Double? = null,

    /* Значение в строковом выражении. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)

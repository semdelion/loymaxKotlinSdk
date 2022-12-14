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

import loymax.sdk.models.ChequePositionAttributeType

import com.squareup.moshi.Json

/**
 * Модель представления атрибута позиции чека.
 *
 * @param name Название.
 * @param `value` Значение.
 * @param type 
 */

data class ChequePositionAttributeViewModel (

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Значение. */
    @Json(name = "value")
    var `value`: kotlin.String? = null,

    @Json(name = "type")
    var type: ChequePositionAttributeType? = null

)


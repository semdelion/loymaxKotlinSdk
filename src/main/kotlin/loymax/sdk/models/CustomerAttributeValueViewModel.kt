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
 * Модель значения атрибута клиента.
 *
 * @param logicalName Логическое имя атрибута.
 * @param `value` Значение атрибута.
 */

data class CustomerAttributeValueViewModel (

    /* Логическое имя атрибута. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null,

    /* Значение атрибута. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)


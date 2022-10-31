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

import loymax.sdk.models.BaseUserAttributeViewModel

import com.squareup.moshi.Json

/**
 * Модель значения атрибута клиента.
 *
 * @param id Внутренний идентификатор значения атрибута.
 * @param attribute 
 * @param `value` Значение атрибута.
 */

data class UserAttributeValueViewModel (

    /* Внутренний идентификатор значения атрибута. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "attribute")
    var attribute: BaseUserAttributeViewModel? = null,

    /* Значение атрибута. */
    @Json(name = "value")
    var `value`: kotlin.String? = null

)

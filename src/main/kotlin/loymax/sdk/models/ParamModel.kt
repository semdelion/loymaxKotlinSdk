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

import loymax.sdk.models.AdditionalParamType

import com.squareup.moshi.Json

/**
 * Дополнительный параметр.
 *
 * @param name Имя параметра.
 * @param `value` Значение параметра.
 * @param type 
 */

data class ParamModel (

    /* Имя параметра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Значение параметра. */
    @Json(name = "value")
    var `value`: kotlin.String? = null,

    @Json(name = "type")
    var type: AdditionalParamType? = null

)


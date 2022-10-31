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
 * Представление для маски номера.
 *
 * @param length Длина номера.
 * @param mask Текст маски.
 */

data class PhoneMaskViewModel (

    /* Длина номера. */
    @Json(name = "length")
    var length: kotlin.Int? = null,

    /* Текст маски. */
    @Json(name = "mask")
    var mask: kotlin.String? = null

)

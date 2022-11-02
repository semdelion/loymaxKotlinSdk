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

import loymax.sdk.models.ReferrerCodeType

import com.squareup.moshi.Json

/**
 * Информация для создания реферальной связи.
 *
 * @param type 
 * @param code Реферальный код.
 */

data class ReferrerInfo (

    @Json(name = "type")
    var type: ReferrerCodeType? = null,

    /* Реферальный код. */
    @Json(name = "code")
    var code: kotlin.String? = null

)


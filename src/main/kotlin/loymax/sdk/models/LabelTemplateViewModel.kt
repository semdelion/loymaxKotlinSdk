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

import loymax.sdk.models.LabelType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param labelType 
 * @param `value` 
 */

data class LabelTemplateViewModel (

    @Json(name = "labelType")
    var labelType: LabelType? = null,

    @Json(name = "value")
    var `value`: kotlin.String? = null

)


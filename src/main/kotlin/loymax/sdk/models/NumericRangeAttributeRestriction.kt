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
 * 
 *
 * @param minValue 
 * @param maxValue 
 * @param id 
 */

data class NumericRangeAttributeRestriction (

    @Json(name = "minValue")
    var minValue: kotlin.Double? = null,

    @Json(name = "maxValue")
    var maxValue: kotlin.Double? = null,

    @Json(name = "id")
    var id: kotlin.Int? = null

)


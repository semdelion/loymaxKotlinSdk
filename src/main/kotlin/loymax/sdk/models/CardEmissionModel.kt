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
 * @param id 
 * @param description 
 * @param number 
 * @param prefix 
 */

data class CardEmissionModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "number")
    var number: kotlin.Int? = null,

    @Json(name = "prefix")
    var prefix: kotlin.Int? = null

)


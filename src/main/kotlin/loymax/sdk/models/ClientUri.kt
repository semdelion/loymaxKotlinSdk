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
 * @param method 
 * @param target 
 */

data class ClientUri (

    @Json(name = "method")
    var method: kotlin.String? = null,

    @Json(name = "target")
    var target: kotlin.String? = null

)


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
 * @param name 
 * @param description 
 * @param isDeleted 
 * @param logicalName 
 */

data class ActionTypeModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null

)


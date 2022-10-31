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

import loymax.sdk.models.CustomerActionType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param currentValue 
 * @param attachDateTime 
 * @param attachType 
 * @param isVerified 
 */

data class NotifierInfoModel (

    @Json(name = "currentValue")
    var currentValue: kotlin.String? = null,

    @Json(name = "attachDateTime")
    var attachDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "attachType")
    var attachType: CustomerActionType? = null,

    @Json(name = "isVerified")
    var isVerified: kotlin.Boolean? = null

)

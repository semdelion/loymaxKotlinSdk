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

import loymax.sdk.models.ActionTypeModel
import loymax.sdk.models.OfferEventType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param name 
 * @param description 
 * @param type 
 * @param actions 
 */

data class OfferEventModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "type")
    var type: OfferEventType? = null,

    @Json(name = "actions")
    var actions: kotlin.collections.MutableList<ActionTypeModel>? = null

)


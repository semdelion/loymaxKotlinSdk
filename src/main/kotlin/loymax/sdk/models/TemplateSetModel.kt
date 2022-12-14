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

import loymax.sdk.models.TemplateModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param id 
 * @param capacity 
 * @param quantity 
 * @param templates 
 * @param isUsed 
 * @param loyaltyProgramId 
 * @param partnerId 
 */

data class TemplateSetModel (

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "capacity")
    var capacity: kotlin.Int? = null,

    @Json(name = "quantity")
    var quantity: kotlin.Int? = null,

    @Json(name = "templates")
    var templates: kotlin.collections.MutableList<TemplateModel>? = null,

    @Json(name = "isUsed")
    var isUsed: kotlin.Boolean? = null,

    @Json(name = "loyaltyProgramId")
    var loyaltyProgramId: kotlin.Int? = null,

    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null

)


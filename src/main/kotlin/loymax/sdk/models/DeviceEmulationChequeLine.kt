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
 * @param goodsName 
 * @param goodsItemId 
 * @param posId 
 * @param amount 
 * @param discount 
 * @param cashback 
 * @param quantity 
 * @param message 
 */

data class DeviceEmulationChequeLine (

    @Json(name = "goodsName")
    var goodsName: kotlin.String? = null,

    @Json(name = "goodsItemId")
    var goodsItemId: kotlin.String? = null,

    @Json(name = "posId")
    var posId: kotlin.Int? = null,

    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    @Json(name = "discount")
    var discount: kotlin.Double? = null,

    @Json(name = "cashback")
    var cashback: kotlin.Double? = null,

    @Json(name = "quantity")
    var quantity: kotlin.Double? = null,

    @Json(name = "message")
    var message: kotlin.String? = null

)


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

import loymax.sdk.models.MoneyViewModel
import loymax.sdk.models.OfferInfoShortViewModel
import loymax.sdk.models.PositionDiscountType

import com.squareup.moshi.Json

/**
 * Модель начислений/скидок по покупке.
 *
 * @param type 
 * @param amount 
 * @param cashAmount 
 * @param offer 
 */

data class PositionDiscountViewModel (

    @Json(name = "type")
    var type: PositionDiscountType? = null,

    @Json(name = "amount")
    var amount: MoneyViewModel? = null,

    @Json(name = "cashAmount")
    var cashAmount: MoneyViewModel? = null,

    @Json(name = "offer")
    var offer: OfferInfoShortViewModel? = null

)


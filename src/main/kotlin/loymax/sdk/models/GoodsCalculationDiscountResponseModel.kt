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

import loymax.sdk.models.OfferInfoBaseModel

import com.squareup.moshi.Json

/**
 * Модель для результатов обсчёта товаров.
 *
 * @param offerInfo 
 * @param amount Сумма.
 */

data class GoodsCalculationDiscountResponseModel (

    @Json(name = "offerInfo")
    var offerInfo: OfferInfoBaseModel? = null,

    /* Сумма. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null

)


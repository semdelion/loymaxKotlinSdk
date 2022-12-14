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

import com.squareup.moshi.Json

/**
 * ViewModel сумма покупок, сумма начисленных и списанных бонусов в рамках покупок.
 *
 * @param amount 
 * @param withdrawType Тип списания.
 */

data class HistoryAggregateWithdrawModel (

    @Json(name = "amount")
    var amount: MoneyViewModel? = null,

    /* Тип списания. */
    @Json(name = "withdrawType")
    var withdrawType: kotlin.String? = null

)


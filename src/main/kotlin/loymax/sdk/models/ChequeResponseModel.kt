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

import loymax.sdk.models.ChequeLineResponseModel

import com.squareup.moshi.Json

/**
 * Информация о примененных расчетах в чеке.
 *
 * @param totalAmount Сумма по чеку до применения скидок.
 * @param totalDiscount Прямая скидка по чеку до применения скидок.
 * @param totalCashback Кешбэк по чеку.
 * @param lines Позиции в чеке.
 */

data class ChequeResponseModel (

    /* Сумма по чеку до применения скидок. */
    @Json(name = "totalAmount")
    var totalAmount: kotlin.Double? = null,

    /* Прямая скидка по чеку до применения скидок. */
    @Json(name = "totalDiscount")
    var totalDiscount: kotlin.Double? = null,

    /* Кешбэк по чеку. */
    @Json(name = "totalCashback")
    var totalCashback: kotlin.Double? = null,

    /* Позиции в чеке. */
    @Json(name = "lines")
    var lines: kotlin.collections.MutableList<ChequeLineResponseModel>? = null

)


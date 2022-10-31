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
 * Модель возврата купона.
 *
 * @param transactionId Идентификатор транзакции, полученный при покупке купона.
 */

data class CouponRefundModel (

    /* Идентификатор транзакции, полученный при покупке купона. */
    @Json(name = "transactionId")
    var transactionId: kotlin.Long? = null

)

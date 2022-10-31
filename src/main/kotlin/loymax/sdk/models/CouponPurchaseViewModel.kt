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

import loymax.sdk.models.Money

import com.squareup.moshi.Json

/**
 * Модель ответа покупки купона.
 *
 * @param id Внутренний идентификатор транзакции.
 * @param personId Внутренний идентификатор клиента.
 * @param amount Сумма покупки в бонусах.
 */

data class CouponPurchaseViewModel (

    /* Внутренний идентификатор транзакции. */
    @Json(name = "id")
    var id: kotlin.Long? = null,

    /* Внутренний идентификатор клиента. */
    @Json(name = "personId")
    var personId: kotlin.Int? = null,

    /* Сумма покупки в бонусах. */
    @Json(name = "amount")
    var amount: kotlin.collections.MutableList<Money>? = null

)


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
 * Модель покупки купона.
 *
 * @param id Внутренний идентификатор транзакции.
 * @param couponText Описание купона.
 * @param couponCode Код купона (номер).
 * @param amount Стоимость купона.
 * @param goodsId Внешний идентификатор товара купона.
 * @param personId Внутренний идентификатор клиента.
 */

data class CouponBuyModel (

    /* Внутренний идентификатор транзакции. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Описание купона. */
    @Json(name = "couponText")
    var couponText: kotlin.String? = null,

    /* Код купона (номер). */
    @Json(name = "couponCode")
    var couponCode: kotlin.String? = null,

    /* Стоимость купона. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Внешний идентификатор товара купона. */
    @Json(name = "goodsId")
    var goodsId: kotlin.String? = null,

    /* Внутренний идентификатор клиента. */
    @Json(name = "personId")
    var personId: kotlin.Int? = null

)


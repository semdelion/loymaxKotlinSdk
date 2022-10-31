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
 * Модель позиции.
 *
 * @param id Идентификатор.
 * @param catalogGoodName Название каталога товаров.
 * @param catalogGoodsId Идентификатор каталога товаров.
 * @param itemId ItemID товаров.
 * @param price Цена.
 * @param quantity Количество.
 * @param amount Сумма.
 * @param directDiscount Прямая скидка.
 * @param partnerDiscount Партнерская скидка.
 * @param partnerCashback Партнерский кешбек.
 * @param positionId Идентификатор позиции.
 */

data class DeviceEmulationPositionViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название каталога товаров. */
    @Json(name = "catalogGoodName")
    var catalogGoodName: kotlin.String? = null,

    /* Идентификатор каталога товаров. */
    @Json(name = "catalogGoodsId")
    var catalogGoodsId: kotlin.Int? = null,

    /* ItemID товаров. */
    @Json(name = "itemId")
    var itemId: kotlin.String? = null,

    /* Цена. */
    @Json(name = "price")
    var price: kotlin.Double? = null,

    /* Количество. */
    @Json(name = "quantity")
    var quantity: kotlin.Double? = null,

    /* Сумма. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Прямая скидка. */
    @Json(name = "directDiscount")
    var directDiscount: kotlin.Double? = null,

    /* Партнерская скидка. */
    @Json(name = "partnerDiscount")
    var partnerDiscount: kotlin.Double? = null,

    /* Партнерский кешбек. */
    @Json(name = "partnerCashback")
    var partnerCashback: kotlin.Double? = null,

    /* Идентификатор позиции. */
    @Json(name = "positionId")
    var positionId: kotlin.Int? = null

)


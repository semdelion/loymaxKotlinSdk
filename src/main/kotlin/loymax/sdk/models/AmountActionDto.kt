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

import loymax.sdk.models.AttributeDiscountDto
import loymax.sdk.models.CalculationExclusionDiscountType

import com.squareup.moshi.Json

/**
 * Действие акции \"Бонусы\" или \"Скидка\".
 *
 * @param order Порядковый номер действия в цепочке.
 * @param id Id действия в цепочке.
 * @param `value` Значение.
 * @param value2 Дополнительное значение.
 * @param value3 Ещё дополнительное значение.
 * @param percent Процент. Значение от 0 до 1.
 * @param amountPerUnit Сумма скидки на единицу товара.
 * @param amountPerUniqueSku Сумма скидки на sku.
 * @param pricePerUnit Цена за единицу товара.
 * @param amount Фиксированная сумма скидки.
 * @param amountMeasure Сумма, за каждое достижение в чеке которой начисляется фиксированная скидка/бонус{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountPerMeasure}.
 * @param amountPerMeasure Сумма фиксированной скидки/бонуса, которая начисляется за каждое достижение в чеке суммы{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountMeasure}.
 * @param amountWeight Масса, за каждое достижение в чеке которой начисляется фиксированная скидка/бонус{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountPerWeight}.
 * @param amountPerWeight Сумма фиксированной скидки/бонуса, которая начисляется за каждое достижение в чеке массы{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountWeight}.
 * @param price Фиксированная цена всех товаров.
 * @param attributeDiscount 
 * @param distributeToAll Распределить на все.
 * @param discountType Тип скидки.
 * @param calculationExclusionDiscountTypes Типы скидок, которые исключаются при расчете.
 */

data class AmountActionDto (

    /* Порядковый номер действия в цепочке. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Id действия в цепочке. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Значение. */
    @Json(name = "value")
    var `value`: kotlin.String? = null,

    /* Дополнительное значение. */
    @Json(name = "value2")
    var value2: kotlin.String? = null,

    /* Ещё дополнительное значение. */
    @Json(name = "value3")
    var value3: kotlin.String? = null,

    /* Процент. Значение от 0 до 1. */
    @Json(name = "percent")
    var percent: kotlin.Double? = null,

    /* Сумма скидки на единицу товара. */
    @Json(name = "amountPerUnit")
    var amountPerUnit: kotlin.Double? = null,

    /* Сумма скидки на sku. */
    @Json(name = "amountPerUniqueSku")
    var amountPerUniqueSku: kotlin.Double? = null,

    /* Цена за единицу товара. */
    @Json(name = "pricePerUnit")
    var pricePerUnit: kotlin.Double? = null,

    /* Фиксированная сумма скидки. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Сумма, за каждое достижение в чеке которой начисляется фиксированная скидка/бонус{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountPerMeasure}. */
    @Json(name = "amountMeasure")
    var amountMeasure: kotlin.Double? = null,

    /* Сумма фиксированной скидки/бонуса, которая начисляется за каждое достижение в чеке суммы{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountMeasure}. */
    @Json(name = "amountPerMeasure")
    var amountPerMeasure: kotlin.Double? = null,

    /* Масса, за каждое достижение в чеке которой начисляется фиксированная скидка/бонус{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountPerWeight}. */
    @Json(name = "amountWeight")
    var amountWeight: kotlin.Double? = null,

    /* Сумма фиксированной скидки/бонуса, которая начисляется за каждое достижение в чеке массы{Loymax.ImportExport.Dto.Offers.Actions.AmountActionDto.AmountWeight}. */
    @Json(name = "amountPerWeight")
    var amountPerWeight: kotlin.Double? = null,

    /* Фиксированная цена всех товаров. */
    @Json(name = "price")
    var price: kotlin.Double? = null,

    @Json(name = "attributeDiscount")
    var attributeDiscount: AttributeDiscountDto? = null,

    /* Распределить на все. */
    @Json(name = "distributeToAll")
    var distributeToAll: kotlin.Boolean? = null,

    /* Тип скидки. */
    @Json(name = "discountType")
    var discountType: kotlin.String? = null,

    /* Типы скидок, которые исключаются при расчете. */
    @Json(name = "calculationExclusionDiscountTypes")
    var calculationExclusionDiscountTypes: kotlin.collections.MutableList<CalculationExclusionDiscountType>? = null

)


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

import loymax.sdk.models.ChequeGoodsFilterType
import loymax.sdk.models.ComparisonOperator

import com.squareup.moshi.Json

/**
 * Фильтр \"Ограничение на товар\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param goodsGroups Группы товаров.
 * @param personalOfferAttributeLogicalName Логическое имя атрибута \"Персональное предложение\".
 * @param type 
 * @param `operator` 
 * @param `value` Значение для операции.
 * @param counter Счетчик.
 */

data class ChequeGoodsLimitWithCounterFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Группы товаров. */
    @Json(name = "goodsGroups")
    var goodsGroups: kotlin.collections.MutableList<kotlin.Any>? = null,

    /* Логическое имя атрибута \"Персональное предложение\". */
    @Json(name = "personalOfferAttributeLogicalName")
    var personalOfferAttributeLogicalName: kotlin.String? = null,

    @Json(name = "type")
    var type: ChequeGoodsFilterType? = null,

    @Json(name = "operator")
    var `operator`: ComparisonOperator? = null,

    /* Значение для операции. */
    @Json(name = "value")
    var `value`: kotlin.Double? = null,

    /* Счетчик. */
    @Json(name = "counter")
    var counter: kotlin.Any? = null

)

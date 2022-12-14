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

import loymax.sdk.models.GoodsGroupViewModel

import com.squareup.moshi.Json

/**
 * ViewModel для фильтра по вхождению товара в группу товаров.
 *
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 * @param goodsGroups Список выбранных групп товаров.
 * @param personalOfferAttributeId Идентификатор атрибута \"Персональное предложение\".
 */

data class GoodsGroupsFilterViewModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Список выбранных групп товаров. */
    @Json(name = "goodsGroups")
    var goodsGroups: kotlin.collections.MutableList<GoodsGroupViewModel>? = null,

    /* Идентификатор атрибута \"Персональное предложение\". */
    @Json(name = "personalOfferAttributeId")
    var personalOfferAttributeId: kotlin.Int? = null

)


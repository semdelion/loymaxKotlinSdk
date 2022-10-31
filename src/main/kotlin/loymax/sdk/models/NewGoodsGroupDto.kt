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

import loymax.sdk.models.GoodsGroupState

import com.squareup.moshi.Json

/**
 * Новая группа товаров.
 *
 * @param id Id создаваемой группы.
 * @param name Название группы.
 * @param catalogId Id каталога.
 * @param goodsGroupState 
 * @param includeItems Включаемые товары.
 * @param excludeItems Исключаемые товары.
 */

data class NewGoodsGroupDto (

    /* Id создаваемой группы. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Название группы. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Id каталога. */
    @Json(name = "catalogId")
    var catalogId: java.util.UUID? = null,

    @Json(name = "goodsGroupState")
    var goodsGroupState: GoodsGroupState? = null,

    /* Включаемые товары. */
    @Json(name = "includeItems")
    var includeItems: kotlin.collections.MutableList<kotlin.String>? = null,

    /* Исключаемые товары. */
    @Json(name = "excludeItems")
    var excludeItems: kotlin.collections.MutableList<kotlin.String>? = null

)

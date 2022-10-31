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

import loymax.sdk.models.GoodsFilterDto
import loymax.sdk.models.ItemGroupDto

import com.squareup.moshi.Json

/**
 * Набор товаров.
 *
 * @param name Название набора товаров.
 * @param catalogItems Элементы каталога.
 * @param filters Фильтры по атрибутам.
 */

data class GoodsSetDto (

    /* Название набора товаров. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Элементы каталога. */
    @Json(name = "catalogItems")
    var catalogItems: kotlin.collections.MutableList<ItemGroupDto>? = null,

    /* Фильтры по атрибутам. */
    @Json(name = "filters")
    var filters: kotlin.collections.MutableList<GoodsFilterDto>? = null

)


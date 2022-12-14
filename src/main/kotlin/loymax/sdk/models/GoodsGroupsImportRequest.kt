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

import loymax.sdk.models.GoodsGroupDto
import loymax.sdk.models.ProtocolVersion

import com.squareup.moshi.Json

/**
 * Запрос на импорт групп товаров.
 *
 * @param version 
 * @param goodsGroups Группы товаров.
 */

data class GoodsGroupsImportRequest (

    @Json(name = "version")
    var version: ProtocolVersion? = null,

    /* Группы товаров. */
    @Json(name = "goodsGroups")
    var goodsGroups: kotlin.collections.MutableList<GoodsGroupDto>? = null

)


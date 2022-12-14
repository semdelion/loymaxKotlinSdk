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

import loymax.sdk.models.GoodsGroupsImportError

import com.squareup.moshi.Json

/**
 * Результат импорта групп товаров.
 *
 * @param inserted Количество созданных групп товаров.
 * @param rewritten Количество перезаписанных групп товаров.
 * @param errors Ошибки при импорте групп товаров.
 */

data class GoodsGroupsImportResponse (

    /* Количество созданных групп товаров. */
    @Json(name = "inserted")
    var inserted: kotlin.Int? = null,

    /* Количество перезаписанных групп товаров. */
    @Json(name = "rewritten")
    var rewritten: kotlin.Int? = null,

    /* Ошибки при импорте групп товаров. */
    @Json(name = "errors")
    var errors: kotlin.collections.MutableList<GoodsGroupsImportError>? = null

)


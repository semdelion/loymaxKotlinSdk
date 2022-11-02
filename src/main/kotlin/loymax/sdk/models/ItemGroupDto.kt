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

import loymax.sdk.models.ItemDto

import com.squareup.moshi.Json

/**
 * Элементы, сгруппированные по каталогу.
 *
 * @param catalogId Идентификатор каталога.
 * @param items Элементы каталога.
 */

data class ItemGroupDto (

    /* Идентификатор каталога. */
    @Json(name = "catalogId")
    var catalogId: java.util.UUID? = null,

    /* Элементы каталога. */
    @Json(name = "items")
    var items: kotlin.collections.MutableList<ItemDto>? = null

)


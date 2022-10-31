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

import loymax.sdk.models.HistoryItemModel

import com.squareup.moshi.Json

/**
 * ViewModel списка исторических записей.
 *
 * @param allCount Всего записей.
 * @param rows Строки.
 */

data class HistoryListModel (

    /* Всего записей. */
    @Json(name = "allCount")
    var allCount: kotlin.Int? = null,

    /* Строки. */
    @Json(name = "rows")
    var rows: kotlin.collections.MutableList<HistoryItemModel>? = null

)


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
 * Фильтр по странам.
 *
 * @param from Начало выборки.
 * @param count Количество.
 * @param startWith Поисковая строка.
 * @param sortingIds Идентификаторы стран, которые будут выбираться первыми.
 */

data class CountrySearchFilter (

    /* Начало выборки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Количество. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Поисковая строка. */
    @Json(name = "startWith")
    var startWith: kotlin.String? = null,

    /* Идентификаторы стран, которые будут выбираться первыми. */
    @Json(name = "sortingIds")
    var sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null

)


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
 * Фильтр \"Категория карты\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param cardCategoryIds Список идентификаторов выбранных категорий карт.
 */

data class CardCategoryFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Список идентификаторов выбранных категорий карт. */
    @Json(name = "cardCategoryIds")
    var cardCategoryIds: kotlin.collections.MutableList<kotlin.Int>? = null

)

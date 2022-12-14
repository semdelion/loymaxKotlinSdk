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
 * Дополнительная информация для фасовки карты.
 *
 * @param secondaryCardsIds Идентификаторы фасуемых дополнительных карт.
 */

data class CardPackingModel (

    /* Идентификаторы фасуемых дополнительных карт. */
    @Json(name = "secondaryCardsIds")
    var secondaryCardsIds: kotlin.collections.MutableList<kotlin.Int>? = null

)


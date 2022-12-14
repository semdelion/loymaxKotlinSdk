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
 * Информация о возможности прикрепления физической карты.
 *
 * @param maxCountOfMainCardsForUser Максимальное количество физических карт, которое может иметь клиент.
 * @param currentCountOfMainCards Текущее количество физических карт у клиента.
 * @param isCardSetAllowed Возможность прикрепления физической карты (true — да, false — нет).
 */

data class SetCardActionInfoModel (

    /* Максимальное количество физических карт, которое может иметь клиент. */
    @Json(name = "maxCountOfMainCardsForUser")
    var maxCountOfMainCardsForUser: kotlin.Int? = null,

    /* Текущее количество физических карт у клиента. */
    @Json(name = "currentCountOfMainCards")
    var currentCountOfMainCards: kotlin.Int? = null,

    /* Возможность прикрепления физической карты (true — да, false — нет). */
    @Json(name = "isCardSetAllowed")
    var isCardSetAllowed: kotlin.Boolean? = null

)


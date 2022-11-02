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
 * Модель для операции замены категории карты Участника ПЛ.
 *
 * @param cardId Внутренний идентификатор карты Участника ПЛ.
 * @param cardCategoryId Внутренний идентификатор новой категории карты Участника ПЛ.
 */

data class ChangeCardCategoryModel (

    /* Внутренний идентификатор карты Участника ПЛ. */
    @Json(name = "cardId")
    var cardId: kotlin.Int? = null,

    /* Внутренний идентификатор новой категории карты Участника ПЛ. */
    @Json(name = "cardCategoryId")
    var cardCategoryId: kotlin.Int? = null

)


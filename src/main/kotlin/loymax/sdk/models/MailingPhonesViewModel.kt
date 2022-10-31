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
 * Модель загруженных номеров телефонов.
 *
 * @param totalPhonesCount Количество загруженных номеров телефонов всего.
 * @param correctPhonesCount Количество валидных номеров телефонов.
 * @param unidentifiedPhonesCount Количество номеров, не найденных в системе.
 * @param incorrectPhonesCount Количество неправильных номеров телефонов.
 */

data class MailingPhonesViewModel (

    /* Количество загруженных номеров телефонов всего. */
    @Json(name = "totalPhonesCount")
    var totalPhonesCount: kotlin.Int? = null,

    /* Количество валидных номеров телефонов. */
    @Json(name = "correctPhonesCount")
    var correctPhonesCount: kotlin.Int? = null,

    /* Количество номеров, не найденных в системе. */
    @Json(name = "unidentifiedPhonesCount")
    var unidentifiedPhonesCount: kotlin.Int? = null,

    /* Количество неправильных номеров телефонов. */
    @Json(name = "incorrectPhonesCount")
    var incorrectPhonesCount: kotlin.Int? = null

)

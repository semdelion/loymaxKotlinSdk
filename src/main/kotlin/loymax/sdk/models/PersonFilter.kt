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
 * Фильтр пользователей.
 *
 * @param identifierText Только пользователи с идентификаторами содержащими данный текст.
 */

data class PersonFilter (

    /* Только пользователи с идентификаторами содержащими данный текст. */
    @Json(name = "identifierText")
    var identifierText: kotlin.String? = null

)


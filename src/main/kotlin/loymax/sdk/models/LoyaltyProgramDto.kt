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
 * Программа лояльности.
 *
 * @param id Название программы лояльности.
 */

data class LoyaltyProgramDto (

    /* Название программы лояльности. */
    @Json(name = "id")
    var id: kotlin.String? = null

)


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
 * Модель ввода нового Email.
 *
 * @param email Новый Email.
 */

data class NewEmailInfo (

    /* Новый Email. */
    @Json(name = "email")
    var email: kotlin.String? = null

)


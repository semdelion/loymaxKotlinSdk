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
 * Модель, содержащая информацию о коде потдверждения.
 *
 * @param codeLength Количество символов в коде подтверждения.
 */

data class ConfirmCodeResultModel (

    /* Количество символов в коде подтверждения. */
    @Json(name = "codeLength")
    var codeLength: kotlin.Int? = null

)


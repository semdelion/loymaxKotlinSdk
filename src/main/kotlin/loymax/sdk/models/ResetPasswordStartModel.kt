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
 * Модель данных для запуска восстановления пароля.
 *
 * @param notifierIdentity Нотификатор (номер телефона/email).
 */

data class ResetPasswordStartModel (

    /* Нотификатор (номер телефона/email). */
    @Json(name = "notifierIdentity")
    var notifierIdentity: kotlin.String? = null

)


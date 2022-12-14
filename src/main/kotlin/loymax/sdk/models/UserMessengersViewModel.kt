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
 * Информация о мессенджерах клиента.
 *
 * @param hasViber Наличие активного аккаунта Viber.
 */

data class UserMessengersViewModel (

    /* Наличие активного аккаунта Viber. */
    @Json(name = "hasViber")
    var hasViber: kotlin.Boolean? = null

)


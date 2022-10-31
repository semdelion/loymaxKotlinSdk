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
 * Результат авторизации.
 *
 * @param tokenType Тип маркера доступа.
 * @param accessToken Маркер доступа.
 * @param refreshToken Маркер обновления доступа.
 * @param expiresIn Срок действия маркера доступа.
 */

data class AuthResultModel (

    /* Тип маркера доступа. */
    @Json(name = "token_type")
    var tokenType: kotlin.String? = null,

    /* Маркер доступа. */
    @Json(name = "access_token")
    var accessToken: kotlin.String? = null,

    /* Маркер обновления доступа. */
    @Json(name = "refresh_token")
    var refreshToken: kotlin.String? = null,

    /* Срок действия маркера доступа. */
    @Json(name = "expires_in")
    var expiresIn: kotlin.Int? = null

)


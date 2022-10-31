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

import loymax.sdk.models.AuthResultModel
import loymax.sdk.models.RegistrationState

import com.squareup.moshi.Json

/**
 * Базовый класс для результата регистрации.
 *
 * @param state 
 * @param errorMessage Текст сообщения об ошибке.
 * @param authToken Токен аутентификации для дальнейших действий.
 * @param authResult 
 */

data class BaseRegistrationResult (

    @Json(name = "state")
    var state: RegistrationState? = null,

    /* Текст сообщения об ошибке. */
    @Json(name = "errorMessage")
    var errorMessage: kotlin.String? = null,

    /* Токен аутентификации для дальнейших действий. */
    @Json(name = "authToken")
    var authToken: kotlin.String? = null,

    @Json(name = "authResult")
    var authResult: AuthResultModel? = null

)


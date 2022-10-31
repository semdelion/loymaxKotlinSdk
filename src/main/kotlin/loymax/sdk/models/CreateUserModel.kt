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
 * Модель для регистрации в системе нового пользователя.
 *
 * @param login Логин пользователя.
 * @param password Пароль пользователя.
 * @param loyaltyProgramId Ид программы лояльности.
 */

data class CreateUserModel (

    /* Логин пользователя. */
    @Json(name = "login")
    var login: kotlin.String? = null,

    /* Пароль пользователя. */
    @Json(name = "password")
    var password: kotlin.String? = null,

    /* Ид программы лояльности. */
    @Json(name = "loyaltyProgramId")
    var loyaltyProgramId: kotlin.Int? = null

)


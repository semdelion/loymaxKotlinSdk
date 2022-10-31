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
 * Модель идентификатора.
 *
 * @param firstName Имя.
 * @param lastName Фамилия.
 * @param patronymicName Отчество.
 * @param phone Телефон.
 * @param email Email.
 * @param timeZone Часовой пояс.
 * @param login Текст идентификатора.
 * @param password Пароль.
 * @param isLimited Признак ограниченного количества сеансов.
 */

data class SystemUserCreateModel (

    /* Имя. */
    @Json(name = "firstName")
    var firstName: kotlin.String? = null,

    /* Фамилия. */
    @Json(name = "lastName")
    var lastName: kotlin.String? = null,

    /* Отчество. */
    @Json(name = "patronymicName")
    var patronymicName: kotlin.String? = null,

    /* Телефон. */
    @Json(name = "phone")
    var phone: kotlin.String? = null,

    /* Email. */
    @Json(name = "email")
    var email: kotlin.String? = null,

    /* Часовой пояс. */
    @Json(name = "timeZone")
    var timeZone: kotlin.Int? = null,

    /* Текст идентификатора. */
    @Json(name = "login")
    var login: kotlin.String? = null,

    /* Пароль. */
    @Json(name = "password")
    var password: kotlin.String? = null,

    /* Признак ограниченного количества сеансов. */
    @Json(name = "isLimited")
    var isLimited: kotlin.Boolean? = null

)

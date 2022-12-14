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

import loymax.sdk.models.UrlAuthType

import com.squareup.moshi.Json

/**
 * Модель URL-адреса для загрузки каталога (с авторизацией).
 *
 * @param id ID.
 * @param url URL-адрес.
 * @param authType 
 * @param login Логин.
 * @param password Пароль.
 * @param cert Сертификат.
 * @param identifier Идентификатор.
 */

data class UrlAuthViewModel (

    /* ID. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* URL-адрес. */
    @Json(name = "url")
    var url: kotlin.String? = null,

    @Json(name = "authType")
    var authType: UrlAuthType? = null,

    /* Логин. */
    @Json(name = "login")
    var login: kotlin.String? = null,

    /* Пароль. */
    @Json(name = "password")
    var password: kotlin.String? = null,

    /* Сертификат. */
    @Json(name = "cert")
    var cert: kotlin.String? = null,

    /* Идентификатор. */
    @Json(name = "identifier")
    var identifier: kotlin.String? = null

)


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
 * Базовый класс View-модели приложения.
 *
 * @param name Название OAuth-приложения.
 * @param alias Логический идентификатор OAuth-приложения.
 * @param description Описание OAuth-приложения.
 * @param isDeleted Статус OAuth-приложения (true - архивный, false - неархивный).
 * @param redirects Перечень разрешенных редиректов.
 * @param partnerId Внутренний идентификатор Партнера (Id).
 * @param cssUri Кастомизированные настройки CSS.
 */

data class BaseApplicationModel (

    /* Название OAuth-приложения. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Логический идентификатор OAuth-приложения. */
    @Json(name = "alias")
    var alias: kotlin.String? = null,

    /* Описание OAuth-приложения. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Статус OAuth-приложения (true - архивный, false - неархивный). */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    /* Перечень разрешенных редиректов. */
    @Json(name = "redirects")
    var redirects: kotlin.collections.MutableList<kotlin.String>? = null,

    /* Внутренний идентификатор Партнера (Id). */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* Кастомизированные настройки CSS. */
    @Json(name = "cssUri")
    var cssUri: kotlin.String? = null

)


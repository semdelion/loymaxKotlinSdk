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
 * Модель представления для плагина.
 *
 * @param id Идентификатор плагина.
 * @param className Имя плагина.
 * @param name Имя класса плагина.
 * @param version Версия плагина.
 * @param isDisabled Включен плагин или нет.
 */

data class ExtensionViewModel (

    /* Идентификатор плагина. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Имя плагина. */
    @Json(name = "className")
    var className: kotlin.String? = null,

    /* Имя класса плагина. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Версия плагина. */
    @Json(name = "version")
    var version: kotlin.String? = null,

    /* Включен плагин или нет. */
    @Json(name = "isDisabled")
    var isDisabled: kotlin.Boolean? = null

)


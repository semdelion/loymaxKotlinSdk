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

import loymax.sdk.models.KeyValuePairOfStringAndString

import com.squareup.moshi.Json

/**
 * Модель для сообщения через чатбота.
 *
 * @param text Текст.
 * @param additionalInfo Дополнительные параметры.
 * @param header Текст до изображения.
 * @param url Ссылка на изображение.
 */

data class MailingChatBotMessageViewModel (

    /* Текст. */
    @Json(name = "text")
    var text: kotlin.String? = null,

    /* Дополнительные параметры. */
    @Json(name = "additionalInfo")
    var additionalInfo: kotlin.collections.MutableList<KeyValuePairOfStringAndString>? = null,

    /* Текст до изображения. */
    @Json(name = "header")
    var header: kotlin.String? = null,

    /* Ссылка на изображение. */
    @Json(name = "url")
    var url: kotlin.String? = null

)


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

import loymax.sdk.models.NotificationMessageState

import com.squareup.moshi.Json

/**
 * ViewModel chatbot сообщения.
 *
 * @param id Идентификатор.
 * @param body Содержимое.
 * @param creationDate Дата создания.
 * @param changeDate Дата изменения.
 * @param gatewayId Шлюз.
 * @param sentTime Время отправки в шлюз.
 * @param recipient Получатель.
 * @param header Текст до изображения.
 * @param imageUrl Адрес изображения.
 * @param state 
 */

data class ChatBotMessageViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Содержимое. */
    @Json(name = "body")
    var body: kotlin.String? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Дата изменения. */
    @Json(name = "changeDate")
    var changeDate: java.time.OffsetDateTime? = null,

    /* Шлюз. */
    @Json(name = "gatewayId")
    var gatewayId: kotlin.Int? = null,

    /* Время отправки в шлюз. */
    @Json(name = "sentTime")
    var sentTime: java.time.OffsetDateTime? = null,

    /* Получатель. */
    @Json(name = "recipient")
    var recipient: kotlin.String? = null,

    /* Текст до изображения. */
    @Json(name = "header")
    var header: kotlin.String? = null,

    /* Адрес изображения. */
    @Json(name = "imageUrl")
    var imageUrl: kotlin.String? = null,

    @Json(name = "state")
    var state: NotificationMessageState? = null

)


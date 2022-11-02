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

import loymax.sdk.models.MessageType

import com.squareup.moshi.Json

/**
 * Действие акции \"Отправка сообщения\".
 *
 * @param order Порядковый номер действия в цепочке.
 * @param id Id действия в цепочке.
 * @param messageType 
 * @param templateMessage Шаблон сообщения.
 * @param shortText Короткий текст.
 * @param subject Заголовок.
 * @param imageId Идентификатор изображения.
 * @param buttonText Текст кнопки.
 * @param url URL страницы, на которую будет отправлен пользователь при нажатии на кнопку.
 * @param includeUnverifiedNotifiers Включать в рассылку неверифицированные нотификаторы или нет.
 */

data class SendMessageActionDto (

    /* Порядковый номер действия в цепочке. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Id действия в цепочке. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    @Json(name = "messageType")
    var messageType: MessageType? = null,

    /* Шаблон сообщения. */
    @Json(name = "templateMessage")
    var templateMessage: kotlin.String? = null,

    /* Короткий текст. */
    @Json(name = "shortText")
    var shortText: kotlin.String? = null,

    /* Заголовок. */
    @Json(name = "subject")
    var subject: kotlin.String? = null,

    /* Идентификатор изображения. */
    @Json(name = "imageId")
    var imageId: java.util.UUID? = null,

    /* Текст кнопки. */
    @Json(name = "buttonText")
    var buttonText: kotlin.String? = null,

    /* URL страницы, на которую будет отправлен пользователь при нажатии на кнопку. */
    @Json(name = "url")
    var url: kotlin.String? = null,

    /* Включать в рассылку неверифицированные нотификаторы или нет. */
    @Json(name = "includeUnverifiedNotifiers")
    var includeUnverifiedNotifiers: kotlin.Boolean? = null

)


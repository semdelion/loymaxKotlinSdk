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

import loymax.sdk.models.MailingSubscriptionType

import com.squareup.moshi.Json

/**
 * View Model для TemplateMessenger.
 *
 * @param id Идентификатор.
 * @param logicalName Уникальное логическое имя.
 * @param text Текст.
 * @param weight Вес шаблона.
 * @param subscriptionType 
 * @param isDeleted Флаг удаления.
 * @param canNotBeDeleted Может ли сущность быть удалена.
 * @param allowSendViaTestGateway Будет ли отправляться сообщение через тестовый шлюз.
 * @param buttonText Текст кнопки.
 * @param url URL страницы, на которую будет отправлен пользователь при нажатии на кнопку.
 */

data class TemplateMessengerViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Уникальное логическое имя. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null,

    /* Текст. */
    @Json(name = "text")
    var text: kotlin.String? = null,

    /* Вес шаблона. */
    @Json(name = "weight")
    var weight: kotlin.Int? = null,

    @Json(name = "subscriptionType")
    var subscriptionType: MailingSubscriptionType? = null,

    /* Флаг удаления. */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    /* Может ли сущность быть удалена. */
    @Json(name = "canNotBeDeleted")
    var canNotBeDeleted: kotlin.Boolean? = null,

    /* Будет ли отправляться сообщение через тестовый шлюз. */
    @Json(name = "allowSendViaTestGateway")
    var allowSendViaTestGateway: kotlin.Boolean? = null,

    /* Текст кнопки. */
    @Json(name = "buttonText")
    var buttonText: kotlin.String? = null,

    /* URL страницы, на которую будет отправлен пользователь при нажатии на кнопку. */
    @Json(name = "url")
    var url: kotlin.String? = null

)


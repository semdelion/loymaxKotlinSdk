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
 * View-модкль для Push уведомления.
 *
 * @param notificationId Идентификатор оповещения.
 * @param content Данные для уведомления.
 * @param shortText Короткий текст уведомления.
 * @param imageId Прикрепленное изображение.
 * @param imageUrl Url прикрепленного изображения.
 */

data class NotificationDetailsViewModel (

    /* Идентификатор оповещения. */
    @Json(name = "notificationId")
    var notificationId: kotlin.Int? = null,

    /* Данные для уведомления. */
    @Json(name = "content")
    var content: kotlin.String? = null,

    /* Короткий текст уведомления. */
    @Json(name = "shortText")
    var shortText: kotlin.String? = null,

    /* Прикрепленное изображение. */
    @Json(name = "imageId")
    var imageId: java.util.UUID? = null,

    /* Url прикрепленного изображения. */
    @Json(name = "imageUrl")
    var imageUrl: kotlin.String? = null

)


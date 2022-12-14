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
 * Количество уведомлений.
 *
 * @param unReadCount Количество непрочитанных уведомлений.
 */

data class NotificationsCountViewModel (

    /* Количество непрочитанных уведомлений. */
    @Json(name = "unReadCount")
    var unReadCount: kotlin.Int? = null

)


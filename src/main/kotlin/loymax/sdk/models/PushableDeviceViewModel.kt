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

import loymax.sdk.models.PlatformType

import com.squareup.moshi.Json

/**
 * Модель идентификатора.
 *
 * @param id Id устройства.
 * @param platform 
 * @param userAgent User-agent устройства.
 * @param changeDate Время изменения.
 * @param isInactive Является неактивным.
 */

data class PushableDeviceViewModel (

    /* Id устройства. */
    @Json(name = "id")
    var id: java.util.UUID? = null,

    @Json(name = "platform")
    var platform: PlatformType? = null,

    /* User-agent устройства. */
    @Json(name = "userAgent")
    var userAgent: kotlin.String? = null,

    /* Время изменения. */
    @Json(name = "changeDate")
    var changeDate: java.time.OffsetDateTime? = null,

    /* Является неактивным. */
    @Json(name = "isInactive")
    var isInactive: kotlin.Boolean? = null

)

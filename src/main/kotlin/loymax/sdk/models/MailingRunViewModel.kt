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
 * Модель запуска рассылки.
 *
 * @param planRunDate Плановая дата и время запуска.
 * @param ignoreUnidentifiedPhoneNumbers Запускать ли рассылку, даже если загружены номера, которых нет в системе.
 */

data class MailingRunViewModel (

    /* Плановая дата и время запуска. */
    @Json(name = "planRunDate")
    var planRunDate: java.time.OffsetDateTime? = null,

    /* Запускать ли рассылку, даже если загружены номера, которых нет в системе. */
    @Json(name = "ignoreUnidentifiedPhoneNumbers")
    var ignoreUnidentifiedPhoneNumbers: kotlin.Boolean? = null

)

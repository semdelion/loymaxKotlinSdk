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

import loymax.sdk.models.TimeIntervalRoundType
import loymax.sdk.models.TimeUnit

import com.squareup.moshi.Json

/**
 * Даты покупок в плавающем периоде.
 *
 * @param roundType 
 * @param timeUnit 
 * @param duration Продолжительность периода в единицах времени.
 */

data class PurchaseFilterDateInterval (

    @Json(name = "roundType")
    var roundType: TimeIntervalRoundType? = null,

    @Json(name = "timeUnit")
    var timeUnit: TimeUnit? = null,

    /* Продолжительность периода в единицах времени. */
    @Json(name = "duration")
    var duration: kotlin.Int? = null

)


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

import loymax.sdk.models.CalculationState

import com.squareup.moshi.Json

/**
 * 
 *
 * @param calculationState 
 * @param isAbleToCalculate 
 * @param calculationDate 
 * @param personsCount 
 * @param errorReason 
 * @param isCalculated 
 */

data class CalculationModel (

    @Json(name = "calculationState")
    var calculationState: CalculationState? = null,

    @Json(name = "isAbleToCalculate")
    var isAbleToCalculate: kotlin.Boolean? = null,

    @Json(name = "calculationDate")
    var calculationDate: java.time.OffsetDateTime? = null,

    @Json(name = "personsCount")
    var personsCount: kotlin.Int? = null,

    @Json(name = "errorReason")
    var errorReason: kotlin.String? = null,

    @Json(name = "isCalculated")
    var isCalculated: kotlin.Boolean? = null

)


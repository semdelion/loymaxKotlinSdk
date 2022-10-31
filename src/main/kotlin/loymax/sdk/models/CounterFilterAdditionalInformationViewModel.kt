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

import loymax.sdk.models.CounterOperationType
import loymax.sdk.models.CounterTarget

import com.squareup.moshi.Json

/**
 * View модель дополнительной информации для фильтра \"Счётчик\".
 *
 * @param counterTarget 
 * @param operation 
 * @param parameter Параметр.
 */

data class CounterFilterAdditionalInformationViewModel (

    @Json(name = "counterTarget")
    var counterTarget: CounterTarget? = null,

    @Json(name = "operation")
    var operation: CounterOperationType? = null,

    /* Параметр. */
    @Json(name = "parameter")
    var parameter: kotlin.String? = null

)


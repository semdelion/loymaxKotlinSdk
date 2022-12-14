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

import loymax.sdk.models.DeviceEmulationResultStateViewModel

import com.squareup.moshi.Json

/**
 * Модель баланса.
 *
 * @param amount Сумма.
 * @param currency Валюта.
 * @param resultStateModel 
 */

data class DeviceEmulationBalanceViewModel (

    /* Сумма. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Валюта. */
    @Json(name = "currency")
    var currency: kotlin.String? = null,

    @Json(name = "resultStateModel")
    var resultStateModel: DeviceEmulationResultStateViewModel? = null

)


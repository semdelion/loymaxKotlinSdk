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

import loymax.sdk.models.DeviceEmulationPurchaseParamViewModel

import com.squareup.moshi.Json

/**
 * Модель списка параметров чековой позиции или чека.
 *
 * @param params Список.
 */

data class DeviceEmulationPurchaseParamCollectionViewModel (

    /* Список. */
    @Json(name = "params")
    var params: kotlin.collections.MutableList<DeviceEmulationPurchaseParamViewModel>? = null

)


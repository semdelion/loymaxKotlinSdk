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

import loymax.sdk.models.DeviceEmulationCouponModel

import com.squareup.moshi.Json

/**
 * Модкль для создания купонов из списка.
 *
 * @param coupons Список купонов.
 */

data class DeviceEmulationCreateCouponsFromListModel (

    /* Список купонов. */
    @Json(name = "coupons")
    var coupons: kotlin.collections.MutableList<DeviceEmulationCouponModel>? = null

)

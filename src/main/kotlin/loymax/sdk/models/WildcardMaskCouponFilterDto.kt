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
 * Фильтр \"Фильтр купон по маске\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param wildcardMask Маска номера купона.
 */

data class WildcardMaskCouponFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Маска номера купона. */
    @Json(name = "wildcardMask")
    var wildcardMask: kotlin.String? = null

)


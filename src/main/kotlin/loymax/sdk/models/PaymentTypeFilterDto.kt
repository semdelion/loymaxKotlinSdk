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
 * Фильтр \"Тип карты\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param paymentTypesIds Список способов оплаты.
 */

data class PaymentTypeFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Список способов оплаты. */
    @Json(name = "paymentTypesIds")
    var paymentTypesIds: kotlin.collections.MutableList<kotlin.Int>? = null

)

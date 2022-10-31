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

import loymax.sdk.models.CurrencyViewModel
import loymax.sdk.models.FilterOperation
import loymax.sdk.models.PersonBalanceTypeFilter

import com.squareup.moshi.Json

/**
 * Фильтр по балансу пользователя.
 *
 * @param balanceType 
 * @param currency 
 * @param operation 
 * @param firstValue Первое значение.
 * @param secondValue Второе значение.
 * @param id 
 * @param name 
 * @param isDeletedFilterType 
 * @param processParameters 
 */

data class PersonBalanceFilterViewModel (

    @Json(name = "balanceType")
    var balanceType: PersonBalanceTypeFilter? = null,

    @Json(name = "currency")
    var currency: CurrencyViewModel? = null,

    @Json(name = "operation")
    var operation: FilterOperation? = null,

    /* Первое значение. */
    @Json(name = "firstValue")
    var firstValue: kotlin.Double? = null,

    /* Второе значение. */
    @Json(name = "secondValue")
    var secondValue: kotlin.Double? = null,

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "name")
    var name: kotlin.String? = null,

    @Json(name = "isDeletedFilterType")
    var isDeletedFilterType: kotlin.Boolean? = null,

    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null

)


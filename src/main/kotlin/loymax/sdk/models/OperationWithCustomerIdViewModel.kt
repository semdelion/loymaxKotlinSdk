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

import loymax.sdk.models.IdentifierType
import loymax.sdk.models.MoneyViewModel
import loymax.sdk.models.TransactionState

import com.squareup.moshi.Json

/**
 * Модель операции с идентификатором клиента.
 *
 * @param description Описание.
 * @param externalInfo Внешний идентификатор начисления/списания.
 * @param identifierType 
 * @param identifierValue Значение идентификатора клиента.
 * @param amount 
 * @param state 
 * @param customerId Идентификатор клиента.
 */

data class OperationWithCustomerIdViewModel (

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Внешний идентификатор начисления/списания. */
    @Json(name = "externalInfo")
    var externalInfo: kotlin.String? = null,

    @Json(name = "identifierType")
    var identifierType: IdentifierType? = null,

    /* Значение идентификатора клиента. */
    @Json(name = "identifierValue")
    var identifierValue: kotlin.String? = null,

    @Json(name = "amount")
    var amount: MoneyViewModel? = null,

    @Json(name = "state")
    var state: TransactionState? = null,

    /* Идентификатор клиента. */
    @Json(name = "customerId")
    var customerId: kotlin.Int? = null

)

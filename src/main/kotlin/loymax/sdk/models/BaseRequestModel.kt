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

import loymax.sdk.models.ChequeRequestModel
import loymax.sdk.models.ParamsRequestModel

import com.squareup.moshi.Json

/**
 * Модель запроса на выполнение операции.
 *
 * @param operationId Идентификатор операции.
 * @param operationDate Дата операции.
 * @param cashier Идентификатор кассира в текущем магазине (например ФИО).
 * @param cheque 
 * @param params 
 */

data class BaseRequestModel (

    /* Идентификатор операции. */
    @Json(name = "operationId")
    var operationId: kotlin.String? = null,

    /* Дата операции. */
    @Json(name = "operationDate")
    var operationDate: java.time.OffsetDateTime? = null,

    /* Идентификатор кассира в текущем магазине (например ФИО). */
    @Json(name = "cashier")
    var cashier: kotlin.String? = null,

    @Json(name = "cheque")
    var cheque: ChequeRequestModel? = null,

    @Json(name = "params")
    var params: ParamsRequestModel? = null

)

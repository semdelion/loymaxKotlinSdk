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

import loymax.sdk.models.ChequeResponseModel
import loymax.sdk.models.ErrorCode
import loymax.sdk.models.ItemDataModel
import loymax.sdk.models.LoyaltyProgramResponseModel

import com.squareup.moshi.Json

/**
 * Результат получения информации о количестве средств на счете держателя карты.
 *
 * @param transactionId Идентификатор операции на сервере Loymax.
 * @param deviceLogicalId Логическое имя устройства в системе Loymax.
 * @param operationId Идентификатор операции.
 * @param code 
 * @param errorMessage Комментарий ошибки.
 * @param cashierMessage Информация для вывода кассиру.
 * @param chequeMessage Информация для вывода клиенту в чек.
 * @param cheque 
 * @param loyaltyPrograms Информация о Программах лояльности.
 * @param identificationData Дополнительная информация.
 * @param amount Количество средств на счете держателя карты.
 * @param currency Сокращенное название валюты.
 * @param description Комментарий к счету.
 */

data class BalanceResultModel (

    /* Идентификатор операции на сервере Loymax. */
    @Json(name = "transactionId")
    var transactionId: kotlin.Long? = null,

    /* Логическое имя устройства в системе Loymax. */
    @Json(name = "deviceLogicalId")
    var deviceLogicalId: kotlin.String? = null,

    /* Идентификатор операции. */
    @Json(name = "operationId")
    var operationId: kotlin.String? = null,

    @Json(name = "code")
    var code: ErrorCode? = null,

    /* Комментарий ошибки. */
    @Json(name = "errorMessage")
    var errorMessage: kotlin.String? = null,

    /* Информация для вывода кассиру. */
    @Json(name = "cashierMessage")
    var cashierMessage: kotlin.String? = null,

    /* Информация для вывода клиенту в чек. */
    @Json(name = "chequeMessage")
    var chequeMessage: kotlin.String? = null,

    @Json(name = "cheque")
    var cheque: ChequeResponseModel? = null,

    /* Информация о Программах лояльности. */
    @Json(name = "loyaltyPrograms")
    var loyaltyPrograms: kotlin.collections.MutableList<LoyaltyProgramResponseModel>? = null,

    /* Дополнительная информация. */
    @Json(name = "identificationData")
    var identificationData: kotlin.collections.MutableList<ItemDataModel>? = null,

    /* Количество средств на счете держателя карты. */
    @Json(name = "amount")
    var amount: kotlin.Double? = null,

    /* Сокращенное название валюты. */
    @Json(name = "currency")
    var currency: kotlin.String? = null,

    /* Комментарий к счету. */
    @Json(name = "description")
    var description: kotlin.String? = null

)


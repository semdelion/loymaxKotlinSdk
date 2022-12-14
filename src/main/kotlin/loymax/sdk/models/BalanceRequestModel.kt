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

import loymax.sdk.models.GiftCertificateIdentifierModel

import com.squareup.moshi.Json

/**
 * Модель запроса на получение информации о количестве средств на счету держателя карты.
 *
 * @param operationId Идентификатор операции.
 * @param operationDate Дата операции.
 * @param giftCertificateIdentifierModel 
 */

data class BalanceRequestModel (

    /* Идентификатор операции. */
    @Json(name = "operationId")
    var operationId: kotlin.String? = null,

    /* Дата операции. */
    @Json(name = "operationDate")
    var operationDate: java.time.OffsetDateTime? = null,

    @Json(name = "giftCertificateIdentifierModel")
    var giftCertificateIdentifierModel: GiftCertificateIdentifierModel? = null

)


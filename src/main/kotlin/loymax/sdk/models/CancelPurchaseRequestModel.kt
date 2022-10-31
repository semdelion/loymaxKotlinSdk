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
 * Модель запроса на отмену покупки.
 *
 * @param operationId Идентификатор операции.
 * @param operationDate Дата операции.
 */

data class CancelPurchaseRequestModel (

    /* Идентификатор операции. */
    @Json(name = "operationId")
    var operationId: kotlin.String? = null,

    /* Дата операции. */
    @Json(name = "operationDate")
    var operationDate: java.time.OffsetDateTime? = null

)


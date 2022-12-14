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
 * Модель отклонения изменений акции.
 *
 * @param offerId Id акции.
 * @param reason Причина отклонения.
 */

data class RejectOfferChangesModel (

    /* Id акции. */
    @Json(name = "offerId")
    var offerId: kotlin.Int? = null,

    /* Причина отклонения. */
    @Json(name = "reason")
    var reason: kotlin.String? = null

)


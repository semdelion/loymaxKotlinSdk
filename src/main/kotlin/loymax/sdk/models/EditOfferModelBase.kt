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
 * Базовый класс для работы с акцией.
 *
 * @param offerId Id акции.
 */

data class EditOfferModelBase (

    /* Id акции. */
    @Json(name = "offerId")
    var offerId: kotlin.Int? = null

)


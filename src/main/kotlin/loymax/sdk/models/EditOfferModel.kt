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
 * Модель редактирования акции.
 *
 * @param offerId Id акции.
 * @param name Название акции.
 * @param description Описание акции.
 * @param isSum Флаг, указывающий, что акция суммируется с остальными.
 */

data class EditOfferModel (

    /* Id акции. */
    @Json(name = "offerId")
    var offerId: kotlin.Int? = null,

    /* Название акции. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Описание акции. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Флаг, указывающий, что акция суммируется с остальными. */
    @Json(name = "isSum")
    var isSum: kotlin.Boolean? = null

)

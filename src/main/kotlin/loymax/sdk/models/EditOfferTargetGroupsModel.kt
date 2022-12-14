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
 * Модель для редактирования списка ЦА для акции.
 *
 * @param offerId Id акции.
 * @param targetGroupIds Список Id целевых аудиторий.
 */

data class EditOfferTargetGroupsModel (

    /* Id акции. */
    @Json(name = "offerId")
    var offerId: kotlin.Int? = null,

    /* Список Id целевых аудиторий. */
    @Json(name = "targetGroupIds")
    var targetGroupIds: kotlin.collections.MutableList<kotlin.Int>? = null

)


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
 * Модель для изменения приоритета акции.
 *
 * @param priority Приоритет акции.
 */

data class EditOfferPriorityModel (

    /* Приоритет акции. */
    @Json(name = "priority")
    var priority: kotlin.Int? = null

)

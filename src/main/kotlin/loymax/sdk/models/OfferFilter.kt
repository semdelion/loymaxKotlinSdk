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

import loymax.sdk.models.CommunicationOfferState
import loymax.sdk.models.CommunicationOfferType
import loymax.sdk.models.OfferCategoryFilterType

import com.squareup.moshi.Json

/**
 * Фильтр акций.
 *
 * @param merchantId Id магазина.
 * @param offerState 
 * @param from Со скольки.
 * @param count Сколько.
 * @param type 
 * @param categoryFilterType 
 * @param categoryLogicalNames Логические имена категорий.
 */

data class OfferFilter (

    /* Id магазина. */
    @Json(name = "merchantId")
    var merchantId: kotlin.Int? = null,

    @Json(name = "offerState")
    var offerState: CommunicationOfferState? = null,

    /* Со скольки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Сколько. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    @Json(name = "type")
    var type: CommunicationOfferType? = null,

    @Json(name = "categoryFilterType")
    var categoryFilterType: OfferCategoryFilterType? = null,

    /* Логические имена категорий. */
    @Json(name = "categoryLogicalNames")
    var categoryLogicalNames: kotlin.collections.MutableList<kotlin.String>? = null

)

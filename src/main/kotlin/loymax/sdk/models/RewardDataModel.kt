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

import loymax.sdk.models.KeyValuePairOfInt32AndDecimal
import loymax.sdk.models.MoneyViewModel
import loymax.sdk.models.RewardDataType

import com.squareup.moshi.Json

/**
 * ViewModel данных о вознаграждении.
 *
 * @param amount 
 * @param positionInfo Распределение изменения баланса по позициям.
 * @param offerExternalId Идентификатор акции.
 * @param rewardType 
 * @param description Описание вознаграждения.
 */

data class RewardDataModel (

    @Json(name = "amount")
    var amount: MoneyViewModel? = null,

    /* Распределение изменения баланса по позициям. */
    @Json(name = "positionInfo")
    var positionInfo: kotlin.collections.MutableList<KeyValuePairOfInt32AndDecimal>? = null,

    /* Идентификатор акции. */
    @Json(name = "offerExternalId")
    var offerExternalId: kotlin.String? = null,

    @Json(name = "rewardType")
    var rewardType: RewardDataType? = null,

    /* Описание вознаграждения. */
    @Json(name = "description")
    var description: kotlin.String? = null

)


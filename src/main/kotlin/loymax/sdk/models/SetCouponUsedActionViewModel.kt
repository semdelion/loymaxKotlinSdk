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

import loymax.sdk.models.ActionTypeViewModel

import com.squareup.moshi.Json

/**
 * Модель для редактирования действия погашения купонов.
 *
 * @param actionId Id действия. Если указан, редактируется действие, иначе создается новое.
 * @param actionType 
 * @param order Порядок действия.
 */

data class SetCouponUsedActionViewModel (

    /* Id действия. Если указан, редактируется действие, иначе создается новое. */
    @Json(name = "actionId")
    var actionId: kotlin.Int? = null,

    @Json(name = "actionType")
    var actionType: ActionTypeViewModel? = null,

    /* Порядок действия. */
    @Json(name = "order")
    var order: kotlin.Int? = null

)


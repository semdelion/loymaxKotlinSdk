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
import loymax.sdk.models.CorrectionTypeDiscounts

import com.squareup.moshi.Json

/**
 * View модель действия \"Корректировка прямой скидки\".
 *
 * @param actionId Id действия. Если указан, редактируется действие, иначе создается новое.
 * @param actionType 
 * @param order Порядок действия.
 * @param roundValue Занчение округления в копейках.
 * @param correctionTypeDiscounts 
 */

data class CorrectionDiscountActionViewModel (

    /* Id действия. Если указан, редактируется действие, иначе создается новое. */
    @Json(name = "actionId")
    var actionId: kotlin.Int? = null,

    @Json(name = "actionType")
    var actionType: ActionTypeViewModel? = null,

    /* Порядок действия. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Занчение округления в копейках. */
    @Json(name = "roundValue")
    var roundValue: kotlin.Int? = null,

    @Json(name = "correctionTypeDiscounts")
    var correctionTypeDiscounts: CorrectionTypeDiscounts? = null

)


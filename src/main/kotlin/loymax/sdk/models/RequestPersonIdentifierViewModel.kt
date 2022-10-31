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

import loymax.sdk.models.IdentifierType
import loymax.sdk.models.LoyaltyProgramInfoViewModel

import com.squareup.moshi.Json

/**
 * Модель для отображения.
 *
 * @param id Идентификатор.
 * @param type 
 * @param mask Маска.
 * @param checkOrder Позиция.
 * @param replacePattern ReplacePattern.
 * @param partnerId Идентификатор партнера.
 * @param isDeleted Флаг логического удаления.
 * @param loyaltyProgram 
 */

data class RequestPersonIdentifierViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "type")
    var type: IdentifierType? = null,

    /* Маска. */
    @Json(name = "mask")
    var mask: kotlin.String? = null,

    /* Позиция. */
    @Json(name = "checkOrder")
    var checkOrder: kotlin.Int? = null,

    /* ReplacePattern. */
    @Json(name = "replacePattern")
    var replacePattern: kotlin.String? = null,

    /* Идентификатор партнера. */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* Флаг логического удаления. */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramInfoViewModel? = null

)


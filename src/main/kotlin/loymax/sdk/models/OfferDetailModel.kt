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

import loymax.sdk.models.FileViewModel
import loymax.sdk.models.RewardThumbnailModel

import com.squareup.moshi.Json

/**
 * Модель деталей акции.
 *
 * @param id Идентификатор.
 * @param rewardThumbnail 
 * @param title Заголовок.
 * @param description Описание.
 * @param image 
 */

data class OfferDetailModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    @Json(name = "rewardThumbnail")
    var rewardThumbnail: RewardThumbnailModel? = null,

    /* Заголовок. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "image")
    var image: FileViewModel? = null

)


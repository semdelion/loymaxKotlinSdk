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
 * Детальная информация, связанная с товаром.
 *
 * @param id Идентификатор детали.
 * @param rewardThumbnail Вознаграждение.
 * @param title Заголовок.
 * @param description Описание.
 * @param picture Изображение.
 * @param goodsId Идентификатор товара.
 */

data class GoodsDetailItem (

    /* Идентификатор детали. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Вознаграждение. */
    @Json(name = "rewardThumbnail")
    var rewardThumbnail: kotlin.Any? = null,

    /* Заголовок. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Изображение. */
    @Json(name = "picture")
    var picture: java.util.UUID? = null,

    /* Идентификатор товара. */
    @Json(name = "goodsId")
    var goodsId: kotlin.Int? = null

)


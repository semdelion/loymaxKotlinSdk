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

import loymax.sdk.models.ImageViewModel

import com.squareup.moshi.Json

/**
 * Общая модель бренда совместимая с API версии до 1.2 (значение поля Uid продублировано в поле Id).
 *
 * @param uid Внешний идентификатор бренда.
 * @param name Название бренда.
 * @param description Описание.
 * @param url Адрес сайта бренда.
 * @param images Изображения бренда.
 * @param id Идентификатор.
 */

data class BrandModelV12 (

    /* Внешний идентификатор бренда. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Название бренда. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Адрес сайта бренда. */
    @Json(name = "url")
    var url: kotlin.String? = null,

    /* Изображения бренда. */
    @Json(name = "images")
    var images: kotlin.collections.MutableList<ImageViewModel>? = null,

    /* Идентификатор. */
    @Json(name = "id")
    var id: java.util.UUID? = null

)

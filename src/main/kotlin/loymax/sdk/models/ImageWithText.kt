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
 * Изображение с текстом.
 *
 * @param header Текст над изображением.
 * @param footer Текст под изображением.
 * @param imageId Id файла с изображением.
 */

data class ImageWithText (

    /* Текст над изображением. */
    @Json(name = "header")
    var header: kotlin.String? = null,

    /* Текст под изображением. */
    @Json(name = "footer")
    var footer: kotlin.String? = null,

    /* Id файла с изображением. */
    @Json(name = "imageId")
    var imageId: java.util.UUID? = null

)

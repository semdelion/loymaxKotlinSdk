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
 * Модель файла.
 *
 * @param fileName Название файла.
 * @param fileSize Размер файла (в байтах).
 * @param content Содержимое файла в base64.
 * @param mimeType MIME-тип.
 */

data class FileViewModel (

    /* Название файла. */
    @Json(name = "fileName")
    var fileName: kotlin.String? = null,

    /* Размер файла (в байтах). */
    @Json(name = "fileSize")
    var fileSize: kotlin.Int? = null,

    /* Содержимое файла в base64. */
    @Json(name = "content")
    var content: kotlin.String? = null,

    /* MIME-тип. */
    @Json(name = "mimeType")
    var mimeType: kotlin.String? = null

)


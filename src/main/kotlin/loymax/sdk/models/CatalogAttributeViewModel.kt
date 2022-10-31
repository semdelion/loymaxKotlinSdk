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
 * Атрибут в каталоге товаров.
 *
 * @param id Id атрибута.
 * @param name Имя.
 */

data class CatalogAttributeViewModel (

    /* Id атрибута. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Имя. */
    @Json(name = "name")
    var name: kotlin.String? = null

)

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
 * Описание доступного значения.
 *
 * @param id Идентификатор элемента.
 * @param name Имя элемента.
 */

data class Item (

    /* Идентификатор элемента. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Имя элемента. */
    @Json(name = "name")
    var name: kotlin.String? = null

)

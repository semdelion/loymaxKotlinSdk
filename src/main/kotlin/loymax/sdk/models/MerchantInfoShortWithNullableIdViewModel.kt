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

import loymax.sdk.models.LocationData

import com.squareup.moshi.Json

/**
 * Сокращенная информация о магазине.
 *
 * @param id Идентификатор.
 * @param name Название.
 * @param internalName Внутреннее название.
 * @param isDeleted Признак архивности.
 * @param location 
 */

data class MerchantInfoShortWithNullableIdViewModel (

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Внутреннее название. */
    @Json(name = "internalName")
    var internalName: kotlin.String? = null,

    /* Признак архивности. */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    @Json(name = "location")
    var location: LocationData? = null

)


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

import loymax.sdk.models.AttributeType

import com.squareup.moshi.Json

/**
 * Модель атрибута сущности.
 *
 * @param id Внутренний идентификатор атрибута.
 * @param key Ключ атрибута.
 * @param type 
 */

data class EntityAttributeModel (

    /* Внутренний идентификатор атрибута. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Ключ атрибута. */
    @Json(name = "key")
    var key: kotlin.String? = null,

    @Json(name = "type")
    var type: AttributeType? = null

)


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
import loymax.sdk.models.EntityType

import com.squareup.moshi.Json

/**
 * Модель атрибутов сущности (со значениями атрибутов).
 *
 * @param id Внутренний идентификатор атрибута.
 * @param key Ключ атрибута.
 * @param `value` Значение атрибута.
 * @param entityType 
 * @param type 
 */

data class EntityAttributeWithValueModel (

    /* Внутренний идентификатор атрибута. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Ключ атрибута. */
    @Json(name = "key")
    var key: kotlin.String? = null,

    /* Значение атрибута. */
    @Json(name = "value")
    var `value`: kotlin.String? = null,

    @Json(name = "entityType")
    var entityType: EntityType? = null,

    @Json(name = "type")
    var type: AttributeType? = null

)

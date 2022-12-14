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

import loymax.sdk.models.AttributePartnerInfoModel

import com.squareup.moshi.Json

/**
 * Модель значений партнерских атрибутов пользователя.
 *
 * @param info 
 * @param `value` Значения атрибутов.
 */

data class AttributePartnerValueModel (

    @Json(name = "info")
    var info: AttributePartnerInfoModel? = null,

    /* Значения атрибутов. */
    @Json(name = "value")
    var `value`: kotlin.Any? = null

)


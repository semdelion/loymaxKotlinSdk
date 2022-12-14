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

import loymax.sdk.models.ParamModel

import com.squareup.moshi.Json

/**
 * Контейнер списка параметров.
 *
 * @param paramsList Список параметров.
 */

data class ParamsRequestModel (

    /* Список параметров. */
    @Json(name = "paramsList")
    var paramsList: kotlin.collections.MutableList<ParamModel>? = null

)


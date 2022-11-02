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
 * Фильтр \"Привязан E-Mail\".
 *
 * @param name Имя фильтра.
 * @param processParameters Параметры обработки.
 * @param emailBinded Привязан E-Mail или нет.
 */

data class EmailBindingFilterDto (

    /* Имя фильтра. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Параметры обработки. */
    @Json(name = "processParameters")
    var processParameters: kotlin.String? = null,

    /* Привязан E-Mail или нет. */
    @Json(name = "emailBinded")
    var emailBinded: kotlin.Boolean? = null

)


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
 * View модель целевой аудитории.
 *
 * @param id Id целевой аудитории.
 * @param name Имя.
 * @param isArchived Признак архивирования ЦА.
 */

data class TargetGroupBriefViewModel (

    /* Id целевой аудитории. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Имя. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Признак архивирования ЦА. */
    @Json(name = "isArchived")
    var isArchived: kotlin.Boolean? = null

)


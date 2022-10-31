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
 * Значение фильтра по булевому вопросу анкеты.
 *
 * @param `value` Булевое значение.
 */

data class QuestionnaireBoolFilterValue (

    /* Булевое значение. */
    @Json(name = "value")
    var `value`: kotlin.Boolean? = null

)


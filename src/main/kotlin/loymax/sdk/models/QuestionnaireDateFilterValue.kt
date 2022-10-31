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

import loymax.sdk.models.ComparisonOperator
import loymax.sdk.models.DateMode

import com.squareup.moshi.Json

/**
 * Значение фильтра по вопросу анкеты с датой.
 *
 * @param `operator` 
 * @param mode 
 * @param firstValueAsString Первое значение (pure xml).
 * @param secondValueAsString Второе значение (pure xml).
 * @param firstValue Первое значение.
 * @param secondValue Второе значение.
 */

data class QuestionnaireDateFilterValue (

    @Json(name = "operator")
    var `operator`: ComparisonOperator? = null,

    @Json(name = "mode")
    var mode: DateMode? = null,

    /* Первое значение (pure xml). */
    @Json(name = "firstValueAsString")
    var firstValueAsString: kotlin.String? = null,

    /* Второе значение (pure xml). */
    @Json(name = "secondValueAsString")
    var secondValueAsString: kotlin.String? = null,

    /* Первое значение. */
    @Json(name = "firstValue")
    var firstValue: java.time.OffsetDateTime? = null,

    /* Второе значение. */
    @Json(name = "secondValue")
    var secondValue: java.time.OffsetDateTime? = null

)

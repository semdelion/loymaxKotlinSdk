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
 * Временной период тип.
 *
 * Values: DATES,BEFORE_DATE,AFTER_DATE
 */

enum class DatePeriodType(val value: kotlin.String) {

    @Json(name = "Dates")
    DATES("Dates"),

    @Json(name = "BeforeDate")
    BEFORE_DATE("BeforeDate"),

    @Json(name = "AfterDate")
    AFTER_DATE("AfterDate");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DatePeriodType) "$data" else null

        /**
         * Returns a valid [DatePeriodType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DatePeriodType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


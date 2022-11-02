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
 * Gets or sets the operator.
 *
 * Values: MORE,LESS,EQUALS,BETWEEN,MORE_OR_EQUAL,LESS_OR_EQUAL,BETWEEN_LESS_EQUAL,BETWEEN_MORE_EQUAL,BETWEEN_EQUAL,EACH,IS_IN_LIST
 */

enum class ComparisonOperator(val value: kotlin.String) {

    @Json(name = "More")
    MORE("More"),

    @Json(name = "Less")
    LESS("Less"),

    @Json(name = "Equals")
    EQUALS("Equals"),

    @Json(name = "Between")
    BETWEEN("Between"),

    @Json(name = "MoreOrEqual")
    MORE_OR_EQUAL("MoreOrEqual"),

    @Json(name = "LessOrEqual")
    LESS_OR_EQUAL("LessOrEqual"),

    @Json(name = "BetweenLessEqual")
    BETWEEN_LESS_EQUAL("BetweenLessEqual"),

    @Json(name = "BetweenMoreEqual")
    BETWEEN_MORE_EQUAL("BetweenMoreEqual"),

    @Json(name = "BetweenEqual")
    BETWEEN_EQUAL("BetweenEqual"),

    @Json(name = "Each")
    EACH("Each"),

    @Json(name = "IsInList")
    IS_IN_LIST("IsInList");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ComparisonOperator) "$data" else null

        /**
         * Returns a valid [ComparisonOperator] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ComparisonOperator? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


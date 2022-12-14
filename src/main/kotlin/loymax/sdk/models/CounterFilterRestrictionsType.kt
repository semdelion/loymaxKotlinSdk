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
 * Тип ограничения.
 *
 * Values: VALUE,NUMBER_OF_VALUES,SUM_OF_CHANGES
 */

enum class CounterFilterRestrictionsType(val value: kotlin.String) {

    @Json(name = "Value")
    VALUE("Value"),

    @Json(name = "NumberOfValues")
    NUMBER_OF_VALUES("NumberOfValues"),

    @Json(name = "SumOfChanges")
    SUM_OF_CHANGES("SumOfChanges");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CounterFilterRestrictionsType) "$data" else null

        /**
         * Returns a valid [CounterFilterRestrictionsType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CounterFilterRestrictionsType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


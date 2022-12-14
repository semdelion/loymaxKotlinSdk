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
 * 
 *
 * Values: NOT_PROCESSED,PROCESSED,SUSPENDED,PROCESSED_WITH_ERROR
 */

enum class BatchState(val value: kotlin.String) {

    @Json(name = "NotProcessed")
    NOT_PROCESSED("NotProcessed"),

    @Json(name = "Processed")
    PROCESSED("Processed"),

    @Json(name = "Suspended")
    SUSPENDED("Suspended"),

    @Json(name = "ProcessedWithError")
    PROCESSED_WITH_ERROR("ProcessedWithError");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is BatchState) "$data" else null

        /**
         * Returns a valid [BatchState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): BatchState? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


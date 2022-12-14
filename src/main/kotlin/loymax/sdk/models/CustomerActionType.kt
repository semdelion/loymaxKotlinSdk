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
 * Values: SITE,SMS,OPERATOR,MOBILE_APPLICATION,IMPORT,PAPER
 */

enum class CustomerActionType(val value: kotlin.String) {

    @Json(name = "Site")
    SITE("Site"),

    @Json(name = "Sms")
    SMS("Sms"),

    @Json(name = "Operator")
    OPERATOR("Operator"),

    @Json(name = "MobileApplication")
    MOBILE_APPLICATION("MobileApplication"),

    @Json(name = "Import")
    IMPORT("Import"),

    @Json(name = "Paper")
    PAPER("Paper");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CustomerActionType) "$data" else null

        /**
         * Returns a valid [CustomerActionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CustomerActionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


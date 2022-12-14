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
 * Values: EMITTED,PACKED,ACTIVATED,REPLACED,CREATING,CREATED,PREPARED,ISSUED,EXPIRED
 */

enum class CardState(val value: kotlin.String) {

    @Json(name = "Emitted")
    EMITTED("Emitted"),

    @Json(name = "Packed")
    PACKED("Packed"),

    @Json(name = "Activated")
    ACTIVATED("Activated"),

    @Json(name = "Replaced")
    REPLACED("Replaced"),

    @Json(name = "Creating")
    CREATING("Creating"),

    @Json(name = "Created")
    CREATED("Created"),

    @Json(name = "Prepared")
    PREPARED("Prepared"),

    @Json(name = "Issued")
    ISSUED("Issued"),

    @Json(name = "Expired")
    EXPIRED("Expired");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CardState) "$data" else null

        /**
         * Returns a valid [CardState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CardState? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


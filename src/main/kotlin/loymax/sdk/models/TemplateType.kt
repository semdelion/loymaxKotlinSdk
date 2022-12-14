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
 * Values: HEADER_AND_TEXT,PUSH,SIMPLE,MESSENGER,SOCIAL_NETWORKS,CHAT_BOT
 */

enum class TemplateType(val value: kotlin.String) {

    @Json(name = "HeaderAndText")
    HEADER_AND_TEXT("HeaderAndText"),

    @Json(name = "Push")
    PUSH("Push"),

    @Json(name = "Simple")
    SIMPLE("Simple"),

    @Json(name = "Messenger")
    MESSENGER("Messenger"),

    @Json(name = "SocialNetworks")
    SOCIAL_NETWORKS("SocialNetworks"),

    @Json(name = "ChatBot")
    CHAT_BOT("ChatBot");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TemplateType) "$data" else null

        /**
         * Returns a valid [TemplateType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TemplateType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


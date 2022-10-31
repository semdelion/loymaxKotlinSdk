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
 * Values: sms,email,push,viber,socialsNetworks,chatBot
 */

enum class NotificationGatewayType(val value: kotlin.String) {

    @Json(name = "Sms")
    sms("Sms"),

    @Json(name = "Email")
    email("Email"),

    @Json(name = "Push")
    push("Push"),

    @Json(name = "Viber")
    viber("Viber"),

    @Json(name = "SocialsNetworks")
    socialsNetworks("SocialsNetworks"),

    @Json(name = "ChatBot")
    chatBot("ChatBot");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is NotificationGatewayType) "$data" else null

        /**
         * Returns a valid [NotificationGatewayType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): NotificationGatewayType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


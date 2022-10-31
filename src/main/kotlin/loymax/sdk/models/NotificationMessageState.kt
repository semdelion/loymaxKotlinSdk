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
 * Values: readyForSend,sent,criticalError,deliveryInProcess,deliveryOk,deliveryFailed,deliveryRead,deliveryUnknown,deleted,notSent
 */

enum class NotificationMessageState(val value: kotlin.String) {

    @Json(name = "ReadyForSend")
    readyForSend("ReadyForSend"),

    @Json(name = "Sent")
    sent("Sent"),

    @Json(name = "CriticalError")
    criticalError("CriticalError"),

    @Json(name = "DeliveryInProcess")
    deliveryInProcess("DeliveryInProcess"),

    @Json(name = "DeliveryOk")
    deliveryOk("DeliveryOk"),

    @Json(name = "DeliveryFailed")
    deliveryFailed("DeliveryFailed"),

    @Json(name = "DeliveryRead")
    deliveryRead("DeliveryRead"),

    @Json(name = "DeliveryUnknown")
    deliveryUnknown("DeliveryUnknown"),

    @Json(name = "Deleted")
    deleted("Deleted"),

    @Json(name = "NotSent")
    notSent("NotSent");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is NotificationMessageState) "$data" else null

        /**
         * Returns a valid [NotificationMessageState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): NotificationMessageState? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

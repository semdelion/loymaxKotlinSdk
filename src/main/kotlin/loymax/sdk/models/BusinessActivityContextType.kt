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
 * Values: unknown,deviceRequest,showcasePurchase,userDateTimeEvent,bonusLifeTimeEvent,changeNotifier,registrationEnd,linkCard,changeCardState,smsRegistration,questionnaireUpdate,externalCardReplace,pushDeviceRegistration,sendPasswordToCheque,purchaseOperation,socialNetworkAction,manualPayOperation,referralActivity,userDeregistration,personStatusChange,giftCertificateOperation,statusSystemCalculation,customerBeginRegistration,batchClientImport,customerRegistration,linkAccount
 */

enum class BusinessActivityContextType(val value: kotlin.String) {

    @Json(name = "Unknown")
    unknown("Unknown"),

    @Json(name = "DeviceRequest")
    deviceRequest("DeviceRequest"),

    @Json(name = "ShowcasePurchase")
    showcasePurchase("ShowcasePurchase"),

    @Json(name = "UserDateTimeEvent")
    userDateTimeEvent("UserDateTimeEvent"),

    @Json(name = "BonusLifeTimeEvent")
    bonusLifeTimeEvent("BonusLifeTimeEvent"),

    @Json(name = "ChangeNotifier")
    changeNotifier("ChangeNotifier"),

    @Json(name = "RegistrationEnd")
    registrationEnd("RegistrationEnd"),

    @Json(name = "LinkCard")
    linkCard("LinkCard"),

    @Json(name = "ChangeCardState")
    changeCardState("ChangeCardState"),

    @Json(name = "SmsRegistration")
    smsRegistration("SmsRegistration"),

    @Json(name = "QuestionnaireUpdate")
    questionnaireUpdate("QuestionnaireUpdate"),

    @Json(name = "ExternalCardReplace")
    externalCardReplace("ExternalCardReplace"),

    @Json(name = "PushDeviceRegistration")
    pushDeviceRegistration("PushDeviceRegistration"),

    @Json(name = "SendPasswordToCheque")
    sendPasswordToCheque("SendPasswordToCheque"),

    @Json(name = "PurchaseOperation")
    purchaseOperation("PurchaseOperation"),

    @Json(name = "SocialNetworkAction")
    socialNetworkAction("SocialNetworkAction"),

    @Json(name = "ManualPayOperation")
    manualPayOperation("ManualPayOperation"),

    @Json(name = "ReferralActivity")
    referralActivity("ReferralActivity"),

    @Json(name = "UserDeregistration")
    userDeregistration("UserDeregistration"),

    @Json(name = "PersonStatusChange")
    personStatusChange("PersonStatusChange"),

    @Json(name = "GiftCertificateOperation")
    giftCertificateOperation("GiftCertificateOperation"),

    @Json(name = "StatusSystemCalculation")
    statusSystemCalculation("StatusSystemCalculation"),

    @Json(name = "CustomerBeginRegistration")
    customerBeginRegistration("CustomerBeginRegistration"),

    @Json(name = "BatchClientImport")
    batchClientImport("BatchClientImport"),

    @Json(name = "CustomerRegistration")
    customerRegistration("CustomerRegistration"),

    @Json(name = "LinkAccount")
    linkAccount("LinkAccount");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is BusinessActivityContextType) "$data" else null

        /**
         * Returns a valid [BusinessActivityContextType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): BusinessActivityContextType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

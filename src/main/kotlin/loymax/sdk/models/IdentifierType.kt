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
 * Values: CARD_NUMBER,LOGIN,CARD_BAR_CODE,CARD_TRACK1,CARD_TRACK2,CARD_TRACK3,UID,DATA,ANONYMOUS,PHONE,EMAIL,O_AUTH,O_AUTH_APPLICATION,COUPON,PARTNER_COUPON,PHONE_HASH,APPLE_WALLET_CARD,GPAY_WALLET_CARD,QR_CODE,PERSON_UID,GIFT_CERTIFICATE_NUMBER,GIFT_CERTIFICATE_BARCODE,GIFT_CERTIFICATE_TRACK1,GIFT_CERTIFICATE_TRACK2,GIFT_CERTIFICATE_TRACK3,GIFT_CERTIFICATE_QR_CODE
 */

enum class IdentifierType(val value: kotlin.String) {

    @Json(name = "CardNumber")
    CARD_NUMBER("CardNumber"),

    @Json(name = "Login")
    LOGIN("Login"),

    @Json(name = "CardBarCode")
    CARD_BAR_CODE("CardBarCode"),

    @Json(name = "CardTrack1")
    CARD_TRACK1("CardTrack1"),

    @Json(name = "CardTrack2")
    CARD_TRACK2("CardTrack2"),

    @Json(name = "CardTrack3")
    CARD_TRACK3("CardTrack3"),

    @Json(name = "UID")
    UID("UID"),

    @Json(name = "Data")
    DATA("Data"),

    @Json(name = "Anonymous")
    ANONYMOUS("Anonymous"),

    @Json(name = "Phone")
    PHONE("Phone"),

    @Json(name = "Email")
    EMAIL("Email"),

    @Json(name = "OAuth")
    O_AUTH("OAuth"),

    @Json(name = "OAuthApplication")
    O_AUTH_APPLICATION("OAuthApplication"),

    @Json(name = "Coupon")
    COUPON("Coupon"),

    @Json(name = "PartnerCoupon")
    PARTNER_COUPON("PartnerCoupon"),

    @Json(name = "PhoneHash")
    PHONE_HASH("PhoneHash"),

    @Json(name = "AppleWalletCard")
    APPLE_WALLET_CARD("AppleWalletCard"),

    @Json(name = "GpayWalletCard")
    GPAY_WALLET_CARD("GpayWalletCard"),

    @Json(name = "QrCode")
    QR_CODE("QrCode"),

    @Json(name = "PersonUID")
    PERSON_UID("PersonUID"),

    @Json(name = "GiftCertificateNumber")
    GIFT_CERTIFICATE_NUMBER("GiftCertificateNumber"),

    @Json(name = "GiftCertificateBarcode")
    GIFT_CERTIFICATE_BARCODE("GiftCertificateBarcode"),

    @Json(name = "GiftCertificateTrack1")
    GIFT_CERTIFICATE_TRACK1("GiftCertificateTrack1"),

    @Json(name = "GiftCertificateTrack2")
    GIFT_CERTIFICATE_TRACK2("GiftCertificateTrack2"),

    @Json(name = "GiftCertificateTrack3")
    GIFT_CERTIFICATE_TRACK3("GiftCertificateTrack3"),

    @Json(name = "GiftCertificateQrCode")
    GIFT_CERTIFICATE_QR_CODE("GiftCertificateQrCode");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is IdentifierType) "$data" else null

        /**
         * Returns a valid [IdentifierType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): IdentifierType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


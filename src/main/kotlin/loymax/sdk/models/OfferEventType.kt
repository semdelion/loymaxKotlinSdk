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
 * Values: ON_PURCHASE_CALCULATE,ON_ATTACH_PHONE,ON_PURCHASE_CONFIRM,ON_PURCHASE_PAYMENT,ON_BALANCE_REQUEST,ON_CARD_ISSUE,ON_CARD_ACTIVATION,ON_SOCIAL_ACTIVITY,ON_SOCIAL_GROUP_JOIN,ON_FRIEND_INVITE,ON_SOCIAL_GROUP_LEAVE,ON_QUESTIONNAIRE_UPDATE,ON_MOBILE_APP_INSTALL,ON_END_PERSON_REGISTRATION,ON_SOCIAL_NETWORK_LINK,ON_BONUS_LIFETIME_EXPIRED,ON_BIRTHDAY,ON_PURCHASE_REFUND,ON_REFERRAL_PURCHASE,ON_PURCHASE_CANCEL,ON_REMOVE_SOCIAL_ACTIVITY,ON_PURCHASE_DISCOUNT,ON_SEND_PASSWORD_TO_CHEQUE,ON_GOODS_SET_PROCESS,ON_ATTACH_EMAIL,ON_BONUS_LIFETIME_ACTIVATION,ON_PURCHASE_PAYMENT_CALCULATE,ON_PURCHASE_PAYMENT_CANCEL,ON_COUPON_PURCHASED,ON_COUPON_REFUNDED,ON_PURCHASE_DEPOSIT,ON_CARD_ATTACH,ON_CARD_REPLACE,ON_EXTERNAL_CARD_REPLACE,ON_PURCHASE_REFUND_CALCULATE,ON_MANUAL_CHARGE,ON_MANUAL_WITHDRAW,ON_ITERATOR_PROCESS,ON_PERSON_STATUS_CHANGE,ON_GIFT_CERTIFICATE_SALE,ON_GIFT_CERTIFICATE_PAYMENT,ON_GIFT_CERTIFICATE_REFUND,ON_GIFT_CERTIFICATE_PAYMENT_CANCEL,ON_STATUS_SYSTEM_CALCULATION,ON_BEGIN_REGISTRATION,ON_CUSTOMER_ATTRIBUTE_UPDATE,ON_CUSTOMER_SUBSCRIPTION_CHANGE,ON_CARD_SET,ON_BLOCK_CARD,ON_UNBLOCK_CARD,ON_DELETE_CARD,ON_RECOVER_CARD,MERGE_CUSTOMERS_PROFILES,ON_CARD_CATEGORY_CHANGE,ON_CUSTOMER_STATE_CHANGE,LINK_ACCOUNT
 */

enum class OfferEventType(val value: kotlin.String) {

    @Json(name = "OnPurchaseCalculate")
    ON_PURCHASE_CALCULATE("OnPurchaseCalculate"),

    @Json(name = "OnAttachPhone")
    ON_ATTACH_PHONE("OnAttachPhone"),

    @Json(name = "OnPurchaseConfirm")
    ON_PURCHASE_CONFIRM("OnPurchaseConfirm"),

    @Json(name = "OnPurchasePayment")
    ON_PURCHASE_PAYMENT("OnPurchasePayment"),

    @Json(name = "OnBalanceRequest")
    ON_BALANCE_REQUEST("OnBalanceRequest"),

    @Json(name = "OnCardIssue")
    ON_CARD_ISSUE("OnCardIssue"),

    @Json(name = "OnCardActivation")
    ON_CARD_ACTIVATION("OnCardActivation"),

    @Json(name = "OnSocialActivity")
    ON_SOCIAL_ACTIVITY("OnSocialActivity"),

    @Json(name = "OnSocialGroupJoin")
    ON_SOCIAL_GROUP_JOIN("OnSocialGroupJoin"),

    @Json(name = "OnFriendInvite")
    ON_FRIEND_INVITE("OnFriendInvite"),

    @Json(name = "OnSocialGroupLeave")
    ON_SOCIAL_GROUP_LEAVE("OnSocialGroupLeave"),

    @Json(name = "OnQuestionnaireUpdate")
    ON_QUESTIONNAIRE_UPDATE("OnQuestionnaireUpdate"),

    @Json(name = "OnMobileAppInstall")
    ON_MOBILE_APP_INSTALL("OnMobileAppInstall"),

    @Json(name = "OnEndPersonRegistration")
    ON_END_PERSON_REGISTRATION("OnEndPersonRegistration"),

    @Json(name = "OnSocialNetworkLink")
    ON_SOCIAL_NETWORK_LINK("OnSocialNetworkLink"),

    @Json(name = "OnBonusLifetimeExpired")
    ON_BONUS_LIFETIME_EXPIRED("OnBonusLifetimeExpired"),

    @Json(name = "OnBirthday")
    ON_BIRTHDAY("OnBirthday"),

    @Json(name = "OnPurchaseRefund")
    ON_PURCHASE_REFUND("OnPurchaseRefund"),

    @Json(name = "OnReferralPurchase")
    ON_REFERRAL_PURCHASE("OnReferralPurchase"),

    @Json(name = "OnPurchaseCancel")
    ON_PURCHASE_CANCEL("OnPurchaseCancel"),

    @Json(name = "OnRemoveSocialActivity")
    ON_REMOVE_SOCIAL_ACTIVITY("OnRemoveSocialActivity"),

    @Json(name = "OnPurchaseDiscount")
    ON_PURCHASE_DISCOUNT("OnPurchaseDiscount"),

    @Json(name = "OnSendPasswordToCheque")
    ON_SEND_PASSWORD_TO_CHEQUE("OnSendPasswordToCheque"),

    @Json(name = "OnGoodsSetProcess")
    ON_GOODS_SET_PROCESS("OnGoodsSetProcess"),

    @Json(name = "OnAttachEmail")
    ON_ATTACH_EMAIL("OnAttachEmail"),

    @Json(name = "OnBonusLifetimeActivation")
    ON_BONUS_LIFETIME_ACTIVATION("OnBonusLifetimeActivation"),

    @Json(name = "OnPurchasePaymentCalculate")
    ON_PURCHASE_PAYMENT_CALCULATE("OnPurchasePaymentCalculate"),

    @Json(name = "OnPurchasePaymentCancel")
    ON_PURCHASE_PAYMENT_CANCEL("OnPurchasePaymentCancel"),

    @Json(name = "OnCouponPurchased")
    ON_COUPON_PURCHASED("OnCouponPurchased"),

    @Json(name = "OnCouponRefunded")
    ON_COUPON_REFUNDED("OnCouponRefunded"),

    @Json(name = "OnPurchaseDeposit")
    ON_PURCHASE_DEPOSIT("OnPurchaseDeposit"),

    @Json(name = "OnCardAttach")
    ON_CARD_ATTACH("OnCardAttach"),

    @Json(name = "OnCardReplace")
    ON_CARD_REPLACE("OnCardReplace"),

    @Json(name = "OnExternalCardReplace")
    ON_EXTERNAL_CARD_REPLACE("OnExternalCardReplace"),

    @Json(name = "OnPurchaseRefundCalculate")
    ON_PURCHASE_REFUND_CALCULATE("OnPurchaseRefundCalculate"),

    @Json(name = "OnManualCharge")
    ON_MANUAL_CHARGE("OnManualCharge"),

    @Json(name = "OnManualWithdraw")
    ON_MANUAL_WITHDRAW("OnManualWithdraw"),

    @Json(name = "OnIteratorProcess")
    ON_ITERATOR_PROCESS("OnIteratorProcess"),

    @Json(name = "OnPersonStatusChange")
    ON_PERSON_STATUS_CHANGE("OnPersonStatusChange"),

    @Json(name = "OnGiftCertificateSale")
    ON_GIFT_CERTIFICATE_SALE("OnGiftCertificateSale"),

    @Json(name = "OnGiftCertificatePayment")
    ON_GIFT_CERTIFICATE_PAYMENT("OnGiftCertificatePayment"),

    @Json(name = "OnGiftCertificateRefund")
    ON_GIFT_CERTIFICATE_REFUND("OnGiftCertificateRefund"),

    @Json(name = "OnGiftCertificatePaymentCancel")
    ON_GIFT_CERTIFICATE_PAYMENT_CANCEL("OnGiftCertificatePaymentCancel"),

    @Json(name = "OnStatusSystemCalculation")
    ON_STATUS_SYSTEM_CALCULATION("OnStatusSystemCalculation"),

    @Json(name = "OnBeginRegistration")
    ON_BEGIN_REGISTRATION("OnBeginRegistration"),

    @Json(name = "OnCustomerAttributeUpdate")
    ON_CUSTOMER_ATTRIBUTE_UPDATE("OnCustomerAttributeUpdate"),

    @Json(name = "OnCustomerSubscriptionChange")
    ON_CUSTOMER_SUBSCRIPTION_CHANGE("OnCustomerSubscriptionChange"),

    @Json(name = "OnCardSet")
    ON_CARD_SET("OnCardSet"),

    @Json(name = "OnBlockCard")
    ON_BLOCK_CARD("OnBlockCard"),

    @Json(name = "OnUnblockCard")
    ON_UNBLOCK_CARD("OnUnblockCard"),

    @Json(name = "OnDeleteCard")
    ON_DELETE_CARD("OnDeleteCard"),

    @Json(name = "OnRecoverCard")
    ON_RECOVER_CARD("OnRecoverCard"),

    @Json(name = "MergeCustomersProfiles")
    MERGE_CUSTOMERS_PROFILES("MergeCustomersProfiles"),

    @Json(name = "OnCardCategoryChange")
    ON_CARD_CATEGORY_CHANGE("OnCardCategoryChange"),

    @Json(name = "OnCustomerStateChange")
    ON_CUSTOMER_STATE_CHANGE("OnCustomerStateChange"),

    @Json(name = "LinkAccount")
    LINK_ACCOUNT("LinkAccount");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferEventType) "$data" else null

        /**
         * Returns a valid [OfferEventType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OfferEventType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


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
 * Вид действия.
 *
 * Values: acceptTenderOffer,changePhone,questions,attachCard,showMessage,changeEmail,resetPassword,deleteCard,replaceCard,changePassword,blockCard,unblockCard,passwordRequired,assignCard,acceptSubscriptionsConfirm
 */

enum class UserActionType(val value: kotlin.String) {

    @Json(name = "AcceptTenderOffer")
    acceptTenderOffer("AcceptTenderOffer"),

    @Json(name = "ChangePhone")
    changePhone("ChangePhone"),

    @Json(name = "Questions")
    questions("Questions"),

    @Json(name = "AttachCard")
    attachCard("AttachCard"),

    @Json(name = "ShowMessage")
    showMessage("ShowMessage"),

    @Json(name = "ChangeEmail")
    changeEmail("ChangeEmail"),

    @Json(name = "ResetPassword")
    resetPassword("ResetPassword"),

    @Json(name = "DeleteCard")
    deleteCard("DeleteCard"),

    @Json(name = "ReplaceCard")
    replaceCard("ReplaceCard"),

    @Json(name = "ChangePassword")
    changePassword("ChangePassword"),

    @Json(name = "BlockCard")
    blockCard("BlockCard"),

    @Json(name = "UnblockCard")
    unblockCard("UnblockCard"),

    @Json(name = "PasswordRequired")
    passwordRequired("PasswordRequired"),

    @Json(name = "AssignCard")
    assignCard("AssignCard"),

    @Json(name = "AcceptSubscriptionsConfirm")
    acceptSubscriptionsConfirm("AcceptSubscriptionsConfirm");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is UserActionType) "$data" else null

        /**
         * Returns a valid [UserActionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): UserActionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

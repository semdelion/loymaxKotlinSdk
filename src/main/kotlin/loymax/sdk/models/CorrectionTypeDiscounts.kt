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
 * Тип распределения скидки между позициями.
 *
 * Values: ALL_CHEQUE,WITHOUT_DISCOUNT,HIGH_PRICE
 */

enum class CorrectionTypeDiscounts(val value: kotlin.String) {

    @Json(name = "AllCheque")
    ALL_CHEQUE("AllCheque"),

    @Json(name = "WithoutDiscount")
    WITHOUT_DISCOUNT("WithoutDiscount"),

    @Json(name = "HighPrice")
    HIGH_PRICE("HighPrice");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CorrectionTypeDiscounts) "$data" else null

        /**
         * Returns a valid [CorrectionTypeDiscounts] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CorrectionTypeDiscounts? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


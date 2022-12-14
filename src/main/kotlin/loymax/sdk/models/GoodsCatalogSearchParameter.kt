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
 * Values: NAME,ITEM_ID,BAR_CODE
 */

enum class GoodsCatalogSearchParameter(val value: kotlin.String) {

    @Json(name = "Name")
    NAME("Name"),

    @Json(name = "ItemId")
    ITEM_ID("ItemId"),

    @Json(name = "BarCode")
    BAR_CODE("BarCode");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is GoodsCatalogSearchParameter) "$data" else null

        /**
         * Returns a valid [GoodsCatalogSearchParameter] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): GoodsCatalogSearchParameter? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


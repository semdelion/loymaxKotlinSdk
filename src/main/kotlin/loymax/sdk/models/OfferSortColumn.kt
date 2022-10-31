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
 * Values: priority,name,beginTime,endTime,state,attachDate,creationDate,changeDate
 */

enum class OfferSortColumn(val value: kotlin.String) {

    @Json(name = "Priority")
    priority("Priority"),

    @Json(name = "Name")
    name("Name"),

    @Json(name = "BeginTime")
    beginTime("BeginTime"),

    @Json(name = "EndTime")
    endTime("EndTime"),

    @Json(name = "State")
    state("State"),

    @Json(name = "AttachDate")
    attachDate("AttachDate"),

    @Json(name = "CreationDate")
    creationDate("CreationDate"),

    @Json(name = "ChangeDate")
    changeDate("ChangeDate");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferSortColumn) "$data" else null

        /**
         * Returns a valid [OfferSortColumn] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OfferSortColumn? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


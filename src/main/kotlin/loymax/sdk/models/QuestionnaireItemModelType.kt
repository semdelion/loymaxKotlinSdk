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
 * Тип.
 *
 * Values: QUESTION,QUESTION_GROUP,QUESTION_FIXED_ANSWER,QUESTION_MULTIPLE_GROUP,ANSWERS
 */

enum class QuestionnaireItemModelType(val value: kotlin.String) {

    @Json(name = "Question")
    QUESTION("Question"),

    @Json(name = "QuestionGroup")
    QUESTION_GROUP("QuestionGroup"),

    @Json(name = "QuestionFixedAnswer")
    QUESTION_FIXED_ANSWER("QuestionFixedAnswer"),

    @Json(name = "QuestionMultipleGroup")
    QUESTION_MULTIPLE_GROUP("QuestionMultipleGroup"),

    @Json(name = "Answers")
    ANSWERS("Answers");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is QuestionnaireItemModelType) "$data" else null

        /**
         * Returns a valid [QuestionnaireItemModelType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): QuestionnaireItemModelType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}


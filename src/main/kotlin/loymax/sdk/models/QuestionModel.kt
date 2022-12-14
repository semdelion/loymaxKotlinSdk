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

import loymax.sdk.models.QuestionAnswerModel
import loymax.sdk.models.QuestionFixedAnswerModel
import loymax.sdk.models.QuestionModelType
import loymax.sdk.models.QuestionnaireItemModelType

import com.squareup.moshi.Json

/**
 * Модель вопроса.
 *
 * @param type 
 * @param id Идентификатор.
 * @param name Название.
 * @param order Порядок.
 * @param questionType 
 * @param logicalName Логическое имя.
 * @param regexp Регулярное выражение для дополнительной валидации.
 * @param regexpErrorMessage Сообщение в случае не удачной валидации через регулярное выражение.
 * @param isRequired Обязательный.
 * @param isReadOnly Только для чтения.
 * @param isMultiSelect Множественный выбор.
 * @param fixedAnswers Фиксированные ответы.
 * @param answer 
 * @param isVisibleInRegistration Видимый при регистрации.
 */

data class QuestionModel (

    @Json(name = "type")
    var type: QuestionnaireItemModelType? = null,

    /* Идентификатор. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Порядок. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    @Json(name = "questionType")
    var questionType: QuestionModelType? = null,

    /* Логическое имя. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null,

    /* Регулярное выражение для дополнительной валидации. */
    @Json(name = "regexp")
    var regexp: kotlin.String? = null,

    /* Сообщение в случае не удачной валидации через регулярное выражение. */
    @Json(name = "regexpErrorMessage")
    var regexpErrorMessage: kotlin.String? = null,

    /* Обязательный. */
    @Json(name = "isRequired")
    var isRequired: kotlin.Boolean? = null,

    /* Только для чтения. */
    @Json(name = "isReadOnly")
    var isReadOnly: kotlin.Boolean? = null,

    /* Множественный выбор. */
    @Json(name = "isMultiSelect")
    var isMultiSelect: kotlin.Boolean? = null,

    /* Фиксированные ответы. */
    @Json(name = "fixedAnswers")
    var fixedAnswers: kotlin.collections.MutableList<QuestionFixedAnswerModel>? = null,

    @Json(name = "answer")
    var answer: QuestionAnswerModel? = null,

    /* Видимый при регистрации. */
    @Json(name = "isVisibleInRegistration")
    var isVisibleInRegistration: kotlin.Boolean? = null

)


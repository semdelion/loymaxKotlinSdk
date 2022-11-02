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

import loymax.sdk.models.QuestionnaireItemModelType

import com.squareup.moshi.Json

/**
 * Модель фиксированного ответа.
 *
 * @param type 
 * @param id Идентификатор.
 * @param name Название.
 * @param order Порядок.
 * @param isCustom Пользовательский.
 * @param isSelected Выбран.
 */

data class QuestionFixedAnswerModel (

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

    /* Пользовательский. */
    @Json(name = "isCustom")
    var isCustom: kotlin.Boolean? = null,

    /* Выбран. */
    @Json(name = "isSelected")
    var isSelected: kotlin.Boolean? = null

)


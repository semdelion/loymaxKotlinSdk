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

import loymax.sdk.models.AnketaQuestionViewModelItem
import loymax.sdk.models.QuestionType

import com.squareup.moshi.Json

/**
 * Модель вопроса анкеты.
 *
 * @param id Внутренний идентификатор вопроса анкеты.
 * @param displayName Вопрос (отображаемое название).
 * @param type 
 * @param isArchived Признак состояния вопроса (true — архивный, false — неархивный).
 * @param items Доступные значения (для типов с выбором значений).
 */

data class AnketaQuestionViewModel (

    /* Внутренний идентификатор вопроса анкеты. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Вопрос (отображаемое название). */
    @Json(name = "displayName")
    var displayName: kotlin.String? = null,

    @Json(name = "type")
    var type: QuestionType? = null,

    /* Признак состояния вопроса (true — архивный, false — неархивный). */
    @Json(name = "isArchived")
    var isArchived: kotlin.Boolean? = null,

    /* Доступные значения (для типов с выбором значений). */
    @Json(name = "items")
    var items: kotlin.collections.MutableList<AnketaQuestionViewModelItem>? = null

)

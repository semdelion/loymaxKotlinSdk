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

import loymax.sdk.models.BookletEmissionState

import com.squareup.moshi.Json

/**
 * View модель выпуска буклетов.
 *
 * @param id Id.
 * @param number Номер.
 * @param description Описание.
 * @param count Количество.
 * @param prefix Префикс.
 * @param state 
 * @param templateId Id шаблона.
 * @param templateText Текст шаблона.
 * @param loyaltyProgramId Идентификатор программы лояльности.
 */

data class BookletEmissionViewModel (

    /* Id. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Номер. */
    @Json(name = "number")
    var number: kotlin.Int? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Количество. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Префикс. */
    @Json(name = "prefix")
    var prefix: kotlin.Int? = null,

    @Json(name = "state")
    var state: BookletEmissionState? = null,

    /* Id шаблона. */
    @Json(name = "templateId")
    var templateId: kotlin.Int? = null,

    /* Текст шаблона. */
    @Json(name = "templateText")
    var templateText: kotlin.String? = null,

    /* Идентификатор программы лояльности. */
    @Json(name = "loyaltyProgramId")
    var loyaltyProgramId: kotlin.Int? = null

)


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
 * Действие \"Обновление персонального предложения\".
 *
 * @param order Порядковый номер действия в цепочке.
 * @param id Id действия в цепочке.
 * @param attributeName Логическое имя атрибута.
 */

data class PersonalOfferUpdateActionDto (

    /* Порядковый номер действия в цепочке. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Id действия в цепочке. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Логическое имя атрибута. */
    @Json(name = "attributeName")
    var attributeName: kotlin.String? = null

)


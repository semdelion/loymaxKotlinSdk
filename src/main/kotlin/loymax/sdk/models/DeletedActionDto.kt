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
 * Удаленное действие.
 *
 * @param order Порядковый номер действия в цепочке.
 * @param id Id действия в цепочке.
 * @param logicalName Шаблон сообщения.
 * @param name Шаблон сообщения.
 */

data class DeletedActionDto (

    /* Порядковый номер действия в цепочке. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Id действия в цепочке. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Шаблон сообщения. */
    @Json(name = "logicalName")
    var logicalName: kotlin.String? = null,

    /* Шаблон сообщения. */
    @Json(name = "name")
    var name: kotlin.String? = null

)

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
 * Информация о пользователе.
 *
 * @param id Идентификатор пользователя.
 * @param personUid Уникальный идентификатор пользователя.
 */

data class BaseUserViewModel (

    /* Идентификатор пользователя. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Уникальный идентификатор пользователя. */
    @Json(name = "personUid")
    var personUid: java.util.UUID? = null

)


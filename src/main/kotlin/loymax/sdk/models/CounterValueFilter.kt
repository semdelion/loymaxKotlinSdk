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
 * Фильтр для значений счетчика.
 *
 * @param from Начало выборки.
 * @param count Количество.
 * @param personId Идентификатор пользователя.
 * @param accountGroupId Идентификатор группы счетов.
 */

data class CounterValueFilter (

    /* Начало выборки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Количество. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Идентификатор пользователя. */
    @Json(name = "personId")
    var personId: kotlin.Int? = null,

    /* Идентификатор группы счетов. */
    @Json(name = "accountGroupId")
    var accountGroupId: kotlin.Int? = null

)


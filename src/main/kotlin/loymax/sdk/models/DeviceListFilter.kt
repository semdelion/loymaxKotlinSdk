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

import loymax.sdk.models.ArchivedState

import com.squareup.moshi.Json

/**
 * Модель списка касс.
 *
 * @param from Порядковый номер начального элемента выборки.
 * @param count Количество возвращаемых элементов выборки.
 * @param merchantIds Список внутренних идентификаторов магазинов.
 * @param legalId Внутренний идентификатор юридического лица.
 * @param code Код.
 * @param mode 
 * @param isOrderedByAscending Режим прямой сортировки (true — да, false — нет).
 */

data class DeviceListFilter (

    /* Порядковый номер начального элемента выборки. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Количество возвращаемых элементов выборки. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Список внутренних идентификаторов магазинов. */
    @Json(name = "merchantIds")
    var merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Внутренний идентификатор юридического лица. */
    @Json(name = "legalId")
    var legalId: kotlin.Int? = null,

    /* Код. */
    @Json(name = "code")
    var code: kotlin.String? = null,

    @Json(name = "mode")
    var mode: ArchivedState? = null,

    /* Режим прямой сортировки (true — да, false — нет). */
    @Json(name = "isOrderedByAscending")
    var isOrderedByAscending: kotlin.Boolean? = null

)


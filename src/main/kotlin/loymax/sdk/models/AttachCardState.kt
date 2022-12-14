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
 * Состояние процесса присоединения карты.
 *
 * @param cardNumber Номер присоединяемой карты.
 * @param isStarted Начат ли процесс присодинения карты (true — да, false — нет).
 * @param maxCountOfCards Максимальное количество карт, которое можно присоединить клиенту.
 * @param currentCountOfAttachedCards Текущее количество присоединенных карт у клиента.
 * @param maximumPersonCountForGroup Максимальное количество клиентов в группе.
 * @param currentPersonCountInGroup Текущее количество клиентов в группе.
 */

data class AttachCardState (

    /* Номер присоединяемой карты. */
    @Json(name = "cardNumber")
    var cardNumber: kotlin.String? = null,

    /* Начат ли процесс присодинения карты (true — да, false — нет). */
    @Json(name = "isStarted")
    var isStarted: kotlin.Boolean? = null,

    /* Максимальное количество карт, которое можно присоединить клиенту. */
    @Json(name = "maxCountOfCards")
    var maxCountOfCards: kotlin.Int? = null,

    /* Текущее количество присоединенных карт у клиента. */
    @Json(name = "currentCountOfAttachedCards")
    var currentCountOfAttachedCards: kotlin.Int? = null,

    /* Максимальное количество клиентов в группе. */
    @Json(name = "maximumPersonCountForGroup")
    var maximumPersonCountForGroup: kotlin.Int? = null,

    /* Текущее количество клиентов в группе. */
    @Json(name = "currentPersonCountInGroup")
    var currentPersonCountInGroup: kotlin.Int? = null

)


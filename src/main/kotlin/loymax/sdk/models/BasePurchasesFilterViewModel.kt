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
 * Модель фильтра для получения коллекции покупок.
 *
 * @param startChequeTime Нижняя граница времени покупки.
 * @param lastChequeTime Верхняя граница времени покупки.
 * @param merchantIds Идентификатор магазина.
 * @param loyaltyPrograms Идентификатор программ лояльности.
 * @param chequeNumber Номер чека.
 * @param count Количество.
 * @param from Начальная позиция в списке.
 * @param cardNumber Номер карты клиента.
 * @param personId Идентификатор пользователя.
 * @param personIdentifier Номер телефона клиента.
 * @param deviceIds Ids касс.
 */

data class BasePurchasesFilterViewModel (

    /* Нижняя граница времени покупки. */
    @Json(name = "startChequeTime")
    var startChequeTime: java.time.OffsetDateTime? = null,

    /* Верхняя граница времени покупки. */
    @Json(name = "lastChequeTime")
    var lastChequeTime: java.time.OffsetDateTime? = null,

    /* Идентификатор магазина. */
    @Json(name = "merchantIds")
    var merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Идентификатор программ лояльности. */
    @Json(name = "loyaltyPrograms")
    var loyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Номер чека. */
    @Json(name = "chequeNumber")
    var chequeNumber: kotlin.String? = null,

    /* Количество. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Начальная позиция в списке. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Номер карты клиента. */
    @Json(name = "cardNumber")
    var cardNumber: kotlin.String? = null,

    /* Идентификатор пользователя. */
    @Json(name = "personId")
    var personId: kotlin.Int? = null,

    /* Номер телефона клиента. */
    @Json(name = "personIdentifier")
    var personIdentifier: kotlin.String? = null,

    /* Ids касс. */
    @Json(name = "deviceIds")
    var deviceIds: kotlin.collections.MutableList<kotlin.Int>? = null

)


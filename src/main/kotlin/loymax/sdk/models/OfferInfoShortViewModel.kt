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
 * Модель представления для акции с минимальным количеством свойств.
 *
 * @param id Идентификатор акции.
 * @param name Название акции.
 * @param isAccess Есть доступ?.
 * @param partnerName Имя партнера.
 */

data class OfferInfoShortViewModel (

    /* Идентификатор акции. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название акции. */
    @Json(name = "name")
    var name: kotlin.String? = null,

    /* Есть доступ?. */
    @Json(name = "isAccess")
    var isAccess: kotlin.Boolean? = null,

    /* Имя партнера. */
    @Json(name = "partnerName")
    var partnerName: kotlin.String? = null

)


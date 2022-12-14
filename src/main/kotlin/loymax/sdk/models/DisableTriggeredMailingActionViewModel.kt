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

import loymax.sdk.models.ActionTypeViewModel

import com.squareup.moshi.Json

/**
 * Модель для действия \"Выключить оповещение\".
 *
 * @param actionId Id действия. Если указан, редактируется действие, иначе создается новое.
 * @param actionType 
 * @param order Порядок действия.
 * @param mailingId Идентификатор рассылки.
 * @param mailingName Название рассылки.
 */

data class DisableTriggeredMailingActionViewModel (

    /* Id действия. Если указан, редактируется действие, иначе создается новое. */
    @Json(name = "actionId")
    var actionId: kotlin.Int? = null,

    @Json(name = "actionType")
    var actionType: ActionTypeViewModel? = null,

    /* Порядок действия. */
    @Json(name = "order")
    var order: kotlin.Int? = null,

    /* Идентификатор рассылки. */
    @Json(name = "mailingId")
    var mailingId: kotlin.Int? = null,

    /* Название рассылки. */
    @Json(name = "mailingName")
    var mailingName: kotlin.String? = null

)


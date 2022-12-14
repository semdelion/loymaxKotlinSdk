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

import loymax.sdk.models.CardEmissionPackingState
import loymax.sdk.models.CardEmissionStateModel
import loymax.sdk.models.CardEmissionType
import loymax.sdk.models.CardState
import loymax.sdk.models.CardType
import loymax.sdk.models.CardsPackingQueueInfo
import loymax.sdk.models.FileViewModel
import loymax.sdk.models.PartnerLoyaltyProgramModel

import com.squareup.moshi.Json

/**
 * View модель выпуска карт.
 *
 * @param id Id.
 * @param number Номер.
 * @param description Описание.
 * @param count Количество.
 * @param prefix Префикс.
 * @param state 
 * @param templateSetId Id шаблона.
 * @param templateSetText Текст набора шаблонов.
 * @param cardType 
 * @param cardCategoryId Id категории карт.
 * @param packingAllowed Упаковка.
 * @param packingState 
 * @param passwordRequired Активация без пароля.
 * @param queueInfo 
 * @param loyaltyProgram 
 * @param creationDate Дата создания.
 * @param cvcCodeRequired Необходимость CVC кода.
 * @param cvcCodeLength Длина CVC кода.
 * @param cardState 
 * @param cardsFileViewModel 
 * @param cardEmissionType 
 * @param startPacking Запускать фасовку автоматически.
 */

data class CardEmissionViewModel (

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
    var state: CardEmissionStateModel? = null,

    /* Id шаблона. */
    @Json(name = "templateSetId")
    var templateSetId: kotlin.Int? = null,

    /* Текст набора шаблонов. */
    @Json(name = "templateSetText")
    var templateSetText: kotlin.String? = null,

    @Json(name = "cardType")
    var cardType: CardType? = null,

    /* Id категории карт. */
    @Json(name = "cardCategoryId")
    var cardCategoryId: kotlin.Int? = null,

    /* Упаковка. */
    @Json(name = "packingAllowed")
    var packingAllowed: kotlin.Boolean? = null,

    @Json(name = "packingState")
    var packingState: CardEmissionPackingState? = null,

    /* Активация без пароля. */
    @Json(name = "passwordRequired")
    var passwordRequired: kotlin.Boolean? = null,

    @Json(name = "queueInfo")
    var queueInfo: CardsPackingQueueInfo? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: PartnerLoyaltyProgramModel? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Необходимость CVC кода. */
    @Json(name = "cvcCodeRequired")
    var cvcCodeRequired: kotlin.Boolean? = null,

    /* Длина CVC кода. */
    @Json(name = "cvcCodeLength")
    var cvcCodeLength: kotlin.Int? = null,

    @Json(name = "cardState")
    var cardState: CardState? = null,

    @Json(name = "cardsFileViewModel")
    var cardsFileViewModel: FileViewModel? = null,

    @Json(name = "cardEmissionType")
    var cardEmissionType: CardEmissionType? = null,

    /* Запускать фасовку автоматически. */
    @Json(name = "startPacking")
    var startPacking: kotlin.Boolean? = null

)


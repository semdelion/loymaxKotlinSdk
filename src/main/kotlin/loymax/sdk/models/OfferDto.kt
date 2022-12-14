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

import loymax.sdk.models.MerchantsSubFilter
import loymax.sdk.models.OfferChangesState
import loymax.sdk.models.OfferLoyaltyPrograms
import loymax.sdk.models.OfferPartners
import loymax.sdk.models.OfferRules
import loymax.sdk.models.OfferWorkingState
import loymax.sdk.models.TimeRefinementDto

import com.squareup.moshi.Json

/**
 * Акция.
 *
 * @param id Внешний идентификатор акции.
 * @param title Наименование.
 * @param applyChangesDateValue Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\" (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.
 * @param expirationDateValue Дата, начиная с которой акция заканчивает действовать (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.
 * @param workingState 
 * @param changesState 
 * @param priority Приоритет акции.
 * @param isSum Суммируемая акция.
 * @param timeRefinement 
 * @param description Описание.
 * @param category Категория.
 * @param marketingCampaign Маркетинговая кампания.
 * @param partners 
 * @param loyaltyPrograms 
 * @param pointsOfSales 
 * @param targetGroups Список ЦА.
 * @param rules 
 * @param applyChangesDate Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\".
 * @param expirationDate Дата, начиная с которой акция заканчивает действовать.
 */

data class OfferDto (

    /* Внешний идентификатор акции. */
    @Json(name = "id")
    var id: kotlin.String? = null,

    /* Наименование. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\" (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}. */
    @Json(name = "applyChangesDateValue")
    var applyChangesDateValue: kotlin.String? = null,

    /* Дата, начиная с которой акция заканчивает действовать (pure xml).  TODO: в xsd определить свой тип для даты (строка с регулярным выражением \\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}. */
    @Json(name = "expirationDateValue")
    var expirationDateValue: kotlin.String? = null,

    @Json(name = "workingState")
    var workingState: OfferWorkingState? = null,

    @Json(name = "changesState")
    var changesState: OfferChangesState? = null,

    /* Приоритет акции. */
    @Json(name = "priority")
    var priority: kotlin.Int? = null,

    /* Суммируемая акция. */
    @Json(name = "isSum")
    var isSum: kotlin.Boolean? = null,

    @Json(name = "timeRefinement")
    var timeRefinement: TimeRefinementDto? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Категория. */
    @Json(name = "category")
    var category: kotlin.String? = null,

    /* Маркетинговая кампания. */
    @Json(name = "marketingCampaign")
    var marketingCampaign: kotlin.Int? = null,

    @Json(name = "partners")
    var partners: OfferPartners? = null,

    @Json(name = "loyaltyPrograms")
    var loyaltyPrograms: OfferLoyaltyPrograms? = null,

    @Json(name = "pointsOfSales")
    var pointsOfSales: MerchantsSubFilter? = null,

    /* Список ЦА. */
    @Json(name = "targetGroups")
    var targetGroups: kotlin.collections.MutableList<kotlin.Any>? = null,

    @Json(name = "rules")
    var rules: OfferRules? = null,

    /* Дата, начиная с которой акция начинает действовать, если она в состоянии \"Running\". */
    @Json(name = "applyChangesDate")
    var applyChangesDate: java.time.OffsetDateTime? = null,

    /* Дата, начиная с которой акция заканчивает действовать. */
    @Json(name = "expirationDate")
    var expirationDate: java.time.OffsetDateTime? = null

)


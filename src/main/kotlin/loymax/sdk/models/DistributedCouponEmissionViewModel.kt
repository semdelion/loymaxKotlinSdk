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

import loymax.sdk.models.KeyValuePairOfCouponStateAndInt32
import loymax.sdk.models.LoyaltyProgramInfoViewModel
import loymax.sdk.models.NumberTemplateViewModel
import loymax.sdk.models.PartnerViewModel
import loymax.sdk.models.PeriodType
import loymax.sdk.models.SystemUserViewModel

import com.squareup.moshi.Json

/**
 * View модель купона для раздачи.
 *
 * @param id Внутренний идентификатор выпуска купонов.
 * @param title Название выпуска купонов.
 * @param partner 
 * @param isArchived Признак состояния выпуска купонов (true - удален, false - не удален).
 * @param creationDate Дата создания выпуска купонов.
 * @param changeDate Дата изменения выпуска купонов.
 * @param shortDescription Краткое описание выпуск купонов.
 * @param description Детальное описание выпуск купонов.
 * @param createdByPerson 
 * @param lastEditByPerson 
 * @param counts Количество купонов в выпуске.
 * @param loyaltyProgram 
 * @param activationDelay Время активации (в минутах).
 * @param expirationDelay Время сгорания (в минутах).
 * @param activationPeriodType 
 * @param expirationPeriodType 
 * @param certainActivationDate Точное время активации.
 * @param certainExpirationDate Точное время сгорания.
 * @param uid Внешний идентификатор выпуска купонов.
 * @param count Количество купонов.
 * @param numberTemplate 
 * @param isDynamic Признак динамичности (true - динамический, false - нединамический).
 */

data class DistributedCouponEmissionViewModel (

    /* Внутренний идентификатор выпуска купонов. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Название выпуска купонов. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    @Json(name = "partner")
    var partner: PartnerViewModel? = null,

    /* Признак состояния выпуска купонов (true - удален, false - не удален). */
    @Json(name = "isArchived")
    var isArchived: kotlin.Boolean? = null,

    /* Дата создания выпуска купонов. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Дата изменения выпуска купонов. */
    @Json(name = "changeDate")
    var changeDate: java.time.OffsetDateTime? = null,

    /* Краткое описание выпуск купонов. */
    @Json(name = "shortDescription")
    var shortDescription: kotlin.String? = null,

    /* Детальное описание выпуск купонов. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "createdByPerson")
    var createdByPerson: SystemUserViewModel? = null,

    @Json(name = "lastEditByPerson")
    var lastEditByPerson: SystemUserViewModel? = null,

    /* Количество купонов в выпуске. */
    @Json(name = "counts")
    var counts: kotlin.collections.MutableList<KeyValuePairOfCouponStateAndInt32>? = null,

    @Json(name = "loyaltyProgram")
    var loyaltyProgram: LoyaltyProgramInfoViewModel? = null,

    /* Время активации (в минутах). */
    @Json(name = "activationDelay")
    var activationDelay: kotlin.Int? = null,

    /* Время сгорания (в минутах). */
    @Json(name = "expirationDelay")
    var expirationDelay: kotlin.Int? = null,

    @Json(name = "activationPeriodType")
    var activationPeriodType: PeriodType? = null,

    @Json(name = "expirationPeriodType")
    var expirationPeriodType: PeriodType? = null,

    /* Точное время активации. */
    @Json(name = "certainActivationDate")
    var certainActivationDate: java.time.OffsetDateTime? = null,

    /* Точное время сгорания. */
    @Json(name = "certainExpirationDate")
    var certainExpirationDate: java.time.OffsetDateTime? = null,

    /* Внешний идентификатор выпуска купонов. */
    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    /* Количество купонов. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    @Json(name = "numberTemplate")
    var numberTemplate: NumberTemplateViewModel? = null,

    /* Признак динамичности (true - динамический, false - нединамический). */
    @Json(name = "isDynamic")
    var isDynamic: kotlin.Boolean? = null

)

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

import loymax.sdk.models.MoneyViewModel
import loymax.sdk.models.NotifierInfoModel
import loymax.sdk.models.PersonState

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param uid 
 * @param firstName 
 * @param lastName 
 * @param patronymicName 
 * @param phone 
 * @param email 
 * @param registrationDate 
 * @param birthDay 
 * @param balance 
 * @param notActivated 
 * @param isRequiredActions 
 * @param state 
 * @param subscribeToAllAcceptDate 
 * @param tenderOfferAcceptDate 
 * @param personalDataProcessingAcceptDate 
 * @param groupId 
 * @param accountGroup 
 * @param timeZone 
 * @param displayName 
 * @param creationDate 
 * @param loyaltyProgramName 
 * @param loyaltyProgramId 
 * @param balances 
 */

data class PersonInfoModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "uid")
    var uid: java.util.UUID? = null,

    @Json(name = "firstName")
    var firstName: kotlin.String? = null,

    @Json(name = "lastName")
    var lastName: kotlin.String? = null,

    @Json(name = "patronymicName")
    var patronymicName: kotlin.String? = null,

    @Json(name = "phone")
    var phone: NotifierInfoModel? = null,

    @Json(name = "email")
    var email: NotifierInfoModel? = null,

    @Json(name = "registrationDate")
    var registrationDate: java.time.OffsetDateTime? = null,

    @Json(name = "birthDay")
    var birthDay: java.time.OffsetDateTime? = null,

    @Json(name = "balance")
    var balance: MoneyViewModel? = null,

    @Json(name = "notActivated")
    var notActivated: MoneyViewModel? = null,

    @Json(name = "isRequiredActions")
    var isRequiredActions: kotlin.Boolean? = null,

    @Json(name = "state")
    var state: PersonState? = null,

    @Json(name = "subscribeToAllAcceptDate")
    var subscribeToAllAcceptDate: java.time.OffsetDateTime? = null,

    @Json(name = "tenderOfferAcceptDate")
    var tenderOfferAcceptDate: java.time.OffsetDateTime? = null,

    @Json(name = "personalDataProcessingAcceptDate")
    var personalDataProcessingAcceptDate: java.time.OffsetDateTime? = null,

    @Json(name = "groupId")
    var groupId: kotlin.Int? = null,

    @Json(name = "accountGroup")
    var accountGroup: kotlin.String? = null,

    @Json(name = "timeZone")
    var timeZone: kotlin.Int? = null,

    @Json(name = "displayName")
    var displayName: kotlin.String? = null,

    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    @Json(name = "loyaltyProgramName")
    var loyaltyProgramName: kotlin.String? = null,

    @Json(name = "loyaltyProgramId")
    var loyaltyProgramId: kotlin.Int? = null,

    @Json(name = "balances")
    var balances: kotlin.collections.MutableList<MoneyViewModel>? = null

)


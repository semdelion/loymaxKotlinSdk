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

import loymax.sdk.models.PasswordRuleType

import com.squareup.moshi.Json

/**
 * Модель списка требований к паролям {Loymax.Domain.Contract.Model.Person.Password.IPasswordRule}.
 *
 * @param type 
 * @param isUsed Признак того, действует в настоящий момент требование или нет (true — да, false — нет).
 * @param isRequired Признак необходимости требования (true — обязательное, false — не обязательное).
 * @param minCount Минимальное количество символов.
 * @param maxCount Максимальное количество символов.
 * @param additionalInformation Дополнительная информация.
 */

data class PasswordRuleViewModel (

    @Json(name = "type")
    var type: PasswordRuleType? = null,

    /* Признак того, действует в настоящий момент требование или нет (true — да, false — нет). */
    @Json(name = "isUsed")
    var isUsed: kotlin.Boolean? = null,

    /* Признак необходимости требования (true — обязательное, false — не обязательное). */
    @Json(name = "isRequired")
    var isRequired: kotlin.Boolean? = null,

    /* Минимальное количество символов. */
    @Json(name = "minCount")
    var minCount: kotlin.Int? = null,

    /* Максимальное количество символов. */
    @Json(name = "maxCount")
    var maxCount: kotlin.Int? = null,

    /* Дополнительная информация. */
    @Json(name = "additionalInformation")
    var additionalInformation: kotlin.String? = null

)


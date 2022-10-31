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
 * Модель для прав идентификатора.
 *
 * @param permission Право доступа.
 * @param partnerIds Партнеры.
 * @param isAllow Разрешающее или запрещающее право.
 */

data class UserPermissionModel (

    /* Право доступа. */
    @Json(name = "permission")
    var permission: kotlin.String? = null,

    /* Партнеры. */
    @Json(name = "partnerIds")
    var partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Разрешающее или запрещающее право. */
    @Json(name = "isAllow")
    var isAllow: kotlin.Boolean? = null

)


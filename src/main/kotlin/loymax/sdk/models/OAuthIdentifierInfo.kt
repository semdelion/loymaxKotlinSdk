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

import loymax.sdk.models.OAuthProviderType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param provider 
 * @param userId 
 * @param creationDate 
 */

data class OAuthIdentifierInfo (

    @Json(name = "provider")
    var provider: OAuthProviderType? = null,

    @Json(name = "userId")
    var userId: kotlin.String? = null,

    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null

)

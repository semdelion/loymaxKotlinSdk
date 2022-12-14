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

import loymax.sdk.models.OAuthProviderMethod
import loymax.sdk.models.OAuthProviderType

import com.squareup.moshi.Json

/**
 * Модель представления методов клиента социальной сети.
 *
 * @param providerType 
 * @param methods Список методов.
 */

data class OAuthProviderMethodsViewModel (

    @Json(name = "providerType")
    var providerType: OAuthProviderType? = null,

    /* Список методов. */
    @Json(name = "methods")
    var methods: kotlin.collections.MutableList<OAuthProviderMethod>? = null

)


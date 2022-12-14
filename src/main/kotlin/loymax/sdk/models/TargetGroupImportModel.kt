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

import loymax.sdk.models.IdentifierTypeEnum
import loymax.sdk.models.OperationTypeEnum

import com.squareup.moshi.Json

/**
 * 
 *
 * @param identifierType 
 * @param ignoreError 
 * @param operationType 
 * @param identifiers 
 */

data class TargetGroupImportModel (

    @Json(name = "identifierType")
    var identifierType: IdentifierTypeEnum? = null,

    @Json(name = "ignoreError")
    var ignoreError: kotlin.Boolean? = null,

    @Json(name = "operationType")
    var operationType: OperationTypeEnum? = null,

    @Json(name = "identifiers")
    var identifiers: kotlin.collections.MutableList<kotlin.String>? = null

)


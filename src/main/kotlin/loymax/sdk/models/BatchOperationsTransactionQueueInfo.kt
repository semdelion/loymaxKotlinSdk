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
 * 
 *
 * @param id 
 * @param hasElements 
 * @param confirmedOperationCount 
 */

data class BatchOperationsTransactionQueueInfo (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "hasElements")
    var hasElements: kotlin.Boolean? = null,

    @Json(name = "confirmedOperationCount")
    var confirmedOperationCount: kotlin.Int? = null

)


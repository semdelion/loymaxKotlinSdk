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

import loymax.sdk.models.RelatedAnnouncementType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param type 
 * @param `property` 
 */

data class AttributeMappingModel (

    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "type")
    var type: RelatedAnnouncementType? = null,

    @Json(name = "property")
    var `property`: kotlin.String? = null

)


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

import loymax.sdk.models.BatchState
import loymax.sdk.models.CreatorModel
import loymax.sdk.models.IdentifierType

import com.squareup.moshi.Json

/**
 * Модель пакета операций.
 *
 * @param id ID групповой операции.
 * @param creator 
 * @param creationDate Дата создания.
 * @param description Описание для пользователя.
 * @param state 
 * @param importIdentifierType 
 * @param logicalNameNotifier Логическое имя нотификатора, если был импорт по нотификаторам.
 */

data class BatchCustomersImportModel (

    /* ID групповой операции. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    @Json(name = "creator")
    var creator: CreatorModel? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    /* Описание для пользователя. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    @Json(name = "state")
    var state: BatchState? = null,

    @Json(name = "importIdentifierType")
    var importIdentifierType: IdentifierType? = null,

    /* Логическое имя нотификатора, если был импорт по нотификаторам. */
    @Json(name = "logicalNameNotifier")
    var logicalNameNotifier: kotlin.String? = null

)

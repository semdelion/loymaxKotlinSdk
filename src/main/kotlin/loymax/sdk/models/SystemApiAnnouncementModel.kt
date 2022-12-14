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

import loymax.sdk.models.AnnouncementState
import loymax.sdk.models.AttributeValueModelBase
import loymax.sdk.models.PartnerViewModel
import loymax.sdk.models.RelatedAnnouncementType
import loymax.sdk.models.SpaceModel
import loymax.sdk.models.SystemUserViewModel

import com.squareup.moshi.Json

/**
 * Модель рекламы.
 *
 * @param id Внутренний идентификатор рекламного материала.
 * @param isDeleted Признак состояния рекламы (true — архивная, false — неархивная).
 * @param beginDate Дата начала действия рекламы.
 * @param endDate Дата окончания действия рекламы.
 * @param creationDate Дата создания.
 * @param state 
 * @param attributes Атрибуты.
 * @param relatedAnnouncementType 
 * @param title Название рекламы.
 * @param spaceId Внутренний идентификатор рекламного места.
 * @param partnerId Внутренний идентификатор Партнера.
 * @param authorId Внутренний идентификатор пользователя АРМ, создавшего рекламу.
 * @param relatedEntityId Внутренний идентификатор связанной сущности.
 * @param space 
 * @param partner 
 * @param author 
 * @param permissionValues Список прав.
 */

data class SystemApiAnnouncementModel (

    /* Внутренний идентификатор рекламного материала. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Признак состояния рекламы (true — архивная, false — неархивная). */
    @Json(name = "isDeleted")
    var isDeleted: kotlin.Boolean? = null,

    /* Дата начала действия рекламы. */
    @Json(name = "beginDate")
    var beginDate: java.time.OffsetDateTime? = null,

    /* Дата окончания действия рекламы. */
    @Json(name = "endDate")
    var endDate: java.time.OffsetDateTime? = null,

    /* Дата создания. */
    @Json(name = "creationDate")
    var creationDate: java.time.OffsetDateTime? = null,

    @Json(name = "state")
    var state: AnnouncementState? = null,

    /* Атрибуты. */
    @Json(name = "attributes")
    var attributes: kotlin.collections.MutableList<AttributeValueModelBase>? = null,

    @Json(name = "relatedAnnouncementType")
    var relatedAnnouncementType: RelatedAnnouncementType? = null,

    /* Название рекламы. */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Внутренний идентификатор рекламного места. */
    @Json(name = "spaceId")
    var spaceId: kotlin.Int? = null,

    /* Внутренний идентификатор Партнера. */
    @Json(name = "partnerId")
    var partnerId: kotlin.Int? = null,

    /* Внутренний идентификатор пользователя АРМ, создавшего рекламу. */
    @Json(name = "authorId")
    var authorId: kotlin.Int? = null,

    /* Внутренний идентификатор связанной сущности. */
    @Json(name = "relatedEntityId")
    var relatedEntityId: kotlin.Int? = null,

    @Json(name = "space")
    var space: SpaceModel? = null,

    @Json(name = "partner")
    var partner: PartnerViewModel? = null,

    @Json(name = "author")
    var author: SystemUserViewModel? = null,

    /* Список прав. */
    @Json(name = "permissionValues")
    var permissionValues: kotlin.collections.MutableList<kotlin.String>? = null

)


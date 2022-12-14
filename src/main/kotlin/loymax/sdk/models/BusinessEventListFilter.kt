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

import loymax.sdk.models.BusinessActivityContextType

import com.squareup.moshi.Json

/**
 * Модель фильтра для получения расчёта событий.
 *
 * @param from С какого элемента брать.
 * @param count Сколько элементов брать.
 * @param activityDateFrom Дата создания с.
 * @param activityDateTo Дата создания по.
 * @param personId Идентификатор пользователя.
 * @param purchaseId Идентификатор покупки.
 * @param contextType 
 */

data class BusinessEventListFilter (

    /* С какого элемента брать. */
    @Json(name = "from")
    var from: kotlin.Int? = null,

    /* Сколько элементов брать. */
    @Json(name = "count")
    var count: kotlin.Int? = null,

    /* Дата создания с. */
    @Json(name = "activityDateFrom")
    var activityDateFrom: java.time.OffsetDateTime? = null,

    /* Дата создания по. */
    @Json(name = "activityDateTo")
    var activityDateTo: java.time.OffsetDateTime? = null,

    /* Идентификатор пользователя. */
    @Json(name = "personId")
    var personId: kotlin.Int? = null,

    /* Идентификатор покупки. */
    @Json(name = "purchaseId")
    var purchaseId: kotlin.Int? = null,

    @Json(name = "contextType")
    var contextType: BusinessActivityContextType? = null

)


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

import loymax.sdk.models.CityDataModel
import loymax.sdk.models.RegionDataModel

import com.squareup.moshi.Json

/**
 * Модель описания местоположения торговой точки.
 *
 * @param id Внутренний идентификатор местоположения торговой точки.
 * @param locationId Внешний идентификатор местоположения торговой точки.
 * @param description Описание.
 * @param latitude Широта.
 * @param longitude Долгота.
 * @param region 
 * @param city 
 * @param street Улица.
 * @param house Дом.
 * @param building Здание.
 * @param office Офис.
 */

data class LocationDataModel (

    /* Внутренний идентификатор местоположения торговой точки. */
    @Json(name = "id")
    var id: kotlin.Int? = null,

    /* Внешний идентификатор местоположения торговой точки. */
    @Json(name = "locationId")
    var locationId: java.util.UUID? = null,

    /* Описание. */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Широта. */
    @Json(name = "latitude")
    var latitude: kotlin.Double? = null,

    /* Долгота. */
    @Json(name = "longitude")
    var longitude: kotlin.Double? = null,

    @Json(name = "region")
    var region: RegionDataModel? = null,

    @Json(name = "city")
    var city: CityDataModel? = null,

    /* Улица. */
    @Json(name = "street")
    var street: kotlin.String? = null,

    /* Дом. */
    @Json(name = "house")
    var house: kotlin.String? = null,

    /* Здание. */
    @Json(name = "building")
    var building: kotlin.String? = null,

    /* Офис. */
    @Json(name = "office")
    var office: kotlin.String? = null

)

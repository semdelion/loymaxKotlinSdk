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
 * Модель Персонального предложения для клиента.
 *
 * @param goodsIds Список внутренних идентификаторов товаров.
 * @param attributeId Внутренний идентификатор атрибута.
 */

data class PersonalOfferAttributeValueModel (

    /* Список внутренних идентификаторов товаров. */
    @Json(name = "goodsIds")
    var goodsIds: kotlin.collections.MutableList<kotlin.Int>? = null,

    /* Внутренний идентификатор атрибута. */
    @Json(name = "attributeId")
    var attributeId: kotlin.Int? = null

)


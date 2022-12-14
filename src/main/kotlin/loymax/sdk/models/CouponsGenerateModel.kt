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
 * Модель генерации купонов.
 *
 * @param emissionId Внутренний идентификатор выпуска купона.
 * @param couponsCount Количество купонов для генерации.
 */

data class CouponsGenerateModel (

    /* Внутренний идентификатор выпуска купона. */
    @Json(name = "emissionId")
    var emissionId: kotlin.Int? = null,

    /* Количество купонов для генерации. */
    @Json(name = "couponsCount")
    var couponsCount: kotlin.Int? = null

)


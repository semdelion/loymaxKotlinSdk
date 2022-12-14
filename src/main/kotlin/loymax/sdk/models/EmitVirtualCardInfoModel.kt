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
 * Информация о возможности выпуска виртуальной карты.
 *
 * @param currentCountOfVirtualCards Текущее количество виртуальных карт у клиента.
 * @param isVirtualCardEmissionAllowed Возможность выпуска виртуальной карты (true-возможно выпустить, false-невозможно выпустить).
 */

data class EmitVirtualCardInfoModel (

    /* Текущее количество виртуальных карт у клиента. */
    @Json(name = "currentCountOfVirtualCards")
    var currentCountOfVirtualCards: kotlin.Int? = null,

    /* Возможность выпуска виртуальной карты (true-возможно выпустить, false-невозможно выпустить). */
    @Json(name = "isVirtualCardEmissionAllowed")
    var isVirtualCardEmissionAllowed: kotlin.Boolean? = null

)


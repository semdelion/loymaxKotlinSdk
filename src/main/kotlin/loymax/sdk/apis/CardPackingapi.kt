package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.CardPackingModel
import loymax.sdk.models.ResultModel

interface CardPackingapi {
    /**
     * Расфасовать карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Идентификатор карты для фасовки.
     * @param secondaryCardsIds Идентификаторы фасуемых дополнительных карт. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Cards/{cardId}/Pack")
    fun cardPackingPackCard(@Path("cardId") cardId: kotlin.Int, @Query("secondaryCardsIds") secondaryCardsIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModel>

}

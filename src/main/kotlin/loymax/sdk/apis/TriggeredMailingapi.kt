package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfTriggeredMailingViewModel

interface TriggeredMailingapi {
    /**
     * Получить список рассылок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfTriggeredMailingViewModel]>
     */
    @GET("v1.2/triggeredMailings")
    fun triggeredMailingGetMailings(): Call<ResultModelOfListOfTriggeredMailingViewModel>

}

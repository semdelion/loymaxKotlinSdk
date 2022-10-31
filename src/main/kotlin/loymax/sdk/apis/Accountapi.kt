package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfAccountViewModel

interface Accountapi {
    /**
     * Возвращает информацию о счетах клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfAccountViewModel]>
     */
    @GET("v1.2/Users/{personId}/Accounts")
    fun accountGetAccountModels(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfAccountViewModel>

}

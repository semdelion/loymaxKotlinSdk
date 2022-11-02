package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface MailingCreatorService {
    /**
     * Получает список создателей рассылок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfCreatorModel]>
     */
    @GET("v1.2/mailingCreators")
    fun mailingCreatorGetCreators(): Call<ResultModelOfListOfCreatorModel>

}

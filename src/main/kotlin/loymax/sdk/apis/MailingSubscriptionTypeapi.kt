package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfMailingSubscriptionTypeViewModel

interface MailingSubscriptionTypeapi {
    /**
     * Позвращает типы рассылки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfMailingSubscriptionTypeViewModel]>
     */
    @GET("v1.2/mailingSubscriptionTypes")
    fun mailingSubscriptionTypeGetTypes(): Call<ResultModelOfListOfMailingSubscriptionTypeViewModel>

}

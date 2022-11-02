package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserAttributeValueService {
    /**
     * Возвращает значение атрибута клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId Внутренний идентификатор клиента.
     * @param logicalName Логическое имя атрибута.
     * @return [Call]<[ResultModelOfUserAttributeValueViewModel]>
     */
    @GET("v1.2/userAttributeValue/{userId}")
    fun userAttributeValueGetAttributeValue(@Path("userId") userId: kotlin.Int, @Query("logicalName") logicalName: kotlin.String): Call<ResultModelOfUserAttributeValueViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CustomerIdentifiersService {
    /**
     * Блокирование идентификатора.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param id Id идентификатора.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/identifiers/{id}/block")
    fun customerIdentifiersBlockIdentifier(@Path("personId") personId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Получить идентификатор по ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param id Id идентификатор.
     * @return [Call]<[ResultModelOfIdentifierModel]>
     */
    @GET("v1.2/users/{personId}/identifiers/{id}")
    fun customerIdentifiersGetIdentifier(@Path("personId") personId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModelOfIdentifierModel>

    /**
     * Получить список идентификаторов пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfIdentifierModel]>
     */
    @GET("v1.2/users/{personId}/identifiers")
    fun customerIdentifiersGetIdentifiers(@Path("personId") personId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfIdentifierModel>

    /**
     * Разблокирование идентификатора.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param id Id идентификатора.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/identifiers/{id}/unblock")
    fun customerIdentifiersUnblockIdentifier(@Path("personId") personId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModel>

}

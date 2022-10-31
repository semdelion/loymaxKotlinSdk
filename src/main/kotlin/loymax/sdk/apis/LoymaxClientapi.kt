package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.OAuthProviderType
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfListOfClientObjectModel
import loymax.sdk.models.ResultModelOfListOfOAuthActivityType
import loymax.sdk.models.ResultModelOfOAuthSettings
import loymax.sdk.models.ResultModelOfPagedViewModelOfOAuthSettings

interface LoymaxClientapi {
    /**
     * Получает список доступных для отслеживания типов активности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider Провайдер.
     * @return [Call]<[ResultModelOfListOfOAuthActivityType]>
     */
    @GET("v1.2/OAuth/Clients/{provider}/Activities")
    fun loymaxClientActivities(@Path("provider") provider: OAuthProviderType): Call<ResultModelOfListOfOAuthActivityType>

    /**
     * Возвращает OAuth клиента по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id OAuth клиента.
     * @return [Call]<[ResultModelOfOAuthSettings]>
     */
    @GET("v1.2/OAuth/Clients/{id}")
    fun loymaxClientGet(@Path("id") id: kotlin.Int): Call<ResultModelOfOAuthSettings>

    /**
     * Получает список доступных OAuth клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param mode Признак архивации. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOAuthSettings]>
     */
    @GET("v1.2/OAuth/Clients")
    fun loymaxClientGetOAuthClients(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("mode") mode: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfOAuthSettings>

    /**
     * Получает список доступных для отслеживания объектов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider Провайдер.
     * @param target Идентификатор объекта (владельца публикаций  пользователь, группа и т.п.).
     * @return [Call]<[ResultModelOfListOfClientObjectModel]>
     */
    @GET("v1.2/OAuth/Clients/{provider}/Objects/{target}")
    fun loymaxClientObjects(@Path("provider") provider: OAuthProviderType, @Path("target") target: kotlin.String): Call<ResultModelOfListOfClientObjectModel>

    /**
     * Восстановление OAuth клиента по id записи.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id запроса.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/OAuth/Clients/{id}/restore")
    fun loymaxClientRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

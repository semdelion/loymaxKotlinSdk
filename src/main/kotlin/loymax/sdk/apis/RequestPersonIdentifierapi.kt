package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel
import loymax.sdk.models.ResultModelOfRequestPersonIdentifierViewModel

interface RequestPersonIdentifierapi {
    /**
     * Возвращает идентификацию пользователя в запросах от кассы по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id запроса.
     * @return [Call]<[ResultModelOfRequestPersonIdentifierViewModel]>
     */
    @GET("v1.2/RequestPersonIdentifiers/{id}")
    fun requestPersonIdentifierGet(@Path("id") id: kotlin.Int): Call<ResultModelOfRequestPersonIdentifierViewModel>

    /**
     * Получает список всех идентификаций пользователей в запросах от кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @param modeView Перечисление режимов отображения. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel]>
     */
    @GET("v1.2/RequestPersonIdentifiers")
    fun requestPersonIdentifierGetList(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null, @Query("modeView") modeView: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel>

    /**
     * Восстановление идентификации пользователя в запросах от кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id запроса.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/RequestPersonIdentifiers/{id}/restore")
    fun requestPersonIdentifierRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

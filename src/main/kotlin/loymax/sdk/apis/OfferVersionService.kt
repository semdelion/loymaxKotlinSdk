package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface OfferVersionService {
    /**
     * Получает список всех версий акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param fromDate Дата С. (optional)
     * @param toDate Дата По. (optional)
     * @param from С какого элемента брать. (optional)
     * @param count Сколько элементов брать. (optional)
     * @param name Подстрока для поиска по имени. (optional)
     * @param viewStates Список состояний акции для фильтрации. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferVersionsViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions")
    fun offerVersionGetList(@Path("offerId") offerId: kotlin.Int, @Query("fromDate") fromDate: kotlin.String? = null, @Query("toDate") toDate: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("viewStates") viewStates: kotlin.collections.MutableList<OfferViewState>? = null): Call<ResultModelOfPagedViewModelOfOfferVersionsViewModel>

    /**
     * Возобновить версию акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param versionId Идентификатор версии.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Offers/{offerId}/versions/{versionId}/resume")
    fun offerVersionResumeVersion(@Path("offerId") offerId: kotlin.Int, @Path("versionId") versionId: kotlin.Int): Call<ResultModel>

    /**
     * Останавливает версию акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param versionId Идентификатор версии.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Offers/{offerId}/versions/{versionId}/stop")
    fun offerVersionStopVersion(@Path("offerId") offerId: kotlin.Int, @Path("versionId") versionId: kotlin.Int): Call<ResultModel>

}

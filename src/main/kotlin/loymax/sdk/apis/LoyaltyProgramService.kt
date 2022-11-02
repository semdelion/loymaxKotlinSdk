package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface LoyaltyProgramService {
    /**
     * Добавить партнёра в программу лояльности.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Идентификатор программы лояльности.
     * @param partnerId Идентификатор партнёра.
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/LoyaltyPrograms/{id}/Partners/{partnerId}")
    fun loyaltyProgramAddPartner(@Path("id") id: kotlin.Int, @Path("partnerId") partnerId: kotlin.Int): Call<ResultModel>

    /**
     * Получить список программ лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterPartnerIds Список Id партнёров. (optional)
     * @param filterName Подстрока для фильтрации по имени. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLoyaltyProgramModel]>
     */
    @GET("v1.2/LoyaltyPrograms")
    fun loyaltyProgramGet(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfLoyaltyProgramModel>

    /**
     * Получить программу лояльности по системному идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор программы лояльности.
     * @return [Call]<[ResultModelOfLoyaltyProgramModel]>
     */
    @GET("v1.2/LoyaltyPrograms/{id}")
    fun loyaltyProgramGetLoyaltyProgramsById(@Path("id") id: kotlin.Int): Call<ResultModelOfLoyaltyProgramModel>

    /**
     * Получить список партнёров программы лояльности.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор программы лояльности.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPartnerModel]>
     */
    @GET("v1.2/LoyaltyPrograms/{id}/Partners")
    fun loyaltyProgramGetPartners(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfPartnerModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CouponEmissionService {
    /**
     * Возвращает информацию о выпуске купонов по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionUid Внешний идентификатор выпуска.
     * @return [Call]<[ResultModelOfBaseCouponEmissionViewModel]>
     */
    @GET("v1.2/emissions/coupons/{emissionUid}")
    fun couponEmissionGetCouponEmission(@Path("emissionUid") emissionUid: kotlin.String): Call<ResultModelOfBaseCouponEmissionViewModel>

    /**
     * Возвращает информацию о выпуске купонов по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска.
     * @return [Call]<[ResultModelOfBaseCouponEmissionViewModel]>
     */
    @GET("v1.2/emissions/coupons/{emissionId}")
    fun couponEmissionGetCouponEmissionById(@Path("emissionId") emissionId: kotlin.Int): Call<ResultModelOfBaseCouponEmissionViewModel>

    /**
     * Возвращает информацию о выпуске купонов по внутреннему идентификатору (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор выпуска купонов.
     * @return [Call]<[ResultModelOfCouponEmissionViewModel]>
     */
    @GET("v1.2/CouponsEmissions/{id}")
    fun couponEmissionGetCouponEmissions(@Path("id") id: kotlin.Int): Call<ResultModelOfCouponEmissionViewModel>

    /**
     * Возвращает список купонов из выпуска.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска купонов.
     * @param state Состояние. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCouponViewModel]>
     */
    @GET("v1.2/coupons/byEmission/{emissionId}")
    fun couponEmissionGetCouponsByEmissionByEmissionId(@Path("emissionId") emissionId: kotlin.Int, @Query("state") state: CouponState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfCouponViewModel>

    /**
     * Возвращает список существующих выпусков купонов (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offset Порядковый номер начального элемента выборки. (optional)
     * @param limit Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCouponEmissionViewModel]>
     */
    @GET("v1.2/CouponsEmissions")
    fun couponEmissionGetCouponsEmissions(@Query("offset") offset: kotlin.Int? = null, @Query("limit") limit: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfCouponEmissionViewModel>

    /**
     * Возвращает выпуск купонов в виде CSV-файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска купонов.
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/emissions/coupons/{emissionId}/csv")
    fun couponEmissionGetEmissionCsv(@Path("emissionId") emissionId: kotlin.Int): Call<kotlin.String>

    /**
     * Возвращает список существующих выпусков купонов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param properties Свойства модели ответа. Принимает следующие значения  CreatedByPerson, LastEditByPerson, Counts. Если не указывать, то будут возвращены все. (optional)
     * @param filterChangeDateFrom  (optional)
     * @param filterChangeDateTo  (optional)
     * @param filterTypes  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyProgramIds  (optional)
     * @param filterTitle  (optional)
     * @param filterPersonId  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBaseCouponEmissionViewModel]>
     */
    @GET("v1.2/emissions/coupons")
    fun couponEmissionGetEmissionsCoupons(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("properties") properties: kotlin.collections.MutableList<kotlin.String>? = null, @Query("filter.changeDateFrom") filterChangeDateFrom: kotlin.String? = null, @Query("filter.changeDateTo") filterChangeDateTo: kotlin.String? = null, @Query("filter.types") filterTypes: kotlin.collections.MutableList<CouponEmissionType>? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.loyaltyProgramIds") filterLoyaltyProgramIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.title") filterTitle: kotlin.String? = null, @Query("filter.personId") filterPersonId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBaseCouponEmissionViewModel>

    /**
     * Выдает все купоны из выпуска.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска купонов.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/emissions/coupons/{emissionId}/issue")
    fun couponEmissionIssueCoupons(@Path("emissionId") emissionId: kotlin.Int): Call<ResultModel>

}

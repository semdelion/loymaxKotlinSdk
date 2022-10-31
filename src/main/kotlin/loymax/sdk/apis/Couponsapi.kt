package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.CouponBuyModel
import loymax.sdk.models.CouponRefundModel
import loymax.sdk.models.CouponState
import loymax.sdk.models.CouponsGenerateModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfCouponPurchaseViewModel
import loymax.sdk.models.ResultModelOfCouponViewModel
import loymax.sdk.models.ResultModelOfIssuedCouponModel
import loymax.sdk.models.ResultModelOfListOfCouponViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfCouponViewModel

interface Couponsapi {
    /**
     * Оформляет покупку купона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор транзакции. (optional)
     * @param couponText Описание купона. (optional)
     * @param couponCode Код купона (номер). (optional)
     * @param amount Стоимость купона. (optional)
     * @param goodsId Внешний идентификатор товара купона. (optional)
     * @param personId Внутренний идентификатор клиента. (optional)
     * @return [Call]<[ResultModelOfCouponPurchaseViewModel]>
     */
    @POST("v1.2/Coupons/buy")
    fun couponsBuy(@Query("id") id: kotlin.String? = null, @Query("couponText") couponText: kotlin.String? = null, @Query("couponCode") couponCode: kotlin.String? = null, @Query("amount") amount: kotlin.Double? = null, @Query("goodsId") goodsId: kotlin.String? = null, @Query("personId") personId: kotlin.Int? = null): Call<ResultModelOfCouponPurchaseViewModel>

    /**
     * Аннулирует купон.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param couponId Внутренний идентификатор купона.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Coupons/{couponId}/cancel")
    fun couponsCancel(@Path("couponId") couponId: kotlin.Int): Call<ResultModel>

    /**
     * Генерирует и возвращает купоны.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Внутренний идентификатор выпуска купона. (optional)
     * @param couponsCount Количество купонов для генерации. (optional)
     * @return [Call]<[ResultModelOfListOfCouponViewModel]>
     */
    @POST("v1.2/Coupons/generate")
    fun couponsGenerate(@Query("emissionId") emissionId: kotlin.Int? = null, @Query("couponsCount") couponsCount: kotlin.Int? = null): Call<ResultModelOfListOfCouponViewModel>

    /**
     * Возвращает список купонов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param couponListFilterEmissionIds  (optional)
     * @param couponListFilterCouponStates  (optional)
     * @param couponListFilterChangedStateDateFrom  (optional)
     * @param couponListFilterChangedStateDateTo  (optional)
     * @param couponListFilterCouponNumber  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCouponViewModel]>
     */
    @GET("v1.2/Coupons")
    fun couponsGetCoupons(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("couponListFilter.emissionIds") couponListFilterEmissionIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("couponListFilter.couponStates") couponListFilterCouponStates: kotlin.collections.MutableList<CouponState>? = null, @Query("couponListFilter.changedStateDateFrom") couponListFilterChangedStateDateFrom: kotlin.String? = null, @Query("couponListFilter.changedStateDateTo") couponListFilterChangedStateDateTo: kotlin.String? = null, @Query("couponListFilter.couponNumber") couponListFilterCouponNumber: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfCouponViewModel>

    /**
     * Возвращает информацию о купоне.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param couponId Внутренний идентификатор купона.
     * @return [Call]<[ResultModelOfCouponViewModel]>
     */
    @GET("v1.2/Coupons/{couponId}")
    fun couponsGetInfo(@Path("couponId") couponId: kotlin.Int): Call<ResultModelOfCouponViewModel>

    /**
     * Получить информацию о купоне по номеру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param couponNumber Номер купона.
     * @return [Call]<[ResultModelOfCouponViewModel]>
     */
    @GET("v1.2/Coupons/{couponNumber}")
    fun couponsGetInfoByCouponNumber(@Path("couponNumber") couponNumber: kotlin.String): Call<ResultModelOfCouponViewModel>

    /**
     * Метод для выдачи купона из указанного выпуска.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param emissionId Id выпуска купонов.
     * @param personUid Uid клиента кому выдать купон. (optional)
     * @param personId Id клиента кому выдать купон. (optional)
     * @return [Call]<[ResultModelOfIssuedCouponModel]>
     */
    @POST("v1.2/Coupons/couponById")
    fun couponsIssueCoupon(@Query("emissionId") emissionId: kotlin.Int, @Query("personUid") personUid: kotlin.String? = null, @Query("personId") personId: kotlin.Int? = null): Call<ResultModelOfIssuedCouponModel>

    /**
     * Оформляет возврат средств.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param transactionId Идентификатор транзакции, полученный при покупке купона. (optional)
     * @return [Call]<[ResultModelOfCouponPurchaseViewModel]>
     */
    @POST("v1.2/Coupons/refund")
    fun couponsRefund(@Query("transactionId") transactionId: kotlin.Long? = null): Call<ResultModelOfCouponPurchaseViewModel>

}

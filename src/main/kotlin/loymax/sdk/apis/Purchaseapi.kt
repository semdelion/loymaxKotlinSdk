package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.PurchasesFilterViewModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfListOfChequePositionViewModel
import loymax.sdk.models.ResultModelOfListOfOperationsViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfPurchaseViewModel
import loymax.sdk.models.ResultModelOfPurchaseViewModel

interface Purchaseapi {
    /**
     * Редактирование состояния покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/purchases/{purchaseId}/cancel")
    fun purchaseCancelPurchase(@Path("purchaseId") purchaseId: kotlin.Int): Call<ResultModel>

    /**
     * Редактирование состояния покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deviceCode Код кассы.
     * @param purchaseId Идентификатор покупки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/purchases/cancel/{deviceCode}/{purchaseId}")
    fun purchaseCancelPurchaseByExternalId(@Path("deviceCode") deviceCode: kotlin.String, @Path("purchaseId") purchaseId: kotlin.String): Call<ResultModel>

    /**
     * Редактирование состояния покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/purchases/{purchaseId}/confirm")
    fun purchaseConfirmPurchase(@Path("purchaseId") purchaseId: kotlin.Int): Call<ResultModel>

    /**
     * Редактирование состояния покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deviceCode Код кассы.
     * @param purchaseId Идентификатор покупки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/purchases/confirm/{deviceCode}/{purchaseId}")
    fun purchaseConfirmPurchaseByExternalId(@Path("deviceCode") deviceCode: kotlin.String, @Path("purchaseId") purchaseId: kotlin.String): Call<ResultModel>

    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filter Фильтр.
     * @return [Call]<[ResultModelOfPagedViewModelOfPurchaseViewModel]>
     */
    @POST("v1.2/purchases")
    fun purchaseGet(@Query("filter") filter: PurchasesFilterViewModel): Call<ResultModelOfPagedViewModelOfPurchaseViewModel>

    /**
     * Получить чековые позиции по покупке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор.
     * @param showCanceledOperations Отображать отменененные операции. (optional)
     * @return [Call]<[ResultModelOfListOfChequePositionViewModel]>
     */
    @GET("v1.2/purchases/{purchaseId}/chequePositions")
    fun purchaseGetChequePositions(@Path("purchaseId") purchaseId: kotlin.Int, @Query("showCanceledOperations") showCanceledOperations: kotlin.Boolean? = null): Call<ResultModelOfListOfChequePositionViewModel>

    /**
     * Получить список операций по покупке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @return [Call]<[ResultModelOfListOfOperationsViewModel]>
     */
    @GET("v1.2/purchases/{purchaseId}/operations")
    fun purchaseGetOperations(@Path("purchaseId") purchaseId: kotlin.Int): Call<ResultModelOfListOfOperationsViewModel>

    /**
     * Получить покупку по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param withCoupons Возвращать ли использованные купоны. (optional)
     * @return [Call]<[ResultModelOfPurchaseViewModel]>
     */
    @GET("v1.2/purchases/{purchaseId}")
    fun purchaseGetPurchase(@Path("purchaseId") purchaseId: kotlin.Int, @Query("withCoupons") withCoupons: kotlin.Boolean? = null): Call<ResultModelOfPurchaseViewModel>

}

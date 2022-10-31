package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.AvailableAmountRequestModel
import loymax.sdk.models.BalanceRequestModel
import loymax.sdk.models.CalculateRequestModel
import loymax.sdk.models.CancelOperationRequestModel
import loymax.sdk.models.CancelPurchaseRequestModel
import loymax.sdk.models.ConfirmPurchaseRequestModel
import loymax.sdk.models.DiscountRequestModel
import loymax.sdk.models.GoodsRequestModel
import loymax.sdk.models.PaymentRequestModel
import loymax.sdk.models.RefundRequestModel
import loymax.sdk.models.ResultModelOfAvailableAmountResponseModel
import loymax.sdk.models.ResultModelOfBalanceResponseModel
import loymax.sdk.models.ResultModelOfCalculateResponseModel
import loymax.sdk.models.ResultModelOfCancelOperationResponseModel
import loymax.sdk.models.ResultModelOfCancelPurchaseResponseModel
import loymax.sdk.models.ResultModelOfConfirmPurchaseResponseModel
import loymax.sdk.models.ResultModelOfDiscountResponseModel
import loymax.sdk.models.ResultModelOfGoodsResponseModel
import loymax.sdk.models.ResultModelOfPaymentResponseModel
import loymax.sdk.models.ResultModelOfRefundResponseModel

interface Processingapi {
    /**
     * Возвращает информацию о количестве средств на счете держателя карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param model Модель запроса на получение информации о количестве средств на счете держателя карты.
     * @return [Call]<[ResultModelOfBalanceResponseModel]>
     */
    @POST("v1.2/Processing/Balance")
    fun processingBalance(@Query("model") model: BalanceRequestModel): Call<ResultModelOfBalanceResponseModel>

    /**
     * Отменяет списание бонусов для неподтвержденной покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param operationId Идентификатор операции на списание бонусов.
     * @param model Модель запроса на отмену списания бонусов.
     * @return [Call]<[ResultModelOfCancelOperationResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Operations/{operationId}/Cancel")
    fun processingCancelOperation(@Path("purchaseId") purchaseId: kotlin.String, @Path("operationId") operationId: kotlin.String, @Query("model") model: CancelOperationRequestModel): Call<ResultModelOfCancelOperationResponseModel>

    /**
     * Отменяет неподтвержденную покупку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на отмену неподтвержденной покупки.
     * @return [Call]<[ResultModelOfCancelPurchaseResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Cancel")
    fun processingCancelPurchase(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: CancelPurchaseRequestModel): Call<ResultModelOfCancelPurchaseResponseModel>

    /**
     * Подтверждает покупку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на подтверждение покупки.
     * @return [Call]<[ResultModelOfConfirmPurchaseResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Confirm")
    fun processingConfirmPurchase(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: ConfirmPurchaseRequestModel): Call<ResultModelOfConfirmPurchaseResponseModel>

    /**
     * Рассчитывает максимальную сумму списания бонусов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на получение максимальной суммы списания бонусов.
     * @return [Call]<[ResultModelOfAvailableAmountResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Bonus/Available")
    fun processingExecuteAvailableAmount(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: AvailableAmountRequestModel): Call<ResultModelOfAvailableAmountResponseModel>

    /**
     * Рассчитывает прямую скидку и доступную сумму списания бонусов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на расчет прямой скидки и доступной суммы списания бонусов.
     * @return [Call]<[ResultModelOfCalculateResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Calculate")
    fun processingExecuteCalculate(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: CalculateRequestModel): Call<ResultModelOfCalculateResponseModel>

    /**
     * Рассчитывает бонусы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на расчет бонусов.
     * @return [Call]<[ResultModelOfDiscountResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Bonus")
    fun processingExecuteDiscount(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: DiscountRequestModel): Call<ResultModelOfDiscountResponseModel>

    /**
     * Рассчитывает возможные преференции (предполагаемые цены) на товары из товарного каталога.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param loyaltyProgramUid Внешний идентификатор Пограммы лояльности. (optional)
     * @param merchantUid Внешний идентификатор торговой точки. (optional)
     * @param catalogUid Внешний идентификатор товарного каталога. (optional)
     * @param date Дата. (optional)
     * @param isCalculateDiscount Учитывать при расчете прямую скидку (true — да, false — нет). (optional)
     * @param isCalculateCashback Учитывать при расчете бонусы (true — да, false — нет). (optional)
     * @param goods Информация о товарах. (optional)
     * @param cards Список карт, для которых предполагается расчет. (optional)
     * @param statusSystems Список статусных систем, для которых предполагается расчет. (optional)
     * @param goodsAmountAttributeId Внутренний идентификатор атрибута товара. (optional)
     * @param currencyUid Внешний идентификатор валюты кассы. (optional)
     * @return [Call]<[ResultModelOfGoodsResponseModel]>
     */
    @POST("v1.2/Processing/Goods")
    fun processingExecuteGoods(@Query("loyaltyProgramUid") loyaltyProgramUid: kotlin.String? = null, @Query("merchantUid") merchantUid: java.util.UUID? = null, @Query("catalogUid") catalogUid: java.util.UUID? = null, @Query("date") date: java.time.OffsetDateTime? = null, @Query("isCalculateDiscount") isCalculateDiscount: kotlin.Boolean? = null, @Query("isCalculateCashback") isCalculateCashback: kotlin.Boolean? = null, @Query("goods") goods: kotlin.collections.MutableList<GoodsItemRequestModel>? = null, @Query("cards") cards: kotlin.collections.MutableList<CardRequestModel>? = null, @Query("statusSystems") statusSystems: kotlin.collections.MutableList<StatusSystemRequestModel>? = null, @Query("goodsAmountAttributeId") goodsAmountAttributeId: kotlin.Int? = null, @Query("currencyUid") currencyUid: kotlin.String? = null): Call<ResultModelOfGoodsResponseModel>

    /**
     * Проводит списание бонусов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на проведение списания бонусов.
     * @return [Call]<[ResultModelOfPaymentResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Bonus/Payment")
    fun processingExecutePayment(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: PaymentRequestModel): Call<ResultModelOfPaymentResponseModel>

    /**
     * Проводит возврат покупки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param purchaseId Идентификатор покупки.
     * @param model Модель запроса на возврат покупки.
     * @return [Call]<[ResultModelOfRefundResponseModel]>
     */
    @POST("v1.2/Processing/Purchases/{purchaseId}/Refund")
    fun processingRefund(@Path("purchaseId") purchaseId: kotlin.String, @Query("model") model: RefundRequestModel): Call<ResultModelOfRefundResponseModel>

}

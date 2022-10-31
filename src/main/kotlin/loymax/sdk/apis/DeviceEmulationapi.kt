package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.DeviceEmulationAddBonusPaymentModel
import loymax.sdk.models.DeviceEmulationAddOtherPaymentModel
import loymax.sdk.models.DeviceEmulationCashPaymentModel
import loymax.sdk.models.DeviceEmulationCreateChequePositionModel
import loymax.sdk.models.DeviceEmulationCreateCouponsFromListModel
import loymax.sdk.models.DeviceEmulationThirdPartyBonusPaymentModel
import loymax.sdk.models.DeviceEmulationUpdateChequePositionModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfDeviceEmulationBalanceViewModel
import loymax.sdk.models.ResultModelOfDeviceEmulationCalculateResultStateViewModel
import loymax.sdk.models.ResultModelOfDeviceEmulationCashierViewModel
import loymax.sdk.models.ResultModelOfDeviceEmulationChequeViewModel
import loymax.sdk.models.ResultModelOfDeviceEmulationPurchaseCurrentViewModel
import loymax.sdk.models.ResultModelOfDeviceEmulationResultStateViewModel
import loymax.sdk.models.ResultModelOfListOfDeviceEmulationPurchaseParamViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfBrandLineViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfLegalViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfMerchantLineViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfPurchaseViewModel
import loymax.sdk.models.ResultModelOfTestDeviceViewModel

interface DeviceEmulationapi {
    /**
     * Добавление идентификатора пользователя.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/userIdentifier")
    fun deviceEmulationAddUserIdentifier(@Query("identifier.value") identifierValue: kotlin.String? = null, @Query("identifier.loyaltyProgram") identifierLoyaltyProgram: kotlin.String? = null): Call<ResultModel>

    /**
     * Рассчитать прямую скидку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationCalculateResultStateViewModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/calculate")
    fun deviceEmulationCalculate(): Call<ResultModelOfDeviceEmulationCalculateResultStateViewModel>

    /**
     * Отменить покупку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationResultStateViewModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/cancel")
    fun deviceEmulationCancelPurchase(): Call<ResultModelOfDeviceEmulationResultStateViewModel>

    /**
     * Завершить покупку без подтверждения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationChequeViewModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/completeWithCancel")
    fun deviceEmulationCompletePurchaseWithCancel(): Call<ResultModelOfDeviceEmulationChequeViewModel>

    /**
     * Завершить покупку c подтверждением.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationChequeViewModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/completeWithConfirm")
    fun deviceEmulationCompletePurchaseWithConfirm(): Call<ResultModelOfDeviceEmulationChequeViewModel>

    /**
     * Добавляет чековые позиции.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param createChequePositionViewModels Список чековых позиций.
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/positions")
    fun deviceEmulationCreateChequePositions(@Query("createChequePositionViewModels") createChequePositionViewModels: kotlin.collections.MutableList<DeviceEmulationCreateChequePositionModel>): Call<ResultModel>

    /**
     * Добавляет список купонов.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param coupons Список купонов. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/coupons")
    fun deviceEmulationCreateCoupons(@Query("coupons") coupons: kotlin.collections.MutableList<DeviceEmulationCouponModel>? = null): Call<ResultModel>

    /**
     * Удаляет купон по номеру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param number Номер купона.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/deviceEmulation/purchases/current/coupons/{number}")
    fun deviceEmulationDeleteCouponByNumber(@Path("number") number: kotlin.String): Call<ResultModel>

    /**
     * Завершить покупку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/finish")
    fun deviceEmulationFinishCheque(): Call<ResultModel>

    /**
     * Возвращает доступные средства по карте.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return [Call]<[ResultModelOfDeviceEmulationBalanceViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases/current/availableAmount")
    fun deviceEmulationGetAvailableAmount(@Query("identifier.value") identifierValue: kotlin.String? = null, @Query("identifier.loyaltyProgram") identifierLoyaltyProgram: kotlin.String? = null): Call<ResultModelOfDeviceEmulationBalanceViewModel>

    /**
     * Возвращает баланс.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deviceId Идентификатор кассы.
     * @param date Время запроса.
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return [Call]<[ResultModelOfDeviceEmulationBalanceViewModel]>
     */
    @GET("v1.2/deviceEmulation/balance")
    fun deviceEmulationGetBalance(@Query("deviceId") deviceId: kotlin.Int, @Query("date") date: kotlin.String, @Query("identifier.value") identifierValue: kotlin.String? = null, @Query("identifier.loyaltyProgram") identifierLoyaltyProgram: kotlin.String? = null): Call<ResultModelOfDeviceEmulationBalanceViewModel>

    /**
     * Возвращает список всех доступных брендов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Название. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBrandLineViewModel]>
     */
    @GET("v1.2/deviceEmulation/brands")
    fun deviceEmulationGetBrands(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfBrandLineViewModel>

    /**
     * Получить информацию о кассире.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationCashierViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases/current/cashier")
    fun deviceEmulationGetCashierInfo(): Call<ResultModelOfDeviceEmulationCashierViewModel>

    /**
     * Возвращает список параметров чека.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfDeviceEmulationPurchaseParamViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases/current/params")
    fun deviceEmulationGetChequeAdditionalParams(): Call<ResultModelOfListOfDeviceEmulationPurchaseParamViewModel>

    /**
     * Возвращает список параметров чековой позиции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор позиции.
     * @return [Call]<[ResultModelOfListOfDeviceEmulationPurchaseParamViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases/current/positions/{id}/params")
    fun deviceEmulationGetChequePositionParams(@Path("id") id: kotlin.Int): Call<ResultModelOfListOfDeviceEmulationPurchaseParamViewModel>

    /**
     * Возвращает кассу по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deviceID Идентификатор кассы.
     * @return [Call]<[ResultModelOfTestDeviceViewModel]>
     */
    @GET("v1.2/deviceEmulation/devices/{deviceID}")
    fun deviceEmulationGetDeviceByID(@Path("deviceID") deviceID: kotlin.Int): Call<ResultModelOfTestDeviceViewModel>

    /**
     * Возвращает список всех доступных юридических лиц.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId Магазин.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Название. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLegalViewModel]>
     */
    @GET("v1.2/deviceEmulation/legals")
    fun deviceEmulationGetLegals(@Query("merchantId") merchantId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfLegalViewModel>

    /**
     * Возвращает список всех доступных магазинов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Идентификатор бренда.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param name Название. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMerchantLineViewModel]>
     */
    @GET("v1.2/deviceEmulation/brands/{brandId}/merchants")
    fun deviceEmulationGetMerchants(@Path("brandId") brandId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfMerchantLineViewModel>

    /**
     * Возвращает кассу.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Идентификатор бренда.
     * @param merchantId Идентификатор мерчанта.
     * @param legalId Идентификатор юридического лица.
     * @return [Call]<[ResultModelOfTestDeviceViewModel]>
     */
    @GET("v1.2/deviceEmulation/brands/{brandId}/merchants/{merchantId}/device")
    fun deviceEmulationGetOrCreateAvailableDevice(@Path("brandId") brandId: kotlin.Int, @Path("merchantId") merchantId: kotlin.Int, @Query("legalId") legalId: kotlin.Int): Call<ResultModelOfTestDeviceViewModel>

    /**
     * Возвращает текущую покупку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfDeviceEmulationPurchaseCurrentViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases/current")
    fun deviceEmulationGetPurchase(): Call<ResultModelOfDeviceEmulationPurchaseCurrentViewModel>

    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startChequeTime Нижняя граница времени покупки. (optional)
     * @param lastChequeTime Верхняя граница времени покупки. (optional)
     * @param merchantIds Идентификатор магазина. (optional)
     * @param loyaltyPrograms Идентификатор программ лояльности. (optional)
     * @param chequeNumber Номер чека. (optional)
     * @param count Количество. (optional)
     * @param from Начальная позиция в списке. (optional)
     * @param cardNumber Номер карты клиента. (optional)
     * @param personId Идентификатор пользователя. (optional)
     * @param personIdentifier Номер телефона клиента. (optional)
     * @param deviceIds Ids касс. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPurchaseViewModel]>
     */
    @GET("v1.2/deviceEmulation/purchases")
    fun deviceEmulationGetPurchases(@Query("startChequeTime") startChequeTime: kotlin.String? = null, @Query("lastChequeTime") lastChequeTime: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("loyaltyPrograms") loyaltyPrograms: kotlin.String? = null, @Query("chequeNumber") chequeNumber: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("cardNumber") cardNumber: kotlin.String? = null, @Query("personId") personId: kotlin.Int? = null, @Query("personIdentifier") personIdentifier: kotlin.String? = null, @Query("deviceIds") deviceIds: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfPurchaseViewModel>

    /**
     * Добавить оплату реальными деньгами.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param cashAmount Сумма. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/payments/cash")
    fun deviceEmulationSetCashPayment(@Query("cashAmount") cashAmount: kotlin.Double? = null): Call<ResultModel>

    /**
     * Добавить оплату бонусами сторонних компаний.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param cashAmount Сумма. (optional)
     * @param otherPaymentType Способ оплаты отличный от дефолтного. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/payments/other")
    fun deviceEmulationSetOtherPayment(@Query("cashAmount") cashAmount: kotlin.Double? = null, @Query("otherPaymentType") otherPaymentType: kotlin.String? = null): Call<ResultModel>

    /**
     * Задать оплаты.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param addPaymentModels Модели оплат.
     * @return [Call]<[ResultModelOfDeviceEmulationResultStateViewModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/payments")
    fun deviceEmulationSetPayments(@Query("addPaymentModels") addPaymentModels: kotlin.collections.MutableList<DeviceEmulationAddBonusPaymentModel>): Call<ResultModelOfDeviceEmulationResultStateViewModel>

    /**
     * Добавить оплату бонусами сторонних компаний.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param amount Сумма. (optional)
     * @param info Информация о бонусах. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/deviceEmulation/purchases/current/payments/thirdPartyBonus")
    fun deviceEmulationSetThirdPartyBonusPayment(@Query("amount") amount: kotlin.Double? = null, @Query("info") info: kotlin.String? = null): Call<ResultModel>

    /**
     * Меняет местами позиции в чеке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param positionId Номер позиции в покупке.
     * @param secondPositionId Номер второй позиции в покупке.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/positions/{positionId}/swap")
    fun deviceEmulationSwapChequePositions(@Path("positionId") positionId: kotlin.Int, @Query("secondPositionId") secondPositionId: kotlin.Int): Call<ResultModel>

    /**
     * Обновляет чековую позицию.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param positionId Номер позиции в покупке.
     * @param price Цена. (optional)
     * @param quantity Количество. (optional)
     * @param partnerDiscount Партнерская скидка. (optional)
     * @param partnerCashback Партнерский кешбек. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/deviceEmulation/purchases/current/positions/{positionId}")
    fun deviceEmulationUpdateChequePosition(@Path("positionId") positionId: kotlin.Int, @Query("price") price: kotlin.Double? = null, @Query("quantity") quantity: kotlin.Double? = null, @Query("partnerDiscount") partnerDiscount: kotlin.Double? = null, @Query("partnerCashback") partnerCashback: kotlin.Double? = null): Call<ResultModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.BatchUploadModel
import loymax.sdk.models.CardEmissionPackingState
import loymax.sdk.models.CardEmissionType
import loymax.sdk.models.CardEmissionViewModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfCardEmissionViewModel
import loymax.sdk.models.ResultModelOfCardsPackingQueueInfo
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfPagedViewModelOfCardEmissionViewModel

interface CardEmissionapi {
    /**
     * Создать выпуск карт из csv файла.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Id. (optional)
     * @param number Номер. (optional)
     * @param description Описание. (optional)
     * @param count Количество. (optional)
     * @param prefix Префикс. (optional)
     * @param state  (optional)
     * @param templateSetId Id шаблона. (optional)
     * @param templateSetText Текст набора шаблонов. (optional)
     * @param cardType  (optional)
     * @param cardCategoryId Id категории карт. (optional)
     * @param packingAllowed Упаковка. (optional)
     * @param packingState  (optional)
     * @param passwordRequired Активация без пароля. (optional)
     * @param queueInfo  (optional)
     * @param loyaltyProgram  (optional)
     * @param creationDate Дата создания. (optional)
     * @param cvcCodeRequired Необходимость CVC кода. (optional)
     * @param cvcCodeLength Длина CVC кода. (optional)
     * @param cardState  (optional)
     * @param cardsFileViewModel  (optional)
     * @param cardEmissionType  (optional)
     * @param startPacking Запускать фасовку автоматически. (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @PUT("v1.2/emissions/cards/import")
    fun cardEmissionCreateCardEmissionFromCsv(@Query("id") id: kotlin.Int? = null, @Query("number") number: kotlin.Int? = null, @Query("description") description: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("prefix") prefix: kotlin.Int? = null, @Query("state") state: CardEmissionStateModel? = null, @Query("templateSetId") templateSetId: kotlin.Int? = null, @Query("templateSetText") templateSetText: kotlin.String? = null, @Query("cardType") cardType: CardType? = null, @Query("cardCategoryId") cardCategoryId: kotlin.Int? = null, @Query("packingAllowed") packingAllowed: kotlin.Boolean? = null, @Query("packingState") packingState: CardEmissionPackingState? = null, @Query("passwordRequired") passwordRequired: kotlin.Boolean? = null, @Query("queueInfo") queueInfo: CardsPackingQueueInfo? = null, @Query("loyaltyProgram") loyaltyProgram: PartnerLoyaltyProgramModel? = null, @Query("creationDate") creationDate: java.time.OffsetDateTime? = null, @Query("cvcCodeRequired") cvcCodeRequired: kotlin.Boolean? = null, @Query("cvcCodeLength") cvcCodeLength: kotlin.Int? = null, @Query("cardState") cardState: CardState? = null, @Query("cardsFileViewModel") cardsFileViewModel: FileViewModel? = null, @Query("cardEmissionType") cardEmissionType: CardEmissionType? = null, @Query("startPacking") startPacking: kotlin.Boolean? = null): Call<ResultModelOfInt32>

    /**
     * Возвращает информацию о пакете загрузки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Ид. пакета загрузки.
     * @return [Call]<[BatchUploadModel]>
     */
    @GET("v1.2/emissions/cards/import/{id}")
    fun cardEmissionGetBatch(@Path("id") id: kotlin.Int): Call<BatchUploadModel>

    /**
     * Получить выпуск карт по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска.
     * @return [Call]<[ResultModelOfCardEmissionViewModel]>
     */
    @GET("v1.2/emissions/cards/{id}")
    fun cardEmissionGetCardEmission(@Path("id") id: kotlin.Int): Call<ResultModelOfCardEmissionViewModel>

    /**
     * Получить выпуск в виде CSV файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска карт.
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/emissions/cards/{id}/export")
    fun cardEmissionGetCardEmissionCsv(@Path("id") id: kotlin.Int): Call<kotlin.String>

    /**
     * Получить информацию по фоновой фасовке карт для указанной очереди.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска карт.
     * @return [Call]<[ResultModelOfCardsPackingQueueInfo]>
     */
    @GET("v1.2/emissions/cards/{id}/progress")
    fun cardEmissionGetCardEmissionPackingQueueProgress(@Path("id") id: kotlin.Int): Call<ResultModelOfCardsPackingQueueInfo>

    /**
     * Получить список выпусков карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyPrograms Список ПЛ для фильтра по ПЛ. (optional)
     * @param filterNameText Текст содержащийся в описании. (optional)
     * @param filterPackingState Состояние упаковки. (optional)
     * @param filterActivationType Тип активации. (optional)
     * @param filterCardEmissionType Тип эмиссии карты. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCardEmissionViewModel]>
     */
    @GET("v1.2/emissions/cards")
    fun cardEmissionGetCardEmissions(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.loyaltyPrograms") filterLoyaltyPrograms: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.nameText") filterNameText: kotlin.String? = null, @Query("filter.packingState") filterPackingState: CardEmissionPackingState? = null, @Query("filter.activationType") filterActivationType: kotlin.Boolean? = null, @Query("filter.cardEmissionType") filterCardEmissionType: CardEmissionType? = null): Call<ResultModelOfPagedViewModelOfCardEmissionViewModel>

    /**
     * Расфасовать выпуск карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска карт.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/emissions/cards/{id}/pack")
    fun cardEmissionPackCardEmission(@Path("id") id: kotlin.Int): Call<ResultModel>

}

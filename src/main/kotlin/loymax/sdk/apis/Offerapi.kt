package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.CommunicationOfferState
import loymax.sdk.models.CommunicationOfferType
import loymax.sdk.models.OfferCategoryFilterType
import loymax.sdk.models.ResultModelOfDetailItem
import loymax.sdk.models.ResultModelOfListOfMerchantInfoModel
import loymax.sdk.models.ResultModelOfOfferModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfDetailItem
import loymax.sdk.models.ResultModelOfPagedViewModelOfOfferModel

interface Offerapi {
    /**
     * Получить детали рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор рекламного материала.
     * @param detailId Идентификатор детали.
     * @return [Call]<[ResultModelOfDetailItem]>
     */
    @GET("v1.2/Offer/{offerId}/details/{detailId}")
    fun offerGetDetail(@Path("offerId") offerId: kotlin.Int, @Path("detailId") detailId: kotlin.String): Call<ResultModelOfDetailItem>

    /**
     * Получить магазины детали рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор рекламного материала.
     * @param detailId Идентификатор детали.
     * @return [Call]<[ResultModelOfListOfMerchantInfoModel]>
     */
    @GET("v1.2/Offer/{offerId}/details/{detailId}/merchants")
    fun offerGetDetailMerchants(@Path("offerId") offerId: kotlin.Int, @Path("detailId") detailId: kotlin.String): Call<ResultModelOfListOfMerchantInfoModel>

    /**
     * Получить детали рекламного материала.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор рекламного материала.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDetailItem]>
     */
    @GET("v1.2/Offer/{id}/details")
    fun offerGetDetails(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfDetailItem>

    /**
     * Получить рекламный материал по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModelOfOfferModel]>
     */
    @GET("v1.2/Offer/{id}")
    fun offerGetOffer(@Path("id") id: kotlin.Int): Call<ResultModelOfOfferModel>

    /**
     * Получить магазины рекламных материалов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModelOfListOfMerchantInfoModel]>
     */
    @GET("v1.2/Offer/{id}/merchants")
    fun offerGetOfferMerchants(@Path("id") id: kotlin.Int): Call<ResultModelOfListOfMerchantInfoModel>

    /**
     * Получить рекламные материалы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterMerchantId Id магазина. (optional)
     * @param filterOfferState Статус акции. (optional)
     * @param filterFrom Со скольки. (optional)
     * @param filterCount Сколько. (optional)
     * @param filterType Тип акции. (optional)
     * @param filterCategoryFilterType Фильтр по категории. (optional)
     * @param filterCategoryLogicalNames Логические имена категорий. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferModel]>
     */
    @GET("v1.2/Offer")
    fun offerGetOffers(@Query("filter.merchantId") filterMerchantId: kotlin.Int? = null, @Query("filter.offerState") filterOfferState: CommunicationOfferState? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.type") filterType: CommunicationOfferType? = null, @Query("filter.categoryFilterType") filterCategoryFilterType: OfferCategoryFilterType? = null, @Query("filter.categoryLogicalNames") filterCategoryLogicalNames: kotlin.collections.MutableList<kotlin.String>? = null): Call<ResultModelOfPagedViewModelOfOfferModel>

}

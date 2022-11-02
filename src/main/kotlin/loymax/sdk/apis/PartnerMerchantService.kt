package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PartnerMerchantService {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param permission 
     * @param from  (optional)
     * @param count  (optional)
     * @param nameSubstring  (optional)
     * @param internalNameSubstring  (optional)
     * @param brandNameSubstring  (optional)
     * @param brandId  (optional)
     * @param locationSubstring  (optional)
     * @param uids  (optional)
     * @param additionalInfoKey  (optional)
     * @param additionalInfoValue  (optional)
     * @param isOrderedByAscending  (optional)
     * @param mode  (optional)
     * @param merchantIds  (optional)
     * @param sortingIds  (optional)
     * @param partnerIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMerchantLineViewModel]>
     */
    @GET("v1.2/partners/merchants/availableMerchants")
    fun partnerMerchantGetAvailableMerchants(@Query("permission") permission: kotlin.String, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstring") nameSubstring: kotlin.String? = null, @Query("internalNameSubstring") internalNameSubstring: kotlin.String? = null, @Query("brandNameSubstring") brandNameSubstring: kotlin.String? = null, @Query("brandId") brandId: kotlin.Int? = null, @Query("locationSubstring") locationSubstring: kotlin.String? = null, @Query("uids") uids: kotlin.collections.MutableList<kotlin.String>? = null, @Query("additionalInfoKey") additionalInfoKey: kotlin.String? = null, @Query("additionalInfoValue") additionalInfoValue: kotlin.String? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null, @Query("mode") mode: ArchivedState? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfMerchantLineViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param permission 
     * @param from  (optional)
     * @param count  (optional)
     * @param nameSubstring  (optional)
     * @param internalNameSubstring  (optional)
     * @param brandNameSubstring  (optional)
     * @param brandId  (optional)
     * @param locationSubstring  (optional)
     * @param uids  (optional)
     * @param additionalInfoKey  (optional)
     * @param additionalInfoValue  (optional)
     * @param isOrderedByAscending  (optional)
     * @param mode  (optional)
     * @param merchantIds  (optional)
     * @param sortingIds  (optional)
     * @param partnerIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBrandLineViewModel]>
     */
    @GET("v1.2/partners/merchants/availableMerchantsCountByBrand")
    fun partnerMerchantGetAvailableMerchantsCountByBrand(@Query("permission") permission: kotlin.String, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstring") nameSubstring: kotlin.String? = null, @Query("internalNameSubstring") internalNameSubstring: kotlin.String? = null, @Query("brandNameSubstring") brandNameSubstring: kotlin.String? = null, @Query("brandId") brandId: kotlin.Int? = null, @Query("locationSubstring") locationSubstring: kotlin.String? = null, @Query("uids") uids: kotlin.collections.MutableList<kotlin.String>? = null, @Query("additionalInfoKey") additionalInfoKey: kotlin.String? = null, @Query("additionalInfoValue") additionalInfoValue: kotlin.String? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null, @Query("mode") mode: ArchivedState? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfBrandLineViewModel>

    /**
     * Возвращает информацию о торговой точке по внутренним идентификаторам Партнера и торговой точки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param merchantId Внутренний идентификатор торговой точки.
     * @return [Call]<[ResultModelOfMerchantViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/merchants/{merchantId}")
    fun partnerMerchantGetMerchant(@Path("partnerId") partnerId: kotlin.Int, @Path("merchantId") merchantId: kotlin.Int): Call<ResultModelOfMerchantViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param permission 
     * @param brandIds  (optional)
     * @param partnerIds  (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/partners/merchants/AdditionalInfoNames")
    fun partnerMerchantGetMerchantAdditionalInfoNames(@Query("permission") permission: kotlin.String, @Query("brandIds") brandIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfListOfString>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param permission 
     * @param name 
     * @param brandIds  (optional)
     * @param partnerIds  (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/partners/merchants/AdditionalInfoValues")
    fun partnerMerchantGetMerchantAdditionalInfoValues(@Query("permission") permission: kotlin.String, @Query("name") name: kotlin.String, @Query("brandIds") brandIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfListOfString>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId 
     * @param from  (optional)
     * @param count  (optional)
     * @param nameSubstring  (optional)
     * @param internalNameSubstring  (optional)
     * @param brandNameSubstring  (optional)
     * @param brandId  (optional)
     * @param locationSubstring  (optional)
     * @param uids  (optional)
     * @param additionalInfoKey  (optional)
     * @param additionalInfoValue  (optional)
     * @param isOrderedByAscending  (optional)
     * @param mode  (optional)
     * @param merchantIds  (optional)
     * @param sortingIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMerchantLineViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/merchants")
    fun partnerMerchantGetMerchants(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstring") nameSubstring: kotlin.String? = null, @Query("internalNameSubstring") internalNameSubstring: kotlin.String? = null, @Query("brandNameSubstring") brandNameSubstring: kotlin.String? = null, @Query("brandId") brandId: kotlin.Int? = null, @Query("locationSubstring") locationSubstring: kotlin.String? = null, @Query("uids") uids: kotlin.collections.MutableList<kotlin.String>? = null, @Query("additionalInfoKey") additionalInfoKey: kotlin.String? = null, @Query("additionalInfoValue") additionalInfoValue: kotlin.String? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null, @Query("mode") mode: ArchivedState? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfMerchantLineViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId 
     * @param from  (optional)
     * @param count  (optional)
     * @param nameSubstring  (optional)
     * @param internalNameSubstring  (optional)
     * @param brandNameSubstring  (optional)
     * @param brandId  (optional)
     * @param locationSubstring  (optional)
     * @param uids  (optional)
     * @param additionalInfoKey  (optional)
     * @param additionalInfoValue  (optional)
     * @param isOrderedByAscending  (optional)
     * @param mode  (optional)
     * @param merchantIds  (optional)
     * @param sortingIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBrandLineViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/merchants/ByBrands")
    fun partnerMerchantGetMerchantsCountByBrand(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("nameSubstring") nameSubstring: kotlin.String? = null, @Query("internalNameSubstring") internalNameSubstring: kotlin.String? = null, @Query("brandNameSubstring") brandNameSubstring: kotlin.String? = null, @Query("brandId") brandId: kotlin.Int? = null, @Query("locationSubstring") locationSubstring: kotlin.String? = null, @Query("uids") uids: kotlin.collections.MutableList<kotlin.String>? = null, @Query("additionalInfoKey") additionalInfoKey: kotlin.String? = null, @Query("additionalInfoValue") additionalInfoValue: kotlin.String? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null, @Query("mode") mode: ArchivedState? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("sortingIds") sortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfBrandLineViewModel>

    /**
     * Возвращает информацию о торговой точке по внешним идентификаторам Партнера и торговой точки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerUid Внешний идентификатор Партнера.
     * @param merchantUid Внешний идентификатор торговой точки.
     * @return [Call]<[ResultModelOfMerchantViewModel]>
     */
    @GET("v1.2/partners/{partnerUid}/merchants/{merchantUid}")
    fun partnerMerchantGetPartnersByPartnerUidMerchantsByMerchantUid(@Path("partnerUid") partnerUid: kotlin.String, @Path("merchantUid") merchantUid: kotlin.String): Call<ResultModelOfMerchantViewModel>

    /**
     * Возвращает информацию об ограничениях списания бонусов торговой точки.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param merchantId Внутренний идентификатор торговой точки.
     * @return [Call]<[ResultModelOfListOfPaymentLimitViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/merchants/{merchantId}/paymentLimit")
    fun partnerMerchantGetPaymentLimits(@Path("partnerId") partnerId: kotlin.Int, @Path("merchantId") merchantId: kotlin.Int): Call<ResultModelOfListOfPaymentLimitViewModel>

    /**
     * Восстановливает торговую точку из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param merchantId Внутренний идентификатор торговой точки.
     * @param changeCode Изменить код (true — изменить, false — не изменять). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/partners/{partnerId}/merchants/{merchantId}/restore")
    fun partnerMerchantRestore(@Path("partnerId") partnerId: kotlin.Int, @Path("merchantId") merchantId: kotlin.Int, @Query("changeCode") changeCode: kotlin.Boolean? = null): Call<ResultModel>

}

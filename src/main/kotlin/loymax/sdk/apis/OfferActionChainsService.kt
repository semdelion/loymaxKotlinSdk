package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface OfferActionChainsService {
    /**
     * Получает список доступных действий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @param eventType Тип события.
     * @param exclusionType Тип события, по которому требуется отфильтровать типы действий. (optional)
     * @param chainId Идентификатор цепочки действий. (optional)
     * @return [Call]<[ResultModelOfListOfActionTypeModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/AvailableActionTypes")
    fun offerActionChainsGetAvailableActionTypes(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String, @Query("eventType") eventType: OfferEventType, @Query("exclusionType") exclusionType: OfferEventType? = null, @Query("chainId") chainId: kotlin.Int? = null): Call<ResultModelOfListOfActionTypeModel>

    /**
     * Получает список доступных событий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param includeSubEvents Если true вернутся все события без исключения. (optional)
     * @return [Call]<[ResultModelOfListOfOfferEventModel]>
     */
    @GET("v1.2/Offers/AvailableEventTypes")
    fun offerActionChainsGetAvailableEventTypes(@Query("includeSubEvents") includeSubEvents: kotlin.Boolean? = null): Call<ResultModelOfListOfOfferEventModel>

    /**
     * Получает список имеющихся действий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfListOfOfferEventInfoModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/eventTypes")
    fun offerActionChainsGetEventTypes(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfListOfOfferEventInfoModel>

    /**
     * Получает цепочку событий.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerChainId Идентификатор цепочки действий.
     * @param offerVersion Дескриптор версии акции.
     * @return [Call]<[ResultModelOfOfferActionChainViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains/{offerChainId}")
    fun offerActionChainsGetOfferActionChain(@Path("offerId") offerId: kotlin.Int, @Path("offerChainId") offerChainId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String): Call<ResultModelOfOfferActionChainViewModel>

    /**
     * Получает все цепочки событий акции.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param offerVersion Дескриптор версии акции.
     * @param eventType Тип события. (optional)
     * @param parentId Идентификатор родительского действия. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOfferActionChainViewModel]>
     */
    @GET("v1.2/Offers/{offerId}/versions/{offerVersion}/offerChains")
    fun offerActionChainsGetOfferActionChains(@Path("offerId") offerId: kotlin.Int, @Path("offerVersion") offerVersion: kotlin.String, @Query("eventType") eventType: OfferEventType? = null, @Query("parentId") parentId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfOfferActionChainViewModel>

    /**
     * Получить информацию о родительском действии по идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param offerId Идентификатор акции.
     * @param actionId Идентификатор действия.
     * @return [Call]<[ResultModelOfActionPlacementInfo]>
     */
    @GET("v1.2/Offers/{offerId}/offerChains/parentActions/{actionId}")
    fun offerActionChainsGetParentActionIndex(@Path("offerId") offerId: kotlin.Int, @Path("actionId") actionId: kotlin.Int): Call<ResultModelOfActionPlacementInfo>

}

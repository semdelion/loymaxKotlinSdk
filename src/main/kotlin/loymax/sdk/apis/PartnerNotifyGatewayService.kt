package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PartnerNotifyGatewayService {
    /**
     * Удаляет шлюз Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор шлюза.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/partnerNotifyGateways/{id}")
    fun partnerNotifyGatewayDeletePartnerGateway(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает список шлюзов, которые можно добавить Партнеру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGatewayModel]>
     */
    @GET("v1.2/partnerNotifyGateways/partner/{partnerId}")
    fun partnerNotifyGatewayGetPartnerAvailableGateway(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfGatewayModel>

    /**
     * Возвращает информацию о шлюзе по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param gatewayId Внутренний идентификатор шлюза.
     * @return [Call]<[ResultModelOfPartnerNotifyGatewayViewModel]>
     */
    @GET("v1.2/partnerNotifyGateways/{gatewayId}")
    fun partnerNotifyGatewayGetPartnerGateway(@Path("gatewayId") gatewayId: kotlin.Int): Call<ResultModelOfPartnerNotifyGatewayViewModel>

    /**
     * Возвращает список шлюзов Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel]>
     */
    @GET("v1.2/partnerNotifyGateways")
    fun partnerNotifyGatewayGetPartnerGateways(@Query("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel>

}

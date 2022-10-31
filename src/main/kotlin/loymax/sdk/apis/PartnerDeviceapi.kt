package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfDeviceViewModel
import loymax.sdk.models.ResultModelOfListOfDeviceTypeViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfDeviceBriefViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfDeviceViewModel

interface PartnerDeviceapi {
    /**
     * Возвращает информацию о кассе.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param deviceId Внутренний идентификатор кассы.
     * @return [Call]<[ResultModelOfDeviceViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/devices/{deviceId}")
    fun partnerDeviceGetDevice(@Path("partnerId") partnerId: kotlin.Int, @Path("deviceId") deviceId: kotlin.Int): Call<ResultModelOfDeviceViewModel>

    /**
     * Возвращает список касс Партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param merchantIds Список внутренних идентификаторов магазинов. (optional)
     * @param legalId Внутренний идентификатор юридического лица. (optional)
     * @param code Код. (optional)
     * @param mode Признак состояния кассы. (optional)
     * @param isOrderedByAscending Режим прямой сортировки (true — да, false — нет). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDeviceBriefViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/deviceInfo")
    fun partnerDeviceGetPartnerDeviceInfo(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("legalId") legalId: kotlin.Int? = null, @Query("code") code: kotlin.String? = null, @Query("mode") mode: ArchivedState? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfDeviceBriefViewModel>

    /**
     * Возвращает список касс для привязки к OAuth-приложениям.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterLogicalId Логическое имя кассы. (optional)
     * @param filterOAuthApplicationId Внутренний идентификатор OAuth-приложения. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDeviceBriefViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/oauth/devices")
    fun partnerDeviceGetPartnerDeviceInfoForOAuthApplication(@Path("partnerId") partnerId: kotlin.Int, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.logicalId") filterLogicalId: kotlin.String? = null, @Query("filter.oAuthApplicationId") filterOAuthApplicationId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfDeviceBriefViewModel>

    /**
     * Возвращает список касс Партнера с детальной информацией.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param merchantIds Список внутренних идентификаторов магазинов. (optional)
     * @param legalId Внутренний идентификатор юридического лица. (optional)
     * @param code Код. (optional)
     * @param mode Признак состояния кассы. (optional)
     * @param isOrderedByAscending Режим прямой сортировки (true — да, false — нет). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDeviceViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/devices")
    fun partnerDeviceGetPartnerDevices(@Path("partnerId") partnerId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("merchantIds") merchantIds: kotlin.String? = null, @Query("legalId") legalId: kotlin.Int? = null, @Query("code") code: kotlin.String? = null, @Query("mode") mode: ArchivedState? = null, @Query("isOrderedByAscending") isOrderedByAscending: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfDeviceViewModel>

    /**
     * Возвращает список типов кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param count Количество возвращаемых элементов выборки.
     * @param nameSubstr Подстрока для поиска по названию типа кассы. (optional)
     * @return [Call]<[ResultModelOfListOfDeviceTypeViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/devices/possibleTypes")
    fun partnerDeviceGetPossibleTypes(@Path("partnerId") partnerId: kotlin.Int, @Query("count") count: kotlin.Int, @Query("nameSubstr") nameSubstr: kotlin.String? = null): Call<ResultModelOfListOfDeviceTypeViewModel>

    /**
     * Восстанавливает кассу из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param deviceId Внутренний идентификатор кассы.
     * @param changeCode Необходимость изменения кода кассы (true — да, false — нет). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/partners/{partnerId}/devices/{deviceId}/restore")
    fun partnerDeviceRestore(@Path("partnerId") partnerId: kotlin.Int, @Path("deviceId") deviceId: kotlin.Int, @Query("changeCode") changeCode: kotlin.Boolean? = null): Call<ResultModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModelOfPagedViewModelOfDeviceBriefViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfMoneyViewModel

interface Deviceapi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from  (optional)
     * @param count  (optional)
     * @param code  (optional)
     * @param mode  (optional)
     * @param loyaltyProgramId  (optional)
     * @param sortingId  (optional)
     * @param merchantIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDeviceBriefViewModel]>
     */
    @GET("v1.2/Devices")
    fun deviceGetAvailableDevices(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("code") code: kotlin.String? = null, @Query("mode") mode: ArchivedState? = null, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int? = null, @Query("sortingId") sortingId: kotlin.Int? = null, @Query("merchantIds") merchantIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfDeviceBriefViewModel>

    /**
     * Возвращает информацию о счетах кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор кассы.
     * @param loyaltyProgramId Внутренний идентификатор Программы лояльности.
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterName Подстрока для поиска по названию валюты. (optional)
     * @param filterSortingIds Список внутренних идентификаторов касс, которые будут отображаться первыми в списке. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMoneyViewModel]>
     */
    @GET("v1.2/Devices/{id}/balances")
    fun deviceGetDeviceBalances(@Path("id") id: kotlin.Int, @Query("loyaltyProgramId") loyaltyProgramId: kotlin.Int, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.name") filterName: kotlin.String? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfMoneyViewModel>

}

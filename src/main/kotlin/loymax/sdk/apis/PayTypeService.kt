package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PayTypeService {
    /**
     * Получить список всех способов оплаты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param payTypeFilterName Название типа оплаты. (optional)
     * @param payTypeFilterCount Количество элементов в выборке. (optional)
     * @param payTypeFilterFrom С какого элемента начать выборку. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPayTypeViewModel]>
     */
    @GET("v1.2/payType")
    fun payTypeGetList(@Query("payTypeFilter.name") payTypeFilterName: kotlin.String? = null, @Query("payTypeFilter.count") payTypeFilterCount: kotlin.Int? = null, @Query("payTypeFilter.from") payTypeFilterFrom: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfPayTypeViewModel>

    /**
     * Получение информации по типу оплаты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор типа оплаты.
     * @return [Call]<[ResultModelOfPayTypeViewModel]>
     */
    @GET("v1.2/payType/{id}")
    fun payTypeGetPayType(@Path("id") id: kotlin.Int): Call<ResultModelOfPayTypeViewModel>

    /**
     * Восстановление способа оплаты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id способа оплаты.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/payType/{id}/recover")
    fun payTypeRecoverPayType(@Path("id") id: kotlin.Int): Call<ResultModel>

}

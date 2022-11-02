package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface BusinessEventsService {
    /**
     * Возвращает список доступных переменных контекста.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventType Тип события.
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/Events/{eventType}/Variables")
    fun businessEventsGetAvailableVariables(@Path("eventType") eventType: OfferEventType): Call<ResultModelOfListOfString>

    /**
     * Возвращает список активностей.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterActivityDateFrom Дата создания с. (optional)
     * @param filterActivityDateTo Дата создания по. (optional)
     * @param filterPersonId Идентификатор пользователя. (optional)
     * @param filterPurchaseId Идентификатор покупки. (optional)
     * @param filterContextType Тип контекста. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBusinessActivityViewModel]>
     */
    @GET("v1.2/Events")
    fun businessEventsGetBusinessEvents(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.activityDateFrom") filterActivityDateFrom: kotlin.String? = null, @Query("filter.activityDateTo") filterActivityDateTo: kotlin.String? = null, @Query("filter.personId") filterPersonId: kotlin.Int? = null, @Query("filter.purchaseId") filterPurchaseId: kotlin.Int? = null, @Query("filter.contextType") filterContextType: BusinessActivityContextType? = null): Call<ResultModelOfPagedViewModelOfBusinessActivityViewModel>

}

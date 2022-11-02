package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CounterValueService {
    /**
     * Возвращает список доступных значений счетчика.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param counterId Внутренний идентификатор счетчика.
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterPersonId Идентификатор пользователя. (optional)
     * @param filterAccountGroupId Идентификатор группы счетов. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCounterValueBaseViewModel]>
     */
    @GET("v1.2/counters/{counterId}/values")
    fun counterValueGetCounterValues(@Path("counterId") counterId: kotlin.Int, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.personId") filterPersonId: kotlin.Int? = null, @Query("filter.accountGroupId") filterAccountGroupId: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfCounterValueBaseViewModel>

}

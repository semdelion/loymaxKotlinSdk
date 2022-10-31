package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfPersonAttributeValueHistoryModel

interface PersonAttributeValueHistoryapi {
    /**
     * Получить историю изменения значения атрибута пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id пользователя.
     * @param attributeId Id атрибута.
     * @param filterCreateDateFrom Начальная дата периода в формате 0000-00-00T00 00 00Z (Если не задана, то - самая ранняя). (optional)
     * @param filterCreateDateTo Конечная дата периода в формате 0000-00-00T00 00 00Z.(Если не задана, то - самая поздняя). (optional)
     * @param filterSortDescendingByCreateDateTime Тип сортировки (true-по убыванию, false-по возрастанию). (optional)
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPersonAttributeValueHistoryModel]>
     */
    @GET("v1.2/users/{personId}/attributes/{attributeId}/history")
    fun personAttributeValueHistoryGetPersonAttributeHistory(@Path("personId") personId: kotlin.Int, @Path("attributeId") attributeId: kotlin.Int, @Query("filter.createDateFrom") filterCreateDateFrom: kotlin.String? = null, @Query("filter.createDateTo") filterCreateDateTo: kotlin.String? = null, @Query("filter.sortDescendingByCreateDateTime") filterSortDescendingByCreateDateTime: kotlin.Boolean? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null): Call<ResultModelOfPersonAttributeValueHistoryModel>

}

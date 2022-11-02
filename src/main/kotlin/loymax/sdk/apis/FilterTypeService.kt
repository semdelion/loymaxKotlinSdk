package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface FilterTypeService {
    /**
     * Удалить тип фильтра.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор типа фильтра.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/filterTypes/{id}/Delete")
    fun filterTypeDeleteFilterType(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает доступные типы фильтров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSubstring Подстрока для поиска. (optional)
     * @param filterShowMode Режим отображения архивных типов фильтров. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfFilterTypeModel]>
     */
    @GET("v1.2/filterTypes")
    fun filterTypeGetFilterTypes(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.substring") filterSubstring: kotlin.String? = null, @Query("filter.showMode") filterShowMode: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfFilterTypeModel>

    /**
     * Восстановить тип фильтра.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор типа фильтра.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/filterTypes/{id}/Restore")
    fun filterTypeRestoreFilterType(@Path("id") id: kotlin.Int): Call<ResultModel>

}

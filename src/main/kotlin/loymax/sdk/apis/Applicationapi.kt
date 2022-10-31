package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfApplicationModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfApplicationModel
import loymax.sdk.models.ResultModelOfString

interface Applicationapi {
    /**
     * Получает информацию об OAuth-приложении по его идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор OAuth-приложения.
     * @return [Call]<[ResultModelOfApplicationModel]>
     */
    @GET("v1.2/OAuth/Applications/{id}")
    fun applicationGet(@Path("id") id: kotlin.Int): Call<ResultModelOfApplicationModel>

    /**
     * Получает список OAuth-приложений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Порядковый номер элемента, с которого должна начинаться выборка. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterMode Режим выбора архивных объектов. (optional)
     * @param filterIsOrderedByAscending Режим прямой сортировки. (optional)
     * @param filterPartnerIds Внутренние идентификаторы Партнеров (Id). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfApplicationModel]>
     */
    @GET("v1.2/OAuth/Applications")
    fun applicationGetFilteredPagedList(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.mode") filterMode: ArchivedState? = null, @Query("filter.isOrderedByAscending") filterIsOrderedByAscending: kotlin.Boolean? = null, @Query("filter.partnerIds") filterPartnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfApplicationModel>

    /**
     * Получает секретный ключ для OAuth-приложения по его идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор OAuth-приложения.
     * @return [Call]<[ResultModelOfString]>
     */
    @GET("v1.2/OAuth/Applications/{id}/Secret")
    fun applicationGetSecret(@Path("id") id: kotlin.Int): Call<ResultModelOfString>

    /**
     * Восстанавливает OAuth-приложение.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор OAuth-приложения.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/OAuth/Applications/{id}/Restore")
    fun applicationRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

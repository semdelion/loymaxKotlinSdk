package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface ConfigurationScriptsService {
    /**
     * Возвращает доступные БД.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[kotlin.collections.MutableList<kotlin.String>]>
     */
    @GET("v1.2/configurationScripts/availableDatabases")
    fun configurationScriptsGetDbNames(): Call<kotlin.collections.MutableList<kotlin.String>>

    /**
     * Возвращает список всех скриптов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterIdSubstring Подстрока для поиска по идентификатору. (optional)
     * @param filterConfigDeployId Идентификатор деплоя. (optional)
     * @param filterName Наименование БД. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfConfigurationScriptViewModel]>
     */
    @GET("v1.2/configurationScripts")
    fun configurationScriptsGetScripts(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.idSubstring") filterIdSubstring: kotlin.String? = null, @Query("filter.configDeployId") filterConfigDeployId: kotlin.String? = null, @Query("filter.name") filterName: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfConfigurationScriptViewModel>

}

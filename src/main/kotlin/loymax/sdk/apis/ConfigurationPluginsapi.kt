package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfPagedViewModelOfConfigurationPluginViewModel

interface ConfigurationPluginsapi {
    /**
     * Возвращает список всех плагинов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterPluginSubstring Подстрока для поиска по названию плагина. (optional)
     * @param filterDeployIdSubstring Подстрока для поиска по ID деплоя. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfConfigurationPluginViewModel]>
     */
    @GET("v1.2/configurationPlugins")
    fun configurationPluginsGetPlugins(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.pluginSubstring") filterPluginSubstring: kotlin.String? = null, @Query("filter.deployIdSubstring") filterDeployIdSubstring: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfConfigurationPluginViewModel>

}

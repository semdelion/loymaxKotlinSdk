package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfExtensionConfigurationViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfExtensionConfigurationViewModel

interface ExtensionConfigurationapi {
    /**
     * Получить конфигурацию плагина по его ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param extensionId Id плагина.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedKey Ключ. (optional)
     * @param filterSearchedValue Значение. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfExtensionConfigurationViewModel]>
     */
    @GET("v1.2/extensions/{extensionId}/configurations")
    fun extensionConfigurationGetByExtensionId(@Path("extensionId") extensionId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedKey") filterSearchedKey: kotlin.String? = null, @Query("filter.searchedValue") filterSearchedValue: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfExtensionConfigurationViewModel>

    /**
     * Получить конфигурацию плагина по ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param extensionId Id плагина.
     * @param id Id.
     * @return [Call]<[ResultModelOfExtensionConfigurationViewModel]>
     */
    @GET("v1.2/extensions/{extensionId}/configurations/{id}")
    fun extensionConfigurationGetByExtensionIdAndKey(@Path("extensionId") extensionId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModelOfExtensionConfigurationViewModel>

}

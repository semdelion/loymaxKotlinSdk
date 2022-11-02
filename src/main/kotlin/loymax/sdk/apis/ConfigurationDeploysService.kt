package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface ConfigurationDeploysService {
    /**
     * Получение описания деплоя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param externalId Внешний дентификатор деплоя.
     * @return [Call]<[ResultModelOfConfigurationDeployViewModel]>
     */
    @GET("v1.2/configurationDeploys/{externalId}")
    fun configurationDeploysGetDeployInfo(@Path("externalId") externalId: kotlin.String): Call<ResultModelOfConfigurationDeployViewModel>

    /**
     * Возвращает список всех деплоев.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterPackageVersionSubstring Подстрока для поиска по версионности. (optional)
     * @param filterIsSuccess Успешность выполнения. (optional)
     * @param filterAuthorSubstring Подстрока для поиска по автору. (optional)
     * @param filterExternalId Внешний идентификатор. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfConfigurationDeployViewModel]>
     */
    @GET("v1.2/configurationDeploys")
    fun configurationDeploysGetDeploys(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.packageVersionSubstring") filterPackageVersionSubstring: kotlin.String? = null, @Query("filter.isSuccess") filterIsSuccess: kotlin.Boolean? = null, @Query("filter.authorSubstring") filterAuthorSubstring: kotlin.String? = null, @Query("filter.externalId") filterExternalId: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfConfigurationDeployViewModel>

}

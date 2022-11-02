package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface LifeTimeDefinitionService {
    /**
     * Возвращает информацию о времени жизни бонусов по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор времени жизни бонусов.
     * @return [Call]<[ResultModelOfLifeTimeDefinitionViewModel]>
     */
    @GET("v1.2/lifeTimeDefinitions/{id}")
    fun lifeTimeDefinitionGetLifeTimeDefinition(@Path("id") id: kotlin.Int): Call<ResultModelOfLifeTimeDefinitionViewModel>

    /**
     * Возвращает информацию о времени жизни бонусов по его внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор времени жизни бонусов.
     * @return [Call]<[ResultModelOfLifeTimeDefinitionViewModel]>
     */
    @GET("v1.2/lifeTimeDefinitions/{uid}")
    fun lifeTimeDefinitionGetLifeTimeDefinitionByUid(@Path("uid") uid: kotlin.String): Call<ResultModelOfLifeTimeDefinitionViewModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param name  (optional)
     * @param status  (optional)
     * @param from  (optional)
     * @param count  (optional)
     * @param logicalName  (optional)
     * @param partnerId  (optional)
     * @param lifeTimeDefinitionIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel]>
     */
    @GET("v1.2/lifeTimeDefinitions")
    fun lifeTimeDefinitionGetLifeTimeDefinitions(@Query("name") name: kotlin.String? = null, @Query("status") status: ArchivedState? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("logicalName") logicalName: kotlin.String? = null, @Query("partnerId") partnerId: kotlin.Int? = null, @Query("lifeTimeDefinitionIds") lifeTimeDefinitionIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel>

    /**
     * Востанавливает из архива время жизни бонуса.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор времени жизни бонусов.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/lifeTimeDefinitions/{id}/restore")
    fun lifeTimeDefinitionRestoreLifeTimeDefinition(@Path("id") id: kotlin.Int): Call<ResultModel>

}

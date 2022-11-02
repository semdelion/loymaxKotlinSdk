package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface EmissionNumberTemplateService {
    /**
     * Возвращает шаблон для генерации номеров выпусков по его ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id ID шаблона уведомлений.
     * @return [Call]<[ResultModelOfNumberTemplateViewModel]>
     */
    @GET("v1.2/emissionNumberTemplates/{id}")
    fun emissionNumberTemplateGetEmissionTemplate(@Path("id") id: kotlin.Int): Call<ResultModelOfNumberTemplateViewModel>

    /**
     * Получение списка всех шаблонов для генерации номеров выпусков.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterEmissionType Тип шаблона уведомлений. (optional)
     * @param filterTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param filterShowMode Режим отображения архивных шаблонов. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfNumberTemplateViewModel]>
     */
    @GET("v1.2/emissionNumberTemplates")
    fun emissionNumberTemplateGetEmissionTemplates(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.emissionType") filterEmissionType: EmissionTypeEnum? = null, @Query("filter.textSubStr") filterTextSubStr: kotlin.String? = null, @Query("filter.showMode") filterShowMode: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfNumberTemplateViewModel>

    /**
     * Восстановить из архива шаблон для генерации номеров выпусков.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/emissionNumberTemplates/{id}/restore")
    fun emissionNumberTemplateRestoreEmissionNumberTemplate(@Path("id") id: kotlin.Int): Call<ResultModel>

}

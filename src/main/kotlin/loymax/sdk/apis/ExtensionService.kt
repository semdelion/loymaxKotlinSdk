package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface ExtensionService {
    /**
     * Возвращает список всех плагинов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterNameSearchedText Текст поиска в имени. (optional)
     * @param filterClassNameSearchedText Текст поиска в имени класса. (optional)
     * @param filterIsDisabled Состояние. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfExtensionViewModel]>
     */
    @GET("v1.2/extensions")
    fun extensionGet(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.nameSearchedText") filterNameSearchedText: kotlin.String? = null, @Query("filter.classNameSearchedText") filterClassNameSearchedText: kotlin.String? = null, @Query("filter.isDisabled") filterIsDisabled: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfExtensionViewModel>

    /**
     * Получить плагин по ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентификатор плагина.
     * @return [Call]<[ResultModelOfExtensionViewModel]>
     */
    @GET("v1.2/extensions/{id}")
    fun extensionGetExtension(@Path("id") id: kotlin.Int): Call<ResultModelOfExtensionViewModel>

}

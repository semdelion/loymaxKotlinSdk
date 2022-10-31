package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ArchivedState
import loymax.sdk.models.DeviceTypeValidEncodingType
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfDeviceTypeViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfDeviceTypeViewModel
import loymax.sdk.models.XmlVersion

interface DeviceTypeapi {
    /**
     * Возвращает информацию о типе кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор типа кассы.
     * @return [Call]<[ResultModelOfDeviceTypeViewModel]>
     */
    @GET("v1.2/DeviceTypes/{id}")
    fun deviceTypeGet(@Path("id") id: kotlin.Int): Call<ResultModelOfDeviceTypeViewModel>

    /**
     * Возвращает список всех типов касс.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterVersion Версия поиска. (optional)
     * @param filterCondition Состояние. (optional)
     * @param filterEncodingType Тип кодировки. (optional)
     * @param filterSortingIds Идентификаторы типов касс, выводимых в начале списка. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfDeviceTypeViewModel]>
     */
    @GET("v1.2/DeviceTypes")
    fun deviceTypeGetAll(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.version") filterVersion: XmlVersion? = null, @Query("filter.condition") filterCondition: ArchivedState? = null, @Query("filter.encodingType") filterEncodingType: DeviceTypeValidEncodingType? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfDeviceTypeViewModel>

    /**
     * Восстанавливает из архива тип кассы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор типа кассы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/DeviceTypes/{id}/restore")
    fun deviceTypeRestoreDeviceType(@Path("id") id: kotlin.Int): Call<ResultModel>

}

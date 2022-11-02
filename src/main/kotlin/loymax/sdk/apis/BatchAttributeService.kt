package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface BatchAttributeService {
    /**
     * Возвращает список пользователей АРМ, которые проводили пакетные обновления атрибутов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Имя и фамилия пользователя АРМ. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCreatorModel]>
     */
    @GET("v1.2/batchAttribute/creators")
    fun batchAttributeGetAvailableCreators(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfCreatorModel>

    /**
     * Возвращает информацию о пакетном обновлении атрубитов клиентов (по внутреннему идентификатору пакетного обновления).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного обновления атрибутов клиентов.
     * @return [Call]<[ResultModelOfBatchAttributeUpdateModel]>
     */
    @GET("v1.2/batchAttribute/{batchId}")
    fun batchAttributeGetBatch(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchAttributeUpdateModel>

    /**
     * Возвращает информацию о состоянии операций пакетного обновления атрибутов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного обновления атрибутов клиентов.
     * @return [Call]<[ResultModelOfBatchOperationsQueueInfo]>
     */
    @GET("v1.2/batchAttribute/{batchId}/progress")
    fun batchAttributeGetBatchOperationsQueueProgress(@Path("batchId") batchId: kotlin.Int): Call<ResultModelOfBatchOperationsQueueInfo>

    /**
     * Возвращает в виде в CSV-файла подробную информацию о пакетном обновлении атрубитов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного обновления атрибутов клиентов.
     * @param deferredOperationState Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения).
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/batchAttribute/{batchId}/export")
    fun batchAttributeGetErrorOperationsCsv(@Path("batchId") batchId: kotlin.Int, @Query("deferredOperationState") deferredOperationState: DeferredOperationState): Call<kotlin.String>

    /**
     * Возвращает историю пакетных обновлений атрибутов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterFromDate Дата, с которой необходимо вывести историю. (optional)
     * @param filterToDate Дата, до которой необходимо вывести историю. (optional)
     * @param filterCreatorGetAll Получить записи по всем авторам. (optional)
     * @param filterCreatorCreatorId Идентификатор автора. (optional)
     * @param filterState Состояние обработки операций. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBatchAttributeUpdateModel]>
     */
    @GET("v1.2/batchAttribute")
    fun batchAttributeGetHistory(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.fromDate") filterFromDate: kotlin.String? = null, @Query("filter.toDate") filterToDate: kotlin.String? = null, @Query("filter.creator.getAll") filterCreatorGetAll: kotlin.Boolean? = null, @Query("filter.creator.creatorId") filterCreatorCreatorId: kotlin.Int? = null, @Query("filter.state") filterState: BatchState? = null): Call<ResultModelOfPagedViewModelOfBatchAttributeUpdateModel>

    /**
     * Возвращает подробную информацию о пакетном обновлении атрубитов клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param batchId Внутренний идентификатор пакетного обновления атрибутов клиентов.
     * @param deferredOperationState Состояние, по которому будут отфильтрованы операции в пакетном обновлении (Created — создана, Completed — выполнена, Error — ошибка выполнения).
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfOperationBatchAttributeUpdateModel]>
     */
    @GET("v1.2/batchAttribute/{batchId}/operations")
    fun batchAttributeGetOperations(@Path("batchId") batchId: kotlin.Int, @Query("deferredOperationState") deferredOperationState: DeferredOperationState, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfOperationBatchAttributeUpdateModel>

    /**
     * Запускает пакетное обновление значений атрибутов клиента, полученных из CSV-файла.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param description Описание файла.
     * @param supportEmptyString Необходимость установки вместо пустых значений атрибута значение \&quot;null\&quot; (true — да, false — нет).
     * @param file file to upload
     * @param preLoadValidationEnable Необходимость валидации данных перед обновлением атрибутов (true — да, false — нет). (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @PUT("v1.2/batchAttribute/updateCsv")
    fun batchAttributeUpdateAttributesFromCsv(@Query("description") description: kotlin.String, @Query("supportEmptyString") supportEmptyString: kotlin.Boolean, @Query("file") file: java.io.File, @Query("preLoadValidationEnable") preLoadValidationEnable: kotlin.Boolean? = null): Call<ResultModelOfInt32>

}

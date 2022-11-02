package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface FileService {
    /**
     * Возвращает информацию о параметрах файла по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор файла.
     * @return [Call]<[ResultModelOfFileEdit]>
     */
    @GET("v1.2/files/{id}")
    fun fileGet(@Path("id") id: kotlin.Int): Call<ResultModelOfFileEdit>

    /**
     * Возвращает информацию о параметрах файла по его внешнему идентификатору.
     * Используется только в витрине.
     * Responses:
     *  - 200: OK
     *
     * @param guid Внешний идентификатор файла.
     * @return [Call]<[ResultModelOfFileEdit]>
     */
    @GET("v1.2/files/guid/{guid}")
    fun fileGetFileByGuid(@Path("guid") guid: kotlin.String): Call<ResultModelOfFileEdit>

    /**
     * Возвращает список файлов с информацией об их параметрах.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Порядковый номер начального элемента выборки. (optional)
     * @param filterCount Количество возвращаемых элементов выборки. (optional)
     * @param filterFileName Название файла. (optional)
     * @param filterFileGuid Внешний идентификатор файла. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfFileEdit]>
     */
    @GET("v1.2/files")
    fun fileGets(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.fileName") filterFileName: kotlin.String? = null, @Query("filter.fileGuid") filterFileGuid: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfFileEdit>

    /**
     * Возвращает максимальный размер загружаемого файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfInt32]>
     */
    @GET("v1.2/files/maxSizeFile")
    fun fileMaxSize(): Call<ResultModelOfInt32>

}

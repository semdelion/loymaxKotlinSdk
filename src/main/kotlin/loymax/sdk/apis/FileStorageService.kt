package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface FileStorageService {
    /**
     * Возвращает файл из хранилища файлов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор файла.
     * @param taskId Внутренний идентификатор рассылки, в котором используется файл. (optional)
     * @param isDownload Необходимость создания ссылки для скачивания файла (true — да, false — нет). (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("v1.2/Files/{uid}")
    fun fileStorageGet(@Path("uid") uid: kotlin.String, @Query("taskId") taskId: kotlin.Int? = null, @Query("isDownload") isDownload: kotlin.Boolean? = null): Call<kotlin.Any>

}

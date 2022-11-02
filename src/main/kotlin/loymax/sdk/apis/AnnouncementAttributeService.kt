package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface AnnouncementAttributeService {
    /**
     * Возвращает все атрибуты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfAttributeModel]>
     */
    @GET("v1.2/AnnouncementAttribute")
    fun announcementAttributeGetAll(): Call<ResultModelOfListOfAttributeModel>

    /**
     * Возвращает информацию об атрибуте.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор атрибута.
     * @return [Call]<[ResultModelOfAttributeModel]>
     */
    @GET("v1.2/AnnouncementAttribute/{id}")
    fun announcementAttributeGetAttribute(@Path("id") id: kotlin.Int): Call<ResultModelOfAttributeModel>

}

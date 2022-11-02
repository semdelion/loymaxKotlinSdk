package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface AnnouncementSpaceService {
    /**
     * Возвращает описание всех рекламных мест.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfSpaceModel]>
     */
    @GET("v1.2/AnnouncementSpace")
    fun announcementSpaceGetAll(): Call<ResultModelOfListOfSpaceModel>

    /**
     * Возвращает все атрибуты рекламного места.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламного места.
     * @return [Call]<[ResultModelOfListOfAttributeModel]>
     */
    @GET("v1.2/AnnouncementSpace/{id}/attributes")
    fun announcementSpaceGetBySpace(@Path("id") id: kotlin.Int): Call<ResultModelOfListOfAttributeModel>

    /**
     * Возвращает информацию о рекламном месте.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламного места.
     * @return [Call]<[ResultModelOfSpaceModel]>
     */
    @GET("v1.2/AnnouncementSpace/{id}")
    fun announcementSpaceGetSpace(@Path("id") id: kotlin.Int): Call<ResultModelOfSpaceModel>

}

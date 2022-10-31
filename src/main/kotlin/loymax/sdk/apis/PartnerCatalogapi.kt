package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfPartnerCatalogViewModel
import loymax.sdk.models.ResultModelOfPartnerCatalogViewModel
import loymax.sdk.models.ResultModelOfString

interface PartnerCatalogapi {
    /**
     * Генерирует новый пароль для каталога.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId 
     * @param catalogId 
     * @return [Call]<[ResultModelOfString]>
     */
    @GET("v1.2/partners/{partnerId}/catalogs/{catalogId}/generatePassword")
    fun partnerCatalogGeneratePassword(@Path("partnerId") partnerId: kotlin.String, @Path("catalogId") catalogId: kotlin.String): Call<ResultModelOfString>

    /**
     * Возвращает информацию о каталоге Партнера по внутреннему идентифкатору каталога.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param catalogId Внутренний идентификатор каталога.
     * @return [Call]<[ResultModelOfPartnerCatalogViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/catalogs/{catalogId}")
    fun partnerCatalogGet(@Path("partnerId") partnerId: kotlin.Int, @Path("catalogId") catalogId: kotlin.Int): Call<ResultModelOfPartnerCatalogViewModel>

    /**
     * Возвращает информацию о каталоге Партнера по внешнему идентифкатору каталога.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerUid Внешний идентификатор Партнера.
     * @param catalogUid Внешний идентификатор каталога.
     * @return [Call]<[ResultModelOfPartnerCatalogViewModel]>
     */
    @GET("v1.2/partners/{partnerUid}/catalogs/{catalogUid}")
    fun partnerCatalogGetByCatalogUid(@Path("partnerUid") partnerUid: kotlin.String, @Path("catalogUid") catalogUid: kotlin.String): Call<ResultModelOfPartnerCatalogViewModel>

    /**
     * Возвращает список каталогов Партнера по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerId Внутренний идентификатор Партнера.
     * @param name Название каталога. (optional)
     * @return [Call]<[ResultModelOfListOfPartnerCatalogViewModel]>
     */
    @GET("v1.2/partners/{partnerId}/catalogs")
    fun partnerCatalogGetPartnerCatalogs(@Path("partnerId") partnerId: kotlin.Int, @Query("name") name: kotlin.String? = null): Call<ResultModelOfListOfPartnerCatalogViewModel>

    /**
     * Возвращает список каталогов Партнера по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param partnerUid Внешний идентификатор Партнера.
     * @param name Название каталога. (optional)
     * @return [Call]<[ResultModelOfListOfPartnerCatalogViewModel]>
     */
    @GET("v1.2/partners/{partnerUid}/catalogs")
    fun partnerCatalogGetPartnersByPartnerUidCatalogs(@Path("partnerUid") partnerUid: kotlin.String, @Query("name") name: kotlin.String? = null): Call<ResultModelOfListOfPartnerCatalogViewModel>

}

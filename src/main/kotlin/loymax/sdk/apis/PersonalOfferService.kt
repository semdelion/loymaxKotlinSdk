package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface PersonalOfferService {
    /**
     * Создает персональное предложение.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param rawJson Параметры. (optional)
     * @param offerType  (optional)
     * @param id Ид. персонального предложения. (optional)
     * @return [Call]<[kotlin.Int]>
     */
    @PUT("v1.2/PersonalOffer/create")
    fun personalOfferCreatePersonalOffer(@Query("rawJson") rawJson: kotlin.String? = null, @Query("offerType") offerType: PersonalOfferTypeModel? = null, @Query("id") id: kotlin.Int? = null): Call<kotlin.Int>

    /**
     * Возвращает содержимое персонального предложения для пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @return [Call]<[ResultModelOfObject]>
     */
    @GET("v1.2/user/personalOffer/{logicalName}/contents")
    fun personalOfferGetContents(@Path("logicalName") logicalName: kotlin.String): Call<ResultModelOfObject>

    /**
     * Возвращает список персональных предложений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPersonalOfferModelInfo]>
     */
    @GET("v1.2/PersonalOffer")
    fun personalOfferGetList(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfPersonalOfferModelInfo>

    /**
     * Возвращает список доступных типов персональных предложений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[kotlin.collections.MutableList<PersonalOfferTypeModel>]>
     */
    @GET("v1.2/PersonalOffer/types")
    fun personalOfferGetPersonalOfferTypes(): Call<kotlin.collections.MutableList<PersonalOfferTypeModel>>

    /**
     * Возвращает содержимое персонального предложения для пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param logicalName Логическое имя атрибута.
     * @param rawJson JSON string. (optional)
     * @param contents  (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/user/personalOffer/{logicalName}/accept")
    fun personalOfferSetContents(@Path("logicalName") logicalName: kotlin.String, @Query("rawJson") rawJson: kotlin.String? = null, @Query("contents") contents: IPersonalOfferContentAccept? = null): Call<ResultModel>

    /**
     * Обновляет персональное предложение.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param rawJson Параметры. (optional)
     * @param offerType  (optional)
     * @param id Ид. персонального предложения. (optional)
     * @return [Call]<[PersonalOfferModelInfo]>
     */
    @PUT("v1.2/PersonalOffer/update")
    fun personalOfferUpdatePersonalOffer(@Query("rawJson") rawJson: kotlin.String? = null, @Query("offerType") offerType: PersonalOfferTypeModel? = null, @Query("id") id: kotlin.Int? = null): Call<PersonalOfferModelInfo>

}

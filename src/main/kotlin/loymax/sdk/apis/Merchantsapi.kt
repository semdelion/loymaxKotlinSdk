package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfMerchantInfoModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfMerchantInfoModel

interface Merchantsapi {
    /**
     * Возвращает информацию о торговой точке по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор торговой точки.
     * @return [Call]<[ResultModelOfMerchantInfoModel]>
     */
    @GET("v1.2/Merchants/{id}")
    fun merchantsGetInfo(@Path("id") id: kotlin.Int): Call<ResultModelOfMerchantInfoModel>

    /**
     * Возвращает информацию о торговой точке по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор торговой точки.
     * @return [Call]<[ResultModelOfMerchantInfoModel]>
     */
    @GET("v1.2/Merchants/{uid}")
    fun merchantsGetInfoByUid(@Path("uid") uid: kotlin.String): Call<ResultModelOfMerchantInfoModel>

    /**
     * Возвращает информацию о торговых точках (фильтр по внутренним идентификаторам торговых точек).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Фильтр по внешнему идентификатору бренда. (optional)
     * @param merchantsIds Фильтр по внутренним идентификаторам торговых точек. (optional)
     * @param cityId Внутренний идентификатор населенного пункта. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMerchantInfoModel]>
     */
    @GET("v1.2/Merchants")
    fun merchantsGetMerchants(@Query("brandId") brandId: kotlin.String? = null, @Query("merchantsIds") merchantsIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("cityId") cityId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfMerchantInfoModel>

    /**
     * Возвращает информацию о торговых точках (фильтр по внешним идентификаторам торговых точек).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param brandId Фильтр по внешнему идентификатору бренда. (optional)
     * @param merchantsUids Фильтр по внешним идентификаторам торговых точек. (optional)
     * @param cityId Внутренний идентификатор населенного пункта. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfMerchantInfoModel]>
     */
    @GET("v1.2/Merchants/ByUids")
    fun merchantsGetMerchantsByUids(@Query("brandId") brandId: kotlin.String? = null, @Query("merchantsUids") merchantsUids: kotlin.collections.MutableList<kotlin.String>? = null, @Query("cityId") cityId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfMerchantInfoModel>

}

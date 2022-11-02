package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface FavoriteGoodsService {
    /**
     * Очищает значение товара в ячейке.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id набора любимых товаров.
     * @param position Позиция в наборе.
     * @param personId Ид. пользователя.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/users/favoriteGoods/{id}/{position}")
    fun favoriteGoodsClearFavoriteGoodsPosition(@Path("id") id: kotlin.Int, @Path("position") position: kotlin.Int, @Query("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает набор любимых товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id набора любимых товаров.
     * @return [Call]<[ResultModelOfFavoriteGoodsCommonViewModel]>
     */
    @GET("v1.2/users/favoriteGoods/{id}")
    fun favoriteGoodsGetFavoriteGoods(@Path("id") id: kotlin.Int): Call<ResultModelOfFavoriteGoodsCommonViewModel>

    /**
     * Возвращает список наборов любимых товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fromDate Дата начала интервала.
     * @param toDate Дата окончания интервала.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel]>
     */
    @GET("v1.2/users/favoriteGoods")
    fun favoriteGoodsGetFavoriteGoodsList(@Query("fromDate") fromDate: kotlin.String, @Query("toDate") toDate: kotlin.String, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel>

    /**
     * Возвращает список товаров из персональных товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор любимого товара.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param name Фильтр по названию товара. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel]>
     */
    @GET("v1.2/users/favoriteGoods/{id}/list")
    fun favoriteGoodsGetGoods(@Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("name") name: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel>

    /**
     * Возвращает список наборов любимых товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id персоны.
     * @param fromDate Начальная дата периода выборки в формате 0000-00-00T00:00:00Z.
     * @param toDate Конечная дата периода выборки в формате 0000-00-00T00:00:00Z.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param groupName Наименование группы товаров. (optional)
     * @param personalOfferName Наименование персонального предложения. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel]>
     */
    @GET("v1.2/users/{personId}/favoriteGoods")
    fun favoriteGoodsGetUsersByPersonIdFavoriteGoods(@Path("personId") personId: kotlin.Int, @Query("fromDate") fromDate: kotlin.String, @Query("toDate") toDate: kotlin.String, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("groupName") groupName: kotlin.String? = null, @Query("personalOfferName") personalOfferName: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfFavoriteGoodsCommonViewModel>

    /**
     * Возвращает набор любимых товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Id персоны.
     * @param id Внутренний идентификатор набора любимых товаров.
     * @return [Call]<[ResultModelOfFavoriteGoodsCommonViewModel]>
     */
    @GET("v1.2/users/{personId}/favoriteGoods/{id}")
    fun favoriteGoodsGetUsersByPersonIdFavoriteGoodsById(@Path("personId") personId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModelOfFavoriteGoodsCommonViewModel>

    /**
     * Возвращает список любимых товаров из истории покупок.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Ид. пользователя.
     * @param id Внутренний идентификатор любимого товара.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel]>
     */
    @GET("v1.2/users/{personId}/favoriteGoods/{id}/list")
    fun favoriteGoodsGetUsersByPersonIdFavoriteGoodsByIdList(@Path("personId") personId: kotlin.Int, @Path("id") id: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogLeafViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.GoodsCatalogSearchParameter
import loymax.sdk.models.GoodsCatalogSortParameter
import loymax.sdk.models.GoodsSetCatalogItem
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel

interface GoodsGroupCatalogapi {
    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибуту и строке поиска.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param attributeFilterId Id фильтра по атрибуту.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog/search")
    fun goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Path("attributeFilterId") attributeFilterId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибутам и фильтру.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора товаров.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog/search")
    fun goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param sortParameter Параметр сортировки. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/search")
    fun goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("sortParameter") sortParameter: GoodsCatalogSortParameter? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, зафиксированных.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/fixedCatalog/search")
    fun goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, состоящих в группе товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/catalog/search")
    fun goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить порядковый номер элемента в каталоге.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param catalogItemId Id элемента каталога.
     * @param parentNodeId Id родительского элемента каталога. (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/catalog/items/{catalogItemId}/index")
    fun goodsGroupCatalogGetCatalogItemIndex(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("catalogItemId") catalogItemId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null): Call<ResultModelOfInt32>

    /**
     * Получить каталог товаров, состоящих в наборах группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/catalog")
    fun goodsGroupCatalogGetGoodsGroupCatalog(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить каталог зафиксированных товаров группы товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/fixedCatalog")
    fun goodsGroupCatalogGetGoodsGroupFixedCatalog(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить каталог товаров, подходящих под фильтр по атрибуту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param attributeFilterId Id фильтра по атрибуту.
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog")
    fun goodsGroupCatalogGetGoodsSetAttributeFilterCatalog(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Path("attributeFilterId") attributeFilterId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить каталог товаров набора.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param sortParameter Параметр сортировки. (optional)
     * @param checkedOnly Отображать только выбранные элементы. (optional)
     * @param filterSearchedText Значение параметра товара. (optional)
     * @param filterSearchParameter Параметр товара, по которому выполняется поиск (Name - название, ItemID - внутренний идентификатор, BarCode - штрихкод). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog")
    fun goodsGroupCatalogGetGoodsSetCatalog(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("sortParameter") sortParameter: GoodsCatalogSortParameter? = null, @Query("checkedOnly") checkedOnly: kotlin.Boolean? = null, @Query("filter.searchedText") filterSearchedText: kotlin.String? = null, @Query("filter.searchParameter") filterSearchParameter: GoodsCatalogSearchParameter? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Получить каталог товаров, подходящих под фильтры по атрибутам.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param parentNodeId Id родительского узла. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel]>
     */
    @GET("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog")
    fun goodsGroupCatalogGetGoodsSetFilteredCatalog(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("parentNodeId") parentNodeId: kotlin.Int? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>

    /**
     * Обновить состояние элемента каталога в наборе товаров.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param goodsGroupId Id группы товаров.
     * @param goodsSetId Id набора.
     * @param items Подкаталоги.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/items")
    fun goodsGroupCatalogUpdateGoodsSetCatalogItem(@Path("goodsGroupId") goodsGroupId: kotlin.Int, @Path("goodsSetId") goodsSetId: kotlin.Int, @Query("items") items: kotlin.collections.MutableList<GoodsSetCatalogItem>): Call<ResultModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfString
import loymax.sdk.models.ResultModelOfPagedViewModelOfCityViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfCountryViewModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfRegionViewModel

interface CommonLocationapi {
    /**
     * Получить список городов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startWith Поисковая строка. (optional)
     * @param count Кол-во выводимых элементов. (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/Location/CitiesStartWith")
    fun commonLocationGetCities(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfListOfString>

    /**
     * Получить список городов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param regionId Id региона.
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCityViewModel]>
     */
    @GET("v1.2/Location/Region/{regionId}/Cities")
    fun commonLocationGetCitiesByRegionId(@Path("regionId") regionId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfCityViewModel>

    /**
     * Получить список стран.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterStartWith Поисковая строка. (optional)
     * @param filterSortingIds Идентификаторы стран, которые будут выбираться первыми. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCountryViewModel]>
     */
    @GET("v1.2/Location/Countries")
    fun commonLocationGetCountries(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.startWith") filterStartWith: kotlin.String? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfCountryViewModel>

    /**
     * Получить список домов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional)
     * @param street Фильтр по улице. (optional)
     * @param city Название города. (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/Location/Houses")
    fun commonLocationGetHouses(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("street") street: kotlin.String? = null, @Query("city") city: kotlin.String? = null): Call<ResultModelOfListOfString>

    /**
     * Получить список регионов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startWith Поисковая строка. (optional)
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfRegionViewModel]>
     */
    @GET("v1.2/Location/Regions")
    fun commonLocationGetRegions(@Query("startWith") startWith: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfRegionViewModel>

    /**
     * Получить список улиц.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional)
     * @param city Фильтр по городу. (optional)
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/Location/Streets")
    fun commonLocationGetStreets(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("city") city: kotlin.String? = null): Call<ResultModelOfListOfString>

}

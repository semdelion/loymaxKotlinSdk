package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface LocationEditService {
    /**
     * Добавляет новое местоположение.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Внутренний идентификатор местоположения торговой точки. (optional)
     * @param locationId Внешний идентификатор местоположения торговой точки. (optional)
     * @param description Описание. (optional)
     * @param latitude Широта. (optional)
     * @param longitude Долгота. (optional)
     * @param region  (optional)
     * @param city  (optional)
     * @param street Улица. (optional)
     * @param house Дом. (optional)
     * @param building Здание. (optional)
     * @param office Офис. (optional)
     * @return [Call]<[ResultModelOfInt32]>
     */
    @PUT("v1.2/locations")
    fun locationEditCreate(@Query("id") id: kotlin.Int? = null, @Query("locationId") locationId: java.util.UUID? = null, @Query("description") description: kotlin.String? = null, @Query("latitude") latitude: kotlin.Double? = null, @Query("longitude") longitude: kotlin.Double? = null, @Query("region") region: RegionDataModel? = null, @Query("city") city: CityDataModel? = null, @Query("street") street: kotlin.String? = null, @Query("house") house: kotlin.String? = null, @Query("building") building: kotlin.String? = null, @Query("office") office: kotlin.String? = null): Call<ResultModelOfInt32>

    /**
     * Возвращает информацию о местоположении по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор местоположения.
     * @return [Call]<[ResultModelOfLocationDataModel]>
     */
    @GET("v1.2/locations/{id}")
    fun locationEditGet(@Path("id") id: kotlin.Int): Call<ResultModelOfLocationDataModel>

    /**
     * Возвращает информацию о местоположении по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор местоположения.
     * @return [Call]<[ResultModelOfLocationDataModel]>
     */
    @GET("v1.2/locations/{uid}")
    fun locationEditGetByUid(@Path("uid") uid: kotlin.String): Call<ResultModelOfLocationDataModel>

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
    @GET("v1.2/locations/CitiesStartWith")
    fun locationEditGetCities(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfListOfString>

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
    @GET("v1.2/locations/Region/{regionId}/Cities")
    fun locationEditGetCitiesByRegionId(@Path("regionId") regionId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfCityViewModel>

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
    @GET("v1.2/locations/Countries")
    fun locationEditGetCountries(@Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.startWith") filterStartWith: kotlin.String? = null, @Query("filter.sortingIds") filterSortingIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfCountryViewModel>

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
    @GET("v1.2/locations/Houses")
    fun locationEditGetHouses(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("street") street: kotlin.String? = null, @Query("city") city: kotlin.String? = null): Call<ResultModelOfListOfString>

    /**
     * Возвращает список населенных пунктов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startSubstr Подстрока для поиска по названию населенного пункта. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param regionName Название региона. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfCityDataModel]>
     */
    @GET("v1.2/locations/Cities")
    fun locationEditGetLocationsCities(@Query("startSubstr") startSubstr: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("regionName") regionName: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfCityDataModel>

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
    @GET("v1.2/locations/Regions")
    fun locationEditGetRegions(@Query("startWith") startWith: kotlin.String? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfRegionViewModel>

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
    @GET("v1.2/locations/Streets")
    fun locationEditGetStreets(@Query("startWith") startWith: kotlin.String? = null, @Query("count") count: kotlin.Int? = null, @Query("city") city: kotlin.String? = null): Call<ResultModelOfListOfString>

}

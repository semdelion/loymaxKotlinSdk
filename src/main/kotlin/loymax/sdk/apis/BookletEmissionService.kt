package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface BookletEmissionService {
    /**
     * Получить выпуск буклетов по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска.
     * @return [Call]<[ResultModelOfBookletEmissionViewModel]>
     */
    @GET("v1.2/emissions/booklets/{id}")
    fun bookletEmissionGetBookletEmission(@Path("id") id: kotlin.Int): Call<ResultModelOfBookletEmissionViewModel>

    /**
     * Получить выпуск в виде CSV файла.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id выпуска буклетов.
     * @return [Call]<[kotlin.String]>
     */
    @GET("v1.2/emissions/booklets/{id}/export")
    fun bookletEmissionGetBookletEmissionCsv(@Path("id") id: kotlin.Int): Call<kotlin.String>

    /**
     * Получить список выпусков буклетов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfBookletEmissionViewModel]>
     */
    @GET("v1.2/emissions/booklets")
    fun bookletEmissionGetCardEmissions(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfBookletEmissionViewModel>

}

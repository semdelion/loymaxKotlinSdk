package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CalculatorService {
    /**
     * Получить все калькуляторы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param types Тип. (optional)
     * @return [Call]<[ResultModelOfListOfCalculatorViewModel]>
     */
    @GET("v1.2/Calculators")
    fun calculatorGetAll(@Query("types") types: kotlin.collections.MutableList<RepositoryCalculatorType>? = null): Call<ResultModelOfListOfCalculatorViewModel>

}

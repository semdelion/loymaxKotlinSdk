package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface ConfigurationService {
    /**
     * Получить коллекцию всех конфигураций.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfConfigurationViewModel]>
     */
    @GET("v1.2/configurations")
    fun configurationGet(): Call<ResultModelOfListOfConfigurationViewModel>

}

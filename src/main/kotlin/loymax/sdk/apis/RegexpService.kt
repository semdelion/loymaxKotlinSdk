package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface RegexpService {
    /**
     * Получить коллекцию всех конфигураций регулярных выражений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfRegexpConfigurationViewModel]>
     */
    @GET("v1.2/regexp")
    fun regexpGet(): Call<ResultModelOfListOfRegexpConfigurationViewModel>

}

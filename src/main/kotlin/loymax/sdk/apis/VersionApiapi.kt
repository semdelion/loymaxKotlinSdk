package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfMobileVersionViewModel
import loymax.sdk.models.ResultModelOfVersionModel

interface VersionApiapi {
    /**
     * Возвращает текущие версии мобильного приложения (Android, Ios).
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfMobileVersionViewModel]>
     */
    @GET("v1.2/Version/Mobile")
    fun versionApiGetMobileVersion(): Call<ResultModelOfListOfMobileVersionViewModel>

    /**
     * Возвращает текущую версию API.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfVersionModel]>
     */
    @GET("v1.2/Version")
    fun versionApiGetVersion(): Call<ResultModelOfVersionModel>

}

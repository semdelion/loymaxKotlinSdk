package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfListOfPermissionViewModel
import loymax.sdk.models.ResultModelOfListOfString

interface ApplicationPermissionapi {
    /**
     * Получить список разрешений приложения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param applicationId Идентификатор приложения.
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/OAuth/Applications/{applicationId}/Permissions")
    fun applicationPermissionGet(@Path("applicationId") applicationId: kotlin.Int): Call<ResultModelOfListOfString>

    /**
     * Получить все разрешения для приложений.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPermissionViewModel]>
     */
    @GET("v1.2/OAuth/Applications/Permissions")
    fun applicationPermissionGetAll(): Call<ResultModelOfListOfPermissionViewModel>

}

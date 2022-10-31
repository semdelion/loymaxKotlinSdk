package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfBoolean
import loymax.sdk.models.ResultModelOfListOfPermissionViewModel
import loymax.sdk.models.ResultModelOfListOfString

interface Permissionsapi {
    /**
     * Получить все разрешения.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPermissionViewModel]>
     */
    @GET("v1.2/permissions")
    fun permissionsGetAll(): Call<ResultModelOfListOfPermissionViewModel>

    /**
     * Получить разрешения текущего пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfString]>
     */
    @GET("v1.2/user/permissions")
    fun permissionsGetPermissionsForCurrentPerson(): Call<ResultModelOfListOfString>

    /**
     * Определяет, имеет ли текущий пользователь указанное разрешение для заданного партнера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param permission Разрешение.
     * @param partnerId ID партнера.
     * @return [Call]<[ResultModelOfBoolean]>
     */
    @GET("v1.2/user/permission")
    fun permissionsHasPermission(@Query("permission") permission: kotlin.String, @Query("partnerId") partnerId: kotlin.Int): Call<ResultModelOfBoolean>

}

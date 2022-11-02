package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface RolesService {
    /**
     * Возвращает роль по id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id роли.
     * @return [Call]<[ResultModelOfRoleModel]>
     */
    @GET("v1.2/roles/{id}")
    fun rolesGetRole(@Path("id") id: kotlin.Int): Call<ResultModelOfRoleModel>

    /**
     * Возвращает список всех ролей.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfRoleModel]>
     */
    @GET("v1.2/roles")
    fun rolesGetRoles(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfRoleModel>

}

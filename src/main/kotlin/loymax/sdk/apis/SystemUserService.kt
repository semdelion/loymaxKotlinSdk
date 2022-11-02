package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface SystemUserService {
    /**
     * Добавляет роль пользователю.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param userId Id пользователя.
     * @param roleId Id роли.
     * @param role  (optional)
     * @param partnerIds Партнеры. (optional)
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/SystemUsers/{userId}/roles/{roleId}")
    fun systemUserAddRoleToUser(@Path("userId") userId: kotlin.Int, @Path("roleId") roleId: kotlin.Int, @Query("role") role: RoleModel? = null, @Query("partnerIds") partnerIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 201: Created
     *
     * @param userId 
     * @param models 
     * @return [Call]<[ResultModel]>
     */
    @PUT("v1.2/SystemUsers/{userId}/permissions/add")
    fun systemUserAddUserPermissions(@Path("userId") userId: kotlin.Int, @Query("models") models: kotlin.collections.MutableList<UserPermissionModel>): Call<ResultModel>

    /**
     * Метод для смены пароля текущего пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Идентфикатор пользователя.
     * @param oldPassword Старый пароль. (optional)
     * @param newPassword Новый пароль. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @POST("v1.2/SystemUsers/{id}/ChangePassword")
    fun systemUserChangeUserPassword(@Path("id") id: kotlin.Int, @Query("oldPassword") oldPassword: kotlin.String? = null, @Query("newPassword") newPassword: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param permissions 
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/SystemUsers/{userId}/permissions/delete")
    fun systemUserDeleteUserPermissions(@Path("userId") userId: kotlin.Int, @Query("permissions") permissions: kotlin.collections.MutableList<UserPermissionModel>): Call<ResultModel>

    /**
     * Получить пользователя по ID.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id пользователя.
     * @return [Call]<[ResultModelOfSystemUserWithPermissionsViewModel]>
     */
    @GET("v1.2/SystemUsers/{id}")
    fun systemUserGetUser(@Path("id") id: kotlin.Int): Call<ResultModelOfSystemUserWithPermissionsViewModel>

    /**
     * Список всех пользователей.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from From. (optional)
     * @param count Count. (optional)
     * @param identifierText Текст идентификатора. (optional)
     * @param searchSubstring Строка поиска. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfSystemUserWithPermissionsViewModel]>
     */
    @GET("v1.2/SystemUsers")
    fun systemUserGetUsers(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("identifierText") identifierText: kotlin.String? = null, @Query("searchSubstring") searchSubstring: kotlin.String? = null): Call<ResultModelOfPagedViewModelOfSystemUserWithPermissionsViewModel>

    /**
     * Восстановление пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Id пользователя.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/SystemUsers/{id}/recover")
    fun systemUserRecoverUser(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param models 
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/SystemUsers/{userId}/permissions/update")
    fun systemUserUpdateUserPermissions(@Path("userId") userId: kotlin.Int, @Query("models") models: kotlin.collections.MutableList<UserPermissionModel>): Call<ResultModel>

}

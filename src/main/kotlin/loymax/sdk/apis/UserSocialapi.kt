package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.OAuthProviderType
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfAuthResultModel
import loymax.sdk.models.ResultModelOfListOfOAuthIdentifierInfo
import loymax.sdk.models.ResultModelOfListOfOAuthUserGroupMember

interface UserSocialapi {
    /**
     * Возвращает список всех аккаунтов клиента в социальных сетях.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfListOfOAuthIdentifierInfo]>
     */
    @GET("v1.2/users/{personId}/SocialAccounts")
    fun userSocialGetAccounts(@Path("personId") personId: kotlin.Int): Call<ResultModelOfListOfOAuthIdentifierInfo>

    /**
     * Авторизует клиента через привязанную к аккаунту социальную сеть (OAuth).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider OAuth-провайдер.
     * @param code Код авторизации, переданный OAuth-провайдером.
     * @param redirectUri Адрес, для которого был получен код авторизации. (optional)
     * @return [Call]<[ResultModelOfAuthResultModel]>
     */
    @GET("v1.2/user/{provider}/Login")
    fun userSocialLoginSocialV12(@Path("provider") provider: OAuthProviderType, @Query("code") code: kotlin.String, @Query("redirect_uri") redirectUri: kotlin.String? = null): Call<ResultModelOfAuthResultModel>

    /**
     * Отвязывает аккаунт от социальной сети.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider OAuth-провайдер.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/user/{provider}/Remove")
    fun userSocialRemoveSocial(@Path("provider") provider: OAuthProviderType): Call<ResultModel>

    /**
     * Привязывает аккаунт к социальной сети.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider OAuth-провайдер.
     * @param code Код авторизации, переданный OAuth-провайдером.
     * @param redirectUri Адрес, для которого был получен код авторизации. (optional)
     * @return [Call]<[ResultModel]>
     */
    @GET("v1.2/user/{provider}/Set")
    fun userSocialSetSocial(@Path("provider") provider: OAuthProviderType, @Query("code") code: kotlin.String, @Query("redirect_uri") redirectUri: kotlin.String? = null): Call<ResultModel>

    /**
     * Возвращает информацию о группах в социальных сетях, в которых состоит клиент.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfOAuthUserGroupMember]>
     */
    @GET("v1.2/user/Social/Groups")
    fun userSocialSocialGroups(): Call<ResultModelOfListOfOAuthUserGroupMember>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.OAuthProviderType
import loymax.sdk.models.ResultModelOfOAuthProviderMethodsViewModel

interface OAuthProviderMethodsapi {
    /**
     * Получает методы для обращения к апи социальной сети.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider Провайдер социальной сети.
     * @return [Call]<[ResultModelOfOAuthProviderMethodsViewModel]>
     */
    @GET("v1.2/OAuthProviders/{provider}/Methods")
    fun oAuthProviderMethodsGetMethods(@Path("provider") provider: OAuthProviderType): Call<ResultModelOfOAuthProviderMethodsViewModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.OAuthProviderType
import loymax.sdk.models.ResultModelOfListOfOAuthSettingsViewModel
import loymax.sdk.models.ResultModelOfOAuthSettingsViewModel

interface Socialapi {
    /**
     * Получает список доступных OAuth клиентов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfOAuthSettingsViewModel]>
     */
    @GET("v1.2/Social/Clients")
    fun socialGet(): Call<ResultModelOfListOfOAuthSettingsViewModel>

    /**
     * Получает OAuth клиента для указанного провайдера.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param provider Провайдер.
     * @return [Call]<[ResultModelOfOAuthSettingsViewModel]>
     */
    @GET("v1.2/Social/Clients/{provider}")
    fun socialGetSocialClientsByProvider(@Path("provider") provider: OAuthProviderType): Call<ResultModelOfOAuthSettingsViewModel>

}

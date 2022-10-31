package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.PlatformType
import loymax.sdk.models.ResultModelOfWalletCardLinkViewModel

interface Walletapi {
    /**
     * Получаем Wallet-карту для пользователя, или ссылку на AppleWallet карту.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param link Ссылка для получения Wallet карты.
     * @param platform Платформа для которой возвращаем карту. (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("v1.2/Cards/Wallet/{link}")
    fun walletGetWalletCard(@Path("link") link: kotlin.String, @Query("platform") platform: PlatformType? = null): Call<kotlin.Any>

    /**
     * Получаем ссылку для скачивания карты(если авторизованы).
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardId Id карты.
     * @param platform Платформа для которой возвращаем ссылку. (optional)
     * @return [Call]<[ResultModelOfWalletCardLinkViewModel]>
     */
    @GET("v1.2/Cards/{cardId}/Wallet")
    fun walletGetWalletCardLink(@Path("cardId") cardId: kotlin.Int, @Query("platform") platform: PlatformType? = null): Call<ResultModelOfWalletCardLinkViewModel>

}

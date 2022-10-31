package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.CardShowMode
import loymax.sdk.models.ConfirmCodeModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfAttachCardState
import loymax.sdk.models.ResultModelOfListOfSystemApiCardInfoModel
import loymax.sdk.models.ResultModelOfSetCardActionInfoModel

interface UserCardsapi {
    /**
     * Отменяет начатый процесс объединения карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/cards/Attach/Cancel")
    fun userCardsAttachCardCancel(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Завершает начатый процесс объединения карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param confirmCode Код подтверждения. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/cards/Attach/Confirm")
    fun userCardsAttachCardConfirm(@Path("personId") personId: kotlin.Int, @Query("confirmCode") confirmCode: kotlin.String? = null): Call<ResultModel>

    /**
     * Оформляет повторную отправку кода подтверждения при процессе объединения карт.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/users/{personId}/cards/Attach/SendConfirmCode")
    fun userCardsAttachCardSendConfirmCode(@Path("personId") personId: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает текущее состояние процесса присоединения карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfAttachCardState]>
     */
    @GET("v1.2/users/{personId}/cards/Attach")
    fun userCardsAttachCardState(@Path("personId") personId: kotlin.Int): Call<ResultModelOfAttachCardState>

    /**
     * Возвращает список карт клиента.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @param cardShowMode Фильтр карт клиента. (optional)
     * @return [Call]<[ResultModelOfListOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/users/{personId}/cards")
    fun userCardsGetCardsInfo(@Path("personId") personId: kotlin.Int, @Query("cardShowMode") cardShowMode: CardShowMode? = null): Call<ResultModelOfListOfSystemApiCardInfoModel>

    /**
     * Возвращает информацию о возможности прикрепления физической карты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param personId Внутренний идентификатор клиента.
     * @return [Call]<[ResultModelOfSetCardActionInfoModel]>
     */
    @GET("v1.2/users/{personId}/cards/Set")
    fun userCardsSetCardInfo(@Path("personId") personId: kotlin.Int): Call<ResultModelOfSetCardActionInfoModel>

}

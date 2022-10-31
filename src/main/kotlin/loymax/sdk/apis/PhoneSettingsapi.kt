package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.PhoneSettingsFilter
import loymax.sdk.models.PhoneSettingsViewModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfListOfPhoneSettingsViewModel
import loymax.sdk.models.ResultModelOfNullableOfInt32
import loymax.sdk.models.ResultModelOfPagedViewModelOfPhoneSettingsViewModel
import loymax.sdk.models.ResultModelOfPhoneSettingsViewModel

interface PhoneSettingsapi {
    /**
     * Заархивировать настройку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param settingId Идентификатор настройки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/PhoneSettings/{settingId}/Archive")
    fun phoneSettingsArchiveSetting(@Path("settingId") settingId: kotlin.Int): Call<ResultModel>

    /**
     * Создать формат номера телефона.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Id настройки. (optional)
     * @param prefix Префикс. (optional)
     * @param regexp Регулярное выражение. (optional)
     * @param masks Список масок для разных длин номеров. (optional)
     * @param country  (optional)
     * @param isArchived Помещен в архив или нет (архивный формат не используется в системе). (optional)
     * @param index Порядковый номер формата в выпадающем списке при вводе номера. (optional)
     * @return [Call]<[ResultModelOfNullableOfInt32]>
     */
    @PUT("v1.2/PhoneSettings/Create")
    fun phoneSettingsCreateSetting(@Query("id") id: kotlin.Int? = null, @Query("prefix") prefix: kotlin.Int? = null, @Query("regexp") regexp: kotlin.String? = null, @Query("masks") masks: kotlin.collections.MutableList<PhoneMaskViewModel>? = null, @Query("country") country: CountryViewModel? = null, @Query("isArchived") isArchived: kotlin.Boolean? = null, @Query("index") index: kotlin.Int? = null): Call<ResultModelOfNullableOfInt32>

    /**
     * Получить список активных настроек отображения телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfPhoneSettingsViewModel]>
     */
    @GET("v1.2/PhoneSettings/Active")
    fun phoneSettingsGetActiveSettingsList(): Call<ResultModelOfListOfPhoneSettingsViewModel>

    /**
     * Получить формат номера телефона по Id.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param settingId Идентификатор настройки.
     * @return [Call]<[ResultModelOfPhoneSettingsViewModel]>
     */
    @GET("v1.2/PhoneSettings/{settingId}")
    fun phoneSettingsGetSetting(@Path("settingId") settingId: kotlin.Int): Call<ResultModelOfPhoneSettingsViewModel>

    /**
     * Получить настройки отображения телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Начало выборки. (optional)
     * @param count Количество. (optional)
     * @param countryName Название страны. (optional)
     * @param isArchived Активен формат или нет. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPhoneSettingsViewModel]>
     */
    @POST("v1.2/PhoneSettings/List")
    fun phoneSettingsGetSettingsList(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("countryName") countryName: kotlin.String? = null, @Query("isArchived") isArchived: kotlin.Boolean? = null): Call<ResultModelOfPagedViewModelOfPhoneSettingsViewModel>

    /**
     * Восстановить настройку.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param settingId Идентификатор настройки.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/PhoneSettings/{settingId}/Restore")
    fun phoneSettingsRestoreSetting(@Path("settingId") settingId: kotlin.Int): Call<ResultModel>

    /**
     * Изменить формат номера телефона.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param settingId Идентификатор настройки.
     * @param id Id настройки. (optional)
     * @param prefix Префикс. (optional)
     * @param regexp Регулярное выражение. (optional)
     * @param masks Список масок для разных длин номеров. (optional)
     * @param country  (optional)
     * @param isArchived Помещен в архив или нет (архивный формат не используется в системе). (optional)
     * @param index Порядковый номер формата в выпадающем списке при вводе номера. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/PhoneSettings/{settingId}/Update")
    fun phoneSettingsUpdateSetting(@Path("settingId") settingId: kotlin.Int, @Query("id") id: kotlin.Int? = null, @Query("prefix") prefix: kotlin.Int? = null, @Query("regexp") regexp: kotlin.String? = null, @Query("masks") masks: kotlin.collections.MutableList<PhoneMaskViewModel>? = null, @Query("country") country: CountryViewModel? = null, @Query("isArchived") isArchived: kotlin.Boolean? = null, @Query("index") index: kotlin.Int? = null): Call<ResultModel>

}

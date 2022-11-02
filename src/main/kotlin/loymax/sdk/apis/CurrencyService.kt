package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CurrencyService {
    /**
     * Создает новую валюту.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param id Идентификатор валюты. (optional)
     * @param name Название. (optional)
     * @param type  (optional)
     * @param externalId Рекомендуется передавать значение null. (optional)
     * @param uid Внешний идентификатор валюты. (optional)
     * @param code Код валюты. (optional)
     * @param divisibility Значение делимости валюты. (optional)
     * @param description Описание валюты. (optional)
     * @param nameCases  (optional)
     * @param isDeleted Признак состояния валюты (true - архивная, false - неархивная). (optional)
     * @param imageId Внешний идентификатор изображения валюты. (optional)
     * @param partners Список партнеров. (optional)
     * @param accessMode  (optional)
     * @return [Call]<[ResultModelOfCurrencyViewModel]>
     */
    @PUT("v1.2/currency")
    fun currencyCreate(@Query("id") id: kotlin.Int? = null, @Query("name") name: kotlin.String? = null, @Query("type") type: CurrencyTypeEnum? = null, @Query("externalId") externalId: kotlin.String? = null, @Query("uid") uid: kotlin.String? = null, @Query("code") code: kotlin.String? = null, @Query("divisibility") divisibility: kotlin.Double? = null, @Query("description") description: kotlin.String? = null, @Query("nameCases") nameCases: NameCaseModel? = null, @Query("isDeleted") isDeleted: kotlin.Boolean? = null, @Query("imageId") imageId: java.util.UUID? = null, @Query("partners") partners: kotlin.collections.MutableList<PartnerViewModel>? = null, @Query("accessMode") accessMode: CurrencyAccessMode? = null): Call<ResultModelOfCurrencyViewModel>

    /**
     * Возвращает информацию о валюте по внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор валюты.
     * @return [Call]<[ResultModelOfCurrencyViewModel]>
     */
    @GET("v1.2/currency/{id}")
    fun currencyGetById(@Path("id") id: kotlin.Int): Call<ResultModelOfCurrencyViewModel>

    /**
     * Возвращает информацию о валюте по внешнему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param uid Внешний идентификатор валюты.
     * @return [Call]<[ResultModelOfCurrencyViewModel]>
     */
    @GET("v1.2/currency/{uid}")
    fun currencyGetByUid(@Path("uid") uid: kotlin.String): Call<ResultModelOfCurrencyViewModel>

    /**
     * Возвращает валюту из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор валюты.
     * @param changeCode Генерация нового кода валюты (true - генерировать код, false - не генерировать код). (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/currency/{id}/restore")
    fun currencyRestoreCurrency(@Path("id") id: kotlin.Int, @Query("changeCode") changeCode: kotlin.Boolean? = null): Call<ResultModel>

}

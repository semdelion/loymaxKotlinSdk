package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface UserGroupService {
    /**
     * Возвращает информацию по картам клиентов, счета которых объединены в группу.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId Внутренний идентификатор группы.
     * @param cardShowMode Фильтр отображения карт (All — все карты, в т. ч. удаленные, NotDeleted — все неудаленные карты). (optional)
     * @param personIdToExclude Внутренний идентификатор клиента, карты которого не отображать. (optional)
     * @return [Call]<[ResultModelOfListOfSystemApiCardInfoModel]>
     */
    @GET("v1.2/UserGroups/{groupId}/Cards")
    fun userGroupGetGroupCardsInfo(@Path("groupId") groupId: kotlin.Int, @Query("cardShowMode") cardShowMode: GroupCardShowMode? = null, @Query("personIdToExclude") personIdToExclude: kotlin.Int? = null): Call<ResultModelOfListOfSystemApiCardInfoModel>

    /**
     * Возвращает список клиентов, счета которых объединены в группу.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId Внутренний идентификатор группы.
     * @return [Call]<[ResultModelOfPersonsGroupInfoModel]>
     */
    @GET("v1.2/UserGroups/{groupId}")
    fun userGroupGetGroupMembers(@Path("groupId") groupId: kotlin.Int): Call<ResultModelOfPersonsGroupInfoModel>

    /**
     * Возвращает информацию о клиентах группы по их атрибутам.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cardNumber Номер карты. (optional)
     * @param personUid Внешний идентификтор клиента. (optional)
     * @param values Gets or sets the values. (optional)
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param card  (optional)
     * @param personState  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfPersonsGroupInfoModel]>
     */
    @POST("v1.2/UserGroups/SearchByAttributes")
    fun userGroupSearchPersonsByAttributes(@Query("cardNumber") cardNumber: kotlin.String? = null, @Query("personUid") personUid: java.util.UUID? = null, @Query("values") values: kotlin.collections.MutableList<SearchUserAttributeValueModel>? = null, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("card") card: SearchByCardAttributesModel? = null, @Query("personState") personState: PersonState? = null): Call<ResultModelOfPagedViewModelOfPersonsGroupInfoModel>

}

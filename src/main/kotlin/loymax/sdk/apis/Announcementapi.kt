package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.AnnouncementState
import loymax.sdk.models.ArchivedState
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfAnnouncementModel
import loymax.sdk.models.ResultModelOfPagedViewModelOfAnnouncementModel

interface Announcementapi {
    /**
     * Отправляет рекламу в архив.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Announcements/{id}/archive")
    fun announcementArchiveAnnouncement(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Завершает создание рекламы.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Announcements/{id}/complete")
    fun announcementCompleteAnnouncement(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает информацию о рекламе.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламы.
     * @return [Call]<[ResultModelOfAnnouncementModel]>
     */
    @GET("v1.2/Announcements/{id}")
    fun announcementGetAnnouncement(@Path("id") id: kotlin.Int): Call<ResultModelOfAnnouncementModel>

    /**
     * Возвращает список всех реклам для рекламного места.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @param filterTitleSubstr Подстрока для поиска по названию рекламы. (optional)
     * @param filterSpaceName Подстрока для поиска по названию рекламного места. (optional)
     * @param filterSpaceLogicalName Логическое имя рекламного места. (optional)
     * @param filterState Статус рекламы (Draft — черновик, Ready — готова к публикации, Published — опубликована). (optional)
     * @param filterDateFrom Начальная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterDateTo Конечная дата выборки в формате 0000-00-00T00:00:00Z. (optional)
     * @param filterArchivedState Признак состояния рекламы (true — архивная, false — неархивная). (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfAnnouncementModel]>
     */
    @GET("v1.2/Announcements")
    fun announcementGetAnnouncements(@Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null, @Query("filter.titleSubstr") filterTitleSubstr: kotlin.String? = null, @Query("filter.spaceName") filterSpaceName: kotlin.String? = null, @Query("filter.spaceLogicalName") filterSpaceLogicalName: kotlin.String? = null, @Query("filter.state") filterState: AnnouncementState? = null, @Query("filter.dateFrom") filterDateFrom: kotlin.String? = null, @Query("filter.dateTo") filterDateTo: kotlin.String? = null, @Query("filter.archivedState") filterArchivedState: ArchivedState? = null): Call<ResultModelOfPagedViewModelOfAnnouncementModel>

    /**
     * Публикует рекламу.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Announcements/{id}/publish")
    fun announcementPublishAnnouncement(@Path("id") id: kotlin.Int): Call<ResultModel>

    /**
     * Восстанавливает рекламу из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор рекламы.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Announcements/{id}/restore")
    fun announcementRestoreAnnouncement(@Path("id") id: kotlin.Int): Call<ResultModel>

}

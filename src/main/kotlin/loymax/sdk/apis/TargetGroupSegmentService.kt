package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface TargetGroupSegmentService {
    /**
     * Запускает расчет сегмента целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/calculate")
    fun targetGroupSegmentCalculateTargetGroupSegment(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает сегмент целевой аудитории по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param id Внутренний идентификатор сегмента.
     * @return [Call]<[ResultModelOfTargetGroupSegmentViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{id}")
    fun targetGroupSegmentGetTargetGroupSegment(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModelOfTargetGroupSegmentViewModel>

    /**
     * Возвращает информацию о последнем расчете сегмента целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @return [Call]<[ResultModelOfCalculationModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/calculation")
    fun targetGroupSegmentGetTargetGroupSegmentCalculationInfo(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int): Call<ResultModelOfCalculationModel>

    /**
     * Возвращает все сегменты целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param from Порядковый номер начального элемента выборки. (optional)
     * @param count Количество возвращаемых элементов выборки. (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments")
    fun targetGroupSegmentGetTargetGroupSegments(@Path("targetGroupId") targetGroupId: kotlin.Int, @Query("from") from: kotlin.Int? = null, @Query("count") count: kotlin.Int? = null): Call<ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel>

    /**
     * Обновляет сегмент целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param name Название. (optional)
     * @param type  (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}")
    fun targetGroupSegmentUpdateTargetGroupSegment(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Query("name") name: kotlin.String? = null, @Query("type") type: TargetGroupSegmentationType? = null): Call<ResultModel>

}

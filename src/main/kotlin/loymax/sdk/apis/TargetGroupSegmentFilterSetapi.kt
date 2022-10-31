package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfCalculationModel
import loymax.sdk.models.ResultModelOfListOfTargetGroupSegmentFilterSetViewModel
import loymax.sdk.models.ResultModelOfTargetGroupSegmentFilterSetViewModel

interface TargetGroupSegmentFilterSetapi {
    /**
     * Запускает расчет набора фильтров целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculate")
    fun targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int): Call<ResultModel>

    /**
     * Удаляет набор фильтров сегмента целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента целевой аудитории.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @return [Call]<[ResultModel]>
     */
    @DELETE("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}")
    fun targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает набор фильтров сегмента целевой аудитории по его внутреннему идентификатору.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param id Внутренний идентификатор набора фильтров.
     * @return [Call]<[ResultModelOfTargetGroupSegmentFilterSetViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{id}")
    fun targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("id") id: kotlin.Int): Call<ResultModelOfTargetGroupSegmentFilterSetViewModel>

    /**
     * Возвращает информацию о последнем расчете набора фильтров целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @return [Call]<[ResultModelOfCalculationModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculation")
    fun targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int): Call<ResultModelOfCalculationModel>

    /**
     * Возвращает наборы фильтров сегмента целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @return [Call]<[ResultModelOfListOfTargetGroupSegmentFilterSetViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets")
    fun targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int): Call<ResultModelOfListOfTargetGroupSegmentFilterSetViewModel>

}

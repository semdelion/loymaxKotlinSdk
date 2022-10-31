package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfCalculationModel
import loymax.sdk.models.ResultModelOfFilterViewModel
import loymax.sdk.models.ResultModelOfListOfTargetGroupSegmentFilterViewModel
import loymax.sdk.models.ResultModelOfTargetGroupSegmentFilterViewModel
import loymax.sdk.models.TargetGroupSegmentFilterNameModel
import loymax.sdk.models.TargetGroupSegmentFilterTypeModel

interface TargetGroupSegmentFilterapi {
    /**
     * Запускает расчет фильтра в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculate")
    fun targetGroupSegmentFilterCalculateTargetGroupSegmentFilter(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает фильтр из набора фильтров в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @return [Call]<[ResultModelOfTargetGroupSegmentFilterViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}")
    fun targetGroupSegmentFilterGetTargetGroupSegmentFilter(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int): Call<ResultModelOfTargetGroupSegmentFilterViewModel>

    /**
     * Возвращает информацию о последнем расчете фильтра в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @return [Call]<[ResultModelOfCalculationModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculation")
    fun targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int): Call<ResultModelOfCalculationModel>

    /**
     * Возвращает информацию о фильтре из набора фильтров в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @return [Call]<[ResultModelOfFilterViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/filterInfo")
    fun targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int): Call<ResultModelOfFilterViewModel>

    /**
     * Возвращает все фильтры из набора фильтров в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @return [Call]<[ResultModelOfListOfTargetGroupSegmentFilterViewModel]>
     */
    @GET("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters")
    fun targetGroupSegmentFilterGetTargetGroupSegmentFilters(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int): Call<ResultModelOfListOfTargetGroupSegmentFilterViewModel>

    /**
     * Обновляет название фильтра в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @param name Название. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/name")
    fun targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int, @Query("name") name: kotlin.String? = null): Call<ResultModel>

    /**
     * Обновляет тип фильтра в сегменте целевой аудитории.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetGroupId Внутренний идентификатор целевой аудитории.
     * @param segmentId Внутренний идентификатор сегмента.
     * @param filterSetId Внутренний идентификатор набора фильтров.
     * @param filterId Внутренний идентификатор фильтра.
     * @param type  (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/type")
    fun targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType(@Path("targetGroupId") targetGroupId: kotlin.Int, @Path("segmentId") segmentId: kotlin.Int, @Path("filterSetId") filterSetId: kotlin.Int, @Path("filterId") filterId: kotlin.Int, @Query("type") type: TargetGroupSegmentationType? = null): Call<ResultModel>

}

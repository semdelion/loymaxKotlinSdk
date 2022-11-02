package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface QuestionService {
    /**
     * Изменяет порядок отображения вопроса в списке вопросов/в группе вопросов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор вопроса.
     * @param order Новый порядковый номер.
     * @param questionGroupId Внутренний идентификатор группы вопросов. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Questions/{id}/ChangePosition")
    fun questionChangePosition(@Path("id") id: kotlin.Int, @Query("order") order: kotlin.Int, @Query("questionGroupId") questionGroupId: kotlin.Int? = null): Call<ResultModel>

    /**
     * Возвращает информацию о вопросе.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор вопроса.
     * @return [Call]<[ResultModelOfQuestionViewModel]>
     */
    @GET("v1.2/Questions/{id}")
    fun questionGet(@Path("id") id: kotlin.Int): Call<ResultModelOfQuestionViewModel>

    /**
     * Возвращает информацию о всех вопросах и всех группах вопросов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterName  (optional)
     * @param filterLogicalName  (optional)
     * @param filterStateType  (optional)
     * @param filterVisibleType  (optional)
     * @param filterRequiredType  (optional)
     * @return [Call]<[ResultModelOfListOfQuestionnaireItemViewModel]>
     */
    @GET("v1.2/Questions")
    fun questionGetAll(@Query("filter.name") filterName: kotlin.String? = null, @Query("filter.logicalName") filterLogicalName: kotlin.String? = null, @Query("filter.stateType") filterStateType: ArchivedState? = null, @Query("filter.visibleType") filterVisibleType: VisibilityType? = null, @Query("filter.requiredType") filterRequiredType: QuestionRequiredType? = null): Call<ResultModelOfListOfQuestionnaireItemViewModel>

    /**
     * Восстанавливает вопрос из архива.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор вопроса.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Questions/{id}/Restore")
    fun questionRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

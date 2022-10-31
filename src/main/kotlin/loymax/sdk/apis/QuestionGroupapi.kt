package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.QuestionGroupViewModel
import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfInt32
import loymax.sdk.models.ResultModelOfQuestionGroupViewModel

interface QuestionGroupapi {
    /**
     * Изменяет порядок отображения группы вопросов в списке групп вопросов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор группы вопросов.
     * @param order Новый порядковый номер.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/QuestionGroups/{id}/ChangePosition")
    fun questionGroupChangePosition(@Path("id") id: kotlin.Int, @Query("order") order: kotlin.Int): Call<ResultModel>

    /**
     * Создает группу вопросов.
     * 
     * Responses:
     *  - 201: Created
     *
     * @param model Модель группы вопросов.
     * @return [Call]<[ResultModelOfInt32]>
     */
    @PUT("v1.2/QuestionGroups")
    fun questionGroupCreate(@Query("model") model: QuestionGroupViewModel): Call<ResultModelOfInt32>

    /**
     * Возвращает группу вопросов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор группы вопросов.
     * @return [Call]<[ResultModelOfQuestionGroupViewModel]>
     */
    @GET("v1.2/QuestionGroups/{id}")
    fun questionGroupGet(@Path("id") id: kotlin.Int): Call<ResultModelOfQuestionGroupViewModel>

    /**
     * Восстановливает из архива группу вопросов.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор группы вопросов.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/QuestionGroups/{id}/Restore")
    fun questionGroupRestore(@Path("id") id: kotlin.Int): Call<ResultModel>

}

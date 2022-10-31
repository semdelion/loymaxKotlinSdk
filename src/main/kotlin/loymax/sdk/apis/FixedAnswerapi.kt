package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModel
import loymax.sdk.models.ResultModelOfFixedAnswerViewModel
import loymax.sdk.models.ResultModelOfListOfFixedAnswerViewModel

interface FixedAnswerapi {
    /**
     * Изменяет порядок отображения варианта ответа на вопрос.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор варианта ответа.
     * @param order Новый порядковый номер.
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Questions/FixedAnswers/{id}/ChangePosition")
    fun fixedAnswerChangePosition(@Path("id") id: kotlin.Int, @Query("order") order: kotlin.Int): Call<ResultModel>

    /**
     * Возвращает информацию о варианте ответа на вопрос.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id Внутренний идентификатор варианта ответа.
     * @return [Call]<[ResultModelOfFixedAnswerViewModel]>
     */
    @GET("v1.2/Questions/FixedAnswers/{id}")
    fun fixedAnswerGet(@Path("id") id: kotlin.Int): Call<ResultModelOfFixedAnswerViewModel>

    /**
     * Возвращает информацию о всех вариантах ответа на вопрос.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param questionId Внутренний идентификатор вопроса.
     * @return [Call]<[ResultModelOfListOfFixedAnswerViewModel]>
     */
    @GET("v1.2/Questions/FixedAnswers")
    fun fixedAnswerGetAllByQuestion(@Query("questionId") questionId: kotlin.Int): Call<ResultModelOfListOfFixedAnswerViewModel>

}

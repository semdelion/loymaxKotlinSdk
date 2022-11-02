package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface AnketaService {
    /**
     * Возвращает список вопросов анкеты.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfListOfAnketaQuestionViewModel]>
     */
    @GET("v1.2/Anketa/Questions")
    fun anketaGetQuestions(): Call<ResultModelOfListOfAnketaQuestionViewModel>

}

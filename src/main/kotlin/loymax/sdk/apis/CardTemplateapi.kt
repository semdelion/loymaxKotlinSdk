package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfPagedViewModelOfTemplateSetModel
import loymax.sdk.models.ResultModelOfTemplateSetModel

interface CardTemplateapi {
    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param filterName  (optional)
     * @param filterIsDeleted  (optional)
     * @param filterFrom  (optional)
     * @param filterCount  (optional)
     * @param filterLoyaltyProgramsIds  (optional)
     * @param filterPartnersIds  (optional)
     * @param filterAuthorsIds  (optional)
     * @return [Call]<[ResultModelOfPagedViewModelOfTemplateSetModel]>
     */
    @GET("v1.2/Cards/template/sets")
    fun cardTemplateGetTemplateSets(@Query("filter.name") filterName: kotlin.String? = null, @Query("filter.isDeleted") filterIsDeleted: kotlin.Boolean? = null, @Query("filter.from") filterFrom: kotlin.Int? = null, @Query("filter.count") filterCount: kotlin.Int? = null, @Query("filter.loyaltyProgramsIds") filterLoyaltyProgramsIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.partnersIds") filterPartnersIds: kotlin.collections.MutableList<kotlin.Int>? = null, @Query("filter.authorsIds") filterAuthorsIds: kotlin.collections.MutableList<kotlin.Int>? = null): Call<ResultModelOfPagedViewModelOfTemplateSetModel>

    /**
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @return [Call]<[ResultModelOfTemplateSetModel]>
     */
    @GET("v1.2/Cards/template/sets/{id}")
    fun cardTemplateGetTemplates(@Path("id") id: kotlin.Int): Call<ResultModelOfTemplateSetModel>

}

package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.ResultModelOfCustomerIdentificationTreeModel

interface FilterTreeapi {
    /**
     * Возвращает дерево доступных способов идентификации.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [Call]<[ResultModelOfCustomerIdentificationTreeModel]>
     */
    @GET("v1.2/Filters/customerIdentificationTree")
    fun filterTreeGetCustomerIdentificationTree(): Call<ResultModelOfCustomerIdentificationTreeModel>

}

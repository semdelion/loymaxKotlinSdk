package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface CouponOperationService {
    /**
     * Пакетная выдача купонов. На вход подаётся файл формата .csv или .txt.  EmissionId - Id выпуска купонов, из которого будет осуществлятся выдача.  Identifier - идентификатор клиента, которому выдается купон.  IdType - тип идентификатора клиента (необязательный столбец). Может быть один из PersonUid/CardNumber/Phone/PersonID/Email  Метод создаёт пакет и ставит его в очередь на выполнение.
     * &lt;para&gt;              Пример CSV файла.              EmissionId,Identifier,IdType              1,79998886622,Phone              1,79998886622,Phone              2,1234657899996666,CardNumber              &lt;/para&gt;              .
     * Responses:
     *  - 200: OK
     *
     * @param file file to upload
     * @return [Call]<[ResultModelOfInt32]>
     */
    @POST("v1.2/coupons/BatchCouponById")
    fun couponOperationIssueCouponBatch(@Query("file") file: java.io.File): Call<ResultModelOfInt32>

}

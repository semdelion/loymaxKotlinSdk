package loymax.sdk.apis

import loymax.sdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import loymax.sdk.models.*

interface GeoService {
    /**
     * Передача информации о местоположении пользователя.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param altitude Значение высоты над уровнем моря в метрах. (optional)
     * @param course Направление в градусах относительно истинного севера. (optional)
     * @param horizontalAccuracy Точность координат широты и долготы в метрах. (optional)
     * @param latitude Широта. (optional)
     * @param longitude Долгота. (optional)
     * @param speed Скорость в метрах в секунду. (optional)
     * @param verticalAccuracy Погрешность высоты над уровнем моря в метрах. (optional)
     * @return [Call]<[ResultModel]>
     */
    @POST("v1.2/Geo/Coordinate")
    fun geoPostCoordinate(@Query("altitude") altitude: kotlin.Double? = null, @Query("course") course: kotlin.Double? = null, @Query("horizontalAccuracy") horizontalAccuracy: kotlin.Double? = null, @Query("latitude") latitude: kotlin.Double? = null, @Query("longitude") longitude: kotlin.Double? = null, @Query("speed") speed: kotlin.Double? = null, @Query("verticalAccuracy") verticalAccuracy: kotlin.Double? = null): Call<ResultModel>

}

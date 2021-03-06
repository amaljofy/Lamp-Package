/**
* LAMP Platform
* The LAMP Platform API.
*
* The version of the OpenAPI document: 1.0.0
* Contact: team@digitalpsych.org
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package digital.lamp.lamp_kotlin.lamp_core.models



import com.squareup.moshi.Json
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

import java.io.Serializable
/**
 * The SensorSpec determines the parameters of generated SensorEvents.
 * @param name The name of the sensor.
 * @param settingsSchema The data definition of a SensorSpec.
 */
@Parcelize

data class SensorSpec (
    /* The name of the sensor. */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* The data definition of a SensorSpec. */
    @Json(name = "settings_schema")
    var settingsSchema: @RawValue kotlin.Any? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}


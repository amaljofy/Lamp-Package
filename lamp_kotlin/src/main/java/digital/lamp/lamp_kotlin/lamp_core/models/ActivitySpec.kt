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
 * The ActivitySpec determines the parameters and properties of an Activity and its corresponding generated ActivityEvents.
 * @param name The name of the activity spec.
 * @param helpContents Either a binary blob containing a document or video, or a string containing  instructional aid about the Activity.
 * @param scriptContents The WebView-compatible script that provides this Activity on mobile or desktop (IFrame) clients.
 * @param staticDataSchema The static data definition of an ActivitySpec.
 * @param temporalEventSchema The temporal event data definition of an ActivitySpec.
 * @param settingsSchema The Activity settings definition of an ActivitySpec.
 */
@Parcelize

data class ActivitySpec (
    /* The name of the activity spec. */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* Either a binary blob containing a document or video, or a string containing  instructional aid about the Activity. */
    @Json(name = "help_contents")
    var helpContents: kotlin.String? = null,
    /* The WebView-compatible script that provides this Activity on mobile or desktop (IFrame) clients. */
    @Json(name = "script_contents")
    var scriptContents: kotlin.String? = null,
    /* The static data definition of an ActivitySpec. */
    @Json(name = "static_data_schema")
    var staticDataSchema: @RawValue kotlin.Any? = null,
    /* The temporal event data definition of an ActivitySpec. */
    @Json(name = "temporal_event_schema")
    var temporalEventSchema: @RawValue kotlin.Any? = null,
    /* The Activity settings definition of an ActivitySpec. */
    @Json(name = "settings_schema")
    var settingsSchema: @RawValue kotlin.Any? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}


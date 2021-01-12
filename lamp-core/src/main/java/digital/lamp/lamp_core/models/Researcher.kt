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
package digital.lamp.lamp_core.models



import com.squareup.moshi.Json
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

import java.io.Serializable
/**
 * 
 * @param id A globally unique reference for objects.
 * @param name The name of the researcher.
 * @param email The email address of the researcher.
 * @param address The physical address of the researcher.
 * @param studies The set of all studies conducted by the researcher.
 */
@Parcelize

data class Researcher (
    /* A globally unique reference for objects. */
    @Json(name = "id")
    var id: kotlin.String? = null,
    /* The name of the researcher. */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* The email address of the researcher. */
    @Json(name = "email")
    var email: kotlin.String? = null,
    /* The physical address of the researcher. */
    @Json(name = "address")
    var address: kotlin.String? = null,
    /* The set of all studies conducted by the researcher. */
    @Json(name = "studies")
    var studies: @RawValue kotlin.Array<kotlin.Any>? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}


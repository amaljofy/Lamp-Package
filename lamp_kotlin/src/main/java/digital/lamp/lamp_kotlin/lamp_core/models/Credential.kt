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

import java.io.Serializable
/**
 * Every object can have one or more credential(s) associated with it. (i.e. `my_researcher.credentials = ['person A', 'person B', 'api A'', 'person C', 'api B']`)
 * @param origin The root object this credential is attached to. The scope of this credential is limited to the object itself and any children.
 * @param accessKey Username or machine-readable public key (access).
 * @param secretKey SALTED HASH OF Password or machine-readable private key (secret).
 * @param description The user-visible description of the credential.
 */
@Parcelize

data class Credential (
    /* The root object this credential is attached to. The scope of this credential is limited to the object itself and any children. */
    @Json(name = "origin")
    var origin: kotlin.String? = null,
    /* Username or machine-readable public key (access). */
    @Json(name = "access_key")
    var accessKey: kotlin.String? = null,
    /* SALTED HASH OF Password or machine-readable private key (secret). */
    @Json(name = "secret_key")
    var secretKey: kotlin.String? = null,
    /* The user-visible description of the credential. */
    @Json(name = "description")
    var description: kotlin.String? = null
) : Serializable, Parcelable {
	companion object {
		private const val serialVersionUID: Long = 123
	}

}


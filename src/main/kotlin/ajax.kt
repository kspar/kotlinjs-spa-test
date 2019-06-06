/**
 * No, not the football club... no, not the cleaning product either...
 */

import pl.treksoft.jquery.JQueryAjaxSettings
import pl.treksoft.jquery.JQueryXHR
import pl.treksoft.jquery.jQuery


fun ajaxCall(params: Map<String, Any>): JQueryXHR =
    jQuery.ajax(mapToJsObject(params).unsafeCast<JQueryAjaxSettings>())

fun getCall(params: Map<String, Any>): JQueryXHR {
    if (params.containsKey("method")) {
        warn { "HTTP method should not be defined here, overriding to GET" }
    }
    val adjustedParams = params + Pair("method", "GET")
    return ajaxCall(adjustedParams)
}

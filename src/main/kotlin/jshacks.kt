
@JsName("Object")
external class JsObject

fun mapToJsObject(map: Map<String, Any>): dynamic {
    val jsObject: dynamic = JsObject()
    map.forEach {
        jsObject[it.key] = it.value
    }
    return jsObject
}

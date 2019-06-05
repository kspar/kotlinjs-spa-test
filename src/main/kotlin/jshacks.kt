
fun mapToJsObject(map: Map<String, Any>): dynamic {
    val jsObject = js("{}")
    map.forEach {
        jsObject[it.key] = it.value
    }
    return jsObject
}

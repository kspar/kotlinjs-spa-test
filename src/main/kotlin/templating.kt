
fun tmRender(template: String, data: Map<String, Any>) =
    Mustache.render(template, mapToJsObject(data))


private fun mapToJsObject(map: Map<String, Any>): dynamic {
    val jsObject = js("{}")
    map.forEach {
        jsObject[it.key] = it.value
    }
    return jsObject
}

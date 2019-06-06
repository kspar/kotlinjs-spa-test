import org.w3c.dom.asList

fun main() {
    debug("Yo")

    val ajaxSettings = mapOf("url" to "https://reqres.in/api/products/4", "method" to "POST")

    val r = getCall(ajaxSettings)
    r.then({ data, status, xhr -> println(data.asDynamic().data.id) }) // TODO: safer/nicer cast to model?

}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}



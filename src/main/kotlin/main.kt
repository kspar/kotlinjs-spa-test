import org.w3c.dom.asList

fun main() {
    debug("Yo")

    val ajaxSettings = mapOf("url" to "https://reqres.in/api/products/4", "method" to "POST")

    val r = getCall(ajaxSettings)
    r.then({ data, status, xhr ->
        println(data.unsafeCast<Resp>().data.pantone)
        println(xhr.status)
    })

}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}


// {"data":{"id":4,"name":"aqua sky","year":2003,"color":"#7BC4C4","pantone_value":"14-4811"}}
data class Resp(val data: RespData)
data class RespData(val id: Int, val name: String, val year: Int, val color: String,
                    @JsName("pantone_value") val pantone: String)

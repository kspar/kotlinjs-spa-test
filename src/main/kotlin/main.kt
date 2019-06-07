fun main() {
    debug { "Yo" }

    val ajaxSettings = mapOf("url" to "https://reqres.in/api/products/4")

    val r = getCall(ajaxSettings)
    r.then({ data, status, xhr ->
        println(safeCastToResp(data).data.color)
    })

    // TODO: Try native fetch and xhr API
}


// {"data":{"id":4,"name":"aqua sky","year":2003,"color":"#7BC4C4","pantone_value":"14-4811"}}
data class Resp(@JsName("data") val data: RespData)
data class RespData(
    val id: Int, var name: String?, val year: Int, val color: String,
    @JsName("pantone_value") val pantone: String
)


// Back to good ol' java days without a reasonable deserialization lib
fun safeCastToResp(obj: Any): Resp {
    val casted = obj.unsafeCast<Resp>()
    if (isAnyNull(casted.data) ||  // Check outer object first to avoid NPE
        isAnyNull(casted.data.color, casted.data.pantone) // Check all non-null fields
    ) {
        warn { JSON.stringify(casted) }  // Or throw
    }
    return casted
}


fun isAnyNull(vararg anys: Any?): Boolean {
    anys.forEach {
        if (it == null) {
            return true
        }
    }
    return false
}
